package org.jjflyboy.tjpeditor;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.util.Strings;

import com.google.inject.Singleton;

@Singleton
public class ProjectQualifiedNameConverter extends
		IQualifiedNameConverter.DefaultImpl {

	public static final String TOHIGHER = "!";
	
	@Override
	public String getDelimiter() {
		return ".";
	}
	
	public QualifiedName toQualifiedName(String qualifiedNameAsString) {
		if (qualifiedNameAsString == null)
			throw new IllegalArgumentException("Qualified name cannot be null");
		if (qualifiedNameAsString.equals(""))
			throw new IllegalArgumentException("Qualified name cannot be empty");
		if (Strings.isEmpty(getDelimiter()))
			return QualifiedName.create(qualifiedNameAsString);
		
		// separate '!' into its own segment
		String scratch = qualifiedNameAsString;
		List<String> segments = new ArrayList<String>();
		while(scratch.startsWith(TOHIGHER)) {
			segments.add(TOHIGHER);
			scratch = scratch.substring(1);
		}
		
		// add in remainder of segments after '!'
		String[] tmp = scratch.split(Pattern.quote(getDelimiter()));
		for(String s: tmp) {
			segments.add(s);
		}
		
		return QualifiedName.create(segments.toArray(new String[0]));
	}

}
