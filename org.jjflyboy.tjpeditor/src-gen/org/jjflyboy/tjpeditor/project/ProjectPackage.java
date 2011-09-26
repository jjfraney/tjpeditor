/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.jjflyboy.tjpeditor.project.ProjectFactory
 * @model kind="package"
 * @generated
 */
public interface ProjectPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "project";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.jjflyboy.org/tjpeditor/Project";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "project";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ProjectPackage eINSTANCE = org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl.init();

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.GlobalImpl <em>Global</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.GlobalImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getGlobal()
   * @generated
   */
  int GLOBAL = 0;

  /**
   * The feature id for the '<em><b>Project</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL__PROJECT = 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL__ATTRIBUTES = 1;

  /**
   * The number of structural features of the '<em>Global</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.GlobalAttributeImpl <em>Global Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.GlobalAttributeImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getGlobalAttribute()
   * @generated
   */
  int GLOBAL_ATTRIBUTE = 1;

  /**
   * The number of structural features of the '<em>Global Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_ATTRIBUTE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.AccountImpl <em>Account</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.AccountImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getAccount()
   * @generated
   */
  int ACCOUNT = 2;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT__ID = GLOBAL_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT__NAME = GLOBAL_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT__ATTRIBUTES = GLOBAL_ATTRIBUTE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Account</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT_FEATURE_COUNT = GLOBAL_ATTRIBUTE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.AccountAttributeImpl <em>Account Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.AccountAttributeImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getAccountAttribute()
   * @generated
   */
  int ACCOUNT_ATTRIBUTE = 3;

  /**
   * The number of structural features of the '<em>Account Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT_ATTRIBUTE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.SupplementAccountImpl <em>Supplement Account</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.SupplementAccountImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getSupplementAccount()
   * @generated
   */
  int SUPPLEMENT_ACCOUNT = 4;

  /**
   * The feature id for the '<em><b>Account</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPPLEMENT_ACCOUNT__ACCOUNT = GLOBAL_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPPLEMENT_ACCOUNT__ATTRIBUTES = GLOBAL_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Supplement Account</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPPLEMENT_ACCOUNT_FEATURE_COUNT = GLOBAL_ATTRIBUTE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.ProjectImpl <em>Project</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getProject()
   * @generated
   */
  int PROJECT = 5;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__ID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__NAME = 1;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__VERSION = 2;

  /**
   * The feature id for the '<em><b>Interval</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__INTERVAL = 3;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__ATTRIBUTES = 4;

  /**
   * The number of structural features of the '<em>Project</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.ProjectAttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectAttributeImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getProjectAttribute()
   * @generated
   */
  int PROJECT_ATTRIBUTE = 6;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_ATTRIBUTE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.TaskImpl <em>Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.TaskImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getTask()
   * @generated
   */
  int TASK = 7;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__ID = GLOBAL_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__NAME = GLOBAL_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__ATTRIBUTES = GLOBAL_ATTRIBUTE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_FEATURE_COUNT = GLOBAL_ATTRIBUTE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.SupplementTaskImpl <em>Supplement Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.SupplementTaskImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getSupplementTask()
   * @generated
   */
  int SUPPLEMENT_TASK = 8;

  /**
   * The feature id for the '<em><b>Task</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPPLEMENT_TASK__TASK = GLOBAL_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPPLEMENT_TASK__ATTRIBUTES = GLOBAL_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Supplement Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPPLEMENT_TASK_FEATURE_COUNT = GLOBAL_ATTRIBUTE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.TaskAttributeImpl <em>Task Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.TaskAttributeImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getTaskAttribute()
   * @generated
   */
  int TASK_ATTRIBUTE = 9;

  /**
   * The number of structural features of the '<em>Task Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_ATTRIBUTE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.ResourceReportImpl <em>Resource Report</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.ResourceReportImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getResourceReport()
   * @generated
   */
  int RESOURCE_REPORT = 113;

  /**
   * The number of structural features of the '<em>Resource Report</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_REPORT_FEATURE_COUNT = GLOBAL_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.ReportImpl <em>Report</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.ReportImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getReport()
   * @generated
   */
  int REPORT = 10;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPORT__ID = RESOURCE_REPORT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPORT__NAME = RESOURCE_REPORT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPORT__ATTRIBUTES = RESOURCE_REPORT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Report</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPORT_FEATURE_COUNT = RESOURCE_REPORT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.SupplementReportImpl <em>Supplement Report</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.SupplementReportImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getSupplementReport()
   * @generated
   */
  int SUPPLEMENT_REPORT = 11;

  /**
   * The feature id for the '<em><b>Report</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPPLEMENT_REPORT__REPORT = GLOBAL_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPPLEMENT_REPORT__ATTRIBUTES = GLOBAL_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Supplement Report</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPPLEMENT_REPORT_FEATURE_COUNT = GLOBAL_ATTRIBUTE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.ReportAttributeImpl <em>Report Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.ReportAttributeImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getReportAttribute()
   * @generated
   */
  int REPORT_ATTRIBUTE = 12;

  /**
   * The number of structural features of the '<em>Report Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPORT_ATTRIBUTE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.ResourceImpl <em>Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.ResourceImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getResource()
   * @generated
   */
  int RESOURCE = 13;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__ID = GLOBAL_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__NAME = GLOBAL_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__ATTRIBUTES = GLOBAL_ATTRIBUTE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_FEATURE_COUNT = GLOBAL_ATTRIBUTE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.SupplementResourceImpl <em>Supplement Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.SupplementResourceImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getSupplementResource()
   * @generated
   */
  int SUPPLEMENT_RESOURCE = 14;

  /**
   * The feature id for the '<em><b>Resource</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPPLEMENT_RESOURCE__RESOURCE = GLOBAL_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPPLEMENT_RESOURCE__ATTRIBUTES = GLOBAL_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Supplement Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPPLEMENT_RESOURCE_FEATURE_COUNT = GLOBAL_ATTRIBUTE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.ResourceAttributeImpl <em>Resource Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.ResourceAttributeImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getResourceAttribute()
   * @generated
   */
  int RESOURCE_ATTRIBUTE = 15;

  /**
   * The number of structural features of the '<em>Resource Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_ATTRIBUTE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.AllocateImpl <em>Allocate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.AllocateImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getAllocate()
   * @generated
   */
  int ALLOCATE = 16;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALLOCATE__RESOURCES = TASK_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Allocate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALLOCATE_FEATURE_COUNT = TASK_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.AllocateResourceImpl <em>Allocate Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.AllocateResourceImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getAllocateResource()
   * @generated
   */
  int ALLOCATE_RESOURCE = 17;

  /**
   * The feature id for the '<em><b>Resource</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALLOCATE_RESOURCE__RESOURCE = 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALLOCATE_RESOURCE__ATTRIBUTES = 1;

  /**
   * The number of structural features of the '<em>Allocate Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALLOCATE_RESOURCE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.AllocateResourceAttributeImpl <em>Allocate Resource Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.AllocateResourceAttributeImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getAllocateResourceAttribute()
   * @generated
   */
  int ALLOCATE_RESOURCE_ATTRIBUTE = 18;

  /**
   * The number of structural features of the '<em>Allocate Resource Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALLOCATE_RESOURCE_ATTRIBUTE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.NavigatorImpl <em>Navigator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.NavigatorImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getNavigator()
   * @generated
   */
  int NAVIGATOR = 19;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAVIGATOR__ID = 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAVIGATOR__ATTRIBUTES = 1;

  /**
   * The number of structural features of the '<em>Navigator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAVIGATOR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.NavigatorAttributeImpl <em>Navigator Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.NavigatorAttributeImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getNavigatorAttribute()
   * @generated
   */
  int NAVIGATOR_ATTRIBUTE = 20;

  /**
   * The number of structural features of the '<em>Navigator Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAVIGATOR_ATTRIBUTE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.TimesheetAttributeImpl <em>Timesheet Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.TimesheetAttributeImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getTimesheetAttribute()
   * @generated
   */
  int TIMESHEET_ATTRIBUTE = 181;

  /**
   * The number of structural features of the '<em>Timesheet Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMESHEET_ATTRIBUTE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.NewTaskImpl <em>New Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.NewTaskImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getNewTask()
   * @generated
   */
  int NEW_TASK = 21;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_TASK__ID = TIMESHEET_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_TASK__TEXT = TIMESHEET_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_TASK__ATTRIBUTES = TIMESHEET_ATTRIBUTE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>New Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_TASK_FEATURE_COUNT = TIMESHEET_ATTRIBUTE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.NewTaskAttributeImpl <em>New Task Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.NewTaskAttributeImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getNewTaskAttribute()
   * @generated
   */
  int NEW_TASK_ATTRIBUTE = 22;

  /**
   * The number of structural features of the '<em>New Task Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_TASK_ATTRIBUTE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.NikuReportImpl <em>Niku Report</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.NikuReportImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getNikuReport()
   * @generated
   */
  int NIKU_REPORT = 23;

  /**
   * The feature id for the '<em><b>Filename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NIKU_REPORT__FILENAME = 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NIKU_REPORT__ATTRIBUTES = 1;

  /**
   * The number of structural features of the '<em>Niku Report</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NIKU_REPORT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.NikuReportAttributeImpl <em>Niku Report Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.NikuReportAttributeImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getNikuReportAttribute()
   * @generated
   */
  int NIKU_REPORT_ATTRIBUTE = 24;

  /**
   * The number of structural features of the '<em>Niku Report Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NIKU_REPORT_ATTRIBUTE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.AlertImpl <em>Alert</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.AlertImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getAlert()
   * @generated
   */
  int ALERT = 25;

  /**
   * The feature id for the '<em><b>Level</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALERT__LEVEL = 0;

  /**
   * The number of structural features of the '<em>Alert</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALERT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.AlternativeImpl <em>Alternative</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.AlternativeImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getAlternative()
   * @generated
   */
  int ALTERNATIVE = 26;

  /**
   * The feature id for the '<em><b>Resources</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTERNATIVE__RESOURCES = ALLOCATE_RESOURCE_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Alternative</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTERNATIVE_FEATURE_COUNT = ALLOCATE_RESOURCE_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.StatusStatusSheetAttributeImpl <em>Status Status Sheet Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.StatusStatusSheetAttributeImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getStatusStatusSheetAttribute()
   * @generated
   */
  int STATUS_STATUS_SHEET_ATTRIBUTE = 137;

  /**
   * The number of structural features of the '<em>Status Status Sheet Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATUS_STATUS_SHEET_ATTRIBUTE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.AuthorImpl <em>Author</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.AuthorImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getAuthor()
   * @generated
   */
  int AUTHOR = 27;

  /**
   * The feature id for the '<em><b>Resource</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTHOR__RESOURCE = STATUS_STATUS_SHEET_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Author</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTHOR_FEATURE_COUNT = STATUS_STATUS_SHEET_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.BalanceImpl <em>Balance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.BalanceImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getBalance()
   * @generated
   */
  int BALANCE = 28;

  /**
   * The feature id for the '<em><b>Cost</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BALANCE__COST = GLOBAL_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Revenue</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BALANCE__REVENUE = GLOBAL_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Balance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BALANCE_FEATURE_COUNT = GLOBAL_ATTRIBUTE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.BookingImpl <em>Booking</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.BookingImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getBooking()
   * @generated
   */
  int BOOKING = 29;

  /**
   * The feature id for the '<em><b>Interval</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOKING__INTERVAL = 0;

  /**
   * The feature id for the '<em><b>Overtime</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOKING__OVERTIME = 1;

  /**
   * The feature id for the '<em><b>Sloppy</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOKING__SLOPPY = 2;

  /**
   * The number of structural features of the '<em>Booking</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOKING_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.BookingTaskImpl <em>Booking Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.BookingTaskImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getBookingTask()
   * @generated
   */
  int BOOKING_TASK = 30;

  /**
   * The feature id for the '<em><b>Interval</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOKING_TASK__INTERVAL = TASK_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Overtime</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOKING_TASK__OVERTIME = TASK_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Sloppy</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOKING_TASK__SLOPPY = TASK_ATTRIBUTE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Resource</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOKING_TASK__RESOURCE = TASK_ATTRIBUTE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Booking Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOKING_TASK_FEATURE_COUNT = TASK_ATTRIBUTE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.BookingResourceImpl <em>Booking Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.BookingResourceImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getBookingResource()
   * @generated
   */
  int BOOKING_RESOURCE = 31;

  /**
   * The feature id for the '<em><b>Interval</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOKING_RESOURCE__INTERVAL = RESOURCE_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Overtime</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOKING_RESOURCE__OVERTIME = RESOURCE_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Sloppy</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOKING_RESOURCE__SLOPPY = RESOURCE_ATTRIBUTE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Task</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOKING_RESOURCE__TASK = RESOURCE_ATTRIBUTE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Booking Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOKING_RESOURCE_FEATURE_COUNT = RESOURCE_ATTRIBUTE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.CaptionImpl <em>Caption</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.CaptionImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getCaption()
   * @generated
   */
  int CAPTION = 32;

  /**
   * The number of structural features of the '<em>Caption</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPTION_FEATURE_COUNT = REPORT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.ColumnAttributeImpl <em>Column Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.ColumnAttributeImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getColumnAttribute()
   * @generated
   */
  int COLUMN_ATTRIBUTE = 170;

  /**
   * The number of structural features of the '<em>Column Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_ATTRIBUTE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.CellColorImpl <em>Cell Color</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.CellColorImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getCellColor()
   * @generated
   */
  int CELL_COLOR = 33;

  /**
   * The feature id for the '<em><b>Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL_COLOR__EXPRESSION = COLUMN_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL_COLOR__COLOR = COLUMN_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Cell Color</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL_COLOR_FEATURE_COUNT = COLUMN_ATTRIBUTE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.CellTextImpl <em>Cell Text</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.CellTextImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getCellText()
   * @generated
   */
  int CELL_TEXT = 34;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL_TEXT__TEXT = COLUMN_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expresssion</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL_TEXT__EXPRESSSION = COLUMN_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Cell Text</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL_TEXT_FEATURE_COUNT = COLUMN_ATTRIBUTE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.CenterImpl <em>Center</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.CenterImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getCenter()
   * @generated
   */
  int CENTER = 35;

  /**
   * The number of structural features of the '<em>Center</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CENTER_FEATURE_COUNT = REPORT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.ChargeImpl <em>Charge</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.ChargeImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getCharge()
   * @generated
   */
  int CHARGE = 36;

  /**
   * The feature id for the '<em><b>Amount</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARGE__AMOUNT = TASK_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Applies</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARGE__APPLIES = TASK_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Charge</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARGE_FEATURE_COUNT = TASK_ATTRIBUTE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.ChargeSetImpl <em>Charge Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.ChargeSetImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getChargeSet()
   * @generated
   */
  int CHARGE_SET = 37;

  /**
   * The feature id for the '<em><b>Account Shares</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARGE_SET__ACCOUNT_SHARES = TASK_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Charge Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARGE_SET_FEATURE_COUNT = TASK_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.ColumnsImpl <em>Columns</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.ColumnsImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getColumns()
   * @generated
   */
  int COLUMNS = 38;

  /**
   * The feature id for the '<em><b>Columns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMNS__COLUMNS = REPORT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Columns</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMNS_FEATURE_COUNT = REPORT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.CompleteImpl <em>Complete</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.CompleteImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getComplete()
   * @generated
   */
  int COMPLETE = 39;

  /**
   * The feature id for the '<em><b>Complete</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLETE__COMPLETE = TASK_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Complete</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLETE_FEATURE_COUNT = TASK_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.CopyrightImpl <em>Copyright</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.CopyrightImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getCopyright()
   * @generated
   */
  int COPYRIGHT = 40;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COPYRIGHT__TEXT = GLOBAL_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Copyright</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COPYRIGHT_FEATURE_COUNT = GLOBAL_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.CreditImpl <em>Credit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.CreditImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getCredit()
   * @generated
   */
  int CREDIT = 41;

  /**
   * The feature id for the '<em><b>Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT__DATE = ACCOUNT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT__DESCRIPTION = ACCOUNT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Amount</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT__AMOUNT = ACCOUNT_ATTRIBUTE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Credit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT_FEATURE_COUNT = ACCOUNT_ATTRIBUTE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.CurrencyImpl <em>Currency</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.CurrencyImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getCurrency()
   * @generated
   */
  int CURRENCY = 42;

  /**
   * The feature id for the '<em><b>Currency</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CURRENCY__CURRENCY = PROJECT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Currency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CURRENCY_FEATURE_COUNT = PROJECT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.CurrencyFormatImpl <em>Currency Format</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.CurrencyFormatImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getCurrencyFormat()
   * @generated
   */
  int CURRENCY_FORMAT = 43;

  /**
   * The number of structural features of the '<em>Currency Format</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CURRENCY_FORMAT_FEATURE_COUNT = PROJECT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.DateExtendImpl <em>Date Extend</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.DateExtendImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getDateExtend()
   * @generated
   */
  int DATE_EXTEND = 44;

  /**
   * The number of structural features of the '<em>Date Extend</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_EXTEND_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.MaximumImpl <em>Maximum</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.MaximumImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getMaximum()
   * @generated
   */
  int MAXIMUM = 88;

  /**
   * The number of structural features of the '<em>Maximum</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAXIMUM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.LimitImpl <em>Limit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.LimitImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getLimit()
   * @generated
   */
  int LIMIT = 45;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIMIT__VALUE = MAXIMUM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIMIT__UNIT = MAXIMUM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIMIT__END = MAXIMUM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Period</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIMIT__PERIOD = MAXIMUM_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Resources</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIMIT__RESOURCES = MAXIMUM_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Limit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIMIT_FEATURE_COUNT = MAXIMUM_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.DailyWorkingHoursImpl <em>Daily Working Hours</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.DailyWorkingHoursImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getDailyWorkingHours()
   * @generated
   */
  int DAILY_WORKING_HOURS = 46;

  /**
   * The feature id for the '<em><b>Daily Working Hours</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAILY_WORKING_HOURS__DAILY_WORKING_HOURS = PROJECT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Daily Working Hours</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAILY_WORKING_HOURS_FEATURE_COUNT = PROJECT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.DefinitionsImpl <em>Definitions</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.DefinitionsImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getDefinitions()
   * @generated
   */
  int DEFINITIONS = 47;

  /**
   * The feature id for the '<em><b>All</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITIONS__ALL = 0;

  /**
   * The feature id for the '<em><b>None</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITIONS__NONE = 1;

  /**
   * The feature id for the '<em><b>Flags</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITIONS__FLAGS = 2;

  /**
   * The feature id for the '<em><b>Resources</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITIONS__RESOURCES = 3;

  /**
   * The feature id for the '<em><b>Tasks</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITIONS__TASKS = 4;

  /**
   * The feature id for the '<em><b>Project</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITIONS__PROJECT = 5;

  /**
   * The feature id for the '<em><b>Projectids</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITIONS__PROJECTIDS = 6;

  /**
   * The number of structural features of the '<em>Definitions</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITIONS_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.DependsImpl <em>Depends</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.DependsImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getDepends()
   * @generated
   */
  int DEPENDS = 48;

  /**
   * The number of structural features of the '<em>Depends</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDS_FEATURE_COUNT = TASK_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.DetailsImpl <em>Details</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.DetailsImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getDetails()
   * @generated
   */
  int DETAILS = 49;

  /**
   * The number of structural features of the '<em>Details</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DETAILS_FEATURE_COUNT = STATUS_STATUS_SHEET_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.DurationImpl <em>Duration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.DurationImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getDuration()
   * @generated
   */
  int DURATION = 50;

  /**
   * The feature id for the '<em><b>Duration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DURATION__DURATION = TASK_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Duration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DURATION_FEATURE_COUNT = TASK_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.EfficiencyImpl <em>Efficiency</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.EfficiencyImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getEfficiency()
   * @generated
   */
  int EFFICIENCY = 51;

  /**
   * The feature id for the '<em><b>Efficiency</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFICIENCY__EFFICIENCY = RESOURCE_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Efficiency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFICIENCY_FEATURE_COUNT = RESOURCE_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.EffortImpl <em>Effort</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.EffortImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getEffort()
   * @generated
   */
  int EFFORT = 52;

  /**
   * The feature id for the '<em><b>Effort</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFORT__EFFORT = TASK_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Effort</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFORT_FEATURE_COUNT = TASK_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.EmailImpl <em>Email</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.EmailImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getEmail()
   * @generated
   */
  int EMAIL = 53;

  /**
   * The feature id for the '<em><b>Address</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMAIL__ADDRESS = 0;

  /**
   * The number of structural features of the '<em>Email</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMAIL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.EndImpl <em>End</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.EndImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getEnd()
   * @generated
   */
  int END = 54;

  /**
   * The feature id for the '<em><b>End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int END__END = TASK_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>End</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int END_FEATURE_COUNT = TASK_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.EndCreditImpl <em>End Credit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.EndCreditImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getEndCredit()
   * @generated
   */
  int END_CREDIT = 55;

  /**
   * The feature id for the '<em><b>Credit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int END_CREDIT__CREDIT = TASK_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>End Credit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int END_CREDIT_FEATURE_COUNT = TASK_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.EpilogImpl <em>Epilog</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.EpilogImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getEpilog()
   * @generated
   */
  int EPILOG = 56;

  /**
   * The number of structural features of the '<em>Epilog</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPILOG_FEATURE_COUNT = REPORT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.ExtendImpl <em>Extend</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.ExtendImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getExtend()
   * @generated
   */
  int EXTEND = 57;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTEND__TYPE = 0;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTEND__REFERENCE = 1;

  /**
   * The feature id for the '<em><b>Date</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTEND__DATE = 2;

  /**
   * The feature id for the '<em><b>Richtext</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTEND__RICHTEXT = 3;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTEND__TEXT = 4;

  /**
   * The number of structural features of the '<em>Extend</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTEND_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.FailImpl <em>Fail</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.FailImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getFail()
   * @generated
   */
  int FAIL = 58;

  /**
   * The feature id for the '<em><b>Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAIL__EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Fail</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAIL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.FlagsImpl <em>Flags</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.FlagsImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getFlags()
   * @generated
   */
  int FLAGS = 59;

  /**
   * The feature id for the '<em><b>Flags</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLAGS__FLAGS = GLOBAL_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Flags</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLAGS_FEATURE_COUNT = GLOBAL_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.FontColorImpl <em>Font Color</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.FontColorImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getFontColor()
   * @generated
   */
  int FONT_COLOR = 60;

  /**
   * The feature id for the '<em><b>Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_COLOR__COLOR = COLUMN_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Font Color</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_COLOR_FEATURE_COUNT = COLUMN_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.FooterImpl <em>Footer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.FooterImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getFooter()
   * @generated
   */
  int FOOTER = 61;

  /**
   * The number of structural features of the '<em>Footer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOOTER_FEATURE_COUNT = REPORT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.FormatsImpl <em>Formats</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.FormatsImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getFormats()
   * @generated
   */
  int FORMATS = 62;

  /**
   * The feature id for the '<em><b>Formats</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMATS__FORMATS = REPORT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Formats</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMATS_FEATURE_COUNT = REPORT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.GapDurationImpl <em>Gap Duration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.GapDurationImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getGapDuration()
   * @generated
   */
  int GAP_DURATION = 63;

  /**
   * The number of structural features of the '<em>Gap Duration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GAP_DURATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.GapLengthImpl <em>Gap Length</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.GapLengthImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getGapLength()
   * @generated
   */
  int GAP_LENGTH = 64;

  /**
   * The number of structural features of the '<em>Gap Length</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GAP_LENGTH_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.HAlignImpl <em>HAlign</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.HAlignImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getHAlign()
   * @generated
   */
  int HALIGN = 65;

  /**
   * The feature id for the '<em><b>Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HALIGN__EXPRESSION = COLUMN_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Justification</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HALIGN__JUSTIFICATION = COLUMN_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>HAlign</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HALIGN_FEATURE_COUNT = COLUMN_ATTRIBUTE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.HeaderImpl <em>Header</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.HeaderImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getHeader()
   * @generated
   */
  int HEADER = 66;

  /**
   * The number of structural features of the '<em>Header</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER_FEATURE_COUNT = REPORT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.HeadlineImpl <em>Headline</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.HeadlineImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getHeadline()
   * @generated
   */
  int HEADLINE = 67;

  /**
   * The number of structural features of the '<em>Headline</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADLINE_FEATURE_COUNT = REPORT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.HideReportImpl <em>Hide Report</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.HideReportImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getHideReport()
   * @generated
   */
  int HIDE_REPORT = 68;

  /**
   * The feature id for the '<em><b>Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIDE_REPORT__EXPRESSION = NAVIGATOR_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Hide Report</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIDE_REPORT_FEATURE_COUNT = NAVIGATOR_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.HideResourceImpl <em>Hide Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.HideResourceImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getHideResource()
   * @generated
   */
  int HIDE_RESOURCE = 69;

  /**
   * The feature id for the '<em><b>Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIDE_RESOURCE__EXPRESSION = NIKU_REPORT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Hide Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIDE_RESOURCE_FEATURE_COUNT = NIKU_REPORT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.HideTaskImpl <em>Hide Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.HideTaskImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getHideTask()
   * @generated
   */
  int HIDE_TASK = 70;

  /**
   * The feature id for the '<em><b>Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIDE_TASK__EXPRESSION = NIKU_REPORT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Hide Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIDE_TASK_FEATURE_COUNT = NIKU_REPORT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.IncludeImpl <em>Include</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.IncludeImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getInclude()
   * @generated
   */
  int INCLUDE = 71;

  /**
   * The feature id for the '<em><b>Filename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE__FILENAME = PROJECT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Include</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_FEATURE_COUNT = PROJECT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.Interval1Impl <em>Interval1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.Interval1Impl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getInterval1()
   * @generated
   */
  int INTERVAL1 = 72;

  /**
   * The feature id for the '<em><b>Start</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERVAL1__START = 0;

  /**
   * The feature id for the '<em><b>End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERVAL1__END = 1;

  /**
   * The feature id for the '<em><b>Duration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERVAL1__DURATION = 2;

  /**
   * The number of structural features of the '<em>Interval1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERVAL1_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.Interval2Impl <em>Interval2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.Interval2Impl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getInterval2()
   * @generated
   */
  int INTERVAL2 = 73;

  /**
   * The feature id for the '<em><b>Start</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERVAL2__START = 0;

  /**
   * The feature id for the '<em><b>End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERVAL2__END = 1;

  /**
   * The feature id for the '<em><b>Duration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERVAL2__DURATION = 2;

  /**
   * The number of structural features of the '<em>Interval2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERVAL2_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.Interval3Impl <em>Interval3</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.Interval3Impl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getInterval3()
   * @generated
   */
  int INTERVAL3 = 74;

  /**
   * The feature id for the '<em><b>Start</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERVAL3__START = 0;

  /**
   * The feature id for the '<em><b>End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERVAL3__END = 1;

  /**
   * The feature id for the '<em><b>Duration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERVAL3__DURATION = 2;

  /**
   * The number of structural features of the '<em>Interval3</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERVAL3_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.Interval4Impl <em>Interval4</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.Interval4Impl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getInterval4()
   * @generated
   */
  int INTERVAL4 = 75;

  /**
   * The feature id for the '<em><b>Start</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERVAL4__START = 0;

  /**
   * The feature id for the '<em><b>End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERVAL4__END = 1;

  /**
   * The feature id for the '<em><b>Duration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERVAL4__DURATION = 2;

  /**
   * The number of structural features of the '<em>Interval4</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERVAL4_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.JournalAttributesImpl <em>Journal Attributes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.JournalAttributesImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getJournalAttributes()
   * @generated
   */
  int JOURNAL_ATTRIBUTES = 76;

  /**
   * The feature id for the '<em><b>All</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOURNAL_ATTRIBUTES__ALL = 0;

  /**
   * The feature id for the '<em><b>None</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOURNAL_ATTRIBUTES__NONE = 1;

  /**
   * The feature id for the '<em><b>Flags</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOURNAL_ATTRIBUTES__FLAGS = 2;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOURNAL_ATTRIBUTES__PROPERTY = 3;

  /**
   * The feature id for the '<em><b>Details</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOURNAL_ATTRIBUTES__DETAILS = 4;

  /**
   * The feature id for the '<em><b>Author</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOURNAL_ATTRIBUTES__AUTHOR = 5;

  /**
   * The feature id for the '<em><b>Headline</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOURNAL_ATTRIBUTES__HEADLINE = 6;

  /**
   * The feature id for the '<em><b>Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOURNAL_ATTRIBUTES__DATE = 7;

  /**
   * The feature id for the '<em><b>Timesheet</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOURNAL_ATTRIBUTES__TIMESHEET = 8;

  /**
   * The feature id for the '<em><b>Propertyid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOURNAL_ATTRIBUTES__PROPERTYID = 9;

  /**
   * The feature id for the '<em><b>Summary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOURNAL_ATTRIBUTES__SUMMARY = 10;

  /**
   * The number of structural features of the '<em>Journal Attributes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOURNAL_ATTRIBUTES_FEATURE_COUNT = 11;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.JournalEntryImpl <em>Journal Entry</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.JournalEntryImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getJournalEntry()
   * @generated
   */
  int JOURNAL_ENTRY = 77;

  /**
   * The feature id for the '<em><b>Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOURNAL_ENTRY__DATE = PROJECT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Headline</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOURNAL_ENTRY__HEADLINE = PROJECT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Alert</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOURNAL_ENTRY__ALERT = PROJECT_ATTRIBUTE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOURNAL_ENTRY__AUTHOR = PROJECT_ATTRIBUTE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Details</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOURNAL_ENTRY__DETAILS = PROJECT_ATTRIBUTE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Summary</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOURNAL_ENTRY__SUMMARY = PROJECT_ATTRIBUTE_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Journal Entry</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOURNAL_ENTRY_FEATURE_COUNT = PROJECT_ATTRIBUTE_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.JournalModeImpl <em>Journal Mode</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.JournalModeImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getJournalMode()
   * @generated
   */
  int JOURNAL_MODE = 78;

  /**
   * The feature id for the '<em><b>Mode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOURNAL_MODE__MODE = 0;

  /**
   * The number of structural features of the '<em>Journal Mode</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOURNAL_MODE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.LeftImpl <em>Left</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.LeftImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getLeft()
   * @generated
   */
  int LEFT = 79;

  /**
   * The number of structural features of the '<em>Left</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEFT_FEATURE_COUNT = REPORT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.LengthImpl <em>Length</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.LengthImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getLength()
   * @generated
   */
  int LENGTH = 80;

  /**
   * The feature id for the '<em><b>Length</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LENGTH__LENGTH = TASK_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Length</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LENGTH_FEATURE_COUNT = TASK_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.LimitsImpl <em>Limits</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.LimitsImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getLimits()
   * @generated
   */
  int LIMITS = 81;

  /**
   * The feature id for the '<em><b>Dailymax</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIMITS__DAILYMAX = GLOBAL_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Dailymin</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIMITS__DAILYMIN = GLOBAL_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Maximum</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIMITS__MAXIMUM = GLOBAL_ATTRIBUTE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Minimum</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIMITS__MINIMUM = GLOBAL_ATTRIBUTE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Monthlymax</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIMITS__MONTHLYMAX = GLOBAL_ATTRIBUTE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Monthlymin</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIMITS__MONTHLYMIN = GLOBAL_ATTRIBUTE_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Weeklymax</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIMITS__WEEKLYMAX = GLOBAL_ATTRIBUTE_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Weeklymin</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIMITS__WEEKLYMIN = GLOBAL_ATTRIBUTE_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>Limits</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIMITS_FEATURE_COUNT = GLOBAL_ATTRIBUTE_FEATURE_COUNT + 8;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.ListItemImpl <em>List Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.ListItemImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getListItem()
   * @generated
   */
  int LIST_ITEM = 82;

  /**
   * The number of structural features of the '<em>List Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_ITEM_FEATURE_COUNT = COLUMN_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.ListTypeImpl <em>List Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.ListTypeImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getListType()
   * @generated
   */
  int LIST_TYPE = 83;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_TYPE__TYPE = COLUMN_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>List Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_TYPE_FEATURE_COUNT = COLUMN_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.LoadUnitImpl <em>Load Unit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.LoadUnitImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getLoadUnit()
   * @generated
   */
  int LOAD_UNIT = 84;

  /**
   * The feature id for the '<em><b>Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_UNIT__UNIT = REPORT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Load Unit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_UNIT_FEATURE_COUNT = REPORT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.ManagersImpl <em>Managers</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.ManagersImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getManagers()
   * @generated
   */
  int MANAGERS = 85;

  /**
   * The feature id for the '<em><b>Resources</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANAGERS__RESOURCES = 0;

  /**
   * The number of structural features of the '<em>Managers</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANAGERS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.MandatoryImpl <em>Mandatory</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.MandatoryImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getMandatory()
   * @generated
   */
  int MANDATORY = 86;

  /**
   * The feature id for the '<em><b>Mandatory</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANDATORY__MANDATORY = ALLOCATE_RESOURCE_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Mandatory</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANDATORY_FEATURE_COUNT = ALLOCATE_RESOURCE_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.MaxEndImpl <em>Max End</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.MaxEndImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getMaxEnd()
   * @generated
   */
  int MAX_END = 87;

  /**
   * The feature id for the '<em><b>Max End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAX_END__MAX_END = TASK_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Max End</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAX_END_FEATURE_COUNT = TASK_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.MaxStartImpl <em>Max Start</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.MaxStartImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getMaxStart()
   * @generated
   */
  int MAX_START = 89;

  /**
   * The feature id for the '<em><b>Max Start</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAX_START__MAX_START = TASK_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Max Start</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAX_START_FEATURE_COUNT = TASK_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.MilestoneImpl <em>Milestone</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.MilestoneImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getMilestone()
   * @generated
   */
  int MILESTONE = 90;

  /**
   * The feature id for the '<em><b>Milestone</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MILESTONE__MILESTONE = TASK_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Milestone</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MILESTONE_FEATURE_COUNT = TASK_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.MinimumImpl <em>Minimum</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.MinimumImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getMinimum()
   * @generated
   */
  int MINIMUM = 91;

  /**
   * The number of structural features of the '<em>Minimum</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINIMUM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.MinEndImpl <em>Min End</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.MinEndImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getMinEnd()
   * @generated
   */
  int MIN_END = 92;

  /**
   * The feature id for the '<em><b>Min End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIN_END__MIN_END = TASK_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Min End</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIN_END_FEATURE_COUNT = TASK_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.MinStartImpl <em>Min Start</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.MinStartImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getMinStart()
   * @generated
   */
  int MIN_START = 93;

  /**
   * The feature id for the '<em><b>Min Start</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIN_START__MIN_START = TASK_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Min Start</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIN_START_FEATURE_COUNT = TASK_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.MonthlyMaxImpl <em>Monthly Max</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.MonthlyMaxImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getMonthlyMax()
   * @generated
   */
  int MONTHLY_MAX = 94;

  /**
   * The number of structural features of the '<em>Monthly Max</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONTHLY_MAX_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.MonthlyMinImpl <em>Monthly Min</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.MonthlyMinImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getMonthlyMin()
   * @generated
   */
  int MONTHLY_MIN = 95;

  /**
   * The number of structural features of the '<em>Monthly Min</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONTHLY_MIN_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.NoteImpl <em>Note</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.NoteImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getNote()
   * @generated
   */
  int NOTE = 96;

  /**
   * The feature id for the '<em><b>Note</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTE__NOTE = TASK_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Note</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTE_FEATURE_COUNT = TASK_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.NowImpl <em>Now</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.NowImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getNow()
   * @generated
   */
  int NOW = 97;

  /**
   * The feature id for the '<em><b>Now</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOW__NOW = PROJECT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Now</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOW_FEATURE_COUNT = PROJECT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.NumberFormatImpl <em>Number Format</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.NumberFormatImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getNumberFormat()
   * @generated
   */
  int NUMBER_FORMAT = 98;

  /**
   * The number of structural features of the '<em>Number Format</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_FORMAT_FEATURE_COUNT = PROJECT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.PeriodImpl <em>Period</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.PeriodImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getPeriod()
   * @generated
   */
  int PERIOD = 99;

  /**
   * The feature id for the '<em><b>Period</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERIOD__PERIOD = TASK_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Period</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERIOD_FEATURE_COUNT = TASK_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.PersistentImpl <em>Persistent</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.PersistentImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getPersistent()
   * @generated
   */
  int PERSISTENT = 100;

  /**
   * The feature id for the '<em><b>Persistent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSISTENT__PERSISTENT = ALLOCATE_RESOURCE_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Persistent</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSISTENT_FEATURE_COUNT = ALLOCATE_RESOURCE_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.PrecedesImpl <em>Precedes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.PrecedesImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getPrecedes()
   * @generated
   */
  int PRECEDES = 101;

  /**
   * The number of structural features of the '<em>Precedes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECEDES_FEATURE_COUNT = TASK_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.PriorityImpl <em>Priority</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.PriorityImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getPriority()
   * @generated
   */
  int PRIORITY = 102;

  /**
   * The feature id for the '<em><b>Priority</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIORITY__PRIORITY = TASK_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Priority</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIORITY_FEATURE_COUNT = TASK_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.ProjectIdImpl <em>Id</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectIdImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getProjectId()
   * @generated
   */
  int PROJECT_ID = 103;

  /**
   * The feature id for the '<em><b>Project Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_ID__PROJECT_ID = TASK_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Id</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_ID_FEATURE_COUNT = TASK_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.ProjectIdsImpl <em>Ids</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectIdsImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getProjectIds()
   * @generated
   */
  int PROJECT_IDS = 104;

  /**
   * The feature id for the '<em><b>Ids</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_IDS__IDS = 0;

  /**
   * The number of structural features of the '<em>Ids</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_IDS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.PrologImpl <em>Prolog</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.PrologImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getProlog()
   * @generated
   */
  int PROLOG = 105;

  /**
   * The number of structural features of the '<em>Prolog</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROLOG_FEATURE_COUNT = REPORT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.PurgeImpl <em>Purge</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.PurgeImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getPurge()
   * @generated
   */
  int PURGE = 106;

  /**
   * The feature id for the '<em><b>List Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PURGE__LIST_ATTRIBUTE = TASK_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Purge</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PURGE_FEATURE_COUNT = TASK_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.RateImpl <em>Rate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.RateImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getRate()
   * @generated
   */
  int RATE = 107;

  /**
   * The feature id for the '<em><b>Rate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RATE__RATE = GLOBAL_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Rate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RATE_FEATURE_COUNT = GLOBAL_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.ReferenceExtendImpl <em>Reference Extend</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.ReferenceExtendImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getReferenceExtend()
   * @generated
   */
  int REFERENCE_EXTEND = 108;

  /**
   * The number of structural features of the '<em>Reference Extend</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_EXTEND_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.RemainingImpl <em>Remaining</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.RemainingImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getRemaining()
   * @generated
   */
  int REMAINING = 109;

  /**
   * The feature id for the '<em><b>Remaining</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMAINING__REMAINING = NEW_TASK_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Remaining</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMAINING_FEATURE_COUNT = NEW_TASK_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.ReportPrefixImpl <em>Report Prefix</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.ReportPrefixImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getReportPrefix()
   * @generated
   */
  int REPORT_PREFIX = 110;

  /**
   * The feature id for the '<em><b>Report</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPORT_PREFIX__REPORT = 0;

  /**
   * The number of structural features of the '<em>Report Prefix</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPORT_PREFIX_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.ResourceAttributesImpl <em>Resource Attributes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.ResourceAttributesImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getResourceAttributes()
   * @generated
   */
  int RESOURCE_ATTRIBUTES = 111;

  /**
   * The feature id for the '<em><b>All</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_ATTRIBUTES__ALL = 0;

  /**
   * The feature id for the '<em><b>None</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_ATTRIBUTES__NONE = 1;

  /**
   * The feature id for the '<em><b>Vacation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_ATTRIBUTES__VACATION = 2;

  /**
   * The feature id for the '<em><b>Booking</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_ATTRIBUTES__BOOKING = 3;

  /**
   * The feature id for the '<em><b>Working Hours</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_ATTRIBUTES__WORKING_HOURS = 4;

  /**
   * The number of structural features of the '<em>Resource Attributes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_ATTRIBUTES_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.ResourcePrefixImpl <em>Resource Prefix</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.ResourcePrefixImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getResourcePrefix()
   * @generated
   */
  int RESOURCE_PREFIX = 112;

  /**
   * The feature id for the '<em><b>Resource</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_PREFIX__RESOURCE = 0;

  /**
   * The number of structural features of the '<em>Resource Prefix</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_PREFIX_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.ResourceRootImpl <em>Resource Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.ResourceRootImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getResourceRoot()
   * @generated
   */
  int RESOURCE_ROOT = 114;

  /**
   * The feature id for the '<em><b>Resource</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_ROOT__RESOURCE = 0;

  /**
   * The number of structural features of the '<em>Resource Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_ROOT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.ResponsibleImpl <em>Responsible</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.ResponsibleImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getResponsible()
   * @generated
   */
  int RESPONSIBLE = 115;

  /**
   * The feature id for the '<em><b>Resources</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBLE__RESOURCES = TASK_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Responsible</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSIBLE_FEATURE_COUNT = TASK_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.RichTextExtendImpl <em>Rich Text Extend</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.RichTextExtendImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getRichTextExtend()
   * @generated
   */
  int RICH_TEXT_EXTEND = 116;

  /**
   * The number of structural features of the '<em>Rich Text Extend</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RICH_TEXT_EXTEND_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.RightImpl <em>Right</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.RightImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getRight()
   * @generated
   */
  int RIGHT = 117;

  /**
   * The number of structural features of the '<em>Right</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGHT_FEATURE_COUNT = REPORT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.RollupResourceImpl <em>Rollup Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.RollupResourceImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getRollupResource()
   * @generated
   */
  int ROLLUP_RESOURCE = 118;

  /**
   * The feature id for the '<em><b>Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLLUP_RESOURCE__EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Rollup Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLLUP_RESOURCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.RollupTaskImpl <em>Rollup Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.RollupTaskImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getRollupTask()
   * @generated
   */
  int ROLLUP_TASK = 119;

  /**
   * The feature id for the '<em><b>Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLLUP_TASK__EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Rollup Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLLUP_TASK_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.ScaleImpl <em>Scale</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.ScaleImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getScale()
   * @generated
   */
  int SCALE = 120;

  /**
   * The feature id for the '<em><b>Scale</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALE__SCALE = COLUMN_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Scale</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALE_FEATURE_COUNT = COLUMN_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.ScenarioImpl <em>Scenario</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.ScenarioImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getScenario()
   * @generated
   */
  int SCENARIO = 121;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO__ID = PROJECT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO__NAME = PROJECT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Active</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO__ACTIVE = PROJECT_ATTRIBUTE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Scenario</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO__SCENARIO = PROJECT_ATTRIBUTE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Scenario</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO_FEATURE_COUNT = PROJECT_ATTRIBUTE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.ScenariosImpl <em>Scenarios</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.ScenariosImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getScenarios()
   * @generated
   */
  int SCENARIOS = 122;

  /**
   * The feature id for the '<em><b>Scenarios</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIOS__SCENARIOS = REPORT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Scenarios</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIOS_FEATURE_COUNT = REPORT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.ScheduledImpl <em>Scheduled</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.ScheduledImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getScheduled()
   * @generated
   */
  int SCHEDULED = 123;

  /**
   * The feature id for the '<em><b>Scheduled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEDULED__SCHEDULED = TASK_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Scheduled</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEDULED_FEATURE_COUNT = TASK_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.SchedulingImpl <em>Scheduling</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.SchedulingImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getScheduling()
   * @generated
   */
  int SCHEDULING = 124;

  /**
   * The feature id for the '<em><b>Scheduling</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEDULING__SCHEDULING = TASK_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Scheduling</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEDULING_FEATURE_COUNT = TASK_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.SelectImpl <em>Select</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.SelectImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getSelect()
   * @generated
   */
  int SELECT = 125;

  /**
   * The feature id for the '<em><b>Argument</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT__ARGUMENT = ALLOCATE_RESOURCE_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Select</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_FEATURE_COUNT = ALLOCATE_RESOURCE_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.SelfContainedImpl <em>Self Contained</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.SelfContainedImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getSelfContained()
   * @generated
   */
  int SELF_CONTAINED = 126;

  /**
   * The feature id for the '<em><b>Selfcontained</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELF_CONTAINED__SELFCONTAINED = REPORT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Self Contained</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELF_CONTAINED_FEATURE_COUNT = REPORT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.ShiftImpl <em>Shift</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.ShiftImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getShift()
   * @generated
   */
  int SHIFT = 127;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFT__ID = GLOBAL_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFT__NAME = GLOBAL_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Replace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFT__REPLACE = GLOBAL_ATTRIBUTE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Timezone</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFT__TIMEZONE = GLOBAL_ATTRIBUTE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Vacation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFT__VACATION = GLOBAL_ATTRIBUTE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Shift</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFT__SHIFT = GLOBAL_ATTRIBUTE_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Working Hours</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFT__WORKING_HOURS = GLOBAL_ATTRIBUTE_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Shift</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFT_FEATURE_COUNT = GLOBAL_ATTRIBUTE_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.ShiftTimesheetImpl <em>Shift Timesheet</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.ShiftTimesheetImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getShiftTimesheet()
   * @generated
   */
  int SHIFT_TIMESHEET = 128;

  /**
   * The feature id for the '<em><b>Shift</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFT_TIMESHEET__SHIFT = TIMESHEET_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Shift Timesheet</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFT_TIMESHEET_FEATURE_COUNT = TIMESHEET_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.ShiftsImpl <em>Shifts</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.ShiftsImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getShifts()
   * @generated
   */
  int SHIFTS = 129;

  /**
   * The feature id for the '<em><b>Limits</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFTS__LIMITS = TASK_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Shifts</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFTS_FEATURE_COUNT = TASK_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.ShortTimeFormatImpl <em>Short Time Format</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.ShortTimeFormatImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getShortTimeFormat()
   * @generated
   */
  int SHORT_TIME_FORMAT = 130;

  /**
   * The feature id for the '<em><b>Short Time Format</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHORT_TIME_FORMAT__SHORT_TIME_FORMAT = PROJECT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Short Time Format</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHORT_TIME_FORMAT_FEATURE_COUNT = PROJECT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.SortJournalEntriesImpl <em>Sort Journal Entries</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.SortJournalEntriesImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getSortJournalEntries()
   * @generated
   */
  int SORT_JOURNAL_ENTRIES = 131;

  /**
   * The feature id for the '<em><b>Criteria</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SORT_JOURNAL_ENTRIES__CRITERIA = 0;

  /**
   * The number of structural features of the '<em>Sort Journal Entries</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SORT_JOURNAL_ENTRIES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.SortResourcesImpl <em>Sort Resources</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.SortResourcesImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getSortResources()
   * @generated
   */
  int SORT_RESOURCES = 132;

  /**
   * The number of structural features of the '<em>Sort Resources</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SORT_RESOURCES_FEATURE_COUNT = REPORT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.SortTasksImpl <em>Sort Tasks</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.SortTasksImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getSortTasks()
   * @generated
   */
  int SORT_TASKS = 133;

  /**
   * The number of structural features of the '<em>Sort Tasks</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SORT_TASKS_FEATURE_COUNT = REPORT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.StartImpl <em>Start</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.StartImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getStart()
   * @generated
   */
  int START = 134;

  /**
   * The feature id for the '<em><b>Start</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int START__START = TASK_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Start</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int START_FEATURE_COUNT = TASK_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.StartCreditImpl <em>Start Credit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.StartCreditImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getStartCredit()
   * @generated
   */
  int START_CREDIT = 135;

  /**
   * The feature id for the '<em><b>Start Credit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int START_CREDIT__START_CREDIT = TASK_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Start Credit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int START_CREDIT_FEATURE_COUNT = TASK_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.TaskStatusSheetAttributeImpl <em>Task Status Sheet Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.TaskStatusSheetAttributeImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getTaskStatusSheetAttribute()
   * @generated
   */
  int TASK_STATUS_SHEET_ATTRIBUTE = 141;

  /**
   * The number of structural features of the '<em>Task Status Sheet Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_STATUS_SHEET_ATTRIBUTE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.StatusStatusSheetImpl <em>Status Status Sheet</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.StatusStatusSheetImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getStatusStatusSheet()
   * @generated
   */
  int STATUS_STATUS_SHEET = 136;

  /**
   * The feature id for the '<em><b>Level</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATUS_STATUS_SHEET__LEVEL = TASK_STATUS_SHEET_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATUS_STATUS_SHEET__TEXT = TASK_STATUS_SHEET_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATUS_STATUS_SHEET__ATTRIBUTES = TASK_STATUS_SHEET_ATTRIBUTE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Status Status Sheet</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATUS_STATUS_SHEET_FEATURE_COUNT = TASK_STATUS_SHEET_ATTRIBUTE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.SummaryImpl <em>Summary</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.SummaryImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getSummary()
   * @generated
   */
  int SUMMARY = 138;

  /**
   * The number of structural features of the '<em>Summary</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUMMARY_FEATURE_COUNT = STATUS_STATUS_SHEET_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.TagFileImpl <em>Tag File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.TagFileImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getTagFile()
   * @generated
   */
  int TAG_FILE = 139;

  /**
   * The feature id for the '<em><b>File</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG_FILE__FILE = 0;

  /**
   * The feature id for the '<em><b>Hide Resource</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG_FILE__HIDE_RESOURCE = 1;

  /**
   * The feature id for the '<em><b>Hide Task</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG_FILE__HIDE_TASK = 2;

  /**
   * The feature id for the '<em><b>Rollup Resource</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG_FILE__ROLLUP_RESOURCE = 3;

  /**
   * The feature id for the '<em><b>Rollup Task</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG_FILE__ROLLUP_TASK = 4;

  /**
   * The number of structural features of the '<em>Tag File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG_FILE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.TaskStatusSheetImpl <em>Task Status Sheet</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.TaskStatusSheetImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getTaskStatusSheet()
   * @generated
   */
  int TASK_STATUS_SHEET = 140;

  /**
   * The feature id for the '<em><b>Task</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_STATUS_SHEET__TASK = TASK_STATUS_SHEET_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_STATUS_SHEET__ATTRIBUTES = TASK_STATUS_SHEET_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Task Status Sheet</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_STATUS_SHEET_FEATURE_COUNT = TASK_STATUS_SHEET_ATTRIBUTE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.TaskTimesheetImpl <em>Task Timesheet</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.TaskTimesheetImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getTaskTimesheet()
   * @generated
   */
  int TASK_TIMESHEET = 142;

  /**
   * The feature id for the '<em><b>Task</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_TIMESHEET__TASK = TIMESHEET_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_TIMESHEET__ATTRIBUTES = TIMESHEET_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Task Timesheet</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_TIMESHEET_FEATURE_COUNT = TIMESHEET_ATTRIBUTE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.TaskAttributesImpl <em>Task Attributes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.TaskAttributesImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getTaskAttributes()
   * @generated
   */
  int TASK_ATTRIBUTES = 143;

  /**
   * The feature id for the '<em><b>All</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_ATTRIBUTES__ALL = 0;

  /**
   * The feature id for the '<em><b>None</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_ATTRIBUTES__NONE = 1;

  /**
   * The feature id for the '<em><b>Responsible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_ATTRIBUTES__RESPONSIBLE = 2;

  /**
   * The feature id for the '<em><b>Flags</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_ATTRIBUTES__FLAGS = 3;

  /**
   * The feature id for the '<em><b>Maxstart</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_ATTRIBUTES__MAXSTART = 4;

  /**
   * The feature id for the '<em><b>Maxend</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_ATTRIBUTES__MAXEND = 5;

  /**
   * The feature id for the '<em><b>Priority</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_ATTRIBUTES__PRIORITY = 6;

  /**
   * The feature id for the '<em><b>Booking</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_ATTRIBUTES__BOOKING = 7;

  /**
   * The feature id for the '<em><b>Note</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_ATTRIBUTES__NOTE = 8;

  /**
   * The feature id for the '<em><b>Minstart</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_ATTRIBUTES__MINSTART = 9;

  /**
   * The feature id for the '<em><b>Minend</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_ATTRIBUTES__MINEND = 10;

  /**
   * The feature id for the '<em><b>Complete</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_ATTRIBUTES__COMPLETE = 11;

  /**
   * The feature id for the '<em><b>Depends</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_ATTRIBUTES__DEPENDS = 12;

  /**
   * The number of structural features of the '<em>Task Attributes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_ATTRIBUTES_FEATURE_COUNT = 13;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.TaskPrefixImpl <em>Task Prefix</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.TaskPrefixImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getTaskPrefix()
   * @generated
   */
  int TASK_PREFIX = 144;

  /**
   * The feature id for the '<em><b>Task</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_PREFIX__TASK = 0;

  /**
   * The number of structural features of the '<em>Task Prefix</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_PREFIX_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.TaskReportImpl <em>Task Report</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.TaskReportImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getTaskReport()
   * @generated
   */
  int TASK_REPORT = 145;

  /**
   * The number of structural features of the '<em>Task Report</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_REPORT_FEATURE_COUNT = GLOBAL_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.TaskRootImpl <em>Task Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.TaskRootImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getTaskRoot()
   * @generated
   */
  int TASK_ROOT = 146;

  /**
   * The feature id for the '<em><b>Task</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_ROOT__TASK = REPORT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Task Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_ROOT_FEATURE_COUNT = REPORT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.TextExtendImpl <em>Text Extend</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.TextExtendImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getTextExtend()
   * @generated
   */
  int TEXT_EXTEND = 147;

  /**
   * The number of structural features of the '<em>Text Extend</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_EXTEND_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.TextReportImpl <em>Text Report</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.TextReportImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getTextReport()
   * @generated
   */
  int TEXT_REPORT = 148;

  /**
   * The number of structural features of the '<em>Text Report</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_REPORT_FEATURE_COUNT = GLOBAL_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.TimeFormatImpl <em>Time Format</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.TimeFormatImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getTimeFormat()
   * @generated
   */
  int TIME_FORMAT = 149;

  /**
   * The feature id for the '<em><b>Timeformat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_FORMAT__TIMEFORMAT = REPORT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Time Format</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_FORMAT_FEATURE_COUNT = REPORT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.TimeoffImpl <em>Timeoff</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.TimeoffImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getTimeoff()
   * @generated
   */
  int TIMEOFF = 150;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMEOFF__ID = NIKU_REPORT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMEOFF__NAME = NIKU_REPORT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Timeoff</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMEOFF_FEATURE_COUNT = NIKU_REPORT_ATTRIBUTE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.TimesheetImpl <em>Timesheet</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.TimesheetImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getTimesheet()
   * @generated
   */
  int TIMESHEET = 151;

  /**
   * The feature id for the '<em><b>Resource</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMESHEET__RESOURCE = 0;

  /**
   * The feature id for the '<em><b>Interval</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMESHEET__INTERVAL = 1;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMESHEET__ATTRIBUTES = 2;

  /**
   * The number of structural features of the '<em>Timesheet</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMESHEET_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.TimesheetReportImpl <em>Timesheet Report</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.TimesheetReportImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getTimesheetReport()
   * @generated
   */
  int TIMESHEET_REPORT = 152;

  /**
   * The feature id for the '<em><b>Filename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMESHEET_REPORT__FILENAME = 0;

  /**
   * The feature id for the '<em><b>Comnent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMESHEET_REPORT__COMNENT = 1;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMESHEET_REPORT__ATTRIBUTES = 2;

  /**
   * The number of structural features of the '<em>Timesheet Report</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMESHEET_REPORT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.TimezoneImpl <em>Timezone</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.TimezoneImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getTimezone()
   * @generated
   */
  int TIMEZONE = 153;

  /**
   * The feature id for the '<em><b>Timezone</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMEZONE__TIMEZONE = PROJECT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Timezone</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMEZONE_FEATURE_COUNT = PROJECT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.TimingResolutionImpl <em>Timing Resolution</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.TimingResolutionImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getTimingResolution()
   * @generated
   */
  int TIMING_RESOLUTION = 154;

  /**
   * The feature id for the '<em><b>Timing Resolution</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMING_RESOLUTION__TIMING_RESOLUTION = PROJECT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Timing Resolution</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMING_RESOLUTION_FEATURE_COUNT = PROJECT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.TitleImpl <em>Title</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.TitleImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getTitle()
   * @generated
   */
  int TITLE = 155;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TITLE__TITLE = REPORT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Title</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TITLE_FEATURE_COUNT = REPORT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.ToolTipImpl <em>Tool Tip</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.ToolTipImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getToolTip()
   * @generated
   */
  int TOOL_TIP = 156;

  /**
   * The feature id for the '<em><b>Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOOL_TIP__EXPRESSION = COLUMN_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tip</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOOL_TIP__TIP = COLUMN_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Tool Tip</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOOL_TIP_FEATURE_COUNT = COLUMN_ATTRIBUTE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.TrackingScenarioImpl <em>Tracking Scenario</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.TrackingScenarioImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getTrackingScenario()
   * @generated
   */
  int TRACKING_SCENARIO = 157;

  /**
   * The feature id for the '<em><b>Scenario</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACKING_SCENARIO__SCENARIO = GLOBAL_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Tracking Scenario</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACKING_SCENARIO_FEATURE_COUNT = GLOBAL_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.TreeLevelImpl <em>Tree Level</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.TreeLevelImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getTreeLevel()
   * @generated
   */
  int TREE_LEVEL = 158;

  /**
   * The feature id for the '<em><b>Level</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TREE_LEVEL__LEVEL = 0;

  /**
   * The number of structural features of the '<em>Tree Level</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TREE_LEVEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.VacationImpl <em>Vacation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.VacationImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getVacation()
   * @generated
   */
  int VACATION = 159;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VACATION__NAME = GLOBAL_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Intervals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VACATION__INTERVALS = GLOBAL_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Vacation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VACATION_FEATURE_COUNT = GLOBAL_ATTRIBUTE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.VacationShiftImpl <em>Vacation Shift</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.VacationShiftImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getVacationShift()
   * @generated
   */
  int VACATION_SHIFT = 160;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VACATION_SHIFT__NAME = 0;

  /**
   * The feature id for the '<em><b>Intervals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VACATION_SHIFT__INTERVALS = 1;

  /**
   * The number of structural features of the '<em>Vacation Shift</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VACATION_SHIFT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.WarnImpl <em>Warn</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.WarnImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getWarn()
   * @generated
   */
  int WARN = 161;

  /**
   * The feature id for the '<em><b>Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WARN__EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Warn</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WARN_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.WeekStartsImpl <em>Week Starts</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.WeekStartsImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getWeekStarts()
   * @generated
   */
  int WEEK_STARTS = 162;

  /**
   * The feature id for the '<em><b>Sunday</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEEK_STARTS__SUNDAY = PROJECT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Monday</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEEK_STARTS__MONDAY = PROJECT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Week Starts</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEEK_STARTS_FEATURE_COUNT = PROJECT_ATTRIBUTE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.WeeklyMaxImpl <em>Weekly Max</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.WeeklyMaxImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getWeeklyMax()
   * @generated
   */
  int WEEKLY_MAX = 163;

  /**
   * The number of structural features of the '<em>Weekly Max</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEEKLY_MAX_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.WeeklyMinImpl <em>Weekly Min</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.WeeklyMinImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getWeeklyMin()
   * @generated
   */
  int WEEKLY_MIN = 164;

  /**
   * The number of structural features of the '<em>Weekly Min</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEEKLY_MIN_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.WidthImpl <em>Width</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.WidthImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getWidth()
   * @generated
   */
  int WIDTH = 165;

  /**
   * The feature id for the '<em><b>Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIDTH__WIDTH = COLUMN_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Width</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIDTH_FEATURE_COUNT = COLUMN_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.WorkImpl <em>Work</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.WorkImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getWork()
   * @generated
   */
  int WORK = 166;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK__VALUE = NEW_TASK_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK__UNIT = NEW_TASK_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Work</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_FEATURE_COUNT = NEW_TASK_ATTRIBUTE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.WorkingHoursImpl <em>Working Hours</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.WorkingHoursImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getWorkingHours()
   * @generated
   */
  int WORKING_HOURS = 167;

  /**
   * The feature id for the '<em><b>Weekdays</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKING_HOURS__WEEKDAYS = PROJECT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Off</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKING_HOURS__OFF = PROJECT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Hours</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKING_HOURS__HOURS = PROJECT_ATTRIBUTE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Working Hours</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKING_HOURS_FEATURE_COUNT = PROJECT_ATTRIBUTE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.YearlyWorkingDaysImpl <em>Yearly Working Days</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.YearlyWorkingDaysImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getYearlyWorkingDays()
   * @generated
   */
  int YEARLY_WORKING_DAYS = 168;

  /**
   * The feature id for the '<em><b>Yearly Working Days</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int YEARLY_WORKING_DAYS__YEARLY_WORKING_DAYS = PROJECT_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Yearly Working Days</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int YEARLY_WORKING_DAYS_FEATURE_COUNT = PROJECT_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.AccountShareImpl <em>Account Share</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.AccountShareImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getAccountShare()
   * @generated
   */
  int ACCOUNT_SHARE = 169;

  /**
   * The feature id for the '<em><b>Account</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT_SHARE__ACCOUNT = 0;

  /**
   * The feature id for the '<em><b>Share</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT_SHARE__SHARE = 1;

  /**
   * The number of structural features of the '<em>Account Share</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNT_SHARE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.ColumnImpl <em>Column</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.ColumnImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getColumn()
   * @generated
   */
  int COLUMN = 171;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN__ID = 0;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN__ATTRIBUTE = 1;

  /**
   * The number of structural features of the '<em>Column</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.CriterionImpl <em>Criterion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.CriterionImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getCriterion()
   * @generated
   */
  int CRITERION = 172;

  /**
   * The feature id for the '<em><b>Scenario</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CRITERION__SCENARIO = 0;

  /**
   * The feature id for the '<em><b>Criterion Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CRITERION__CRITERION_ID = 1;

  /**
   * The number of structural features of the '<em>Criterion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CRITERION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.CriterionIdImpl <em>Criterion Id</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.CriterionIdImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getCriterionId()
   * @generated
   */
  int CRITERION_ID = 173;

  /**
   * The feature id for the '<em><b>Column Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CRITERION_ID__COLUMN_ID = 0;

  /**
   * The feature id for the '<em><b>Direction</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CRITERION_ID__DIRECTION = 1;

  /**
   * The number of structural features of the '<em>Criterion Id</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CRITERION_ID_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.DurationQuantityImpl <em>Duration Quantity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.DurationQuantityImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getDurationQuantity()
   * @generated
   */
  int DURATION_QUANTITY = 174;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DURATION_QUANTITY__VALUE = GAP_DURATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DURATION_QUANTITY__UNIT = GAP_DURATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Duration Quantity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DURATION_QUANTITY_FEATURE_COUNT = GAP_DURATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.ExtendAttributeImpl <em>Extend Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.ExtendAttributeImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getExtendAttribute()
   * @generated
   */
  int EXTEND_ATTRIBUTE = 175;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTEND_ATTRIBUTE__ID = DATE_EXTEND_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTEND_ATTRIBUTE__NAME = DATE_EXTEND_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Inherit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTEND_ATTRIBUTE__INHERIT = DATE_EXTEND_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Scenariospecific</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTEND_ATTRIBUTE__SCENARIOSPECIFIC = DATE_EXTEND_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Extend Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTEND_ATTRIBUTE_FEATURE_COUNT = DATE_EXTEND_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.RealFormatImpl <em>Real Format</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.RealFormatImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getRealFormat()
   * @generated
   */
  int REAL_FORMAT = 176;

  /**
   * The feature id for the '<em><b>Negative Prefix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_FORMAT__NEGATIVE_PREFIX = CURRENCY_FORMAT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Negative Suffix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_FORMAT__NEGATIVE_SUFFIX = CURRENCY_FORMAT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Thousands Separator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_FORMAT__THOUSANDS_SEPARATOR = CURRENCY_FORMAT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Fraction Separator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_FORMAT__FRACTION_SEPARATOR = CURRENCY_FORMAT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Fraction Digits</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_FORMAT__FRACTION_DIGITS = CURRENCY_FORMAT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Real Format</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_FORMAT_FEATURE_COUNT = CURRENCY_FORMAT_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.ShiftLimitImpl <em>Shift Limit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.ShiftLimitImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getShiftLimit()
   * @generated
   */
  int SHIFT_LIMIT = 177;

  /**
   * The feature id for the '<em><b>Shift</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFT_LIMIT__SHIFT = 0;

  /**
   * The feature id for the '<em><b>Intervals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFT_LIMIT__INTERVALS = 1;

  /**
   * The number of structural features of the '<em>Shift Limit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFT_LIMIT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.SortImpl <em>Sort</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.SortImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getSort()
   * @generated
   */
  int SORT = 178;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SORT__ID = SORT_RESOURCES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Criteria</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SORT__CRITERIA = SORT_RESOURCES_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Sort</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SORT_FEATURE_COUNT = SORT_RESOURCES_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.TaskDependencyImpl <em>Task Dependency</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.TaskDependencyImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getTaskDependency()
   * @generated
   */
  int TASK_DEPENDENCY = 179;

  /**
   * The feature id for the '<em><b>Task</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_DEPENDENCY__TASK = DEPENDS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Gap Duration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_DEPENDENCY__GAP_DURATION = DEPENDS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Gap Length</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_DEPENDENCY__GAP_LENGTH = DEPENDS_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Policy</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_DEPENDENCY__POLICY = DEPENDS_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Task Dependency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_DEPENDENCY_FEATURE_COUNT = DEPENDS_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.TaskTimesheetAttributeImpl <em>Task Timesheet Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.TaskTimesheetAttributeImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getTaskTimesheetAttribute()
   * @generated
   */
  int TASK_TIMESHEET_ATTRIBUTE = 180;

  /**
   * The number of structural features of the '<em>Task Timesheet Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_TIMESHEET_ATTRIBUTE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.TimesheetReportAttributeImpl <em>Timesheet Report Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.TimesheetReportAttributeImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getTimesheetReportAttribute()
   * @generated
   */
  int TIMESHEET_REPORT_ATTRIBUTE = 182;

  /**
   * The number of structural features of the '<em>Timesheet Report Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMESHEET_REPORT_ATTRIBUTE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.RichTextImpl <em>Rich Text</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.RichTextImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getRichText()
   * @generated
   */
  int RICH_TEXT = 183;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RICH_TEXT__TEXT = CAPTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Rich Text</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RICH_TEXT_FEATURE_COUNT = CAPTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.WorkHoursImpl <em>Work Hours</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.WorkHoursImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getWorkHours()
   * @generated
   */
  int WORK_HOURS = 184;

  /**
   * The feature id for the '<em><b>Start</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_HOURS__START = 0;

  /**
   * The feature id for the '<em><b>Stop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_HOURS__STOP = 1;

  /**
   * The number of structural features of the '<em>Work Hours</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_HOURS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.impl.WeekdaysImpl <em>Weekdays</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.impl.WeekdaysImpl
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getWeekdays()
   * @generated
   */
  int WEEKDAYS = 185;

  /**
   * The feature id for the '<em><b>First</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEEKDAYS__FIRST = 0;

  /**
   * The feature id for the '<em><b>Last</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEEKDAYS__LAST = 1;

  /**
   * The number of structural features of the '<em>Weekdays</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEEKDAYS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.ChargeApplies <em>Charge Applies</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.ChargeApplies
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getChargeApplies()
   * @generated
   */
  int CHARGE_APPLIES = 186;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.Justification <em>Justification</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.Justification
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getJustification()
   * @generated
   */
  int JUSTIFICATION = 187;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.JournalModeValue <em>Journal Mode Value</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.JournalModeValue
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getJournalModeValue()
   * @generated
   */
  int JOURNAL_MODE_VALUE = 188;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.JournalEntrySortCriterion <em>Journal Entry Sort Criterion</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.JournalEntrySortCriterion
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getJournalEntrySortCriterion()
   * @generated
   */
  int JOURNAL_ENTRY_SORT_CRITERION = 189;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.ListTypeValues <em>List Type Values</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.ListTypeValues
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getListTypeValues()
   * @generated
   */
  int LIST_TYPE_VALUES = 190;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.CriterionDirection <em>Criterion Direction</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.CriterionDirection
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getCriterionDirection()
   * @generated
   */
  int CRITERION_DIRECTION = 191;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.YesNo <em>Yes No</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.YesNo
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getYesNo()
   * @generated
   */
  int YES_NO = 192;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.ReportFormat <em>Report Format</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.ReportFormat
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getReportFormat()
   * @generated
   */
  int REPORT_FORMAT = 193;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.LoadDisplayUnit <em>Load Display Unit</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.LoadDisplayUnit
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getLoadDisplayUnit()
   * @generated
   */
  int LOAD_DISPLAY_UNIT = 194;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.ScaleResolution <em>Scale Resolution</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.ScaleResolution
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getScaleResolution()
   * @generated
   */
  int SCALE_RESOLUTION = 195;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.SelectArgument <em>Select Argument</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.SelectArgument
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getSelectArgument()
   * @generated
   */
  int SELECT_ARGUMENT = 196;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.ColumnId <em>Column Id</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.ColumnId
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getColumnId()
   * @generated
   */
  int COLUMN_ID = 197;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.AlertLevel <em>Alert Level</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.AlertLevel
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getAlertLevel()
   * @generated
   */
  int ALERT_LEVEL = 198;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.DependsPolicy <em>Depends Policy</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.DependsPolicy
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getDependsPolicy()
   * @generated
   */
  int DEPENDS_POLICY = 199;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.SchedulingPolicy <em>Scheduling Policy</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.SchedulingPolicy
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getSchedulingPolicy()
   * @generated
   */
  int SCHEDULING_POLICY = 200;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.TimeUnit <em>Time Unit</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.TimeUnit
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getTimeUnit()
   * @generated
   */
  int TIME_UNIT = 201;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.Weekday <em>Weekday</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.Weekday
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getWeekday()
   * @generated
   */
  int WEEKDAY = 202;

  /**
   * The meta object id for the '{@link org.jjflyboy.tjpeditor.project.WorkQuantityUnit <em>Work Quantity Unit</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.jjflyboy.tjpeditor.project.WorkQuantityUnit
   * @see org.jjflyboy.tjpeditor.project.impl.ProjectPackageImpl#getWorkQuantityUnit()
   * @generated
   */
  int WORK_QUANTITY_UNIT = 203;


  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Global <em>Global</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Global</em>'.
   * @see org.jjflyboy.tjpeditor.project.Global
   * @generated
   */
  EClass getGlobal();

  /**
   * Returns the meta object for the containment reference '{@link org.jjflyboy.tjpeditor.project.Global#getProject <em>Project</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Project</em>'.
   * @see org.jjflyboy.tjpeditor.project.Global#getProject()
   * @see #getGlobal()
   * @generated
   */
  EReference getGlobal_Project();

  /**
   * Returns the meta object for the containment reference list '{@link org.jjflyboy.tjpeditor.project.Global#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.jjflyboy.tjpeditor.project.Global#getAttributes()
   * @see #getGlobal()
   * @generated
   */
  EReference getGlobal_Attributes();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.GlobalAttribute <em>Global Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Global Attribute</em>'.
   * @see org.jjflyboy.tjpeditor.project.GlobalAttribute
   * @generated
   */
  EClass getGlobalAttribute();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Account <em>Account</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Account</em>'.
   * @see org.jjflyboy.tjpeditor.project.Account
   * @generated
   */
  EClass getAccount();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Account#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.jjflyboy.tjpeditor.project.Account#getId()
   * @see #getAccount()
   * @generated
   */
  EAttribute getAccount_Id();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Account#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.jjflyboy.tjpeditor.project.Account#getName()
   * @see #getAccount()
   * @generated
   */
  EAttribute getAccount_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.jjflyboy.tjpeditor.project.Account#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.jjflyboy.tjpeditor.project.Account#getAttributes()
   * @see #getAccount()
   * @generated
   */
  EReference getAccount_Attributes();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.AccountAttribute <em>Account Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Account Attribute</em>'.
   * @see org.jjflyboy.tjpeditor.project.AccountAttribute
   * @generated
   */
  EClass getAccountAttribute();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.SupplementAccount <em>Supplement Account</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Supplement Account</em>'.
   * @see org.jjflyboy.tjpeditor.project.SupplementAccount
   * @generated
   */
  EClass getSupplementAccount();

  /**
   * Returns the meta object for the reference '{@link org.jjflyboy.tjpeditor.project.SupplementAccount#getAccount <em>Account</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Account</em>'.
   * @see org.jjflyboy.tjpeditor.project.SupplementAccount#getAccount()
   * @see #getSupplementAccount()
   * @generated
   */
  EReference getSupplementAccount_Account();

  /**
   * Returns the meta object for the containment reference list '{@link org.jjflyboy.tjpeditor.project.SupplementAccount#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.jjflyboy.tjpeditor.project.SupplementAccount#getAttributes()
   * @see #getSupplementAccount()
   * @generated
   */
  EReference getSupplementAccount_Attributes();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Project <em>Project</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Project</em>'.
   * @see org.jjflyboy.tjpeditor.project.Project
   * @generated
   */
  EClass getProject();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Project#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.jjflyboy.tjpeditor.project.Project#getId()
   * @see #getProject()
   * @generated
   */
  EAttribute getProject_Id();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Project#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.jjflyboy.tjpeditor.project.Project#getName()
   * @see #getProject()
   * @generated
   */
  EAttribute getProject_Name();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Project#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version</em>'.
   * @see org.jjflyboy.tjpeditor.project.Project#getVersion()
   * @see #getProject()
   * @generated
   */
  EAttribute getProject_Version();

  /**
   * Returns the meta object for the containment reference '{@link org.jjflyboy.tjpeditor.project.Project#getInterval <em>Interval</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Interval</em>'.
   * @see org.jjflyboy.tjpeditor.project.Project#getInterval()
   * @see #getProject()
   * @generated
   */
  EReference getProject_Interval();

  /**
   * Returns the meta object for the containment reference list '{@link org.jjflyboy.tjpeditor.project.Project#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.jjflyboy.tjpeditor.project.Project#getAttributes()
   * @see #getProject()
   * @generated
   */
  EReference getProject_Attributes();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.ProjectAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see org.jjflyboy.tjpeditor.project.ProjectAttribute
   * @generated
   */
  EClass getProjectAttribute();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Task <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task</em>'.
   * @see org.jjflyboy.tjpeditor.project.Task
   * @generated
   */
  EClass getTask();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Task#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.jjflyboy.tjpeditor.project.Task#getId()
   * @see #getTask()
   * @generated
   */
  EAttribute getTask_Id();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Task#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.jjflyboy.tjpeditor.project.Task#getName()
   * @see #getTask()
   * @generated
   */
  EAttribute getTask_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.jjflyboy.tjpeditor.project.Task#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.jjflyboy.tjpeditor.project.Task#getAttributes()
   * @see #getTask()
   * @generated
   */
  EReference getTask_Attributes();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.SupplementTask <em>Supplement Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Supplement Task</em>'.
   * @see org.jjflyboy.tjpeditor.project.SupplementTask
   * @generated
   */
  EClass getSupplementTask();

  /**
   * Returns the meta object for the reference '{@link org.jjflyboy.tjpeditor.project.SupplementTask#getTask <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Task</em>'.
   * @see org.jjflyboy.tjpeditor.project.SupplementTask#getTask()
   * @see #getSupplementTask()
   * @generated
   */
  EReference getSupplementTask_Task();

  /**
   * Returns the meta object for the containment reference list '{@link org.jjflyboy.tjpeditor.project.SupplementTask#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.jjflyboy.tjpeditor.project.SupplementTask#getAttributes()
   * @see #getSupplementTask()
   * @generated
   */
  EReference getSupplementTask_Attributes();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.TaskAttribute <em>Task Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task Attribute</em>'.
   * @see org.jjflyboy.tjpeditor.project.TaskAttribute
   * @generated
   */
  EClass getTaskAttribute();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Report <em>Report</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Report</em>'.
   * @see org.jjflyboy.tjpeditor.project.Report
   * @generated
   */
  EClass getReport();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Report#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.jjflyboy.tjpeditor.project.Report#getId()
   * @see #getReport()
   * @generated
   */
  EAttribute getReport_Id();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Report#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.jjflyboy.tjpeditor.project.Report#getName()
   * @see #getReport()
   * @generated
   */
  EAttribute getReport_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.jjflyboy.tjpeditor.project.Report#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.jjflyboy.tjpeditor.project.Report#getAttributes()
   * @see #getReport()
   * @generated
   */
  EReference getReport_Attributes();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.SupplementReport <em>Supplement Report</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Supplement Report</em>'.
   * @see org.jjflyboy.tjpeditor.project.SupplementReport
   * @generated
   */
  EClass getSupplementReport();

  /**
   * Returns the meta object for the reference '{@link org.jjflyboy.tjpeditor.project.SupplementReport#getReport <em>Report</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Report</em>'.
   * @see org.jjflyboy.tjpeditor.project.SupplementReport#getReport()
   * @see #getSupplementReport()
   * @generated
   */
  EReference getSupplementReport_Report();

  /**
   * Returns the meta object for the containment reference list '{@link org.jjflyboy.tjpeditor.project.SupplementReport#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.jjflyboy.tjpeditor.project.SupplementReport#getAttributes()
   * @see #getSupplementReport()
   * @generated
   */
  EReference getSupplementReport_Attributes();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.ReportAttribute <em>Report Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Report Attribute</em>'.
   * @see org.jjflyboy.tjpeditor.project.ReportAttribute
   * @generated
   */
  EClass getReportAttribute();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Resource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resource</em>'.
   * @see org.jjflyboy.tjpeditor.project.Resource
   * @generated
   */
  EClass getResource();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Resource#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.jjflyboy.tjpeditor.project.Resource#getId()
   * @see #getResource()
   * @generated
   */
  EAttribute getResource_Id();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Resource#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.jjflyboy.tjpeditor.project.Resource#getName()
   * @see #getResource()
   * @generated
   */
  EAttribute getResource_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.jjflyboy.tjpeditor.project.Resource#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.jjflyboy.tjpeditor.project.Resource#getAttributes()
   * @see #getResource()
   * @generated
   */
  EReference getResource_Attributes();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.SupplementResource <em>Supplement Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Supplement Resource</em>'.
   * @see org.jjflyboy.tjpeditor.project.SupplementResource
   * @generated
   */
  EClass getSupplementResource();

  /**
   * Returns the meta object for the reference '{@link org.jjflyboy.tjpeditor.project.SupplementResource#getResource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Resource</em>'.
   * @see org.jjflyboy.tjpeditor.project.SupplementResource#getResource()
   * @see #getSupplementResource()
   * @generated
   */
  EReference getSupplementResource_Resource();

  /**
   * Returns the meta object for the containment reference list '{@link org.jjflyboy.tjpeditor.project.SupplementResource#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.jjflyboy.tjpeditor.project.SupplementResource#getAttributes()
   * @see #getSupplementResource()
   * @generated
   */
  EReference getSupplementResource_Attributes();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.ResourceAttribute <em>Resource Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resource Attribute</em>'.
   * @see org.jjflyboy.tjpeditor.project.ResourceAttribute
   * @generated
   */
  EClass getResourceAttribute();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Allocate <em>Allocate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Allocate</em>'.
   * @see org.jjflyboy.tjpeditor.project.Allocate
   * @generated
   */
  EClass getAllocate();

  /**
   * Returns the meta object for the containment reference list '{@link org.jjflyboy.tjpeditor.project.Allocate#getResources <em>Resources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Resources</em>'.
   * @see org.jjflyboy.tjpeditor.project.Allocate#getResources()
   * @see #getAllocate()
   * @generated
   */
  EReference getAllocate_Resources();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.AllocateResource <em>Allocate Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Allocate Resource</em>'.
   * @see org.jjflyboy.tjpeditor.project.AllocateResource
   * @generated
   */
  EClass getAllocateResource();

  /**
   * Returns the meta object for the reference '{@link org.jjflyboy.tjpeditor.project.AllocateResource#getResource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Resource</em>'.
   * @see org.jjflyboy.tjpeditor.project.AllocateResource#getResource()
   * @see #getAllocateResource()
   * @generated
   */
  EReference getAllocateResource_Resource();

  /**
   * Returns the meta object for the containment reference list '{@link org.jjflyboy.tjpeditor.project.AllocateResource#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.jjflyboy.tjpeditor.project.AllocateResource#getAttributes()
   * @see #getAllocateResource()
   * @generated
   */
  EReference getAllocateResource_Attributes();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.AllocateResourceAttribute <em>Allocate Resource Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Allocate Resource Attribute</em>'.
   * @see org.jjflyboy.tjpeditor.project.AllocateResourceAttribute
   * @generated
   */
  EClass getAllocateResourceAttribute();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Navigator <em>Navigator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Navigator</em>'.
   * @see org.jjflyboy.tjpeditor.project.Navigator
   * @generated
   */
  EClass getNavigator();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Navigator#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.jjflyboy.tjpeditor.project.Navigator#getId()
   * @see #getNavigator()
   * @generated
   */
  EAttribute getNavigator_Id();

  /**
   * Returns the meta object for the containment reference list '{@link org.jjflyboy.tjpeditor.project.Navigator#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.jjflyboy.tjpeditor.project.Navigator#getAttributes()
   * @see #getNavigator()
   * @generated
   */
  EReference getNavigator_Attributes();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.NavigatorAttribute <em>Navigator Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Navigator Attribute</em>'.
   * @see org.jjflyboy.tjpeditor.project.NavigatorAttribute
   * @generated
   */
  EClass getNavigatorAttribute();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.NewTask <em>New Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>New Task</em>'.
   * @see org.jjflyboy.tjpeditor.project.NewTask
   * @generated
   */
  EClass getNewTask();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.NewTask#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.jjflyboy.tjpeditor.project.NewTask#getId()
   * @see #getNewTask()
   * @generated
   */
  EAttribute getNewTask_Id();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.NewTask#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see org.jjflyboy.tjpeditor.project.NewTask#getText()
   * @see #getNewTask()
   * @generated
   */
  EAttribute getNewTask_Text();

  /**
   * Returns the meta object for the containment reference list '{@link org.jjflyboy.tjpeditor.project.NewTask#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.jjflyboy.tjpeditor.project.NewTask#getAttributes()
   * @see #getNewTask()
   * @generated
   */
  EReference getNewTask_Attributes();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.NewTaskAttribute <em>New Task Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>New Task Attribute</em>'.
   * @see org.jjflyboy.tjpeditor.project.NewTaskAttribute
   * @generated
   */
  EClass getNewTaskAttribute();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.NikuReport <em>Niku Report</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Niku Report</em>'.
   * @see org.jjflyboy.tjpeditor.project.NikuReport
   * @generated
   */
  EClass getNikuReport();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.NikuReport#getFilename <em>Filename</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Filename</em>'.
   * @see org.jjflyboy.tjpeditor.project.NikuReport#getFilename()
   * @see #getNikuReport()
   * @generated
   */
  EAttribute getNikuReport_Filename();

  /**
   * Returns the meta object for the containment reference list '{@link org.jjflyboy.tjpeditor.project.NikuReport#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.jjflyboy.tjpeditor.project.NikuReport#getAttributes()
   * @see #getNikuReport()
   * @generated
   */
  EReference getNikuReport_Attributes();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.NikuReportAttribute <em>Niku Report Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Niku Report Attribute</em>'.
   * @see org.jjflyboy.tjpeditor.project.NikuReportAttribute
   * @generated
   */
  EClass getNikuReportAttribute();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Alert <em>Alert</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Alert</em>'.
   * @see org.jjflyboy.tjpeditor.project.Alert
   * @generated
   */
  EClass getAlert();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Alert#getLevel <em>Level</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Level</em>'.
   * @see org.jjflyboy.tjpeditor.project.Alert#getLevel()
   * @see #getAlert()
   * @generated
   */
  EAttribute getAlert_Level();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Alternative <em>Alternative</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Alternative</em>'.
   * @see org.jjflyboy.tjpeditor.project.Alternative
   * @generated
   */
  EClass getAlternative();

  /**
   * Returns the meta object for the reference list '{@link org.jjflyboy.tjpeditor.project.Alternative#getResources <em>Resources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Resources</em>'.
   * @see org.jjflyboy.tjpeditor.project.Alternative#getResources()
   * @see #getAlternative()
   * @generated
   */
  EReference getAlternative_Resources();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Author <em>Author</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Author</em>'.
   * @see org.jjflyboy.tjpeditor.project.Author
   * @generated
   */
  EClass getAuthor();

  /**
   * Returns the meta object for the reference '{@link org.jjflyboy.tjpeditor.project.Author#getResource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Resource</em>'.
   * @see org.jjflyboy.tjpeditor.project.Author#getResource()
   * @see #getAuthor()
   * @generated
   */
  EReference getAuthor_Resource();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Balance <em>Balance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Balance</em>'.
   * @see org.jjflyboy.tjpeditor.project.Balance
   * @generated
   */
  EClass getBalance();

  /**
   * Returns the meta object for the reference '{@link org.jjflyboy.tjpeditor.project.Balance#getCost <em>Cost</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Cost</em>'.
   * @see org.jjflyboy.tjpeditor.project.Balance#getCost()
   * @see #getBalance()
   * @generated
   */
  EReference getBalance_Cost();

  /**
   * Returns the meta object for the reference '{@link org.jjflyboy.tjpeditor.project.Balance#getRevenue <em>Revenue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Revenue</em>'.
   * @see org.jjflyboy.tjpeditor.project.Balance#getRevenue()
   * @see #getBalance()
   * @generated
   */
  EReference getBalance_Revenue();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Booking <em>Booking</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Booking</em>'.
   * @see org.jjflyboy.tjpeditor.project.Booking
   * @generated
   */
  EClass getBooking();

  /**
   * Returns the meta object for the containment reference '{@link org.jjflyboy.tjpeditor.project.Booking#getInterval <em>Interval</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Interval</em>'.
   * @see org.jjflyboy.tjpeditor.project.Booking#getInterval()
   * @see #getBooking()
   * @generated
   */
  EReference getBooking_Interval();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Booking#getOvertime <em>Overtime</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Overtime</em>'.
   * @see org.jjflyboy.tjpeditor.project.Booking#getOvertime()
   * @see #getBooking()
   * @generated
   */
  EAttribute getBooking_Overtime();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Booking#getSloppy <em>Sloppy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sloppy</em>'.
   * @see org.jjflyboy.tjpeditor.project.Booking#getSloppy()
   * @see #getBooking()
   * @generated
   */
  EAttribute getBooking_Sloppy();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.BookingTask <em>Booking Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Booking Task</em>'.
   * @see org.jjflyboy.tjpeditor.project.BookingTask
   * @generated
   */
  EClass getBookingTask();

  /**
   * Returns the meta object for the reference '{@link org.jjflyboy.tjpeditor.project.BookingTask#getResource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Resource</em>'.
   * @see org.jjflyboy.tjpeditor.project.BookingTask#getResource()
   * @see #getBookingTask()
   * @generated
   */
  EReference getBookingTask_Resource();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.BookingResource <em>Booking Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Booking Resource</em>'.
   * @see org.jjflyboy.tjpeditor.project.BookingResource
   * @generated
   */
  EClass getBookingResource();

  /**
   * Returns the meta object for the reference '{@link org.jjflyboy.tjpeditor.project.BookingResource#getTask <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Task</em>'.
   * @see org.jjflyboy.tjpeditor.project.BookingResource#getTask()
   * @see #getBookingResource()
   * @generated
   */
  EReference getBookingResource_Task();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Caption <em>Caption</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Caption</em>'.
   * @see org.jjflyboy.tjpeditor.project.Caption
   * @generated
   */
  EClass getCaption();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.CellColor <em>Cell Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cell Color</em>'.
   * @see org.jjflyboy.tjpeditor.project.CellColor
   * @generated
   */
  EClass getCellColor();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.CellColor#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expression</em>'.
   * @see org.jjflyboy.tjpeditor.project.CellColor#getExpression()
   * @see #getCellColor()
   * @generated
   */
  EAttribute getCellColor_Expression();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.CellColor#getColor <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Color</em>'.
   * @see org.jjflyboy.tjpeditor.project.CellColor#getColor()
   * @see #getCellColor()
   * @generated
   */
  EAttribute getCellColor_Color();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.CellText <em>Cell Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cell Text</em>'.
   * @see org.jjflyboy.tjpeditor.project.CellText
   * @generated
   */
  EClass getCellText();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.CellText#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see org.jjflyboy.tjpeditor.project.CellText#getText()
   * @see #getCellText()
   * @generated
   */
  EAttribute getCellText_Text();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.CellText#getExpresssion <em>Expresssion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expresssion</em>'.
   * @see org.jjflyboy.tjpeditor.project.CellText#getExpresssion()
   * @see #getCellText()
   * @generated
   */
  EAttribute getCellText_Expresssion();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Center <em>Center</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Center</em>'.
   * @see org.jjflyboy.tjpeditor.project.Center
   * @generated
   */
  EClass getCenter();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Charge <em>Charge</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Charge</em>'.
   * @see org.jjflyboy.tjpeditor.project.Charge
   * @generated
   */
  EClass getCharge();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Charge#getAmount <em>Amount</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Amount</em>'.
   * @see org.jjflyboy.tjpeditor.project.Charge#getAmount()
   * @see #getCharge()
   * @generated
   */
  EAttribute getCharge_Amount();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Charge#getApplies <em>Applies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Applies</em>'.
   * @see org.jjflyboy.tjpeditor.project.Charge#getApplies()
   * @see #getCharge()
   * @generated
   */
  EAttribute getCharge_Applies();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.ChargeSet <em>Charge Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Charge Set</em>'.
   * @see org.jjflyboy.tjpeditor.project.ChargeSet
   * @generated
   */
  EClass getChargeSet();

  /**
   * Returns the meta object for the containment reference list '{@link org.jjflyboy.tjpeditor.project.ChargeSet#getAccountShares <em>Account Shares</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Account Shares</em>'.
   * @see org.jjflyboy.tjpeditor.project.ChargeSet#getAccountShares()
   * @see #getChargeSet()
   * @generated
   */
  EReference getChargeSet_AccountShares();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Columns <em>Columns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Columns</em>'.
   * @see org.jjflyboy.tjpeditor.project.Columns
   * @generated
   */
  EClass getColumns();

  /**
   * Returns the meta object for the containment reference list '{@link org.jjflyboy.tjpeditor.project.Columns#getColumns <em>Columns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Columns</em>'.
   * @see org.jjflyboy.tjpeditor.project.Columns#getColumns()
   * @see #getColumns()
   * @generated
   */
  EReference getColumns_Columns();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Complete <em>Complete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Complete</em>'.
   * @see org.jjflyboy.tjpeditor.project.Complete
   * @generated
   */
  EClass getComplete();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Complete#getComplete <em>Complete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Complete</em>'.
   * @see org.jjflyboy.tjpeditor.project.Complete#getComplete()
   * @see #getComplete()
   * @generated
   */
  EAttribute getComplete_Complete();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Copyright <em>Copyright</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Copyright</em>'.
   * @see org.jjflyboy.tjpeditor.project.Copyright
   * @generated
   */
  EClass getCopyright();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Copyright#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see org.jjflyboy.tjpeditor.project.Copyright#getText()
   * @see #getCopyright()
   * @generated
   */
  EAttribute getCopyright_Text();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Credit <em>Credit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Credit</em>'.
   * @see org.jjflyboy.tjpeditor.project.Credit
   * @generated
   */
  EClass getCredit();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Credit#getDate <em>Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Date</em>'.
   * @see org.jjflyboy.tjpeditor.project.Credit#getDate()
   * @see #getCredit()
   * @generated
   */
  EAttribute getCredit_Date();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Credit#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.jjflyboy.tjpeditor.project.Credit#getDescription()
   * @see #getCredit()
   * @generated
   */
  EAttribute getCredit_Description();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Credit#getAmount <em>Amount</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Amount</em>'.
   * @see org.jjflyboy.tjpeditor.project.Credit#getAmount()
   * @see #getCredit()
   * @generated
   */
  EAttribute getCredit_Amount();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Currency <em>Currency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Currency</em>'.
   * @see org.jjflyboy.tjpeditor.project.Currency
   * @generated
   */
  EClass getCurrency();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Currency#getCurrency <em>Currency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Currency</em>'.
   * @see org.jjflyboy.tjpeditor.project.Currency#getCurrency()
   * @see #getCurrency()
   * @generated
   */
  EAttribute getCurrency_Currency();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.CurrencyFormat <em>Currency Format</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Currency Format</em>'.
   * @see org.jjflyboy.tjpeditor.project.CurrencyFormat
   * @generated
   */
  EClass getCurrencyFormat();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.DateExtend <em>Date Extend</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Date Extend</em>'.
   * @see org.jjflyboy.tjpeditor.project.DateExtend
   * @generated
   */
  EClass getDateExtend();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Limit <em>Limit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Limit</em>'.
   * @see org.jjflyboy.tjpeditor.project.Limit
   * @generated
   */
  EClass getLimit();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Limit#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.jjflyboy.tjpeditor.project.Limit#getValue()
   * @see #getLimit()
   * @generated
   */
  EAttribute getLimit_Value();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Limit#getUnit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unit</em>'.
   * @see org.jjflyboy.tjpeditor.project.Limit#getUnit()
   * @see #getLimit()
   * @generated
   */
  EAttribute getLimit_Unit();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Limit#getEnd <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End</em>'.
   * @see org.jjflyboy.tjpeditor.project.Limit#getEnd()
   * @see #getLimit()
   * @generated
   */
  EAttribute getLimit_End();

  /**
   * Returns the meta object for the containment reference '{@link org.jjflyboy.tjpeditor.project.Limit#getPeriod <em>Period</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Period</em>'.
   * @see org.jjflyboy.tjpeditor.project.Limit#getPeriod()
   * @see #getLimit()
   * @generated
   */
  EReference getLimit_Period();

  /**
   * Returns the meta object for the reference list '{@link org.jjflyboy.tjpeditor.project.Limit#getResources <em>Resources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Resources</em>'.
   * @see org.jjflyboy.tjpeditor.project.Limit#getResources()
   * @see #getLimit()
   * @generated
   */
  EReference getLimit_Resources();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.DailyWorkingHours <em>Daily Working Hours</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Daily Working Hours</em>'.
   * @see org.jjflyboy.tjpeditor.project.DailyWorkingHours
   * @generated
   */
  EClass getDailyWorkingHours();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.DailyWorkingHours#getDailyWorkingHours <em>Daily Working Hours</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Daily Working Hours</em>'.
   * @see org.jjflyboy.tjpeditor.project.DailyWorkingHours#getDailyWorkingHours()
   * @see #getDailyWorkingHours()
   * @generated
   */
  EAttribute getDailyWorkingHours_DailyWorkingHours();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Definitions <em>Definitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Definitions</em>'.
   * @see org.jjflyboy.tjpeditor.project.Definitions
   * @generated
   */
  EClass getDefinitions();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Definitions#isAll <em>All</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>All</em>'.
   * @see org.jjflyboy.tjpeditor.project.Definitions#isAll()
   * @see #getDefinitions()
   * @generated
   */
  EAttribute getDefinitions_All();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Definitions#isNone <em>None</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>None</em>'.
   * @see org.jjflyboy.tjpeditor.project.Definitions#isNone()
   * @see #getDefinitions()
   * @generated
   */
  EAttribute getDefinitions_None();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Definitions#isFlags <em>Flags</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Flags</em>'.
   * @see org.jjflyboy.tjpeditor.project.Definitions#isFlags()
   * @see #getDefinitions()
   * @generated
   */
  EAttribute getDefinitions_Flags();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Definitions#isResources <em>Resources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Resources</em>'.
   * @see org.jjflyboy.tjpeditor.project.Definitions#isResources()
   * @see #getDefinitions()
   * @generated
   */
  EAttribute getDefinitions_Resources();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Definitions#isTasks <em>Tasks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tasks</em>'.
   * @see org.jjflyboy.tjpeditor.project.Definitions#isTasks()
   * @see #getDefinitions()
   * @generated
   */
  EAttribute getDefinitions_Tasks();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Definitions#isProject <em>Project</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Project</em>'.
   * @see org.jjflyboy.tjpeditor.project.Definitions#isProject()
   * @see #getDefinitions()
   * @generated
   */
  EAttribute getDefinitions_Project();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Definitions#isProjectids <em>Projectids</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Projectids</em>'.
   * @see org.jjflyboy.tjpeditor.project.Definitions#isProjectids()
   * @see #getDefinitions()
   * @generated
   */
  EAttribute getDefinitions_Projectids();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Depends <em>Depends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Depends</em>'.
   * @see org.jjflyboy.tjpeditor.project.Depends
   * @generated
   */
  EClass getDepends();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Details <em>Details</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Details</em>'.
   * @see org.jjflyboy.tjpeditor.project.Details
   * @generated
   */
  EClass getDetails();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Duration <em>Duration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Duration</em>'.
   * @see org.jjflyboy.tjpeditor.project.Duration
   * @generated
   */
  EClass getDuration();

  /**
   * Returns the meta object for the containment reference '{@link org.jjflyboy.tjpeditor.project.Duration#getDuration <em>Duration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Duration</em>'.
   * @see org.jjflyboy.tjpeditor.project.Duration#getDuration()
   * @see #getDuration()
   * @generated
   */
  EReference getDuration_Duration();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Efficiency <em>Efficiency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Efficiency</em>'.
   * @see org.jjflyboy.tjpeditor.project.Efficiency
   * @generated
   */
  EClass getEfficiency();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Efficiency#getEfficiency <em>Efficiency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Efficiency</em>'.
   * @see org.jjflyboy.tjpeditor.project.Efficiency#getEfficiency()
   * @see #getEfficiency()
   * @generated
   */
  EAttribute getEfficiency_Efficiency();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Effort <em>Effort</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Effort</em>'.
   * @see org.jjflyboy.tjpeditor.project.Effort
   * @generated
   */
  EClass getEffort();

  /**
   * Returns the meta object for the containment reference '{@link org.jjflyboy.tjpeditor.project.Effort#getEffort <em>Effort</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Effort</em>'.
   * @see org.jjflyboy.tjpeditor.project.Effort#getEffort()
   * @see #getEffort()
   * @generated
   */
  EReference getEffort_Effort();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Email <em>Email</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Email</em>'.
   * @see org.jjflyboy.tjpeditor.project.Email
   * @generated
   */
  EClass getEmail();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Email#getAddress <em>Address</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Address</em>'.
   * @see org.jjflyboy.tjpeditor.project.Email#getAddress()
   * @see #getEmail()
   * @generated
   */
  EAttribute getEmail_Address();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.End <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>End</em>'.
   * @see org.jjflyboy.tjpeditor.project.End
   * @generated
   */
  EClass getEnd();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.End#getEnd <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End</em>'.
   * @see org.jjflyboy.tjpeditor.project.End#getEnd()
   * @see #getEnd()
   * @generated
   */
  EAttribute getEnd_End();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.EndCredit <em>End Credit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>End Credit</em>'.
   * @see org.jjflyboy.tjpeditor.project.EndCredit
   * @generated
   */
  EClass getEndCredit();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.EndCredit#getCredit <em>Credit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Credit</em>'.
   * @see org.jjflyboy.tjpeditor.project.EndCredit#getCredit()
   * @see #getEndCredit()
   * @generated
   */
  EAttribute getEndCredit_Credit();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Epilog <em>Epilog</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Epilog</em>'.
   * @see org.jjflyboy.tjpeditor.project.Epilog
   * @generated
   */
  EClass getEpilog();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Extend <em>Extend</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Extend</em>'.
   * @see org.jjflyboy.tjpeditor.project.Extend
   * @generated
   */
  EClass getExtend();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Extend#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.jjflyboy.tjpeditor.project.Extend#getType()
   * @see #getExtend()
   * @generated
   */
  EAttribute getExtend_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.jjflyboy.tjpeditor.project.Extend#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Reference</em>'.
   * @see org.jjflyboy.tjpeditor.project.Extend#getReference()
   * @see #getExtend()
   * @generated
   */
  EReference getExtend_Reference();

  /**
   * Returns the meta object for the containment reference '{@link org.jjflyboy.tjpeditor.project.Extend#getDate <em>Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Date</em>'.
   * @see org.jjflyboy.tjpeditor.project.Extend#getDate()
   * @see #getExtend()
   * @generated
   */
  EReference getExtend_Date();

  /**
   * Returns the meta object for the containment reference '{@link org.jjflyboy.tjpeditor.project.Extend#getRichtext <em>Richtext</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Richtext</em>'.
   * @see org.jjflyboy.tjpeditor.project.Extend#getRichtext()
   * @see #getExtend()
   * @generated
   */
  EReference getExtend_Richtext();

  /**
   * Returns the meta object for the containment reference '{@link org.jjflyboy.tjpeditor.project.Extend#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Text</em>'.
   * @see org.jjflyboy.tjpeditor.project.Extend#getText()
   * @see #getExtend()
   * @generated
   */
  EReference getExtend_Text();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Fail <em>Fail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fail</em>'.
   * @see org.jjflyboy.tjpeditor.project.Fail
   * @generated
   */
  EClass getFail();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Fail#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expression</em>'.
   * @see org.jjflyboy.tjpeditor.project.Fail#getExpression()
   * @see #getFail()
   * @generated
   */
  EAttribute getFail_Expression();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Flags <em>Flags</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Flags</em>'.
   * @see org.jjflyboy.tjpeditor.project.Flags
   * @generated
   */
  EClass getFlags();

  /**
   * Returns the meta object for the attribute list '{@link org.jjflyboy.tjpeditor.project.Flags#getFlags <em>Flags</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Flags</em>'.
   * @see org.jjflyboy.tjpeditor.project.Flags#getFlags()
   * @see #getFlags()
   * @generated
   */
  EAttribute getFlags_Flags();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.FontColor <em>Font Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Font Color</em>'.
   * @see org.jjflyboy.tjpeditor.project.FontColor
   * @generated
   */
  EClass getFontColor();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.FontColor#getColor <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Color</em>'.
   * @see org.jjflyboy.tjpeditor.project.FontColor#getColor()
   * @see #getFontColor()
   * @generated
   */
  EAttribute getFontColor_Color();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Footer <em>Footer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Footer</em>'.
   * @see org.jjflyboy.tjpeditor.project.Footer
   * @generated
   */
  EClass getFooter();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Formats <em>Formats</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Formats</em>'.
   * @see org.jjflyboy.tjpeditor.project.Formats
   * @generated
   */
  EClass getFormats();

  /**
   * Returns the meta object for the attribute list '{@link org.jjflyboy.tjpeditor.project.Formats#getFormats <em>Formats</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Formats</em>'.
   * @see org.jjflyboy.tjpeditor.project.Formats#getFormats()
   * @see #getFormats()
   * @generated
   */
  EAttribute getFormats_Formats();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.GapDuration <em>Gap Duration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Gap Duration</em>'.
   * @see org.jjflyboy.tjpeditor.project.GapDuration
   * @generated
   */
  EClass getGapDuration();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.GapLength <em>Gap Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Gap Length</em>'.
   * @see org.jjflyboy.tjpeditor.project.GapLength
   * @generated
   */
  EClass getGapLength();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.HAlign <em>HAlign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>HAlign</em>'.
   * @see org.jjflyboy.tjpeditor.project.HAlign
   * @generated
   */
  EClass getHAlign();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.HAlign#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expression</em>'.
   * @see org.jjflyboy.tjpeditor.project.HAlign#getExpression()
   * @see #getHAlign()
   * @generated
   */
  EAttribute getHAlign_Expression();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.HAlign#getJustification <em>Justification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Justification</em>'.
   * @see org.jjflyboy.tjpeditor.project.HAlign#getJustification()
   * @see #getHAlign()
   * @generated
   */
  EAttribute getHAlign_Justification();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Header <em>Header</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Header</em>'.
   * @see org.jjflyboy.tjpeditor.project.Header
   * @generated
   */
  EClass getHeader();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Headline <em>Headline</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Headline</em>'.
   * @see org.jjflyboy.tjpeditor.project.Headline
   * @generated
   */
  EClass getHeadline();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.HideReport <em>Hide Report</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hide Report</em>'.
   * @see org.jjflyboy.tjpeditor.project.HideReport
   * @generated
   */
  EClass getHideReport();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.HideReport#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expression</em>'.
   * @see org.jjflyboy.tjpeditor.project.HideReport#getExpression()
   * @see #getHideReport()
   * @generated
   */
  EAttribute getHideReport_Expression();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.HideResource <em>Hide Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hide Resource</em>'.
   * @see org.jjflyboy.tjpeditor.project.HideResource
   * @generated
   */
  EClass getHideResource();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.HideResource#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expression</em>'.
   * @see org.jjflyboy.tjpeditor.project.HideResource#getExpression()
   * @see #getHideResource()
   * @generated
   */
  EAttribute getHideResource_Expression();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.HideTask <em>Hide Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hide Task</em>'.
   * @see org.jjflyboy.tjpeditor.project.HideTask
   * @generated
   */
  EClass getHideTask();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.HideTask#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expression</em>'.
   * @see org.jjflyboy.tjpeditor.project.HideTask#getExpression()
   * @see #getHideTask()
   * @generated
   */
  EAttribute getHideTask_Expression();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Include <em>Include</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Include</em>'.
   * @see org.jjflyboy.tjpeditor.project.Include
   * @generated
   */
  EClass getInclude();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Include#getFilename <em>Filename</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Filename</em>'.
   * @see org.jjflyboy.tjpeditor.project.Include#getFilename()
   * @see #getInclude()
   * @generated
   */
  EAttribute getInclude_Filename();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Interval1 <em>Interval1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interval1</em>'.
   * @see org.jjflyboy.tjpeditor.project.Interval1
   * @generated
   */
  EClass getInterval1();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Interval1#getStart <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Start</em>'.
   * @see org.jjflyboy.tjpeditor.project.Interval1#getStart()
   * @see #getInterval1()
   * @generated
   */
  EAttribute getInterval1_Start();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Interval1#getEnd <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End</em>'.
   * @see org.jjflyboy.tjpeditor.project.Interval1#getEnd()
   * @see #getInterval1()
   * @generated
   */
  EAttribute getInterval1_End();

  /**
   * Returns the meta object for the containment reference '{@link org.jjflyboy.tjpeditor.project.Interval1#getDuration <em>Duration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Duration</em>'.
   * @see org.jjflyboy.tjpeditor.project.Interval1#getDuration()
   * @see #getInterval1()
   * @generated
   */
  EReference getInterval1_Duration();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Interval2 <em>Interval2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interval2</em>'.
   * @see org.jjflyboy.tjpeditor.project.Interval2
   * @generated
   */
  EClass getInterval2();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Interval2#getStart <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Start</em>'.
   * @see org.jjflyboy.tjpeditor.project.Interval2#getStart()
   * @see #getInterval2()
   * @generated
   */
  EAttribute getInterval2_Start();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Interval2#getEnd <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End</em>'.
   * @see org.jjflyboy.tjpeditor.project.Interval2#getEnd()
   * @see #getInterval2()
   * @generated
   */
  EAttribute getInterval2_End();

  /**
   * Returns the meta object for the containment reference '{@link org.jjflyboy.tjpeditor.project.Interval2#getDuration <em>Duration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Duration</em>'.
   * @see org.jjflyboy.tjpeditor.project.Interval2#getDuration()
   * @see #getInterval2()
   * @generated
   */
  EReference getInterval2_Duration();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Interval3 <em>Interval3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interval3</em>'.
   * @see org.jjflyboy.tjpeditor.project.Interval3
   * @generated
   */
  EClass getInterval3();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Interval3#getStart <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Start</em>'.
   * @see org.jjflyboy.tjpeditor.project.Interval3#getStart()
   * @see #getInterval3()
   * @generated
   */
  EAttribute getInterval3_Start();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Interval3#getEnd <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End</em>'.
   * @see org.jjflyboy.tjpeditor.project.Interval3#getEnd()
   * @see #getInterval3()
   * @generated
   */
  EAttribute getInterval3_End();

  /**
   * Returns the meta object for the containment reference '{@link org.jjflyboy.tjpeditor.project.Interval3#getDuration <em>Duration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Duration</em>'.
   * @see org.jjflyboy.tjpeditor.project.Interval3#getDuration()
   * @see #getInterval3()
   * @generated
   */
  EReference getInterval3_Duration();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Interval4 <em>Interval4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interval4</em>'.
   * @see org.jjflyboy.tjpeditor.project.Interval4
   * @generated
   */
  EClass getInterval4();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Interval4#getStart <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Start</em>'.
   * @see org.jjflyboy.tjpeditor.project.Interval4#getStart()
   * @see #getInterval4()
   * @generated
   */
  EAttribute getInterval4_Start();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Interval4#getEnd <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End</em>'.
   * @see org.jjflyboy.tjpeditor.project.Interval4#getEnd()
   * @see #getInterval4()
   * @generated
   */
  EAttribute getInterval4_End();

  /**
   * Returns the meta object for the containment reference '{@link org.jjflyboy.tjpeditor.project.Interval4#getDuration <em>Duration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Duration</em>'.
   * @see org.jjflyboy.tjpeditor.project.Interval4#getDuration()
   * @see #getInterval4()
   * @generated
   */
  EReference getInterval4_Duration();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.JournalAttributes <em>Journal Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Journal Attributes</em>'.
   * @see org.jjflyboy.tjpeditor.project.JournalAttributes
   * @generated
   */
  EClass getJournalAttributes();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.JournalAttributes#isAll <em>All</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>All</em>'.
   * @see org.jjflyboy.tjpeditor.project.JournalAttributes#isAll()
   * @see #getJournalAttributes()
   * @generated
   */
  EAttribute getJournalAttributes_All();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.JournalAttributes#isNone <em>None</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>None</em>'.
   * @see org.jjflyboy.tjpeditor.project.JournalAttributes#isNone()
   * @see #getJournalAttributes()
   * @generated
   */
  EAttribute getJournalAttributes_None();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.JournalAttributes#isFlags <em>Flags</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Flags</em>'.
   * @see org.jjflyboy.tjpeditor.project.JournalAttributes#isFlags()
   * @see #getJournalAttributes()
   * @generated
   */
  EAttribute getJournalAttributes_Flags();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.JournalAttributes#isProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see org.jjflyboy.tjpeditor.project.JournalAttributes#isProperty()
   * @see #getJournalAttributes()
   * @generated
   */
  EAttribute getJournalAttributes_Property();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.JournalAttributes#isDetails <em>Details</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Details</em>'.
   * @see org.jjflyboy.tjpeditor.project.JournalAttributes#isDetails()
   * @see #getJournalAttributes()
   * @generated
   */
  EAttribute getJournalAttributes_Details();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.JournalAttributes#isAuthor <em>Author</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Author</em>'.
   * @see org.jjflyboy.tjpeditor.project.JournalAttributes#isAuthor()
   * @see #getJournalAttributes()
   * @generated
   */
  EAttribute getJournalAttributes_Author();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.JournalAttributes#isHeadline <em>Headline</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Headline</em>'.
   * @see org.jjflyboy.tjpeditor.project.JournalAttributes#isHeadline()
   * @see #getJournalAttributes()
   * @generated
   */
  EAttribute getJournalAttributes_Headline();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.JournalAttributes#isDate <em>Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Date</em>'.
   * @see org.jjflyboy.tjpeditor.project.JournalAttributes#isDate()
   * @see #getJournalAttributes()
   * @generated
   */
  EAttribute getJournalAttributes_Date();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.JournalAttributes#isTimesheet <em>Timesheet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Timesheet</em>'.
   * @see org.jjflyboy.tjpeditor.project.JournalAttributes#isTimesheet()
   * @see #getJournalAttributes()
   * @generated
   */
  EAttribute getJournalAttributes_Timesheet();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.JournalAttributes#isPropertyid <em>Propertyid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Propertyid</em>'.
   * @see org.jjflyboy.tjpeditor.project.JournalAttributes#isPropertyid()
   * @see #getJournalAttributes()
   * @generated
   */
  EAttribute getJournalAttributes_Propertyid();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.JournalAttributes#isSummary <em>Summary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Summary</em>'.
   * @see org.jjflyboy.tjpeditor.project.JournalAttributes#isSummary()
   * @see #getJournalAttributes()
   * @generated
   */
  EAttribute getJournalAttributes_Summary();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.JournalEntry <em>Journal Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Journal Entry</em>'.
   * @see org.jjflyboy.tjpeditor.project.JournalEntry
   * @generated
   */
  EClass getJournalEntry();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.JournalEntry#getDate <em>Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Date</em>'.
   * @see org.jjflyboy.tjpeditor.project.JournalEntry#getDate()
   * @see #getJournalEntry()
   * @generated
   */
  EAttribute getJournalEntry_Date();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.JournalEntry#getHeadline <em>Headline</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Headline</em>'.
   * @see org.jjflyboy.tjpeditor.project.JournalEntry#getHeadline()
   * @see #getJournalEntry()
   * @generated
   */
  EAttribute getJournalEntry_Headline();

  /**
   * Returns the meta object for the containment reference '{@link org.jjflyboy.tjpeditor.project.JournalEntry#getAlert <em>Alert</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Alert</em>'.
   * @see org.jjflyboy.tjpeditor.project.JournalEntry#getAlert()
   * @see #getJournalEntry()
   * @generated
   */
  EReference getJournalEntry_Alert();

  /**
   * Returns the meta object for the containment reference '{@link org.jjflyboy.tjpeditor.project.JournalEntry#getAuthor <em>Author</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Author</em>'.
   * @see org.jjflyboy.tjpeditor.project.JournalEntry#getAuthor()
   * @see #getJournalEntry()
   * @generated
   */
  EReference getJournalEntry_Author();

  /**
   * Returns the meta object for the containment reference '{@link org.jjflyboy.tjpeditor.project.JournalEntry#getDetails <em>Details</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Details</em>'.
   * @see org.jjflyboy.tjpeditor.project.JournalEntry#getDetails()
   * @see #getJournalEntry()
   * @generated
   */
  EReference getJournalEntry_Details();

  /**
   * Returns the meta object for the containment reference '{@link org.jjflyboy.tjpeditor.project.JournalEntry#getSummary <em>Summary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Summary</em>'.
   * @see org.jjflyboy.tjpeditor.project.JournalEntry#getSummary()
   * @see #getJournalEntry()
   * @generated
   */
  EReference getJournalEntry_Summary();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.JournalMode <em>Journal Mode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Journal Mode</em>'.
   * @see org.jjflyboy.tjpeditor.project.JournalMode
   * @generated
   */
  EClass getJournalMode();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.JournalMode#getMode <em>Mode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mode</em>'.
   * @see org.jjflyboy.tjpeditor.project.JournalMode#getMode()
   * @see #getJournalMode()
   * @generated
   */
  EAttribute getJournalMode_Mode();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Left <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Left</em>'.
   * @see org.jjflyboy.tjpeditor.project.Left
   * @generated
   */
  EClass getLeft();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Length <em>Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Length</em>'.
   * @see org.jjflyboy.tjpeditor.project.Length
   * @generated
   */
  EClass getLength();

  /**
   * Returns the meta object for the containment reference '{@link org.jjflyboy.tjpeditor.project.Length#getLength <em>Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Length</em>'.
   * @see org.jjflyboy.tjpeditor.project.Length#getLength()
   * @see #getLength()
   * @generated
   */
  EReference getLength_Length();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Limits <em>Limits</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Limits</em>'.
   * @see org.jjflyboy.tjpeditor.project.Limits
   * @generated
   */
  EClass getLimits();

  /**
   * Returns the meta object for the containment reference '{@link org.jjflyboy.tjpeditor.project.Limits#getDailymax <em>Dailymax</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dailymax</em>'.
   * @see org.jjflyboy.tjpeditor.project.Limits#getDailymax()
   * @see #getLimits()
   * @generated
   */
  EReference getLimits_Dailymax();

  /**
   * Returns the meta object for the containment reference '{@link org.jjflyboy.tjpeditor.project.Limits#getDailymin <em>Dailymin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dailymin</em>'.
   * @see org.jjflyboy.tjpeditor.project.Limits#getDailymin()
   * @see #getLimits()
   * @generated
   */
  EReference getLimits_Dailymin();

  /**
   * Returns the meta object for the containment reference '{@link org.jjflyboy.tjpeditor.project.Limits#getMaximum <em>Maximum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Maximum</em>'.
   * @see org.jjflyboy.tjpeditor.project.Limits#getMaximum()
   * @see #getLimits()
   * @generated
   */
  EReference getLimits_Maximum();

  /**
   * Returns the meta object for the containment reference '{@link org.jjflyboy.tjpeditor.project.Limits#getMinimum <em>Minimum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Minimum</em>'.
   * @see org.jjflyboy.tjpeditor.project.Limits#getMinimum()
   * @see #getLimits()
   * @generated
   */
  EReference getLimits_Minimum();

  /**
   * Returns the meta object for the containment reference '{@link org.jjflyboy.tjpeditor.project.Limits#getMonthlymax <em>Monthlymax</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Monthlymax</em>'.
   * @see org.jjflyboy.tjpeditor.project.Limits#getMonthlymax()
   * @see #getLimits()
   * @generated
   */
  EReference getLimits_Monthlymax();

  /**
   * Returns the meta object for the containment reference '{@link org.jjflyboy.tjpeditor.project.Limits#getMonthlymin <em>Monthlymin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Monthlymin</em>'.
   * @see org.jjflyboy.tjpeditor.project.Limits#getMonthlymin()
   * @see #getLimits()
   * @generated
   */
  EReference getLimits_Monthlymin();

  /**
   * Returns the meta object for the containment reference '{@link org.jjflyboy.tjpeditor.project.Limits#getWeeklymax <em>Weeklymax</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Weeklymax</em>'.
   * @see org.jjflyboy.tjpeditor.project.Limits#getWeeklymax()
   * @see #getLimits()
   * @generated
   */
  EReference getLimits_Weeklymax();

  /**
   * Returns the meta object for the containment reference '{@link org.jjflyboy.tjpeditor.project.Limits#getWeeklymin <em>Weeklymin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Weeklymin</em>'.
   * @see org.jjflyboy.tjpeditor.project.Limits#getWeeklymin()
   * @see #getLimits()
   * @generated
   */
  EReference getLimits_Weeklymin();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.ListItem <em>List Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List Item</em>'.
   * @see org.jjflyboy.tjpeditor.project.ListItem
   * @generated
   */
  EClass getListItem();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.ListType <em>List Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List Type</em>'.
   * @see org.jjflyboy.tjpeditor.project.ListType
   * @generated
   */
  EClass getListType();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.ListType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.jjflyboy.tjpeditor.project.ListType#getType()
   * @see #getListType()
   * @generated
   */
  EAttribute getListType_Type();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.LoadUnit <em>Load Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Load Unit</em>'.
   * @see org.jjflyboy.tjpeditor.project.LoadUnit
   * @generated
   */
  EClass getLoadUnit();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.LoadUnit#getUnit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unit</em>'.
   * @see org.jjflyboy.tjpeditor.project.LoadUnit#getUnit()
   * @see #getLoadUnit()
   * @generated
   */
  EAttribute getLoadUnit_Unit();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Managers <em>Managers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Managers</em>'.
   * @see org.jjflyboy.tjpeditor.project.Managers
   * @generated
   */
  EClass getManagers();

  /**
   * Returns the meta object for the reference list '{@link org.jjflyboy.tjpeditor.project.Managers#getResources <em>Resources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Resources</em>'.
   * @see org.jjflyboy.tjpeditor.project.Managers#getResources()
   * @see #getManagers()
   * @generated
   */
  EReference getManagers_Resources();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Mandatory <em>Mandatory</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mandatory</em>'.
   * @see org.jjflyboy.tjpeditor.project.Mandatory
   * @generated
   */
  EClass getMandatory();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Mandatory#isMandatory <em>Mandatory</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mandatory</em>'.
   * @see org.jjflyboy.tjpeditor.project.Mandatory#isMandatory()
   * @see #getMandatory()
   * @generated
   */
  EAttribute getMandatory_Mandatory();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.MaxEnd <em>Max End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Max End</em>'.
   * @see org.jjflyboy.tjpeditor.project.MaxEnd
   * @generated
   */
  EClass getMaxEnd();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.MaxEnd#getMaxEnd <em>Max End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max End</em>'.
   * @see org.jjflyboy.tjpeditor.project.MaxEnd#getMaxEnd()
   * @see #getMaxEnd()
   * @generated
   */
  EAttribute getMaxEnd_MaxEnd();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Maximum <em>Maximum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Maximum</em>'.
   * @see org.jjflyboy.tjpeditor.project.Maximum
   * @generated
   */
  EClass getMaximum();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.MaxStart <em>Max Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Max Start</em>'.
   * @see org.jjflyboy.tjpeditor.project.MaxStart
   * @generated
   */
  EClass getMaxStart();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.MaxStart#getMaxStart <em>Max Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max Start</em>'.
   * @see org.jjflyboy.tjpeditor.project.MaxStart#getMaxStart()
   * @see #getMaxStart()
   * @generated
   */
  EAttribute getMaxStart_MaxStart();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Milestone <em>Milestone</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Milestone</em>'.
   * @see org.jjflyboy.tjpeditor.project.Milestone
   * @generated
   */
  EClass getMilestone();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Milestone#isMilestone <em>Milestone</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Milestone</em>'.
   * @see org.jjflyboy.tjpeditor.project.Milestone#isMilestone()
   * @see #getMilestone()
   * @generated
   */
  EAttribute getMilestone_Milestone();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Minimum <em>Minimum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Minimum</em>'.
   * @see org.jjflyboy.tjpeditor.project.Minimum
   * @generated
   */
  EClass getMinimum();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.MinEnd <em>Min End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Min End</em>'.
   * @see org.jjflyboy.tjpeditor.project.MinEnd
   * @generated
   */
  EClass getMinEnd();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.MinEnd#getMinEnd <em>Min End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Min End</em>'.
   * @see org.jjflyboy.tjpeditor.project.MinEnd#getMinEnd()
   * @see #getMinEnd()
   * @generated
   */
  EAttribute getMinEnd_MinEnd();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.MinStart <em>Min Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Min Start</em>'.
   * @see org.jjflyboy.tjpeditor.project.MinStart
   * @generated
   */
  EClass getMinStart();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.MinStart#getMinStart <em>Min Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Min Start</em>'.
   * @see org.jjflyboy.tjpeditor.project.MinStart#getMinStart()
   * @see #getMinStart()
   * @generated
   */
  EAttribute getMinStart_MinStart();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.MonthlyMax <em>Monthly Max</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Monthly Max</em>'.
   * @see org.jjflyboy.tjpeditor.project.MonthlyMax
   * @generated
   */
  EClass getMonthlyMax();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.MonthlyMin <em>Monthly Min</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Monthly Min</em>'.
   * @see org.jjflyboy.tjpeditor.project.MonthlyMin
   * @generated
   */
  EClass getMonthlyMin();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Note <em>Note</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Note</em>'.
   * @see org.jjflyboy.tjpeditor.project.Note
   * @generated
   */
  EClass getNote();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Note#getNote <em>Note</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Note</em>'.
   * @see org.jjflyboy.tjpeditor.project.Note#getNote()
   * @see #getNote()
   * @generated
   */
  EAttribute getNote_Note();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Now <em>Now</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Now</em>'.
   * @see org.jjflyboy.tjpeditor.project.Now
   * @generated
   */
  EClass getNow();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Now#getNow <em>Now</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Now</em>'.
   * @see org.jjflyboy.tjpeditor.project.Now#getNow()
   * @see #getNow()
   * @generated
   */
  EAttribute getNow_Now();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.NumberFormat <em>Number Format</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Format</em>'.
   * @see org.jjflyboy.tjpeditor.project.NumberFormat
   * @generated
   */
  EClass getNumberFormat();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Period <em>Period</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Period</em>'.
   * @see org.jjflyboy.tjpeditor.project.Period
   * @generated
   */
  EClass getPeriod();

  /**
   * Returns the meta object for the containment reference '{@link org.jjflyboy.tjpeditor.project.Period#getPeriod <em>Period</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Period</em>'.
   * @see org.jjflyboy.tjpeditor.project.Period#getPeriod()
   * @see #getPeriod()
   * @generated
   */
  EReference getPeriod_Period();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Persistent <em>Persistent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Persistent</em>'.
   * @see org.jjflyboy.tjpeditor.project.Persistent
   * @generated
   */
  EClass getPersistent();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Persistent#isPersistent <em>Persistent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Persistent</em>'.
   * @see org.jjflyboy.tjpeditor.project.Persistent#isPersistent()
   * @see #getPersistent()
   * @generated
   */
  EAttribute getPersistent_Persistent();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Precedes <em>Precedes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Precedes</em>'.
   * @see org.jjflyboy.tjpeditor.project.Precedes
   * @generated
   */
  EClass getPrecedes();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Priority <em>Priority</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Priority</em>'.
   * @see org.jjflyboy.tjpeditor.project.Priority
   * @generated
   */
  EClass getPriority();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Priority#getPriority <em>Priority</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Priority</em>'.
   * @see org.jjflyboy.tjpeditor.project.Priority#getPriority()
   * @see #getPriority()
   * @generated
   */
  EAttribute getPriority_Priority();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.ProjectId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Id</em>'.
   * @see org.jjflyboy.tjpeditor.project.ProjectId
   * @generated
   */
  EClass getProjectId();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.ProjectId#getProjectId <em>Project Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Project Id</em>'.
   * @see org.jjflyboy.tjpeditor.project.ProjectId#getProjectId()
   * @see #getProjectId()
   * @generated
   */
  EAttribute getProjectId_ProjectId();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.ProjectIds <em>Ids</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ids</em>'.
   * @see org.jjflyboy.tjpeditor.project.ProjectIds
   * @generated
   */
  EClass getProjectIds();

  /**
   * Returns the meta object for the attribute list '{@link org.jjflyboy.tjpeditor.project.ProjectIds#getIds <em>Ids</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Ids</em>'.
   * @see org.jjflyboy.tjpeditor.project.ProjectIds#getIds()
   * @see #getProjectIds()
   * @generated
   */
  EAttribute getProjectIds_Ids();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Prolog <em>Prolog</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Prolog</em>'.
   * @see org.jjflyboy.tjpeditor.project.Prolog
   * @generated
   */
  EClass getProlog();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Purge <em>Purge</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Purge</em>'.
   * @see org.jjflyboy.tjpeditor.project.Purge
   * @generated
   */
  EClass getPurge();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Purge#getListAttribute <em>List Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>List Attribute</em>'.
   * @see org.jjflyboy.tjpeditor.project.Purge#getListAttribute()
   * @see #getPurge()
   * @generated
   */
  EAttribute getPurge_ListAttribute();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Rate <em>Rate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rate</em>'.
   * @see org.jjflyboy.tjpeditor.project.Rate
   * @generated
   */
  EClass getRate();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Rate#getRate <em>Rate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rate</em>'.
   * @see org.jjflyboy.tjpeditor.project.Rate#getRate()
   * @see #getRate()
   * @generated
   */
  EAttribute getRate_Rate();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.ReferenceExtend <em>Reference Extend</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference Extend</em>'.
   * @see org.jjflyboy.tjpeditor.project.ReferenceExtend
   * @generated
   */
  EClass getReferenceExtend();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Remaining <em>Remaining</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Remaining</em>'.
   * @see org.jjflyboy.tjpeditor.project.Remaining
   * @generated
   */
  EClass getRemaining();

  /**
   * Returns the meta object for the containment reference '{@link org.jjflyboy.tjpeditor.project.Remaining#getRemaining <em>Remaining</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Remaining</em>'.
   * @see org.jjflyboy.tjpeditor.project.Remaining#getRemaining()
   * @see #getRemaining()
   * @generated
   */
  EReference getRemaining_Remaining();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.ReportPrefix <em>Report Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Report Prefix</em>'.
   * @see org.jjflyboy.tjpeditor.project.ReportPrefix
   * @generated
   */
  EClass getReportPrefix();

  /**
   * Returns the meta object for the reference '{@link org.jjflyboy.tjpeditor.project.ReportPrefix#getReport <em>Report</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Report</em>'.
   * @see org.jjflyboy.tjpeditor.project.ReportPrefix#getReport()
   * @see #getReportPrefix()
   * @generated
   */
  EReference getReportPrefix_Report();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.ResourceAttributes <em>Resource Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resource Attributes</em>'.
   * @see org.jjflyboy.tjpeditor.project.ResourceAttributes
   * @generated
   */
  EClass getResourceAttributes();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.ResourceAttributes#isAll <em>All</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>All</em>'.
   * @see org.jjflyboy.tjpeditor.project.ResourceAttributes#isAll()
   * @see #getResourceAttributes()
   * @generated
   */
  EAttribute getResourceAttributes_All();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.ResourceAttributes#isNone <em>None</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>None</em>'.
   * @see org.jjflyboy.tjpeditor.project.ResourceAttributes#isNone()
   * @see #getResourceAttributes()
   * @generated
   */
  EAttribute getResourceAttributes_None();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.ResourceAttributes#isVacation <em>Vacation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Vacation</em>'.
   * @see org.jjflyboy.tjpeditor.project.ResourceAttributes#isVacation()
   * @see #getResourceAttributes()
   * @generated
   */
  EAttribute getResourceAttributes_Vacation();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.ResourceAttributes#isBooking <em>Booking</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Booking</em>'.
   * @see org.jjflyboy.tjpeditor.project.ResourceAttributes#isBooking()
   * @see #getResourceAttributes()
   * @generated
   */
  EAttribute getResourceAttributes_Booking();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.ResourceAttributes#isWorkingHours <em>Working Hours</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Working Hours</em>'.
   * @see org.jjflyboy.tjpeditor.project.ResourceAttributes#isWorkingHours()
   * @see #getResourceAttributes()
   * @generated
   */
  EAttribute getResourceAttributes_WorkingHours();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.ResourcePrefix <em>Resource Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resource Prefix</em>'.
   * @see org.jjflyboy.tjpeditor.project.ResourcePrefix
   * @generated
   */
  EClass getResourcePrefix();

  /**
   * Returns the meta object for the reference '{@link org.jjflyboy.tjpeditor.project.ResourcePrefix#getResource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Resource</em>'.
   * @see org.jjflyboy.tjpeditor.project.ResourcePrefix#getResource()
   * @see #getResourcePrefix()
   * @generated
   */
  EReference getResourcePrefix_Resource();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.ResourceReport <em>Resource Report</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resource Report</em>'.
   * @see org.jjflyboy.tjpeditor.project.ResourceReport
   * @generated
   */
  EClass getResourceReport();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.ResourceRoot <em>Resource Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resource Root</em>'.
   * @see org.jjflyboy.tjpeditor.project.ResourceRoot
   * @generated
   */
  EClass getResourceRoot();

  /**
   * Returns the meta object for the reference '{@link org.jjflyboy.tjpeditor.project.ResourceRoot#getResource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Resource</em>'.
   * @see org.jjflyboy.tjpeditor.project.ResourceRoot#getResource()
   * @see #getResourceRoot()
   * @generated
   */
  EReference getResourceRoot_Resource();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Responsible <em>Responsible</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Responsible</em>'.
   * @see org.jjflyboy.tjpeditor.project.Responsible
   * @generated
   */
  EClass getResponsible();

  /**
   * Returns the meta object for the reference list '{@link org.jjflyboy.tjpeditor.project.Responsible#getResources <em>Resources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Resources</em>'.
   * @see org.jjflyboy.tjpeditor.project.Responsible#getResources()
   * @see #getResponsible()
   * @generated
   */
  EReference getResponsible_Resources();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.RichTextExtend <em>Rich Text Extend</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rich Text Extend</em>'.
   * @see org.jjflyboy.tjpeditor.project.RichTextExtend
   * @generated
   */
  EClass getRichTextExtend();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Right <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Right</em>'.
   * @see org.jjflyboy.tjpeditor.project.Right
   * @generated
   */
  EClass getRight();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.RollupResource <em>Rollup Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rollup Resource</em>'.
   * @see org.jjflyboy.tjpeditor.project.RollupResource
   * @generated
   */
  EClass getRollupResource();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.RollupResource#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expression</em>'.
   * @see org.jjflyboy.tjpeditor.project.RollupResource#getExpression()
   * @see #getRollupResource()
   * @generated
   */
  EAttribute getRollupResource_Expression();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.RollupTask <em>Rollup Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rollup Task</em>'.
   * @see org.jjflyboy.tjpeditor.project.RollupTask
   * @generated
   */
  EClass getRollupTask();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.RollupTask#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expression</em>'.
   * @see org.jjflyboy.tjpeditor.project.RollupTask#getExpression()
   * @see #getRollupTask()
   * @generated
   */
  EAttribute getRollupTask_Expression();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Scale <em>Scale</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scale</em>'.
   * @see org.jjflyboy.tjpeditor.project.Scale
   * @generated
   */
  EClass getScale();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Scale#getScale <em>Scale</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Scale</em>'.
   * @see org.jjflyboy.tjpeditor.project.Scale#getScale()
   * @see #getScale()
   * @generated
   */
  EAttribute getScale_Scale();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Scenario <em>Scenario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scenario</em>'.
   * @see org.jjflyboy.tjpeditor.project.Scenario
   * @generated
   */
  EClass getScenario();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Scenario#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.jjflyboy.tjpeditor.project.Scenario#getId()
   * @see #getScenario()
   * @generated
   */
  EAttribute getScenario_Id();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Scenario#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.jjflyboy.tjpeditor.project.Scenario#getName()
   * @see #getScenario()
   * @generated
   */
  EAttribute getScenario_Name();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Scenario#getActive <em>Active</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Active</em>'.
   * @see org.jjflyboy.tjpeditor.project.Scenario#getActive()
   * @see #getScenario()
   * @generated
   */
  EAttribute getScenario_Active();

  /**
   * Returns the meta object for the containment reference '{@link org.jjflyboy.tjpeditor.project.Scenario#getScenario <em>Scenario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Scenario</em>'.
   * @see org.jjflyboy.tjpeditor.project.Scenario#getScenario()
   * @see #getScenario()
   * @generated
   */
  EReference getScenario_Scenario();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Scenarios <em>Scenarios</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scenarios</em>'.
   * @see org.jjflyboy.tjpeditor.project.Scenarios
   * @generated
   */
  EClass getScenarios();

  /**
   * Returns the meta object for the reference list '{@link org.jjflyboy.tjpeditor.project.Scenarios#getScenarios <em>Scenarios</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Scenarios</em>'.
   * @see org.jjflyboy.tjpeditor.project.Scenarios#getScenarios()
   * @see #getScenarios()
   * @generated
   */
  EReference getScenarios_Scenarios();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Scheduled <em>Scheduled</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scheduled</em>'.
   * @see org.jjflyboy.tjpeditor.project.Scheduled
   * @generated
   */
  EClass getScheduled();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Scheduled#isScheduled <em>Scheduled</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Scheduled</em>'.
   * @see org.jjflyboy.tjpeditor.project.Scheduled#isScheduled()
   * @see #getScheduled()
   * @generated
   */
  EAttribute getScheduled_Scheduled();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Scheduling <em>Scheduling</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scheduling</em>'.
   * @see org.jjflyboy.tjpeditor.project.Scheduling
   * @generated
   */
  EClass getScheduling();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Scheduling#getScheduling <em>Scheduling</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Scheduling</em>'.
   * @see org.jjflyboy.tjpeditor.project.Scheduling#getScheduling()
   * @see #getScheduling()
   * @generated
   */
  EAttribute getScheduling_Scheduling();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Select <em>Select</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select</em>'.
   * @see org.jjflyboy.tjpeditor.project.Select
   * @generated
   */
  EClass getSelect();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Select#getArgument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Argument</em>'.
   * @see org.jjflyboy.tjpeditor.project.Select#getArgument()
   * @see #getSelect()
   * @generated
   */
  EAttribute getSelect_Argument();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.SelfContained <em>Self Contained</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Self Contained</em>'.
   * @see org.jjflyboy.tjpeditor.project.SelfContained
   * @generated
   */
  EClass getSelfContained();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.SelfContained#getSelfcontained <em>Selfcontained</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Selfcontained</em>'.
   * @see org.jjflyboy.tjpeditor.project.SelfContained#getSelfcontained()
   * @see #getSelfContained()
   * @generated
   */
  EAttribute getSelfContained_Selfcontained();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Shift <em>Shift</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Shift</em>'.
   * @see org.jjflyboy.tjpeditor.project.Shift
   * @generated
   */
  EClass getShift();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Shift#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.jjflyboy.tjpeditor.project.Shift#getId()
   * @see #getShift()
   * @generated
   */
  EAttribute getShift_Id();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Shift#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.jjflyboy.tjpeditor.project.Shift#getName()
   * @see #getShift()
   * @generated
   */
  EAttribute getShift_Name();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Shift#getReplace <em>Replace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Replace</em>'.
   * @see org.jjflyboy.tjpeditor.project.Shift#getReplace()
   * @see #getShift()
   * @generated
   */
  EAttribute getShift_Replace();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Shift#getTimezone <em>Timezone</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Timezone</em>'.
   * @see org.jjflyboy.tjpeditor.project.Shift#getTimezone()
   * @see #getShift()
   * @generated
   */
  EAttribute getShift_Timezone();

  /**
   * Returns the meta object for the containment reference '{@link org.jjflyboy.tjpeditor.project.Shift#getVacation <em>Vacation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Vacation</em>'.
   * @see org.jjflyboy.tjpeditor.project.Shift#getVacation()
   * @see #getShift()
   * @generated
   */
  EReference getShift_Vacation();

  /**
   * Returns the meta object for the containment reference '{@link org.jjflyboy.tjpeditor.project.Shift#getShift <em>Shift</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Shift</em>'.
   * @see org.jjflyboy.tjpeditor.project.Shift#getShift()
   * @see #getShift()
   * @generated
   */
  EReference getShift_Shift();

  /**
   * Returns the meta object for the containment reference '{@link org.jjflyboy.tjpeditor.project.Shift#getWorkingHours <em>Working Hours</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Working Hours</em>'.
   * @see org.jjflyboy.tjpeditor.project.Shift#getWorkingHours()
   * @see #getShift()
   * @generated
   */
  EReference getShift_WorkingHours();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.ShiftTimesheet <em>Shift Timesheet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Shift Timesheet</em>'.
   * @see org.jjflyboy.tjpeditor.project.ShiftTimesheet
   * @generated
   */
  EClass getShiftTimesheet();

  /**
   * Returns the meta object for the reference '{@link org.jjflyboy.tjpeditor.project.ShiftTimesheet#getShift <em>Shift</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Shift</em>'.
   * @see org.jjflyboy.tjpeditor.project.ShiftTimesheet#getShift()
   * @see #getShiftTimesheet()
   * @generated
   */
  EReference getShiftTimesheet_Shift();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Shifts <em>Shifts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Shifts</em>'.
   * @see org.jjflyboy.tjpeditor.project.Shifts
   * @generated
   */
  EClass getShifts();

  /**
   * Returns the meta object for the containment reference list '{@link org.jjflyboy.tjpeditor.project.Shifts#getLimits <em>Limits</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Limits</em>'.
   * @see org.jjflyboy.tjpeditor.project.Shifts#getLimits()
   * @see #getShifts()
   * @generated
   */
  EReference getShifts_Limits();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.ShortTimeFormat <em>Short Time Format</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Short Time Format</em>'.
   * @see org.jjflyboy.tjpeditor.project.ShortTimeFormat
   * @generated
   */
  EClass getShortTimeFormat();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.ShortTimeFormat#getShortTimeFormat <em>Short Time Format</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Short Time Format</em>'.
   * @see org.jjflyboy.tjpeditor.project.ShortTimeFormat#getShortTimeFormat()
   * @see #getShortTimeFormat()
   * @generated
   */
  EAttribute getShortTimeFormat_ShortTimeFormat();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.SortJournalEntries <em>Sort Journal Entries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sort Journal Entries</em>'.
   * @see org.jjflyboy.tjpeditor.project.SortJournalEntries
   * @generated
   */
  EClass getSortJournalEntries();

  /**
   * Returns the meta object for the attribute list '{@link org.jjflyboy.tjpeditor.project.SortJournalEntries#getCriteria <em>Criteria</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Criteria</em>'.
   * @see org.jjflyboy.tjpeditor.project.SortJournalEntries#getCriteria()
   * @see #getSortJournalEntries()
   * @generated
   */
  EAttribute getSortJournalEntries_Criteria();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.SortResources <em>Sort Resources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sort Resources</em>'.
   * @see org.jjflyboy.tjpeditor.project.SortResources
   * @generated
   */
  EClass getSortResources();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.SortTasks <em>Sort Tasks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sort Tasks</em>'.
   * @see org.jjflyboy.tjpeditor.project.SortTasks
   * @generated
   */
  EClass getSortTasks();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Start <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Start</em>'.
   * @see org.jjflyboy.tjpeditor.project.Start
   * @generated
   */
  EClass getStart();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Start#getStart <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Start</em>'.
   * @see org.jjflyboy.tjpeditor.project.Start#getStart()
   * @see #getStart()
   * @generated
   */
  EAttribute getStart_Start();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.StartCredit <em>Start Credit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Start Credit</em>'.
   * @see org.jjflyboy.tjpeditor.project.StartCredit
   * @generated
   */
  EClass getStartCredit();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.StartCredit#getStartCredit <em>Start Credit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Start Credit</em>'.
   * @see org.jjflyboy.tjpeditor.project.StartCredit#getStartCredit()
   * @see #getStartCredit()
   * @generated
   */
  EAttribute getStartCredit_StartCredit();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.StatusStatusSheet <em>Status Status Sheet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Status Status Sheet</em>'.
   * @see org.jjflyboy.tjpeditor.project.StatusStatusSheet
   * @generated
   */
  EClass getStatusStatusSheet();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.StatusStatusSheet#getLevel <em>Level</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Level</em>'.
   * @see org.jjflyboy.tjpeditor.project.StatusStatusSheet#getLevel()
   * @see #getStatusStatusSheet()
   * @generated
   */
  EAttribute getStatusStatusSheet_Level();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.StatusStatusSheet#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see org.jjflyboy.tjpeditor.project.StatusStatusSheet#getText()
   * @see #getStatusStatusSheet()
   * @generated
   */
  EAttribute getStatusStatusSheet_Text();

  /**
   * Returns the meta object for the containment reference list '{@link org.jjflyboy.tjpeditor.project.StatusStatusSheet#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.jjflyboy.tjpeditor.project.StatusStatusSheet#getAttributes()
   * @see #getStatusStatusSheet()
   * @generated
   */
  EReference getStatusStatusSheet_Attributes();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.StatusStatusSheetAttribute <em>Status Status Sheet Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Status Status Sheet Attribute</em>'.
   * @see org.jjflyboy.tjpeditor.project.StatusStatusSheetAttribute
   * @generated
   */
  EClass getStatusStatusSheetAttribute();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Summary <em>Summary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Summary</em>'.
   * @see org.jjflyboy.tjpeditor.project.Summary
   * @generated
   */
  EClass getSummary();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.TagFile <em>Tag File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tag File</em>'.
   * @see org.jjflyboy.tjpeditor.project.TagFile
   * @generated
   */
  EClass getTagFile();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.TagFile#getFile <em>File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>File</em>'.
   * @see org.jjflyboy.tjpeditor.project.TagFile#getFile()
   * @see #getTagFile()
   * @generated
   */
  EAttribute getTagFile_File();

  /**
   * Returns the meta object for the containment reference '{@link org.jjflyboy.tjpeditor.project.TagFile#getHideResource <em>Hide Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Hide Resource</em>'.
   * @see org.jjflyboy.tjpeditor.project.TagFile#getHideResource()
   * @see #getTagFile()
   * @generated
   */
  EReference getTagFile_HideResource();

  /**
   * Returns the meta object for the containment reference '{@link org.jjflyboy.tjpeditor.project.TagFile#getHideTask <em>Hide Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Hide Task</em>'.
   * @see org.jjflyboy.tjpeditor.project.TagFile#getHideTask()
   * @see #getTagFile()
   * @generated
   */
  EReference getTagFile_HideTask();

  /**
   * Returns the meta object for the containment reference '{@link org.jjflyboy.tjpeditor.project.TagFile#getRollupResource <em>Rollup Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rollup Resource</em>'.
   * @see org.jjflyboy.tjpeditor.project.TagFile#getRollupResource()
   * @see #getTagFile()
   * @generated
   */
  EReference getTagFile_RollupResource();

  /**
   * Returns the meta object for the containment reference '{@link org.jjflyboy.tjpeditor.project.TagFile#getRollupTask <em>Rollup Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rollup Task</em>'.
   * @see org.jjflyboy.tjpeditor.project.TagFile#getRollupTask()
   * @see #getTagFile()
   * @generated
   */
  EReference getTagFile_RollupTask();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.TaskStatusSheet <em>Task Status Sheet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task Status Sheet</em>'.
   * @see org.jjflyboy.tjpeditor.project.TaskStatusSheet
   * @generated
   */
  EClass getTaskStatusSheet();

  /**
   * Returns the meta object for the reference '{@link org.jjflyboy.tjpeditor.project.TaskStatusSheet#getTask <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Task</em>'.
   * @see org.jjflyboy.tjpeditor.project.TaskStatusSheet#getTask()
   * @see #getTaskStatusSheet()
   * @generated
   */
  EReference getTaskStatusSheet_Task();

  /**
   * Returns the meta object for the containment reference list '{@link org.jjflyboy.tjpeditor.project.TaskStatusSheet#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.jjflyboy.tjpeditor.project.TaskStatusSheet#getAttributes()
   * @see #getTaskStatusSheet()
   * @generated
   */
  EReference getTaskStatusSheet_Attributes();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.TaskStatusSheetAttribute <em>Task Status Sheet Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task Status Sheet Attribute</em>'.
   * @see org.jjflyboy.tjpeditor.project.TaskStatusSheetAttribute
   * @generated
   */
  EClass getTaskStatusSheetAttribute();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.TaskTimesheet <em>Task Timesheet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task Timesheet</em>'.
   * @see org.jjflyboy.tjpeditor.project.TaskTimesheet
   * @generated
   */
  EClass getTaskTimesheet();

  /**
   * Returns the meta object for the reference '{@link org.jjflyboy.tjpeditor.project.TaskTimesheet#getTask <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Task</em>'.
   * @see org.jjflyboy.tjpeditor.project.TaskTimesheet#getTask()
   * @see #getTaskTimesheet()
   * @generated
   */
  EReference getTaskTimesheet_Task();

  /**
   * Returns the meta object for the containment reference list '{@link org.jjflyboy.tjpeditor.project.TaskTimesheet#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.jjflyboy.tjpeditor.project.TaskTimesheet#getAttributes()
   * @see #getTaskTimesheet()
   * @generated
   */
  EReference getTaskTimesheet_Attributes();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.TaskAttributes <em>Task Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task Attributes</em>'.
   * @see org.jjflyboy.tjpeditor.project.TaskAttributes
   * @generated
   */
  EClass getTaskAttributes();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.TaskAttributes#isAll <em>All</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>All</em>'.
   * @see org.jjflyboy.tjpeditor.project.TaskAttributes#isAll()
   * @see #getTaskAttributes()
   * @generated
   */
  EAttribute getTaskAttributes_All();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.TaskAttributes#isNone <em>None</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>None</em>'.
   * @see org.jjflyboy.tjpeditor.project.TaskAttributes#isNone()
   * @see #getTaskAttributes()
   * @generated
   */
  EAttribute getTaskAttributes_None();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.TaskAttributes#isResponsible <em>Responsible</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Responsible</em>'.
   * @see org.jjflyboy.tjpeditor.project.TaskAttributes#isResponsible()
   * @see #getTaskAttributes()
   * @generated
   */
  EAttribute getTaskAttributes_Responsible();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.TaskAttributes#isFlags <em>Flags</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Flags</em>'.
   * @see org.jjflyboy.tjpeditor.project.TaskAttributes#isFlags()
   * @see #getTaskAttributes()
   * @generated
   */
  EAttribute getTaskAttributes_Flags();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.TaskAttributes#isMaxstart <em>Maxstart</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Maxstart</em>'.
   * @see org.jjflyboy.tjpeditor.project.TaskAttributes#isMaxstart()
   * @see #getTaskAttributes()
   * @generated
   */
  EAttribute getTaskAttributes_Maxstart();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.TaskAttributes#isMaxend <em>Maxend</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Maxend</em>'.
   * @see org.jjflyboy.tjpeditor.project.TaskAttributes#isMaxend()
   * @see #getTaskAttributes()
   * @generated
   */
  EAttribute getTaskAttributes_Maxend();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.TaskAttributes#isPriority <em>Priority</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Priority</em>'.
   * @see org.jjflyboy.tjpeditor.project.TaskAttributes#isPriority()
   * @see #getTaskAttributes()
   * @generated
   */
  EAttribute getTaskAttributes_Priority();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.TaskAttributes#isBooking <em>Booking</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Booking</em>'.
   * @see org.jjflyboy.tjpeditor.project.TaskAttributes#isBooking()
   * @see #getTaskAttributes()
   * @generated
   */
  EAttribute getTaskAttributes_Booking();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.TaskAttributes#isNote <em>Note</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Note</em>'.
   * @see org.jjflyboy.tjpeditor.project.TaskAttributes#isNote()
   * @see #getTaskAttributes()
   * @generated
   */
  EAttribute getTaskAttributes_Note();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.TaskAttributes#isMinstart <em>Minstart</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Minstart</em>'.
   * @see org.jjflyboy.tjpeditor.project.TaskAttributes#isMinstart()
   * @see #getTaskAttributes()
   * @generated
   */
  EAttribute getTaskAttributes_Minstart();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.TaskAttributes#isMinend <em>Minend</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Minend</em>'.
   * @see org.jjflyboy.tjpeditor.project.TaskAttributes#isMinend()
   * @see #getTaskAttributes()
   * @generated
   */
  EAttribute getTaskAttributes_Minend();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.TaskAttributes#isComplete <em>Complete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Complete</em>'.
   * @see org.jjflyboy.tjpeditor.project.TaskAttributes#isComplete()
   * @see #getTaskAttributes()
   * @generated
   */
  EAttribute getTaskAttributes_Complete();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.TaskAttributes#isDepends <em>Depends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Depends</em>'.
   * @see org.jjflyboy.tjpeditor.project.TaskAttributes#isDepends()
   * @see #getTaskAttributes()
   * @generated
   */
  EAttribute getTaskAttributes_Depends();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.TaskPrefix <em>Task Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task Prefix</em>'.
   * @see org.jjflyboy.tjpeditor.project.TaskPrefix
   * @generated
   */
  EClass getTaskPrefix();

  /**
   * Returns the meta object for the reference '{@link org.jjflyboy.tjpeditor.project.TaskPrefix#getTask <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Task</em>'.
   * @see org.jjflyboy.tjpeditor.project.TaskPrefix#getTask()
   * @see #getTaskPrefix()
   * @generated
   */
  EReference getTaskPrefix_Task();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.TaskReport <em>Task Report</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task Report</em>'.
   * @see org.jjflyboy.tjpeditor.project.TaskReport
   * @generated
   */
  EClass getTaskReport();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.TaskRoot <em>Task Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task Root</em>'.
   * @see org.jjflyboy.tjpeditor.project.TaskRoot
   * @generated
   */
  EClass getTaskRoot();

  /**
   * Returns the meta object for the reference '{@link org.jjflyboy.tjpeditor.project.TaskRoot#getTask <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Task</em>'.
   * @see org.jjflyboy.tjpeditor.project.TaskRoot#getTask()
   * @see #getTaskRoot()
   * @generated
   */
  EReference getTaskRoot_Task();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.TextExtend <em>Text Extend</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text Extend</em>'.
   * @see org.jjflyboy.tjpeditor.project.TextExtend
   * @generated
   */
  EClass getTextExtend();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.TextReport <em>Text Report</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text Report</em>'.
   * @see org.jjflyboy.tjpeditor.project.TextReport
   * @generated
   */
  EClass getTextReport();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.TimeFormat <em>Time Format</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Time Format</em>'.
   * @see org.jjflyboy.tjpeditor.project.TimeFormat
   * @generated
   */
  EClass getTimeFormat();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.TimeFormat#getTimeformat <em>Timeformat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Timeformat</em>'.
   * @see org.jjflyboy.tjpeditor.project.TimeFormat#getTimeformat()
   * @see #getTimeFormat()
   * @generated
   */
  EAttribute getTimeFormat_Timeformat();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Timeoff <em>Timeoff</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Timeoff</em>'.
   * @see org.jjflyboy.tjpeditor.project.Timeoff
   * @generated
   */
  EClass getTimeoff();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Timeoff#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.jjflyboy.tjpeditor.project.Timeoff#getId()
   * @see #getTimeoff()
   * @generated
   */
  EAttribute getTimeoff_Id();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Timeoff#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.jjflyboy.tjpeditor.project.Timeoff#getName()
   * @see #getTimeoff()
   * @generated
   */
  EAttribute getTimeoff_Name();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Timesheet <em>Timesheet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Timesheet</em>'.
   * @see org.jjflyboy.tjpeditor.project.Timesheet
   * @generated
   */
  EClass getTimesheet();

  /**
   * Returns the meta object for the reference '{@link org.jjflyboy.tjpeditor.project.Timesheet#getResource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Resource</em>'.
   * @see org.jjflyboy.tjpeditor.project.Timesheet#getResource()
   * @see #getTimesheet()
   * @generated
   */
  EReference getTimesheet_Resource();

  /**
   * Returns the meta object for the containment reference '{@link org.jjflyboy.tjpeditor.project.Timesheet#getInterval <em>Interval</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Interval</em>'.
   * @see org.jjflyboy.tjpeditor.project.Timesheet#getInterval()
   * @see #getTimesheet()
   * @generated
   */
  EReference getTimesheet_Interval();

  /**
   * Returns the meta object for the containment reference list '{@link org.jjflyboy.tjpeditor.project.Timesheet#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.jjflyboy.tjpeditor.project.Timesheet#getAttributes()
   * @see #getTimesheet()
   * @generated
   */
  EReference getTimesheet_Attributes();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.TimesheetReport <em>Timesheet Report</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Timesheet Report</em>'.
   * @see org.jjflyboy.tjpeditor.project.TimesheetReport
   * @generated
   */
  EClass getTimesheetReport();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.TimesheetReport#getFilename <em>Filename</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Filename</em>'.
   * @see org.jjflyboy.tjpeditor.project.TimesheetReport#getFilename()
   * @see #getTimesheetReport()
   * @generated
   */
  EAttribute getTimesheetReport_Filename();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.TimesheetReport#getComnent <em>Comnent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comnent</em>'.
   * @see org.jjflyboy.tjpeditor.project.TimesheetReport#getComnent()
   * @see #getTimesheetReport()
   * @generated
   */
  EAttribute getTimesheetReport_Comnent();

  /**
   * Returns the meta object for the containment reference list '{@link org.jjflyboy.tjpeditor.project.TimesheetReport#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.jjflyboy.tjpeditor.project.TimesheetReport#getAttributes()
   * @see #getTimesheetReport()
   * @generated
   */
  EReference getTimesheetReport_Attributes();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Timezone <em>Timezone</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Timezone</em>'.
   * @see org.jjflyboy.tjpeditor.project.Timezone
   * @generated
   */
  EClass getTimezone();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Timezone#getTimezone <em>Timezone</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Timezone</em>'.
   * @see org.jjflyboy.tjpeditor.project.Timezone#getTimezone()
   * @see #getTimezone()
   * @generated
   */
  EAttribute getTimezone_Timezone();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.TimingResolution <em>Timing Resolution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Timing Resolution</em>'.
   * @see org.jjflyboy.tjpeditor.project.TimingResolution
   * @generated
   */
  EClass getTimingResolution();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.TimingResolution#getTimingResolution <em>Timing Resolution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Timing Resolution</em>'.
   * @see org.jjflyboy.tjpeditor.project.TimingResolution#getTimingResolution()
   * @see #getTimingResolution()
   * @generated
   */
  EAttribute getTimingResolution_TimingResolution();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Title <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Title</em>'.
   * @see org.jjflyboy.tjpeditor.project.Title
   * @generated
   */
  EClass getTitle();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Title#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see org.jjflyboy.tjpeditor.project.Title#getTitle()
   * @see #getTitle()
   * @generated
   */
  EAttribute getTitle_Title();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.ToolTip <em>Tool Tip</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tool Tip</em>'.
   * @see org.jjflyboy.tjpeditor.project.ToolTip
   * @generated
   */
  EClass getToolTip();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.ToolTip#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expression</em>'.
   * @see org.jjflyboy.tjpeditor.project.ToolTip#getExpression()
   * @see #getToolTip()
   * @generated
   */
  EAttribute getToolTip_Expression();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.ToolTip#getTip <em>Tip</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tip</em>'.
   * @see org.jjflyboy.tjpeditor.project.ToolTip#getTip()
   * @see #getToolTip()
   * @generated
   */
  EAttribute getToolTip_Tip();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.TrackingScenario <em>Tracking Scenario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tracking Scenario</em>'.
   * @see org.jjflyboy.tjpeditor.project.TrackingScenario
   * @generated
   */
  EClass getTrackingScenario();

  /**
   * Returns the meta object for the reference '{@link org.jjflyboy.tjpeditor.project.TrackingScenario#getScenario <em>Scenario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Scenario</em>'.
   * @see org.jjflyboy.tjpeditor.project.TrackingScenario#getScenario()
   * @see #getTrackingScenario()
   * @generated
   */
  EReference getTrackingScenario_Scenario();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.TreeLevel <em>Tree Level</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tree Level</em>'.
   * @see org.jjflyboy.tjpeditor.project.TreeLevel
   * @generated
   */
  EClass getTreeLevel();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.TreeLevel#getLevel <em>Level</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Level</em>'.
   * @see org.jjflyboy.tjpeditor.project.TreeLevel#getLevel()
   * @see #getTreeLevel()
   * @generated
   */
  EAttribute getTreeLevel_Level();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Vacation <em>Vacation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Vacation</em>'.
   * @see org.jjflyboy.tjpeditor.project.Vacation
   * @generated
   */
  EClass getVacation();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Vacation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.jjflyboy.tjpeditor.project.Vacation#getName()
   * @see #getVacation()
   * @generated
   */
  EAttribute getVacation_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.jjflyboy.tjpeditor.project.Vacation#getIntervals <em>Intervals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Intervals</em>'.
   * @see org.jjflyboy.tjpeditor.project.Vacation#getIntervals()
   * @see #getVacation()
   * @generated
   */
  EReference getVacation_Intervals();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.VacationShift <em>Vacation Shift</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Vacation Shift</em>'.
   * @see org.jjflyboy.tjpeditor.project.VacationShift
   * @generated
   */
  EClass getVacationShift();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.VacationShift#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.jjflyboy.tjpeditor.project.VacationShift#getName()
   * @see #getVacationShift()
   * @generated
   */
  EAttribute getVacationShift_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.jjflyboy.tjpeditor.project.VacationShift#getIntervals <em>Intervals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Intervals</em>'.
   * @see org.jjflyboy.tjpeditor.project.VacationShift#getIntervals()
   * @see #getVacationShift()
   * @generated
   */
  EReference getVacationShift_Intervals();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Warn <em>Warn</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Warn</em>'.
   * @see org.jjflyboy.tjpeditor.project.Warn
   * @generated
   */
  EClass getWarn();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Warn#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expression</em>'.
   * @see org.jjflyboy.tjpeditor.project.Warn#getExpression()
   * @see #getWarn()
   * @generated
   */
  EAttribute getWarn_Expression();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.WeekStarts <em>Week Starts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Week Starts</em>'.
   * @see org.jjflyboy.tjpeditor.project.WeekStarts
   * @generated
   */
  EClass getWeekStarts();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.WeekStarts#isSunday <em>Sunday</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sunday</em>'.
   * @see org.jjflyboy.tjpeditor.project.WeekStarts#isSunday()
   * @see #getWeekStarts()
   * @generated
   */
  EAttribute getWeekStarts_Sunday();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.WeekStarts#isMonday <em>Monday</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Monday</em>'.
   * @see org.jjflyboy.tjpeditor.project.WeekStarts#isMonday()
   * @see #getWeekStarts()
   * @generated
   */
  EAttribute getWeekStarts_Monday();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.WeeklyMax <em>Weekly Max</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Weekly Max</em>'.
   * @see org.jjflyboy.tjpeditor.project.WeeklyMax
   * @generated
   */
  EClass getWeeklyMax();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.WeeklyMin <em>Weekly Min</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Weekly Min</em>'.
   * @see org.jjflyboy.tjpeditor.project.WeeklyMin
   * @generated
   */
  EClass getWeeklyMin();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Width <em>Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Width</em>'.
   * @see org.jjflyboy.tjpeditor.project.Width
   * @generated
   */
  EClass getWidth();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Width#getWidth <em>Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Width</em>'.
   * @see org.jjflyboy.tjpeditor.project.Width#getWidth()
   * @see #getWidth()
   * @generated
   */
  EAttribute getWidth_Width();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Work <em>Work</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Work</em>'.
   * @see org.jjflyboy.tjpeditor.project.Work
   * @generated
   */
  EClass getWork();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Work#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.jjflyboy.tjpeditor.project.Work#getValue()
   * @see #getWork()
   * @generated
   */
  EAttribute getWork_Value();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Work#getUnit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unit</em>'.
   * @see org.jjflyboy.tjpeditor.project.Work#getUnit()
   * @see #getWork()
   * @generated
   */
  EAttribute getWork_Unit();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.WorkingHours <em>Working Hours</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Working Hours</em>'.
   * @see org.jjflyboy.tjpeditor.project.WorkingHours
   * @generated
   */
  EClass getWorkingHours();

  /**
   * Returns the meta object for the containment reference list '{@link org.jjflyboy.tjpeditor.project.WorkingHours#getWeekdays <em>Weekdays</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Weekdays</em>'.
   * @see org.jjflyboy.tjpeditor.project.WorkingHours#getWeekdays()
   * @see #getWorkingHours()
   * @generated
   */
  EReference getWorkingHours_Weekdays();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.WorkingHours#isOff <em>Off</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Off</em>'.
   * @see org.jjflyboy.tjpeditor.project.WorkingHours#isOff()
   * @see #getWorkingHours()
   * @generated
   */
  EAttribute getWorkingHours_Off();

  /**
   * Returns the meta object for the containment reference list '{@link org.jjflyboy.tjpeditor.project.WorkingHours#getHours <em>Hours</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Hours</em>'.
   * @see org.jjflyboy.tjpeditor.project.WorkingHours#getHours()
   * @see #getWorkingHours()
   * @generated
   */
  EReference getWorkingHours_Hours();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.YearlyWorkingDays <em>Yearly Working Days</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Yearly Working Days</em>'.
   * @see org.jjflyboy.tjpeditor.project.YearlyWorkingDays
   * @generated
   */
  EClass getYearlyWorkingDays();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.YearlyWorkingDays#getYearlyWorkingDays <em>Yearly Working Days</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Yearly Working Days</em>'.
   * @see org.jjflyboy.tjpeditor.project.YearlyWorkingDays#getYearlyWorkingDays()
   * @see #getYearlyWorkingDays()
   * @generated
   */
  EAttribute getYearlyWorkingDays_YearlyWorkingDays();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.AccountShare <em>Account Share</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Account Share</em>'.
   * @see org.jjflyboy.tjpeditor.project.AccountShare
   * @generated
   */
  EClass getAccountShare();

  /**
   * Returns the meta object for the reference '{@link org.jjflyboy.tjpeditor.project.AccountShare#getAccount <em>Account</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Account</em>'.
   * @see org.jjflyboy.tjpeditor.project.AccountShare#getAccount()
   * @see #getAccountShare()
   * @generated
   */
  EReference getAccountShare_Account();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.AccountShare#getShare <em>Share</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Share</em>'.
   * @see org.jjflyboy.tjpeditor.project.AccountShare#getShare()
   * @see #getAccountShare()
   * @generated
   */
  EAttribute getAccountShare_Share();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.ColumnAttribute <em>Column Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Column Attribute</em>'.
   * @see org.jjflyboy.tjpeditor.project.ColumnAttribute
   * @generated
   */
  EClass getColumnAttribute();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Column <em>Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Column</em>'.
   * @see org.jjflyboy.tjpeditor.project.Column
   * @generated
   */
  EClass getColumn();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Column#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.jjflyboy.tjpeditor.project.Column#getId()
   * @see #getColumn()
   * @generated
   */
  EAttribute getColumn_Id();

  /**
   * Returns the meta object for the containment reference '{@link org.jjflyboy.tjpeditor.project.Column#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attribute</em>'.
   * @see org.jjflyboy.tjpeditor.project.Column#getAttribute()
   * @see #getColumn()
   * @generated
   */
  EReference getColumn_Attribute();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Criterion <em>Criterion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Criterion</em>'.
   * @see org.jjflyboy.tjpeditor.project.Criterion
   * @generated
   */
  EClass getCriterion();

  /**
   * Returns the meta object for the reference '{@link org.jjflyboy.tjpeditor.project.Criterion#getScenario <em>Scenario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Scenario</em>'.
   * @see org.jjflyboy.tjpeditor.project.Criterion#getScenario()
   * @see #getCriterion()
   * @generated
   */
  EReference getCriterion_Scenario();

  /**
   * Returns the meta object for the containment reference '{@link org.jjflyboy.tjpeditor.project.Criterion#getCriterionId <em>Criterion Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Criterion Id</em>'.
   * @see org.jjflyboy.tjpeditor.project.Criterion#getCriterionId()
   * @see #getCriterion()
   * @generated
   */
  EReference getCriterion_CriterionId();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.CriterionId <em>Criterion Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Criterion Id</em>'.
   * @see org.jjflyboy.tjpeditor.project.CriterionId
   * @generated
   */
  EClass getCriterionId();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.CriterionId#getColumnId <em>Column Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Column Id</em>'.
   * @see org.jjflyboy.tjpeditor.project.CriterionId#getColumnId()
   * @see #getCriterionId()
   * @generated
   */
  EAttribute getCriterionId_ColumnId();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.CriterionId#getDirection <em>Direction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Direction</em>'.
   * @see org.jjflyboy.tjpeditor.project.CriterionId#getDirection()
   * @see #getCriterionId()
   * @generated
   */
  EAttribute getCriterionId_Direction();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.DurationQuantity <em>Duration Quantity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Duration Quantity</em>'.
   * @see org.jjflyboy.tjpeditor.project.DurationQuantity
   * @generated
   */
  EClass getDurationQuantity();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.DurationQuantity#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.jjflyboy.tjpeditor.project.DurationQuantity#getValue()
   * @see #getDurationQuantity()
   * @generated
   */
  EAttribute getDurationQuantity_Value();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.DurationQuantity#getUnit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unit</em>'.
   * @see org.jjflyboy.tjpeditor.project.DurationQuantity#getUnit()
   * @see #getDurationQuantity()
   * @generated
   */
  EAttribute getDurationQuantity_Unit();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.ExtendAttribute <em>Extend Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Extend Attribute</em>'.
   * @see org.jjflyboy.tjpeditor.project.ExtendAttribute
   * @generated
   */
  EClass getExtendAttribute();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.ExtendAttribute#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.jjflyboy.tjpeditor.project.ExtendAttribute#getId()
   * @see #getExtendAttribute()
   * @generated
   */
  EAttribute getExtendAttribute_Id();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.ExtendAttribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.jjflyboy.tjpeditor.project.ExtendAttribute#getName()
   * @see #getExtendAttribute()
   * @generated
   */
  EAttribute getExtendAttribute_Name();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.ExtendAttribute#isInherit <em>Inherit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Inherit</em>'.
   * @see org.jjflyboy.tjpeditor.project.ExtendAttribute#isInherit()
   * @see #getExtendAttribute()
   * @generated
   */
  EAttribute getExtendAttribute_Inherit();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.ExtendAttribute#isScenariospecific <em>Scenariospecific</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Scenariospecific</em>'.
   * @see org.jjflyboy.tjpeditor.project.ExtendAttribute#isScenariospecific()
   * @see #getExtendAttribute()
   * @generated
   */
  EAttribute getExtendAttribute_Scenariospecific();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.RealFormat <em>Real Format</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Real Format</em>'.
   * @see org.jjflyboy.tjpeditor.project.RealFormat
   * @generated
   */
  EClass getRealFormat();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.RealFormat#getNegativePrefix <em>Negative Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Negative Prefix</em>'.
   * @see org.jjflyboy.tjpeditor.project.RealFormat#getNegativePrefix()
   * @see #getRealFormat()
   * @generated
   */
  EAttribute getRealFormat_NegativePrefix();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.RealFormat#getNegativeSuffix <em>Negative Suffix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Negative Suffix</em>'.
   * @see org.jjflyboy.tjpeditor.project.RealFormat#getNegativeSuffix()
   * @see #getRealFormat()
   * @generated
   */
  EAttribute getRealFormat_NegativeSuffix();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.RealFormat#getThousandsSeparator <em>Thousands Separator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Thousands Separator</em>'.
   * @see org.jjflyboy.tjpeditor.project.RealFormat#getThousandsSeparator()
   * @see #getRealFormat()
   * @generated
   */
  EAttribute getRealFormat_ThousandsSeparator();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.RealFormat#getFractionSeparator <em>Fraction Separator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fraction Separator</em>'.
   * @see org.jjflyboy.tjpeditor.project.RealFormat#getFractionSeparator()
   * @see #getRealFormat()
   * @generated
   */
  EAttribute getRealFormat_FractionSeparator();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.RealFormat#getFractionDigits <em>Fraction Digits</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fraction Digits</em>'.
   * @see org.jjflyboy.tjpeditor.project.RealFormat#getFractionDigits()
   * @see #getRealFormat()
   * @generated
   */
  EAttribute getRealFormat_FractionDigits();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.ShiftLimit <em>Shift Limit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Shift Limit</em>'.
   * @see org.jjflyboy.tjpeditor.project.ShiftLimit
   * @generated
   */
  EClass getShiftLimit();

  /**
   * Returns the meta object for the reference '{@link org.jjflyboy.tjpeditor.project.ShiftLimit#getShift <em>Shift</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Shift</em>'.
   * @see org.jjflyboy.tjpeditor.project.ShiftLimit#getShift()
   * @see #getShiftLimit()
   * @generated
   */
  EReference getShiftLimit_Shift();

  /**
   * Returns the meta object for the containment reference list '{@link org.jjflyboy.tjpeditor.project.ShiftLimit#getIntervals <em>Intervals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Intervals</em>'.
   * @see org.jjflyboy.tjpeditor.project.ShiftLimit#getIntervals()
   * @see #getShiftLimit()
   * @generated
   */
  EReference getShiftLimit_Intervals();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Sort <em>Sort</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sort</em>'.
   * @see org.jjflyboy.tjpeditor.project.Sort
   * @generated
   */
  EClass getSort();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Sort#isId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.jjflyboy.tjpeditor.project.Sort#isId()
   * @see #getSort()
   * @generated
   */
  EAttribute getSort_Id();

  /**
   * Returns the meta object for the containment reference list '{@link org.jjflyboy.tjpeditor.project.Sort#getCriteria <em>Criteria</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Criteria</em>'.
   * @see org.jjflyboy.tjpeditor.project.Sort#getCriteria()
   * @see #getSort()
   * @generated
   */
  EReference getSort_Criteria();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.TaskDependency <em>Task Dependency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task Dependency</em>'.
   * @see org.jjflyboy.tjpeditor.project.TaskDependency
   * @generated
   */
  EClass getTaskDependency();

  /**
   * Returns the meta object for the reference '{@link org.jjflyboy.tjpeditor.project.TaskDependency#getTask <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Task</em>'.
   * @see org.jjflyboy.tjpeditor.project.TaskDependency#getTask()
   * @see #getTaskDependency()
   * @generated
   */
  EReference getTaskDependency_Task();

  /**
   * Returns the meta object for the containment reference '{@link org.jjflyboy.tjpeditor.project.TaskDependency#getGapDuration <em>Gap Duration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Gap Duration</em>'.
   * @see org.jjflyboy.tjpeditor.project.TaskDependency#getGapDuration()
   * @see #getTaskDependency()
   * @generated
   */
  EReference getTaskDependency_GapDuration();

  /**
   * Returns the meta object for the containment reference '{@link org.jjflyboy.tjpeditor.project.TaskDependency#getGapLength <em>Gap Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Gap Length</em>'.
   * @see org.jjflyboy.tjpeditor.project.TaskDependency#getGapLength()
   * @see #getTaskDependency()
   * @generated
   */
  EReference getTaskDependency_GapLength();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.TaskDependency#getPolicy <em>Policy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Policy</em>'.
   * @see org.jjflyboy.tjpeditor.project.TaskDependency#getPolicy()
   * @see #getTaskDependency()
   * @generated
   */
  EAttribute getTaskDependency_Policy();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.TaskTimesheetAttribute <em>Task Timesheet Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task Timesheet Attribute</em>'.
   * @see org.jjflyboy.tjpeditor.project.TaskTimesheetAttribute
   * @generated
   */
  EClass getTaskTimesheetAttribute();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.TimesheetAttribute <em>Timesheet Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Timesheet Attribute</em>'.
   * @see org.jjflyboy.tjpeditor.project.TimesheetAttribute
   * @generated
   */
  EClass getTimesheetAttribute();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.TimesheetReportAttribute <em>Timesheet Report Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Timesheet Report Attribute</em>'.
   * @see org.jjflyboy.tjpeditor.project.TimesheetReportAttribute
   * @generated
   */
  EClass getTimesheetReportAttribute();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.RichText <em>Rich Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rich Text</em>'.
   * @see org.jjflyboy.tjpeditor.project.RichText
   * @generated
   */
  EClass getRichText();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.RichText#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see org.jjflyboy.tjpeditor.project.RichText#getText()
   * @see #getRichText()
   * @generated
   */
  EAttribute getRichText_Text();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.WorkHours <em>Work Hours</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Work Hours</em>'.
   * @see org.jjflyboy.tjpeditor.project.WorkHours
   * @generated
   */
  EClass getWorkHours();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.WorkHours#getStart <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Start</em>'.
   * @see org.jjflyboy.tjpeditor.project.WorkHours#getStart()
   * @see #getWorkHours()
   * @generated
   */
  EAttribute getWorkHours_Start();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.WorkHours#getStop <em>Stop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Stop</em>'.
   * @see org.jjflyboy.tjpeditor.project.WorkHours#getStop()
   * @see #getWorkHours()
   * @generated
   */
  EAttribute getWorkHours_Stop();

  /**
   * Returns the meta object for class '{@link org.jjflyboy.tjpeditor.project.Weekdays <em>Weekdays</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Weekdays</em>'.
   * @see org.jjflyboy.tjpeditor.project.Weekdays
   * @generated
   */
  EClass getWeekdays();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Weekdays#getFirst <em>First</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>First</em>'.
   * @see org.jjflyboy.tjpeditor.project.Weekdays#getFirst()
   * @see #getWeekdays()
   * @generated
   */
  EAttribute getWeekdays_First();

  /**
   * Returns the meta object for the attribute '{@link org.jjflyboy.tjpeditor.project.Weekdays#getLast <em>Last</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Last</em>'.
   * @see org.jjflyboy.tjpeditor.project.Weekdays#getLast()
   * @see #getWeekdays()
   * @generated
   */
  EAttribute getWeekdays_Last();

  /**
   * Returns the meta object for enum '{@link org.jjflyboy.tjpeditor.project.ChargeApplies <em>Charge Applies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Charge Applies</em>'.
   * @see org.jjflyboy.tjpeditor.project.ChargeApplies
   * @generated
   */
  EEnum getChargeApplies();

  /**
   * Returns the meta object for enum '{@link org.jjflyboy.tjpeditor.project.Justification <em>Justification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Justification</em>'.
   * @see org.jjflyboy.tjpeditor.project.Justification
   * @generated
   */
  EEnum getJustification();

  /**
   * Returns the meta object for enum '{@link org.jjflyboy.tjpeditor.project.JournalModeValue <em>Journal Mode Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Journal Mode Value</em>'.
   * @see org.jjflyboy.tjpeditor.project.JournalModeValue
   * @generated
   */
  EEnum getJournalModeValue();

  /**
   * Returns the meta object for enum '{@link org.jjflyboy.tjpeditor.project.JournalEntrySortCriterion <em>Journal Entry Sort Criterion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Journal Entry Sort Criterion</em>'.
   * @see org.jjflyboy.tjpeditor.project.JournalEntrySortCriterion
   * @generated
   */
  EEnum getJournalEntrySortCriterion();

  /**
   * Returns the meta object for enum '{@link org.jjflyboy.tjpeditor.project.ListTypeValues <em>List Type Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>List Type Values</em>'.
   * @see org.jjflyboy.tjpeditor.project.ListTypeValues
   * @generated
   */
  EEnum getListTypeValues();

  /**
   * Returns the meta object for enum '{@link org.jjflyboy.tjpeditor.project.CriterionDirection <em>Criterion Direction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Criterion Direction</em>'.
   * @see org.jjflyboy.tjpeditor.project.CriterionDirection
   * @generated
   */
  EEnum getCriterionDirection();

  /**
   * Returns the meta object for enum '{@link org.jjflyboy.tjpeditor.project.YesNo <em>Yes No</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Yes No</em>'.
   * @see org.jjflyboy.tjpeditor.project.YesNo
   * @generated
   */
  EEnum getYesNo();

  /**
   * Returns the meta object for enum '{@link org.jjflyboy.tjpeditor.project.ReportFormat <em>Report Format</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Report Format</em>'.
   * @see org.jjflyboy.tjpeditor.project.ReportFormat
   * @generated
   */
  EEnum getReportFormat();

  /**
   * Returns the meta object for enum '{@link org.jjflyboy.tjpeditor.project.LoadDisplayUnit <em>Load Display Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Load Display Unit</em>'.
   * @see org.jjflyboy.tjpeditor.project.LoadDisplayUnit
   * @generated
   */
  EEnum getLoadDisplayUnit();

  /**
   * Returns the meta object for enum '{@link org.jjflyboy.tjpeditor.project.ScaleResolution <em>Scale Resolution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Scale Resolution</em>'.
   * @see org.jjflyboy.tjpeditor.project.ScaleResolution
   * @generated
   */
  EEnum getScaleResolution();

  /**
   * Returns the meta object for enum '{@link org.jjflyboy.tjpeditor.project.SelectArgument <em>Select Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Select Argument</em>'.
   * @see org.jjflyboy.tjpeditor.project.SelectArgument
   * @generated
   */
  EEnum getSelectArgument();

  /**
   * Returns the meta object for enum '{@link org.jjflyboy.tjpeditor.project.ColumnId <em>Column Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Column Id</em>'.
   * @see org.jjflyboy.tjpeditor.project.ColumnId
   * @generated
   */
  EEnum getColumnId();

  /**
   * Returns the meta object for enum '{@link org.jjflyboy.tjpeditor.project.AlertLevel <em>Alert Level</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Alert Level</em>'.
   * @see org.jjflyboy.tjpeditor.project.AlertLevel
   * @generated
   */
  EEnum getAlertLevel();

  /**
   * Returns the meta object for enum '{@link org.jjflyboy.tjpeditor.project.DependsPolicy <em>Depends Policy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Depends Policy</em>'.
   * @see org.jjflyboy.tjpeditor.project.DependsPolicy
   * @generated
   */
  EEnum getDependsPolicy();

  /**
   * Returns the meta object for enum '{@link org.jjflyboy.tjpeditor.project.SchedulingPolicy <em>Scheduling Policy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Scheduling Policy</em>'.
   * @see org.jjflyboy.tjpeditor.project.SchedulingPolicy
   * @generated
   */
  EEnum getSchedulingPolicy();

  /**
   * Returns the meta object for enum '{@link org.jjflyboy.tjpeditor.project.TimeUnit <em>Time Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Time Unit</em>'.
   * @see org.jjflyboy.tjpeditor.project.TimeUnit
   * @generated
   */
  EEnum getTimeUnit();

  /**
   * Returns the meta object for enum '{@link org.jjflyboy.tjpeditor.project.Weekday <em>Weekday</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Weekday</em>'.
   * @see org.jjflyboy.tjpeditor.project.Weekday
   * @generated
   */
  EEnum getWeekday();

  /**
   * Returns the meta object for enum '{@link org.jjflyboy.tjpeditor.project.WorkQuantityUnit <em>Work Quantity Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Work Quantity Unit</em>'.
   * @see org.jjflyboy.tjpeditor.project.WorkQuantityUnit
   * @generated
   */
  EEnum getWorkQuantityUnit();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ProjectFactory getProjectFactory();

} //ProjectPackage
