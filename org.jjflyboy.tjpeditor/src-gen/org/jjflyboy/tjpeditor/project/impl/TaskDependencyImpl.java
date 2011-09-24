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

import org.jjflyboy.tjpeditor.project.DependsPolicy;
import org.jjflyboy.tjpeditor.project.GapDuration;
import org.jjflyboy.tjpeditor.project.GapLength;
import org.jjflyboy.tjpeditor.project.ProjectPackage;
import org.jjflyboy.tjpeditor.project.Task;
import org.jjflyboy.tjpeditor.project.TaskDependency;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.TaskDependencyImpl#getTask <em>Task</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.TaskDependencyImpl#getGapDuration <em>Gap Duration</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.TaskDependencyImpl#getGapLength <em>Gap Length</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.TaskDependencyImpl#getPolicy <em>Policy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskDependencyImpl extends DependsImpl implements TaskDependency
{
  /**
   * The cached value of the '{@link #getTask() <em>Task</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTask()
   * @generated
   * @ordered
   */
  protected Task task;

  /**
   * The cached value of the '{@link #getGapDuration() <em>Gap Duration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGapDuration()
   * @generated
   * @ordered
   */
  protected GapDuration gapDuration;

  /**
   * The cached value of the '{@link #getGapLength() <em>Gap Length</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGapLength()
   * @generated
   * @ordered
   */
  protected GapLength gapLength;

  /**
   * The default value of the '{@link #getPolicy() <em>Policy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPolicy()
   * @generated
   * @ordered
   */
  protected static final DependsPolicy POLICY_EDEFAULT = DependsPolicy.ONEND;

  /**
   * The cached value of the '{@link #getPolicy() <em>Policy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPolicy()
   * @generated
   * @ordered
   */
  protected DependsPolicy policy = POLICY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TaskDependencyImpl()
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
    return ProjectPackage.eINSTANCE.getTaskDependency();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Task getTask()
  {
    if (task != null && task.eIsProxy())
    {
      InternalEObject oldTask = (InternalEObject)task;
      task = (Task)eResolveProxy(oldTask);
      if (task != oldTask)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjectPackage.TASK_DEPENDENCY__TASK, oldTask, task));
      }
    }
    return task;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Task basicGetTask()
  {
    return task;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTask(Task newTask)
  {
    Task oldTask = task;
    task = newTask;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.TASK_DEPENDENCY__TASK, oldTask, task));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GapDuration getGapDuration()
  {
    return gapDuration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGapDuration(GapDuration newGapDuration, NotificationChain msgs)
  {
    GapDuration oldGapDuration = gapDuration;
    gapDuration = newGapDuration;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProjectPackage.TASK_DEPENDENCY__GAP_DURATION, oldGapDuration, newGapDuration);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGapDuration(GapDuration newGapDuration)
  {
    if (newGapDuration != gapDuration)
    {
      NotificationChain msgs = null;
      if (gapDuration != null)
        msgs = ((InternalEObject)gapDuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.TASK_DEPENDENCY__GAP_DURATION, null, msgs);
      if (newGapDuration != null)
        msgs = ((InternalEObject)newGapDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.TASK_DEPENDENCY__GAP_DURATION, null, msgs);
      msgs = basicSetGapDuration(newGapDuration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.TASK_DEPENDENCY__GAP_DURATION, newGapDuration, newGapDuration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GapLength getGapLength()
  {
    return gapLength;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGapLength(GapLength newGapLength, NotificationChain msgs)
  {
    GapLength oldGapLength = gapLength;
    gapLength = newGapLength;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProjectPackage.TASK_DEPENDENCY__GAP_LENGTH, oldGapLength, newGapLength);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGapLength(GapLength newGapLength)
  {
    if (newGapLength != gapLength)
    {
      NotificationChain msgs = null;
      if (gapLength != null)
        msgs = ((InternalEObject)gapLength).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.TASK_DEPENDENCY__GAP_LENGTH, null, msgs);
      if (newGapLength != null)
        msgs = ((InternalEObject)newGapLength).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.TASK_DEPENDENCY__GAP_LENGTH, null, msgs);
      msgs = basicSetGapLength(newGapLength, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.TASK_DEPENDENCY__GAP_LENGTH, newGapLength, newGapLength));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DependsPolicy getPolicy()
  {
    return policy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPolicy(DependsPolicy newPolicy)
  {
    DependsPolicy oldPolicy = policy;
    policy = newPolicy == null ? POLICY_EDEFAULT : newPolicy;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.TASK_DEPENDENCY__POLICY, oldPolicy, policy));
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
      case ProjectPackage.TASK_DEPENDENCY__GAP_DURATION:
        return basicSetGapDuration(null, msgs);
      case ProjectPackage.TASK_DEPENDENCY__GAP_LENGTH:
        return basicSetGapLength(null, msgs);
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
      case ProjectPackage.TASK_DEPENDENCY__TASK:
        if (resolve) return getTask();
        return basicGetTask();
      case ProjectPackage.TASK_DEPENDENCY__GAP_DURATION:
        return getGapDuration();
      case ProjectPackage.TASK_DEPENDENCY__GAP_LENGTH:
        return getGapLength();
      case ProjectPackage.TASK_DEPENDENCY__POLICY:
        return getPolicy();
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
      case ProjectPackage.TASK_DEPENDENCY__TASK:
        setTask((Task)newValue);
        return;
      case ProjectPackage.TASK_DEPENDENCY__GAP_DURATION:
        setGapDuration((GapDuration)newValue);
        return;
      case ProjectPackage.TASK_DEPENDENCY__GAP_LENGTH:
        setGapLength((GapLength)newValue);
        return;
      case ProjectPackage.TASK_DEPENDENCY__POLICY:
        setPolicy((DependsPolicy)newValue);
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
      case ProjectPackage.TASK_DEPENDENCY__TASK:
        setTask((Task)null);
        return;
      case ProjectPackage.TASK_DEPENDENCY__GAP_DURATION:
        setGapDuration((GapDuration)null);
        return;
      case ProjectPackage.TASK_DEPENDENCY__GAP_LENGTH:
        setGapLength((GapLength)null);
        return;
      case ProjectPackage.TASK_DEPENDENCY__POLICY:
        setPolicy(POLICY_EDEFAULT);
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
      case ProjectPackage.TASK_DEPENDENCY__TASK:
        return task != null;
      case ProjectPackage.TASK_DEPENDENCY__GAP_DURATION:
        return gapDuration != null;
      case ProjectPackage.TASK_DEPENDENCY__GAP_LENGTH:
        return gapLength != null;
      case ProjectPackage.TASK_DEPENDENCY__POLICY:
        return policy != POLICY_EDEFAULT;
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
    result.append(" (policy: ");
    result.append(policy);
    result.append(')');
    return result.toString();
  }

} //TaskDependencyImpl
