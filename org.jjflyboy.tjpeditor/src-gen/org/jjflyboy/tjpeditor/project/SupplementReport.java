/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supplement Report</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.SupplementReport#getReport <em>Report</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.SupplementReport#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getSupplementReport()
 * @model
 * @generated
 */
public interface SupplementReport extends Property
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
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getSupplementReport_Report()
   * @model
   * @generated
   */
  Report getReport();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.SupplementReport#getReport <em>Report</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Report</em>' reference.
   * @see #getReport()
   * @generated
   */
  void setReport(Report value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link org.jjflyboy.tjpeditor.project.ReportAttribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getSupplementReport_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<ReportAttribute> getAttributes();

} // SupplementReport
