/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sort Journal Entries</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.SortJournalEntries#getCriteria <em>Criteria</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getSortJournalEntries()
 * @model
 * @generated
 */
public interface SortJournalEntries extends EObject
{
  /**
   * Returns the value of the '<em><b>Criteria</b></em>' attribute list.
   * The list contents are of type {@link org.jjflyboy.tjpeditor.project.JournalEntrySortCriterion}.
   * The literals are from the enumeration {@link org.jjflyboy.tjpeditor.project.JournalEntrySortCriterion}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Criteria</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Criteria</em>' attribute list.
   * @see org.jjflyboy.tjpeditor.project.JournalEntrySortCriterion
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getSortJournalEntries_Criteria()
   * @model unique="false"
   * @generated
   */
  EList<JournalEntrySortCriterion> getCriteria();

} // SortJournalEntries
