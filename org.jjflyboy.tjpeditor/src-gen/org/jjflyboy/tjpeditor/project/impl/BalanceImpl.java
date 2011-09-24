/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.jjflyboy.tjpeditor.project.Account;
import org.jjflyboy.tjpeditor.project.Balance;
import org.jjflyboy.tjpeditor.project.ProjectPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Balance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.BalanceImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.BalanceImpl#getRevenue <em>Revenue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BalanceImpl extends GlobalAttributeImpl implements Balance
{
  /**
   * The cached value of the '{@link #getCost() <em>Cost</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCost()
   * @generated
   * @ordered
   */
  protected Account cost;

  /**
   * The cached value of the '{@link #getRevenue() <em>Revenue</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRevenue()
   * @generated
   * @ordered
   */
  protected Account revenue;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BalanceImpl()
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
    return ProjectPackage.eINSTANCE.getBalance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Account getCost()
  {
    if (cost != null && cost.eIsProxy())
    {
      InternalEObject oldCost = (InternalEObject)cost;
      cost = (Account)eResolveProxy(oldCost);
      if (cost != oldCost)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjectPackage.BALANCE__COST, oldCost, cost));
      }
    }
    return cost;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Account basicGetCost()
  {
    return cost;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCost(Account newCost)
  {
    Account oldCost = cost;
    cost = newCost;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.BALANCE__COST, oldCost, cost));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Account getRevenue()
  {
    if (revenue != null && revenue.eIsProxy())
    {
      InternalEObject oldRevenue = (InternalEObject)revenue;
      revenue = (Account)eResolveProxy(oldRevenue);
      if (revenue != oldRevenue)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjectPackage.BALANCE__REVENUE, oldRevenue, revenue));
      }
    }
    return revenue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Account basicGetRevenue()
  {
    return revenue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRevenue(Account newRevenue)
  {
    Account oldRevenue = revenue;
    revenue = newRevenue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.BALANCE__REVENUE, oldRevenue, revenue));
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
      case ProjectPackage.BALANCE__COST:
        if (resolve) return getCost();
        return basicGetCost();
      case ProjectPackage.BALANCE__REVENUE:
        if (resolve) return getRevenue();
        return basicGetRevenue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ProjectPackage.BALANCE__COST:
        setCost((Account)newValue);
        return;
      case ProjectPackage.BALANCE__REVENUE:
        setRevenue((Account)newValue);
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
      case ProjectPackage.BALANCE__COST:
        setCost((Account)null);
        return;
      case ProjectPackage.BALANCE__REVENUE:
        setRevenue((Account)null);
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
      case ProjectPackage.BALANCE__COST:
        return cost != null;
      case ProjectPackage.BALANCE__REVENUE:
        return revenue != null;
    }
    return super.eIsSet(featureID);
  }

} //BalanceImpl
