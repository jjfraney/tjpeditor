/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Status Timesheet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.StatusTimesheet#getLevel <em>Level</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.StatusTimesheet#getText <em>Text</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.StatusTimesheet#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getStatusTimesheet()
 * @model
 * @generated
 */
public interface StatusTimesheet extends TaskTimesheetAttribute, TimesheetAttribute
{
  /**
   * Returns the value of the '<em><b>Level</b></em>' attribute.
   * The literals are from the enumeration {@link org.jjflyboy.tjpeditor.project.AlertLevel}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Level</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Level</em>' attribute.
   * @see org.jjflyboy.tjpeditor.project.AlertLevel
   * @see #setLevel(AlertLevel)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getStatusTimesheet_Level()
   * @model
   * @generated
   */
  AlertLevel getLevel();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.StatusTimesheet#getLevel <em>Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Level</em>' attribute.
   * @see org.jjflyboy.tjpeditor.project.AlertLevel
   * @see #getLevel()
   * @generated
   */
  void setLevel(AlertLevel value);

  /**
   * Returns the value of the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' attribute.
   * @see #setText(String)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getStatusTimesheet_Text()
   * @model
   * @generated
   */
  String getText();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.StatusTimesheet#getText <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' attribute.
   * @see #getText()
   * @generated
   */
  void setText(String value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link org.jjflyboy.tjpeditor.project.StatusTimesheetAttribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getStatusTimesheet_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<StatusTimesheetAttribute> getAttributes();

} // StatusTimesheet
