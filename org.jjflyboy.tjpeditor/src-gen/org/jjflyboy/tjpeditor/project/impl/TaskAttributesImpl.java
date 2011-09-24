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

import org.jjflyboy.tjpeditor.project.ProjectPackage;
import org.jjflyboy.tjpeditor.project.TaskAttributes;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Attributes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.TaskAttributesImpl#isAll <em>All</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.TaskAttributesImpl#isNone <em>None</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.TaskAttributesImpl#isResponsible <em>Responsible</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.TaskAttributesImpl#isFlags <em>Flags</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.TaskAttributesImpl#isMaxstart <em>Maxstart</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.TaskAttributesImpl#isMaxend <em>Maxend</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.TaskAttributesImpl#isPriority <em>Priority</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.TaskAttributesImpl#isBooking <em>Booking</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.TaskAttributesImpl#isNote <em>Note</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.TaskAttributesImpl#isMinstart <em>Minstart</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.TaskAttributesImpl#isMinend <em>Minend</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.TaskAttributesImpl#isComplete <em>Complete</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.TaskAttributesImpl#isDepends <em>Depends</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskAttributesImpl extends MinimalEObjectImpl.Container implements TaskAttributes
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
   * The default value of the '{@link #isResponsible() <em>Responsible</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isResponsible()
   * @generated
   * @ordered
   */
  protected static final boolean RESPONSIBLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isResponsible() <em>Responsible</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isResponsible()
   * @generated
   * @ordered
   */
  protected boolean responsible = RESPONSIBLE_EDEFAULT;

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
   * The default value of the '{@link #isMaxstart() <em>Maxstart</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMaxstart()
   * @generated
   * @ordered
   */
  protected static final boolean MAXSTART_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMaxstart() <em>Maxstart</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMaxstart()
   * @generated
   * @ordered
   */
  protected boolean maxstart = MAXSTART_EDEFAULT;

  /**
   * The default value of the '{@link #isMaxend() <em>Maxend</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMaxend()
   * @generated
   * @ordered
   */
  protected static final boolean MAXEND_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMaxend() <em>Maxend</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMaxend()
   * @generated
   * @ordered
   */
  protected boolean maxend = MAXEND_EDEFAULT;

  /**
   * The default value of the '{@link #isPriority() <em>Priority</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPriority()
   * @generated
   * @ordered
   */
  protected static final boolean PRIORITY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPriority() <em>Priority</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPriority()
   * @generated
   * @ordered
   */
  protected boolean priority = PRIORITY_EDEFAULT;

  /**
   * The default value of the '{@link #isBooking() <em>Booking</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBooking()
   * @generated
   * @ordered
   */
  protected static final boolean BOOKING_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isBooking() <em>Booking</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBooking()
   * @generated
   * @ordered
   */
  protected boolean booking = BOOKING_EDEFAULT;

  /**
   * The default value of the '{@link #isNote() <em>Note</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNote()
   * @generated
   * @ordered
   */
  protected static final boolean NOTE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNote() <em>Note</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNote()
   * @generated
   * @ordered
   */
  protected boolean note = NOTE_EDEFAULT;

  /**
   * The default value of the '{@link #isMinstart() <em>Minstart</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMinstart()
   * @generated
   * @ordered
   */
  protected static final boolean MINSTART_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMinstart() <em>Minstart</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMinstart()
   * @generated
   * @ordered
   */
  protected boolean minstart = MINSTART_EDEFAULT;

  /**
   * The default value of the '{@link #isMinend() <em>Minend</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMinend()
   * @generated
   * @ordered
   */
  protected static final boolean MINEND_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMinend() <em>Minend</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMinend()
   * @generated
   * @ordered
   */
  protected boolean minend = MINEND_EDEFAULT;

  /**
   * The default value of the '{@link #isComplete() <em>Complete</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isComplete()
   * @generated
   * @ordered
   */
  protected static final boolean COMPLETE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isComplete() <em>Complete</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isComplete()
   * @generated
   * @ordered
   */
  protected boolean complete = COMPLETE_EDEFAULT;

  /**
   * The default value of the '{@link #isDepends() <em>Depends</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDepends()
   * @generated
   * @ordered
   */
  protected static final boolean DEPENDS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDepends() <em>Depends</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDepends()
   * @generated
   * @ordered
   */
  protected boolean depends = DEPENDS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TaskAttributesImpl()
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
    return ProjectPackage.eINSTANCE.getTaskAttributes();
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
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.TASK_ATTRIBUTES__ALL, oldAll, all));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.TASK_ATTRIBUTES__NONE, oldNone, none));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isResponsible()
  {
    return responsible;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResponsible(boolean newResponsible)
  {
    boolean oldResponsible = responsible;
    responsible = newResponsible;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.TASK_ATTRIBUTES__RESPONSIBLE, oldResponsible, responsible));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.TASK_ATTRIBUTES__FLAGS, oldFlags, flags));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMaxstart()
  {
    return maxstart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMaxstart(boolean newMaxstart)
  {
    boolean oldMaxstart = maxstart;
    maxstart = newMaxstart;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.TASK_ATTRIBUTES__MAXSTART, oldMaxstart, maxstart));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMaxend()
  {
    return maxend;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMaxend(boolean newMaxend)
  {
    boolean oldMaxend = maxend;
    maxend = newMaxend;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.TASK_ATTRIBUTES__MAXEND, oldMaxend, maxend));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPriority()
  {
    return priority;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPriority(boolean newPriority)
  {
    boolean oldPriority = priority;
    priority = newPriority;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.TASK_ATTRIBUTES__PRIORITY, oldPriority, priority));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isBooking()
  {
    return booking;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBooking(boolean newBooking)
  {
    boolean oldBooking = booking;
    booking = newBooking;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.TASK_ATTRIBUTES__BOOKING, oldBooking, booking));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNote()
  {
    return note;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNote(boolean newNote)
  {
    boolean oldNote = note;
    note = newNote;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.TASK_ATTRIBUTES__NOTE, oldNote, note));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMinstart()
  {
    return minstart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMinstart(boolean newMinstart)
  {
    boolean oldMinstart = minstart;
    minstart = newMinstart;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.TASK_ATTRIBUTES__MINSTART, oldMinstart, minstart));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMinend()
  {
    return minend;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMinend(boolean newMinend)
  {
    boolean oldMinend = minend;
    minend = newMinend;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.TASK_ATTRIBUTES__MINEND, oldMinend, minend));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isComplete()
  {
    return complete;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComplete(boolean newComplete)
  {
    boolean oldComplete = complete;
    complete = newComplete;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.TASK_ATTRIBUTES__COMPLETE, oldComplete, complete));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDepends()
  {
    return depends;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDepends(boolean newDepends)
  {
    boolean oldDepends = depends;
    depends = newDepends;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.TASK_ATTRIBUTES__DEPENDS, oldDepends, depends));
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
      case ProjectPackage.TASK_ATTRIBUTES__ALL:
        return isAll();
      case ProjectPackage.TASK_ATTRIBUTES__NONE:
        return isNone();
      case ProjectPackage.TASK_ATTRIBUTES__RESPONSIBLE:
        return isResponsible();
      case ProjectPackage.TASK_ATTRIBUTES__FLAGS:
        return isFlags();
      case ProjectPackage.TASK_ATTRIBUTES__MAXSTART:
        return isMaxstart();
      case ProjectPackage.TASK_ATTRIBUTES__MAXEND:
        return isMaxend();
      case ProjectPackage.TASK_ATTRIBUTES__PRIORITY:
        return isPriority();
      case ProjectPackage.TASK_ATTRIBUTES__BOOKING:
        return isBooking();
      case ProjectPackage.TASK_ATTRIBUTES__NOTE:
        return isNote();
      case ProjectPackage.TASK_ATTRIBUTES__MINSTART:
        return isMinstart();
      case ProjectPackage.TASK_ATTRIBUTES__MINEND:
        return isMinend();
      case ProjectPackage.TASK_ATTRIBUTES__COMPLETE:
        return isComplete();
      case ProjectPackage.TASK_ATTRIBUTES__DEPENDS:
        return isDepends();
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
      case ProjectPackage.TASK_ATTRIBUTES__ALL:
        setAll((Boolean)newValue);
        return;
      case ProjectPackage.TASK_ATTRIBUTES__NONE:
        setNone((Boolean)newValue);
        return;
      case ProjectPackage.TASK_ATTRIBUTES__RESPONSIBLE:
        setResponsible((Boolean)newValue);
        return;
      case ProjectPackage.TASK_ATTRIBUTES__FLAGS:
        setFlags((Boolean)newValue);
        return;
      case ProjectPackage.TASK_ATTRIBUTES__MAXSTART:
        setMaxstart((Boolean)newValue);
        return;
      case ProjectPackage.TASK_ATTRIBUTES__MAXEND:
        setMaxend((Boolean)newValue);
        return;
      case ProjectPackage.TASK_ATTRIBUTES__PRIORITY:
        setPriority((Boolean)newValue);
        return;
      case ProjectPackage.TASK_ATTRIBUTES__BOOKING:
        setBooking((Boolean)newValue);
        return;
      case ProjectPackage.TASK_ATTRIBUTES__NOTE:
        setNote((Boolean)newValue);
        return;
      case ProjectPackage.TASK_ATTRIBUTES__MINSTART:
        setMinstart((Boolean)newValue);
        return;
      case ProjectPackage.TASK_ATTRIBUTES__MINEND:
        setMinend((Boolean)newValue);
        return;
      case ProjectPackage.TASK_ATTRIBUTES__COMPLETE:
        setComplete((Boolean)newValue);
        return;
      case ProjectPackage.TASK_ATTRIBUTES__DEPENDS:
        setDepends((Boolean)newValue);
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
      case ProjectPackage.TASK_ATTRIBUTES__ALL:
        setAll(ALL_EDEFAULT);
        return;
      case ProjectPackage.TASK_ATTRIBUTES__NONE:
        setNone(NONE_EDEFAULT);
        return;
      case ProjectPackage.TASK_ATTRIBUTES__RESPONSIBLE:
        setResponsible(RESPONSIBLE_EDEFAULT);
        return;
      case ProjectPackage.TASK_ATTRIBUTES__FLAGS:
        setFlags(FLAGS_EDEFAULT);
        return;
      case ProjectPackage.TASK_ATTRIBUTES__MAXSTART:
        setMaxstart(MAXSTART_EDEFAULT);
        return;
      case ProjectPackage.TASK_ATTRIBUTES__MAXEND:
        setMaxend(MAXEND_EDEFAULT);
        return;
      case ProjectPackage.TASK_ATTRIBUTES__PRIORITY:
        setPriority(PRIORITY_EDEFAULT);
        return;
      case ProjectPackage.TASK_ATTRIBUTES__BOOKING:
        setBooking(BOOKING_EDEFAULT);
        return;
      case ProjectPackage.TASK_ATTRIBUTES__NOTE:
        setNote(NOTE_EDEFAULT);
        return;
      case ProjectPackage.TASK_ATTRIBUTES__MINSTART:
        setMinstart(MINSTART_EDEFAULT);
        return;
      case ProjectPackage.TASK_ATTRIBUTES__MINEND:
        setMinend(MINEND_EDEFAULT);
        return;
      case ProjectPackage.TASK_ATTRIBUTES__COMPLETE:
        setComplete(COMPLETE_EDEFAULT);
        return;
      case ProjectPackage.TASK_ATTRIBUTES__DEPENDS:
        setDepends(DEPENDS_EDEFAULT);
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
      case ProjectPackage.TASK_ATTRIBUTES__ALL:
        return all != ALL_EDEFAULT;
      case ProjectPackage.TASK_ATTRIBUTES__NONE:
        return none != NONE_EDEFAULT;
      case ProjectPackage.TASK_ATTRIBUTES__RESPONSIBLE:
        return responsible != RESPONSIBLE_EDEFAULT;
      case ProjectPackage.TASK_ATTRIBUTES__FLAGS:
        return flags != FLAGS_EDEFAULT;
      case ProjectPackage.TASK_ATTRIBUTES__MAXSTART:
        return maxstart != MAXSTART_EDEFAULT;
      case ProjectPackage.TASK_ATTRIBUTES__MAXEND:
        return maxend != MAXEND_EDEFAULT;
      case ProjectPackage.TASK_ATTRIBUTES__PRIORITY:
        return priority != PRIORITY_EDEFAULT;
      case ProjectPackage.TASK_ATTRIBUTES__BOOKING:
        return booking != BOOKING_EDEFAULT;
      case ProjectPackage.TASK_ATTRIBUTES__NOTE:
        return note != NOTE_EDEFAULT;
      case ProjectPackage.TASK_ATTRIBUTES__MINSTART:
        return minstart != MINSTART_EDEFAULT;
      case ProjectPackage.TASK_ATTRIBUTES__MINEND:
        return minend != MINEND_EDEFAULT;
      case ProjectPackage.TASK_ATTRIBUTES__COMPLETE:
        return complete != COMPLETE_EDEFAULT;
      case ProjectPackage.TASK_ATTRIBUTES__DEPENDS:
        return depends != DEPENDS_EDEFAULT;
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
    result.append(", responsible: ");
    result.append(responsible);
    result.append(", flags: ");
    result.append(flags);
    result.append(", maxstart: ");
    result.append(maxstart);
    result.append(", maxend: ");
    result.append(maxend);
    result.append(", priority: ");
    result.append(priority);
    result.append(", booking: ");
    result.append(booking);
    result.append(", note: ");
    result.append(note);
    result.append(", minstart: ");
    result.append(minstart);
    result.append(", minend: ");
    result.append(minend);
    result.append(", complete: ");
    result.append(complete);
    result.append(", depends: ");
    result.append(depends);
    result.append(')');
    return result.toString();
  }

} //TaskAttributesImpl
