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
import org.jjflyboy.tjpeditor.project.TimeFormat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.TimeFormatImpl#getTimeformat <em>Timeformat</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeFormatImpl extends ReportAttributeImpl implements TimeFormat
{
  /**
   * The default value of the '{@link #getTimeformat() <em>Timeformat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimeformat()
   * @generated
   * @ordered
   */
  protected static final String TIMEFORMAT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTimeformat() <em>Timeformat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimeformat()
   * @generated
   * @ordered
   */
  protected String timeformat = TIMEFORMAT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TimeFormatImpl()
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
    return ProjectPackage.eINSTANCE.getTimeFormat();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTimeformat()
  {
    return timeformat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTimeformat(String newTimeformat)
  {
    String oldTimeformat = timeformat;
    timeformat = newTimeformat;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.TIME_FORMAT__TIMEFORMAT, oldTimeformat, timeformat));
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
      case ProjectPackage.TIME_FORMAT__TIMEFORMAT:
        return getTimeformat();
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
      case ProjectPackage.TIME_FORMAT__TIMEFORMAT:
        setTimeformat((String)newValue);
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
      case ProjectPackage.TIME_FORMAT__TIMEFORMAT:
        setTimeformat(TIMEFORMAT_EDEFAULT);
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
      case ProjectPackage.TIME_FORMAT__TIMEFORMAT:
        return TIMEFORMAT_EDEFAULT == null ? timeformat != null : !TIMEFORMAT_EDEFAULT.equals(timeformat);
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
    result.append(" (timeformat: ");
    result.append(timeformat);
    result.append(')');
    return result.toString();
  }

} //TimeFormatImpl
