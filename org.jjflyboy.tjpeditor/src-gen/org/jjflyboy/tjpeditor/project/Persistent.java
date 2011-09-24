/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persistent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Persistent#isPersistent <em>Persistent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getPersistent()
 * @model
 * @generated
 */
public interface Persistent extends AllocateResourceAttribute
{
  /**
   * Returns the value of the '<em><b>Persistent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Persistent</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Persistent</em>' attribute.
   * @see #setPersistent(boolean)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getPersistent_Persistent()
   * @model
   * @generated
   */
  boolean isPersistent();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Persistent#isPersistent <em>Persistent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Persistent</em>' attribute.
   * @see #isPersistent()
   * @generated
   */
  void setPersistent(boolean value);

} // Persistent
