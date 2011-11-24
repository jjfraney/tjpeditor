/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Global#getProject <em>Project</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Global#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getGlobal()
 * @model
 * @generated
 */
public interface Global extends EObject
{
  /**
   * Returns the value of the '<em><b>Project</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Project</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Project</em>' containment reference.
   * @see #setProject(Project)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getGlobal_Project()
   * @model containment="true"
   * @generated
   */
  Project getProject();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Global#getProject <em>Project</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Project</em>' containment reference.
   * @see #getProject()
   * @generated
   */
  void setProject(Project value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link org.jjflyboy.tjpeditor.project.Property}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getGlobal_Properties()
   * @model containment="true"
   * @generated
   */
  EList<Property> getProperties();

} // Global
