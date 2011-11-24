/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Export</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Export#getId <em>Id</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Export#getFilename <em>Filename</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Export#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getExport()
 * @model
 * @generated
 */
public interface Export extends Property
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getExport_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Export#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Filename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Filename</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Filename</em>' attribute.
   * @see #setFilename(String)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getExport_Filename()
   * @model
   * @generated
   */
  String getFilename();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Export#getFilename <em>Filename</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Filename</em>' attribute.
   * @see #getFilename()
   * @generated
   */
  void setFilename(String value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link org.jjflyboy.tjpeditor.project.ExportAttribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getExport_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<ExportAttribute> getAttributes();

} // Export
