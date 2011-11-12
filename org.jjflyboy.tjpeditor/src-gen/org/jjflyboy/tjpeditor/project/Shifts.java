/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shifts</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Shifts#getLimits <em>Limits</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getShifts()
 * @model
 * @generated
 */
public interface Shifts extends ShiftsResource, ShiftsTask
{
  /**
   * Returns the value of the '<em><b>Limits</b></em>' containment reference list.
   * The list contents are of type {@link org.jjflyboy.tjpeditor.project.ShiftsLimit}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Limits</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Limits</em>' containment reference list.
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getShifts_Limits()
   * @model containment="true"
   * @generated
   */
  EList<ShiftsLimit> getLimits();

} // Shifts
