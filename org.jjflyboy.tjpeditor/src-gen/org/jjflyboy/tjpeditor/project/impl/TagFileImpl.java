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

import org.jjflyboy.tjpeditor.project.HideResource;
import org.jjflyboy.tjpeditor.project.HideTask;
import org.jjflyboy.tjpeditor.project.ProjectPackage;
import org.jjflyboy.tjpeditor.project.RollupResource;
import org.jjflyboy.tjpeditor.project.RollupTask;
import org.jjflyboy.tjpeditor.project.TagFile;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tag File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.TagFileImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.TagFileImpl#getFilename <em>Filename</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.TagFileImpl#getHideResource <em>Hide Resource</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.TagFileImpl#getHideTask <em>Hide Task</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.TagFileImpl#getRollupResource <em>Rollup Resource</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.TagFileImpl#getRollupTask <em>Rollup Task</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TagFileImpl extends PropertyImpl implements TagFile
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
   * The default value of the '{@link #getFilename() <em>Filename</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilename()
   * @generated
   * @ordered
   */
  protected static final String FILENAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFilename() <em>Filename</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilename()
   * @generated
   * @ordered
   */
  protected String filename = FILENAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getHideResource() <em>Hide Resource</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHideResource()
   * @generated
   * @ordered
   */
  protected HideResource hideResource;

  /**
   * The cached value of the '{@link #getHideTask() <em>Hide Task</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHideTask()
   * @generated
   * @ordered
   */
  protected HideTask hideTask;

  /**
   * The cached value of the '{@link #getRollupResource() <em>Rollup Resource</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRollupResource()
   * @generated
   * @ordered
   */
  protected RollupResource rollupResource;

  /**
   * The cached value of the '{@link #getRollupTask() <em>Rollup Task</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRollupTask()
   * @generated
   * @ordered
   */
  protected RollupTask rollupTask;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TagFileImpl()
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
    return ProjectPackage.eINSTANCE.getTagFile();
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
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.TAG_FILE__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFilename()
  {
    return filename;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFilename(String newFilename)
  {
    String oldFilename = filename;
    filename = newFilename;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.TAG_FILE__FILENAME, oldFilename, filename));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HideResource getHideResource()
  {
    return hideResource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHideResource(HideResource newHideResource, NotificationChain msgs)
  {
    HideResource oldHideResource = hideResource;
    hideResource = newHideResource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProjectPackage.TAG_FILE__HIDE_RESOURCE, oldHideResource, newHideResource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHideResource(HideResource newHideResource)
  {
    if (newHideResource != hideResource)
    {
      NotificationChain msgs = null;
      if (hideResource != null)
        msgs = ((InternalEObject)hideResource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.TAG_FILE__HIDE_RESOURCE, null, msgs);
      if (newHideResource != null)
        msgs = ((InternalEObject)newHideResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.TAG_FILE__HIDE_RESOURCE, null, msgs);
      msgs = basicSetHideResource(newHideResource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.TAG_FILE__HIDE_RESOURCE, newHideResource, newHideResource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HideTask getHideTask()
  {
    return hideTask;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHideTask(HideTask newHideTask, NotificationChain msgs)
  {
    HideTask oldHideTask = hideTask;
    hideTask = newHideTask;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProjectPackage.TAG_FILE__HIDE_TASK, oldHideTask, newHideTask);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHideTask(HideTask newHideTask)
  {
    if (newHideTask != hideTask)
    {
      NotificationChain msgs = null;
      if (hideTask != null)
        msgs = ((InternalEObject)hideTask).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.TAG_FILE__HIDE_TASK, null, msgs);
      if (newHideTask != null)
        msgs = ((InternalEObject)newHideTask).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.TAG_FILE__HIDE_TASK, null, msgs);
      msgs = basicSetHideTask(newHideTask, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.TAG_FILE__HIDE_TASK, newHideTask, newHideTask));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RollupResource getRollupResource()
  {
    return rollupResource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRollupResource(RollupResource newRollupResource, NotificationChain msgs)
  {
    RollupResource oldRollupResource = rollupResource;
    rollupResource = newRollupResource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProjectPackage.TAG_FILE__ROLLUP_RESOURCE, oldRollupResource, newRollupResource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRollupResource(RollupResource newRollupResource)
  {
    if (newRollupResource != rollupResource)
    {
      NotificationChain msgs = null;
      if (rollupResource != null)
        msgs = ((InternalEObject)rollupResource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.TAG_FILE__ROLLUP_RESOURCE, null, msgs);
      if (newRollupResource != null)
        msgs = ((InternalEObject)newRollupResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.TAG_FILE__ROLLUP_RESOURCE, null, msgs);
      msgs = basicSetRollupResource(newRollupResource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.TAG_FILE__ROLLUP_RESOURCE, newRollupResource, newRollupResource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RollupTask getRollupTask()
  {
    return rollupTask;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRollupTask(RollupTask newRollupTask, NotificationChain msgs)
  {
    RollupTask oldRollupTask = rollupTask;
    rollupTask = newRollupTask;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProjectPackage.TAG_FILE__ROLLUP_TASK, oldRollupTask, newRollupTask);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRollupTask(RollupTask newRollupTask)
  {
    if (newRollupTask != rollupTask)
    {
      NotificationChain msgs = null;
      if (rollupTask != null)
        msgs = ((InternalEObject)rollupTask).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.TAG_FILE__ROLLUP_TASK, null, msgs);
      if (newRollupTask != null)
        msgs = ((InternalEObject)newRollupTask).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProjectPackage.TAG_FILE__ROLLUP_TASK, null, msgs);
      msgs = basicSetRollupTask(newRollupTask, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.TAG_FILE__ROLLUP_TASK, newRollupTask, newRollupTask));
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
      case ProjectPackage.TAG_FILE__HIDE_RESOURCE:
        return basicSetHideResource(null, msgs);
      case ProjectPackage.TAG_FILE__HIDE_TASK:
        return basicSetHideTask(null, msgs);
      case ProjectPackage.TAG_FILE__ROLLUP_RESOURCE:
        return basicSetRollupResource(null, msgs);
      case ProjectPackage.TAG_FILE__ROLLUP_TASK:
        return basicSetRollupTask(null, msgs);
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
      case ProjectPackage.TAG_FILE__ID:
        return getId();
      case ProjectPackage.TAG_FILE__FILENAME:
        return getFilename();
      case ProjectPackage.TAG_FILE__HIDE_RESOURCE:
        return getHideResource();
      case ProjectPackage.TAG_FILE__HIDE_TASK:
        return getHideTask();
      case ProjectPackage.TAG_FILE__ROLLUP_RESOURCE:
        return getRollupResource();
      case ProjectPackage.TAG_FILE__ROLLUP_TASK:
        return getRollupTask();
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
      case ProjectPackage.TAG_FILE__ID:
        setId((String)newValue);
        return;
      case ProjectPackage.TAG_FILE__FILENAME:
        setFilename((String)newValue);
        return;
      case ProjectPackage.TAG_FILE__HIDE_RESOURCE:
        setHideResource((HideResource)newValue);
        return;
      case ProjectPackage.TAG_FILE__HIDE_TASK:
        setHideTask((HideTask)newValue);
        return;
      case ProjectPackage.TAG_FILE__ROLLUP_RESOURCE:
        setRollupResource((RollupResource)newValue);
        return;
      case ProjectPackage.TAG_FILE__ROLLUP_TASK:
        setRollupTask((RollupTask)newValue);
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
      case ProjectPackage.TAG_FILE__ID:
        setId(ID_EDEFAULT);
        return;
      case ProjectPackage.TAG_FILE__FILENAME:
        setFilename(FILENAME_EDEFAULT);
        return;
      case ProjectPackage.TAG_FILE__HIDE_RESOURCE:
        setHideResource((HideResource)null);
        return;
      case ProjectPackage.TAG_FILE__HIDE_TASK:
        setHideTask((HideTask)null);
        return;
      case ProjectPackage.TAG_FILE__ROLLUP_RESOURCE:
        setRollupResource((RollupResource)null);
        return;
      case ProjectPackage.TAG_FILE__ROLLUP_TASK:
        setRollupTask((RollupTask)null);
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
      case ProjectPackage.TAG_FILE__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case ProjectPackage.TAG_FILE__FILENAME:
        return FILENAME_EDEFAULT == null ? filename != null : !FILENAME_EDEFAULT.equals(filename);
      case ProjectPackage.TAG_FILE__HIDE_RESOURCE:
        return hideResource != null;
      case ProjectPackage.TAG_FILE__HIDE_TASK:
        return hideTask != null;
      case ProjectPackage.TAG_FILE__ROLLUP_RESOURCE:
        return rollupResource != null;
      case ProjectPackage.TAG_FILE__ROLLUP_TASK:
        return rollupTask != null;
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
    result.append(", filename: ");
    result.append(filename);
    result.append(')');
    return result.toString();
  }

} //TagFileImpl
