/**
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.ui.tests.editor.contentassist.backtrackingContentAssistTest;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Square Bracket Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.ui.tests.editor.contentassist.backtrackingContentAssistTest.SquareBracketExp#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtext.ui.tests.editor.contentassist.backtrackingContentAssistTest.SquareBracketExp#getArguments <em>Arguments</em>}</li>
 *   <li>{@link org.eclipse.xtext.ui.tests.editor.contentassist.backtrackingContentAssistTest.SquareBracketExp#isPre <em>Pre</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.ui.tests.editor.contentassist.backtrackingContentAssistTest.BacktrackingContentAssistTestPackage#getSquareBracketExp()
 * @model
 * @generated
 */
public interface SquareBracketExp extends Expression
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(NameExp)
   * @see org.eclipse.xtext.ui.tests.editor.contentassist.backtrackingContentAssistTest.BacktrackingContentAssistTestPackage#getSquareBracketExp_Name()
   * @model containment="true"
   * @generated
   */
  NameExp getName();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.ui.tests.editor.contentassist.backtrackingContentAssistTest.SquareBracketExp#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(NameExp value);

  /**
   * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.ui.tests.editor.contentassist.backtrackingContentAssistTest.Expression}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arguments</em>' containment reference list.
   * @see org.eclipse.xtext.ui.tests.editor.contentassist.backtrackingContentAssistTest.BacktrackingContentAssistTestPackage#getSquareBracketExp_Arguments()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getArguments();

  /**
   * Returns the value of the '<em><b>Pre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pre</em>' attribute.
   * @see #setPre(boolean)
   * @see org.eclipse.xtext.ui.tests.editor.contentassist.backtrackingContentAssistTest.BacktrackingContentAssistTestPackage#getSquareBracketExp_Pre()
   * @model
   * @generated
   */
  boolean isPre();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.ui.tests.editor.contentassist.backtrackingContentAssistTest.SquareBracketExp#isPre <em>Pre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pre</em>' attribute.
   * @see #isPre()
   * @generated
   */
  void setPre(boolean value);

} // SquareBracketExp
