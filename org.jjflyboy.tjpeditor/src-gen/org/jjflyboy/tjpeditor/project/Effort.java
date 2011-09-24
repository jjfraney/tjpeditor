/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Effort</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Effort#getEffort <em>Effort</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getEffort()
 * @model
 * @generated
 */
public interface Effort extends TaskAttribute
{
  /**
   * Returns the value of the '<em><b>Effort</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Effort</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Effort</em>' containment reference.
   * @see #setEffort(DurationQuantity)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getEffort_Effort()
   * @model containment="true"
   * @generated
   */
  DurationQuantity getEffort();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Effort#getEffort <em>Effort</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Effort</em>' containment reference.
   * @see #getEffort()
   * @generated
   */
  void setEffort(DurationQuantity value);

} // Effort
