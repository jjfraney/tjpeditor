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
import org.jjflyboy.tjpeditor.project.PurgeReport;
import org.jjflyboy.tjpeditor.project.PurgeReportAttribute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Purge Report</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.PurgeReportImpl#getListAttribute <em>List Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PurgeReportImpl extends ReportAttributeImpl implements PurgeReport
{
  /**
   * The default value of the '{@link #getListAttribute() <em>List Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getListAttribute()
   * @generated
   * @ordered
   */
  protected static final PurgeReportAttribute LIST_ATTRIBUTE_EDEFAULT = PurgeReportAttribute.COLUMNS;

  /**
   * The cached value of the '{@link #getListAttribute() <em>List Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getListAttribute()
   * @generated
   * @ordered
   */
  protected PurgeReportAttribute listAttribute = LIST_ATTRIBUTE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PurgeReportImpl()
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
    return ProjectPackage.eINSTANCE.getPurgeReport();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PurgeReportAttribute getListAttribute()
  {
    return listAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setListAttribute(PurgeReportAttribute newListAttribute)
  {
    PurgeReportAttribute oldListAttribute = listAttribute;
    listAttribute = newListAttribute == null ? LIST_ATTRIBUTE_EDEFAULT : newListAttribute;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.PURGE_REPORT__LIST_ATTRIBUTE, oldListAttribute, listAttribute));
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
      case ProjectPackage.PURGE_REPORT__LIST_ATTRIBUTE:
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
      case ProjectPackage.PURGE_REPORT__LIST_ATTRIBUTE:
        setListAttribute((PurgeReportAttribute)newValue);
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
      case ProjectPackage.PURGE_REPORT__LIST_ATTRIBUTE:
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
      case ProjectPackage.PURGE_REPORT__LIST_ATTRIBUTE:
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

} //PurgeReportImpl
