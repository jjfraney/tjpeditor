/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Criterion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Criterion#getColumnId <em>Column Id</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Criterion#getDirection <em>Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getCriterion()
 * @model
 * @generated
 */
public interface Criterion extends EObject
{
  /**
   * Returns the value of the '<em><b>Column Id</b></em>' attribute.
   * The literals are from the enumeration {@link org.jjflyboy.tjpeditor.project.ColumnId}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Column Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Column Id</em>' attribute.
   * @see org.jjflyboy.tjpeditor.project.ColumnId
   * @see #setColumnId(ColumnId)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getCriterion_ColumnId()
   * @model
   * @generated
   */
  ColumnId getColumnId();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Criterion#getColumnId <em>Column Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Column Id</em>' attribute.
   * @see org.jjflyboy.tjpeditor.project.ColumnId
   * @see #getColumnId()
   * @generated
   */
  void setColumnId(ColumnId value);

  /**
   * Returns the value of the '<em><b>Direction</b></em>' attribute.
   * The literals are from the enumeration {@link org.jjflyboy.tjpeditor.project.CriterionDirection}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Direction</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Direction</em>' attribute.
   * @see org.jjflyboy.tjpeditor.project.CriterionDirection
   * @see #setDirection(CriterionDirection)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getCriterion_Direction()
   * @model
   * @generated
   */
  CriterionDirection getDirection();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Criterion#getDirection <em>Direction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Direction</em>' attribute.
   * @see org.jjflyboy.tjpeditor.project.CriterionDirection
   * @see #getDirection()
   * @generated
   */
  void setDirection(CriterionDirection value);

} // Criterion
