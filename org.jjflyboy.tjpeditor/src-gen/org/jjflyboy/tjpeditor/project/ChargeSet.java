/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Charge Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.ChargeSet#getAccountShares <em>Account Shares</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getChargeSet()
 * @model
 * @generated
 */
public interface ChargeSet extends TaskAttribute
{
  /**
   * Returns the value of the '<em><b>Account Shares</b></em>' containment reference list.
   * The list contents are of type {@link org.jjflyboy.tjpeditor.project.AccountShare}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Account Shares</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Account Shares</em>' containment reference list.
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getChargeSet_AccountShares()
   * @model containment="true"
   * @generated
   */
  EList<AccountShare> getAccountShares();

} // ChargeSet
