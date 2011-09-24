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

import org.jjflyboy.tjpeditor.project.DateExtend;
import org.jjflyboy.tjpeditor.project.Extend;
import org.jjflyboy.tjpeditor.project.ProjectPackage;
import org.jjflyboy.tjpeditor.project.ReferenceExtend;
import org.jjflyboy.tjpeditor.project.RichTextExtend;
import org.jjflyboy.tjpeditor.project.TextExtend;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extend</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.ExtendImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.ExtendImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.ExtendImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.ExtendImpl#getRichtext <em>Richtext</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.ExtendImpl#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtendImpl extends MinimalEObjectImpl.Container implements Extend
{
  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getReference() <em>Reference</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReference()
   * @generated
   * @ordered
   */
  protected ReferenceExtend reference;

  /**
   * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDate()
   * @generated
   * @ordered
   */
  protected DateExtend date;

  /**
   * The cached value of the '{@link #getRichtext() <em>Richtext</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRichtext()
   * @generated
   * @ordered
   */
  protected RichTextExtend richtext;

  /**
   * The cached value of the '{@link #getText() <em>Text</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getText()
   * @generated
   * @ordered
   */
  protected TextExtend text;

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
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.EXTEND__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferenceExtend getReference()
  {
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReference(ReferenceExtend newReference, NotificationChain msgs)
  {
    ReferenceExtend oldReference = reference;
    reference = newReference;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProjectPackage.EXTEND__REFERENCE, oldReference, newReference);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReference(ReferenceExtend newReference)
  {
    if (newReference != reference)
    {
      NotificationChain msgs = null;
      if (reference != null)
        msgs = ((InternalEObject)reference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.EXTEND__REFERENCE, null, msgs);
      if (newReference != null)
        msgs = ((InternalEObject)newReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.EXTEND__REFERENCE, null, msgs);
      msgs = basicSetReference(newReference, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.EXTEND__REFERENCE, newReference, newReference));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DateExtend getDate()
  {
    return date;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDate(DateExtend newDate, NotificationChain msgs)
  {
    DateExtend oldDate = date;
    date = newDate;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProjectPackage.EXTEND__DATE, oldDate, newDate);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDate(DateExtend newDate)
  {
    if (newDate != date)
    {
      NotificationChain msgs = null;
      if (date != null)
        msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.EXTEND__DATE, null, msgs);
      if (newDate != null)
        msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.EXTEND__DATE, null, msgs);
      msgs = basicSetDate(newDate, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.EXTEND__DATE, newDate, newDate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichTextExtend getRichtext()
  {
    return richtext;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRichtext(RichTextExtend newRichtext, NotificationChain msgs)
  {
    RichTextExtend oldRichtext = richtext;
    richtext = newRichtext;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProjectPackage.EXTEND__RICHTEXT, oldRichtext, newRichtext);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRichtext(RichTextExtend newRichtext)
  {
    if (newRichtext != richtext)
    {
      NotificationChain msgs = null;
      if (richtext != null)
        msgs = ((InternalEObject)richtext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.EXTEND__RICHTEXT, null, msgs);
      if (newRichtext != null)
        msgs = ((InternalEObject)newRichtext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.EXTEND__RICHTEXT, null, msgs);
      msgs = basicSetRichtext(newRichtext, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.EXTEND__RICHTEXT, newRichtext, newRichtext));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextExtend getText()
  {
    return text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetText(TextExtend newText, NotificationChain msgs)
  {
    TextExtend oldText = text;
    text = newText;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProjectPackage.EXTEND__TEXT, oldText, newText);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setText(TextExtend newText)
  {
    if (newText != text)
    {
      NotificationChain msgs = null;
      if (text != null)
        msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.EXTEND__TEXT, null, msgs);
      if (newText != null)
        msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.EXTEND__TEXT, null, msgs);
      msgs = basicSetText(newText, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.EXTEND__TEXT, newText, newText));
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
      case ProjectPackage.EXTEND__REFERENCE:
        return basicSetReference(null, msgs);
      case ProjectPackage.EXTEND__DATE:
        return basicSetDate(null, msgs);
      case ProjectPackage.EXTEND__RICHTEXT:
        return basicSetRichtext(null, msgs);
      case ProjectPackage.EXTEND__TEXT:
        return basicSetText(null, msgs);
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
      case ProjectPackage.EXTEND__TYPE:
        return getType();
      case ProjectPackage.EXTEND__REFERENCE:
        return getReference();
      case ProjectPackage.EXTEND__DATE:
        return getDate();
      case ProjectPackage.EXTEND__RICHTEXT:
        return getRichtext();
      case ProjectPackage.EXTEND__TEXT:
        return getText();
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
      case ProjectPackage.EXTEND__TYPE:
        setType((String)newValue);
        return;
      case ProjectPackage.EXTEND__REFERENCE:
        setReference((ReferenceExtend)newValue);
        return;
      case ProjectPackage.EXTEND__DATE:
        setDate((DateExtend)newValue);
        return;
      case ProjectPackage.EXTEND__RICHTEXT:
        setRichtext((RichTextExtend)newValue);
        return;
      case ProjectPackage.EXTEND__TEXT:
        setText((TextExtend)newValue);
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
      case ProjectPackage.EXTEND__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case ProjectPackage.EXTEND__REFERENCE:
        setReference((ReferenceExtend)null);
        return;
      case ProjectPackage.EXTEND__DATE:
        setDate((DateExtend)null);
        return;
      case ProjectPackage.EXTEND__RICHTEXT:
        setRichtext((RichTextExtend)null);
        return;
      case ProjectPackage.EXTEND__TEXT:
        setText((TextExtend)null);
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
      case ProjectPackage.EXTEND__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case ProjectPackage.EXTEND__REFERENCE:
        return reference != null;
      case ProjectPackage.EXTEND__DATE:
        return date != null;
      case ProjectPackage.EXTEND__RICHTEXT:
        return richtext != null;
      case ProjectPackage.EXTEND__TEXT:
        return text != null;
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
    result.append(" (type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //ExtendImpl
