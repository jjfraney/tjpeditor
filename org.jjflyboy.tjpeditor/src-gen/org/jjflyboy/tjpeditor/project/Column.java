/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Column#getId <em>Id</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Column#getAttribute <em>Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getColumn()
 * @model
 * @generated
 */
public interface Column extends EObject
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * The literals are from the enumeration {@link org.jjflyboy.tjpeditor.project.ColumnId}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see org.jjflyboy.tjpeditor.project.ColumnId
   * @see #setId(ColumnId)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getColumn_Id()
   * @model
   * @generated
   */
  ColumnId getId();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Column#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see org.jjflyboy.tjpeditor.project.ColumnId
   * @see #getId()
   * @generated
   */
  void setId(ColumnId value);

  /**
   * Returns the value of the '<em><b>Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' containment reference.
   * @see #setAttribute(ColumnAttribute)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getColumn_Attribute()
   * @model containment="true"
   * @generated
   */
  ColumnAttribute getAttribute();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Column#getAttribute <em>Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute</em>' containment reference.
   * @see #getAttribute()
   * @generated
   */
  void setAttribute(ColumnAttribute value);

} // Column
