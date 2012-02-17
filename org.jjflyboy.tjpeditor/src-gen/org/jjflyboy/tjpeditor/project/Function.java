/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Function#getLevel <em>Level</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Function#getDate <em>Date</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Function#getScenario <em>Scenario</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Function#getParentId <em>Parent Id</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Function#getTask <em>Task</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Function#getDistance <em>Distance</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Function#getResource <em>Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends EObject
{
  /**
   * Returns the value of the '<em><b>Level</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Level</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Level</em>' attribute.
   * @see #setLevel(int)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getFunction_Level()
   * @model
   * @generated
   */
  int getLevel();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Function#getLevel <em>Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Level</em>' attribute.
   * @see #getLevel()
   * @generated
   */
  void setLevel(int value);

  /**
   * Returns the value of the '<em><b>Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Date</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Date</em>' attribute.
   * @see #setDate(String)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getFunction_Date()
   * @model
   * @generated
   */
  String getDate();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Function#getDate <em>Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Date</em>' attribute.
   * @see #getDate()
   * @generated
   */
  void setDate(String value);

  /**
   * Returns the value of the '<em><b>Scenario</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scenario</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scenario</em>' reference.
   * @see #setScenario(Scenario)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getFunction_Scenario()
   * @model
   * @generated
   */
  Scenario getScenario();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Function#getScenario <em>Scenario</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scenario</em>' reference.
   * @see #getScenario()
   * @generated
   */
  void setScenario(Scenario value);

  /**
   * Returns the value of the '<em><b>Parent Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent Id</em>' attribute.
   * @see #setParentId(String)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getFunction_ParentId()
   * @model
   * @generated
   */
  String getParentId();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Function#getParentId <em>Parent Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent Id</em>' attribute.
   * @see #getParentId()
   * @generated
   */
  void setParentId(String value);

  /**
   * Returns the value of the '<em><b>Task</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Task</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Task</em>' reference.
   * @see #setTask(Task)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getFunction_Task()
   * @model
   * @generated
   */
  Task getTask();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Function#getTask <em>Task</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Task</em>' reference.
   * @see #getTask()
   * @generated
   */
  void setTask(Task value);

  /**
   * Returns the value of the '<em><b>Distance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Distance</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Distance</em>' attribute.
   * @see #setDistance(int)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getFunction_Distance()
   * @model
   * @generated
   */
  int getDistance();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Function#getDistance <em>Distance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Distance</em>' attribute.
   * @see #getDistance()
   * @generated
   */
  void setDistance(int value);

  /**
   * Returns the value of the '<em><b>Resource</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resource</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resource</em>' reference.
   * @see #setResource(Resource)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getFunction_Resource()
   * @model
   * @generated
   */
  Resource getResource();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Function#getResource <em>Resource</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Resource</em>' reference.
   * @see #getResource()
   * @generated
   */
  void setResource(Resource value);

} // Function
