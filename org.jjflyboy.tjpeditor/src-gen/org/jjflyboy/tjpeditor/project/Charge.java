/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Charge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Charge#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Charge#getApplies <em>Applies</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getCharge()
 * @model
 * @generated
 */
public interface Charge extends TaskAttribute
{
  /**
   * Returns the value of the '<em><b>Amount</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Amount</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Amount</em>' attribute.
   * @see #setAmount(float)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getCharge_Amount()
   * @model
   * @generated
   */
  float getAmount();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Charge#getAmount <em>Amount</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Amount</em>' attribute.
   * @see #getAmount()
   * @generated
   */
  void setAmount(float value);

  /**
   * Returns the value of the '<em><b>Applies</b></em>' attribute.
   * The literals are from the enumeration {@link org.jjflyboy.tjpeditor.project.ChargeApplies}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Applies</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Applies</em>' attribute.
   * @see org.jjflyboy.tjpeditor.project.ChargeApplies
   * @see #setApplies(ChargeApplies)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getCharge_Applies()
   * @model
   * @generated
   */
  ChargeApplies getApplies();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Charge#getApplies <em>Applies</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Applies</em>' attribute.
   * @see org.jjflyboy.tjpeditor.project.ChargeApplies
   * @see #getApplies()
   * @generated
   */
  void setApplies(ChargeApplies value);

} // Charge
