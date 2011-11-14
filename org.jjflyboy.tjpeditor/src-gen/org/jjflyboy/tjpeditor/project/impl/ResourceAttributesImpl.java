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
import org.jjflyboy.tjpeditor.project.ResourceAttributes;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Attributes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.ResourceAttributesImpl#isAll <em>All</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.ResourceAttributesImpl#isNone <em>None</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.ResourceAttributesImpl#isVacation <em>Vacation</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.ResourceAttributesImpl#isBooking <em>Booking</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.ResourceAttributesImpl#isWorkingHours <em>Working Hours</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceAttributesImpl extends ExportAttributeImpl implements ResourceAttributes
{
  /**
   * The default value of the '{@link #isAll() <em>All</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAll()
   * @generated
   * @ordered
   */
  protected static final boolean ALL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAll() <em>All</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAll()
   * @generated
   * @ordered
   */
  protected boolean all = ALL_EDEFAULT;

  /**
   * The default value of the '{@link #isNone() <em>None</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNone()
   * @generated
   * @ordered
   */
  protected static final boolean NONE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNone() <em>None</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNone()
   * @generated
   * @ordered
   */
  protected boolean none = NONE_EDEFAULT;

  /**
   * The default value of the '{@link #isVacation() <em>Vacation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isVacation()
   * @generated
   * @ordered
   */
  protected static final boolean VACATION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isVacation() <em>Vacation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isVacation()
   * @generated
   * @ordered
   */
  protected boolean vacation = VACATION_EDEFAULT;

  /**
   * The default value of the '{@link #isBooking() <em>Booking</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBooking()
   * @generated
   * @ordered
   */
  protected static final boolean BOOKING_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isBooking() <em>Booking</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBooking()
   * @generated
   * @ordered
   */
  protected boolean booking = BOOKING_EDEFAULT;

  /**
   * The default value of the '{@link #isWorkingHours() <em>Working Hours</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isWorkingHours()
   * @generated
   * @ordered
   */
  protected static final boolean WORKING_HOURS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isWorkingHours() <em>Working Hours</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isWorkingHours()
   * @generated
   * @ordered
   */
  protected boolean workingHours = WORKING_HOURS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ResourceAttributesImpl()
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
    return ProjectPackage.eINSTANCE.getResourceAttributes();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAll()
  {
    return all;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAll(boolean newAll)
  {
    boolean oldAll = all;
    all = newAll;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.RESOURCE_ATTRIBUTES__ALL, oldAll, all));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNone()
  {
    return none;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNone(boolean newNone)
  {
    boolean oldNone = none;
    none = newNone;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.RESOURCE_ATTRIBUTES__NONE, oldNone, none));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isVacation()
  {
    return vacation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVacation(boolean newVacation)
  {
    boolean oldVacation = vacation;
    vacation = newVacation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.RESOURCE_ATTRIBUTES__VACATION, oldVacation, vacation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isBooking()
  {
    return booking;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBooking(boolean newBooking)
  {
    boolean oldBooking = booking;
    booking = newBooking;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.RESOURCE_ATTRIBUTES__BOOKING, oldBooking, booking));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isWorkingHours()
  {
    return workingHours;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWorkingHours(boolean newWorkingHours)
  {
    boolean oldWorkingHours = workingHours;
    workingHours = newWorkingHours;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.RESOURCE_ATTRIBUTES__WORKING_HOURS, oldWorkingHours, workingHours));
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
      case ProjectPackage.RESOURCE_ATTRIBUTES__ALL:
        return isAll();
      case ProjectPackage.RESOURCE_ATTRIBUTES__NONE:
        return isNone();
      case ProjectPackage.RESOURCE_ATTRIBUTES__VACATION:
        return isVacation();
      case ProjectPackage.RESOURCE_ATTRIBUTES__BOOKING:
        return isBooking();
      case ProjectPackage.RESOURCE_ATTRIBUTES__WORKING_HOURS:
        return isWorkingHours();
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
      case ProjectPackage.RESOURCE_ATTRIBUTES__ALL:
        setAll((Boolean)newValue);
        return;
      case ProjectPackage.RESOURCE_ATTRIBUTES__NONE:
        setNone((Boolean)newValue);
        return;
      case ProjectPackage.RESOURCE_ATTRIBUTES__VACATION:
        setVacation((Boolean)newValue);
        return;
      case ProjectPackage.RESOURCE_ATTRIBUTES__BOOKING:
        setBooking((Boolean)newValue);
        return;
      case ProjectPackage.RESOURCE_ATTRIBUTES__WORKING_HOURS:
        setWorkingHours((Boolean)newValue);
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
      case ProjectPackage.RESOURCE_ATTRIBUTES__ALL:
        setAll(ALL_EDEFAULT);
        return;
      case ProjectPackage.RESOURCE_ATTRIBUTES__NONE:
        setNone(NONE_EDEFAULT);
        return;
      case ProjectPackage.RESOURCE_ATTRIBUTES__VACATION:
        setVacation(VACATION_EDEFAULT);
        return;
      case ProjectPackage.RESOURCE_ATTRIBUTES__BOOKING:
        setBooking(BOOKING_EDEFAULT);
        return;
      case ProjectPackage.RESOURCE_ATTRIBUTES__WORKING_HOURS:
        setWorkingHours(WORKING_HOURS_EDEFAULT);
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
      case ProjectPackage.RESOURCE_ATTRIBUTES__ALL:
        return all != ALL_EDEFAULT;
      case ProjectPackage.RESOURCE_ATTRIBUTES__NONE:
        return none != NONE_EDEFAULT;
      case ProjectPackage.RESOURCE_ATTRIBUTES__VACATION:
        return vacation != VACATION_EDEFAULT;
      case ProjectPackage.RESOURCE_ATTRIBUTES__BOOKING:
        return booking != BOOKING_EDEFAULT;
      case ProjectPackage.RESOURCE_ATTRIBUTES__WORKING_HOURS:
        return workingHours != WORKING_HOURS_EDEFAULT;
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
    result.append(" (all: ");
    result.append(all);
    result.append(", none: ");
    result.append(none);
    result.append(", vacation: ");
    result.append(vacation);
    result.append(", booking: ");
    result.append(booking);
    result.append(", workingHours: ");
    result.append(workingHours);
    result.append(')');
    return result.toString();
  }

} //ResourceAttributesImpl
