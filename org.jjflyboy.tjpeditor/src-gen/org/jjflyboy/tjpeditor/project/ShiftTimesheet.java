/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shift Timesheet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.ShiftTimesheet#getShift <em>Shift</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getShiftTimesheet()
 * @model
 * @generated
 */
public interface ShiftTimesheet extends TimesheetAttribute
{
  /**
   * Returns the value of the '<em><b>Shift</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Shift</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Shift</em>' reference.
   * @see #setShift(Shift)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getShiftTimesheet_Shift()
   * @model
   * @generated
   */
  Shift getShift();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.ShiftTimesheet#getShift <em>Shift</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Shift</em>' reference.
   * @see #getShift()
   * @generated
   */
  void setShift(Shift value);

} // ShiftTimesheet
