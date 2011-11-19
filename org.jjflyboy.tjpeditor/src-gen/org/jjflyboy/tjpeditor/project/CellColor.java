/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cell Color</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.CellColor#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.CellColor#getColor <em>Color</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getCellColor()
 * @model
 * @generated
 */
public interface CellColor extends ColumnAttribute
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' attribute.
   * @see #setExpression(String)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getCellColor_Expression()
   * @model
   * @generated
   */
  String getExpression();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.CellColor#getExpression <em>Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' attribute.
   * @see #getExpression()
   * @generated
   */
  void setExpression(String value);

  /**
   * Returns the value of the '<em><b>Color</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Color</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Color</em>' containment reference.
   * @see #setColor(RGB)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getCellColor_Color()
   * @model containment="true"
   * @generated
   */
  RGB getColor();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.CellColor#getColor <em>Color</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Color</em>' containment reference.
   * @see #getColor()
   * @generated
   */
  void setColor(RGB value);

} // CellColor
