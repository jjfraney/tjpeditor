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
import org.jjflyboy.tjpeditor.project.ShortTimeFormat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Short Time Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.ShortTimeFormatImpl#getShortTimeFormat <em>Short Time Format</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ShortTimeFormatImpl extends ProjectAttributeImpl implements ShortTimeFormat
{
  /**
   * The default value of the '{@link #getShortTimeFormat() <em>Short Time Format</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShortTimeFormat()
   * @generated
   * @ordered
   */
  protected static final String SHORT_TIME_FORMAT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getShortTimeFormat() <em>Short Time Format</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShortTimeFormat()
   * @generated
   * @ordered
   */
  protected String shortTimeFormat = SHORT_TIME_FORMAT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ShortTimeFormatImpl()
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
    return ProjectPackage.eINSTANCE.getShortTimeFormat();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getShortTimeFormat()
  {
    return shortTimeFormat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setShortTimeFormat(String newShortTimeFormat)
  {
    String oldShortTimeFormat = shortTimeFormat;
    shortTimeFormat = newShortTimeFormat;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.SHORT_TIME_FORMAT__SHORT_TIME_FORMAT, oldShortTimeFormat, shortTimeFormat));
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
      case ProjectPackage.SHORT_TIME_FORMAT__SHORT_TIME_FORMAT:
        return getShortTimeFormat();
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
      case ProjectPackage.SHORT_TIME_FORMAT__SHORT_TIME_FORMAT:
        setShortTimeFormat((String)newValue);
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
      case ProjectPackage.SHORT_TIME_FORMAT__SHORT_TIME_FORMAT:
        setShortTimeFormat(SHORT_TIME_FORMAT_EDEFAULT);
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
      case ProjectPackage.SHORT_TIME_FORMAT__SHORT_TIME_FORMAT:
        return SHORT_TIME_FORMAT_EDEFAULT == null ? shortTimeFormat != null : !SHORT_TIME_FORMAT_EDEFAULT.equals(shortTimeFormat);
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
    result.append(" (shortTimeFormat: ");
    result.append(shortTimeFormat);
    result.append(')');
    return result.toString();
  }

} //ShortTimeFormatImpl
