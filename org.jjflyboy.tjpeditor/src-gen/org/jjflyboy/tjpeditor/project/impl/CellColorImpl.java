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

import org.jjflyboy.tjpeditor.project.CellColor;
import org.jjflyboy.tjpeditor.project.ProjectPackage;
import org.jjflyboy.tjpeditor.project.RGB;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cell Color</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.CellColorImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.CellColorImpl#getColor <em>Color</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CellColorImpl extends ColumnAttributeImpl implements CellColor
{
  /**
   * The default value of the '{@link #getExpression() <em>Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected static final String EXPRESSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected String expression = EXPRESSION_EDEFAULT;

  /**
   * The cached value of the '{@link #getColor() <em>Color</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColor()
   * @generated
   * @ordered
   */
  protected RGB color;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CellColorImpl()
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
    return ProjectPackage.eINSTANCE.getCellColor();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(String newExpression)
  {
    String oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.CELL_COLOR__EXPRESSION, oldExpression, expression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RGB getColor()
  {
    return color;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetColor(RGB newColor, NotificationChain msgs)
  {
    RGB oldColor = color;
    color = newColor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProjectPackage.CELL_COLOR__COLOR, oldColor, newColor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColor(RGB newColor)
  {
    if (newColor != color)
    {
      NotificationChain msgs = null;
      if (color != null)
        msgs = ((InternalEObject)color).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.CELL_COLOR__COLOR, null, msgs);
      if (newColor != null)
        msgs = ((InternalEObject)newColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.CELL_COLOR__COLOR, null, msgs);
      msgs = basicSetColor(newColor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.CELL_COLOR__COLOR, newColor, newColor));
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
      case ProjectPackage.CELL_COLOR__COLOR:
        return basicSetColor(null, msgs);
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
      case ProjectPackage.CELL_COLOR__EXPRESSION:
        return getExpression();
      case ProjectPackage.CELL_COLOR__COLOR:
        return getColor();
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
      case ProjectPackage.CELL_COLOR__EXPRESSION:
        setExpression((String)newValue);
        return;
      case ProjectPackage.CELL_COLOR__COLOR:
        setColor((RGB)newValue);
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
      case ProjectPackage.CELL_COLOR__EXPRESSION:
        setExpression(EXPRESSION_EDEFAULT);
        return;
      case ProjectPackage.CELL_COLOR__COLOR:
        setColor((RGB)null);
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
      case ProjectPackage.CELL_COLOR__EXPRESSION:
        return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
      case ProjectPackage.CELL_COLOR__COLOR:
        return color != null;
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
    result.append(" (expression: ");
    result.append(expression);
    result.append(')');
    return result.toString();
  }

} //CellColorImpl
