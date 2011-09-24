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

import org.jjflyboy.tjpeditor.project.ProjectPackage;
import org.jjflyboy.tjpeditor.project.Shift;
import org.jjflyboy.tjpeditor.project.ShiftTimesheet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shift Timesheet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.ShiftTimesheetImpl#getShift <em>Shift</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ShiftTimesheetImpl extends TimesheetAttributeImpl implements ShiftTimesheet
{
  /**
   * The cached value of the '{@link #getShift() <em>Shift</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShift()
   * @generated
   * @ordered
   */
  protected Shift shift;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ShiftTimesheetImpl()
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
    return ProjectPackage.eINSTANCE.getShiftTimesheet();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Shift getShift()
  {
    if (shift != null && shift.eIsProxy())
    {
      InternalEObject oldShift = (InternalEObject)shift;
      shift = (Shift)eResolveProxy(oldShift);
      if (shift != oldShift)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjectPackage.SHIFT_TIMESHEET__SHIFT, oldShift, shift));
      }
    }
    return shift;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Shift basicGetShift()
  {
    return shift;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setShift(Shift newShift)
  {
    Shift oldShift = shift;
    shift = newShift;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.SHIFT_TIMESHEET__SHIFT, oldShift, shift));
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
      case ProjectPackage.SHIFT_TIMESHEET__SHIFT:
        if (resolve) return getShift();
        return basicGetShift();
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
      case ProjectPackage.SHIFT_TIMESHEET__SHIFT:
        setShift((Shift)newValue);
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
      case ProjectPackage.SHIFT_TIMESHEET__SHIFT:
        setShift((Shift)null);
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
      case ProjectPackage.SHIFT_TIMESHEET__SHIFT:
        return shift != null;
    }
    return super.eIsSet(featureID);
  }

} //ShiftTimesheetImpl
