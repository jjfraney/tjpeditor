/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Limit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Limit#getValue <em>Value</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Limit#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Limit#getEnd <em>End</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Limit#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Limit#getResources <em>Resources</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getLimit()
 * @model
 * @generated
 */
public interface Limit extends Maximum, Minimum, MonthlyMax, MonthlyMin, WeeklyMax, WeeklyMin
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(float)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getLimit_Value()
   * @model
   * @generated
   */
  float getValue();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Limit#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(float value);

  /**
   * Returns the value of the '<em><b>Unit</b></em>' attribute.
   * The literals are from the enumeration {@link org.jjflyboy.tjpeditor.project.TimeUnit}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unit</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unit</em>' attribute.
   * @see org.jjflyboy.tjpeditor.project.TimeUnit
   * @see #setUnit(TimeUnit)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getLimit_Unit()
   * @model
   * @generated
   */
  TimeUnit getUnit();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Limit#getUnit <em>Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unit</em>' attribute.
   * @see org.jjflyboy.tjpeditor.project.TimeUnit
   * @see #getUnit()
   * @generated
   */
  void setUnit(TimeUnit value);

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
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getLimit_End()
   * @model
   * @generated
   */
  String getEnd();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Limit#getEnd <em>End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End</em>' attribute.
   * @see #getEnd()
   * @generated
   */
  void setEnd(String value);

  /**
   * Returns the value of the '<em><b>Period</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Period</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Period</em>' containment reference.
   * @see #setPeriod(Interval1)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getLimit_Period()
   * @model containment="true"
   * @generated
   */
  Interval1 getPeriod();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Limit#getPeriod <em>Period</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Period</em>' containment reference.
   * @see #getPeriod()
   * @generated
   */
  void setPeriod(Interval1 value);

  /**
   * Returns the value of the '<em><b>Resources</b></em>' reference list.
   * The list contents are of type {@link org.jjflyboy.tjpeditor.project.Resource}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resources</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resources</em>' reference list.
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getLimit_Resources()
   * @model
   * @generated
   */
  EList<Resource> getResources();

} // Limit
