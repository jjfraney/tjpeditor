/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shift</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Shift#getId <em>Id</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Shift#getName <em>Name</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Shift#getReplace <em>Replace</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Shift#getTimezone <em>Timezone</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Shift#getVacation <em>Vacation</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Shift#getShift <em>Shift</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Shift#getWorkingHours <em>Working Hours</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getShift()
 * @model
 * @generated
 */
public interface Shift extends Property
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
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getShift_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Shift#getId <em>Id</em>}' attribute.
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
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getShift_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Shift#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Replace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Replace</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Replace</em>' attribute.
   * @see #setReplace(String)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getShift_Replace()
   * @model
   * @generated
   */
  String getReplace();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Shift#getReplace <em>Replace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Replace</em>' attribute.
   * @see #getReplace()
   * @generated
   */
  void setReplace(String value);

  /**
   * Returns the value of the '<em><b>Timezone</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Timezone</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Timezone</em>' attribute.
   * @see #setTimezone(String)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getShift_Timezone()
   * @model
   * @generated
   */
  String getTimezone();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Shift#getTimezone <em>Timezone</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Timezone</em>' attribute.
   * @see #getTimezone()
   * @generated
   */
  void setTimezone(String value);

  /**
   * Returns the value of the '<em><b>Vacation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vacation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vacation</em>' containment reference.
   * @see #setVacation(Vacation)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getShift_Vacation()
   * @model containment="true"
   * @generated
   */
  Vacation getVacation();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Shift#getVacation <em>Vacation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vacation</em>' containment reference.
   * @see #getVacation()
   * @generated
   */
  void setVacation(Vacation value);

  /**
   * Returns the value of the '<em><b>Shift</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Shift</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Shift</em>' containment reference.
   * @see #setShift(Shift)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getShift_Shift()
   * @model containment="true"
   * @generated
   */
  Shift getShift();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Shift#getShift <em>Shift</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Shift</em>' containment reference.
   * @see #getShift()
   * @generated
   */
  void setShift(Shift value);

  /**
   * Returns the value of the '<em><b>Working Hours</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Working Hours</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Working Hours</em>' containment reference.
   * @see #setWorkingHours(WorkingHours)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getShift_WorkingHours()
   * @model containment="true"
   * @generated
   */
  WorkingHours getWorkingHours();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Shift#getWorkingHours <em>Working Hours</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Working Hours</em>' containment reference.
   * @see #getWorkingHours()
   * @generated
   */
  void setWorkingHours(WorkingHours value);

} // Shift
