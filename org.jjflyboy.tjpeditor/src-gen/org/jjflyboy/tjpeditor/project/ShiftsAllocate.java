/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shifts Allocate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.ShiftsAllocate#getShift <em>Shift</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.ShiftsAllocate#getIntervals <em>Intervals</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getShiftsAllocate()
 * @model
 * @generated
 */
public interface ShiftsAllocate extends AllocateResourceAttribute
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
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getShiftsAllocate_Shift()
   * @model
   * @generated
   */
  Shift getShift();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.ShiftsAllocate#getShift <em>Shift</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Shift</em>' reference.
   * @see #getShift()
   * @generated
   */
  void setShift(Shift value);

  /**
   * Returns the value of the '<em><b>Intervals</b></em>' containment reference list.
   * The list contents are of type {@link org.jjflyboy.tjpeditor.project.Interval3}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Intervals</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Intervals</em>' containment reference list.
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getShiftsAllocate_Intervals()
   * @model containment="true"
   * @generated
   */
  EList<Interval3> getIntervals();

} // ShiftsAllocate
