/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cell Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.CellText#getText <em>Text</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.CellText#getExpresssion <em>Expresssion</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getCellText()
 * @model
 * @generated
 */
public interface CellText extends ColumnAttribute
{
  /**
   * Returns the value of the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' attribute.
   * @see #setText(String)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getCellText_Text()
   * @model
   * @generated
   */
  String getText();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.CellText#getText <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' attribute.
   * @see #getText()
   * @generated
   */
  void setText(String value);

  /**
   * Returns the value of the '<em><b>Expresssion</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expresssion</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expresssion</em>' attribute.
   * @see #setExpresssion(String)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getCellText_Expresssion()
   * @model
   * @generated
   */
  String getExpresssion();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.CellText#getExpresssion <em>Expresssion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expresssion</em>' attribute.
   * @see #getExpresssion()
   * @generated
   */
  void setExpresssion(String value);

} // CellText
