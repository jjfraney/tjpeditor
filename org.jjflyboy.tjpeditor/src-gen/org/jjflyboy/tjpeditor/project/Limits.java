/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Limits</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Limits#getDailymax <em>Dailymax</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Limits#getDailymin <em>Dailymin</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Limits#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Limits#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Limits#getMonthlymax <em>Monthlymax</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Limits#getMonthlymin <em>Monthlymin</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Limits#getWeeklymax <em>Weeklymax</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Limits#getWeeklymin <em>Weeklymin</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getLimits()
 * @model
 * @generated
 */
public interface Limits extends GlobalAttribute, TaskAttribute, ResourceAttribute, AllocateResourceAttribute
{
  /**
   * Returns the value of the '<em><b>Dailymax</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dailymax</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dailymax</em>' containment reference.
   * @see #setDailymax(Limit)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getLimits_Dailymax()
   * @model containment="true"
   * @generated
   */
  Limit getDailymax();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Limits#getDailymax <em>Dailymax</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dailymax</em>' containment reference.
   * @see #getDailymax()
   * @generated
   */
  void setDailymax(Limit value);

  /**
   * Returns the value of the '<em><b>Dailymin</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dailymin</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dailymin</em>' containment reference.
   * @see #setDailymin(Limit)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getLimits_Dailymin()
   * @model containment="true"
   * @generated
   */
  Limit getDailymin();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Limits#getDailymin <em>Dailymin</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dailymin</em>' containment reference.
   * @see #getDailymin()
   * @generated
   */
  void setDailymin(Limit value);

  /**
   * Returns the value of the '<em><b>Maximum</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Maximum</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Maximum</em>' containment reference.
   * @see #setMaximum(Maximum)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getLimits_Maximum()
   * @model containment="true"
   * @generated
   */
  Maximum getMaximum();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Limits#getMaximum <em>Maximum</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Maximum</em>' containment reference.
   * @see #getMaximum()
   * @generated
   */
  void setMaximum(Maximum value);

  /**
   * Returns the value of the '<em><b>Minimum</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Minimum</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Minimum</em>' containment reference.
   * @see #setMinimum(Minimum)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getLimits_Minimum()
   * @model containment="true"
   * @generated
   */
  Minimum getMinimum();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Limits#getMinimum <em>Minimum</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Minimum</em>' containment reference.
   * @see #getMinimum()
   * @generated
   */
  void setMinimum(Minimum value);

  /**
   * Returns the value of the '<em><b>Monthlymax</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Monthlymax</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Monthlymax</em>' containment reference.
   * @see #setMonthlymax(MonthlyMax)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getLimits_Monthlymax()
   * @model containment="true"
   * @generated
   */
  MonthlyMax getMonthlymax();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Limits#getMonthlymax <em>Monthlymax</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Monthlymax</em>' containment reference.
   * @see #getMonthlymax()
   * @generated
   */
  void setMonthlymax(MonthlyMax value);

  /**
   * Returns the value of the '<em><b>Monthlymin</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Monthlymin</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Monthlymin</em>' containment reference.
   * @see #setMonthlymin(MonthlyMin)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getLimits_Monthlymin()
   * @model containment="true"
   * @generated
   */
  MonthlyMin getMonthlymin();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Limits#getMonthlymin <em>Monthlymin</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Monthlymin</em>' containment reference.
   * @see #getMonthlymin()
   * @generated
   */
  void setMonthlymin(MonthlyMin value);

  /**
   * Returns the value of the '<em><b>Weeklymax</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Weeklymax</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Weeklymax</em>' containment reference.
   * @see #setWeeklymax(WeeklyMax)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getLimits_Weeklymax()
   * @model containment="true"
   * @generated
   */
  WeeklyMax getWeeklymax();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Limits#getWeeklymax <em>Weeklymax</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Weeklymax</em>' containment reference.
   * @see #getWeeklymax()
   * @generated
   */
  void setWeeklymax(WeeklyMax value);

  /**
   * Returns the value of the '<em><b>Weeklymin</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Weeklymin</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Weeklymin</em>' containment reference.
   * @see #setWeeklymin(WeeklyMin)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getLimits_Weeklymin()
   * @model containment="true"
   * @generated
   */
  WeeklyMin getWeeklymin();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Limits#getWeeklymin <em>Weeklymin</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Weeklymin</em>' containment reference.
   * @see #getWeeklymin()
   * @generated
   */
  void setWeeklymin(WeeklyMin value);

} // Limits
