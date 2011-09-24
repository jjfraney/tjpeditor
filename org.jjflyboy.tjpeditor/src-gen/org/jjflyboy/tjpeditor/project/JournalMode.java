/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Journal Mode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.JournalMode#getMode <em>Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getJournalMode()
 * @model
 * @generated
 */
public interface JournalMode extends EObject
{
  /**
   * Returns the value of the '<em><b>Mode</b></em>' attribute.
   * The literals are from the enumeration {@link org.jjflyboy.tjpeditor.project.JournalModeValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mode</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mode</em>' attribute.
   * @see org.jjflyboy.tjpeditor.project.JournalModeValue
   * @see #setMode(JournalModeValue)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getJournalMode_Mode()
   * @model
   * @generated
   */
  JournalModeValue getMode();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.JournalMode#getMode <em>Mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mode</em>' attribute.
   * @see org.jjflyboy.tjpeditor.project.JournalModeValue
   * @see #getMode()
   * @generated
   */
  void setMode(JournalModeValue value);

} // JournalMode
