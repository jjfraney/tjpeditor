/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sort</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Sort#isId <em>Id</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Sort#getCriteria <em>Criteria</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getSort()
 * @model
 * @generated
 */
public interface Sort extends SortResources, SortTasks
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(boolean)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getSort_Id()
   * @model
   * @generated
   */
  boolean isId();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Sort#isId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #isId()
   * @generated
   */
  void setId(boolean value);

  /**
   * Returns the value of the '<em><b>Criteria</b></em>' containment reference list.
   * The list contents are of type {@link org.jjflyboy.tjpeditor.project.Criterion}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Criteria</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Criteria</em>' containment reference list.
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getSort_Criteria()
   * @model containment="true"
   * @generated
   */
  EList<Criterion> getCriteria();

} // Sort
