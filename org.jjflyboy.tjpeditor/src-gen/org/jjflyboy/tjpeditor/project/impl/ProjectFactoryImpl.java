/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.jjflyboy.tjpeditor.project.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProjectFactoryImpl extends EFactoryImpl implements ProjectFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ProjectFactory init()
  {
    try
    {
      ProjectFactory theProjectFactory = (ProjectFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.jjflyboy.org/tjpeditor/Project"); 
      if (theProjectFactory != null)
      {
        return theProjectFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ProjectFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProjectFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ProjectPackage.GLOBAL: return createGlobal();
      case ProjectPackage.GLOBAL_ATTRIBUTE: return createGlobalAttribute();
      case ProjectPackage.ACCOUNT: return createAccount();
      case ProjectPackage.ACCOUNT_ATTRIBUTE: return createAccountAttribute();
      case ProjectPackage.ACCOUNT_REPORT: return createAccountReport();
      case ProjectPackage.ACCOUNT_ROOT: return createAccountRoot();
      case ProjectPackage.PROJECT: return createProject();
      case ProjectPackage.PROJECT_ATTRIBUTE: return createProjectAttribute();
      case ProjectPackage.TASK: return createTask();
      case ProjectPackage.TASK_ATTRIBUTE: return createTaskAttribute();
      case ProjectPackage.REPORT: return createReport();
      case ProjectPackage.REPORT_ATTRIBUTE: return createReportAttribute();
      case ProjectPackage.EXPORT: return createExport();
      case ProjectPackage.EXPORT_ATTRIBUTE: return createExportAttribute();
      case ProjectPackage.RESOURCE: return createResource();
      case ProjectPackage.RESOURCE_ATTRIBUTE: return createResourceAttribute();
      case ProjectPackage.ALLOCATE: return createAllocate();
      case ProjectPackage.ALLOCATE_RESOURCE: return createAllocateResource();
      case ProjectPackage.ALLOCATE_RESOURCE_ATTRIBUTE: return createAllocateResourceAttribute();
      case ProjectPackage.NAVIGATOR: return createNavigator();
      case ProjectPackage.NAVIGATOR_ATTRIBUTE: return createNavigatorAttribute();
      case ProjectPackage.NEW_TASK: return createNewTask();
      case ProjectPackage.NEW_TASK_ATTRIBUTE: return createNewTaskAttribute();
      case ProjectPackage.NIKU_REPORT: return createNikuReport();
      case ProjectPackage.NIKU_REPORT_ATTRIBUTE: return createNikuReportAttribute();
      case ProjectPackage.ALERT: return createAlert();
      case ProjectPackage.ALTERNATIVE: return createAlternative();
      case ProjectPackage.AUTHOR: return createAuthor();
      case ProjectPackage.BALANCE: return createBalance();
      case ProjectPackage.BOOKING: return createBooking();
      case ProjectPackage.BOOKING_TASK: return createBookingTask();
      case ProjectPackage.BOOKING_RESOURCE: return createBookingResource();
      case ProjectPackage.CAPTION: return createCaption();
      case ProjectPackage.CELL_COLOR: return createCellColor();
      case ProjectPackage.CELL_TEXT: return createCellText();
      case ProjectPackage.CENTER: return createCenter();
      case ProjectPackage.CHARGE: return createCharge();
      case ProjectPackage.CHARGE_SET: return createChargeSet();
      case ProjectPackage.COLUMNS: return createColumns();
      case ProjectPackage.COMPLETE: return createComplete();
      case ProjectPackage.COPYRIGHT: return createCopyright();
      case ProjectPackage.CREDIT: return createCredit();
      case ProjectPackage.CURRENCY: return createCurrency();
      case ProjectPackage.CURRENCY_FORMAT: return createCurrencyFormat();
      case ProjectPackage.DAILY_MAX: return createDailyMax();
      case ProjectPackage.DAILY_MIN: return createDailyMin();
      case ProjectPackage.DAILY_WORKING_HOURS: return createDailyWorkingHours();
      case ProjectPackage.DEFINITIONS: return createDefinitions();
      case ProjectPackage.DEPENDS: return createDepends();
      case ProjectPackage.DETAILS: return createDetails();
      case ProjectPackage.DURATION: return createDuration();
      case ProjectPackage.EFFICIENCY: return createEfficiency();
      case ProjectPackage.EFFORT: return createEffort();
      case ProjectPackage.EMAIL: return createEmail();
      case ProjectPackage.END: return createEnd();
      case ProjectPackage.END_CREDIT: return createEndCredit();
      case ProjectPackage.EPILOG: return createEpilog();
      case ProjectPackage.EXTEND: return createExtend();
      case ProjectPackage.EXTEND_RESOURCE: return createExtendResource();
      case ProjectPackage.EXTENDED_RESOURCE_ATTRIBUTE: return createExtendedResourceAttribute();
      case ProjectPackage.EXTEND_TASK: return createExtendTask();
      case ProjectPackage.EXTENDED_TASK_ATTRIBUTE: return createExtendedTaskAttribute();
      case ProjectPackage.FAIL: return createFail();
      case ProjectPackage.FLAGS: return createFlags();
      case ProjectPackage.FONT_COLOR: return createFontColor();
      case ProjectPackage.FOOTER: return createFooter();
      case ProjectPackage.FORMATS: return createFormats();
      case ProjectPackage.GAP_DURATION: return createGapDuration();
      case ProjectPackage.GAP_LENGTH: return createGapLength();
      case ProjectPackage.HALIGN: return createHAlign();
      case ProjectPackage.HEADER: return createHeader();
      case ProjectPackage.HEADLINE: return createHeadline();
      case ProjectPackage.HIDE_ACCOUNT: return createHideAccount();
      case ProjectPackage.HIDE_JOURNAL_ENTRY: return createHideJournalEntry();
      case ProjectPackage.HIDE_REPORT: return createHideReport();
      case ProjectPackage.HIDE_RESOURCE: return createHideResource();
      case ProjectPackage.HIDE_TASK: return createHideTask();
      case ProjectPackage.INCLUDE: return createInclude();
      case ProjectPackage.INTERVAL1: return createInterval1();
      case ProjectPackage.INTERVAL2: return createInterval2();
      case ProjectPackage.INTERVAL3: return createInterval3();
      case ProjectPackage.INTERVAL4: return createInterval4();
      case ProjectPackage.JOURNAL_ATTRIBUTES: return createJournalAttributes();
      case ProjectPackage.JOURNAL_ENTRY: return createJournalEntry();
      case ProjectPackage.JOURNAL_MODE: return createJournalMode();
      case ProjectPackage.LEFT: return createLeft();
      case ProjectPackage.LENGTH: return createLength();
      case ProjectPackage.LIMITS: return createLimits();
      case ProjectPackage.LIMITS_ATTRIBUTE: return createLimitsAttribute();
      case ProjectPackage.LIST_ITEM: return createListItem();
      case ProjectPackage.LIST_TYPE: return createListType();
      case ProjectPackage.LOAD_UNIT: return createLoadUnit();
      case ProjectPackage.MACRO: return createMacro();
      case ProjectPackage.MANAGERS: return createManagers();
      case ProjectPackage.MANDATORY: return createMandatory();
      case ProjectPackage.MAX_END: return createMaxEnd();
      case ProjectPackage.MAXIMUM: return createMaximum();
      case ProjectPackage.MAX_START: return createMaxStart();
      case ProjectPackage.MILESTONE: return createMilestone();
      case ProjectPackage.MINIMUM: return createMinimum();
      case ProjectPackage.MIN_END: return createMinEnd();
      case ProjectPackage.MIN_START: return createMinStart();
      case ProjectPackage.MONTHLY_MAX: return createMonthlyMax();
      case ProjectPackage.MONTHLY_MIN: return createMonthlyMin();
      case ProjectPackage.NOTE: return createNote();
      case ProjectPackage.NOW: return createNow();
      case ProjectPackage.NUMBER_FORMAT: return createNumberFormat();
      case ProjectPackage.PERIOD: return createPeriod();
      case ProjectPackage.PERSISTENT: return createPersistent();
      case ProjectPackage.PRECEDES: return createPrecedes();
      case ProjectPackage.PRIORITY: return createPriority();
      case ProjectPackage.PROJECT_ID: return createProjectId();
      case ProjectPackage.PROJECT_IDS: return createProjectIds();
      case ProjectPackage.PROLOG: return createProlog();
      case ProjectPackage.PURGE_REPORT: return createPurgeReport();
      case ProjectPackage.PURGE_RESOURCE: return createPurgeResource();
      case ProjectPackage.PURGE_TASK: return createPurgeTask();
      case ProjectPackage.RATE: return createRate();
      case ProjectPackage.REMAINING: return createRemaining();
      case ProjectPackage.REPORT_PREFIX: return createReportPrefix();
      case ProjectPackage.RESOURCE_ATTRIBUTES: return createResourceAttributes();
      case ProjectPackage.RESOURCE_PREFIX: return createResourcePrefix();
      case ProjectPackage.RESOURCE_REPORT: return createResourceReport();
      case ProjectPackage.RESOURCE_ROOT: return createResourceRoot();
      case ProjectPackage.RESPONSIBLE: return createResponsible();
      case ProjectPackage.RGB: return createRGB();
      case ProjectPackage.RIGHT: return createRight();
      case ProjectPackage.ROLLUP_ACCOUNT: return createRollupAccount();
      case ProjectPackage.ROLLUP_RESOURCE: return createRollupResource();
      case ProjectPackage.ROLLUP_TASK: return createRollupTask();
      case ProjectPackage.SCALE: return createScale();
      case ProjectPackage.SCENARIO: return createScenario();
      case ProjectPackage.SCENARIOS: return createScenarios();
      case ProjectPackage.SCHEDULED: return createScheduled();
      case ProjectPackage.SCHEDULING: return createScheduling();
      case ProjectPackage.SELECT: return createSelect();
      case ProjectPackage.SELF_CONTAINED: return createSelfContained();
      case ProjectPackage.SHIFT: return createShift();
      case ProjectPackage.SHIFT_TIMESHEET: return createShiftTimesheet();
      case ProjectPackage.SHIFTS: return createShifts();
      case ProjectPackage.SHIFTS_LIMIT: return createShiftsLimit();
      case ProjectPackage.SHIFTS_ALLOCATE: return createShiftsAllocate();
      case ProjectPackage.SHIFTS_RESOURCE: return createShiftsResource();
      case ProjectPackage.SHIFTS_TASK: return createShiftsTask();
      case ProjectPackage.SHORT_TIME_FORMAT: return createShortTimeFormat();
      case ProjectPackage.SORT: return createSort();
      case ProjectPackage.SORT_ACCOUNTS: return createSortAccounts();
      case ProjectPackage.SORT_JOURNAL_ENTRIES: return createSortJournalEntries();
      case ProjectPackage.SORT_RESOURCES: return createSortResources();
      case ProjectPackage.SORT_TASKS: return createSortTasks();
      case ProjectPackage.START: return createStart();
      case ProjectPackage.STATUS_STATUS_SHEET: return createStatusStatusSheet();
      case ProjectPackage.STATUS_STATUS_SHEET_ATTRIBUTE: return createStatusStatusSheetAttribute();
      case ProjectPackage.STATUS_TIMESHEET: return createStatusTimesheet();
      case ProjectPackage.STATUS_TIMESHEET_ATTRIBUTE: return createStatusTimesheetAttribute();
      case ProjectPackage.STATUS_SHEET: return createStatusSheet();
      case ProjectPackage.STATUS_SHEET_ATTRIBUTE: return createStatusSheetAttribute();
      case ProjectPackage.STATUS_SHEET_REPORT: return createStatusSheetReport();
      case ProjectPackage.STATUS_SHEET_REPORT_ATTRIBUTE: return createStatusSheetReportAttribute();
      case ProjectPackage.SUMMARY: return createSummary();
      case ProjectPackage.SUPPLEMENT_ACCOUNT: return createSupplementAccount();
      case ProjectPackage.SUPPLEMENT_REPORT: return createSupplementReport();
      case ProjectPackage.SUPPLEMENT_RESOURCE: return createSupplementResource();
      case ProjectPackage.SUPPLEMENT_TASK: return createSupplementTask();
      case ProjectPackage.TAG_FILE: return createTagFile();
      case ProjectPackage.TASK_STATUS_SHEET: return createTaskStatusSheet();
      case ProjectPackage.TASK_STATUS_SHEET_ATTRIBUTE: return createTaskStatusSheetAttribute();
      case ProjectPackage.TASK_TIMESHEET: return createTaskTimesheet();
      case ProjectPackage.TASK_TIMESHEET_ATTRIBUTE: return createTaskTimesheetAttribute();
      case ProjectPackage.TASK_ATTRIBUTES: return createTaskAttributes();
      case ProjectPackage.TASK_PREFIX: return createTaskPrefix();
      case ProjectPackage.TASK_REPORT: return createTaskReport();
      case ProjectPackage.TASK_ROOT: return createTaskRoot();
      case ProjectPackage.TEXT_REPORT: return createTextReport();
      case ProjectPackage.TIME_FORMAT: return createTimeFormat();
      case ProjectPackage.TIMEOFF: return createTimeoff();
      case ProjectPackage.TIMESHEET: return createTimesheet();
      case ProjectPackage.TIMESHEET_ATTRIBUTE: return createTimesheetAttribute();
      case ProjectPackage.TIMESHEET_REPORT: return createTimesheetReport();
      case ProjectPackage.TIMEZONE: return createTimezone();
      case ProjectPackage.TIMING_RESOLUTION: return createTimingResolution();
      case ProjectPackage.TITLE: return createTitle();
      case ProjectPackage.TOOL_TIP: return createToolTip();
      case ProjectPackage.TRACKING_SCENARIO: return createTrackingScenario();
      case ProjectPackage.TREE_LEVEL: return createTreeLevel();
      case ProjectPackage.VACATION: return createVacation();
      case ProjectPackage.WARN: return createWarn();
      case ProjectPackage.WEEK_STARTS: return createWeekStarts();
      case ProjectPackage.WEEKLY_MAX: return createWeeklyMax();
      case ProjectPackage.WEEKLY_MIN: return createWeeklyMin();
      case ProjectPackage.WIDTH: return createWidth();
      case ProjectPackage.WORK: return createWork();
      case ProjectPackage.WORKING_HOURS: return createWorkingHours();
      case ProjectPackage.YEARLY_WORKING_DAYS: return createYearlyWorkingDays();
      case ProjectPackage.ACCOUNT_SHARE: return createAccountShare();
      case ProjectPackage.COLUMN_ATTRIBUTE: return createColumnAttribute();
      case ProjectPackage.COLUMN: return createColumn();
      case ProjectPackage.CRITERION: return createCriterion();
      case ProjectPackage.DURATION_QUANTITY: return createDurationQuantity();
      case ProjectPackage.LIMIT: return createLimit();
      case ProjectPackage.LIMIT_ATTRIBUTE: return createLimitAttribute();
      case ProjectPackage.REAL_FORMAT: return createRealFormat();
      case ProjectPackage.TASK_DEPENDENCY: return createTaskDependency();
      case ProjectPackage.TIMESHEET_REPORT_ATTRIBUTE: return createTimesheetReportAttribute();
      case ProjectPackage.RICH_TEXT: return createRichText();
      case ProjectPackage.WORK_HOURS: return createWorkHours();
      case ProjectPackage.WEEKDAYS: return createWeekdays();
      case ProjectPackage.DEFINTIONS: return createDefintions();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ProjectPackage.PURGE_REPORT_ATTRIBUTE:
        return createPurgeReportAttributeFromString(eDataType, initialValue);
      case ProjectPackage.PURGE_RESOURCE_ATTRIBUTE:
        return createPurgeResourceAttributeFromString(eDataType, initialValue);
      case ProjectPackage.PURGE_TASK_ATTRIBUTE:
        return createPurgeTaskAttributeFromString(eDataType, initialValue);
      case ProjectPackage.CHARGE_APPLIES:
        return createChargeAppliesFromString(eDataType, initialValue);
      case ProjectPackage.JUSTIFICATION:
        return createJustificationFromString(eDataType, initialValue);
      case ProjectPackage.JOURNAL_MODE_VALUE:
        return createJournalModeValueFromString(eDataType, initialValue);
      case ProjectPackage.JOURNAL_ENTRY_SORT_CRITERION:
        return createJournalEntrySortCriterionFromString(eDataType, initialValue);
      case ProjectPackage.LIST_TYPE_VALUES:
        return createListTypeValuesFromString(eDataType, initialValue);
      case ProjectPackage.CRITERION_DIRECTION:
        return createCriterionDirectionFromString(eDataType, initialValue);
      case ProjectPackage.YES_NO:
        return createYesNoFromString(eDataType, initialValue);
      case ProjectPackage.REPORT_FORMAT:
        return createReportFormatFromString(eDataType, initialValue);
      case ProjectPackage.LOAD_DISPLAY_UNIT:
        return createLoadDisplayUnitFromString(eDataType, initialValue);
      case ProjectPackage.SCALE_RESOLUTION:
        return createScaleResolutionFromString(eDataType, initialValue);
      case ProjectPackage.SELECT_ARGUMENT:
        return createSelectArgumentFromString(eDataType, initialValue);
      case ProjectPackage.COLUMN_ID:
        return createColumnIdFromString(eDataType, initialValue);
      case ProjectPackage.ALERT_LEVEL:
        return createAlertLevelFromString(eDataType, initialValue);
      case ProjectPackage.DEPENDS_POLICY:
        return createDependsPolicyFromString(eDataType, initialValue);
      case ProjectPackage.SCHEDULING_POLICY:
        return createSchedulingPolicyFromString(eDataType, initialValue);
      case ProjectPackage.TIME_UNIT:
        return createTimeUnitFromString(eDataType, initialValue);
      case ProjectPackage.WEEKDAY:
        return createWeekdayFromString(eDataType, initialValue);
      case ProjectPackage.WORK_QUANTITY_UNIT:
        return createWorkQuantityUnitFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ProjectPackage.PURGE_REPORT_ATTRIBUTE:
        return convertPurgeReportAttributeToString(eDataType, instanceValue);
      case ProjectPackage.PURGE_RESOURCE_ATTRIBUTE:
        return convertPurgeResourceAttributeToString(eDataType, instanceValue);
      case ProjectPackage.PURGE_TASK_ATTRIBUTE:
        return convertPurgeTaskAttributeToString(eDataType, instanceValue);
      case ProjectPackage.CHARGE_APPLIES:
        return convertChargeAppliesToString(eDataType, instanceValue);
      case ProjectPackage.JUSTIFICATION:
        return convertJustificationToString(eDataType, instanceValue);
      case ProjectPackage.JOURNAL_MODE_VALUE:
        return convertJournalModeValueToString(eDataType, instanceValue);
      case ProjectPackage.JOURNAL_ENTRY_SORT_CRITERION:
        return convertJournalEntrySortCriterionToString(eDataType, instanceValue);
      case ProjectPackage.LIST_TYPE_VALUES:
        return convertListTypeValuesToString(eDataType, instanceValue);
      case ProjectPackage.CRITERION_DIRECTION:
        return convertCriterionDirectionToString(eDataType, instanceValue);
      case ProjectPackage.YES_NO:
        return convertYesNoToString(eDataType, instanceValue);
      case ProjectPackage.REPORT_FORMAT:
        return convertReportFormatToString(eDataType, instanceValue);
      case ProjectPackage.LOAD_DISPLAY_UNIT:
        return convertLoadDisplayUnitToString(eDataType, instanceValue);
      case ProjectPackage.SCALE_RESOLUTION:
        return convertScaleResolutionToString(eDataType, instanceValue);
      case ProjectPackage.SELECT_ARGUMENT:
        return convertSelectArgumentToString(eDataType, instanceValue);
      case ProjectPackage.COLUMN_ID:
        return convertColumnIdToString(eDataType, instanceValue);
      case ProjectPackage.ALERT_LEVEL:
        return convertAlertLevelToString(eDataType, instanceValue);
      case ProjectPackage.DEPENDS_POLICY:
        return convertDependsPolicyToString(eDataType, instanceValue);
      case ProjectPackage.SCHEDULING_POLICY:
        return convertSchedulingPolicyToString(eDataType, instanceValue);
      case ProjectPackage.TIME_UNIT:
        return convertTimeUnitToString(eDataType, instanceValue);
      case ProjectPackage.WEEKDAY:
        return convertWeekdayToString(eDataType, instanceValue);
      case ProjectPackage.WORK_QUANTITY_UNIT:
        return convertWorkQuantityUnitToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Global createGlobal()
  {
    GlobalImpl global = new GlobalImpl();
    return global;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GlobalAttribute createGlobalAttribute()
  {
    GlobalAttributeImpl globalAttribute = new GlobalAttributeImpl();
    return globalAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Account createAccount()
  {
    AccountImpl account = new AccountImpl();
    return account;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AccountAttribute createAccountAttribute()
  {
    AccountAttributeImpl accountAttribute = new AccountAttributeImpl();
    return accountAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AccountReport createAccountReport()
  {
    AccountReportImpl accountReport = new AccountReportImpl();
    return accountReport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AccountRoot createAccountRoot()
  {
    AccountRootImpl accountRoot = new AccountRootImpl();
    return accountRoot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Project createProject()
  {
    ProjectImpl project = new ProjectImpl();
    return project;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProjectAttribute createProjectAttribute()
  {
    ProjectAttributeImpl projectAttribute = new ProjectAttributeImpl();
    return projectAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Task createTask()
  {
    TaskImpl task = new TaskImpl();
    return task;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TaskAttribute createTaskAttribute()
  {
    TaskAttributeImpl taskAttribute = new TaskAttributeImpl();
    return taskAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Report createReport()
  {
    ReportImpl report = new ReportImpl();
    return report;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReportAttribute createReportAttribute()
  {
    ReportAttributeImpl reportAttribute = new ReportAttributeImpl();
    return reportAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Export createExport()
  {
    ExportImpl export = new ExportImpl();
    return export;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExportAttribute createExportAttribute()
  {
    ExportAttributeImpl exportAttribute = new ExportAttributeImpl();
    return exportAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Resource createResource()
  {
    ResourceImpl resource = new ResourceImpl();
    return resource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResourceAttribute createResourceAttribute()
  {
    ResourceAttributeImpl resourceAttribute = new ResourceAttributeImpl();
    return resourceAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Allocate createAllocate()
  {
    AllocateImpl allocate = new AllocateImpl();
    return allocate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AllocateResource createAllocateResource()
  {
    AllocateResourceImpl allocateResource = new AllocateResourceImpl();
    return allocateResource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AllocateResourceAttribute createAllocateResourceAttribute()
  {
    AllocateResourceAttributeImpl allocateResourceAttribute = new AllocateResourceAttributeImpl();
    return allocateResourceAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Navigator createNavigator()
  {
    NavigatorImpl navigator = new NavigatorImpl();
    return navigator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NavigatorAttribute createNavigatorAttribute()
  {
    NavigatorAttributeImpl navigatorAttribute = new NavigatorAttributeImpl();
    return navigatorAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NewTask createNewTask()
  {
    NewTaskImpl newTask = new NewTaskImpl();
    return newTask;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NewTaskAttribute createNewTaskAttribute()
  {
    NewTaskAttributeImpl newTaskAttribute = new NewTaskAttributeImpl();
    return newTaskAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NikuReport createNikuReport()
  {
    NikuReportImpl nikuReport = new NikuReportImpl();
    return nikuReport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NikuReportAttribute createNikuReportAttribute()
  {
    NikuReportAttributeImpl nikuReportAttribute = new NikuReportAttributeImpl();
    return nikuReportAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Alert createAlert()
  {
    AlertImpl alert = new AlertImpl();
    return alert;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Alternative createAlternative()
  {
    AlternativeImpl alternative = new AlternativeImpl();
    return alternative;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Author createAuthor()
  {
    AuthorImpl author = new AuthorImpl();
    return author;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Balance createBalance()
  {
    BalanceImpl balance = new BalanceImpl();
    return balance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Booking createBooking()
  {
    BookingImpl booking = new BookingImpl();
    return booking;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BookingTask createBookingTask()
  {
    BookingTaskImpl bookingTask = new BookingTaskImpl();
    return bookingTask;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BookingResource createBookingResource()
  {
    BookingResourceImpl bookingResource = new BookingResourceImpl();
    return bookingResource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Caption createCaption()
  {
    CaptionImpl caption = new CaptionImpl();
    return caption;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CellColor createCellColor()
  {
    CellColorImpl cellColor = new CellColorImpl();
    return cellColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CellText createCellText()
  {
    CellTextImpl cellText = new CellTextImpl();
    return cellText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Center createCenter()
  {
    CenterImpl center = new CenterImpl();
    return center;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Charge createCharge()
  {
    ChargeImpl charge = new ChargeImpl();
    return charge;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChargeSet createChargeSet()
  {
    ChargeSetImpl chargeSet = new ChargeSetImpl();
    return chargeSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Columns createColumns()
  {
    ColumnsImpl columns = new ColumnsImpl();
    return columns;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Complete createComplete()
  {
    CompleteImpl complete = new CompleteImpl();
    return complete;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Copyright createCopyright()
  {
    CopyrightImpl copyright = new CopyrightImpl();
    return copyright;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Credit createCredit()
  {
    CreditImpl credit = new CreditImpl();
    return credit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Currency createCurrency()
  {
    CurrencyImpl currency = new CurrencyImpl();
    return currency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CurrencyFormat createCurrencyFormat()
  {
    CurrencyFormatImpl currencyFormat = new CurrencyFormatImpl();
    return currencyFormat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DailyMax createDailyMax()
  {
    DailyMaxImpl dailyMax = new DailyMaxImpl();
    return dailyMax;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DailyMin createDailyMin()
  {
    DailyMinImpl dailyMin = new DailyMinImpl();
    return dailyMin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DailyWorkingHours createDailyWorkingHours()
  {
    DailyWorkingHoursImpl dailyWorkingHours = new DailyWorkingHoursImpl();
    return dailyWorkingHours;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Definitions createDefinitions()
  {
    DefinitionsImpl definitions = new DefinitionsImpl();
    return definitions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Depends createDepends()
  {
    DependsImpl depends = new DependsImpl();
    return depends;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Details createDetails()
  {
    DetailsImpl details = new DetailsImpl();
    return details;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Duration createDuration()
  {
    DurationImpl duration = new DurationImpl();
    return duration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Efficiency createEfficiency()
  {
    EfficiencyImpl efficiency = new EfficiencyImpl();
    return efficiency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Effort createEffort()
  {
    EffortImpl effort = new EffortImpl();
    return effort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Email createEmail()
  {
    EmailImpl email = new EmailImpl();
    return email;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public End createEnd()
  {
    EndImpl end = new EndImpl();
    return end;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EndCredit createEndCredit()
  {
    EndCreditImpl endCredit = new EndCreditImpl();
    return endCredit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Epilog createEpilog()
  {
    EpilogImpl epilog = new EpilogImpl();
    return epilog;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Extend createExtend()
  {
    ExtendImpl extend = new ExtendImpl();
    return extend;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtendResource createExtendResource()
  {
    ExtendResourceImpl extendResource = new ExtendResourceImpl();
    return extendResource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtendedResourceAttribute createExtendedResourceAttribute()
  {
    ExtendedResourceAttributeImpl extendedResourceAttribute = new ExtendedResourceAttributeImpl();
    return extendedResourceAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtendTask createExtendTask()
  {
    ExtendTaskImpl extendTask = new ExtendTaskImpl();
    return extendTask;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtendedTaskAttribute createExtendedTaskAttribute()
  {
    ExtendedTaskAttributeImpl extendedTaskAttribute = new ExtendedTaskAttributeImpl();
    return extendedTaskAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Fail createFail()
  {
    FailImpl fail = new FailImpl();
    return fail;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Flags createFlags()
  {
    FlagsImpl flags = new FlagsImpl();
    return flags;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FontColor createFontColor()
  {
    FontColorImpl fontColor = new FontColorImpl();
    return fontColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Footer createFooter()
  {
    FooterImpl footer = new FooterImpl();
    return footer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Formats createFormats()
  {
    FormatsImpl formats = new FormatsImpl();
    return formats;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GapDuration createGapDuration()
  {
    GapDurationImpl gapDuration = new GapDurationImpl();
    return gapDuration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GapLength createGapLength()
  {
    GapLengthImpl gapLength = new GapLengthImpl();
    return gapLength;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HAlign createHAlign()
  {
    HAlignImpl hAlign = new HAlignImpl();
    return hAlign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Header createHeader()
  {
    HeaderImpl header = new HeaderImpl();
    return header;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Headline createHeadline()
  {
    HeadlineImpl headline = new HeadlineImpl();
    return headline;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HideAccount createHideAccount()
  {
    HideAccountImpl hideAccount = new HideAccountImpl();
    return hideAccount;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HideJournalEntry createHideJournalEntry()
  {
    HideJournalEntryImpl hideJournalEntry = new HideJournalEntryImpl();
    return hideJournalEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HideReport createHideReport()
  {
    HideReportImpl hideReport = new HideReportImpl();
    return hideReport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HideResource createHideResource()
  {
    HideResourceImpl hideResource = new HideResourceImpl();
    return hideResource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HideTask createHideTask()
  {
    HideTaskImpl hideTask = new HideTaskImpl();
    return hideTask;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Include createInclude()
  {
    IncludeImpl include = new IncludeImpl();
    return include;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interval1 createInterval1()
  {
    Interval1Impl interval1 = new Interval1Impl();
    return interval1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interval2 createInterval2()
  {
    Interval2Impl interval2 = new Interval2Impl();
    return interval2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interval3 createInterval3()
  {
    Interval3Impl interval3 = new Interval3Impl();
    return interval3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interval4 createInterval4()
  {
    Interval4Impl interval4 = new Interval4Impl();
    return interval4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JournalAttributes createJournalAttributes()
  {
    JournalAttributesImpl journalAttributes = new JournalAttributesImpl();
    return journalAttributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JournalEntry createJournalEntry()
  {
    JournalEntryImpl journalEntry = new JournalEntryImpl();
    return journalEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JournalMode createJournalMode()
  {
    JournalModeImpl journalMode = new JournalModeImpl();
    return journalMode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Left createLeft()
  {
    LeftImpl left = new LeftImpl();
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Length createLength()
  {
    LengthImpl length = new LengthImpl();
    return length;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Limits createLimits()
  {
    LimitsImpl limits = new LimitsImpl();
    return limits;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LimitsAttribute createLimitsAttribute()
  {
    LimitsAttributeImpl limitsAttribute = new LimitsAttributeImpl();
    return limitsAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListItem createListItem()
  {
    ListItemImpl listItem = new ListItemImpl();
    return listItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListType createListType()
  {
    ListTypeImpl listType = new ListTypeImpl();
    return listType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LoadUnit createLoadUnit()
  {
    LoadUnitImpl loadUnit = new LoadUnitImpl();
    return loadUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Macro createMacro()
  {
    MacroImpl macro = new MacroImpl();
    return macro;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Managers createManagers()
  {
    ManagersImpl managers = new ManagersImpl();
    return managers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mandatory createMandatory()
  {
    MandatoryImpl mandatory = new MandatoryImpl();
    return mandatory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MaxEnd createMaxEnd()
  {
    MaxEndImpl maxEnd = new MaxEndImpl();
    return maxEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Maximum createMaximum()
  {
    MaximumImpl maximum = new MaximumImpl();
    return maximum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MaxStart createMaxStart()
  {
    MaxStartImpl maxStart = new MaxStartImpl();
    return maxStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Milestone createMilestone()
  {
    MilestoneImpl milestone = new MilestoneImpl();
    return milestone;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Minimum createMinimum()
  {
    MinimumImpl minimum = new MinimumImpl();
    return minimum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MinEnd createMinEnd()
  {
    MinEndImpl minEnd = new MinEndImpl();
    return minEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MinStart createMinStart()
  {
    MinStartImpl minStart = new MinStartImpl();
    return minStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MonthlyMax createMonthlyMax()
  {
    MonthlyMaxImpl monthlyMax = new MonthlyMaxImpl();
    return monthlyMax;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MonthlyMin createMonthlyMin()
  {
    MonthlyMinImpl monthlyMin = new MonthlyMinImpl();
    return monthlyMin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Note createNote()
  {
    NoteImpl note = new NoteImpl();
    return note;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Now createNow()
  {
    NowImpl now = new NowImpl();
    return now;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberFormat createNumberFormat()
  {
    NumberFormatImpl numberFormat = new NumberFormatImpl();
    return numberFormat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Period createPeriod()
  {
    PeriodImpl period = new PeriodImpl();
    return period;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Persistent createPersistent()
  {
    PersistentImpl persistent = new PersistentImpl();
    return persistent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Precedes createPrecedes()
  {
    PrecedesImpl precedes = new PrecedesImpl();
    return precedes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Priority createPriority()
  {
    PriorityImpl priority = new PriorityImpl();
    return priority;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProjectId createProjectId()
  {
    ProjectIdImpl projectId = new ProjectIdImpl();
    return projectId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProjectIds createProjectIds()
  {
    ProjectIdsImpl projectIds = new ProjectIdsImpl();
    return projectIds;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Prolog createProlog()
  {
    PrologImpl prolog = new PrologImpl();
    return prolog;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PurgeReport createPurgeReport()
  {
    PurgeReportImpl purgeReport = new PurgeReportImpl();
    return purgeReport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PurgeResource createPurgeResource()
  {
    PurgeResourceImpl purgeResource = new PurgeResourceImpl();
    return purgeResource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PurgeTask createPurgeTask()
  {
    PurgeTaskImpl purgeTask = new PurgeTaskImpl();
    return purgeTask;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rate createRate()
  {
    RateImpl rate = new RateImpl();
    return rate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Remaining createRemaining()
  {
    RemainingImpl remaining = new RemainingImpl();
    return remaining;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReportPrefix createReportPrefix()
  {
    ReportPrefixImpl reportPrefix = new ReportPrefixImpl();
    return reportPrefix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResourceAttributes createResourceAttributes()
  {
    ResourceAttributesImpl resourceAttributes = new ResourceAttributesImpl();
    return resourceAttributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResourcePrefix createResourcePrefix()
  {
    ResourcePrefixImpl resourcePrefix = new ResourcePrefixImpl();
    return resourcePrefix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResourceReport createResourceReport()
  {
    ResourceReportImpl resourceReport = new ResourceReportImpl();
    return resourceReport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResourceRoot createResourceRoot()
  {
    ResourceRootImpl resourceRoot = new ResourceRootImpl();
    return resourceRoot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Responsible createResponsible()
  {
    ResponsibleImpl responsible = new ResponsibleImpl();
    return responsible;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RGB createRGB()
  {
    RGBImpl rgb = new RGBImpl();
    return rgb;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Right createRight()
  {
    RightImpl right = new RightImpl();
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RollupAccount createRollupAccount()
  {
    RollupAccountImpl rollupAccount = new RollupAccountImpl();
    return rollupAccount;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RollupResource createRollupResource()
  {
    RollupResourceImpl rollupResource = new RollupResourceImpl();
    return rollupResource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RollupTask createRollupTask()
  {
    RollupTaskImpl rollupTask = new RollupTaskImpl();
    return rollupTask;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Scale createScale()
  {
    ScaleImpl scale = new ScaleImpl();
    return scale;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Scenario createScenario()
  {
    ScenarioImpl scenario = new ScenarioImpl();
    return scenario;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Scenarios createScenarios()
  {
    ScenariosImpl scenarios = new ScenariosImpl();
    return scenarios;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Scheduled createScheduled()
  {
    ScheduledImpl scheduled = new ScheduledImpl();
    return scheduled;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Scheduling createScheduling()
  {
    SchedulingImpl scheduling = new SchedulingImpl();
    return scheduling;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Select createSelect()
  {
    SelectImpl select = new SelectImpl();
    return select;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelfContained createSelfContained()
  {
    SelfContainedImpl selfContained = new SelfContainedImpl();
    return selfContained;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Shift createShift()
  {
    ShiftImpl shift = new ShiftImpl();
    return shift;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShiftTimesheet createShiftTimesheet()
  {
    ShiftTimesheetImpl shiftTimesheet = new ShiftTimesheetImpl();
    return shiftTimesheet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Shifts createShifts()
  {
    ShiftsImpl shifts = new ShiftsImpl();
    return shifts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShiftsLimit createShiftsLimit()
  {
    ShiftsLimitImpl shiftsLimit = new ShiftsLimitImpl();
    return shiftsLimit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShiftsAllocate createShiftsAllocate()
  {
    ShiftsAllocateImpl shiftsAllocate = new ShiftsAllocateImpl();
    return shiftsAllocate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShiftsResource createShiftsResource()
  {
    ShiftsResourceImpl shiftsResource = new ShiftsResourceImpl();
    return shiftsResource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShiftsTask createShiftsTask()
  {
    ShiftsTaskImpl shiftsTask = new ShiftsTaskImpl();
    return shiftsTask;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShortTimeFormat createShortTimeFormat()
  {
    ShortTimeFormatImpl shortTimeFormat = new ShortTimeFormatImpl();
    return shortTimeFormat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sort createSort()
  {
    SortImpl sort = new SortImpl();
    return sort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SortAccounts createSortAccounts()
  {
    SortAccountsImpl sortAccounts = new SortAccountsImpl();
    return sortAccounts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SortJournalEntries createSortJournalEntries()
  {
    SortJournalEntriesImpl sortJournalEntries = new SortJournalEntriesImpl();
    return sortJournalEntries;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SortResources createSortResources()
  {
    SortResourcesImpl sortResources = new SortResourcesImpl();
    return sortResources;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SortTasks createSortTasks()
  {
    SortTasksImpl sortTasks = new SortTasksImpl();
    return sortTasks;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Start createStart()
  {
    StartImpl start = new StartImpl();
    return start;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatusStatusSheet createStatusStatusSheet()
  {
    StatusStatusSheetImpl statusStatusSheet = new StatusStatusSheetImpl();
    return statusStatusSheet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatusStatusSheetAttribute createStatusStatusSheetAttribute()
  {
    StatusStatusSheetAttributeImpl statusStatusSheetAttribute = new StatusStatusSheetAttributeImpl();
    return statusStatusSheetAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatusTimesheet createStatusTimesheet()
  {
    StatusTimesheetImpl statusTimesheet = new StatusTimesheetImpl();
    return statusTimesheet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatusTimesheetAttribute createStatusTimesheetAttribute()
  {
    StatusTimesheetAttributeImpl statusTimesheetAttribute = new StatusTimesheetAttributeImpl();
    return statusTimesheetAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatusSheet createStatusSheet()
  {
    StatusSheetImpl statusSheet = new StatusSheetImpl();
    return statusSheet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatusSheetAttribute createStatusSheetAttribute()
  {
    StatusSheetAttributeImpl statusSheetAttribute = new StatusSheetAttributeImpl();
    return statusSheetAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatusSheetReport createStatusSheetReport()
  {
    StatusSheetReportImpl statusSheetReport = new StatusSheetReportImpl();
    return statusSheetReport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatusSheetReportAttribute createStatusSheetReportAttribute()
  {
    StatusSheetReportAttributeImpl statusSheetReportAttribute = new StatusSheetReportAttributeImpl();
    return statusSheetReportAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Summary createSummary()
  {
    SummaryImpl summary = new SummaryImpl();
    return summary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SupplementAccount createSupplementAccount()
  {
    SupplementAccountImpl supplementAccount = new SupplementAccountImpl();
    return supplementAccount;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SupplementReport createSupplementReport()
  {
    SupplementReportImpl supplementReport = new SupplementReportImpl();
    return supplementReport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SupplementResource createSupplementResource()
  {
    SupplementResourceImpl supplementResource = new SupplementResourceImpl();
    return supplementResource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SupplementTask createSupplementTask()
  {
    SupplementTaskImpl supplementTask = new SupplementTaskImpl();
    return supplementTask;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TagFile createTagFile()
  {
    TagFileImpl tagFile = new TagFileImpl();
    return tagFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TaskStatusSheet createTaskStatusSheet()
  {
    TaskStatusSheetImpl taskStatusSheet = new TaskStatusSheetImpl();
    return taskStatusSheet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TaskStatusSheetAttribute createTaskStatusSheetAttribute()
  {
    TaskStatusSheetAttributeImpl taskStatusSheetAttribute = new TaskStatusSheetAttributeImpl();
    return taskStatusSheetAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TaskTimesheet createTaskTimesheet()
  {
    TaskTimesheetImpl taskTimesheet = new TaskTimesheetImpl();
    return taskTimesheet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TaskTimesheetAttribute createTaskTimesheetAttribute()
  {
    TaskTimesheetAttributeImpl taskTimesheetAttribute = new TaskTimesheetAttributeImpl();
    return taskTimesheetAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TaskAttributes createTaskAttributes()
  {
    TaskAttributesImpl taskAttributes = new TaskAttributesImpl();
    return taskAttributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TaskPrefix createTaskPrefix()
  {
    TaskPrefixImpl taskPrefix = new TaskPrefixImpl();
    return taskPrefix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TaskReport createTaskReport()
  {
    TaskReportImpl taskReport = new TaskReportImpl();
    return taskReport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TaskRoot createTaskRoot()
  {
    TaskRootImpl taskRoot = new TaskRootImpl();
    return taskRoot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextReport createTextReport()
  {
    TextReportImpl textReport = new TextReportImpl();
    return textReport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimeFormat createTimeFormat()
  {
    TimeFormatImpl timeFormat = new TimeFormatImpl();
    return timeFormat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Timeoff createTimeoff()
  {
    TimeoffImpl timeoff = new TimeoffImpl();
    return timeoff;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Timesheet createTimesheet()
  {
    TimesheetImpl timesheet = new TimesheetImpl();
    return timesheet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimesheetAttribute createTimesheetAttribute()
  {
    TimesheetAttributeImpl timesheetAttribute = new TimesheetAttributeImpl();
    return timesheetAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimesheetReport createTimesheetReport()
  {
    TimesheetReportImpl timesheetReport = new TimesheetReportImpl();
    return timesheetReport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Timezone createTimezone()
  {
    TimezoneImpl timezone = new TimezoneImpl();
    return timezone;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimingResolution createTimingResolution()
  {
    TimingResolutionImpl timingResolution = new TimingResolutionImpl();
    return timingResolution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Title createTitle()
  {
    TitleImpl title = new TitleImpl();
    return title;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ToolTip createToolTip()
  {
    ToolTipImpl toolTip = new ToolTipImpl();
    return toolTip;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrackingScenario createTrackingScenario()
  {
    TrackingScenarioImpl trackingScenario = new TrackingScenarioImpl();
    return trackingScenario;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TreeLevel createTreeLevel()
  {
    TreeLevelImpl treeLevel = new TreeLevelImpl();
    return treeLevel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Vacation createVacation()
  {
    VacationImpl vacation = new VacationImpl();
    return vacation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Warn createWarn()
  {
    WarnImpl warn = new WarnImpl();
    return warn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WeekStarts createWeekStarts()
  {
    WeekStartsImpl weekStarts = new WeekStartsImpl();
    return weekStarts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WeeklyMax createWeeklyMax()
  {
    WeeklyMaxImpl weeklyMax = new WeeklyMaxImpl();
    return weeklyMax;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WeeklyMin createWeeklyMin()
  {
    WeeklyMinImpl weeklyMin = new WeeklyMinImpl();
    return weeklyMin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Width createWidth()
  {
    WidthImpl width = new WidthImpl();
    return width;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Work createWork()
  {
    WorkImpl work = new WorkImpl();
    return work;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkingHours createWorkingHours()
  {
    WorkingHoursImpl workingHours = new WorkingHoursImpl();
    return workingHours;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public YearlyWorkingDays createYearlyWorkingDays()
  {
    YearlyWorkingDaysImpl yearlyWorkingDays = new YearlyWorkingDaysImpl();
    return yearlyWorkingDays;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AccountShare createAccountShare()
  {
    AccountShareImpl accountShare = new AccountShareImpl();
    return accountShare;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColumnAttribute createColumnAttribute()
  {
    ColumnAttributeImpl columnAttribute = new ColumnAttributeImpl();
    return columnAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Column createColumn()
  {
    ColumnImpl column = new ColumnImpl();
    return column;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Criterion createCriterion()
  {
    CriterionImpl criterion = new CriterionImpl();
    return criterion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DurationQuantity createDurationQuantity()
  {
    DurationQuantityImpl durationQuantity = new DurationQuantityImpl();
    return durationQuantity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Limit createLimit()
  {
    LimitImpl limit = new LimitImpl();
    return limit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LimitAttribute createLimitAttribute()
  {
    LimitAttributeImpl limitAttribute = new LimitAttributeImpl();
    return limitAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RealFormat createRealFormat()
  {
    RealFormatImpl realFormat = new RealFormatImpl();
    return realFormat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TaskDependency createTaskDependency()
  {
    TaskDependencyImpl taskDependency = new TaskDependencyImpl();
    return taskDependency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimesheetReportAttribute createTimesheetReportAttribute()
  {
    TimesheetReportAttributeImpl timesheetReportAttribute = new TimesheetReportAttributeImpl();
    return timesheetReportAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichText createRichText()
  {
    RichTextImpl richText = new RichTextImpl();
    return richText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkHours createWorkHours()
  {
    WorkHoursImpl workHours = new WorkHoursImpl();
    return workHours;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Weekdays createWeekdays()
  {
    WeekdaysImpl weekdays = new WeekdaysImpl();
    return weekdays;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Defintions createDefintions()
  {
    DefintionsImpl defintions = new DefintionsImpl();
    return defintions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PurgeReportAttribute createPurgeReportAttributeFromString(EDataType eDataType, String initialValue)
  {
    PurgeReportAttribute result = PurgeReportAttribute.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPurgeReportAttributeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PurgeResourceAttribute createPurgeResourceAttributeFromString(EDataType eDataType, String initialValue)
  {
    PurgeResourceAttribute result = PurgeResourceAttribute.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPurgeResourceAttributeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PurgeTaskAttribute createPurgeTaskAttributeFromString(EDataType eDataType, String initialValue)
  {
    PurgeTaskAttribute result = PurgeTaskAttribute.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPurgeTaskAttributeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChargeApplies createChargeAppliesFromString(EDataType eDataType, String initialValue)
  {
    ChargeApplies result = ChargeApplies.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertChargeAppliesToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Justification createJustificationFromString(EDataType eDataType, String initialValue)
  {
    Justification result = Justification.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertJustificationToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JournalModeValue createJournalModeValueFromString(EDataType eDataType, String initialValue)
  {
    JournalModeValue result = JournalModeValue.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertJournalModeValueToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JournalEntrySortCriterion createJournalEntrySortCriterionFromString(EDataType eDataType, String initialValue)
  {
    JournalEntrySortCriterion result = JournalEntrySortCriterion.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertJournalEntrySortCriterionToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListTypeValues createListTypeValuesFromString(EDataType eDataType, String initialValue)
  {
    ListTypeValues result = ListTypeValues.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertListTypeValuesToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CriterionDirection createCriterionDirectionFromString(EDataType eDataType, String initialValue)
  {
    CriterionDirection result = CriterionDirection.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertCriterionDirectionToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public YesNo createYesNoFromString(EDataType eDataType, String initialValue)
  {
    YesNo result = YesNo.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertYesNoToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReportFormat createReportFormatFromString(EDataType eDataType, String initialValue)
  {
    ReportFormat result = ReportFormat.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertReportFormatToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LoadDisplayUnit createLoadDisplayUnitFromString(EDataType eDataType, String initialValue)
  {
    LoadDisplayUnit result = LoadDisplayUnit.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertLoadDisplayUnitToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScaleResolution createScaleResolutionFromString(EDataType eDataType, String initialValue)
  {
    ScaleResolution result = ScaleResolution.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertScaleResolutionToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectArgument createSelectArgumentFromString(EDataType eDataType, String initialValue)
  {
    SelectArgument result = SelectArgument.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertSelectArgumentToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColumnId createColumnIdFromString(EDataType eDataType, String initialValue)
  {
    ColumnId result = ColumnId.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertColumnIdToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlertLevel createAlertLevelFromString(EDataType eDataType, String initialValue)
  {
    AlertLevel result = AlertLevel.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAlertLevelToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DependsPolicy createDependsPolicyFromString(EDataType eDataType, String initialValue)
  {
    DependsPolicy result = DependsPolicy.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDependsPolicyToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SchedulingPolicy createSchedulingPolicyFromString(EDataType eDataType, String initialValue)
  {
    SchedulingPolicy result = SchedulingPolicy.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertSchedulingPolicyToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimeUnit createTimeUnitFromString(EDataType eDataType, String initialValue)
  {
    TimeUnit result = TimeUnit.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTimeUnitToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Weekday createWeekdayFromString(EDataType eDataType, String initialValue)
  {
    Weekday result = Weekday.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertWeekdayToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkQuantityUnit createWorkQuantityUnitFromString(EDataType eDataType, String initialValue)
  {
    WorkQuantityUnit result = WorkQuantityUnit.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertWorkQuantityUnitToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProjectPackage getProjectPackage()
  {
    return (ProjectPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ProjectPackage getPackage()
  {
    return ProjectPackage.eINSTANCE;
  }

} //ProjectFactoryImpl
