/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.BookingResource#getTask <em>Task</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.BookingResource#getBooking <em>Booking</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getBookingResource()
 * @model
 * @generated
 */
public interface BookingResource extends ResourceAttribute
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
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getBookingResource_Task()
   * @model
   * @generated
   */
  Task getTask();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.BookingResource#getTask <em>Task</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Task</em>' reference.
   * @see #getTask()
   * @generated
   */
  void setTask(Task value);

  /**
   * Returns the value of the '<em><b>Booking</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Booking</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Booking</em>' containment reference.
   * @see #setBooking(Booking)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getBookingResource_Booking()
   * @model containment="true"
   * @generated
   */
  Booking getBooking();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.BookingResource#getBooking <em>Booking</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Booking</em>' containment reference.
   * @see #getBooking()
   * @generated
   */
  void setBooking(Booking value);

} // BookingResource
