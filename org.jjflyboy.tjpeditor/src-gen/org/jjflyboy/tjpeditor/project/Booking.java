/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Booking#getInterval <em>Interval</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Booking#getOvertime <em>Overtime</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Booking#getSloppy <em>Sloppy</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getBooking()
 * @model
 * @generated
 */
public interface Booking extends EObject
{
  /**
   * Returns the value of the '<em><b>Interval</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interval</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interval</em>' containment reference.
   * @see #setInterval(Interval4)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getBooking_Interval()
   * @model containment="true"
   * @generated
   */
  Interval4 getInterval();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Booking#getInterval <em>Interval</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interval</em>' containment reference.
   * @see #getInterval()
   * @generated
   */
  void setInterval(Interval4 value);

  /**
   * Returns the value of the '<em><b>Overtime</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Overtime</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Overtime</em>' attribute.
   * @see #setOvertime(int)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getBooking_Overtime()
   * @model
   * @generated
   */
  int getOvertime();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Booking#getOvertime <em>Overtime</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Overtime</em>' attribute.
   * @see #getOvertime()
   * @generated
   */
  void setOvertime(int value);

  /**
   * Returns the value of the '<em><b>Sloppy</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sloppy</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sloppy</em>' attribute.
   * @see #setSloppy(int)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getBooking_Sloppy()
   * @model
   * @generated
   */
  int getSloppy();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Booking#getSloppy <em>Sloppy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sloppy</em>' attribute.
   * @see #getSloppy()
   * @generated
   */
  void setSloppy(int value);

} // Booking
