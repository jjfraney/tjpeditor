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

import org.jjflyboy.tjpeditor.project.ProjectPackage;
import org.jjflyboy.tjpeditor.project.Shift;
import org.jjflyboy.tjpeditor.project.VacationShift;
import org.jjflyboy.tjpeditor.project.WorkingHours;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shift</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.ShiftImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.ShiftImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.ShiftImpl#getReplace <em>Replace</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.ShiftImpl#getTimezone <em>Timezone</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.ShiftImpl#getVacation <em>Vacation</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.ShiftImpl#getShift <em>Shift</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.ShiftImpl#getWorkingHours <em>Working Hours</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ShiftImpl extends GlobalAttributeImpl implements Shift
{
  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getReplace() <em>Replace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReplace()
   * @generated
   * @ordered
   */
  protected static final String REPLACE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReplace() <em>Replace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReplace()
   * @generated
   * @ordered
   */
  protected String replace = REPLACE_EDEFAULT;

  /**
   * The default value of the '{@link #getTimezone() <em>Timezone</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimezone()
   * @generated
   * @ordered
   */
  protected static final String TIMEZONE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTimezone() <em>Timezone</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimezone()
   * @generated
   * @ordered
   */
  protected String timezone = TIMEZONE_EDEFAULT;

  /**
   * The cached value of the '{@link #getVacation() <em>Vacation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVacation()
   * @generated
   * @ordered
   */
  protected VacationShift vacation;

  /**
   * The cached value of the '{@link #getShift() <em>Shift</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShift()
   * @generated
   * @ordered
   */
  protected Shift shift;

  /**
   * The cached value of the '{@link #getWorkingHours() <em>Working Hours</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWorkingHours()
   * @generated
   * @ordered
   */
  protected WorkingHours workingHours;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ShiftImpl()
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
    return ProjectPackage.eINSTANCE.getShift();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.SHIFT__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.SHIFT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getReplace()
  {
    return replace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReplace(String newReplace)
  {
    String oldReplace = replace;
    replace = newReplace;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.SHIFT__REPLACE, oldReplace, replace));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTimezone()
  {
    return timezone;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTimezone(String newTimezone)
  {
    String oldTimezone = timezone;
    timezone = newTimezone;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.SHIFT__TIMEZONE, oldTimezone, timezone));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VacationShift getVacation()
  {
    return vacation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVacation(VacationShift newVacation, NotificationChain msgs)
  {
    VacationShift oldVacation = vacation;
    vacation = newVacation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProjectPackage.SHIFT__VACATION, oldVacation, newVacation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVacation(VacationShift newVacation)
  {
    if (newVacation != vacation)
    {
      NotificationChain msgs = null;
      if (vacation != null)
        msgs = ((InternalEObject)vacation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.SHIFT__VACATION, null, msgs);
      if (newVacation != null)
        msgs = ((InternalEObject)newVacation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.SHIFT__VACATION, null, msgs);
      msgs = basicSetVacation(newVacation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.SHIFT__VACATION, newVacation, newVacation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Shift getShift()
  {
    return shift;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetShift(Shift newShift, NotificationChain msgs)
  {
    Shift oldShift = shift;
    shift = newShift;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProjectPackage.SHIFT__SHIFT, oldShift, newShift);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setShift(Shift newShift)
  {
    if (newShift != shift)
    {
      NotificationChain msgs = null;
      if (shift != null)
        msgs = ((InternalEObject)shift).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.SHIFT__SHIFT, null, msgs);
      if (newShift != null)
        msgs = ((InternalEObject)newShift).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.SHIFT__SHIFT, null, msgs);
      msgs = basicSetShift(newShift, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.SHIFT__SHIFT, newShift, newShift));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkingHours getWorkingHours()
  {
    return workingHours;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWorkingHours(WorkingHours newWorkingHours, NotificationChain msgs)
  {
    WorkingHours oldWorkingHours = workingHours;
    workingHours = newWorkingHours;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProjectPackage.SHIFT__WORKING_HOURS, oldWorkingHours, newWorkingHours);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWorkingHours(WorkingHours newWorkingHours)
  {
    if (newWorkingHours != workingHours)
    {
      NotificationChain msgs = null;
      if (workingHours != null)
        msgs = ((InternalEObject)workingHours).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.SHIFT__WORKING_HOURS, null, msgs);
      if (newWorkingHours != null)
        msgs = ((InternalEObject)newWorkingHours).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.SHIFT__WORKING_HOURS, null, msgs);
      msgs = basicSetWorkingHours(newWorkingHours, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.SHIFT__WORKING_HOURS, newWorkingHours, newWorkingHours));
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
      case ProjectPackage.SHIFT__VACATION:
        return basicSetVacation(null, msgs);
      case ProjectPackage.SHIFT__SHIFT:
        return basicSetShift(null, msgs);
      case ProjectPackage.SHIFT__WORKING_HOURS:
        return basicSetWorkingHours(null, msgs);
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
      case ProjectPackage.SHIFT__ID:
        return getId();
      case ProjectPackage.SHIFT__NAME:
        return getName();
      case ProjectPackage.SHIFT__REPLACE:
        return getReplace();
      case ProjectPackage.SHIFT__TIMEZONE:
        return getTimezone();
      case ProjectPackage.SHIFT__VACATION:
        return getVacation();
      case ProjectPackage.SHIFT__SHIFT:
        return getShift();
      case ProjectPackage.SHIFT__WORKING_HOURS:
        return getWorkingHours();
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
      case ProjectPackage.SHIFT__ID:
        setId((String)newValue);
        return;
      case ProjectPackage.SHIFT__NAME:
        setName((String)newValue);
        return;
      case ProjectPackage.SHIFT__REPLACE:
        setReplace((String)newValue);
        return;
      case ProjectPackage.SHIFT__TIMEZONE:
        setTimezone((String)newValue);
        return;
      case ProjectPackage.SHIFT__VACATION:
        setVacation((VacationShift)newValue);
        return;
      case ProjectPackage.SHIFT__SHIFT:
        setShift((Shift)newValue);
        return;
      case ProjectPackage.SHIFT__WORKING_HOURS:
        setWorkingHours((WorkingHours)newValue);
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
      case ProjectPackage.SHIFT__ID:
        setId(ID_EDEFAULT);
        return;
      case ProjectPackage.SHIFT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ProjectPackage.SHIFT__REPLACE:
        setReplace(REPLACE_EDEFAULT);
        return;
      case ProjectPackage.SHIFT__TIMEZONE:
        setTimezone(TIMEZONE_EDEFAULT);
        return;
      case ProjectPackage.SHIFT__VACATION:
        setVacation((VacationShift)null);
        return;
      case ProjectPackage.SHIFT__SHIFT:
        setShift((Shift)null);
        return;
      case ProjectPackage.SHIFT__WORKING_HOURS:
        setWorkingHours((WorkingHours)null);
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
      case ProjectPackage.SHIFT__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case ProjectPackage.SHIFT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ProjectPackage.SHIFT__REPLACE:
        return REPLACE_EDEFAULT == null ? replace != null : !REPLACE_EDEFAULT.equals(replace);
      case ProjectPackage.SHIFT__TIMEZONE:
        return TIMEZONE_EDEFAULT == null ? timezone != null : !TIMEZONE_EDEFAULT.equals(timezone);
      case ProjectPackage.SHIFT__VACATION:
        return vacation != null;
      case ProjectPackage.SHIFT__SHIFT:
        return shift != null;
      case ProjectPackage.SHIFT__WORKING_HOURS:
        return workingHours != null;
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
    result.append(" (id: ");
    result.append(id);
    result.append(", name: ");
    result.append(name);
    result.append(", replace: ");
    result.append(replace);
    result.append(", timezone: ");
    result.append(timezone);
    result.append(')');
    return result.toString();
  }

} //ShiftImpl
