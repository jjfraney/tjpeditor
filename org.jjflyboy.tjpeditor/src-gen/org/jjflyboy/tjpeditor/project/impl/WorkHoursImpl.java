/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.jjflyboy.tjpeditor.project.ProjectPackage;
import org.jjflyboy.tjpeditor.project.WorkHours;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Hours</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.WorkHoursImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.WorkHoursImpl#getStop <em>Stop</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkHoursImpl extends MinimalEObjectImpl.Container implements WorkHours
{
  /**
   * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStart()
   * @generated
   * @ordered
   */
  protected static final String START_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStart()
   * @generated
   * @ordered
   */
  protected String start = START_EDEFAULT;

  /**
   * The default value of the '{@link #getStop() <em>Stop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStop()
   * @generated
   * @ordered
   */
  protected static final String STOP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStop() <em>Stop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStop()
   * @generated
   * @ordered
   */
  protected String stop = STOP_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WorkHoursImpl()
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
    return ProjectPackage.eINSTANCE.getWorkHours();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStart()
  {
    return start;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStart(String newStart)
  {
    String oldStart = start;
    start = newStart;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.WORK_HOURS__START, oldStart, start));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStop()
  {
    return stop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStop(String newStop)
  {
    String oldStop = stop;
    stop = newStop;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.WORK_HOURS__STOP, oldStop, stop));
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
      case ProjectPackage.WORK_HOURS__START:
        return getStart();
      case ProjectPackage.WORK_HOURS__STOP:
        return getStop();
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
      case ProjectPackage.WORK_HOURS__START:
        setStart((String)newValue);
        return;
      case ProjectPackage.WORK_HOURS__STOP:
        setStop((String)newValue);
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
      case ProjectPackage.WORK_HOURS__START:
        setStart(START_EDEFAULT);
        return;
      case ProjectPackage.WORK_HOURS__STOP:
        setStop(STOP_EDEFAULT);
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
      case ProjectPackage.WORK_HOURS__START:
        return START_EDEFAULT == null ? start != null : !START_EDEFAULT.equals(start);
      case ProjectPackage.WORK_HOURS__STOP:
        return STOP_EDEFAULT == null ? stop != null : !STOP_EDEFAULT.equals(stop);
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
    result.append(" (start: ");
    result.append(start);
    result.append(", stop: ");
    result.append(stop);
    result.append(')');
    return result.toString();
  }

} //WorkHoursImpl
