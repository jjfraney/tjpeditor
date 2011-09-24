/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.jjflyboy.tjpeditor.project.Charge;
import org.jjflyboy.tjpeditor.project.ChargeApplies;
import org.jjflyboy.tjpeditor.project.ProjectPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Charge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.ChargeImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.ChargeImpl#getApplies <em>Applies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChargeImpl extends TaskAttributeImpl implements Charge
{
  /**
   * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAmount()
   * @generated
   * @ordered
   */
  protected static final float AMOUNT_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAmount()
   * @generated
   * @ordered
   */
  protected float amount = AMOUNT_EDEFAULT;

  /**
   * The default value of the '{@link #getApplies() <em>Applies</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getApplies()
   * @generated
   * @ordered
   */
  protected static final ChargeApplies APPLIES_EDEFAULT = ChargeApplies.ONSTART;

  /**
   * The cached value of the '{@link #getApplies() <em>Applies</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getApplies()
   * @generated
   * @ordered
   */
  protected ChargeApplies applies = APPLIES_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ChargeImpl()
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
    return ProjectPackage.eINSTANCE.getCharge();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public float getAmount()
  {
    return amount;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAmount(float newAmount)
  {
    float oldAmount = amount;
    amount = newAmount;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.CHARGE__AMOUNT, oldAmount, amount));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChargeApplies getApplies()
  {
    return applies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setApplies(ChargeApplies newApplies)
  {
    ChargeApplies oldApplies = applies;
    applies = newApplies == null ? APPLIES_EDEFAULT : newApplies;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.CHARGE__APPLIES, oldApplies, applies));
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
      case ProjectPackage.CHARGE__AMOUNT:
        return getAmount();
      case ProjectPackage.CHARGE__APPLIES:
        return getApplies();
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
      case ProjectPackage.CHARGE__AMOUNT:
        setAmount((Float)newValue);
        return;
      case ProjectPackage.CHARGE__APPLIES:
        setApplies((ChargeApplies)newValue);
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
      case ProjectPackage.CHARGE__AMOUNT:
        setAmount(AMOUNT_EDEFAULT);
        return;
      case ProjectPackage.CHARGE__APPLIES:
        setApplies(APPLIES_EDEFAULT);
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
      case ProjectPackage.CHARGE__AMOUNT:
        return amount != AMOUNT_EDEFAULT;
      case ProjectPackage.CHARGE__APPLIES:
        return applies != APPLIES_EDEFAULT;
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
    result.append(" (amount: ");
    result.append(amount);
    result.append(", applies: ");
    result.append(applies);
    result.append(')');
    return result.toString();
  }

} //ChargeImpl
