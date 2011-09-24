/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Week Starts</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.WeekStarts#isSunday <em>Sunday</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.WeekStarts#isMonday <em>Monday</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getWeekStarts()
 * @model
 * @generated
 */
public interface WeekStarts extends ProjectAttribute
{
  /**
   * Returns the value of the '<em><b>Sunday</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sunday</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sunday</em>' attribute.
   * @see #setSunday(boolean)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getWeekStarts_Sunday()
   * @model
   * @generated
   */
  boolean isSunday();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.WeekStarts#isSunday <em>Sunday</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sunday</em>' attribute.
   * @see #isSunday()
   * @generated
   */
  void setSunday(boolean value);

  /**
   * Returns the value of the '<em><b>Monday</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Monday</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Monday</em>' attribute.
   * @see #setMonday(boolean)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getWeekStarts_Monday()
   * @model
   * @generated
   */
  boolean isMonday();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.WeekStarts#isMonday <em>Monday</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Monday</em>' attribute.
   * @see #isMonday()
   * @generated
   */
  void setMonday(boolean value);

} // WeekStarts
