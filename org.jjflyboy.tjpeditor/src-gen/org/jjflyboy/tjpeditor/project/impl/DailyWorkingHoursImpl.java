/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.jjflyboy.tjpeditor.project.DailyWorkingHours;
import org.jjflyboy.tjpeditor.project.ProjectPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Daily Working Hours</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.DailyWorkingHoursImpl#getDailyWorkingHours <em>Daily Working Hours</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DailyWorkingHoursImpl extends ProjectAttributeImpl implements DailyWorkingHours
{
  /**
   * The default value of the '{@link #getDailyWorkingHours() <em>Daily Working Hours</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDailyWorkingHours()
   * @generated
   * @ordered
   */
  protected static final float DAILY_WORKING_HOURS_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getDailyWorkingHours() <em>Daily Working Hours</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDailyWorkingHours()
   * @generated
   * @ordered
   */
  protected float dailyWorkingHours = DAILY_WORKING_HOURS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DailyWorkingHoursImpl()
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
    return ProjectPackage.eINSTANCE.getDailyWorkingHours();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public float getDailyWorkingHours()
  {
    return dailyWorkingHours;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDailyWorkingHours(float newDailyWorkingHours)
  {
    float oldDailyWorkingHours = dailyWorkingHours;
    dailyWorkingHours = newDailyWorkingHours;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.DAILY_WORKING_HOURS__DAILY_WORKING_HOURS, oldDailyWorkingHours, dailyWorkingHours));
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
      case ProjectPackage.DAILY_WORKING_HOURS__DAILY_WORKING_HOURS:
        return getDailyWorkingHours();
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
      case ProjectPackage.DAILY_WORKING_HOURS__DAILY_WORKING_HOURS:
        setDailyWorkingHours((Float)newValue);
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
      case ProjectPackage.DAILY_WORKING_HOURS__DAILY_WORKING_HOURS:
        setDailyWorkingHours(DAILY_WORKING_HOURS_EDEFAULT);
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
      case ProjectPackage.DAILY_WORKING_HOURS__DAILY_WORKING_HOURS:
        return dailyWorkingHours != DAILY_WORKING_HOURS_EDEFAULT;
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
    result.append(" (dailyWorkingHours: ");
    result.append(dailyWorkingHours);
    result.append(')');
    return result.toString();
  }

} //DailyWorkingHoursImpl
