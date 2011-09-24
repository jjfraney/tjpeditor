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

import org.jjflyboy.tjpeditor.project.Account;
import org.jjflyboy.tjpeditor.project.AccountAttribute;
import org.jjflyboy.tjpeditor.project.ProjectPackage;
import org.jjflyboy.tjpeditor.project.SupplementAccount;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supplement Account</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.SupplementAccountImpl#getAccount <em>Account</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.SupplementAccountImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SupplementAccountImpl extends GlobalAttributeImpl implements SupplementAccount
{
  /**
   * The cached value of the '{@link #getAccount() <em>Account</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccount()
   * @generated
   * @ordered
   */
  protected Account account;

  /**
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<AccountAttribute> attributes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SupplementAccountImpl()
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
    return ProjectPackage.eINSTANCE.getSupplementAccount();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Account getAccount()
  {
    if (account != null && account.eIsProxy())
    {
      InternalEObject oldAccount = (InternalEObject)account;
      account = (Account)eResolveProxy(oldAccount);
      if (account != oldAccount)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjectPackage.SUPPLEMENT_ACCOUNT__ACCOUNT, oldAccount, account));
      }
    }
    return account;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Account basicGetAccount()
  {
    return account;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAccount(Account newAccount)
  {
    Account oldAccount = account;
    account = newAccount;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.SUPPLEMENT_ACCOUNT__ACCOUNT, oldAccount, account));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AccountAttribute> getAttributes()
  {
    if (attributes == null)
    {
      attributes = new EObjectContainmentEList<AccountAttribute>(AccountAttribute.class, this, ProjectPackage.SUPPLEMENT_ACCOUNT__ATTRIBUTES);
    }
    return attributes;
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
      case ProjectPackage.SUPPLEMENT_ACCOUNT__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
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
      case ProjectPackage.SUPPLEMENT_ACCOUNT__ACCOUNT:
        if (resolve) return getAccount();
        return basicGetAccount();
      case ProjectPackage.SUPPLEMENT_ACCOUNT__ATTRIBUTES:
        return getAttributes();
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
      case ProjectPackage.SUPPLEMENT_ACCOUNT__ACCOUNT:
        setAccount((Account)newValue);
        return;
      case ProjectPackage.SUPPLEMENT_ACCOUNT__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends AccountAttribute>)newValue);
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
      case ProjectPackage.SUPPLEMENT_ACCOUNT__ACCOUNT:
        setAccount((Account)null);
        return;
      case ProjectPackage.SUPPLEMENT_ACCOUNT__ATTRIBUTES:
        getAttributes().clear();
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
      case ProjectPackage.SUPPLEMENT_ACCOUNT__ACCOUNT:
        return account != null;
      case ProjectPackage.SUPPLEMENT_ACCOUNT__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SupplementAccountImpl
