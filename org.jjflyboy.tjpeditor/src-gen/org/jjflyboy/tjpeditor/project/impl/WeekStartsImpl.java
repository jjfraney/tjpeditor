/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.jjflyboy.tjpeditor.project.ProjectPackage;
import org.jjflyboy.tjpeditor.project.WeekStarts;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Week Starts</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.WeekStartsImpl#isSunday <em>Sunday</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.WeekStartsImpl#isMonday <em>Monday</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WeekStartsImpl extends ProjectAttributeImpl implements WeekStarts
{
  /**
   * The default value of the '{@link #isSunday() <em>Sunday</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSunday()
   * @generated
   * @ordered
   */
  protected static final boolean SUNDAY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSunday() <em>Sunday</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSunday()
   * @generated
   * @ordered
   */
  protected boolean sunday = SUNDAY_EDEFAULT;

  /**
   * The default value of the '{@link #isMonday() <em>Monday</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMonday()
   * @generated
   * @ordered
   */
  protected static final boolean MONDAY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMonday() <em>Monday</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMonday()
   * @generated
   * @ordered
   */
  protected boolean monday = MONDAY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WeekStartsImpl()
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
    return ProjectPackage.eINSTANCE.getWeekStarts();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSunday()
  {
    return sunday;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSunday(boolean newSunday)
  {
    boolean oldSunday = sunday;
    sunday = newSunday;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.WEEK_STARTS__SUNDAY, oldSunday, sunday));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMonday()
  {
    return monday;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMonday(boolean newMonday)
  {
    boolean oldMonday = monday;
    monday = newMonday;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.WEEK_STARTS__MONDAY, oldMonday, monday));
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
      case ProjectPackage.WEEK_STARTS__SUNDAY:
        return isSunday();
      case ProjectPackage.WEEK_STARTS__MONDAY:
        return isMonday();
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
      case ProjectPackage.WEEK_STARTS__SUNDAY:
        setSunday((Boolean)newValue);
        return;
      case ProjectPackage.WEEK_STARTS__MONDAY:
        setMonday((Boolean)newValue);
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
      case ProjectPackage.WEEK_STARTS__SUNDAY:
        setSunday(SUNDAY_EDEFAULT);
        return;
      case ProjectPackage.WEEK_STARTS__MONDAY:
        setMonday(MONDAY_EDEFAULT);
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
      case ProjectPackage.WEEK_STARTS__SUNDAY:
        return sunday != SUNDAY_EDEFAULT;
      case ProjectPackage.WEEK_STARTS__MONDAY:
        return monday != MONDAY_EDEFAULT;
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
    result.append(" (sunday: ");
    result.append(sunday);
    result.append(", monday: ");
    result.append(monday);
    result.append(')');
    return result.toString();
  }

} //WeekStartsImpl
