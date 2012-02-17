/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;

import org.eclipse.xtext.common.types.JvmIdentifiableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XBinary Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.XBinaryOperation#getLeftOperand <em>Left Operand</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.XBinaryOperation#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.XBinaryOperation#getRightOperand <em>Right Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getXBinaryOperation()
 * @model
 * @generated
 */
public interface XBinaryOperation extends LogicalExpression
{
  /**
   * Returns the value of the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left Operand</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left Operand</em>' containment reference.
   * @see #setLeftOperand(LogicalExpression)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getXBinaryOperation_LeftOperand()
   * @model containment="true"
   * @generated
   */
  LogicalExpression getLeftOperand();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.XBinaryOperation#getLeftOperand <em>Left Operand</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left Operand</em>' containment reference.
   * @see #getLeftOperand()
   * @generated
   */
  void setLeftOperand(LogicalExpression value);

  /**
   * Returns the value of the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature</em>' reference.
   * @see #setFeature(JvmIdentifiableElement)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getXBinaryOperation_Feature()
   * @model
   * @generated
   */
  JvmIdentifiableElement getFeature();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.XBinaryOperation#getFeature <em>Feature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature</em>' reference.
   * @see #getFeature()
   * @generated
   */
  void setFeature(JvmIdentifiableElement value);

  /**
   * Returns the value of the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right Operand</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right Operand</em>' containment reference.
   * @see #setRightOperand(LogicalExpression)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getXBinaryOperation_RightOperand()
   * @model containment="true"
   * @generated
   */
  LogicalExpression getRightOperand();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.XBinaryOperation#getRightOperand <em>Right Operand</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right Operand</em>' containment reference.
   * @see #getRightOperand()
   * @generated
   */
  void setRightOperand(LogicalExpression value);

} // XBinaryOperation
