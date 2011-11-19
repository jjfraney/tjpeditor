/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Account Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.AccountRoot#getAccount <em>Account</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getAccountRoot()
 * @model
 * @generated
 */
public interface AccountRoot extends ReportAttribute
{
  /**
   * Returns the value of the '<em><b>Account</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Account</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Account</em>' reference.
   * @see #setAccount(Account)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getAccountRoot_Account()
   * @model
   * @generated
   */
  Account getAccount();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.AccountRoot#getAccount <em>Account</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Account</em>' reference.
   * @see #getAccount()
   * @generated
   */
  void setAccount(Account value);

} // AccountRoot
