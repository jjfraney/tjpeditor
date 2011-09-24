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
import org.jjflyboy.tjpeditor.project.SelfContained;
import org.jjflyboy.tjpeditor.project.YesNo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Self Contained</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.SelfContainedImpl#getSelfcontained <em>Selfcontained</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SelfContainedImpl extends ReportAttributeImpl implements SelfContained
{
  /**
   * The default value of the '{@link #getSelfcontained() <em>Selfcontained</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelfcontained()
   * @generated
   * @ordered
   */
  protected static final YesNo SELFCONTAINED_EDEFAULT = YesNo.YES;

  /**
   * The cached value of the '{@link #getSelfcontained() <em>Selfcontained</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelfcontained()
   * @generated
   * @ordered
   */
  protected YesNo selfcontained = SELFCONTAINED_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SelfContainedImpl()
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
    return ProjectPackage.eINSTANCE.getSelfContained();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public YesNo getSelfcontained()
  {
    return selfcontained;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSelfcontained(YesNo newSelfcontained)
  {
    YesNo oldSelfcontained = selfcontained;
    selfcontained = newSelfcontained == null ? SELFCONTAINED_EDEFAULT : newSelfcontained;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.SELF_CONTAINED__SELFCONTAINED, oldSelfcontained, selfcontained));
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
      case ProjectPackage.SELF_CONTAINED__SELFCONTAINED:
        return getSelfcontained();
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
      case ProjectPackage.SELF_CONTAINED__SELFCONTAINED:
        setSelfcontained((YesNo)newValue);
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
      case ProjectPackage.SELF_CONTAINED__SELFCONTAINED:
        setSelfcontained(SELFCONTAINED_EDEFAULT);
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
      case ProjectPackage.SELF_CONTAINED__SELFCONTAINED:
        return selfcontained != SELFCONTAINED_EDEFAULT;
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
    result.append(" (selfcontained: ");
    result.append(selfcontained);
    result.append(')');
    return result.toString();
  }

} //SelfContainedImpl
