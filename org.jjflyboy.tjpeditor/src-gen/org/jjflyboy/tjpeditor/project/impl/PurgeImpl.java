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
import org.jjflyboy.tjpeditor.project.Purge;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Purge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.PurgeImpl#getListAttribute <em>List Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PurgeImpl extends TaskAttributeImpl implements Purge
{
  /**
   * The default value of the '{@link #getListAttribute() <em>List Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getListAttribute()
   * @generated
   * @ordered
   */
  protected static final String LIST_ATTRIBUTE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getListAttribute() <em>List Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getListAttribute()
   * @generated
   * @ordered
   */
  protected String listAttribute = LIST_ATTRIBUTE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PurgeImpl()
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
    return ProjectPackage.eINSTANCE.getPurge();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getListAttribute()
  {
    return listAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setListAttribute(String newListAttribute)
  {
    String oldListAttribute = listAttribute;
    listAttribute = newListAttribute;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.PURGE__LIST_ATTRIBUTE, oldListAttribute, listAttribute));
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
      case ProjectPackage.PURGE__LIST_ATTRIBUTE:
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
      case ProjectPackage.PURGE__LIST_ATTRIBUTE:
        setListAttribute((String)newValue);
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
      case ProjectPackage.PURGE__LIST_ATTRIBUTE:
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
      case ProjectPackage.PURGE__LIST_ATTRIBUTE:
        return LIST_ATTRIBUTE_EDEFAULT == null ? listAttribute != null : !LIST_ATTRIBUTE_EDEFAULT.equals(listAttribute);
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

} //PurgeImpl
