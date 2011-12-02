package org.jjflyboy.tjpeditor.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.util.SimpleAttributeResolver;
import org.jjflyboy.tjpeditor.project.Account;
import org.jjflyboy.tjpeditor.project.Resource;

import com.google.common.base.Function;

public class ProjectQualifiedNameProvider extends
		DefaultDeclarativeQualifiedNameProvider {

	private Function<EObject, String> resolver = SimpleAttributeResolver.newResolver(String.class, "id");

	@Override
	protected Function<EObject, String> getResolver() {
		return resolver;
	}
	
	// for Task, use default
	
	
	protected QualifiedName qualifiedName(Resource resource) {
		return resource.getId() == null ? null : QualifiedName.create(resource.getId());
	}
	protected QualifiedName qualifiedName(Account account) {
		return account.getId() == null ? null : QualifiedName.create(account.getId());
	}

}
