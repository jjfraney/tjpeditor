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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.jjflyboy.tjpeditor.project.Criterion;
import org.jjflyboy.tjpeditor.project.CriterionId;
import org.jjflyboy.tjpeditor.project.ProjectPackage;
import org.jjflyboy.tjpeditor.project.Scenario;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Criterion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.CriterionImpl#getScenario <em>Scenario</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.CriterionImpl#getCriterionId <em>Criterion Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CriterionImpl extends MinimalEObjectImpl.Container implements Criterion
{
  /**
   * The cached value of the '{@link #getScenario() <em>Scenario</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScenario()
   * @generated
   * @ordered
   */
  protected Scenario scenario;

  /**
   * The cached value of the '{@link #getCriterionId() <em>Criterion Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCriterionId()
   * @generated
   * @ordered
   */
  protected CriterionId criterionId;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CriterionImpl()
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
    return ProjectPackage.eINSTANCE.getCriterion();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Scenario getScenario()
  {
    if (scenario != null && scenario.eIsProxy())
    {
      InternalEObject oldScenario = (InternalEObject)scenario;
      scenario = (Scenario)eResolveProxy(oldScenario);
      if (scenario != oldScenario)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjectPackage.CRITERION__SCENARIO, oldScenario, scenario));
      }
    }
    return scenario;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Scenario basicGetScenario()
  {
    return scenario;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setScenario(Scenario newScenario)
  {
    Scenario oldScenario = scenario;
    scenario = newScenario;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.CRITERION__SCENARIO, oldScenario, scenario));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CriterionId getCriterionId()
  {
    return criterionId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCriterionId(CriterionId newCriterionId, NotificationChain msgs)
  {
    CriterionId oldCriterionId = criterionId;
    criterionId = newCriterionId;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProjectPackage.CRITERION__CRITERION_ID, oldCriterionId, newCriterionId);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCriterionId(CriterionId newCriterionId)
  {
    if (newCriterionId != criterionId)
    {
      NotificationChain msgs = null;
      if (criterionId != null)
        msgs = ((InternalEObject)criterionId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.CRITERION__CRITERION_ID, null, msgs);
      if (newCriterionId != null)
        msgs = ((InternalEObject)newCriterionId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.CRITERION__CRITERION_ID, null, msgs);
      msgs = basicSetCriterionId(newCriterionId, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.CRITERION__CRITERION_ID, newCriterionId, newCriterionId));
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
      case ProjectPackage.CRITERION__CRITERION_ID:
        return basicSetCriterionId(null, msgs);
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
      case ProjectPackage.CRITERION__SCENARIO:
        if (resolve) return getScenario();
        return basicGetScenario();
      case ProjectPackage.CRITERION__CRITERION_ID:
        return getCriterionId();
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
      case ProjectPackage.CRITERION__SCENARIO:
        setScenario((Scenario)newValue);
        return;
      case ProjectPackage.CRITERION__CRITERION_ID:
        setCriterionId((CriterionId)newValue);
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
      case ProjectPackage.CRITERION__SCENARIO:
        setScenario((Scenario)null);
        return;
      case ProjectPackage.CRITERION__CRITERION_ID:
        setCriterionId((CriterionId)null);
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
      case ProjectPackage.CRITERION__SCENARIO:
        return scenario != null;
      case ProjectPackage.CRITERION__CRITERION_ID:
        return criterionId != null;
    }
    return super.eIsSet(featureID);
  }

} //CriterionImpl
