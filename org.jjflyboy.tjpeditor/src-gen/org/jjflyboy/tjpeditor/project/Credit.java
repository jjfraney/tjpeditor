/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Credit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Credit#getDate <em>Date</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Credit#getDescription <em>Description</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Credit#getAmount <em>Amount</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getCredit()
 * @model
 * @generated
 */
public interface Credit extends AccountAttribute
{
  /**
   * Returns the value of the '<em><b>Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Date</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Date</em>' attribute.
   * @see #setDate(String)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getCredit_Date()
   * @model
   * @generated
   */
  String getDate();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Credit#getDate <em>Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Date</em>' attribute.
   * @see #getDate()
   * @generated
   */
  void setDate(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getCredit_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Credit#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

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
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getCredit_Amount()
   * @model
   * @generated
   */
  float getAmount();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Credit#getAmount <em>Amount</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Amount</em>' attribute.
   * @see #getAmount()
   * @generated
   */
  void setAmount(float value);

} // Credit
