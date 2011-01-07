/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.common.types.ui.notification;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IReferenceDescription;
import org.eclipse.xtext.resource.IResourceDescription;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;

/**
 * A {@link LayeredTypeResourceDescription layered description} enhances the 
 * delegate with additionally exported objects.
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class LayeredTypeResourceDescription implements IResourceDescription {

	private final TypeResourceDescription delegate;
	private final List<IEObjectDescription> additionallyExported;

	public LayeredTypeResourceDescription(TypeResourceDescription delegate, List<IEObjectDescription> additionallyExported) {
		this.delegate = delegate;
		this.additionallyExported = additionallyExported;
	}
	
	public Iterable<QualifiedName> getImportedNames() {
		return delegate.getImportedNames();
	}

	public Iterable<IReferenceDescription> getReferenceDescriptions() {
		return delegate.getReferenceDescriptions();
	}

	public URI getURI() {
		return delegate.getURI();
	}

	public Iterable<IEObjectDescription> getExportedObjects() {
		return Iterables.concat(delegate.getExportedObjects(), additionallyExported);
	}

	public boolean isEmpty() {
		return delegate.isEmpty() && additionallyExported.isEmpty();
	}
	
	public Iterable<IEObjectDescription> getExportedObjectsByType(final EClass type) {
		Iterable<IEObjectDescription> additionallyFiltered = Iterables.filter(additionallyExported, new Predicate<IEObjectDescription>() {
			public boolean apply(IEObjectDescription input) {
				return EcoreUtil2.isAssignableFrom(type, input.getEClass());
			}
		});
		return Iterables.concat(delegate.getExportedObjectsByType(type), additionallyFiltered);
	}
	
	public Iterable<IEObjectDescription> getExportedObjectsByObject(final EObject object) {
		final URI uri = EcoreUtil2.getNormalizedURI(object);
		Iterable<IEObjectDescription> additionallyFiltered = Iterables.filter(getExportedObjects(), new Predicate<IEObjectDescription>() {
			public boolean apply(IEObjectDescription input) {
				if (input.getEObjectOrProxy() == object)
					return true;
				if (uri.equals(input.getEObjectURI())) {
					return true;
				}
				return false;
			}
		});
		return Iterables.concat(delegate.getExportedObjectsByObject(object), additionallyFiltered);
	}
	
	public Iterable<IEObjectDescription> getExportedObjects(final EClass type, final QualifiedName name, boolean ignoreCase) {
		Predicate<IEObjectDescription> predicate = ignoreCase 
			?	new Predicate<IEObjectDescription>() {
					public boolean apply(IEObjectDescription input) {
						return EcoreUtil2.isAssignableFrom(type, input.getEClass());
					}
				}
			:	new Predicate<IEObjectDescription>() {
				public boolean apply(IEObjectDescription input) {
					return name.equals(input.getName()) && EcoreUtil2.isAssignableFrom(type, input.getEClass());
				}
			};
		Iterable<IEObjectDescription> additionallyFiltered = Iterables.filter(getExportedObjects(), predicate);
		return Iterables.concat(delegate.getExportedObjects(type, name, ignoreCase), additionallyFiltered);
	}
	

}
