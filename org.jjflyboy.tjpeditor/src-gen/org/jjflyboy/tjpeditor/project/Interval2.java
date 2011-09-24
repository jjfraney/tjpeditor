/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interval2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Interval2#getStart <em>Start</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Interval2#getEnd <em>End</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Interval2#getDuration <em>Duration</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getInterval2()
 * @model
 * @generated
 */
public interface Interval2 extends EObject
{
  /**
   * Returns the value of the '<em><b>Start</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Start</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start</em>' attribute.
   * @see #setStart(String)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getInterval2_Start()
   * @model
   * @generated
   */
  String getStart();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Interval2#getStart <em>Start</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start</em>' attribute.
   * @see #getStart()
   * @generated
   */
  void setStart(String value);

  /**
   * Returns the value of the '<em><b>End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End</em>' attribute.
   * @see #setEnd(String)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getInterval2_End()
   * @model
   * @generated
   */
  String getEnd();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Interval2#getEnd <em>End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End</em>' attribute.
   * @see #getEnd()
   * @generated
   */
  void setEnd(String value);

  /**
   * Returns the value of the '<em><b>Duration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Duration</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Duration</em>' containment reference.
   * @see #setDuration(DurationQuantity)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getInterval2_Duration()
   * @model containment="true"
   * @generated
   */
  DurationQuantity getDuration();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Interval2#getDuration <em>Duration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Duration</em>' containment reference.
   * @see #getDuration()
   * @generated
   */
  void setDuration(DurationQuantity value);

} // Interval2
