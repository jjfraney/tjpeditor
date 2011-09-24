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

import org.jjflyboy.tjpeditor.project.Limit;
import org.jjflyboy.tjpeditor.project.Limits;
import org.jjflyboy.tjpeditor.project.Maximum;
import org.jjflyboy.tjpeditor.project.Minimum;
import org.jjflyboy.tjpeditor.project.MonthlyMax;
import org.jjflyboy.tjpeditor.project.MonthlyMin;
import org.jjflyboy.tjpeditor.project.ProjectPackage;
import org.jjflyboy.tjpeditor.project.WeeklyMax;
import org.jjflyboy.tjpeditor.project.WeeklyMin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Limits</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.LimitsImpl#getDailymax <em>Dailymax</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.LimitsImpl#getDailymin <em>Dailymin</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.LimitsImpl#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.LimitsImpl#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.LimitsImpl#getMonthlymax <em>Monthlymax</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.LimitsImpl#getMonthlymin <em>Monthlymin</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.LimitsImpl#getWeeklymax <em>Weeklymax</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.LimitsImpl#getWeeklymin <em>Weeklymin</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LimitsImpl extends GlobalAttributeImpl implements Limits
{
  /**
   * The cached value of the '{@link #getDailymax() <em>Dailymax</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDailymax()
   * @generated
   * @ordered
   */
  protected Limit dailymax;

  /**
   * The cached value of the '{@link #getDailymin() <em>Dailymin</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDailymin()
   * @generated
   * @ordered
   */
  protected Limit dailymin;

  /**
   * The cached value of the '{@link #getMaximum() <em>Maximum</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaximum()
   * @generated
   * @ordered
   */
  protected Maximum maximum;

  /**
   * The cached value of the '{@link #getMinimum() <em>Minimum</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinimum()
   * @generated
   * @ordered
   */
  protected Minimum minimum;

  /**
   * The cached value of the '{@link #getMonthlymax() <em>Monthlymax</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMonthlymax()
   * @generated
   * @ordered
   */
  protected MonthlyMax monthlymax;

  /**
   * The cached value of the '{@link #getMonthlymin() <em>Monthlymin</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMonthlymin()
   * @generated
   * @ordered
   */
  protected MonthlyMin monthlymin;

  /**
   * The cached value of the '{@link #getWeeklymax() <em>Weeklymax</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeeklymax()
   * @generated
   * @ordered
   */
  protected WeeklyMax weeklymax;

  /**
   * The cached value of the '{@link #getWeeklymin() <em>Weeklymin</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeeklymin()
   * @generated
   * @ordered
   */
  protected WeeklyMin weeklymin;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LimitsImpl()
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
    return ProjectPackage.eINSTANCE.getLimits();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Limit getDailymax()
  {
    return dailymax;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDailymax(Limit newDailymax, NotificationChain msgs)
  {
    Limit oldDailymax = dailymax;
    dailymax = newDailymax;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProjectPackage.LIMITS__DAILYMAX, oldDailymax, newDailymax);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDailymax(Limit newDailymax)
  {
    if (newDailymax != dailymax)
    {
      NotificationChain msgs = null;
      if (dailymax != null)
        msgs = ((InternalEObject)dailymax).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.LIMITS__DAILYMAX, null, msgs);
      if (newDailymax != null)
        msgs = ((InternalEObject)newDailymax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.LIMITS__DAILYMAX, null, msgs);
      msgs = basicSetDailymax(newDailymax, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.LIMITS__DAILYMAX, newDailymax, newDailymax));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Limit getDailymin()
  {
    return dailymin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDailymin(Limit newDailymin, NotificationChain msgs)
  {
    Limit oldDailymin = dailymin;
    dailymin = newDailymin;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProjectPackage.LIMITS__DAILYMIN, oldDailymin, newDailymin);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDailymin(Limit newDailymin)
  {
    if (newDailymin != dailymin)
    {
      NotificationChain msgs = null;
      if (dailymin != null)
        msgs = ((InternalEObject)dailymin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.LIMITS__DAILYMIN, null, msgs);
      if (newDailymin != null)
        msgs = ((InternalEObject)newDailymin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.LIMITS__DAILYMIN, null, msgs);
      msgs = basicSetDailymin(newDailymin, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.LIMITS__DAILYMIN, newDailymin, newDailymin));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Maximum getMaximum()
  {
    return maximum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMaximum(Maximum newMaximum, NotificationChain msgs)
  {
    Maximum oldMaximum = maximum;
    maximum = newMaximum;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProjectPackage.LIMITS__MAXIMUM, oldMaximum, newMaximum);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMaximum(Maximum newMaximum)
  {
    if (newMaximum != maximum)
    {
      NotificationChain msgs = null;
      if (maximum != null)
        msgs = ((InternalEObject)maximum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.LIMITS__MAXIMUM, null, msgs);
      if (newMaximum != null)
        msgs = ((InternalEObject)newMaximum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.LIMITS__MAXIMUM, null, msgs);
      msgs = basicSetMaximum(newMaximum, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.LIMITS__MAXIMUM, newMaximum, newMaximum));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Minimum getMinimum()
  {
    return minimum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMinimum(Minimum newMinimum, NotificationChain msgs)
  {
    Minimum oldMinimum = minimum;
    minimum = newMinimum;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProjectPackage.LIMITS__MINIMUM, oldMinimum, newMinimum);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMinimum(Minimum newMinimum)
  {
    if (newMinimum != minimum)
    {
      NotificationChain msgs = null;
      if (minimum != null)
        msgs = ((InternalEObject)minimum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.LIMITS__MINIMUM, null, msgs);
      if (newMinimum != null)
        msgs = ((InternalEObject)newMinimum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.LIMITS__MINIMUM, null, msgs);
      msgs = basicSetMinimum(newMinimum, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.LIMITS__MINIMUM, newMinimum, newMinimum));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MonthlyMax getMonthlymax()
  {
    return monthlymax;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMonthlymax(MonthlyMax newMonthlymax, NotificationChain msgs)
  {
    MonthlyMax oldMonthlymax = monthlymax;
    monthlymax = newMonthlymax;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProjectPackage.LIMITS__MONTHLYMAX, oldMonthlymax, newMonthlymax);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMonthlymax(MonthlyMax newMonthlymax)
  {
    if (newMonthlymax != monthlymax)
    {
      NotificationChain msgs = null;
      if (monthlymax != null)
        msgs = ((InternalEObject)monthlymax).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.LIMITS__MONTHLYMAX, null, msgs);
      if (newMonthlymax != null)
        msgs = ((InternalEObject)newMonthlymax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.LIMITS__MONTHLYMAX, null, msgs);
      msgs = basicSetMonthlymax(newMonthlymax, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.LIMITS__MONTHLYMAX, newMonthlymax, newMonthlymax));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MonthlyMin getMonthlymin()
  {
    return monthlymin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMonthlymin(MonthlyMin newMonthlymin, NotificationChain msgs)
  {
    MonthlyMin oldMonthlymin = monthlymin;
    monthlymin = newMonthlymin;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProjectPackage.LIMITS__MONTHLYMIN, oldMonthlymin, newMonthlymin);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMonthlymin(MonthlyMin newMonthlymin)
  {
    if (newMonthlymin != monthlymin)
    {
      NotificationChain msgs = null;
      if (monthlymin != null)
        msgs = ((InternalEObject)monthlymin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.LIMITS__MONTHLYMIN, null, msgs);
      if (newMonthlymin != null)
        msgs = ((InternalEObject)newMonthlymin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.LIMITS__MONTHLYMIN, null, msgs);
      msgs = basicSetMonthlymin(newMonthlymin, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.LIMITS__MONTHLYMIN, newMonthlymin, newMonthlymin));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WeeklyMax getWeeklymax()
  {
    return weeklymax;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWeeklymax(WeeklyMax newWeeklymax, NotificationChain msgs)
  {
    WeeklyMax oldWeeklymax = weeklymax;
    weeklymax = newWeeklymax;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProjectPackage.LIMITS__WEEKLYMAX, oldWeeklymax, newWeeklymax);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWeeklymax(WeeklyMax newWeeklymax)
  {
    if (newWeeklymax != weeklymax)
    {
      NotificationChain msgs = null;
      if (weeklymax != null)
        msgs = ((InternalEObject)weeklymax).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.LIMITS__WEEKLYMAX, null, msgs);
      if (newWeeklymax != null)
        msgs = ((InternalEObject)newWeeklymax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.LIMITS__WEEKLYMAX, null, msgs);
      msgs = basicSetWeeklymax(newWeeklymax, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.LIMITS__WEEKLYMAX, newWeeklymax, newWeeklymax));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WeeklyMin getWeeklymin()
  {
    return weeklymin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWeeklymin(WeeklyMin newWeeklymin, NotificationChain msgs)
  {
    WeeklyMin oldWeeklymin = weeklymin;
    weeklymin = newWeeklymin;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProjectPackage.LIMITS__WEEKLYMIN, oldWeeklymin, newWeeklymin);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWeeklymin(WeeklyMin newWeeklymin)
  {
    if (newWeeklymin != weeklymin)
    {
      NotificationChain msgs = null;
      if (weeklymin != null)
        msgs = ((InternalEObject)weeklymin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.LIMITS__WEEKLYMIN, null, msgs);
      if (newWeeklymin != null)
        msgs = ((InternalEObject)newWeeklymin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.LIMITS__WEEKLYMIN, null, msgs);
      msgs = basicSetWeeklymin(newWeeklymin, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.LIMITS__WEEKLYMIN, newWeeklymin, newWeeklymin));
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
      case ProjectPackage.LIMITS__DAILYMAX:
        return basicSetDailymax(null, msgs);
      case ProjectPackage.LIMITS__DAILYMIN:
        return basicSetDailymin(null, msgs);
      case ProjectPackage.LIMITS__MAXIMUM:
        return basicSetMaximum(null, msgs);
      case ProjectPackage.LIMITS__MINIMUM:
        return basicSetMinimum(null, msgs);
      case ProjectPackage.LIMITS__MONTHLYMAX:
        return basicSetMonthlymax(null, msgs);
      case ProjectPackage.LIMITS__MONTHLYMIN:
        return basicSetMonthlymin(null, msgs);
      case ProjectPackage.LIMITS__WEEKLYMAX:
        return basicSetWeeklymax(null, msgs);
      case ProjectPackage.LIMITS__WEEKLYMIN:
        return basicSetWeeklymin(null, msgs);
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
      case ProjectPackage.LIMITS__DAILYMAX:
        return getDailymax();
      case ProjectPackage.LIMITS__DAILYMIN:
        return getDailymin();
      case ProjectPackage.LIMITS__MAXIMUM:
        return getMaximum();
      case ProjectPackage.LIMITS__MINIMUM:
        return getMinimum();
      case ProjectPackage.LIMITS__MONTHLYMAX:
        return getMonthlymax();
      case ProjectPackage.LIMITS__MONTHLYMIN:
        return getMonthlymin();
      case ProjectPackage.LIMITS__WEEKLYMAX:
        return getWeeklymax();
      case ProjectPackage.LIMITS__WEEKLYMIN:
        return getWeeklymin();
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
      case ProjectPackage.LIMITS__DAILYMAX:
        setDailymax((Limit)newValue);
        return;
      case ProjectPackage.LIMITS__DAILYMIN:
        setDailymin((Limit)newValue);
        return;
      case ProjectPackage.LIMITS__MAXIMUM:
        setMaximum((Maximum)newValue);
        return;
      case ProjectPackage.LIMITS__MINIMUM:
        setMinimum((Minimum)newValue);
        return;
      case ProjectPackage.LIMITS__MONTHLYMAX:
        setMonthlymax((MonthlyMax)newValue);
        return;
      case ProjectPackage.LIMITS__MONTHLYMIN:
        setMonthlymin((MonthlyMin)newValue);
        return;
      case ProjectPackage.LIMITS__WEEKLYMAX:
        setWeeklymax((WeeklyMax)newValue);
        return;
      case ProjectPackage.LIMITS__WEEKLYMIN:
        setWeeklymin((WeeklyMin)newValue);
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
      case ProjectPackage.LIMITS__DAILYMAX:
        setDailymax((Limit)null);
        return;
      case ProjectPackage.LIMITS__DAILYMIN:
        setDailymin((Limit)null);
        return;
      case ProjectPackage.LIMITS__MAXIMUM:
        setMaximum((Maximum)null);
        return;
      case ProjectPackage.LIMITS__MINIMUM:
        setMinimum((Minimum)null);
        return;
      case ProjectPackage.LIMITS__MONTHLYMAX:
        setMonthlymax((MonthlyMax)null);
        return;
      case ProjectPackage.LIMITS__MONTHLYMIN:
        setMonthlymin((MonthlyMin)null);
        return;
      case ProjectPackage.LIMITS__WEEKLYMAX:
        setWeeklymax((WeeklyMax)null);
        return;
      case ProjectPackage.LIMITS__WEEKLYMIN:
        setWeeklymin((WeeklyMin)null);
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
      case ProjectPackage.LIMITS__DAILYMAX:
        return dailymax != null;
      case ProjectPackage.LIMITS__DAILYMIN:
        return dailymin != null;
      case ProjectPackage.LIMITS__MAXIMUM:
        return maximum != null;
      case ProjectPackage.LIMITS__MINIMUM:
        return minimum != null;
      case ProjectPackage.LIMITS__MONTHLYMAX:
        return monthlymax != null;
      case ProjectPackage.LIMITS__MONTHLYMIN:
        return monthlymin != null;
      case ProjectPackage.LIMITS__WEEKLYMAX:
        return weeklymax != null;
      case ProjectPackage.LIMITS__WEEKLYMIN:
        return weeklymin != null;
    }
    return super.eIsSet(featureID);
  }

} //LimitsImpl
