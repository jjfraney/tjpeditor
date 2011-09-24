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
import org.jjflyboy.tjpeditor.project.Weekday;
import org.jjflyboy.tjpeditor.project.Weekdays;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Weekdays</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.WeekdaysImpl#getFirst <em>First</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.WeekdaysImpl#getLast <em>Last</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WeekdaysImpl extends MinimalEObjectImpl.Container implements Weekdays
{
  /**
   * The default value of the '{@link #getFirst() <em>First</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirst()
   * @generated
   * @ordered
   */
  protected static final Weekday FIRST_EDEFAULT = Weekday.MON;

  /**
   * The cached value of the '{@link #getFirst() <em>First</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirst()
   * @generated
   * @ordered
   */
  protected Weekday first = FIRST_EDEFAULT;

  /**
   * The default value of the '{@link #getLast() <em>Last</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLast()
   * @generated
   * @ordered
   */
  protected static final Weekday LAST_EDEFAULT = Weekday.MON;

  /**
   * The cached value of the '{@link #getLast() <em>Last</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLast()
   * @generated
   * @ordered
   */
  protected Weekday last = LAST_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WeekdaysImpl()
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
    return ProjectPackage.eINSTANCE.getWeekdays();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Weekday getFirst()
  {
    return first;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFirst(Weekday newFirst)
  {
    Weekday oldFirst = first;
    first = newFirst == null ? FIRST_EDEFAULT : newFirst;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.WEEKDAYS__FIRST, oldFirst, first));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Weekday getLast()
  {
    return last;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLast(Weekday newLast)
  {
    Weekday oldLast = last;
    last = newLast == null ? LAST_EDEFAULT : newLast;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.WEEKDAYS__LAST, oldLast, last));
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
      case ProjectPackage.WEEKDAYS__FIRST:
        return getFirst();
      case ProjectPackage.WEEKDAYS__LAST:
        return getLast();
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
      case ProjectPackage.WEEKDAYS__FIRST:
        setFirst((Weekday)newValue);
        return;
      case ProjectPackage.WEEKDAYS__LAST:
        setLast((Weekday)newValue);
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
      case ProjectPackage.WEEKDAYS__FIRST:
        setFirst(FIRST_EDEFAULT);
        return;
      case ProjectPackage.WEEKDAYS__LAST:
        setLast(LAST_EDEFAULT);
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
      case ProjectPackage.WEEKDAYS__FIRST:
        return first != FIRST_EDEFAULT;
      case ProjectPackage.WEEKDAYS__LAST:
        return last != LAST_EDEFAULT;
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
    result.append(" (first: ");
    result.append(first);
    result.append(", last: ");
    result.append(last);
    result.append(')');
    return result.toString();
  }

} //WeekdaysImpl
