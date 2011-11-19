/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.jjflyboy.tjpeditor.project.Criterion;
import org.jjflyboy.tjpeditor.project.ProjectPackage;
import org.jjflyboy.tjpeditor.project.Sort;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sort</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.SortImpl#isTree <em>Tree</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.SortImpl#getCriteria <em>Criteria</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SortImpl extends SortAccountsImpl implements Sort
{
  /**
   * The default value of the '{@link #isTree() <em>Tree</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTree()
   * @generated
   * @ordered
   */
  protected static final boolean TREE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isTree() <em>Tree</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTree()
   * @generated
   * @ordered
   */
  protected boolean tree = TREE_EDEFAULT;

  /**
   * The cached value of the '{@link #getCriteria() <em>Criteria</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCriteria()
   * @generated
   * @ordered
   */
  protected EList<Criterion> criteria;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SortImpl()
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
    return ProjectPackage.eINSTANCE.getSort();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isTree()
  {
    return tree;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTree(boolean newTree)
  {
    boolean oldTree = tree;
    tree = newTree;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.SORT__TREE, oldTree, tree));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Criterion> getCriteria()
  {
    if (criteria == null)
    {
      criteria = new EObjectContainmentEList<Criterion>(Criterion.class, this, ProjectPackage.SORT__CRITERIA);
    }
    return criteria;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ProjectPackage.SORT__CRITERIA:
        return ((InternalEList<?>)getCriteria()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case ProjectPackage.SORT__TREE:
        return isTree();
      case ProjectPackage.SORT__CRITERIA:
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
      case ProjectPackage.SORT__TREE:
        setTree((Boolean)newValue);
        return;
      case ProjectPackage.SORT__CRITERIA:
        getCriteria().clear();
        getCriteria().addAll((Collection<? extends Criterion>)newValue);
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
      case ProjectPackage.SORT__TREE:
        setTree(TREE_EDEFAULT);
        return;
      case ProjectPackage.SORT__CRITERIA:
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
      case ProjectPackage.SORT__TREE:
        return tree != TREE_EDEFAULT;
      case ProjectPackage.SORT__CRITERIA:
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
    result.append(" (tree: ");
    result.append(tree);
    result.append(')');
    return result.toString();
  }

} //SortImpl
