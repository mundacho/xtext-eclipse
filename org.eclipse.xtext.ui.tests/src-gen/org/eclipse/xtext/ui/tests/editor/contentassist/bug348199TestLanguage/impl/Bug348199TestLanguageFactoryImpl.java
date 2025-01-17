/**
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.ui.tests.editor.contentassist.bug348199TestLanguage.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.xtext.ui.tests.editor.contentassist.bug348199TestLanguage.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Bug348199TestLanguageFactoryImpl extends EFactoryImpl implements Bug348199TestLanguageFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Bug348199TestLanguageFactory init()
  {
    try
    {
      Bug348199TestLanguageFactory theBug348199TestLanguageFactory = (Bug348199TestLanguageFactory)EPackage.Registry.INSTANCE.getEFactory(Bug348199TestLanguagePackage.eNS_URI);
      if (theBug348199TestLanguageFactory != null)
      {
        return theBug348199TestLanguageFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new Bug348199TestLanguageFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bug348199TestLanguageFactoryImpl()
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
      case Bug348199TestLanguagePackage.TIMEPERIOD: return createTimeperiod();
      case Bug348199TestLanguagePackage.TIME_DEF: return createTimeDef();
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
  public Timeperiod createTimeperiod()
  {
    TimeperiodImpl timeperiod = new TimeperiodImpl();
    return timeperiod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TimeDef createTimeDef()
  {
    TimeDefImpl timeDef = new TimeDefImpl();
    return timeDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Bug348199TestLanguagePackage getBug348199TestLanguagePackage()
  {
    return (Bug348199TestLanguagePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static Bug348199TestLanguagePackage getPackage()
  {
    return Bug348199TestLanguagePackage.eINSTANCE;
  }

} //Bug348199TestLanguageFactoryImpl
