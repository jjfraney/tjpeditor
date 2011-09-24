/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.jjflyboy.tjpeditor.project.Booking;
import org.jjflyboy.tjpeditor.project.BookingResource;
import org.jjflyboy.tjpeditor.project.BookingRestriction;
import org.jjflyboy.tjpeditor.project.Interval4;
import org.jjflyboy.tjpeditor.project.ProjectPackage;
import org.jjflyboy.tjpeditor.project.Task;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.BookingResourceImpl#getInterval <em>Interval</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.BookingResourceImpl#getOvertime <em>Overtime</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.BookingResourceImpl#getSloppy <em>Sloppy</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.BookingResourceImpl#getTask <em>Task</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BookingResourceImpl extends ResourceAttributeImpl implements BookingResource
{
  /**
   * The cached value of the '{@link #getInterval() <em>Interval</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterval()
   * @generated
   * @ordered
   */
  protected Interval4 interval;

  /**
   * The default value of the '{@link #getOvertime() <em>Overtime</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOvertime()
   * @generated
   * @ordered
   */
  protected static final BookingRestriction OVERTIME_EDEFAULT = BookingRestriction.WORKING_TIME_ONLY;

  /**
   * The cached value of the '{@link #getOvertime() <em>Overtime</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOvertime()
   * @generated
   * @ordered
   */
  protected BookingRestriction overtime = OVERTIME_EDEFAULT;

  /**
   * The default value of the '{@link #getSloppy() <em>Sloppy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSloppy()
   * @generated
   * @ordered
   */
  protected static final BookingRestriction SLOPPY_EDEFAULT = BookingRestriction.WORKING_TIME_ONLY;

  /**
   * The cached value of the '{@link #getSloppy() <em>Sloppy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSloppy()
   * @generated
   * @ordered
   */
  protected BookingRestriction sloppy = SLOPPY_EDEFAULT;

  /**
   * The cached value of the '{@link #getTask() <em>Task</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTask()
   * @generated
   * @ordered
   */
  protected Task task;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BookingResourceImpl()
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
    return ProjectPackage.eINSTANCE.getBookingResource();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interval4 getInterval()
  {
    return interval;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInterval(Interval4 newInterval, NotificationChain msgs)
  {
    Interval4 oldInterval = interval;
    interval = newInterval;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProjectPackage.BOOKING_RESOURCE__INTERVAL, oldInterval, newInterval);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInterval(Interval4 newInterval)
  {
    if (newInterval != interval)
    {
      NotificationChain msgs = null;
      if (interval != null)
        msgs = ((InternalEObject)interval).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.BOOKING_RESOURCE__INTERVAL, null, msgs);
      if (newInterval != null)
        msgs = ((InternalEObject)newInterval).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.BOOKING_RESOURCE__INTERVAL, null, msgs);
      msgs = basicSetInterval(newInterval, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.BOOKING_RESOURCE__INTERVAL, newInterval, newInterval));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BookingRestriction getOvertime()
  {
    return overtime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOvertime(BookingRestriction newOvertime)
  {
    BookingRestriction oldOvertime = overtime;
    overtime = newOvertime == null ? OVERTIME_EDEFAULT : newOvertime;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.BOOKING_RESOURCE__OVERTIME, oldOvertime, overtime));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BookingRestriction getSloppy()
  {
    return sloppy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSloppy(BookingRestriction newSloppy)
  {
    BookingRestriction oldSloppy = sloppy;
    sloppy = newSloppy == null ? SLOPPY_EDEFAULT : newSloppy;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.BOOKING_RESOURCE__SLOPPY, oldSloppy, sloppy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Task getTask()
  {
    if (task != null && task.eIsProxy())
    {
      InternalEObject oldTask = (InternalEObject)task;
      task = (Task)eResolveProxy(oldTask);
      if (task != oldTask)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjectPackage.BOOKING_RESOURCE__TASK, oldTask, task));
      }
    }
    return task;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Task basicGetTask()
  {
    return task;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTask(Task newTask)
  {
    Task oldTask = task;
    task = newTask;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.BOOKING_RESOURCE__TASK, oldTask, task));
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
      case ProjectPackage.BOOKING_RESOURCE__INTERVAL:
        return basicSetInterval(null, msgs);
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
      case ProjectPackage.BOOKING_RESOURCE__INTERVAL:
        return getInterval();
      case ProjectPackage.BOOKING_RESOURCE__OVERTIME:
        return getOvertime();
      case ProjectPackage.BOOKING_RESOURCE__SLOPPY:
        return getSloppy();
      case ProjectPackage.BOOKING_RESOURCE__TASK:
        if (resolve) return getTask();
        return basicGetTask();
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
      case ProjectPackage.BOOKING_RESOURCE__INTERVAL:
        setInterval((Interval4)newValue);
        return;
      case ProjectPackage.BOOKING_RESOURCE__OVERTIME:
        setOvertime((BookingRestriction)newValue);
        return;
      case ProjectPackage.BOOKING_RESOURCE__SLOPPY:
        setSloppy((BookingRestriction)newValue);
        return;
      case ProjectPackage.BOOKING_RESOURCE__TASK:
        setTask((Task)newValue);
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
      case ProjectPackage.BOOKING_RESOURCE__INTERVAL:
        setInterval((Interval4)null);
        return;
      case ProjectPackage.BOOKING_RESOURCE__OVERTIME:
        setOvertime(OVERTIME_EDEFAULT);
        return;
      case ProjectPackage.BOOKING_RESOURCE__SLOPPY:
        setSloppy(SLOPPY_EDEFAULT);
        return;
      case ProjectPackage.BOOKING_RESOURCE__TASK:
        setTask((Task)null);
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
      case ProjectPackage.BOOKING_RESOURCE__INTERVAL:
        return interval != null;
      case ProjectPackage.BOOKING_RESOURCE__OVERTIME:
        return overtime != OVERTIME_EDEFAULT;
      case ProjectPackage.BOOKING_RESOURCE__SLOPPY:
        return sloppy != SLOPPY_EDEFAULT;
      case ProjectPackage.BOOKING_RESOURCE__TASK:
        return task != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == Booking.class)
    {
      switch (derivedFeatureID)
      {
        case ProjectPackage.BOOKING_RESOURCE__INTERVAL: return ProjectPackage.BOOKING__INTERVAL;
        case ProjectPackage.BOOKING_RESOURCE__OVERTIME: return ProjectPackage.BOOKING__OVERTIME;
        case ProjectPackage.BOOKING_RESOURCE__SLOPPY: return ProjectPackage.BOOKING__SLOPPY;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == Booking.class)
    {
      switch (baseFeatureID)
      {
        case ProjectPackage.BOOKING__INTERVAL: return ProjectPackage.BOOKING_RESOURCE__INTERVAL;
        case ProjectPackage.BOOKING__OVERTIME: return ProjectPackage.BOOKING_RESOURCE__OVERTIME;
        case ProjectPackage.BOOKING__SLOPPY: return ProjectPackage.BOOKING_RESOURCE__SLOPPY;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(" (overtime: ");
    result.append(overtime);
    result.append(", sloppy: ");
    result.append(sloppy);
    result.append(')');
    return result.toString();
  }

} //BookingResourceImpl
