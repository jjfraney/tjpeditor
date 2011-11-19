/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extend</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Extend#getId <em>Id</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Extend#getName <em>Name</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Extend#isInherit <em>Inherit</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Extend#isScenariospecific <em>Scenariospecific</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getExtend()
 * @model
 * @generated
 */
public interface Extend extends EObject
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
   * @see #setId(String)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getExtend_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Extend#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getExtend_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Extend#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Inherit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inherit</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inherit</em>' attribute.
   * @see #setInherit(boolean)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getExtend_Inherit()
   * @model
   * @generated
   */
  boolean isInherit();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Extend#isInherit <em>Inherit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inherit</em>' attribute.
   * @see #isInherit()
   * @generated
   */
  void setInherit(boolean value);

  /**
   * Returns the value of the '<em><b>Scenariospecific</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scenariospecific</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scenariospecific</em>' attribute.
   * @see #setScenariospecific(boolean)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getExtend_Scenariospecific()
   * @model
   * @generated
   */
  boolean isScenariospecific();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Extend#isScenariospecific <em>Scenariospecific</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scenariospecific</em>' attribute.
   * @see #isScenariospecific()
   * @generated
   */
  void setScenariospecific(boolean value);

} // Extend
