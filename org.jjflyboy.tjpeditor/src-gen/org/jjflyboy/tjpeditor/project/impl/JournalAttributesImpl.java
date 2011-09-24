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

import org.jjflyboy.tjpeditor.project.JournalAttributes;
import org.jjflyboy.tjpeditor.project.ProjectPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Journal Attributes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.JournalAttributesImpl#isAll <em>All</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.JournalAttributesImpl#isNone <em>None</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.JournalAttributesImpl#isFlags <em>Flags</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.JournalAttributesImpl#isProperty <em>Property</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.JournalAttributesImpl#isDetails <em>Details</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.JournalAttributesImpl#isAuthor <em>Author</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.JournalAttributesImpl#isHeadline <em>Headline</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.JournalAttributesImpl#isDate <em>Date</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.JournalAttributesImpl#isTimesheet <em>Timesheet</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.JournalAttributesImpl#isPropertyid <em>Propertyid</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.JournalAttributesImpl#isSummary <em>Summary</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JournalAttributesImpl extends MinimalEObjectImpl.Container implements JournalAttributes
{
  /**
   * The default value of the '{@link #isAll() <em>All</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAll()
   * @generated
   * @ordered
   */
  protected static final boolean ALL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAll() <em>All</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAll()
   * @generated
   * @ordered
   */
  protected boolean all = ALL_EDEFAULT;

  /**
   * The default value of the '{@link #isNone() <em>None</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNone()
   * @generated
   * @ordered
   */
  protected static final boolean NONE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNone() <em>None</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNone()
   * @generated
   * @ordered
   */
  protected boolean none = NONE_EDEFAULT;

  /**
   * The default value of the '{@link #isFlags() <em>Flags</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFlags()
   * @generated
   * @ordered
   */
  protected static final boolean FLAGS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isFlags() <em>Flags</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFlags()
   * @generated
   * @ordered
   */
  protected boolean flags = FLAGS_EDEFAULT;

  /**
   * The default value of the '{@link #isProperty() <em>Property</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isProperty()
   * @generated
   * @ordered
   */
  protected static final boolean PROPERTY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isProperty() <em>Property</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isProperty()
   * @generated
   * @ordered
   */
  protected boolean property = PROPERTY_EDEFAULT;

  /**
   * The default value of the '{@link #isDetails() <em>Details</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDetails()
   * @generated
   * @ordered
   */
  protected static final boolean DETAILS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDetails() <em>Details</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDetails()
   * @generated
   * @ordered
   */
  protected boolean details = DETAILS_EDEFAULT;

  /**
   * The default value of the '{@link #isAuthor() <em>Author</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAuthor()
   * @generated
   * @ordered
   */
  protected static final boolean AUTHOR_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAuthor() <em>Author</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAuthor()
   * @generated
   * @ordered
   */
  protected boolean author = AUTHOR_EDEFAULT;

  /**
   * The default value of the '{@link #isHeadline() <em>Headline</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHeadline()
   * @generated
   * @ordered
   */
  protected static final boolean HEADLINE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHeadline() <em>Headline</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHeadline()
   * @generated
   * @ordered
   */
  protected boolean headline = HEADLINE_EDEFAULT;

  /**
   * The default value of the '{@link #isDate() <em>Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDate()
   * @generated
   * @ordered
   */
  protected static final boolean DATE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDate() <em>Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDate()
   * @generated
   * @ordered
   */
  protected boolean date = DATE_EDEFAULT;

  /**
   * The default value of the '{@link #isTimesheet() <em>Timesheet</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTimesheet()
   * @generated
   * @ordered
   */
  protected static final boolean TIMESHEET_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isTimesheet() <em>Timesheet</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTimesheet()
   * @generated
   * @ordered
   */
  protected boolean timesheet = TIMESHEET_EDEFAULT;

  /**
   * The default value of the '{@link #isPropertyid() <em>Propertyid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPropertyid()
   * @generated
   * @ordered
   */
  protected static final boolean PROPERTYID_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPropertyid() <em>Propertyid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPropertyid()
   * @generated
   * @ordered
   */
  protected boolean propertyid = PROPERTYID_EDEFAULT;

  /**
   * The default value of the '{@link #isSummary() <em>Summary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSummary()
   * @generated
   * @ordered
   */
  protected static final boolean SUMMARY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSummary() <em>Summary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSummary()
   * @generated
   * @ordered
   */
  protected boolean summary = SUMMARY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JournalAttributesImpl()
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
    return ProjectPackage.eINSTANCE.getJournalAttributes();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAll()
  {
    return all;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAll(boolean newAll)
  {
    boolean oldAll = all;
    all = newAll;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.JOURNAL_ATTRIBUTES__ALL, oldAll, all));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNone()
  {
    return none;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNone(boolean newNone)
  {
    boolean oldNone = none;
    none = newNone;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.JOURNAL_ATTRIBUTES__NONE, oldNone, none));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isFlags()
  {
    return flags;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFlags(boolean newFlags)
  {
    boolean oldFlags = flags;
    flags = newFlags;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.JOURNAL_ATTRIBUTES__FLAGS, oldFlags, flags));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isProperty()
  {
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProperty(boolean newProperty)
  {
    boolean oldProperty = property;
    property = newProperty;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.JOURNAL_ATTRIBUTES__PROPERTY, oldProperty, property));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDetails()
  {
    return details;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDetails(boolean newDetails)
  {
    boolean oldDetails = details;
    details = newDetails;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.JOURNAL_ATTRIBUTES__DETAILS, oldDetails, details));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAuthor()
  {
    return author;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAuthor(boolean newAuthor)
  {
    boolean oldAuthor = author;
    author = newAuthor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.JOURNAL_ATTRIBUTES__AUTHOR, oldAuthor, author));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHeadline()
  {
    return headline;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHeadline(boolean newHeadline)
  {
    boolean oldHeadline = headline;
    headline = newHeadline;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.JOURNAL_ATTRIBUTES__HEADLINE, oldHeadline, headline));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDate()
  {
    return date;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDate(boolean newDate)
  {
    boolean oldDate = date;
    date = newDate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.JOURNAL_ATTRIBUTES__DATE, oldDate, date));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isTimesheet()
  {
    return timesheet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTimesheet(boolean newTimesheet)
  {
    boolean oldTimesheet = timesheet;
    timesheet = newTimesheet;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.JOURNAL_ATTRIBUTES__TIMESHEET, oldTimesheet, timesheet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPropertyid()
  {
    return propertyid;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPropertyid(boolean newPropertyid)
  {
    boolean oldPropertyid = propertyid;
    propertyid = newPropertyid;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.JOURNAL_ATTRIBUTES__PROPERTYID, oldPropertyid, propertyid));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSummary()
  {
    return summary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSummary(boolean newSummary)
  {
    boolean oldSummary = summary;
    summary = newSummary;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.JOURNAL_ATTRIBUTES__SUMMARY, oldSummary, summary));
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
      case ProjectPackage.JOURNAL_ATTRIBUTES__ALL:
        return isAll();
      case ProjectPackage.JOURNAL_ATTRIBUTES__NONE:
        return isNone();
      case ProjectPackage.JOURNAL_ATTRIBUTES__FLAGS:
        return isFlags();
      case ProjectPackage.JOURNAL_ATTRIBUTES__PROPERTY:
        return isProperty();
      case ProjectPackage.JOURNAL_ATTRIBUTES__DETAILS:
        return isDetails();
      case ProjectPackage.JOURNAL_ATTRIBUTES__AUTHOR:
        return isAuthor();
      case ProjectPackage.JOURNAL_ATTRIBUTES__HEADLINE:
        return isHeadline();
      case ProjectPackage.JOURNAL_ATTRIBUTES__DATE:
        return isDate();
      case ProjectPackage.JOURNAL_ATTRIBUTES__TIMESHEET:
        return isTimesheet();
      case ProjectPackage.JOURNAL_ATTRIBUTES__PROPERTYID:
        return isPropertyid();
      case ProjectPackage.JOURNAL_ATTRIBUTES__SUMMARY:
        return isSummary();
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
      case ProjectPackage.JOURNAL_ATTRIBUTES__ALL:
        setAll((Boolean)newValue);
        return;
      case ProjectPackage.JOURNAL_ATTRIBUTES__NONE:
        setNone((Boolean)newValue);
        return;
      case ProjectPackage.JOURNAL_ATTRIBUTES__FLAGS:
        setFlags((Boolean)newValue);
        return;
      case ProjectPackage.JOURNAL_ATTRIBUTES__PROPERTY:
        setProperty((Boolean)newValue);
        return;
      case ProjectPackage.JOURNAL_ATTRIBUTES__DETAILS:
        setDetails((Boolean)newValue);
        return;
      case ProjectPackage.JOURNAL_ATTRIBUTES__AUTHOR:
        setAuthor((Boolean)newValue);
        return;
      case ProjectPackage.JOURNAL_ATTRIBUTES__HEADLINE:
        setHeadline((Boolean)newValue);
        return;
      case ProjectPackage.JOURNAL_ATTRIBUTES__DATE:
        setDate((Boolean)newValue);
        return;
      case ProjectPackage.JOURNAL_ATTRIBUTES__TIMESHEET:
        setTimesheet((Boolean)newValue);
        return;
      case ProjectPackage.JOURNAL_ATTRIBUTES__PROPERTYID:
        setPropertyid((Boolean)newValue);
        return;
      case ProjectPackage.JOURNAL_ATTRIBUTES__SUMMARY:
        setSummary((Boolean)newValue);
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
      case ProjectPackage.JOURNAL_ATTRIBUTES__ALL:
        setAll(ALL_EDEFAULT);
        return;
      case ProjectPackage.JOURNAL_ATTRIBUTES__NONE:
        setNone(NONE_EDEFAULT);
        return;
      case ProjectPackage.JOURNAL_ATTRIBUTES__FLAGS:
        setFlags(FLAGS_EDEFAULT);
        return;
      case ProjectPackage.JOURNAL_ATTRIBUTES__PROPERTY:
        setProperty(PROPERTY_EDEFAULT);
        return;
      case ProjectPackage.JOURNAL_ATTRIBUTES__DETAILS:
        setDetails(DETAILS_EDEFAULT);
        return;
      case ProjectPackage.JOURNAL_ATTRIBUTES__AUTHOR:
        setAuthor(AUTHOR_EDEFAULT);
        return;
      case ProjectPackage.JOURNAL_ATTRIBUTES__HEADLINE:
        setHeadline(HEADLINE_EDEFAULT);
        return;
      case ProjectPackage.JOURNAL_ATTRIBUTES__DATE:
        setDate(DATE_EDEFAULT);
        return;
      case ProjectPackage.JOURNAL_ATTRIBUTES__TIMESHEET:
        setTimesheet(TIMESHEET_EDEFAULT);
        return;
      case ProjectPackage.JOURNAL_ATTRIBUTES__PROPERTYID:
        setPropertyid(PROPERTYID_EDEFAULT);
        return;
      case ProjectPackage.JOURNAL_ATTRIBUTES__SUMMARY:
        setSummary(SUMMARY_EDEFAULT);
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
      case ProjectPackage.JOURNAL_ATTRIBUTES__ALL:
        return all != ALL_EDEFAULT;
      case ProjectPackage.JOURNAL_ATTRIBUTES__NONE:
        return none != NONE_EDEFAULT;
      case ProjectPackage.JOURNAL_ATTRIBUTES__FLAGS:
        return flags != FLAGS_EDEFAULT;
      case ProjectPackage.JOURNAL_ATTRIBUTES__PROPERTY:
        return property != PROPERTY_EDEFAULT;
      case ProjectPackage.JOURNAL_ATTRIBUTES__DETAILS:
        return details != DETAILS_EDEFAULT;
      case ProjectPackage.JOURNAL_ATTRIBUTES__AUTHOR:
        return author != AUTHOR_EDEFAULT;
      case ProjectPackage.JOURNAL_ATTRIBUTES__HEADLINE:
        return headline != HEADLINE_EDEFAULT;
      case ProjectPackage.JOURNAL_ATTRIBUTES__DATE:
        return date != DATE_EDEFAULT;
      case ProjectPackage.JOURNAL_ATTRIBUTES__TIMESHEET:
        return timesheet != TIMESHEET_EDEFAULT;
      case ProjectPackage.JOURNAL_ATTRIBUTES__PROPERTYID:
        return propertyid != PROPERTYID_EDEFAULT;
      case ProjectPackage.JOURNAL_ATTRIBUTES__SUMMARY:
        return summary != SUMMARY_EDEFAULT;
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
    result.append(" (all: ");
    result.append(all);
    result.append(", none: ");
    result.append(none);
    result.append(", flags: ");
    result.append(flags);
    result.append(", property: ");
    result.append(property);
    result.append(", details: ");
    result.append(details);
    result.append(", author: ");
    result.append(author);
    result.append(", headline: ");
    result.append(headline);
    result.append(", date: ");
    result.append(date);
    result.append(", timesheet: ");
    result.append(timesheet);
    result.append(", propertyid: ");
    result.append(propertyid);
    result.append(", summary: ");
    result.append(summary);
    result.append(')');
    return result.toString();
  }

} //JournalAttributesImpl
