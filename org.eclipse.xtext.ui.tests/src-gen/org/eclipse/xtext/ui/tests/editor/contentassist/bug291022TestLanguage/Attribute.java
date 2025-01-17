/**
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.ui.tests.editor.contentassist.bug291022TestLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.ui.tests.editor.contentassist.bug291022TestLanguage.Attribute#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.eclipse.xtext.ui.tests.editor.contentassist.bug291022TestLanguage.Attribute#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.ui.tests.editor.contentassist.bug291022TestLanguage.Bug291022TestLanguagePackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends ModelAttribute
{
  /**
   * Returns the value of the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature</em>' reference.
   * @see #setFeature(ModelElement)
   * @see org.eclipse.xtext.ui.tests.editor.contentassist.bug291022TestLanguage.Bug291022TestLanguagePackage#getAttribute_Feature()
   * @model
   * @generated
   */
  ModelElement getFeature();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.ui.tests.editor.contentassist.bug291022TestLanguage.Attribute#getFeature <em>Feature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature</em>' reference.
   * @see #getFeature()
   * @generated
   */
  void setFeature(ModelElement value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see org.eclipse.xtext.ui.tests.editor.contentassist.bug291022TestLanguage.Bug291022TestLanguagePackage#getAttribute_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.ui.tests.editor.contentassist.bug291022TestLanguage.Attribute#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // Attribute
