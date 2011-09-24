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

import org.jjflyboy.tjpeditor.project.Definitions;
import org.jjflyboy.tjpeditor.project.ProjectPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definitions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.DefinitionsImpl#isAll <em>All</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.DefinitionsImpl#isNone <em>None</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.DefinitionsImpl#isFlags <em>Flags</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.DefinitionsImpl#isResources <em>Resources</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.DefinitionsImpl#isTasks <em>Tasks</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.DefinitionsImpl#isProject <em>Project</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.impl.DefinitionsImpl#isProjectids <em>Projectids</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefinitionsImpl extends MinimalEObjectImpl.Container implements Definitions
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
   * The default value of the '{@link #isResources() <em>Resources</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isResources()
   * @generated
   * @ordered
   */
  protected static final boolean RESOURCES_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isResources() <em>Resources</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isResources()
   * @generated
   * @ordered
   */
  protected boolean resources = RESOURCES_EDEFAULT;

  /**
   * The default value of the '{@link #isTasks() <em>Tasks</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTasks()
   * @generated
   * @ordered
   */
  protected static final boolean TASKS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isTasks() <em>Tasks</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTasks()
   * @generated
   * @ordered
   */
  protected boolean tasks = TASKS_EDEFAULT;

  /**
   * The default value of the '{@link #isProject() <em>Project</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isProject()
   * @generated
   * @ordered
   */
  protected static final boolean PROJECT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isProject() <em>Project</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isProject()
   * @generated
   * @ordered
   */
  protected boolean project = PROJECT_EDEFAULT;

  /**
   * The default value of the '{@link #isProjectids() <em>Projectids</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isProjectids()
   * @generated
   * @ordered
   */
  protected static final boolean PROJECTIDS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isProjectids() <em>Projectids</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isProjectids()
   * @generated
   * @ordered
   */
  protected boolean projectids = PROJECTIDS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DefinitionsImpl()
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
    return ProjectPackage.eINSTANCE.getDefinitions();
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
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.DEFINITIONS__ALL, oldAll, all));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.DEFINITIONS__NONE, oldNone, none));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.DEFINITIONS__FLAGS, oldFlags, flags));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isResources()
  {
    return resources;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResources(boolean newResources)
  {
    boolean oldResources = resources;
    resources = newResources;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.DEFINITIONS__RESOURCES, oldResources, resources));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isTasks()
  {
    return tasks;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTasks(boolean newTasks)
  {
    boolean oldTasks = tasks;
    tasks = newTasks;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.DEFINITIONS__TASKS, oldTasks, tasks));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isProject()
  {
    return project;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProject(boolean newProject)
  {
    boolean oldProject = project;
    project = newProject;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.DEFINITIONS__PROJECT, oldProject, project));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isProjectids()
  {
    return projectids;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProjectids(boolean newProjectids)
  {
    boolean oldProjectids = projectids;
    projectids = newProjectids;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.DEFINITIONS__PROJECTIDS, oldProjectids, projectids));
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
      case ProjectPackage.DEFINITIONS__ALL:
        return isAll();
      case ProjectPackage.DEFINITIONS__NONE:
        return isNone();
      case ProjectPackage.DEFINITIONS__FLAGS:
        return isFlags();
      case ProjectPackage.DEFINITIONS__RESOURCES:
        return isResources();
      case ProjectPackage.DEFINITIONS__TASKS:
        return isTasks();
      case ProjectPackage.DEFINITIONS__PROJECT:
        return isProject();
      case ProjectPackage.DEFINITIONS__PROJECTIDS:
        return isProjectids();
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
      case ProjectPackage.DEFINITIONS__ALL:
        setAll((Boolean)newValue);
        return;
      case ProjectPackage.DEFINITIONS__NONE:
        setNone((Boolean)newValue);
        return;
      case ProjectPackage.DEFINITIONS__FLAGS:
        setFlags((Boolean)newValue);
        return;
      case ProjectPackage.DEFINITIONS__RESOURCES:
        setResources((Boolean)newValue);
        return;
      case ProjectPackage.DEFINITIONS__TASKS:
        setTasks((Boolean)newValue);
        return;
      case ProjectPackage.DEFINITIONS__PROJECT:
        setProject((Boolean)newValue);
        return;
      case ProjectPackage.DEFINITIONS__PROJECTIDS:
        setProjectids((Boolean)newValue);
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
      case ProjectPackage.DEFINITIONS__ALL:
        setAll(ALL_EDEFAULT);
        return;
      case ProjectPackage.DEFINITIONS__NONE:
        setNone(NONE_EDEFAULT);
        return;
      case ProjectPackage.DEFINITIONS__FLAGS:
        setFlags(FLAGS_EDEFAULT);
        return;
      case ProjectPackage.DEFINITIONS__RESOURCES:
        setResources(RESOURCES_EDEFAULT);
        return;
      case ProjectPackage.DEFINITIONS__TASKS:
        setTasks(TASKS_EDEFAULT);
        return;
      case ProjectPackage.DEFINITIONS__PROJECT:
        setProject(PROJECT_EDEFAULT);
        return;
      case ProjectPackage.DEFINITIONS__PROJECTIDS:
        setProjectids(PROJECTIDS_EDEFAULT);
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
      case ProjectPackage.DEFINITIONS__ALL:
        return all != ALL_EDEFAULT;
      case ProjectPackage.DEFINITIONS__NONE:
        return none != NONE_EDEFAULT;
      case ProjectPackage.DEFINITIONS__FLAGS:
        return flags != FLAGS_EDEFAULT;
      case ProjectPackage.DEFINITIONS__RESOURCES:
        return resources != RESOURCES_EDEFAULT;
      case ProjectPackage.DEFINITIONS__TASKS:
        return tasks != TASKS_EDEFAULT;
      case ProjectPackage.DEFINITIONS__PROJECT:
        return project != PROJECT_EDEFAULT;
      case ProjectPackage.DEFINITIONS__PROJECTIDS:
        return projectids != PROJECTIDS_EDEFAULT;
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
    result.append(", resources: ");
    result.append(resources);
    result.append(", tasks: ");
    result.append(tasks);
    result.append(", project: ");
    result.append(project);
    result.append(", projectids: ");
    result.append(projectids);
    result.append(')');
    return result.toString();
  }

} //DefinitionsImpl
