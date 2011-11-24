/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Report Prefix</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.ReportPrefix#getReport <em>Report</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getReportPrefix()
 * @model
 * @generated
 */
public interface ReportPrefix extends IncludePropertiesAttribute
{
  /**
   * Returns the value of the '<em><b>Report</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Report</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Report</em>' reference.
   * @see #setReport(Report)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getReportPrefix_Report()
   * @model
   * @generated
   */
  Report getReport();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.ReportPrefix#getReport <em>Report</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Report</em>' reference.
   * @see #getReport()
   * @generated
   */
  void setReport(Report value);

} // ReportPrefix
