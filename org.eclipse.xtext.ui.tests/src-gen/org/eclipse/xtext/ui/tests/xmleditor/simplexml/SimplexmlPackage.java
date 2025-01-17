/**
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.ui.tests.xmleditor.simplexml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.xtext.ui.tests.xmleditor.simplexml.SimplexmlFactory
 * @model kind="package"
 * @generated
 */
public interface SimplexmlPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "simplexml";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/xtext/ui/tests/xmleditor/Xml";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "simplexml";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SimplexmlPackage eINSTANCE = org.eclipse.xtext.ui.tests.xmleditor.simplexml.impl.SimplexmlPackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.xtext.ui.tests.xmleditor.simplexml.impl.XmlDocumentImpl <em>Xml Document</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.ui.tests.xmleditor.simplexml.impl.XmlDocumentImpl
   * @see org.eclipse.xtext.ui.tests.xmleditor.simplexml.impl.SimplexmlPackageImpl#getXmlDocument()
   * @generated
   */
  int XML_DOCUMENT = 0;

  /**
   * The feature id for the '<em><b>Contents</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML_DOCUMENT__CONTENTS = 0;

  /**
   * The number of structural features of the '<em>Xml Document</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML_DOCUMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.ui.tests.xmleditor.simplexml.impl.ContentImpl <em>Content</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.ui.tests.xmleditor.simplexml.impl.ContentImpl
   * @see org.eclipse.xtext.ui.tests.xmleditor.simplexml.impl.SimplexmlPackageImpl#getContent()
   * @generated
   */
  int CONTENT = 1;

  /**
   * The feature id for the '<em><b>Tag</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT__TAG = 0;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT__TEXT = 1;

  /**
   * The number of structural features of the '<em>Content</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.ui.tests.xmleditor.simplexml.impl.TagImpl <em>Tag</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.ui.tests.xmleditor.simplexml.impl.TagImpl
   * @see org.eclipse.xtext.ui.tests.xmleditor.simplexml.impl.SimplexmlPackageImpl#getTag()
   * @generated
   */
  int TAG = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG__NAME = 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG__ATTRIBUTES = 1;

  /**
   * The feature id for the '<em><b>Contents</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG__CONTENTS = 2;

  /**
   * The feature id for the '<em><b>Close Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG__CLOSE_NAME = 3;

  /**
   * The number of structural features of the '<em>Tag</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.ui.tests.xmleditor.simplexml.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.ui.tests.xmleditor.simplexml.impl.AttributeImpl
   * @see org.eclipse.xtext.ui.tests.xmleditor.simplexml.impl.SimplexmlPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__VALUE = 1;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.ui.tests.xmleditor.simplexml.XmlDocument <em>Xml Document</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Xml Document</em>'.
   * @see org.eclipse.xtext.ui.tests.xmleditor.simplexml.XmlDocument
   * @generated
   */
  EClass getXmlDocument();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.ui.tests.xmleditor.simplexml.XmlDocument#getContents <em>Contents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contents</em>'.
   * @see org.eclipse.xtext.ui.tests.xmleditor.simplexml.XmlDocument#getContents()
   * @see #getXmlDocument()
   * @generated
   */
  EReference getXmlDocument_Contents();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.ui.tests.xmleditor.simplexml.Content <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Content</em>'.
   * @see org.eclipse.xtext.ui.tests.xmleditor.simplexml.Content
   * @generated
   */
  EClass getContent();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.ui.tests.xmleditor.simplexml.Content#getTag <em>Tag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tag</em>'.
   * @see org.eclipse.xtext.ui.tests.xmleditor.simplexml.Content#getTag()
   * @see #getContent()
   * @generated
   */
  EReference getContent_Tag();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.ui.tests.xmleditor.simplexml.Content#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see org.eclipse.xtext.ui.tests.xmleditor.simplexml.Content#getText()
   * @see #getContent()
   * @generated
   */
  EAttribute getContent_Text();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.ui.tests.xmleditor.simplexml.Tag <em>Tag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tag</em>'.
   * @see org.eclipse.xtext.ui.tests.xmleditor.simplexml.Tag
   * @generated
   */
  EClass getTag();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.ui.tests.xmleditor.simplexml.Tag#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.ui.tests.xmleditor.simplexml.Tag#getName()
   * @see #getTag()
   * @generated
   */
  EAttribute getTag_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.ui.tests.xmleditor.simplexml.Tag#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.eclipse.xtext.ui.tests.xmleditor.simplexml.Tag#getAttributes()
   * @see #getTag()
   * @generated
   */
  EReference getTag_Attributes();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.ui.tests.xmleditor.simplexml.Tag#getContents <em>Contents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contents</em>'.
   * @see org.eclipse.xtext.ui.tests.xmleditor.simplexml.Tag#getContents()
   * @see #getTag()
   * @generated
   */
  EReference getTag_Contents();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.ui.tests.xmleditor.simplexml.Tag#getCloseName <em>Close Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Close Name</em>'.
   * @see org.eclipse.xtext.ui.tests.xmleditor.simplexml.Tag#getCloseName()
   * @see #getTag()
   * @generated
   */
  EAttribute getTag_CloseName();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.ui.tests.xmleditor.simplexml.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see org.eclipse.xtext.ui.tests.xmleditor.simplexml.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.ui.tests.xmleditor.simplexml.Attribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.ui.tests.xmleditor.simplexml.Attribute#getName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.ui.tests.xmleditor.simplexml.Attribute#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.xtext.ui.tests.xmleditor.simplexml.Attribute#getValue()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SimplexmlFactory getSimplexmlFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.eclipse.xtext.ui.tests.xmleditor.simplexml.impl.XmlDocumentImpl <em>Xml Document</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.ui.tests.xmleditor.simplexml.impl.XmlDocumentImpl
     * @see org.eclipse.xtext.ui.tests.xmleditor.simplexml.impl.SimplexmlPackageImpl#getXmlDocument()
     * @generated
     */
    EClass XML_DOCUMENT = eINSTANCE.getXmlDocument();

    /**
     * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XML_DOCUMENT__CONTENTS = eINSTANCE.getXmlDocument_Contents();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.ui.tests.xmleditor.simplexml.impl.ContentImpl <em>Content</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.ui.tests.xmleditor.simplexml.impl.ContentImpl
     * @see org.eclipse.xtext.ui.tests.xmleditor.simplexml.impl.SimplexmlPackageImpl#getContent()
     * @generated
     */
    EClass CONTENT = eINSTANCE.getContent();

    /**
     * The meta object literal for the '<em><b>Tag</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTENT__TAG = eINSTANCE.getContent_Tag();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTENT__TEXT = eINSTANCE.getContent_Text();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.ui.tests.xmleditor.simplexml.impl.TagImpl <em>Tag</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.ui.tests.xmleditor.simplexml.impl.TagImpl
     * @see org.eclipse.xtext.ui.tests.xmleditor.simplexml.impl.SimplexmlPackageImpl#getTag()
     * @generated
     */
    EClass TAG = eINSTANCE.getTag();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TAG__NAME = eINSTANCE.getTag_Name();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TAG__ATTRIBUTES = eINSTANCE.getTag_Attributes();

    /**
     * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TAG__CONTENTS = eINSTANCE.getTag_Contents();

    /**
     * The meta object literal for the '<em><b>Close Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TAG__CLOSE_NAME = eINSTANCE.getTag_CloseName();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.ui.tests.xmleditor.simplexml.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.ui.tests.xmleditor.simplexml.impl.AttributeImpl
     * @see org.eclipse.xtext.ui.tests.xmleditor.simplexml.impl.SimplexmlPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__VALUE = eINSTANCE.getAttribute_Value();

  }

} //SimplexmlPackage
