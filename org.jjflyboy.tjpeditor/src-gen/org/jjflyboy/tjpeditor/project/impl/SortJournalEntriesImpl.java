/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.jjflyboy.tjpeditor.project.JournalEntrySortCriterion;
import org.jjflyboy.tjpeditor.project.ProjectPackage;
import org.jjflyboy.tjpeditor.project.SortJournalEntries;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sort Journal Entries</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.SortJournalEntriesImpl#getCriteria <em>Criteria</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SortJournalEntriesImpl extends MinimalEObjectImpl.Container implements SortJournalEntries
{
  /**
   * The cached value of the '{@link #getCriteria() <em>Criteria</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCriteria()
   * @generated
   * @ordered
   */
  protected EList<JournalEntrySortCriterion> criteria;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SortJournalEntriesImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ProjectPackage.eINSTANCE.getSortJournalEntries();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<JournalEntrySortCriterion> getCriteria()
  {
    if (criteria == null)
    {
      criteria = new EDataTypeEList<JournalEntrySortCriterion>(JournalEntrySortCriterion.class, this, ProjectPackage.SORT_JOURNAL_ENTRIES__CRITERIA);
    }
    return criteria;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ProjectPackage.SORT_JOURNAL_ENTRIES__CRITERIA:
        return getCriteria();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ProjectPackage.SORT_JOURNAL_ENTRIES__CRITERIA:
        getCriteria().clear();
        getCriteria().addAll((Collection<? extends JournalEntrySortCriterion>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ProjectPackage.SORT_JOURNAL_ENTRIES__CRITERIA:
        getCriteria().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ProjectPackage.SORT_JOURNAL_ENTRIES__CRITERIA:
        return criteria != null && !criteria.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (criteria: ");
    result.append(criteria);
    result.append(')');
    return result.toString();
  }

} //SortJournalEntriesImpl
