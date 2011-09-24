/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Weekdays</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Weekdays#getFirst <em>First</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Weekdays#getLast <em>Last</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getWeekdays()
 * @model
 * @generated
 */
public interface Weekdays extends EObject
{
  /**
   * Returns the value of the '<em><b>First</b></em>' attribute.
   * The literals are from the enumeration {@link org.jjflyboy.tjpeditor.project.Weekday}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>First</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>First</em>' attribute.
   * @see org.jjflyboy.tjpeditor.project.Weekday
   * @see #setFirst(Weekday)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getWeekdays_First()
   * @model
   * @generated
   */
  Weekday getFirst();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Weekdays#getFirst <em>First</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First</em>' attribute.
   * @see org.jjflyboy.tjpeditor.project.Weekday
   * @see #getFirst()
   * @generated
   */
  void setFirst(Weekday value);

  /**
   * Returns the value of the '<em><b>Last</b></em>' attribute.
   * The literals are from the enumeration {@link org.jjflyboy.tjpeditor.project.Weekday}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Last</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Last</em>' attribute.
   * @see org.jjflyboy.tjpeditor.project.Weekday
   * @see #setLast(Weekday)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getWeekdays_Last()
   * @model
   * @generated
   */
  Weekday getLast();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Weekdays#getLast <em>Last</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Last</em>' attribute.
   * @see org.jjflyboy.tjpeditor.project.Weekday
   * @see #getLast()
   * @generated
   */
  void setLast(Weekday value);

} // Weekdays
