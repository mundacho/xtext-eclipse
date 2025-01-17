/**
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.ui.tests.editor.contentassist.backtrackingContentAssistTest.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.ui.tests.editor.contentassist.backtrackingContentAssistTest.BacktrackingContentAssistTestPackage;
import org.eclipse.xtext.ui.tests.editor.contentassist.backtrackingContentAssistTest.SimpleClassifierRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Classifier Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.ui.tests.editor.contentassist.backtrackingContentAssistTest.impl.SimpleClassifierRefImpl#getClassifier <em>Classifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleClassifierRefImpl extends ClassifierRefImpl implements SimpleClassifierRef
{
  /**
   * The default value of the '{@link #getClassifier() <em>Classifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassifier()
   * @generated
   * @ordered
   */
  protected static final String CLASSIFIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getClassifier() <em>Classifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassifier()
   * @generated
   * @ordered
   */
  protected String classifier = CLASSIFIER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SimpleClassifierRefImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return BacktrackingContentAssistTestPackage.Literals.SIMPLE_CLASSIFIER_REF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getClassifier()
  {
    return classifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setClassifier(String newClassifier)
  {
    String oldClassifier = classifier;
    classifier = newClassifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BacktrackingContentAssistTestPackage.SIMPLE_CLASSIFIER_REF__CLASSIFIER, oldClassifier, classifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case BacktrackingContentAssistTestPackage.SIMPLE_CLASSIFIER_REF__CLASSIFIER:
        return getClassifier();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BacktrackingContentAssistTestPackage.SIMPLE_CLASSIFIER_REF__CLASSIFIER:
        setClassifier((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case BacktrackingContentAssistTestPackage.SIMPLE_CLASSIFIER_REF__CLASSIFIER:
        setClassifier(CLASSIFIER_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case BacktrackingContentAssistTestPackage.SIMPLE_CLASSIFIER_REF__CLASSIFIER:
        return CLASSIFIER_EDEFAULT == null ? classifier != null : !CLASSIFIER_EDEFAULT.equals(classifier);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (classifier: ");
    result.append(classifier);
    result.append(')');
    return result.toString();
  }

} //SimpleClassifierRefImpl
