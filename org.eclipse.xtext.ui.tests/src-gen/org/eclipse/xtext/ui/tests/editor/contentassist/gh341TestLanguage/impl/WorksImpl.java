/**
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.ui.tests.editor.contentassist.gh341TestLanguage.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.xtext.ui.tests.editor.contentassist.gh341TestLanguage.Gh341TestLanguagePackage;
import org.eclipse.xtext.ui.tests.editor.contentassist.gh341TestLanguage.Works;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Works</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.ui.tests.editor.contentassist.gh341TestLanguage.impl.WorksImpl#getIds <em>Ids</em>}</li>
 *   <li>{@link org.eclipse.xtext.ui.tests.editor.contentassist.gh341TestLanguage.impl.WorksImpl#getRefs <em>Refs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorksImpl extends ElementImpl implements Works
{
  /**
   * The cached value of the '{@link #getIds() <em>Ids</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIds()
   * @generated
   * @ordered
   */
  protected EList<String> ids;

  /**
   * The cached value of the '{@link #getRefs() <em>Refs</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefs()
   * @generated
   * @ordered
   */
  protected EList<Works> refs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WorksImpl()
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
    return Gh341TestLanguagePackage.Literals.WORKS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getIds()
  {
    if (ids == null)
    {
      ids = new EDataTypeEList<String>(String.class, this, Gh341TestLanguagePackage.WORKS__IDS);
    }
    return ids;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Works> getRefs()
  {
    if (refs == null)
    {
      refs = new EObjectResolvingEList<Works>(Works.class, this, Gh341TestLanguagePackage.WORKS__REFS);
    }
    return refs;
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
      case Gh341TestLanguagePackage.WORKS__IDS:
        return getIds();
      case Gh341TestLanguagePackage.WORKS__REFS:
        return getRefs();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case Gh341TestLanguagePackage.WORKS__IDS:
        getIds().clear();
        getIds().addAll((Collection<? extends String>)newValue);
        return;
      case Gh341TestLanguagePackage.WORKS__REFS:
        getRefs().clear();
        getRefs().addAll((Collection<? extends Works>)newValue);
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
      case Gh341TestLanguagePackage.WORKS__IDS:
        getIds().clear();
        return;
      case Gh341TestLanguagePackage.WORKS__REFS:
        getRefs().clear();
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
      case Gh341TestLanguagePackage.WORKS__IDS:
        return ids != null && !ids.isEmpty();
      case Gh341TestLanguagePackage.WORKS__REFS:
        return refs != null && !refs.isEmpty();
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
    result.append(" (ids: ");
    result.append(ids);
    result.append(')');
    return result.toString();
  }

} //WorksImpl
