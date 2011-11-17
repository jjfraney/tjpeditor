/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Purge Report</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.PurgeReport#getListAttribute <em>List Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getPurgeReport()
 * @model
 * @generated
 */
public interface PurgeReport extends ReportAttribute
{
  /**
   * Returns the value of the '<em><b>List Attribute</b></em>' attribute.
   * The literals are from the enumeration {@link org.jjflyboy.tjpeditor.project.PurgeReportAttribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>List Attribute</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>List Attribute</em>' attribute.
   * @see org.jjflyboy.tjpeditor.project.PurgeReportAttribute
   * @see #setListAttribute(PurgeReportAttribute)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getPurgeReport_ListAttribute()
   * @model
   * @generated
   */
  PurgeReportAttribute getListAttribute();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.PurgeReport#getListAttribute <em>List Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>List Attribute</em>' attribute.
   * @see org.jjflyboy.tjpeditor.project.PurgeReportAttribute
   * @see #getListAttribute()
   * @generated
   */
  void setListAttribute(PurgeReportAttribute value);

} // PurgeReport
