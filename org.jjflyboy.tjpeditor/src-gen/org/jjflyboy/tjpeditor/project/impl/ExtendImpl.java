/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.jjflyboy.tjpeditor.project.Extend;
import org.jjflyboy.tjpeditor.project.ProjectPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extend</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.ExtendImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.ExtendImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.ExtendImpl#isInherit <em>Inherit</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.ExtendImpl#isScenariospecific <em>Scenariospecific</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtendImpl extends MinimalEObjectImpl.Container implements Extend
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
   * The default value of the '{@link #isInherit() <em>Inherit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInherit()
   * @generated
   * @ordered
   */
  protected static final boolean INHERIT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isInherit() <em>Inherit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInherit()
   * @generated
   * @ordered
   */
  protected boolean inherit = INHERIT_EDEFAULT;

  /**
   * The default value of the '{@link #isScenariospecific() <em>Scenariospecific</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isScenariospecific()
   * @generated
   * @ordered
   */
  protected static final boolean SCENARIOSPECIFIC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isScenariospecific() <em>Scenariospecific</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isScenariospecific()
   * @generated
   * @ordered
   */
  protected boolean scenariospecific = SCENARIOSPECIFIC_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExtendImpl()
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
    return ProjectPackage.eINSTANCE.getExtend();
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
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.EXTEND__ID, oldId, id));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.EXTEND__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isInherit()
  {
    return inherit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInherit(boolean newInherit)
  {
    boolean oldInherit = inherit;
    inherit = newInherit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.EXTEND__INHERIT, oldInherit, inherit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isScenariospecific()
  {
    return scenariospecific;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setScenariospecific(boolean newScenariospecific)
  {
    boolean oldScenariospecific = scenariospecific;
    scenariospecific = newScenariospecific;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.EXTEND__SCENARIOSPECIFIC, oldScenariospecific, scenariospecific));
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
      case ProjectPackage.EXTEND__ID:
        return getId();
      case ProjectPackage.EXTEND__NAME:
        return getName();
      case ProjectPackage.EXTEND__INHERIT:
        return isInherit();
      case ProjectPackage.EXTEND__SCENARIOSPECIFIC:
        return isScenariospecific();
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
      case ProjectPackage.EXTEND__ID:
        setId((String)newValue);
        return;
      case ProjectPackage.EXTEND__NAME:
        setName((String)newValue);
        return;
      case ProjectPackage.EXTEND__INHERIT:
        setInherit((Boolean)newValue);
        return;
      case ProjectPackage.EXTEND__SCENARIOSPECIFIC:
        setScenariospecific((Boolean)newValue);
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
      case ProjectPackage.EXTEND__ID:
        setId(ID_EDEFAULT);
        return;
      case ProjectPackage.EXTEND__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ProjectPackage.EXTEND__INHERIT:
        setInherit(INHERIT_EDEFAULT);
        return;
      case ProjectPackage.EXTEND__SCENARIOSPECIFIC:
        setScenariospecific(SCENARIOSPECIFIC_EDEFAULT);
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
      case ProjectPackage.EXTEND__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case ProjectPackage.EXTEND__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ProjectPackage.EXTEND__INHERIT:
        return inherit != INHERIT_EDEFAULT;
      case ProjectPackage.EXTEND__SCENARIOSPECIFIC:
        return scenariospecific != SCENARIOSPECIFIC_EDEFAULT;
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
    result.append(", inherit: ");
    result.append(inherit);
    result.append(", scenariospecific: ");
    result.append(scenariospecific);
    result.append(')');
    return result.toString();
  }

} //ExtendImpl
