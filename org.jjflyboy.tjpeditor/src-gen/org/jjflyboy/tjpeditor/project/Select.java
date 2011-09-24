/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Select#getArgument <em>Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getSelect()
 * @model
 * @generated
 */
public interface Select extends AllocateResourceAttribute
{
  /**
   * Returns the value of the '<em><b>Argument</b></em>' attribute.
   * The literals are from the enumeration {@link org.jjflyboy.tjpeditor.project.SelectArgument}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Argument</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Argument</em>' attribute.
   * @see org.jjflyboy.tjpeditor.project.SelectArgument
   * @see #setArgument(SelectArgument)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getSelect_Argument()
   * @model
   * @generated
   */
  SelectArgument getArgument();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Select#getArgument <em>Argument</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Argument</em>' attribute.
   * @see org.jjflyboy.tjpeditor.project.SelectArgument
   * @see #getArgument()
   * @generated
   */
  void setArgument(SelectArgument value);

} // Select
