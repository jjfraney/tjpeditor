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

import org.jjflyboy.tjpeditor.project.ColumnId;
import org.jjflyboy.tjpeditor.project.Criterion;
import org.jjflyboy.tjpeditor.project.CriterionDirection;
import org.jjflyboy.tjpeditor.project.ProjectPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Criterion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.CriterionImpl#getColumnId <em>Column Id</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.CriterionImpl#getDirection <em>Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CriterionImpl extends MinimalEObjectImpl.Container implements Criterion
{
  /**
   * The default value of the '{@link #getColumnId() <em>Column Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumnId()
   * @generated
   * @ordered
   */
  protected static final ColumnId COLUMN_ID_EDEFAULT = ColumnId.ALERT;

  /**
   * The cached value of the '{@link #getColumnId() <em>Column Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumnId()
   * @generated
   * @ordered
   */
  protected ColumnId columnId = COLUMN_ID_EDEFAULT;

  /**
   * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirection()
   * @generated
   * @ordered
   */
  protected static final CriterionDirection DIRECTION_EDEFAULT = CriterionDirection.UP;

  /**
   * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirection()
   * @generated
   * @ordered
   */
  protected CriterionDirection direction = DIRECTION_EDEFAULT;

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
  public ColumnId getColumnId()
  {
    return columnId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColumnId(ColumnId newColumnId)
  {
    ColumnId oldColumnId = columnId;
    columnId = newColumnId == null ? COLUMN_ID_EDEFAULT : newColumnId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.CRITERION__COLUMN_ID, oldColumnId, columnId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CriterionDirection getDirection()
  {
    return direction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDirection(CriterionDirection newDirection)
  {
    CriterionDirection oldDirection = direction;
    direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.CRITERION__DIRECTION, oldDirection, direction));
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
      case ProjectPackage.CRITERION__COLUMN_ID:
        return getColumnId();
      case ProjectPackage.CRITERION__DIRECTION:
        return getDirection();
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
      case ProjectPackage.CRITERION__COLUMN_ID:
        setColumnId((ColumnId)newValue);
        return;
      case ProjectPackage.CRITERION__DIRECTION:
        setDirection((CriterionDirection)newValue);
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
      case ProjectPackage.CRITERION__COLUMN_ID:
        setColumnId(COLUMN_ID_EDEFAULT);
        return;
      case ProjectPackage.CRITERION__DIRECTION:
        setDirection(DIRECTION_EDEFAULT);
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
      case ProjectPackage.CRITERION__COLUMN_ID:
        return columnId != COLUMN_ID_EDEFAULT;
      case ProjectPackage.CRITERION__DIRECTION:
        return direction != DIRECTION_EDEFAULT;
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
    result.append(" (columnId: ");
    result.append(columnId);
    result.append(", direction: ");
    result.append(direction);
    result.append(')');
    return result.toString();
  }

} //CriterionImpl
