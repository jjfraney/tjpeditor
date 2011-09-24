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
import org.jjflyboy.tjpeditor.project.TimingResolution;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timing Resolution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.TimingResolutionImpl#getTimingResolution <em>Timing Resolution</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimingResolutionImpl extends ProjectAttributeImpl implements TimingResolution
{
  /**
   * The default value of the '{@link #getTimingResolution() <em>Timing Resolution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimingResolution()
   * @generated
   * @ordered
   */
  protected static final int TIMING_RESOLUTION_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getTimingResolution() <em>Timing Resolution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimingResolution()
   * @generated
   * @ordered
   */
  protected int timingResolution = TIMING_RESOLUTION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TimingResolutionImpl()
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
    return ProjectPackage.eINSTANCE.getTimingResolution();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getTimingResolution()
  {
    return timingResolution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTimingResolution(int newTimingResolution)
  {
    int oldTimingResolution = timingResolution;
    timingResolution = newTimingResolution;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.TIMING_RESOLUTION__TIMING_RESOLUTION, oldTimingResolution, timingResolution));
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
      case ProjectPackage.TIMING_RESOLUTION__TIMING_RESOLUTION:
        return getTimingResolution();
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
      case ProjectPackage.TIMING_RESOLUTION__TIMING_RESOLUTION:
        setTimingResolution((Integer)newValue);
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
      case ProjectPackage.TIMING_RESOLUTION__TIMING_RESOLUTION:
        setTimingResolution(TIMING_RESOLUTION_EDEFAULT);
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
      case ProjectPackage.TIMING_RESOLUTION__TIMING_RESOLUTION:
        return timingResolution != TIMING_RESOLUTION_EDEFAULT;
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
    result.append(" (timingResolution: ");
    result.append(timingResolution);
    result.append(')');
    return result.toString();
  }

} //TimingResolutionImpl
