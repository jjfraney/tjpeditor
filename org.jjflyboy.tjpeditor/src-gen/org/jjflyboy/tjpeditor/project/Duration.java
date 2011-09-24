/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Duration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Duration#getDuration <em>Duration</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getDuration()
 * @model
 * @generated
 */
public interface Duration extends TaskAttribute
{
  /**
   * Returns the value of the '<em><b>Duration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Duration</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Duration</em>' containment reference.
   * @see #setDuration(DurationQuantity)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getDuration_Duration()
   * @model containment="true"
   * @generated
   */
  DurationQuantity getDuration();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Duration#getDuration <em>Duration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Duration</em>' containment reference.
   * @see #getDuration()
   * @generated
   */
  void setDuration(DurationQuantity value);

} // Duration
