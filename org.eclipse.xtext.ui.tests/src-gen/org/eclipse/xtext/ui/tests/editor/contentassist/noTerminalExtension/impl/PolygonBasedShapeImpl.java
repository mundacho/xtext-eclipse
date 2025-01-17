/**
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.ui.tests.editor.contentassist.noTerminalExtension.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.eclipse.xtext.ui.tests.editor.contentassist.noTerminalExtension.NoTerminalExtensionPackage;
import org.eclipse.xtext.ui.tests.editor.contentassist.noTerminalExtension.PolygonBasedNodeShape;
import org.eclipse.xtext.ui.tests.editor.contentassist.noTerminalExtension.PolygonBasedShape;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Polygon Based Shape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.ui.tests.editor.contentassist.noTerminalExtension.impl.PolygonBasedShapeImpl#getShape <em>Shape</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PolygonBasedShapeImpl extends MinimalEObjectImpl.Container implements PolygonBasedShape
{
  /**
   * The cached value of the '{@link #getShape() <em>Shape</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShape()
   * @generated
   * @ordered
   */
  protected EList<PolygonBasedNodeShape> shape;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PolygonBasedShapeImpl()
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
    return NoTerminalExtensionPackage.Literals.POLYGON_BASED_SHAPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<PolygonBasedNodeShape> getShape()
  {
    if (shape == null)
    {
      shape = new EDataTypeEList<PolygonBasedNodeShape>(PolygonBasedNodeShape.class, this, NoTerminalExtensionPackage.POLYGON_BASED_SHAPE__SHAPE);
    }
    return shape;
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
      case NoTerminalExtensionPackage.POLYGON_BASED_SHAPE__SHAPE:
        return getShape();
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
      case NoTerminalExtensionPackage.POLYGON_BASED_SHAPE__SHAPE:
        getShape().clear();
        getShape().addAll((Collection<? extends PolygonBasedNodeShape>)newValue);
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
      case NoTerminalExtensionPackage.POLYGON_BASED_SHAPE__SHAPE:
        getShape().clear();
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
      case NoTerminalExtensionPackage.POLYGON_BASED_SHAPE__SHAPE:
        return shape != null && !shape.isEmpty();
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
    result.append(" (shape: ");
    result.append(shape);
    result.append(')');
    return result.toString();
  }

} //PolygonBasedShapeImpl
