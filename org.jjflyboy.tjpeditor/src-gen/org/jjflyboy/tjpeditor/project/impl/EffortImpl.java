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

import org.jjflyboy.tjpeditor.project.DurationQuantity;
import org.jjflyboy.tjpeditor.project.Effort;
import org.jjflyboy.tjpeditor.project.ProjectPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Effort</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.EffortImpl#getEffort <em>Effort</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EffortImpl extends TaskAttributeImpl implements Effort
{
  /**
   * The cached value of the '{@link #getEffort() <em>Effort</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEffort()
   * @generated
   * @ordered
   */
  protected DurationQuantity effort;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EffortImpl()
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
    return ProjectPackage.eINSTANCE.getEffort();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DurationQuantity getEffort()
  {
    return effort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEffort(DurationQuantity newEffort, NotificationChain msgs)
  {
    DurationQuantity oldEffort = effort;
    effort = newEffort;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProjectPackage.EFFORT__EFFORT, oldEffort, newEffort);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEffort(DurationQuantity newEffort)
  {
    if (newEffort != effort)
    {
      NotificationChain msgs = null;
      if (effort != null)
        msgs = ((InternalEObject)effort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.EFFORT__EFFORT, null, msgs);
      if (newEffort != null)
        msgs = ((InternalEObject)newEffort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.EFFORT__EFFORT, null, msgs);
      msgs = basicSetEffort(newEffort, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.EFFORT__EFFORT, newEffort, newEffort));
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
      case ProjectPackage.EFFORT__EFFORT:
        return basicSetEffort(null, msgs);
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
      case ProjectPackage.EFFORT__EFFORT:
        return getEffort();
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
      case ProjectPackage.EFFORT__EFFORT:
        setEffort((DurationQuantity)newValue);
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
      case ProjectPackage.EFFORT__EFFORT:
        setEffort((DurationQuantity)null);
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
      case ProjectPackage.EFFORT__EFFORT:
        return effort != null;
    }
    return super.eIsSet(featureID);
  }

} //EffortImpl
