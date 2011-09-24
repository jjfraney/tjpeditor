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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.jjflyboy.tjpeditor.project.Interval3;
import org.jjflyboy.tjpeditor.project.ProjectPackage;
import org.jjflyboy.tjpeditor.project.Shift;
import org.jjflyboy.tjpeditor.project.ShiftLimit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shift Limit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.ShiftLimitImpl#getShift <em>Shift</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.ShiftLimitImpl#getIntervals <em>Intervals</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ShiftLimitImpl extends MinimalEObjectImpl.Container implements ShiftLimit
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
   * The cached value of the '{@link #getIntervals() <em>Intervals</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntervals()
   * @generated
   * @ordered
   */
  protected EList<Interval3> intervals;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ShiftLimitImpl()
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
    return ProjectPackage.eINSTANCE.getShiftLimit();
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjectPackage.SHIFT_LIMIT__SHIFT, oldShift, shift));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.SHIFT_LIMIT__SHIFT, oldShift, shift));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Interval3> getIntervals()
  {
    if (intervals == null)
    {
      intervals = new EObjectContainmentEList<Interval3>(Interval3.class, this, ProjectPackage.SHIFT_LIMIT__INTERVALS);
    }
    return intervals;
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
      case ProjectPackage.SHIFT_LIMIT__INTERVALS:
        return ((InternalEList<?>)getIntervals()).basicRemove(otherEnd, msgs);
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
      case ProjectPackage.SHIFT_LIMIT__SHIFT:
        if (resolve) return getShift();
        return basicGetShift();
      case ProjectPackage.SHIFT_LIMIT__INTERVALS:
        return getIntervals();
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
      case ProjectPackage.SHIFT_LIMIT__SHIFT:
        setShift((Shift)newValue);
        return;
      case ProjectPackage.SHIFT_LIMIT__INTERVALS:
        getIntervals().clear();
        getIntervals().addAll((Collection<? extends Interval3>)newValue);
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
      case ProjectPackage.SHIFT_LIMIT__SHIFT:
        setShift((Shift)null);
        return;
      case ProjectPackage.SHIFT_LIMIT__INTERVALS:
        getIntervals().clear();
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
      case ProjectPackage.SHIFT_LIMIT__SHIFT:
        return shift != null;
      case ProjectPackage.SHIFT_LIMIT__INTERVALS:
        return intervals != null && !intervals.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ShiftLimitImpl
