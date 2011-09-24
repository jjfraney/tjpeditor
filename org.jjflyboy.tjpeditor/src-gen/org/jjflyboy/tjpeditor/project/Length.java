/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Length</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Length#getLength <em>Length</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getLength()
 * @model
 * @generated
 */
public interface Length extends TaskAttribute
{
  /**
   * Returns the value of the '<em><b>Length</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Length</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Length</em>' containment reference.
   * @see #setLength(DurationQuantity)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getLength_Length()
   * @model containment="true"
   * @generated
   */
  DurationQuantity getLength();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Length#getLength <em>Length</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Length</em>' containment reference.
   * @see #getLength()
   * @generated
   */
  void setLength(DurationQuantity value);

} // Length
