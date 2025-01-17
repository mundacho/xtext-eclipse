/**
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.ui.tests.xmleditor.simplexml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.ui.tests.xmleditor.simplexml.Attribute;
import org.eclipse.xtext.ui.tests.xmleditor.simplexml.Content;
import org.eclipse.xtext.ui.tests.xmleditor.simplexml.SimplexmlPackage;
import org.eclipse.xtext.ui.tests.xmleditor.simplexml.Tag;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.ui.tests.xmleditor.simplexml.impl.TagImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtext.ui.tests.xmleditor.simplexml.impl.TagImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.eclipse.xtext.ui.tests.xmleditor.simplexml.impl.TagImpl#getContents <em>Contents</em>}</li>
 *   <li>{@link org.eclipse.xtext.ui.tests.xmleditor.simplexml.impl.TagImpl#getCloseName <em>Close Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TagImpl extends MinimalEObjectImpl.Container implements Tag
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<Attribute> attributes;

  /**
   * The cached value of the '{@link #getContents() <em>Contents</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContents()
   * @generated
   * @ordered
   */
  protected EList<Content> contents;

  /**
   * The default value of the '{@link #getCloseName() <em>Close Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCloseName()
   * @generated
   * @ordered
   */
  protected static final String CLOSE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCloseName() <em>Close Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCloseName()
   * @generated
   * @ordered
   */
  protected String closeName = CLOSE_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TagImpl()
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
    return SimplexmlPackage.Literals.TAG;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimplexmlPackage.TAG__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Attribute> getAttributes()
  {
    if (attributes == null)
    {
      attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, SimplexmlPackage.TAG__ATTRIBUTES);
    }
    return attributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Content> getContents()
  {
    if (contents == null)
    {
      contents = new EObjectContainmentEList<Content>(Content.class, this, SimplexmlPackage.TAG__CONTENTS);
    }
    return contents;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCloseName()
  {
    return closeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCloseName(String newCloseName)
  {
    String oldCloseName = closeName;
    closeName = newCloseName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimplexmlPackage.TAG__CLOSE_NAME, oldCloseName, closeName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SimplexmlPackage.TAG__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
      case SimplexmlPackage.TAG__CONTENTS:
        return ((InternalEList<?>)getContents()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case SimplexmlPackage.TAG__NAME:
        return getName();
      case SimplexmlPackage.TAG__ATTRIBUTES:
        return getAttributes();
      case SimplexmlPackage.TAG__CONTENTS:
        return getContents();
      case SimplexmlPackage.TAG__CLOSE_NAME:
        return getCloseName();
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
      case SimplexmlPackage.TAG__NAME:
        setName((String)newValue);
        return;
      case SimplexmlPackage.TAG__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends Attribute>)newValue);
        return;
      case SimplexmlPackage.TAG__CONTENTS:
        getContents().clear();
        getContents().addAll((Collection<? extends Content>)newValue);
        return;
      case SimplexmlPackage.TAG__CLOSE_NAME:
        setCloseName((String)newValue);
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
      case SimplexmlPackage.TAG__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SimplexmlPackage.TAG__ATTRIBUTES:
        getAttributes().clear();
        return;
      case SimplexmlPackage.TAG__CONTENTS:
        getContents().clear();
        return;
      case SimplexmlPackage.TAG__CLOSE_NAME:
        setCloseName(CLOSE_NAME_EDEFAULT);
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
      case SimplexmlPackage.TAG__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SimplexmlPackage.TAG__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
      case SimplexmlPackage.TAG__CONTENTS:
        return contents != null && !contents.isEmpty();
      case SimplexmlPackage.TAG__CLOSE_NAME:
        return CLOSE_NAME_EDEFAULT == null ? closeName != null : !CLOSE_NAME_EDEFAULT.equals(closeName);
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
    result.append(" (name: ");
    result.append(name);
    result.append(", closeName: ");
    result.append(closeName);
    result.append(')');
    return result.toString();
  }

} //TagImpl
