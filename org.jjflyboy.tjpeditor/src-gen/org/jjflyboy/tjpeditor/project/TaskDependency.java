/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.TaskDependency#getTask <em>Task</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.TaskDependency#getGapDuration <em>Gap Duration</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.TaskDependency#getGapLength <em>Gap Length</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.TaskDependency#getPolicy <em>Policy</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getTaskDependency()
 * @model
 * @generated
 */
public interface TaskDependency extends Depends, Precedes
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
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getTaskDependency_Task()
   * @model
   * @generated
   */
  Task getTask();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.TaskDependency#getTask <em>Task</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Task</em>' reference.
   * @see #getTask()
   * @generated
   */
  void setTask(Task value);

  /**
   * Returns the value of the '<em><b>Gap Duration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Gap Duration</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gap Duration</em>' containment reference.
   * @see #setGapDuration(GapDuration)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getTaskDependency_GapDuration()
   * @model containment="true"
   * @generated
   */
  GapDuration getGapDuration();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.TaskDependency#getGapDuration <em>Gap Duration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Gap Duration</em>' containment reference.
   * @see #getGapDuration()
   * @generated
   */
  void setGapDuration(GapDuration value);

  /**
   * Returns the value of the '<em><b>Gap Length</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Gap Length</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gap Length</em>' containment reference.
   * @see #setGapLength(GapLength)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getTaskDependency_GapLength()
   * @model containment="true"
   * @generated
   */
  GapLength getGapLength();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.TaskDependency#getGapLength <em>Gap Length</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Gap Length</em>' containment reference.
   * @see #getGapLength()
   * @generated
   */
  void setGapLength(GapLength value);

  /**
   * Returns the value of the '<em><b>Policy</b></em>' attribute.
   * The literals are from the enumeration {@link org.jjflyboy.tjpeditor.project.DependsPolicy}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Policy</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Policy</em>' attribute.
   * @see org.jjflyboy.tjpeditor.project.DependsPolicy
   * @see #setPolicy(DependsPolicy)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getTaskDependency_Policy()
   * @model
   * @generated
   */
  DependsPolicy getPolicy();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.TaskDependency#getPolicy <em>Policy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Policy</em>' attribute.
   * @see org.jjflyboy.tjpeditor.project.DependsPolicy
   * @see #getPolicy()
   * @generated
   */
  void setPolicy(DependsPolicy value);

} // TaskDependency
