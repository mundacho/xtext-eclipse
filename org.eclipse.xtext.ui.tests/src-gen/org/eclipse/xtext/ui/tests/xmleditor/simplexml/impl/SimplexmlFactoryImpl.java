/**
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.ui.tests.xmleditor.simplexml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.xtext.ui.tests.xmleditor.simplexml.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimplexmlFactoryImpl extends EFactoryImpl implements SimplexmlFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SimplexmlFactory init()
  {
    try
    {
      SimplexmlFactory theSimplexmlFactory = (SimplexmlFactory)EPackage.Registry.INSTANCE.getEFactory(SimplexmlPackage.eNS_URI);
      if (theSimplexmlFactory != null)
      {
        return theSimplexmlFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SimplexmlFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimplexmlFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SimplexmlPackage.XML_DOCUMENT: return createXmlDocument();
      case SimplexmlPackage.CONTENT: return createContent();
      case SimplexmlPackage.TAG: return createTag();
      case SimplexmlPackage.ATTRIBUTE: return createAttribute();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public XmlDocument createXmlDocument()
  {
    XmlDocumentImpl xmlDocument = new XmlDocumentImpl();
    return xmlDocument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Content createContent()
  {
    ContentImpl content = new ContentImpl();
    return content;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Tag createTag()
  {
    TagImpl tag = new TagImpl();
    return tag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SimplexmlPackage getSimplexmlPackage()
  {
    return (SimplexmlPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SimplexmlPackage getPackage()
  {
    return SimplexmlPackage.eINSTANCE;
  }

} //SimplexmlFactoryImpl
