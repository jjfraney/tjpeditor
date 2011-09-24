/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheduling</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Scheduling#getScheduling <em>Scheduling</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getScheduling()
 * @model
 * @generated
 */
public interface Scheduling extends TaskAttribute
{
  /**
   * Returns the value of the '<em><b>Scheduling</b></em>' attribute.
   * The literals are from the enumeration {@link org.jjflyboy.tjpeditor.project.SchedulingPolicy}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scheduling</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scheduling</em>' attribute.
   * @see org.jjflyboy.tjpeditor.project.SchedulingPolicy
   * @see #setScheduling(SchedulingPolicy)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getScheduling_Scheduling()
   * @model
   * @generated
   */
  SchedulingPolicy getScheduling();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Scheduling#getScheduling <em>Scheduling</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scheduling</em>' attribute.
   * @see org.jjflyboy.tjpeditor.project.SchedulingPolicy
   * @see #getScheduling()
   * @generated
   */
  void setScheduling(SchedulingPolicy value);

} // Scheduling
