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

import org.jjflyboy.tjpeditor.project.ProjectPackage;
import org.jjflyboy.tjpeditor.project.Report;
import org.jjflyboy.tjpeditor.project.ReportAttribute;
import org.jjflyboy.tjpeditor.project.SupplementReport;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supplement Report</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.SupplementReportImpl#getReport <em>Report</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.SupplementReportImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SupplementReportImpl extends PropertyImpl implements SupplementReport
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
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<ReportAttribute> attributes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SupplementReportImpl()
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
    return ProjectPackage.eINSTANCE.getSupplementReport();
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjectPackage.SUPPLEMENT_REPORT__REPORT, oldReport, report));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.SUPPLEMENT_REPORT__REPORT, oldReport, report));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ReportAttribute> getAttributes()
  {
    if (attributes == null)
    {
      attributes = new EObjectContainmentEList<ReportAttribute>(ReportAttribute.class, this, ProjectPackage.SUPPLEMENT_REPORT__ATTRIBUTES);
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
      case ProjectPackage.SUPPLEMENT_REPORT__ATTRIBUTES:
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
      case ProjectPackage.SUPPLEMENT_REPORT__REPORT:
        if (resolve) return getReport();
        return basicGetReport();
      case ProjectPackage.SUPPLEMENT_REPORT__ATTRIBUTES:
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
      case ProjectPackage.SUPPLEMENT_REPORT__REPORT:
        setReport((Report)newValue);
        return;
      case ProjectPackage.SUPPLEMENT_REPORT__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends ReportAttribute>)newValue);
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
      case ProjectPackage.SUPPLEMENT_REPORT__REPORT:
        setReport((Report)null);
        return;
      case ProjectPackage.SUPPLEMENT_REPORT__ATTRIBUTES:
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
      case ProjectPackage.SUPPLEMENT_REPORT__REPORT:
        return report != null;
      case ProjectPackage.SUPPLEMENT_REPORT__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SupplementReportImpl
