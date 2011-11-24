/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Balance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Balance#getCost <em>Cost</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Balance#getRevenue <em>Revenue</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getBalance()
 * @model
 * @generated
 */
public interface Balance extends Property, ReportAttribute
{
  /**
   * Returns the value of the '<em><b>Cost</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cost</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cost</em>' reference.
   * @see #setCost(Account)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getBalance_Cost()
   * @model
   * @generated
   */
  Account getCost();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Balance#getCost <em>Cost</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cost</em>' reference.
   * @see #getCost()
   * @generated
   */
  void setCost(Account value);

  /**
   * Returns the value of the '<em><b>Revenue</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Revenue</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Revenue</em>' reference.
   * @see #setRevenue(Account)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getBalance_Revenue()
   * @model
   * @generated
   */
  Account getRevenue();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Balance#getRevenue <em>Revenue</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Revenue</em>' reference.
   * @see #getRevenue()
   * @generated
   */
  void setRevenue(Account value);

} // Balance
