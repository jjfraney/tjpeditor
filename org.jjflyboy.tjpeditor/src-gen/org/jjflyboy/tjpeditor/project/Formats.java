/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formats</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Formats#getFormats <em>Formats</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getFormats()
 * @model
 * @generated
 */
public interface Formats extends ReportAttribute, NikuReportAttribute
{
  /**
   * Returns the value of the '<em><b>Formats</b></em>' attribute list.
   * The list contents are of type {@link org.jjflyboy.tjpeditor.project.ReportFormat}.
   * The literals are from the enumeration {@link org.jjflyboy.tjpeditor.project.ReportFormat}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Formats</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Formats</em>' attribute list.
   * @see org.jjflyboy.tjpeditor.project.ReportFormat
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getFormats_Formats()
   * @model unique="false"
   * @generated
   */
  EList<ReportFormat> getFormats();

} // Formats
