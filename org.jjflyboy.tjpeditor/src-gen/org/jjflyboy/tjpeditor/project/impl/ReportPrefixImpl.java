/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.jjflyboy.tjpeditor.project.ProjectPackage;
import org.jjflyboy.tjpeditor.project.Report;
import org.jjflyboy.tjpeditor.project.ReportPrefix;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Report Prefix</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.ReportPrefixImpl#getReport <em>Report</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReportPrefixImpl extends MinimalEObjectImpl.Container implements ReportPrefix
{
  /**
   * The cached value of the '{@link #getReport() <em>Report</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReport()
   * @generated
   * @ordered
   */
  protected Report report;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReportPrefixImpl()
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
    return ProjectPackage.eINSTANCE.getReportPrefix();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Report getReport()
  {
    if (report != null && report.eIsProxy())
    {
      InternalEObject oldReport = (InternalEObject)report;
      report = (Report)eResolveProxy(oldReport);
      if (report != oldReport)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjectPackage.REPORT_PREFIX__REPORT, oldReport, report));
      }
    }
    return report;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Report basicGetReport()
  {
    return report;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReport(Report newReport)
  {
    Report oldReport = report;
    report = newReport;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.REPORT_PREFIX__REPORT, oldReport, report));
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
      case ProjectPackage.REPORT_PREFIX__REPORT:
        if (resolve) return getReport();
        return basicGetReport();
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
      case ProjectPackage.REPORT_PREFIX__REPORT:
        setReport((Report)newValue);
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
      case ProjectPackage.REPORT_PREFIX__REPORT:
        setReport((Report)null);
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
      case ProjectPackage.REPORT_PREFIX__REPORT:
        return report != null;
    }
    return super.eIsSet(featureID);
  }

} //ReportPrefixImpl
