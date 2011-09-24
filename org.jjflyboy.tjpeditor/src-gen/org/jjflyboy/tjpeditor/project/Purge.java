/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Purge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Purge#getListAttribute <em>List Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getPurge()
 * @model
 * @generated
 */
public interface Purge extends TaskAttribute, ResourceAttribute
{
  /**
   * Returns the value of the '<em><b>List Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>List Attribute</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>List Attribute</em>' attribute.
   * @see #setListAttribute(String)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getPurge_ListAttribute()
   * @model
   * @generated
   */
  String getListAttribute();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Purge#getListAttribute <em>List Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>List Attribute</em>' attribute.
   * @see #getListAttribute()
   * @generated
   */
  void setListAttribute(String value);

} // Purge
