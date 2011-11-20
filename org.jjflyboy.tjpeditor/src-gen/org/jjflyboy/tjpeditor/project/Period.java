/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Period</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Period#getPeriod <em>Period</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getPeriod()
 * @model
 * @generated
 */
public interface Period extends TaskAttribute, ReportAttribute, ExportAttribute, NikuReportAttribute, StatusSheetReportAttribute, ColumnAttribute, TimesheetReportAttribute
{
  /**
   * Returns the value of the '<em><b>Period</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Period</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Period</em>' containment reference.
   * @see #setPeriod(Interval2)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getPeriod_Period()
   * @model containment="true"
   * @generated
   */
  Interval2 getPeriod();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Period#getPeriod <em>Period</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Period</em>' containment reference.
   * @see #getPeriod()
   * @generated
   */
  void setPeriod(Interval2 value);

} // Period
