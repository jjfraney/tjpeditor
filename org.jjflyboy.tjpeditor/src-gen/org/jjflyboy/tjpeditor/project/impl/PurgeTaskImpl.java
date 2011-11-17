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
import org.jjflyboy.tjpeditor.project.PurgeTask;
import org.jjflyboy.tjpeditor.project.PurgeTaskAttribute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Purge Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.PurgeTaskImpl#getListAttribute <em>List Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PurgeTaskImpl extends TaskAttributeImpl implements PurgeTask
{
  /**
   * The default value of the '{@link #getListAttribute() <em>List Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getListAttribute()
   * @generated
   * @ordered
   */
  protected static final PurgeTaskAttribute LIST_ATTRIBUTE_EDEFAULT = PurgeTaskAttribute.BOOKING;

  /**
   * The cached value of the '{@link #getListAttribute() <em>List Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getListAttribute()
   * @generated
   * @ordered
   */
  protected PurgeTaskAttribute listAttribute = LIST_ATTRIBUTE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PurgeTaskImpl()
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
    return ProjectPackage.eINSTANCE.getPurgeTask();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PurgeTaskAttribute getListAttribute()
  {
    return listAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setListAttribute(PurgeTaskAttribute newListAttribute)
  {
    PurgeTaskAttribute oldListAttribute = listAttribute;
    listAttribute = newListAttribute == null ? LIST_ATTRIBUTE_EDEFAULT : newListAttribute;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.PURGE_TASK__LIST_ATTRIBUTE, oldListAttribute, listAttribute));
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
      case ProjectPackage.PURGE_TASK__LIST_ATTRIBUTE:
        return getListAttribute();
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
      case ProjectPackage.PURGE_TASK__LIST_ATTRIBUTE:
        setListAttribute((PurgeTaskAttribute)newValue);
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
      case ProjectPackage.PURGE_TASK__LIST_ATTRIBUTE:
        setListAttribute(LIST_ATTRIBUTE_EDEFAULT);
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
      case ProjectPackage.PURGE_TASK__LIST_ATTRIBUTE:
        return listAttribute != LIST_ATTRIBUTE_EDEFAULT;
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
    result.append(" (listAttribute: ");
    result.append(listAttribute);
    result.append(')');
    return result.toString();
  }

} //PurgeTaskImpl
