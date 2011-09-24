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

import org.jjflyboy.tjpeditor.project.ProjectPackage;
import org.jjflyboy.tjpeditor.project.Scenario;
import org.jjflyboy.tjpeditor.project.YesNo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.ScenarioImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.ScenarioImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.ScenarioImpl#getActive <em>Active</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.ScenarioImpl#getScenario <em>Scenario</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScenarioImpl extends ProjectAttributeImpl implements Scenario
{
  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getActive() <em>Active</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActive()
   * @generated
   * @ordered
   */
  protected static final YesNo ACTIVE_EDEFAULT = YesNo.YES;

  /**
   * The cached value of the '{@link #getActive() <em>Active</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActive()
   * @generated
   * @ordered
   */
  protected YesNo active = ACTIVE_EDEFAULT;

  /**
   * The cached value of the '{@link #getScenario() <em>Scenario</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScenario()
   * @generated
   * @ordered
   */
  protected Scenario scenario;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ScenarioImpl()
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
    return ProjectPackage.eINSTANCE.getScenario();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.SCENARIO__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.SCENARIO__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public YesNo getActive()
  {
    return active;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActive(YesNo newActive)
  {
    YesNo oldActive = active;
    active = newActive == null ? ACTIVE_EDEFAULT : newActive;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.SCENARIO__ACTIVE, oldActive, active));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Scenario getScenario()
  {
    return scenario;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetScenario(Scenario newScenario, NotificationChain msgs)
  {
    Scenario oldScenario = scenario;
    scenario = newScenario;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProjectPackage.SCENARIO__SCENARIO, oldScenario, newScenario);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setScenario(Scenario newScenario)
  {
    if (newScenario != scenario)
    {
      NotificationChain msgs = null;
      if (scenario != null)
        msgs = ((InternalEObject)scenario).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.SCENARIO__SCENARIO, null, msgs);
      if (newScenario != null)
        msgs = ((InternalEObject)newScenario).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.SCENARIO__SCENARIO, null, msgs);
      msgs = basicSetScenario(newScenario, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.SCENARIO__SCENARIO, newScenario, newScenario));
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
      case ProjectPackage.SCENARIO__SCENARIO:
        return basicSetScenario(null, msgs);
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
      case ProjectPackage.SCENARIO__ID:
        return getId();
      case ProjectPackage.SCENARIO__NAME:
        return getName();
      case ProjectPackage.SCENARIO__ACTIVE:
        return getActive();
      case ProjectPackage.SCENARIO__SCENARIO:
        return getScenario();
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
      case ProjectPackage.SCENARIO__ID:
        setId((String)newValue);
        return;
      case ProjectPackage.SCENARIO__NAME:
        setName((String)newValue);
        return;
      case ProjectPackage.SCENARIO__ACTIVE:
        setActive((YesNo)newValue);
        return;
      case ProjectPackage.SCENARIO__SCENARIO:
        setScenario((Scenario)newValue);
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
      case ProjectPackage.SCENARIO__ID:
        setId(ID_EDEFAULT);
        return;
      case ProjectPackage.SCENARIO__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ProjectPackage.SCENARIO__ACTIVE:
        setActive(ACTIVE_EDEFAULT);
        return;
      case ProjectPackage.SCENARIO__SCENARIO:
        setScenario((Scenario)null);
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
      case ProjectPackage.SCENARIO__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case ProjectPackage.SCENARIO__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ProjectPackage.SCENARIO__ACTIVE:
        return active != ACTIVE_EDEFAULT;
      case ProjectPackage.SCENARIO__SCENARIO:
        return scenario != null;
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
    result.append(" (id: ");
    result.append(id);
    result.append(", name: ");
    result.append(name);
    result.append(", active: ");
    result.append(active);
    result.append(')');
    return result.toString();
  }

} //ScenarioImpl
