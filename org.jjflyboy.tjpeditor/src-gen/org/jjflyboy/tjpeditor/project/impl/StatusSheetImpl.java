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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.jjflyboy.tjpeditor.project.Interval4;
import org.jjflyboy.tjpeditor.project.ProjectPackage;
import org.jjflyboy.tjpeditor.project.Resource;
import org.jjflyboy.tjpeditor.project.StatusSheet;
import org.jjflyboy.tjpeditor.project.StatusSheetAttribute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Status Sheet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.StatusSheetImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.StatusSheetImpl#getInterval <em>Interval</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.StatusSheetImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StatusSheetImpl extends PropertyImpl implements StatusSheet
{
  /**
   * The cached value of the '{@link #getResource() <em>Resource</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResource()
   * @generated
   * @ordered
   */
  protected Resource resource;

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
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<StatusSheetAttribute> attributes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StatusSheetImpl()
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
    return ProjectPackage.eINSTANCE.getStatusSheet();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Resource getResource()
  {
    if (resource != null && resource.eIsProxy())
    {
      InternalEObject oldResource = (InternalEObject)resource;
      resource = (Resource)eResolveProxy(oldResource);
      if (resource != oldResource)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjectPackage.STATUS_SHEET__RESOURCE, oldResource, resource));
      }
    }
    return resource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Resource basicGetResource()
  {
    return resource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResource(Resource newResource)
  {
    Resource oldResource = resource;
    resource = newResource;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.STATUS_SHEET__RESOURCE, oldResource, resource));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProjectPackage.STATUS_SHEET__INTERVAL, oldInterval, newInterval);
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
        msgs = ((InternalEObject)interval).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.STATUS_SHEET__INTERVAL, null, msgs);
      if (newInterval != null)
        msgs = ((InternalEObject)newInterval).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.STATUS_SHEET__INTERVAL, null, msgs);
      msgs = basicSetInterval(newInterval, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.STATUS_SHEET__INTERVAL, newInterval, newInterval));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StatusSheetAttribute> getAttributes()
  {
    if (attributes == null)
    {
      attributes = new EObjectContainmentEList<StatusSheetAttribute>(StatusSheetAttribute.class, this, ProjectPackage.STATUS_SHEET__ATTRIBUTES);
    }
    return attributes;
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
      case ProjectPackage.STATUS_SHEET__INTERVAL:
        return basicSetInterval(null, msgs);
      case ProjectPackage.STATUS_SHEET__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
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
      case ProjectPackage.STATUS_SHEET__RESOURCE:
        if (resolve) return getResource();
        return basicGetResource();
      case ProjectPackage.STATUS_SHEET__INTERVAL:
        return getInterval();
      case ProjectPackage.STATUS_SHEET__ATTRIBUTES:
        return getAttributes();
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
      case ProjectPackage.STATUS_SHEET__RESOURCE:
        setResource((Resource)newValue);
        return;
      case ProjectPackage.STATUS_SHEET__INTERVAL:
        setInterval((Interval4)newValue);
        return;
      case ProjectPackage.STATUS_SHEET__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends StatusSheetAttribute>)newValue);
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
      case ProjectPackage.STATUS_SHEET__RESOURCE:
        setResource((Resource)null);
        return;
      case ProjectPackage.STATUS_SHEET__INTERVAL:
        setInterval((Interval4)null);
        return;
      case ProjectPackage.STATUS_SHEET__ATTRIBUTES:
        getAttributes().clear();
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
      case ProjectPackage.STATUS_SHEET__RESOURCE:
        return resource != null;
      case ProjectPackage.STATUS_SHEET__INTERVAL:
        return interval != null;
      case ProjectPackage.STATUS_SHEET__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //StatusSheetImpl
