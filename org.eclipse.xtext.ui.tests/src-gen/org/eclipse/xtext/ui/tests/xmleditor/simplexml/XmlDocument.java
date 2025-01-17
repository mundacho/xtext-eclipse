/**
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.ui.tests.xmleditor.simplexml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Xml Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.ui.tests.xmleditor.simplexml.XmlDocument#getContents <em>Contents</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.ui.tests.xmleditor.simplexml.SimplexmlPackage#getXmlDocument()
 * @model
 * @generated
 */
public interface XmlDocument extends EObject
{
  /**
   * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.ui.tests.xmleditor.simplexml.Content}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contents</em>' containment reference list.
   * @see org.eclipse.xtext.ui.tests.xmleditor.simplexml.SimplexmlPackage#getXmlDocument_Contents()
   * @model containment="true"
   * @generated
   */
  EList<Content> getContents();

} // XmlDocument
