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
import org.jjflyboy.tjpeditor.project.RealFormat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Real Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.RealFormatImpl#getNegativePrefix <em>Negative Prefix</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.RealFormatImpl#getNegativeSuffix <em>Negative Suffix</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.RealFormatImpl#getThousandsSeparator <em>Thousands Separator</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.RealFormatImpl#getFractionSeparator <em>Fraction Separator</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.RealFormatImpl#getFractionDigits <em>Fraction Digits</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RealFormatImpl extends CurrencyFormatImpl implements RealFormat
{
  /**
   * The default value of the '{@link #getNegativePrefix() <em>Negative Prefix</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNegativePrefix()
   * @generated
   * @ordered
   */
  protected static final String NEGATIVE_PREFIX_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNegativePrefix() <em>Negative Prefix</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNegativePrefix()
   * @generated
   * @ordered
   */
  protected String negativePrefix = NEGATIVE_PREFIX_EDEFAULT;

  /**
   * The default value of the '{@link #getNegativeSuffix() <em>Negative Suffix</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNegativeSuffix()
   * @generated
   * @ordered
   */
  protected static final String NEGATIVE_SUFFIX_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNegativeSuffix() <em>Negative Suffix</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNegativeSuffix()
   * @generated
   * @ordered
   */
  protected String negativeSuffix = NEGATIVE_SUFFIX_EDEFAULT;

  /**
   * The default value of the '{@link #getThousandsSeparator() <em>Thousands Separator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThousandsSeparator()
   * @generated
   * @ordered
   */
  protected static final String THOUSANDS_SEPARATOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getThousandsSeparator() <em>Thousands Separator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThousandsSeparator()
   * @generated
   * @ordered
   */
  protected String thousandsSeparator = THOUSANDS_SEPARATOR_EDEFAULT;

  /**
   * The default value of the '{@link #getFractionSeparator() <em>Fraction Separator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFractionSeparator()
   * @generated
   * @ordered
   */
  protected static final String FRACTION_SEPARATOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFractionSeparator() <em>Fraction Separator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFractionSeparator()
   * @generated
   * @ordered
   */
  protected String fractionSeparator = FRACTION_SEPARATOR_EDEFAULT;

  /**
   * The default value of the '{@link #getFractionDigits() <em>Fraction Digits</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFractionDigits()
   * @generated
   * @ordered
   */
  protected static final int FRACTION_DIGITS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getFractionDigits() <em>Fraction Digits</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFractionDigits()
   * @generated
   * @ordered
   */
  protected int fractionDigits = FRACTION_DIGITS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RealFormatImpl()
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
    return ProjectPackage.eINSTANCE.getRealFormat();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNegativePrefix()
  {
    return negativePrefix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNegativePrefix(String newNegativePrefix)
  {
    String oldNegativePrefix = negativePrefix;
    negativePrefix = newNegativePrefix;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.REAL_FORMAT__NEGATIVE_PREFIX, oldNegativePrefix, negativePrefix));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNegativeSuffix()
  {
    return negativeSuffix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNegativeSuffix(String newNegativeSuffix)
  {
    String oldNegativeSuffix = negativeSuffix;
    negativeSuffix = newNegativeSuffix;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.REAL_FORMAT__NEGATIVE_SUFFIX, oldNegativeSuffix, negativeSuffix));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getThousandsSeparator()
  {
    return thousandsSeparator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThousandsSeparator(String newThousandsSeparator)
  {
    String oldThousandsSeparator = thousandsSeparator;
    thousandsSeparator = newThousandsSeparator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.REAL_FORMAT__THOUSANDS_SEPARATOR, oldThousandsSeparator, thousandsSeparator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFractionSeparator()
  {
    return fractionSeparator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFractionSeparator(String newFractionSeparator)
  {
    String oldFractionSeparator = fractionSeparator;
    fractionSeparator = newFractionSeparator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.REAL_FORMAT__FRACTION_SEPARATOR, oldFractionSeparator, fractionSeparator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getFractionDigits()
  {
    return fractionDigits;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFractionDigits(int newFractionDigits)
  {
    int oldFractionDigits = fractionDigits;
    fractionDigits = newFractionDigits;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.REAL_FORMAT__FRACTION_DIGITS, oldFractionDigits, fractionDigits));
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
      case ProjectPackage.REAL_FORMAT__NEGATIVE_PREFIX:
        return getNegativePrefix();
      case ProjectPackage.REAL_FORMAT__NEGATIVE_SUFFIX:
        return getNegativeSuffix();
      case ProjectPackage.REAL_FORMAT__THOUSANDS_SEPARATOR:
        return getThousandsSeparator();
      case ProjectPackage.REAL_FORMAT__FRACTION_SEPARATOR:
        return getFractionSeparator();
      case ProjectPackage.REAL_FORMAT__FRACTION_DIGITS:
        return getFractionDigits();
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
      case ProjectPackage.REAL_FORMAT__NEGATIVE_PREFIX:
        setNegativePrefix((String)newValue);
        return;
      case ProjectPackage.REAL_FORMAT__NEGATIVE_SUFFIX:
        setNegativeSuffix((String)newValue);
        return;
      case ProjectPackage.REAL_FORMAT__THOUSANDS_SEPARATOR:
        setThousandsSeparator((String)newValue);
        return;
      case ProjectPackage.REAL_FORMAT__FRACTION_SEPARATOR:
        setFractionSeparator((String)newValue);
        return;
      case ProjectPackage.REAL_FORMAT__FRACTION_DIGITS:
        setFractionDigits((Integer)newValue);
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
      case ProjectPackage.REAL_FORMAT__NEGATIVE_PREFIX:
        setNegativePrefix(NEGATIVE_PREFIX_EDEFAULT);
        return;
      case ProjectPackage.REAL_FORMAT__NEGATIVE_SUFFIX:
        setNegativeSuffix(NEGATIVE_SUFFIX_EDEFAULT);
        return;
      case ProjectPackage.REAL_FORMAT__THOUSANDS_SEPARATOR:
        setThousandsSeparator(THOUSANDS_SEPARATOR_EDEFAULT);
        return;
      case ProjectPackage.REAL_FORMAT__FRACTION_SEPARATOR:
        setFractionSeparator(FRACTION_SEPARATOR_EDEFAULT);
        return;
      case ProjectPackage.REAL_FORMAT__FRACTION_DIGITS:
        setFractionDigits(FRACTION_DIGITS_EDEFAULT);
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
      case ProjectPackage.REAL_FORMAT__NEGATIVE_PREFIX:
        return NEGATIVE_PREFIX_EDEFAULT == null ? negativePrefix != null : !NEGATIVE_PREFIX_EDEFAULT.equals(negativePrefix);
      case ProjectPackage.REAL_FORMAT__NEGATIVE_SUFFIX:
        return NEGATIVE_SUFFIX_EDEFAULT == null ? negativeSuffix != null : !NEGATIVE_SUFFIX_EDEFAULT.equals(negativeSuffix);
      case ProjectPackage.REAL_FORMAT__THOUSANDS_SEPARATOR:
        return THOUSANDS_SEPARATOR_EDEFAULT == null ? thousandsSeparator != null : !THOUSANDS_SEPARATOR_EDEFAULT.equals(thousandsSeparator);
      case ProjectPackage.REAL_FORMAT__FRACTION_SEPARATOR:
        return FRACTION_SEPARATOR_EDEFAULT == null ? fractionSeparator != null : !FRACTION_SEPARATOR_EDEFAULT.equals(fractionSeparator);
      case ProjectPackage.REAL_FORMAT__FRACTION_DIGITS:
        return fractionDigits != FRACTION_DIGITS_EDEFAULT;
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
    result.append(" (negativePrefix: ");
    result.append(negativePrefix);
    result.append(", negativeSuffix: ");
    result.append(negativeSuffix);
    result.append(", thousandsSeparator: ");
    result.append(thousandsSeparator);
    result.append(", fractionSeparator: ");
    result.append(fractionSeparator);
    result.append(", fractionDigits: ");
    result.append(fractionDigits);
    result.append(')');
    return result.toString();
  }

} //RealFormatImpl
