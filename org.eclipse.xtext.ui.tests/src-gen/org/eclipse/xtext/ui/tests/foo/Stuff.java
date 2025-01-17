/**
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.ui.tests.foo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stuff</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.ui.tests.foo.Stuff#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtext.ui.tests.foo.Stuff#getRefs <em>Refs</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.ui.tests.foo.FooPackage#getStuff()
 * @model
 * @generated
 */
public interface Stuff extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.xtext.ui.tests.foo.FooPackage#getStuff_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.ui.tests.foo.Stuff#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Refs</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refs</em>' reference.
   * @see #setRefs(Stuff)
   * @see org.eclipse.xtext.ui.tests.foo.FooPackage#getStuff_Refs()
   * @model
   * @generated
   */
  Stuff getRefs();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.ui.tests.foo.Stuff#getRefs <em>Refs</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Refs</em>' reference.
   * @see #getRefs()
   * @generated
   */
  void setRefs(Stuff value);

} // Stuff
