/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alert</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Alert#getLevel <em>Level</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getAlert()
 * @model
 * @generated
 */
public interface Alert extends EObject
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
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getAlert_Level()
   * @model
   * @generated
   */
  AlertLevel getLevel();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Alert#getLevel <em>Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Level</em>' attribute.
   * @see org.jjflyboy.tjpeditor.project.AlertLevel
   * @see #getLevel()
   * @generated
   */
  void setLevel(AlertLevel value);

} // Alert
