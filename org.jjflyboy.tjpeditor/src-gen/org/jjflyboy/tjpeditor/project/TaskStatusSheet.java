/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Status Sheet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.TaskStatusSheet#getTask <em>Task</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.TaskStatusSheet#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getTaskStatusSheet()
 * @model
 * @generated
 */
public interface TaskStatusSheet extends TaskStatusSheetAttribute
{
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
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getTaskStatusSheet_Task()
   * @model
   * @generated
   */
  Task getTask();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.TaskStatusSheet#getTask <em>Task</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Task</em>' reference.
   * @see #getTask()
   * @generated
   */
  void setTask(Task value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link org.jjflyboy.tjpeditor.project.TaskStatusSheetAttribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getTaskStatusSheet_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<TaskStatusSheetAttribute> getAttributes();

} // TaskStatusSheet
