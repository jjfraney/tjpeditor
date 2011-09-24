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

import org.jjflyboy.tjpeditor.project.Alert;
import org.jjflyboy.tjpeditor.project.Author;
import org.jjflyboy.tjpeditor.project.Details;
import org.jjflyboy.tjpeditor.project.JournalEntry;
import org.jjflyboy.tjpeditor.project.ProjectPackage;
import org.jjflyboy.tjpeditor.project.Summary;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Journal Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.JournalEntryImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.JournalEntryImpl#getHeadline <em>Headline</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.JournalEntryImpl#getAlert <em>Alert</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.JournalEntryImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.JournalEntryImpl#getDetails <em>Details</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.JournalEntryImpl#getSummary <em>Summary</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JournalEntryImpl extends ProjectAttributeImpl implements JournalEntry
{
  /**
   * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDate()
   * @generated
   * @ordered
   */
  protected static final String DATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDate()
   * @generated
   * @ordered
   */
  protected String date = DATE_EDEFAULT;

  /**
   * The default value of the '{@link #getHeadline() <em>Headline</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeadline()
   * @generated
   * @ordered
   */
  protected static final String HEADLINE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHeadline() <em>Headline</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeadline()
   * @generated
   * @ordered
   */
  protected String headline = HEADLINE_EDEFAULT;

  /**
   * The cached value of the '{@link #getAlert() <em>Alert</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlert()
   * @generated
   * @ordered
   */
  protected Alert alert;

  /**
   * The cached value of the '{@link #getAuthor() <em>Author</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAuthor()
   * @generated
   * @ordered
   */
  protected Author author;

  /**
   * The cached value of the '{@link #getDetails() <em>Details</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDetails()
   * @generated
   * @ordered
   */
  protected Details details;

  /**
   * The cached value of the '{@link #getSummary() <em>Summary</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSummary()
   * @generated
   * @ordered
   */
  protected Summary summary;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JournalEntryImpl()
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
    return ProjectPackage.eINSTANCE.getJournalEntry();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDate()
  {
    return date;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDate(String newDate)
  {
    String oldDate = date;
    date = newDate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.JOURNAL_ENTRY__DATE, oldDate, date));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHeadline()
  {
    return headline;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHeadline(String newHeadline)
  {
    String oldHeadline = headline;
    headline = newHeadline;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.JOURNAL_ENTRY__HEADLINE, oldHeadline, headline));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Alert getAlert()
  {
    return alert;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAlert(Alert newAlert, NotificationChain msgs)
  {
    Alert oldAlert = alert;
    alert = newAlert;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProjectPackage.JOURNAL_ENTRY__ALERT, oldAlert, newAlert);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlert(Alert newAlert)
  {
    if (newAlert != alert)
    {
      NotificationChain msgs = null;
      if (alert != null)
        msgs = ((InternalEObject)alert).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.JOURNAL_ENTRY__ALERT, null, msgs);
      if (newAlert != null)
        msgs = ((InternalEObject)newAlert).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.JOURNAL_ENTRY__ALERT, null, msgs);
      msgs = basicSetAlert(newAlert, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.JOURNAL_ENTRY__ALERT, newAlert, newAlert));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Author getAuthor()
  {
    return author;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAuthor(Author newAuthor, NotificationChain msgs)
  {
    Author oldAuthor = author;
    author = newAuthor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProjectPackage.JOURNAL_ENTRY__AUTHOR, oldAuthor, newAuthor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAuthor(Author newAuthor)
  {
    if (newAuthor != author)
    {
      NotificationChain msgs = null;
      if (author != null)
        msgs = ((InternalEObject)author).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.JOURNAL_ENTRY__AUTHOR, null, msgs);
      if (newAuthor != null)
        msgs = ((InternalEObject)newAuthor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.JOURNAL_ENTRY__AUTHOR, null, msgs);
      msgs = basicSetAuthor(newAuthor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.JOURNAL_ENTRY__AUTHOR, newAuthor, newAuthor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Details getDetails()
  {
    return details;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDetails(Details newDetails, NotificationChain msgs)
  {
    Details oldDetails = details;
    details = newDetails;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProjectPackage.JOURNAL_ENTRY__DETAILS, oldDetails, newDetails);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDetails(Details newDetails)
  {
    if (newDetails != details)
    {
      NotificationChain msgs = null;
      if (details != null)
        msgs = ((InternalEObject)details).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.JOURNAL_ENTRY__DETAILS, null, msgs);
      if (newDetails != null)
        msgs = ((InternalEObject)newDetails).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.JOURNAL_ENTRY__DETAILS, null, msgs);
      msgs = basicSetDetails(newDetails, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.JOURNAL_ENTRY__DETAILS, newDetails, newDetails));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Summary getSummary()
  {
    return summary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSummary(Summary newSummary, NotificationChain msgs)
  {
    Summary oldSummary = summary;
    summary = newSummary;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProjectPackage.JOURNAL_ENTRY__SUMMARY, oldSummary, newSummary);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSummary(Summary newSummary)
  {
    if (newSummary != summary)
    {
      NotificationChain msgs = null;
      if (summary != null)
        msgs = ((InternalEObject)summary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.JOURNAL_ENTRY__SUMMARY, null, msgs);
      if (newSummary != null)
        msgs = ((InternalEObject)newSummary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.JOURNAL_ENTRY__SUMMARY, null, msgs);
      msgs = basicSetSummary(newSummary, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.JOURNAL_ENTRY__SUMMARY, newSummary, newSummary));
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
      case ProjectPackage.JOURNAL_ENTRY__ALERT:
        return basicSetAlert(null, msgs);
      case ProjectPackage.JOURNAL_ENTRY__AUTHOR:
        return basicSetAuthor(null, msgs);
      case ProjectPackage.JOURNAL_ENTRY__DETAILS:
        return basicSetDetails(null, msgs);
      case ProjectPackage.JOURNAL_ENTRY__SUMMARY:
        return basicSetSummary(null, msgs);
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
      case ProjectPackage.JOURNAL_ENTRY__DATE:
        return getDate();
      case ProjectPackage.JOURNAL_ENTRY__HEADLINE:
        return getHeadline();
      case ProjectPackage.JOURNAL_ENTRY__ALERT:
        return getAlert();
      case ProjectPackage.JOURNAL_ENTRY__AUTHOR:
        return getAuthor();
      case ProjectPackage.JOURNAL_ENTRY__DETAILS:
        return getDetails();
      case ProjectPackage.JOURNAL_ENTRY__SUMMARY:
        return getSummary();
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
      case ProjectPackage.JOURNAL_ENTRY__DATE:
        setDate((String)newValue);
        return;
      case ProjectPackage.JOURNAL_ENTRY__HEADLINE:
        setHeadline((String)newValue);
        return;
      case ProjectPackage.JOURNAL_ENTRY__ALERT:
        setAlert((Alert)newValue);
        return;
      case ProjectPackage.JOURNAL_ENTRY__AUTHOR:
        setAuthor((Author)newValue);
        return;
      case ProjectPackage.JOURNAL_ENTRY__DETAILS:
        setDetails((Details)newValue);
        return;
      case ProjectPackage.JOURNAL_ENTRY__SUMMARY:
        setSummary((Summary)newValue);
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
      case ProjectPackage.JOURNAL_ENTRY__DATE:
        setDate(DATE_EDEFAULT);
        return;
      case ProjectPackage.JOURNAL_ENTRY__HEADLINE:
        setHeadline(HEADLINE_EDEFAULT);
        return;
      case ProjectPackage.JOURNAL_ENTRY__ALERT:
        setAlert((Alert)null);
        return;
      case ProjectPackage.JOURNAL_ENTRY__AUTHOR:
        setAuthor((Author)null);
        return;
      case ProjectPackage.JOURNAL_ENTRY__DETAILS:
        setDetails((Details)null);
        return;
      case ProjectPackage.JOURNAL_ENTRY__SUMMARY:
        setSummary((Summary)null);
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
      case ProjectPackage.JOURNAL_ENTRY__DATE:
        return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
      case ProjectPackage.JOURNAL_ENTRY__HEADLINE:
        return HEADLINE_EDEFAULT == null ? headline != null : !HEADLINE_EDEFAULT.equals(headline);
      case ProjectPackage.JOURNAL_ENTRY__ALERT:
        return alert != null;
      case ProjectPackage.JOURNAL_ENTRY__AUTHOR:
        return author != null;
      case ProjectPackage.JOURNAL_ENTRY__DETAILS:
        return details != null;
      case ProjectPackage.JOURNAL_ENTRY__SUMMARY:
        return summary != null;
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
    result.append(" (date: ");
    result.append(date);
    result.append(", headline: ");
    result.append(headline);
    result.append(')');
    return result.toString();
  }

} //JournalEntryImpl
