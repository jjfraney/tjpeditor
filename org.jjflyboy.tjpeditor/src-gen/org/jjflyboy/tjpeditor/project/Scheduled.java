/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheduled</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Scheduled#isScheduled <em>Scheduled</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getScheduled()
 * @model
 * @generated
 */
public interface Scheduled extends TaskAttribute
{
  /**
   * Returns the value of the '<em><b>Scheduled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scheduled</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scheduled</em>' attribute.
   * @see #setScheduled(boolean)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getScheduled_Scheduled()
   * @model
   * @generated
   */
  boolean isScheduled();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Scheduled#isScheduled <em>Scheduled</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scheduled</em>' attribute.
   * @see #isScheduled()
   * @generated
   */
  void setScheduled(boolean value);

} // Scheduled
