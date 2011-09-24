/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Milestone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Milestone#isMilestone <em>Milestone</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getMilestone()
 * @model
 * @generated
 */
public interface Milestone extends TaskAttribute
{
  /**
   * Returns the value of the '<em><b>Milestone</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Milestone</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Milestone</em>' attribute.
   * @see #setMilestone(boolean)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getMilestone_Milestone()
   * @model
   * @generated
   */
  boolean isMilestone();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Milestone#isMilestone <em>Milestone</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Milestone</em>' attribute.
   * @see #isMilestone()
   * @generated
   */
  void setMilestone(boolean value);

} // Milestone
