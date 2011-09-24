/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.ListType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getListType()
 * @model
 * @generated
 */
public interface ListType extends ColumnAttribute
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.jjflyboy.tjpeditor.project.ListTypeValues}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see org.jjflyboy.tjpeditor.project.ListTypeValues
   * @see #setType(ListTypeValues)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getListType_Type()
   * @model
   * @generated
   */
  ListTypeValues getType();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.ListType#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see org.jjflyboy.tjpeditor.project.ListTypeValues
   * @see #getType()
   * @generated
   */
  void setType(ListTypeValues value);

} // ListType
