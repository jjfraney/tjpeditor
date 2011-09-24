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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.jjflyboy.tjpeditor.project.Interval1;
import org.jjflyboy.tjpeditor.project.Limit;
import org.jjflyboy.tjpeditor.project.ProjectPackage;
import org.jjflyboy.tjpeditor.project.Resource;
import org.jjflyboy.tjpeditor.project.TimeUnit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Limit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.LimitImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.LimitImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.LimitImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.LimitImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.LimitImpl#getResources <em>Resources</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LimitImpl extends MaximumImpl implements Limit
{
  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final float VALUE_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected float value = VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnit()
   * @generated
   * @ordered
   */
  protected static final TimeUnit UNIT_EDEFAULT = TimeUnit.MINUTE;

  /**
   * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnit()
   * @generated
   * @ordered
   */
  protected TimeUnit unit = UNIT_EDEFAULT;

  /**
   * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnd()
   * @generated
   * @ordered
   */
  protected static final String END_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnd()
   * @generated
   * @ordered
   */
  protected String end = END_EDEFAULT;

  /**
   * The cached value of the '{@link #getPeriod() <em>Period</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPeriod()
   * @generated
   * @ordered
   */
  protected Interval1 period;

  /**
   * The cached value of the '{@link #getResources() <em>Resources</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResources()
   * @generated
   * @ordered
   */
  protected EList<Resource> resources;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LimitImpl()
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
    return ProjectPackage.eINSTANCE.getLimit();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public float getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(float newValue)
  {
    float oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.LIMIT__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimeUnit getUnit()
  {
    return unit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnit(TimeUnit newUnit)
  {
    TimeUnit oldUnit = unit;
    unit = newUnit == null ? UNIT_EDEFAULT : newUnit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.LIMIT__UNIT, oldUnit, unit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEnd()
  {
    return end;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnd(String newEnd)
  {
    String oldEnd = end;
    end = newEnd;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.LIMIT__END, oldEnd, end));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interval1 getPeriod()
  {
    return period;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPeriod(Interval1 newPeriod, NotificationChain msgs)
  {
    Interval1 oldPeriod = period;
    period = newPeriod;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProjectPackage.LIMIT__PERIOD, oldPeriod, newPeriod);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPeriod(Interval1 newPeriod)
  {
    if (newPeriod != period)
    {
      NotificationChain msgs = null;
      if (period != null)
        msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.LIMIT__PERIOD, null, msgs);
      if (newPeriod != null)
        msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.LIMIT__PERIOD, null, msgs);
      msgs = basicSetPeriod(newPeriod, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.LIMIT__PERIOD, newPeriod, newPeriod));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Resource> getResources()
  {
    if (resources == null)
    {
      resources = new EObjectResolvingEList<Resource>(Resource.class, this, ProjectPackage.LIMIT__RESOURCES);
    }
    return resources;
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
      case ProjectPackage.LIMIT__PERIOD:
        return basicSetPeriod(null, msgs);
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
      case ProjectPackage.LIMIT__VALUE:
        return getValue();
      case ProjectPackage.LIMIT__UNIT:
        return getUnit();
      case ProjectPackage.LIMIT__END:
        return getEnd();
      case ProjectPackage.LIMIT__PERIOD:
        return getPeriod();
      case ProjectPackage.LIMIT__RESOURCES:
        return getResources();
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
      case ProjectPackage.LIMIT__VALUE:
        setValue((Float)newValue);
        return;
      case ProjectPackage.LIMIT__UNIT:
        setUnit((TimeUnit)newValue);
        return;
      case ProjectPackage.LIMIT__END:
        setEnd((String)newValue);
        return;
      case ProjectPackage.LIMIT__PERIOD:
        setPeriod((Interval1)newValue);
        return;
      case ProjectPackage.LIMIT__RESOURCES:
        getResources().clear();
        getResources().addAll((Collection<? extends Resource>)newValue);
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
      case ProjectPackage.LIMIT__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case ProjectPackage.LIMIT__UNIT:
        setUnit(UNIT_EDEFAULT);
        return;
      case ProjectPackage.LIMIT__END:
        setEnd(END_EDEFAULT);
        return;
      case ProjectPackage.LIMIT__PERIOD:
        setPeriod((Interval1)null);
        return;
      case ProjectPackage.LIMIT__RESOURCES:
        getResources().clear();
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
      case ProjectPackage.LIMIT__VALUE:
        return value != VALUE_EDEFAULT;
      case ProjectPackage.LIMIT__UNIT:
        return unit != UNIT_EDEFAULT;
      case ProjectPackage.LIMIT__END:
        return END_EDEFAULT == null ? end != null : !END_EDEFAULT.equals(end);
      case ProjectPackage.LIMIT__PERIOD:
        return period != null;
      case ProjectPackage.LIMIT__RESOURCES:
        return resources != null && !resources.isEmpty();
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
    result.append(" (value: ");
    result.append(value);
    result.append(", unit: ");
    result.append(unit);
    result.append(", end: ");
    result.append(end);
    result.append(')');
    return result.toString();
  }

} //LimitImpl
