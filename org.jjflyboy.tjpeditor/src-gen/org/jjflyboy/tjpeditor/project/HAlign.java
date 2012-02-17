/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HAlign</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.HAlign#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.HAlign#getJustification <em>Justification</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getHAlign()
 * @model
 * @generated
 */
public interface HAlign extends ColumnAttribute
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(LogicalExpression)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getHAlign_Expression()
   * @model containment="true"
   * @generated
   */
  LogicalExpression getExpression();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.HAlign#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(LogicalExpression value);

  /**
   * Returns the value of the '<em><b>Justification</b></em>' attribute.
   * The literals are from the enumeration {@link org.jjflyboy.tjpeditor.project.Justification}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Justification</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Justification</em>' attribute.
   * @see org.jjflyboy.tjpeditor.project.Justification
   * @see #setJustification(Justification)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getHAlign_Justification()
   * @model
   * @generated
   */
  Justification getJustification();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.HAlign#getJustification <em>Justification</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Justification</em>' attribute.
   * @see org.jjflyboy.tjpeditor.project.Justification
   * @see #getJustification()
   * @generated
   */
  void setJustification(Justification value);

} // HAlign
