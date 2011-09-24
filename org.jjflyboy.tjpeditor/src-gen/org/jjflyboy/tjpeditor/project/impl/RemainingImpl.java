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
import org.jjflyboy.tjpeditor.project.ProjectPackage;
import org.jjflyboy.tjpeditor.project.Remaining;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remaining</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.RemainingImpl#getRemaining <em>Remaining</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RemainingImpl extends NewTaskAttributeImpl implements Remaining
{
  /**
   * The cached value of the '{@link #getRemaining() <em>Remaining</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRemaining()
   * @generated
   * @ordered
   */
  protected DurationQuantity remaining;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RemainingImpl()
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
    return ProjectPackage.eINSTANCE.getRemaining();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DurationQuantity getRemaining()
  {
    return remaining;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRemaining(DurationQuantity newRemaining, NotificationChain msgs)
  {
    DurationQuantity oldRemaining = remaining;
    remaining = newRemaining;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProjectPackage.REMAINING__REMAINING, oldRemaining, newRemaining);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRemaining(DurationQuantity newRemaining)
  {
    if (newRemaining != remaining)
    {
      NotificationChain msgs = null;
      if (remaining != null)
        msgs = ((InternalEObject)remaining).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.REMAINING__REMAINING, null, msgs);
      if (newRemaining != null)
        msgs = ((InternalEObject)newRemaining).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.REMAINING__REMAINING, null, msgs);
      msgs = basicSetRemaining(newRemaining, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.REMAINING__REMAINING, newRemaining, newRemaining));
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
      case ProjectPackage.REMAINING__REMAINING:
        return basicSetRemaining(null, msgs);
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
      case ProjectPackage.REMAINING__REMAINING:
        return getRemaining();
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
      case ProjectPackage.REMAINING__REMAINING:
        setRemaining((DurationQuantity)newValue);
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
      case ProjectPackage.REMAINING__REMAINING:
        setRemaining((DurationQuantity)null);
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
      case ProjectPackage.REMAINING__REMAINING:
        return remaining != null;
    }
    return super.eIsSet(featureID);
  }

} //RemainingImpl
