/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remaining</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Remaining#getRemaining <em>Remaining</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getRemaining()
 * @model
 * @generated
 */
public interface Remaining extends NewTaskAttribute, TaskTimesheetAttribute
{
  /**
   * Returns the value of the '<em><b>Remaining</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Remaining</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Remaining</em>' containment reference.
   * @see #setRemaining(DurationQuantity)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getRemaining_Remaining()
   * @model containment="true"
   * @generated
   */
  DurationQuantity getRemaining();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Remaining#getRemaining <em>Remaining</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Remaining</em>' containment reference.
   * @see #getRemaining()
   * @generated
   */
  void setRemaining(DurationQuantity value);

} // Remaining
