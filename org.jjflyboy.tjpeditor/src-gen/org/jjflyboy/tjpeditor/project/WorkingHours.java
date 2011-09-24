/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Working Hours</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.WorkingHours#getWeekdays <em>Weekdays</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.WorkingHours#isOff <em>Off</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.WorkingHours#getHours <em>Hours</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getWorkingHours()
 * @model
 * @generated
 */
public interface WorkingHours extends ProjectAttribute, ResourceAttribute
{
  /**
   * Returns the value of the '<em><b>Weekdays</b></em>' containment reference list.
   * The list contents are of type {@link org.jjflyboy.tjpeditor.project.Weekdays}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Weekdays</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Weekdays</em>' containment reference list.
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getWorkingHours_Weekdays()
   * @model containment="true"
   * @generated
   */
  EList<Weekdays> getWeekdays();

  /**
   * Returns the value of the '<em><b>Off</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Off</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Off</em>' attribute.
   * @see #setOff(boolean)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getWorkingHours_Off()
   * @model
   * @generated
   */
  boolean isOff();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.WorkingHours#isOff <em>Off</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Off</em>' attribute.
   * @see #isOff()
   * @generated
   */
  void setOff(boolean value);

  /**
   * Returns the value of the '<em><b>Hours</b></em>' containment reference list.
   * The list contents are of type {@link org.jjflyboy.tjpeditor.project.WorkHours}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hours</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hours</em>' containment reference list.
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getWorkingHours_Hours()
   * @model containment="true"
   * @generated
   */
  EList<WorkHours> getHours();

} // WorkingHours
