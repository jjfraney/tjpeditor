package org.jjflyboy.tjpeditor.scoping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.xtext.naming.QualifiedName;

/**
 * This class is meant to trick out the internal parts of
 * xtext linking and scoping in order to implement
 * linking for task juggler's relative names (e.g. !!task1).
 * 
 * @author john
 *
 */
public class ProjectQualifiedName extends QualifiedName {

	private int offset;
	private boolean relative;
	public static final String UPDIR = "!";

	public ProjectQualifiedName(QualifiedName name, int offset) {
		super(name.getSegments().toArray(new String [] {}));
		setRelative(getFirstSegment().equals(ProjectQualifiedName.UPDIR));
		this.offset = offset;
	}
	public ProjectQualifiedName(QualifiedName name) {
		this(name, 0);
	}
	
	public void advance() {
		offset++;
	}
	
	public boolean isRelative() {
		return relative;
	}
	private void setRelative(boolean relative) {
		this.relative = relative;
	}
	
	/**
	 * 
	 * @return true if first character is a '!'
	 */
	public boolean isUp() {
		return getFirstSegment().equals(ProjectQualifiedName.UPDIR);
	}

	@Override
	public boolean isEmpty() {
		return getSegmentCount() == 0;
	}

	@Override
	public List<String> getSegments() {
		List<String> segments = super.getSegments();
		return segments.subList(offset, segments.size());
	}

	@Override
	public int getSegmentCount() {
		return super.getSegmentCount() - offset;
	}

	@Override
	public String getSegment(int index) {
		return super.getSegment(offset + index);
	}


	@Override
	public String getFirstSegment() {
		return super.getSegment(offset);
	}

	@Override
	public QualifiedName skipFirst(int skipCount) {
		return super.skipFirst(skipCount + offset);
	}

	@Override
	public QualifiedName skipLast(int skipCount) {
		return super.skipLast(skipCount);
	}

	@Override
	public QualifiedName toLowerCase() {
		List<String> newSegments = new ArrayList<String>();
		for(String segment: getSegments()) {
			newSegments.add(segment.toLowerCase());
		}
		QualifiedName t = QualifiedName.create(newSegments.toArray(new String[] {}));
		return t;
	}

	@Override
	public QualifiedName toUpperCase() {
		List<String> newSegments = new ArrayList<String>();
		for(String segment: super.getSegments()) {
			newSegments.add(segment.toUpperCase());
		}
		QualifiedName t = QualifiedName.create(newSegments.toArray(new String[] {}));
		return new ProjectQualifiedName(t, offset);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof QualifiedName) {
			return this.getSegments().equals(((QualifiedName)obj).getSegments());
		}
		return false;
	}

	@Override
	public boolean equalsIgnoreCase(Object obj) {
		if(obj instanceof QualifiedName) {
			if(((ProjectQualifiedName) obj).offset == offset) {
				return super.equalsIgnoreCase(obj);
			}
		} else if(offset == 0) {
			return super.equalsIgnoreCase(obj);
		}
		return false;
	}

	protected boolean startsWith(QualifiedName prefix, boolean ignoreCase) {
		if (prefix.getSegmentCount() > getSegmentCount())
			return false;
		for (int i = 0; i < prefix.getSegmentCount(); ++i) {
			if ((ignoreCase && !this.getSegment(i).equalsIgnoreCase(prefix.getSegment(i)))
					|| (!ignoreCase && !this.getSegment(i).equals(prefix.getSegment(i))))
				return false;
		}
		return true;
	}
	
	public int countUpDirs() {
		int count = 0;
		for(String segment : getSegments()) {
			if(segment.equals(UPDIR)) {
				count ++;
			} else {
				break;
			}
		}
		return count;
	}

	@Override
	public int hashCode() {
		return Arrays.hashCode(getSegments().toArray(new String[]{}));
	}
	
	
	public static void main(String[] args) {
		QualifiedName qnr = QualifiedName.create("!", "!", "middle1", "bottom2");
		QualifiedName qn = QualifiedName.create("middle1", "bottom2");
		ProjectQualifiedName pqn = new ProjectQualifiedName(qnr, 2);
		System.out.println("qn hash: " + qn.hashCode() + ", pqn hash: " + pqn.hashCode());
	}
}
