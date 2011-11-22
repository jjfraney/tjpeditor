/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage
 * @generated
 */
public interface ProjectFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ProjectFactory eINSTANCE = org.jjflyboy.tjpeditor.project.impl.ProjectFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Global</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Global</em>'.
   * @generated
   */
  Global createGlobal();

  /**
   * Returns a new object of class '<em>Global Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Global Attribute</em>'.
   * @generated
   */
  GlobalAttribute createGlobalAttribute();

  /**
   * Returns a new object of class '<em>Account</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Account</em>'.
   * @generated
   */
  Account createAccount();

  /**
   * Returns a new object of class '<em>Account Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Account Attribute</em>'.
   * @generated
   */
  AccountAttribute createAccountAttribute();

  /**
   * Returns a new object of class '<em>Account Report</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Account Report</em>'.
   * @generated
   */
  AccountReport createAccountReport();

  /**
   * Returns a new object of class '<em>Account Root</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Account Root</em>'.
   * @generated
   */
  AccountRoot createAccountRoot();

  /**
   * Returns a new object of class '<em>Project</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Project</em>'.
   * @generated
   */
  Project createProject();

  /**
   * Returns a new object of class '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute</em>'.
   * @generated
   */
  ProjectAttribute createProjectAttribute();

  /**
   * Returns a new object of class '<em>Task</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Task</em>'.
   * @generated
   */
  Task createTask();

  /**
   * Returns a new object of class '<em>Task Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Task Attribute</em>'.
   * @generated
   */
  TaskAttribute createTaskAttribute();

  /**
   * Returns a new object of class '<em>Report</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Report</em>'.
   * @generated
   */
  Report createReport();

  /**
   * Returns a new object of class '<em>Report Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Report Attribute</em>'.
   * @generated
   */
  ReportAttribute createReportAttribute();

  /**
   * Returns a new object of class '<em>Export</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Export</em>'.
   * @generated
   */
  Export createExport();

  /**
   * Returns a new object of class '<em>Export Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Export Attribute</em>'.
   * @generated
   */
  ExportAttribute createExportAttribute();

  /**
   * Returns a new object of class '<em>Resource</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Resource</em>'.
   * @generated
   */
  Resource createResource();

  /**
   * Returns a new object of class '<em>Resource Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Resource Attribute</em>'.
   * @generated
   */
  ResourceAttribute createResourceAttribute();

  /**
   * Returns a new object of class '<em>Allocate</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Allocate</em>'.
   * @generated
   */
  Allocate createAllocate();

  /**
   * Returns a new object of class '<em>Allocate Resource</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Allocate Resource</em>'.
   * @generated
   */
  AllocateResource createAllocateResource();

  /**
   * Returns a new object of class '<em>Allocate Resource Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Allocate Resource Attribute</em>'.
   * @generated
   */
  AllocateResourceAttribute createAllocateResourceAttribute();

  /**
   * Returns a new object of class '<em>Navigator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Navigator</em>'.
   * @generated
   */
  Navigator createNavigator();

  /**
   * Returns a new object of class '<em>Navigator Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Navigator Attribute</em>'.
   * @generated
   */
  NavigatorAttribute createNavigatorAttribute();

  /**
   * Returns a new object of class '<em>New Task</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>New Task</em>'.
   * @generated
   */
  NewTask createNewTask();

  /**
   * Returns a new object of class '<em>New Task Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>New Task Attribute</em>'.
   * @generated
   */
  NewTaskAttribute createNewTaskAttribute();

  /**
   * Returns a new object of class '<em>Niku Report</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Niku Report</em>'.
   * @generated
   */
  NikuReport createNikuReport();

  /**
   * Returns a new object of class '<em>Niku Report Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Niku Report Attribute</em>'.
   * @generated
   */
  NikuReportAttribute createNikuReportAttribute();

  /**
   * Returns a new object of class '<em>Alert</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Alert</em>'.
   * @generated
   */
  Alert createAlert();

  /**
   * Returns a new object of class '<em>Alternative</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Alternative</em>'.
   * @generated
   */
  Alternative createAlternative();

  /**
   * Returns a new object of class '<em>Author</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Author</em>'.
   * @generated
   */
  Author createAuthor();

  /**
   * Returns a new object of class '<em>Balance</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Balance</em>'.
   * @generated
   */
  Balance createBalance();

  /**
   * Returns a new object of class '<em>Booking</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Booking</em>'.
   * @generated
   */
  Booking createBooking();

  /**
   * Returns a new object of class '<em>Booking Task</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Booking Task</em>'.
   * @generated
   */
  BookingTask createBookingTask();

  /**
   * Returns a new object of class '<em>Booking Resource</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Booking Resource</em>'.
   * @generated
   */
  BookingResource createBookingResource();

  /**
   * Returns a new object of class '<em>Caption</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Caption</em>'.
   * @generated
   */
  Caption createCaption();

  /**
   * Returns a new object of class '<em>Cell Color</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cell Color</em>'.
   * @generated
   */
  CellColor createCellColor();

  /**
   * Returns a new object of class '<em>Cell Text</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cell Text</em>'.
   * @generated
   */
  CellText createCellText();

  /**
   * Returns a new object of class '<em>Center</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Center</em>'.
   * @generated
   */
  Center createCenter();

  /**
   * Returns a new object of class '<em>Charge</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Charge</em>'.
   * @generated
   */
  Charge createCharge();

  /**
   * Returns a new object of class '<em>Charge Set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Charge Set</em>'.
   * @generated
   */
  ChargeSet createChargeSet();

  /**
   * Returns a new object of class '<em>Columns</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Columns</em>'.
   * @generated
   */
  Columns createColumns();

  /**
   * Returns a new object of class '<em>Complete</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Complete</em>'.
   * @generated
   */
  Complete createComplete();

  /**
   * Returns a new object of class '<em>Copyright</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Copyright</em>'.
   * @generated
   */
  Copyright createCopyright();

  /**
   * Returns a new object of class '<em>Credit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Credit</em>'.
   * @generated
   */
  Credit createCredit();

  /**
   * Returns a new object of class '<em>Currency</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Currency</em>'.
   * @generated
   */
  Currency createCurrency();

  /**
   * Returns a new object of class '<em>Currency Format</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Currency Format</em>'.
   * @generated
   */
  CurrencyFormat createCurrencyFormat();

  /**
   * Returns a new object of class '<em>Daily Max</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Daily Max</em>'.
   * @generated
   */
  DailyMax createDailyMax();

  /**
   * Returns a new object of class '<em>Daily Min</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Daily Min</em>'.
   * @generated
   */
  DailyMin createDailyMin();

  /**
   * Returns a new object of class '<em>Daily Working Hours</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Daily Working Hours</em>'.
   * @generated
   */
  DailyWorkingHours createDailyWorkingHours();

  /**
   * Returns a new object of class '<em>Definitions</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Definitions</em>'.
   * @generated
   */
  Definitions createDefinitions();

  /**
   * Returns a new object of class '<em>Depends</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Depends</em>'.
   * @generated
   */
  Depends createDepends();

  /**
   * Returns a new object of class '<em>Details</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Details</em>'.
   * @generated
   */
  Details createDetails();

  /**
   * Returns a new object of class '<em>Duration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Duration</em>'.
   * @generated
   */
  Duration createDuration();

  /**
   * Returns a new object of class '<em>Efficiency</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Efficiency</em>'.
   * @generated
   */
  Efficiency createEfficiency();

  /**
   * Returns a new object of class '<em>Effort</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Effort</em>'.
   * @generated
   */
  Effort createEffort();

  /**
   * Returns a new object of class '<em>Email</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Email</em>'.
   * @generated
   */
  Email createEmail();

  /**
   * Returns a new object of class '<em>End</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>End</em>'.
   * @generated
   */
  End createEnd();

  /**
   * Returns a new object of class '<em>End Credit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>End Credit</em>'.
   * @generated
   */
  EndCredit createEndCredit();

  /**
   * Returns a new object of class '<em>Epilog</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Epilog</em>'.
   * @generated
   */
  Epilog createEpilog();

  /**
   * Returns a new object of class '<em>Extend</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Extend</em>'.
   * @generated
   */
  Extend createExtend();

  /**
   * Returns a new object of class '<em>Extend Resource</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Extend Resource</em>'.
   * @generated
   */
  ExtendResource createExtendResource();

  /**
   * Returns a new object of class '<em>Extended Resource Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Extended Resource Attribute</em>'.
   * @generated
   */
  ExtendedResourceAttribute createExtendedResourceAttribute();

  /**
   * Returns a new object of class '<em>Extend Task</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Extend Task</em>'.
   * @generated
   */
  ExtendTask createExtendTask();

  /**
   * Returns a new object of class '<em>Extended Task Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Extended Task Attribute</em>'.
   * @generated
   */
  ExtendedTaskAttribute createExtendedTaskAttribute();

  /**
   * Returns a new object of class '<em>Fail</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fail</em>'.
   * @generated
   */
  Fail createFail();

  /**
   * Returns a new object of class '<em>Flags</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Flags</em>'.
   * @generated
   */
  Flags createFlags();

  /**
   * Returns a new object of class '<em>Font Color</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Font Color</em>'.
   * @generated
   */
  FontColor createFontColor();

  /**
   * Returns a new object of class '<em>Footer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Footer</em>'.
   * @generated
   */
  Footer createFooter();

  /**
   * Returns a new object of class '<em>Formats</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Formats</em>'.
   * @generated
   */
  Formats createFormats();

  /**
   * Returns a new object of class '<em>Gap Duration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Gap Duration</em>'.
   * @generated
   */
  GapDuration createGapDuration();

  /**
   * Returns a new object of class '<em>Gap Length</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Gap Length</em>'.
   * @generated
   */
  GapLength createGapLength();

  /**
   * Returns a new object of class '<em>HAlign</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>HAlign</em>'.
   * @generated
   */
  HAlign createHAlign();

  /**
   * Returns a new object of class '<em>Header</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Header</em>'.
   * @generated
   */
  Header createHeader();

  /**
   * Returns a new object of class '<em>Headline</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Headline</em>'.
   * @generated
   */
  Headline createHeadline();

  /**
   * Returns a new object of class '<em>Hide Account</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Hide Account</em>'.
   * @generated
   */
  HideAccount createHideAccount();

  /**
   * Returns a new object of class '<em>Hide Journal Entry</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Hide Journal Entry</em>'.
   * @generated
   */
  HideJournalEntry createHideJournalEntry();

  /**
   * Returns a new object of class '<em>Hide Report</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Hide Report</em>'.
   * @generated
   */
  HideReport createHideReport();

  /**
   * Returns a new object of class '<em>Hide Resource</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Hide Resource</em>'.
   * @generated
   */
  HideResource createHideResource();

  /**
   * Returns a new object of class '<em>Hide Task</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Hide Task</em>'.
   * @generated
   */
  HideTask createHideTask();

  /**
   * Returns a new object of class '<em>Include</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Include</em>'.
   * @generated
   */
  Include createInclude();

  /**
   * Returns a new object of class '<em>Interval1</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interval1</em>'.
   * @generated
   */
  Interval1 createInterval1();

  /**
   * Returns a new object of class '<em>Interval2</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interval2</em>'.
   * @generated
   */
  Interval2 createInterval2();

  /**
   * Returns a new object of class '<em>Interval3</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interval3</em>'.
   * @generated
   */
  Interval3 createInterval3();

  /**
   * Returns a new object of class '<em>Interval4</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interval4</em>'.
   * @generated
   */
  Interval4 createInterval4();

  /**
   * Returns a new object of class '<em>Journal Attributes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Journal Attributes</em>'.
   * @generated
   */
  JournalAttributes createJournalAttributes();

  /**
   * Returns a new object of class '<em>Journal Entry</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Journal Entry</em>'.
   * @generated
   */
  JournalEntry createJournalEntry();

  /**
   * Returns a new object of class '<em>Journal Mode</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Journal Mode</em>'.
   * @generated
   */
  JournalMode createJournalMode();

  /**
   * Returns a new object of class '<em>Left</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Left</em>'.
   * @generated
   */
  Left createLeft();

  /**
   * Returns a new object of class '<em>Length</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Length</em>'.
   * @generated
   */
  Length createLength();

  /**
   * Returns a new object of class '<em>Limits</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Limits</em>'.
   * @generated
   */
  Limits createLimits();

  /**
   * Returns a new object of class '<em>Limits Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Limits Attribute</em>'.
   * @generated
   */
  LimitsAttribute createLimitsAttribute();

  /**
   * Returns a new object of class '<em>List Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>List Item</em>'.
   * @generated
   */
  ListItem createListItem();

  /**
   * Returns a new object of class '<em>List Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>List Type</em>'.
   * @generated
   */
  ListType createListType();

  /**
   * Returns a new object of class '<em>Load Unit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Load Unit</em>'.
   * @generated
   */
  LoadUnit createLoadUnit();

  /**
   * Returns a new object of class '<em>Macro</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Macro</em>'.
   * @generated
   */
  Macro createMacro();

  /**
   * Returns a new object of class '<em>Managers</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Managers</em>'.
   * @generated
   */
  Managers createManagers();

  /**
   * Returns a new object of class '<em>Mandatory</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mandatory</em>'.
   * @generated
   */
  Mandatory createMandatory();

  /**
   * Returns a new object of class '<em>Max End</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Max End</em>'.
   * @generated
   */
  MaxEnd createMaxEnd();

  /**
   * Returns a new object of class '<em>Maximum</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Maximum</em>'.
   * @generated
   */
  Maximum createMaximum();

  /**
   * Returns a new object of class '<em>Max Start</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Max Start</em>'.
   * @generated
   */
  MaxStart createMaxStart();

  /**
   * Returns a new object of class '<em>Milestone</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Milestone</em>'.
   * @generated
   */
  Milestone createMilestone();

  /**
   * Returns a new object of class '<em>Minimum</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Minimum</em>'.
   * @generated
   */
  Minimum createMinimum();

  /**
   * Returns a new object of class '<em>Min End</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Min End</em>'.
   * @generated
   */
  MinEnd createMinEnd();

  /**
   * Returns a new object of class '<em>Min Start</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Min Start</em>'.
   * @generated
   */
  MinStart createMinStart();

  /**
   * Returns a new object of class '<em>Monthly Max</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Monthly Max</em>'.
   * @generated
   */
  MonthlyMax createMonthlyMax();

  /**
   * Returns a new object of class '<em>Monthly Min</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Monthly Min</em>'.
   * @generated
   */
  MonthlyMin createMonthlyMin();

  /**
   * Returns a new object of class '<em>Note</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Note</em>'.
   * @generated
   */
  Note createNote();

  /**
   * Returns a new object of class '<em>Now</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Now</em>'.
   * @generated
   */
  Now createNow();

  /**
   * Returns a new object of class '<em>Number Format</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number Format</em>'.
   * @generated
   */
  NumberFormat createNumberFormat();

  /**
   * Returns a new object of class '<em>Period</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Period</em>'.
   * @generated
   */
  Period createPeriod();

  /**
   * Returns a new object of class '<em>Persistent</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Persistent</em>'.
   * @generated
   */
  Persistent createPersistent();

  /**
   * Returns a new object of class '<em>Precedes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Precedes</em>'.
   * @generated
   */
  Precedes createPrecedes();

  /**
   * Returns a new object of class '<em>Priority</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Priority</em>'.
   * @generated
   */
  Priority createPriority();

  /**
   * Returns a new object of class '<em>Id</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Id</em>'.
   * @generated
   */
  ProjectId createProjectId();

  /**
   * Returns a new object of class '<em>Ids</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ids</em>'.
   * @generated
   */
  ProjectIds createProjectIds();

  /**
   * Returns a new object of class '<em>Prolog</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Prolog</em>'.
   * @generated
   */
  Prolog createProlog();

  /**
   * Returns a new object of class '<em>Purge Report</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Purge Report</em>'.
   * @generated
   */
  PurgeReport createPurgeReport();

  /**
   * Returns a new object of class '<em>Purge Resource</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Purge Resource</em>'.
   * @generated
   */
  PurgeResource createPurgeResource();

  /**
   * Returns a new object of class '<em>Purge Task</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Purge Task</em>'.
   * @generated
   */
  PurgeTask createPurgeTask();

  /**
   * Returns a new object of class '<em>Rate</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rate</em>'.
   * @generated
   */
  Rate createRate();

  /**
   * Returns a new object of class '<em>Remaining</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Remaining</em>'.
   * @generated
   */
  Remaining createRemaining();

  /**
   * Returns a new object of class '<em>Report Prefix</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Report Prefix</em>'.
   * @generated
   */
  ReportPrefix createReportPrefix();

  /**
   * Returns a new object of class '<em>Resource Attributes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Resource Attributes</em>'.
   * @generated
   */
  ResourceAttributes createResourceAttributes();

  /**
   * Returns a new object of class '<em>Resource Prefix</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Resource Prefix</em>'.
   * @generated
   */
  ResourcePrefix createResourcePrefix();

  /**
   * Returns a new object of class '<em>Resource Report</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Resource Report</em>'.
   * @generated
   */
  ResourceReport createResourceReport();

  /**
   * Returns a new object of class '<em>Resource Root</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Resource Root</em>'.
   * @generated
   */
  ResourceRoot createResourceRoot();

  /**
   * Returns a new object of class '<em>Responsible</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Responsible</em>'.
   * @generated
   */
  Responsible createResponsible();

  /**
   * Returns a new object of class '<em>RGB</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>RGB</em>'.
   * @generated
   */
  RGB createRGB();

  /**
   * Returns a new object of class '<em>Right</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Right</em>'.
   * @generated
   */
  Right createRight();

  /**
   * Returns a new object of class '<em>Rollup Account</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rollup Account</em>'.
   * @generated
   */
  RollupAccount createRollupAccount();

  /**
   * Returns a new object of class '<em>Rollup Resource</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rollup Resource</em>'.
   * @generated
   */
  RollupResource createRollupResource();

  /**
   * Returns a new object of class '<em>Rollup Task</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rollup Task</em>'.
   * @generated
   */
  RollupTask createRollupTask();

  /**
   * Returns a new object of class '<em>Scale</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scale</em>'.
   * @generated
   */
  Scale createScale();

  /**
   * Returns a new object of class '<em>Scenario</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scenario</em>'.
   * @generated
   */
  Scenario createScenario();

  /**
   * Returns a new object of class '<em>Scenarios</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scenarios</em>'.
   * @generated
   */
  Scenarios createScenarios();

  /**
   * Returns a new object of class '<em>Scheduled</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scheduled</em>'.
   * @generated
   */
  Scheduled createScheduled();

  /**
   * Returns a new object of class '<em>Scheduling</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scheduling</em>'.
   * @generated
   */
  Scheduling createScheduling();

  /**
   * Returns a new object of class '<em>Select</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Select</em>'.
   * @generated
   */
  Select createSelect();

  /**
   * Returns a new object of class '<em>Self Contained</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Self Contained</em>'.
   * @generated
   */
  SelfContained createSelfContained();

  /**
   * Returns a new object of class '<em>Shift</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Shift</em>'.
   * @generated
   */
  Shift createShift();

  /**
   * Returns a new object of class '<em>Shift Timesheet</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Shift Timesheet</em>'.
   * @generated
   */
  ShiftTimesheet createShiftTimesheet();

  /**
   * Returns a new object of class '<em>Shifts</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Shifts</em>'.
   * @generated
   */
  Shifts createShifts();

  /**
   * Returns a new object of class '<em>Shifts Limit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Shifts Limit</em>'.
   * @generated
   */
  ShiftsLimit createShiftsLimit();

  /**
   * Returns a new object of class '<em>Shifts Allocate</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Shifts Allocate</em>'.
   * @generated
   */
  ShiftsAllocate createShiftsAllocate();

  /**
   * Returns a new object of class '<em>Shifts Resource</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Shifts Resource</em>'.
   * @generated
   */
  ShiftsResource createShiftsResource();

  /**
   * Returns a new object of class '<em>Shifts Task</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Shifts Task</em>'.
   * @generated
   */
  ShiftsTask createShiftsTask();

  /**
   * Returns a new object of class '<em>Short Time Format</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Short Time Format</em>'.
   * @generated
   */
  ShortTimeFormat createShortTimeFormat();

  /**
   * Returns a new object of class '<em>Sort</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sort</em>'.
   * @generated
   */
  Sort createSort();

  /**
   * Returns a new object of class '<em>Sort Accounts</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sort Accounts</em>'.
   * @generated
   */
  SortAccounts createSortAccounts();

  /**
   * Returns a new object of class '<em>Sort Journal Entries</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sort Journal Entries</em>'.
   * @generated
   */
  SortJournalEntries createSortJournalEntries();

  /**
   * Returns a new object of class '<em>Sort Resources</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sort Resources</em>'.
   * @generated
   */
  SortResources createSortResources();

  /**
   * Returns a new object of class '<em>Sort Tasks</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sort Tasks</em>'.
   * @generated
   */
  SortTasks createSortTasks();

  /**
   * Returns a new object of class '<em>Start</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Start</em>'.
   * @generated
   */
  Start createStart();

  /**
   * Returns a new object of class '<em>Status Status Sheet</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Status Status Sheet</em>'.
   * @generated
   */
  StatusStatusSheet createStatusStatusSheet();

  /**
   * Returns a new object of class '<em>Status Status Sheet Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Status Status Sheet Attribute</em>'.
   * @generated
   */
  StatusStatusSheetAttribute createStatusStatusSheetAttribute();

  /**
   * Returns a new object of class '<em>Status Timesheet</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Status Timesheet</em>'.
   * @generated
   */
  StatusTimesheet createStatusTimesheet();

  /**
   * Returns a new object of class '<em>Status Timesheet Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Status Timesheet Attribute</em>'.
   * @generated
   */
  StatusTimesheetAttribute createStatusTimesheetAttribute();

  /**
   * Returns a new object of class '<em>Status Sheet</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Status Sheet</em>'.
   * @generated
   */
  StatusSheet createStatusSheet();

  /**
   * Returns a new object of class '<em>Status Sheet Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Status Sheet Attribute</em>'.
   * @generated
   */
  StatusSheetAttribute createStatusSheetAttribute();

  /**
   * Returns a new object of class '<em>Status Sheet Report</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Status Sheet Report</em>'.
   * @generated
   */
  StatusSheetReport createStatusSheetReport();

  /**
   * Returns a new object of class '<em>Status Sheet Report Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Status Sheet Report Attribute</em>'.
   * @generated
   */
  StatusSheetReportAttribute createStatusSheetReportAttribute();

  /**
   * Returns a new object of class '<em>Summary</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Summary</em>'.
   * @generated
   */
  Summary createSummary();

  /**
   * Returns a new object of class '<em>Supplement Account</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Supplement Account</em>'.
   * @generated
   */
  SupplementAccount createSupplementAccount();

  /**
   * Returns a new object of class '<em>Supplement Report</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Supplement Report</em>'.
   * @generated
   */
  SupplementReport createSupplementReport();

  /**
   * Returns a new object of class '<em>Supplement Resource</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Supplement Resource</em>'.
   * @generated
   */
  SupplementResource createSupplementResource();

  /**
   * Returns a new object of class '<em>Supplement Task</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Supplement Task</em>'.
   * @generated
   */
  SupplementTask createSupplementTask();

  /**
   * Returns a new object of class '<em>Tag File</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tag File</em>'.
   * @generated
   */
  TagFile createTagFile();

  /**
   * Returns a new object of class '<em>Task Status Sheet</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Task Status Sheet</em>'.
   * @generated
   */
  TaskStatusSheet createTaskStatusSheet();

  /**
   * Returns a new object of class '<em>Task Status Sheet Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Task Status Sheet Attribute</em>'.
   * @generated
   */
  TaskStatusSheetAttribute createTaskStatusSheetAttribute();

  /**
   * Returns a new object of class '<em>Task Timesheet</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Task Timesheet</em>'.
   * @generated
   */
  TaskTimesheet createTaskTimesheet();

  /**
   * Returns a new object of class '<em>Task Timesheet Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Task Timesheet Attribute</em>'.
   * @generated
   */
  TaskTimesheetAttribute createTaskTimesheetAttribute();

  /**
   * Returns a new object of class '<em>Task Attributes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Task Attributes</em>'.
   * @generated
   */
  TaskAttributes createTaskAttributes();

  /**
   * Returns a new object of class '<em>Task Prefix</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Task Prefix</em>'.
   * @generated
   */
  TaskPrefix createTaskPrefix();

  /**
   * Returns a new object of class '<em>Task Report</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Task Report</em>'.
   * @generated
   */
  TaskReport createTaskReport();

  /**
   * Returns a new object of class '<em>Task Root</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Task Root</em>'.
   * @generated
   */
  TaskRoot createTaskRoot();

  /**
   * Returns a new object of class '<em>Text Report</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Text Report</em>'.
   * @generated
   */
  TextReport createTextReport();

  /**
   * Returns a new object of class '<em>Time Format</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Time Format</em>'.
   * @generated
   */
  TimeFormat createTimeFormat();

  /**
   * Returns a new object of class '<em>Timeoff</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Timeoff</em>'.
   * @generated
   */
  Timeoff createTimeoff();

  /**
   * Returns a new object of class '<em>Timesheet</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Timesheet</em>'.
   * @generated
   */
  Timesheet createTimesheet();

  /**
   * Returns a new object of class '<em>Timesheet Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Timesheet Attribute</em>'.
   * @generated
   */
  TimesheetAttribute createTimesheetAttribute();

  /**
   * Returns a new object of class '<em>Timesheet Report</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Timesheet Report</em>'.
   * @generated
   */
  TimesheetReport createTimesheetReport();

  /**
   * Returns a new object of class '<em>Timesheet Report Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Timesheet Report Attribute</em>'.
   * @generated
   */
  TimesheetReportAttribute createTimesheetReportAttribute();

  /**
   * Returns a new object of class '<em>Timezone</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Timezone</em>'.
   * @generated
   */
  Timezone createTimezone();

  /**
   * Returns a new object of class '<em>Timing Resolution</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Timing Resolution</em>'.
   * @generated
   */
  TimingResolution createTimingResolution();

  /**
   * Returns a new object of class '<em>Title</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Title</em>'.
   * @generated
   */
  Title createTitle();

  /**
   * Returns a new object of class '<em>Tool Tip</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tool Tip</em>'.
   * @generated
   */
  ToolTip createToolTip();

  /**
   * Returns a new object of class '<em>Tracking Scenario</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tracking Scenario</em>'.
   * @generated
   */
  TrackingScenario createTrackingScenario();

  /**
   * Returns a new object of class '<em>Tree Level</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tree Level</em>'.
   * @generated
   */
  TreeLevel createTreeLevel();

  /**
   * Returns a new object of class '<em>Vacation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Vacation</em>'.
   * @generated
   */
  Vacation createVacation();

  /**
   * Returns a new object of class '<em>Warn</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Warn</em>'.
   * @generated
   */
  Warn createWarn();

  /**
   * Returns a new object of class '<em>Week Starts</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Week Starts</em>'.
   * @generated
   */
  WeekStarts createWeekStarts();

  /**
   * Returns a new object of class '<em>Weekly Max</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Weekly Max</em>'.
   * @generated
   */
  WeeklyMax createWeeklyMax();

  /**
   * Returns a new object of class '<em>Weekly Min</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Weekly Min</em>'.
   * @generated
   */
  WeeklyMin createWeeklyMin();

  /**
   * Returns a new object of class '<em>Width</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Width</em>'.
   * @generated
   */
  Width createWidth();

  /**
   * Returns a new object of class '<em>Work</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Work</em>'.
   * @generated
   */
  Work createWork();

  /**
   * Returns a new object of class '<em>Working Hours</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Working Hours</em>'.
   * @generated
   */
  WorkingHours createWorkingHours();

  /**
   * Returns a new object of class '<em>Yearly Working Days</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Yearly Working Days</em>'.
   * @generated
   */
  YearlyWorkingDays createYearlyWorkingDays();

  /**
   * Returns a new object of class '<em>Account Share</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Account Share</em>'.
   * @generated
   */
  AccountShare createAccountShare();

  /**
   * Returns a new object of class '<em>Column Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Column Attribute</em>'.
   * @generated
   */
  ColumnAttribute createColumnAttribute();

  /**
   * Returns a new object of class '<em>Column</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Column</em>'.
   * @generated
   */
  Column createColumn();

  /**
   * Returns a new object of class '<em>Criterion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Criterion</em>'.
   * @generated
   */
  Criterion createCriterion();

  /**
   * Returns a new object of class '<em>Duration Quantity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Duration Quantity</em>'.
   * @generated
   */
  DurationQuantity createDurationQuantity();

  /**
   * Returns a new object of class '<em>Limit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Limit</em>'.
   * @generated
   */
  Limit createLimit();

  /**
   * Returns a new object of class '<em>Limit Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Limit Attribute</em>'.
   * @generated
   */
  LimitAttribute createLimitAttribute();

  /**
   * Returns a new object of class '<em>Real Format</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Real Format</em>'.
   * @generated
   */
  RealFormat createRealFormat();

  /**
   * Returns a new object of class '<em>Task Dependency</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Task Dependency</em>'.
   * @generated
   */
  TaskDependency createTaskDependency();

  /**
   * Returns a new object of class '<em>Rich Text</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rich Text</em>'.
   * @generated
   */
  RichText createRichText();

  /**
   * Returns a new object of class '<em>Work Hours</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Work Hours</em>'.
   * @generated
   */
  WorkHours createWorkHours();

  /**
   * Returns a new object of class '<em>Weekdays</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Weekdays</em>'.
   * @generated
   */
  Weekdays createWeekdays();

  /**
   * Returns a new object of class '<em>Defintions</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Defintions</em>'.
   * @generated
   */
  Defintions createDefintions();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ProjectPackage getProjectPackage();

} //ProjectFactory
