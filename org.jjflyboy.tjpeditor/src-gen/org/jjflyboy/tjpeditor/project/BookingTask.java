/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.BookingTask#getResource <em>Resource</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.BookingTask#getBooking <em>Booking</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getBookingTask()
 * @model
 * @generated
 */
public interface BookingTask extends TaskAttribute
{
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
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getBookingTask_Resource()
   * @model
   * @generated
   */
  Resource getResource();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.BookingTask#getResource <em>Resource</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Resource</em>' reference.
   * @see #getResource()
   * @generated
   */
  void setResource(Resource value);

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
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getBookingTask_Booking()
   * @model containment="true"
   * @generated
   */
  Booking getBooking();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.BookingTask#getBooking <em>Booking</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Booking</em>' containment reference.
   * @see #getBooking()
   * @generated
   */
  void setBooking(Booking value);

} // BookingTask
