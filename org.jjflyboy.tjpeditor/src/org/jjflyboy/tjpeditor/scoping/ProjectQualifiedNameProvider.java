package org.jjflyboy.tjpeditor.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.util.SimpleAttributeResolver;

import com.google.common.base.Function;

public class ProjectQualifiedNameProvider extends
		DefaultDeclarativeQualifiedNameProvider {

	private Function<EObject, String> resolver = SimpleAttributeResolver.newResolver(String.class, "id");

	@Override
	protected Function<EObject, String> getResolver() {
		return resolver;
	}

}
