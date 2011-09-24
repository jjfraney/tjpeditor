/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vacation Shift</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.VacationShift#getName <em>Name</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.VacationShift#getIntervals <em>Intervals</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getVacationShift()
 * @model
 * @generated
 */
public interface VacationShift extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getVacationShift_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.VacationShift#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getVacationShift_Intervals()
   * @model containment="true"
   * @generated
   */
  EList<Interval3> getIntervals();

} // VacationShift
