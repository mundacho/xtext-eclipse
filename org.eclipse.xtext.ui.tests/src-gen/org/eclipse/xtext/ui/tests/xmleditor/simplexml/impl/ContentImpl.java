/**
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.ui.tests.xmleditor.simplexml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.xtext.ui.tests.xmleditor.simplexml.Content;
import org.eclipse.xtext.ui.tests.xmleditor.simplexml.SimplexmlPackage;
import org.eclipse.xtext.ui.tests.xmleditor.simplexml.Tag;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.ui.tests.xmleditor.simplexml.impl.ContentImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link org.eclipse.xtext.ui.tests.xmleditor.simplexml.impl.ContentImpl#getText <em>Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContentImpl extends MinimalEObjectImpl.Container implements Content
{
  /**
   * The cached value of the '{@link #getTag() <em>Tag</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTag()
   * @generated
   * @ordered
   */
  protected Tag tag;

  /**
   * The default value of the '{@link #getText() <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getText()
   * @generated
   * @ordered
   */
  protected static final String TEXT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getText()
   * @generated
   * @ordered
   */
  protected String text = TEXT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContentImpl()
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
    return SimplexmlPackage.Literals.CONTENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Tag getTag()
  {
    return tag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTag(Tag newTag, NotificationChain msgs)
  {
    Tag oldTag = tag;
    tag = newTag;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimplexmlPackage.CONTENT__TAG, oldTag, newTag);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTag(Tag newTag)
  {
    if (newTag != tag)
    {
      NotificationChain msgs = null;
      if (tag != null)
        msgs = ((InternalEObject)tag).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimplexmlPackage.CONTENT__TAG, null, msgs);
      if (newTag != null)
        msgs = ((InternalEObject)newTag).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimplexmlPackage.CONTENT__TAG, null, msgs);
      msgs = basicSetTag(newTag, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimplexmlPackage.CONTENT__TAG, newTag, newTag));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getText()
  {
    return text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setText(String newText)
  {
    String oldText = text;
    text = newText;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimplexmlPackage.CONTENT__TEXT, oldText, text));
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
      case SimplexmlPackage.CONTENT__TAG:
        return basicSetTag(null, msgs);
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
      case SimplexmlPackage.CONTENT__TAG:
        return getTag();
      case SimplexmlPackage.CONTENT__TEXT:
        return getText();
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
      case SimplexmlPackage.CONTENT__TAG:
        setTag((Tag)newValue);
        return;
      case SimplexmlPackage.CONTENT__TEXT:
        setText((String)newValue);
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
      case SimplexmlPackage.CONTENT__TAG:
        setTag((Tag)null);
        return;
      case SimplexmlPackage.CONTENT__TEXT:
        setText(TEXT_EDEFAULT);
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
      case SimplexmlPackage.CONTENT__TAG:
        return tag != null;
      case SimplexmlPackage.CONTENT__TEXT:
        return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
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
    result.append(" (text: ");
    result.append(text);
    result.append(')');
    return result.toString();
  }

} //ContentImpl
