/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.jjflyboy.tjpeditor.project.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage
 * @generated
 */
public class ProjectSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ProjectPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProjectSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = ProjectPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case ProjectPackage.GLOBAL:
      {
        Global global = (Global)theEObject;
        T result = caseGlobal(global);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.GLOBAL_ATTRIBUTE:
      {
        GlobalAttribute globalAttribute = (GlobalAttribute)theEObject;
        T result = caseGlobalAttribute(globalAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.ACCOUNT:
      {
        Account account = (Account)theEObject;
        T result = caseAccount(account);
        if (result == null) result = caseGlobalAttribute(account);
        if (result == null) result = caseAccountAttribute(account);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.ACCOUNT_ATTRIBUTE:
      {
        AccountAttribute accountAttribute = (AccountAttribute)theEObject;
        T result = caseAccountAttribute(accountAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.ACCOUNT_REPORT:
      {
        AccountReport accountReport = (AccountReport)theEObject;
        T result = caseAccountReport(accountReport);
        if (result == null) result = caseGlobalAttribute(accountReport);
        if (result == null) result = caseReportAttribute(accountReport);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.ACCOUNT_ROOT:
      {
        AccountRoot accountRoot = (AccountRoot)theEObject;
        T result = caseAccountRoot(accountRoot);
        if (result == null) result = caseReportAttribute(accountRoot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.PROJECT:
      {
        Project project = (Project)theEObject;
        T result = caseProject(project);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.PROJECT_ATTRIBUTE:
      {
        ProjectAttribute projectAttribute = (ProjectAttribute)theEObject;
        T result = caseProjectAttribute(projectAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.TASK:
      {
        Task task = (Task)theEObject;
        T result = caseTask(task);
        if (result == null) result = caseGlobalAttribute(task);
        if (result == null) result = caseTaskAttribute(task);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.TASK_ATTRIBUTE:
      {
        TaskAttribute taskAttribute = (TaskAttribute)theEObject;
        T result = caseTaskAttribute(taskAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.REPORT:
      {
        Report report = (Report)theEObject;
        T result = caseReport(report);
        if (result == null) result = caseAccountReport(report);
        if (result == null) result = caseResourceReport(report);
        if (result == null) result = caseTaskReport(report);
        if (result == null) result = caseTextReport(report);
        if (result == null) result = caseGlobalAttribute(report);
        if (result == null) result = caseReportAttribute(report);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.REPORT_ATTRIBUTE:
      {
        ReportAttribute reportAttribute = (ReportAttribute)theEObject;
        T result = caseReportAttribute(reportAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.EXPORT:
      {
        Export export = (Export)theEObject;
        T result = caseExport(export);
        if (result == null) result = caseGlobalAttribute(export);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.EXPORT_ATTRIBUTE:
      {
        ExportAttribute exportAttribute = (ExportAttribute)theEObject;
        T result = caseExportAttribute(exportAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.RESOURCE:
      {
        Resource resource = (Resource)theEObject;
        T result = caseResource(resource);
        if (result == null) result = caseGlobalAttribute(resource);
        if (result == null) result = caseResourceAttribute(resource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.RESOURCE_ATTRIBUTE:
      {
        ResourceAttribute resourceAttribute = (ResourceAttribute)theEObject;
        T result = caseResourceAttribute(resourceAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.ALLOCATE:
      {
        Allocate allocate = (Allocate)theEObject;
        T result = caseAllocate(allocate);
        if (result == null) result = caseTaskAttribute(allocate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.ALLOCATE_RESOURCE:
      {
        AllocateResource allocateResource = (AllocateResource)theEObject;
        T result = caseAllocateResource(allocateResource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.ALLOCATE_RESOURCE_ATTRIBUTE:
      {
        AllocateResourceAttribute allocateResourceAttribute = (AllocateResourceAttribute)theEObject;
        T result = caseAllocateResourceAttribute(allocateResourceAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.NAVIGATOR:
      {
        Navigator navigator = (Navigator)theEObject;
        T result = caseNavigator(navigator);
        if (result == null) result = caseGlobalAttribute(navigator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.NAVIGATOR_ATTRIBUTE:
      {
        NavigatorAttribute navigatorAttribute = (NavigatorAttribute)theEObject;
        T result = caseNavigatorAttribute(navigatorAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.NEW_TASK:
      {
        NewTask newTask = (NewTask)theEObject;
        T result = caseNewTask(newTask);
        if (result == null) result = caseTimesheetAttribute(newTask);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.NEW_TASK_ATTRIBUTE:
      {
        NewTaskAttribute newTaskAttribute = (NewTaskAttribute)theEObject;
        T result = caseNewTaskAttribute(newTaskAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.NIKU_REPORT:
      {
        NikuReport nikuReport = (NikuReport)theEObject;
        T result = caseNikuReport(nikuReport);
        if (result == null) result = caseGlobalAttribute(nikuReport);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.NIKU_REPORT_ATTRIBUTE:
      {
        NikuReportAttribute nikuReportAttribute = (NikuReportAttribute)theEObject;
        T result = caseNikuReportAttribute(nikuReportAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.ALERT:
      {
        Alert alert = (Alert)theEObject;
        T result = caseAlert(alert);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.ALTERNATIVE:
      {
        Alternative alternative = (Alternative)theEObject;
        T result = caseAlternative(alternative);
        if (result == null) result = caseAllocateResourceAttribute(alternative);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.AUTHOR:
      {
        Author author = (Author)theEObject;
        T result = caseAuthor(author);
        if (result == null) result = caseStatusStatusSheetAttribute(author);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.BALANCE:
      {
        Balance balance = (Balance)theEObject;
        T result = caseBalance(balance);
        if (result == null) result = caseGlobalAttribute(balance);
        if (result == null) result = caseReportAttribute(balance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.BOOKING:
      {
        Booking booking = (Booking)theEObject;
        T result = caseBooking(booking);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.BOOKING_TASK:
      {
        BookingTask bookingTask = (BookingTask)theEObject;
        T result = caseBookingTask(bookingTask);
        if (result == null) result = caseTaskAttribute(bookingTask);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.BOOKING_RESOURCE:
      {
        BookingResource bookingResource = (BookingResource)theEObject;
        T result = caseBookingResource(bookingResource);
        if (result == null) result = caseResourceAttribute(bookingResource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.CAPTION:
      {
        Caption caption = (Caption)theEObject;
        T result = caseCaption(caption);
        if (result == null) result = caseReportAttribute(caption);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.CELL_COLOR:
      {
        CellColor cellColor = (CellColor)theEObject;
        T result = caseCellColor(cellColor);
        if (result == null) result = caseColumnAttribute(cellColor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.CELL_TEXT:
      {
        CellText cellText = (CellText)theEObject;
        T result = caseCellText(cellText);
        if (result == null) result = caseColumnAttribute(cellText);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.CENTER:
      {
        Center center = (Center)theEObject;
        T result = caseCenter(center);
        if (result == null) result = caseReportAttribute(center);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.CHARGE:
      {
        Charge charge = (Charge)theEObject;
        T result = caseCharge(charge);
        if (result == null) result = caseTaskAttribute(charge);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.CHARGE_SET:
      {
        ChargeSet chargeSet = (ChargeSet)theEObject;
        T result = caseChargeSet(chargeSet);
        if (result == null) result = caseTaskAttribute(chargeSet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.COLUMNS:
      {
        Columns columns = (Columns)theEObject;
        T result = caseColumns(columns);
        if (result == null) result = caseReportAttribute(columns);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.COMPLETE:
      {
        Complete complete = (Complete)theEObject;
        T result = caseComplete(complete);
        if (result == null) result = caseTaskAttribute(complete);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.COPYRIGHT:
      {
        Copyright copyright = (Copyright)theEObject;
        T result = caseCopyright(copyright);
        if (result == null) result = caseGlobalAttribute(copyright);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.CREDIT:
      {
        Credit credit = (Credit)theEObject;
        T result = caseCredit(credit);
        if (result == null) result = caseAccountAttribute(credit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.CURRENCY:
      {
        Currency currency = (Currency)theEObject;
        T result = caseCurrency(currency);
        if (result == null) result = caseProjectAttribute(currency);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.CURRENCY_FORMAT:
      {
        CurrencyFormat currencyFormat = (CurrencyFormat)theEObject;
        T result = caseCurrencyFormat(currencyFormat);
        if (result == null) result = caseProjectAttribute(currencyFormat);
        if (result == null) result = caseReportAttribute(currencyFormat);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.DAILY_MAX:
      {
        DailyMax dailyMax = (DailyMax)theEObject;
        T result = caseDailyMax(dailyMax);
        if (result == null) result = caseLimitsAttribute(dailyMax);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.DAILY_MIN:
      {
        DailyMin dailyMin = (DailyMin)theEObject;
        T result = caseDailyMin(dailyMin);
        if (result == null) result = caseLimitsAttribute(dailyMin);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.DAILY_WORKING_HOURS:
      {
        DailyWorkingHours dailyWorkingHours = (DailyWorkingHours)theEObject;
        T result = caseDailyWorkingHours(dailyWorkingHours);
        if (result == null) result = caseProjectAttribute(dailyWorkingHours);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.DEFINITIONS:
      {
        Definitions definitions = (Definitions)theEObject;
        T result = caseDefinitions(definitions);
        if (result == null) result = caseExportAttribute(definitions);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.DEPENDS:
      {
        Depends depends = (Depends)theEObject;
        T result = caseDepends(depends);
        if (result == null) result = caseTaskAttribute(depends);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.DETAILS:
      {
        Details details = (Details)theEObject;
        T result = caseDetails(details);
        if (result == null) result = caseStatusStatusSheetAttribute(details);
        if (result == null) result = caseStatusTimesheetAttribute(details);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.DURATION:
      {
        Duration duration = (Duration)theEObject;
        T result = caseDuration(duration);
        if (result == null) result = caseTaskAttribute(duration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.EFFICIENCY:
      {
        Efficiency efficiency = (Efficiency)theEObject;
        T result = caseEfficiency(efficiency);
        if (result == null) result = caseResourceAttribute(efficiency);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.EFFORT:
      {
        Effort effort = (Effort)theEObject;
        T result = caseEffort(effort);
        if (result == null) result = caseTaskAttribute(effort);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.EMAIL:
      {
        Email email = (Email)theEObject;
        T result = caseEmail(email);
        if (result == null) result = caseResourceAttribute(email);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.END:
      {
        End end = (End)theEObject;
        T result = caseEnd(end);
        if (result == null) result = caseTaskAttribute(end);
        if (result == null) result = caseReportAttribute(end);
        if (result == null) result = caseExportAttribute(end);
        if (result == null) result = caseNewTaskAttribute(end);
        if (result == null) result = caseNikuReportAttribute(end);
        if (result == null) result = caseStatusSheetReportAttribute(end);
        if (result == null) result = caseTaskTimesheetAttribute(end);
        if (result == null) result = caseTimesheetReportAttribute(end);
        if (result == null) result = caseColumnAttribute(end);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.END_CREDIT:
      {
        EndCredit endCredit = (EndCredit)theEObject;
        T result = caseEndCredit(endCredit);
        if (result == null) result = caseTaskAttribute(endCredit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.EPILOG:
      {
        Epilog epilog = (Epilog)theEObject;
        T result = caseEpilog(epilog);
        if (result == null) result = caseReportAttribute(epilog);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.EXTEND:
      {
        Extend extend = (Extend)theEObject;
        T result = caseExtend(extend);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.EXTEND_RESOURCE:
      {
        ExtendResource extendResource = (ExtendResource)theEObject;
        T result = caseExtendResource(extendResource);
        if (result == null) result = caseProjectAttribute(extendResource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.EXTENDED_RESOURCE_ATTRIBUTE:
      {
        ExtendedResourceAttribute extendedResourceAttribute = (ExtendedResourceAttribute)theEObject;
        T result = caseExtendedResourceAttribute(extendedResourceAttribute);
        if (result == null) result = caseResourceAttribute(extendedResourceAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.EXTEND_TASK:
      {
        ExtendTask extendTask = (ExtendTask)theEObject;
        T result = caseExtendTask(extendTask);
        if (result == null) result = caseProjectAttribute(extendTask);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.EXTENDED_TASK_ATTRIBUTE:
      {
        ExtendedTaskAttribute extendedTaskAttribute = (ExtendedTaskAttribute)theEObject;
        T result = caseExtendedTaskAttribute(extendedTaskAttribute);
        if (result == null) result = caseTaskAttribute(extendedTaskAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.FAIL:
      {
        Fail fail = (Fail)theEObject;
        T result = caseFail(fail);
        if (result == null) result = caseTaskAttribute(fail);
        if (result == null) result = caseResourceAttribute(fail);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.FLAGS:
      {
        Flags flags = (Flags)theEObject;
        T result = caseFlags(flags);
        if (result == null) result = caseGlobalAttribute(flags);
        if (result == null) result = caseAccountAttribute(flags);
        if (result == null) result = caseTaskAttribute(flags);
        if (result == null) result = caseReportAttribute(flags);
        if (result == null) result = caseResourceAttribute(flags);
        if (result == null) result = caseStatusStatusSheetAttribute(flags);
        if (result == null) result = caseStatusTimesheetAttribute(flags);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.FONT_COLOR:
      {
        FontColor fontColor = (FontColor)theEObject;
        T result = caseFontColor(fontColor);
        if (result == null) result = caseColumnAttribute(fontColor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.FOOTER:
      {
        Footer footer = (Footer)theEObject;
        T result = caseFooter(footer);
        if (result == null) result = caseReportAttribute(footer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.FORMATS:
      {
        Formats formats = (Formats)theEObject;
        T result = caseFormats(formats);
        if (result == null) result = caseReportAttribute(formats);
        if (result == null) result = caseNikuReportAttribute(formats);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.GAP_DURATION:
      {
        GapDuration gapDuration = (GapDuration)theEObject;
        T result = caseGapDuration(gapDuration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.GAP_LENGTH:
      {
        GapLength gapLength = (GapLength)theEObject;
        T result = caseGapLength(gapLength);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.HALIGN:
      {
        HAlign hAlign = (HAlign)theEObject;
        T result = caseHAlign(hAlign);
        if (result == null) result = caseColumnAttribute(hAlign);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.HEADER:
      {
        Header header = (Header)theEObject;
        T result = caseHeader(header);
        if (result == null) result = caseReportAttribute(header);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.HEADLINE:
      {
        Headline headline = (Headline)theEObject;
        T result = caseHeadline(headline);
        if (result == null) result = caseReportAttribute(headline);
        if (result == null) result = caseNikuReportAttribute(headline);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.HIDE_ACCOUNT:
      {
        HideAccount hideAccount = (HideAccount)theEObject;
        T result = caseHideAccount(hideAccount);
        if (result == null) result = caseReportAttribute(hideAccount);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.HIDE_JOURNAL_ENTRY:
      {
        HideJournalEntry hideJournalEntry = (HideJournalEntry)theEObject;
        T result = caseHideJournalEntry(hideJournalEntry);
        if (result == null) result = caseReportAttribute(hideJournalEntry);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.HIDE_REPORT:
      {
        HideReport hideReport = (HideReport)theEObject;
        T result = caseHideReport(hideReport);
        if (result == null) result = caseNavigatorAttribute(hideReport);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.HIDE_RESOURCE:
      {
        HideResource hideResource = (HideResource)theEObject;
        T result = caseHideResource(hideResource);
        if (result == null) result = caseReportAttribute(hideResource);
        if (result == null) result = caseExportAttribute(hideResource);
        if (result == null) result = caseNikuReportAttribute(hideResource);
        if (result == null) result = caseStatusSheetReportAttribute(hideResource);
        if (result == null) result = caseTimesheetReportAttribute(hideResource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.HIDE_TASK:
      {
        HideTask hideTask = (HideTask)theEObject;
        T result = caseHideTask(hideTask);
        if (result == null) result = caseReportAttribute(hideTask);
        if (result == null) result = caseExportAttribute(hideTask);
        if (result == null) result = caseNikuReportAttribute(hideTask);
        if (result == null) result = caseStatusSheetReportAttribute(hideTask);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.INCLUDE:
      {
        Include include = (Include)theEObject;
        T result = caseInclude(include);
        if (result == null) result = caseProjectAttribute(include);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.INTERVAL1:
      {
        Interval1 interval1 = (Interval1)theEObject;
        T result = caseInterval1(interval1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.INTERVAL2:
      {
        Interval2 interval2 = (Interval2)theEObject;
        T result = caseInterval2(interval2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.INTERVAL3:
      {
        Interval3 interval3 = (Interval3)theEObject;
        T result = caseInterval3(interval3);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.INTERVAL4:
      {
        Interval4 interval4 = (Interval4)theEObject;
        T result = caseInterval4(interval4);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.JOURNAL_ATTRIBUTES:
      {
        JournalAttributes journalAttributes = (JournalAttributes)theEObject;
        T result = caseJournalAttributes(journalAttributes);
        if (result == null) result = caseReportAttribute(journalAttributes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.JOURNAL_ENTRY:
      {
        JournalEntry journalEntry = (JournalEntry)theEObject;
        T result = caseJournalEntry(journalEntry);
        if (result == null) result = caseProjectAttribute(journalEntry);
        if (result == null) result = caseTaskAttribute(journalEntry);
        if (result == null) result = caseResourceAttribute(journalEntry);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.JOURNAL_MODE:
      {
        JournalMode journalMode = (JournalMode)theEObject;
        T result = caseJournalMode(journalMode);
        if (result == null) result = caseReportAttribute(journalMode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.LEFT:
      {
        Left left = (Left)theEObject;
        T result = caseLeft(left);
        if (result == null) result = caseReportAttribute(left);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.LENGTH:
      {
        Length length = (Length)theEObject;
        T result = caseLength(length);
        if (result == null) result = caseTaskAttribute(length);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.LIMITS:
      {
        Limits limits = (Limits)theEObject;
        T result = caseLimits(limits);
        if (result == null) result = caseGlobalAttribute(limits);
        if (result == null) result = caseTaskAttribute(limits);
        if (result == null) result = caseResourceAttribute(limits);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.LIMITS_ATTRIBUTE:
      {
        LimitsAttribute limitsAttribute = (LimitsAttribute)theEObject;
        T result = caseLimitsAttribute(limitsAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.LIST_ITEM:
      {
        ListItem listItem = (ListItem)theEObject;
        T result = caseListItem(listItem);
        if (result == null) result = caseColumnAttribute(listItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.LIST_TYPE:
      {
        ListType listType = (ListType)theEObject;
        T result = caseListType(listType);
        if (result == null) result = caseColumnAttribute(listType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.LOAD_UNIT:
      {
        LoadUnit loadUnit = (LoadUnit)theEObject;
        T result = caseLoadUnit(loadUnit);
        if (result == null) result = caseReportAttribute(loadUnit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.MACRO:
      {
        Macro macro = (Macro)theEObject;
        T result = caseMacro(macro);
        if (result == null) result = caseGlobalAttribute(macro);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.MANAGERS:
      {
        Managers managers = (Managers)theEObject;
        T result = caseManagers(managers);
        if (result == null) result = caseResourceAttribute(managers);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.MANDATORY:
      {
        Mandatory mandatory = (Mandatory)theEObject;
        T result = caseMandatory(mandatory);
        if (result == null) result = caseAllocateResourceAttribute(mandatory);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.MAX_END:
      {
        MaxEnd maxEnd = (MaxEnd)theEObject;
        T result = caseMaxEnd(maxEnd);
        if (result == null) result = caseTaskAttribute(maxEnd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.MAXIMUM:
      {
        Maximum maximum = (Maximum)theEObject;
        T result = caseMaximum(maximum);
        if (result == null) result = caseLimitsAttribute(maximum);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.MAX_START:
      {
        MaxStart maxStart = (MaxStart)theEObject;
        T result = caseMaxStart(maxStart);
        if (result == null) result = caseTaskAttribute(maxStart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.MILESTONE:
      {
        Milestone milestone = (Milestone)theEObject;
        T result = caseMilestone(milestone);
        if (result == null) result = caseTaskAttribute(milestone);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.MINIMUM:
      {
        Minimum minimum = (Minimum)theEObject;
        T result = caseMinimum(minimum);
        if (result == null) result = caseLimitsAttribute(minimum);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.MIN_END:
      {
        MinEnd minEnd = (MinEnd)theEObject;
        T result = caseMinEnd(minEnd);
        if (result == null) result = caseTaskAttribute(minEnd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.MIN_START:
      {
        MinStart minStart = (MinStart)theEObject;
        T result = caseMinStart(minStart);
        if (result == null) result = caseTaskAttribute(minStart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.MONTHLY_MAX:
      {
        MonthlyMax monthlyMax = (MonthlyMax)theEObject;
        T result = caseMonthlyMax(monthlyMax);
        if (result == null) result = caseLimitsAttribute(monthlyMax);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.MONTHLY_MIN:
      {
        MonthlyMin monthlyMin = (MonthlyMin)theEObject;
        T result = caseMonthlyMin(monthlyMin);
        if (result == null) result = caseLimitsAttribute(monthlyMin);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.NOTE:
      {
        Note note = (Note)theEObject;
        T result = caseNote(note);
        if (result == null) result = caseTaskAttribute(note);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.NOW:
      {
        Now now = (Now)theEObject;
        T result = caseNow(now);
        if (result == null) result = caseProjectAttribute(now);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.NUMBER_FORMAT:
      {
        NumberFormat numberFormat = (NumberFormat)theEObject;
        T result = caseNumberFormat(numberFormat);
        if (result == null) result = caseProjectAttribute(numberFormat);
        if (result == null) result = caseReportAttribute(numberFormat);
        if (result == null) result = caseNikuReportAttribute(numberFormat);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.PERIOD:
      {
        Period period = (Period)theEObject;
        T result = casePeriod(period);
        if (result == null) result = caseTaskAttribute(period);
        if (result == null) result = caseReportAttribute(period);
        if (result == null) result = caseExportAttribute(period);
        if (result == null) result = caseNikuReportAttribute(period);
        if (result == null) result = caseStatusSheetReportAttribute(period);
        if (result == null) result = caseTimesheetReportAttribute(period);
        if (result == null) result = caseColumnAttribute(period);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.PERSISTENT:
      {
        Persistent persistent = (Persistent)theEObject;
        T result = casePersistent(persistent);
        if (result == null) result = caseAllocateResourceAttribute(persistent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.PRECEDES:
      {
        Precedes precedes = (Precedes)theEObject;
        T result = casePrecedes(precedes);
        if (result == null) result = caseTaskAttribute(precedes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.PRIORITY:
      {
        Priority priority = (Priority)theEObject;
        T result = casePriority(priority);
        if (result == null) result = caseTaskAttribute(priority);
        if (result == null) result = caseNewTaskAttribute(priority);
        if (result == null) result = caseTaskTimesheetAttribute(priority);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.PROJECT_ID:
      {
        ProjectId projectId = (ProjectId)theEObject;
        T result = caseProjectId(projectId);
        if (result == null) result = caseTaskAttribute(projectId);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.PROJECT_IDS:
      {
        ProjectIds projectIds = (ProjectIds)theEObject;
        T result = caseProjectIds(projectIds);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.PROLOG:
      {
        Prolog prolog = (Prolog)theEObject;
        T result = caseProlog(prolog);
        if (result == null) result = caseReportAttribute(prolog);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.PURGE_REPORT:
      {
        PurgeReport purgeReport = (PurgeReport)theEObject;
        T result = casePurgeReport(purgeReport);
        if (result == null) result = caseReportAttribute(purgeReport);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.PURGE_RESOURCE:
      {
        PurgeResource purgeResource = (PurgeResource)theEObject;
        T result = casePurgeResource(purgeResource);
        if (result == null) result = caseResourceAttribute(purgeResource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.PURGE_TASK:
      {
        PurgeTask purgeTask = (PurgeTask)theEObject;
        T result = casePurgeTask(purgeTask);
        if (result == null) result = caseTaskAttribute(purgeTask);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.RATE:
      {
        Rate rate = (Rate)theEObject;
        T result = caseRate(rate);
        if (result == null) result = caseGlobalAttribute(rate);
        if (result == null) result = caseResourceAttribute(rate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.REMAINING:
      {
        Remaining remaining = (Remaining)theEObject;
        T result = caseRemaining(remaining);
        if (result == null) result = caseNewTaskAttribute(remaining);
        if (result == null) result = caseTaskTimesheetAttribute(remaining);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.REPORT_PREFIX:
      {
        ReportPrefix reportPrefix = (ReportPrefix)theEObject;
        T result = caseReportPrefix(reportPrefix);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.RESOURCE_ATTRIBUTES:
      {
        ResourceAttributes resourceAttributes = (ResourceAttributes)theEObject;
        T result = caseResourceAttributes(resourceAttributes);
        if (result == null) result = caseExportAttribute(resourceAttributes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.RESOURCE_PREFIX:
      {
        ResourcePrefix resourcePrefix = (ResourcePrefix)theEObject;
        T result = caseResourcePrefix(resourcePrefix);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.RESOURCE_REPORT:
      {
        ResourceReport resourceReport = (ResourceReport)theEObject;
        T result = caseResourceReport(resourceReport);
        if (result == null) result = caseGlobalAttribute(resourceReport);
        if (result == null) result = caseReportAttribute(resourceReport);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.RESOURCE_ROOT:
      {
        ResourceRoot resourceRoot = (ResourceRoot)theEObject;
        T result = caseResourceRoot(resourceRoot);
        if (result == null) result = caseReportAttribute(resourceRoot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.RESPONSIBLE:
      {
        Responsible responsible = (Responsible)theEObject;
        T result = caseResponsible(responsible);
        if (result == null) result = caseTaskAttribute(responsible);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.RGB:
      {
        RGB rgb = (RGB)theEObject;
        T result = caseRGB(rgb);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.RIGHT:
      {
        Right right = (Right)theEObject;
        T result = caseRight(right);
        if (result == null) result = caseReportAttribute(right);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.ROLLUP_ACCOUNT:
      {
        RollupAccount rollupAccount = (RollupAccount)theEObject;
        T result = caseRollupAccount(rollupAccount);
        if (result == null) result = caseReportAttribute(rollupAccount);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.ROLLUP_RESOURCE:
      {
        RollupResource rollupResource = (RollupResource)theEObject;
        T result = caseRollupResource(rollupResource);
        if (result == null) result = caseReportAttribute(rollupResource);
        if (result == null) result = caseExportAttribute(rollupResource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.ROLLUP_TASK:
      {
        RollupTask rollupTask = (RollupTask)theEObject;
        T result = caseRollupTask(rollupTask);
        if (result == null) result = caseReportAttribute(rollupTask);
        if (result == null) result = caseExportAttribute(rollupTask);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.SCALE:
      {
        Scale scale = (Scale)theEObject;
        T result = caseScale(scale);
        if (result == null) result = caseColumnAttribute(scale);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.SCENARIO:
      {
        Scenario scenario = (Scenario)theEObject;
        T result = caseScenario(scenario);
        if (result == null) result = caseProjectAttribute(scenario);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.SCENARIOS:
      {
        Scenarios scenarios = (Scenarios)theEObject;
        T result = caseScenarios(scenarios);
        if (result == null) result = caseReportAttribute(scenarios);
        if (result == null) result = caseExportAttribute(scenarios);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.SCHEDULED:
      {
        Scheduled scheduled = (Scheduled)theEObject;
        T result = caseScheduled(scheduled);
        if (result == null) result = caseTaskAttribute(scheduled);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.SCHEDULING:
      {
        Scheduling scheduling = (Scheduling)theEObject;
        T result = caseScheduling(scheduling);
        if (result == null) result = caseTaskAttribute(scheduling);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.SELECT:
      {
        Select select = (Select)theEObject;
        T result = caseSelect(select);
        if (result == null) result = caseAllocateResourceAttribute(select);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.SELF_CONTAINED:
      {
        SelfContained selfContained = (SelfContained)theEObject;
        T result = caseSelfContained(selfContained);
        if (result == null) result = caseReportAttribute(selfContained);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.SHIFT:
      {
        Shift shift = (Shift)theEObject;
        T result = caseShift(shift);
        if (result == null) result = caseGlobalAttribute(shift);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.SHIFT_TIMESHEET:
      {
        ShiftTimesheet shiftTimesheet = (ShiftTimesheet)theEObject;
        T result = caseShiftTimesheet(shiftTimesheet);
        if (result == null) result = caseTimesheetAttribute(shiftTimesheet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.SHIFTS:
      {
        Shifts shifts = (Shifts)theEObject;
        T result = caseShifts(shifts);
        if (result == null) result = caseShiftsResource(shifts);
        if (result == null) result = caseShiftsTask(shifts);
        if (result == null) result = caseResourceAttribute(shifts);
        if (result == null) result = caseTaskAttribute(shifts);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.SHIFTS_LIMIT:
      {
        ShiftsLimit shiftsLimit = (ShiftsLimit)theEObject;
        T result = caseShiftsLimit(shiftsLimit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.SHIFTS_ALLOCATE:
      {
        ShiftsAllocate shiftsAllocate = (ShiftsAllocate)theEObject;
        T result = caseShiftsAllocate(shiftsAllocate);
        if (result == null) result = caseAllocateResourceAttribute(shiftsAllocate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.SHIFTS_RESOURCE:
      {
        ShiftsResource shiftsResource = (ShiftsResource)theEObject;
        T result = caseShiftsResource(shiftsResource);
        if (result == null) result = caseResourceAttribute(shiftsResource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.SHIFTS_TASK:
      {
        ShiftsTask shiftsTask = (ShiftsTask)theEObject;
        T result = caseShiftsTask(shiftsTask);
        if (result == null) result = caseTaskAttribute(shiftsTask);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.SHORT_TIME_FORMAT:
      {
        ShortTimeFormat shortTimeFormat = (ShortTimeFormat)theEObject;
        T result = caseShortTimeFormat(shortTimeFormat);
        if (result == null) result = caseProjectAttribute(shortTimeFormat);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.SORT:
      {
        Sort sort = (Sort)theEObject;
        T result = caseSort(sort);
        if (result == null) result = caseSortAccounts(sort);
        if (result == null) result = caseSortJournalEntries(sort);
        if (result == null) result = caseSortResources(sort);
        if (result == null) result = caseSortTasks(sort);
        if (result == null) result = caseReportAttribute(sort);
        if (result == null) result = caseStatusSheetReportAttribute(sort);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.SORT_ACCOUNTS:
      {
        SortAccounts sortAccounts = (SortAccounts)theEObject;
        T result = caseSortAccounts(sortAccounts);
        if (result == null) result = caseReportAttribute(sortAccounts);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.SORT_JOURNAL_ENTRIES:
      {
        SortJournalEntries sortJournalEntries = (SortJournalEntries)theEObject;
        T result = caseSortJournalEntries(sortJournalEntries);
        if (result == null) result = caseReportAttribute(sortJournalEntries);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.SORT_RESOURCES:
      {
        SortResources sortResources = (SortResources)theEObject;
        T result = caseSortResources(sortResources);
        if (result == null) result = caseReportAttribute(sortResources);
        if (result == null) result = caseStatusSheetReportAttribute(sortResources);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.SORT_TASKS:
      {
        SortTasks sortTasks = (SortTasks)theEObject;
        T result = caseSortTasks(sortTasks);
        if (result == null) result = caseReportAttribute(sortTasks);
        if (result == null) result = caseStatusSheetReportAttribute(sortTasks);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.START:
      {
        Start start = (Start)theEObject;
        T result = caseStart(start);
        if (result == null) result = caseTaskAttribute(start);
        if (result == null) result = caseReportAttribute(start);
        if (result == null) result = caseExportAttribute(start);
        if (result == null) result = caseNikuReportAttribute(start);
        if (result == null) result = caseStatusSheetReportAttribute(start);
        if (result == null) result = caseTimesheetReportAttribute(start);
        if (result == null) result = caseColumnAttribute(start);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.STATUS_STATUS_SHEET:
      {
        StatusStatusSheet statusStatusSheet = (StatusStatusSheet)theEObject;
        T result = caseStatusStatusSheet(statusStatusSheet);
        if (result == null) result = caseTaskStatusSheetAttribute(statusStatusSheet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.STATUS_STATUS_SHEET_ATTRIBUTE:
      {
        StatusStatusSheetAttribute statusStatusSheetAttribute = (StatusStatusSheetAttribute)theEObject;
        T result = caseStatusStatusSheetAttribute(statusStatusSheetAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.STATUS_TIMESHEET:
      {
        StatusTimesheet statusTimesheet = (StatusTimesheet)theEObject;
        T result = caseStatusTimesheet(statusTimesheet);
        if (result == null) result = caseTaskTimesheetAttribute(statusTimesheet);
        if (result == null) result = caseTimesheetAttribute(statusTimesheet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.STATUS_TIMESHEET_ATTRIBUTE:
      {
        StatusTimesheetAttribute statusTimesheetAttribute = (StatusTimesheetAttribute)theEObject;
        T result = caseStatusTimesheetAttribute(statusTimesheetAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.STATUS_SHEET:
      {
        StatusSheet statusSheet = (StatusSheet)theEObject;
        T result = caseStatusSheet(statusSheet);
        if (result == null) result = caseGlobalAttribute(statusSheet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.STATUS_SHEET_ATTRIBUTE:
      {
        StatusSheetAttribute statusSheetAttribute = (StatusSheetAttribute)theEObject;
        T result = caseStatusSheetAttribute(statusSheetAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.STATUS_SHEET_REPORT:
      {
        StatusSheetReport statusSheetReport = (StatusSheetReport)theEObject;
        T result = caseStatusSheetReport(statusSheetReport);
        if (result == null) result = caseGlobalAttribute(statusSheetReport);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.STATUS_SHEET_REPORT_ATTRIBUTE:
      {
        StatusSheetReportAttribute statusSheetReportAttribute = (StatusSheetReportAttribute)theEObject;
        T result = caseStatusSheetReportAttribute(statusSheetReportAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.SUMMARY:
      {
        Summary summary = (Summary)theEObject;
        T result = caseSummary(summary);
        if (result == null) result = caseStatusStatusSheetAttribute(summary);
        if (result == null) result = caseStatusTimesheetAttribute(summary);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.SUPPLEMENT_ACCOUNT:
      {
        SupplementAccount supplementAccount = (SupplementAccount)theEObject;
        T result = caseSupplementAccount(supplementAccount);
        if (result == null) result = caseGlobalAttribute(supplementAccount);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.SUPPLEMENT_REPORT:
      {
        SupplementReport supplementReport = (SupplementReport)theEObject;
        T result = caseSupplementReport(supplementReport);
        if (result == null) result = caseGlobalAttribute(supplementReport);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.SUPPLEMENT_RESOURCE:
      {
        SupplementResource supplementResource = (SupplementResource)theEObject;
        T result = caseSupplementResource(supplementResource);
        if (result == null) result = caseGlobalAttribute(supplementResource);
        if (result == null) result = caseResourceAttribute(supplementResource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.SUPPLEMENT_TASK:
      {
        SupplementTask supplementTask = (SupplementTask)theEObject;
        T result = caseSupplementTask(supplementTask);
        if (result == null) result = caseGlobalAttribute(supplementTask);
        if (result == null) result = caseTaskAttribute(supplementTask);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.TAG_FILE:
      {
        TagFile tagFile = (TagFile)theEObject;
        T result = caseTagFile(tagFile);
        if (result == null) result = caseGlobalAttribute(tagFile);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.TASK_STATUS_SHEET:
      {
        TaskStatusSheet taskStatusSheet = (TaskStatusSheet)theEObject;
        T result = caseTaskStatusSheet(taskStatusSheet);
        if (result == null) result = caseStatusSheetAttribute(taskStatusSheet);
        if (result == null) result = caseTaskStatusSheetAttribute(taskStatusSheet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.TASK_STATUS_SHEET_ATTRIBUTE:
      {
        TaskStatusSheetAttribute taskStatusSheetAttribute = (TaskStatusSheetAttribute)theEObject;
        T result = caseTaskStatusSheetAttribute(taskStatusSheetAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.TASK_TIMESHEET:
      {
        TaskTimesheet taskTimesheet = (TaskTimesheet)theEObject;
        T result = caseTaskTimesheet(taskTimesheet);
        if (result == null) result = caseTimesheetAttribute(taskTimesheet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.TASK_TIMESHEET_ATTRIBUTE:
      {
        TaskTimesheetAttribute taskTimesheetAttribute = (TaskTimesheetAttribute)theEObject;
        T result = caseTaskTimesheetAttribute(taskTimesheetAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.TASK_ATTRIBUTES:
      {
        TaskAttributes taskAttributes = (TaskAttributes)theEObject;
        T result = caseTaskAttributes(taskAttributes);
        if (result == null) result = caseExportAttribute(taskAttributes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.TASK_PREFIX:
      {
        TaskPrefix taskPrefix = (TaskPrefix)theEObject;
        T result = caseTaskPrefix(taskPrefix);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.TASK_REPORT:
      {
        TaskReport taskReport = (TaskReport)theEObject;
        T result = caseTaskReport(taskReport);
        if (result == null) result = caseGlobalAttribute(taskReport);
        if (result == null) result = caseReportAttribute(taskReport);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.TASK_ROOT:
      {
        TaskRoot taskRoot = (TaskRoot)theEObject;
        T result = caseTaskRoot(taskRoot);
        if (result == null) result = caseReportAttribute(taskRoot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.TEXT_REPORT:
      {
        TextReport textReport = (TextReport)theEObject;
        T result = caseTextReport(textReport);
        if (result == null) result = caseGlobalAttribute(textReport);
        if (result == null) result = caseReportAttribute(textReport);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.TIME_FORMAT:
      {
        TimeFormat timeFormat = (TimeFormat)theEObject;
        T result = caseTimeFormat(timeFormat);
        if (result == null) result = caseReportAttribute(timeFormat);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.TIMEOFF:
      {
        Timeoff timeoff = (Timeoff)theEObject;
        T result = caseTimeoff(timeoff);
        if (result == null) result = caseNikuReportAttribute(timeoff);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.TIMESHEET:
      {
        Timesheet timesheet = (Timesheet)theEObject;
        T result = caseTimesheet(timesheet);
        if (result == null) result = caseGlobalAttribute(timesheet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.TIMESHEET_ATTRIBUTE:
      {
        TimesheetAttribute timesheetAttribute = (TimesheetAttribute)theEObject;
        T result = caseTimesheetAttribute(timesheetAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.TIMESHEET_REPORT:
      {
        TimesheetReport timesheetReport = (TimesheetReport)theEObject;
        T result = caseTimesheetReport(timesheetReport);
        if (result == null) result = caseGlobalAttribute(timesheetReport);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.TIMESHEET_REPORT_ATTRIBUTE:
      {
        TimesheetReportAttribute timesheetReportAttribute = (TimesheetReportAttribute)theEObject;
        T result = caseTimesheetReportAttribute(timesheetReportAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.TIMEZONE:
      {
        Timezone timezone = (Timezone)theEObject;
        T result = caseTimezone(timezone);
        if (result == null) result = caseProjectAttribute(timezone);
        if (result == null) result = caseReportAttribute(timezone);
        if (result == null) result = caseExportAttribute(timezone);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.TIMING_RESOLUTION:
      {
        TimingResolution timingResolution = (TimingResolution)theEObject;
        T result = caseTimingResolution(timingResolution);
        if (result == null) result = caseProjectAttribute(timingResolution);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.TITLE:
      {
        Title title = (Title)theEObject;
        T result = caseTitle(title);
        if (result == null) result = caseReportAttribute(title);
        if (result == null) result = caseNikuReportAttribute(title);
        if (result == null) result = caseColumnAttribute(title);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.TOOL_TIP:
      {
        ToolTip toolTip = (ToolTip)theEObject;
        T result = caseToolTip(toolTip);
        if (result == null) result = caseColumnAttribute(toolTip);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.TRACKING_SCENARIO:
      {
        TrackingScenario trackingScenario = (TrackingScenario)theEObject;
        T result = caseTrackingScenario(trackingScenario);
        if (result == null) result = caseGlobalAttribute(trackingScenario);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.TREE_LEVEL:
      {
        TreeLevel treeLevel = (TreeLevel)theEObject;
        T result = caseTreeLevel(treeLevel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.VACATION:
      {
        Vacation vacation = (Vacation)theEObject;
        T result = caseVacation(vacation);
        if (result == null) result = caseGlobalAttribute(vacation);
        if (result == null) result = caseResourceAttribute(vacation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.WARN:
      {
        Warn warn = (Warn)theEObject;
        T result = caseWarn(warn);
        if (result == null) result = caseTaskAttribute(warn);
        if (result == null) result = caseResourceAttribute(warn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.WEEK_STARTS:
      {
        WeekStarts weekStarts = (WeekStarts)theEObject;
        T result = caseWeekStarts(weekStarts);
        if (result == null) result = caseProjectAttribute(weekStarts);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.WEEKLY_MAX:
      {
        WeeklyMax weeklyMax = (WeeklyMax)theEObject;
        T result = caseWeeklyMax(weeklyMax);
        if (result == null) result = caseLimitsAttribute(weeklyMax);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.WEEKLY_MIN:
      {
        WeeklyMin weeklyMin = (WeeklyMin)theEObject;
        T result = caseWeeklyMin(weeklyMin);
        if (result == null) result = caseLimitsAttribute(weeklyMin);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.WIDTH:
      {
        Width width = (Width)theEObject;
        T result = caseWidth(width);
        if (result == null) result = caseColumnAttribute(width);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.WORK:
      {
        Work work = (Work)theEObject;
        T result = caseWork(work);
        if (result == null) result = caseNewTaskAttribute(work);
        if (result == null) result = caseTaskTimesheetAttribute(work);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.WORKING_HOURS:
      {
        WorkingHours workingHours = (WorkingHours)theEObject;
        T result = caseWorkingHours(workingHours);
        if (result == null) result = caseProjectAttribute(workingHours);
        if (result == null) result = caseResourceAttribute(workingHours);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.YEARLY_WORKING_DAYS:
      {
        YearlyWorkingDays yearlyWorkingDays = (YearlyWorkingDays)theEObject;
        T result = caseYearlyWorkingDays(yearlyWorkingDays);
        if (result == null) result = caseProjectAttribute(yearlyWorkingDays);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.ACCOUNT_SHARE:
      {
        AccountShare accountShare = (AccountShare)theEObject;
        T result = caseAccountShare(accountShare);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.COLUMN_ATTRIBUTE:
      {
        ColumnAttribute columnAttribute = (ColumnAttribute)theEObject;
        T result = caseColumnAttribute(columnAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.COLUMN:
      {
        Column column = (Column)theEObject;
        T result = caseColumn(column);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.CRITERION:
      {
        Criterion criterion = (Criterion)theEObject;
        T result = caseCriterion(criterion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.DURATION_QUANTITY:
      {
        DurationQuantity durationQuantity = (DurationQuantity)theEObject;
        T result = caseDurationQuantity(durationQuantity);
        if (result == null) result = caseGapDuration(durationQuantity);
        if (result == null) result = caseGapLength(durationQuantity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.LIMIT:
      {
        Limit limit = (Limit)theEObject;
        T result = caseLimit(limit);
        if (result == null) result = caseDailyMax(limit);
        if (result == null) result = caseDailyMin(limit);
        if (result == null) result = caseMaximum(limit);
        if (result == null) result = caseMinimum(limit);
        if (result == null) result = caseMonthlyMax(limit);
        if (result == null) result = caseMonthlyMin(limit);
        if (result == null) result = caseWeeklyMax(limit);
        if (result == null) result = caseWeeklyMin(limit);
        if (result == null) result = caseLimitsAttribute(limit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.LIMIT_ATTRIBUTE:
      {
        LimitAttribute limitAttribute = (LimitAttribute)theEObject;
        T result = caseLimitAttribute(limitAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.REAL_FORMAT:
      {
        RealFormat realFormat = (RealFormat)theEObject;
        T result = caseRealFormat(realFormat);
        if (result == null) result = caseCurrencyFormat(realFormat);
        if (result == null) result = caseNumberFormat(realFormat);
        if (result == null) result = caseProjectAttribute(realFormat);
        if (result == null) result = caseReportAttribute(realFormat);
        if (result == null) result = caseNikuReportAttribute(realFormat);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.TASK_DEPENDENCY:
      {
        TaskDependency taskDependency = (TaskDependency)theEObject;
        T result = caseTaskDependency(taskDependency);
        if (result == null) result = caseDepends(taskDependency);
        if (result == null) result = casePrecedes(taskDependency);
        if (result == null) result = caseTaskAttribute(taskDependency);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.RICH_TEXT:
      {
        RichText richText = (RichText)theEObject;
        T result = caseRichText(richText);
        if (result == null) result = caseCaption(richText);
        if (result == null) result = caseCenter(richText);
        if (result == null) result = caseDetails(richText);
        if (result == null) result = caseEpilog(richText);
        if (result == null) result = caseFooter(richText);
        if (result == null) result = caseHeader(richText);
        if (result == null) result = caseHeadline(richText);
        if (result == null) result = caseLeft(richText);
        if (result == null) result = caseListItem(richText);
        if (result == null) result = caseProlog(richText);
        if (result == null) result = caseRight(richText);
        if (result == null) result = caseSummary(richText);
        if (result == null) result = caseReportAttribute(richText);
        if (result == null) result = caseStatusStatusSheetAttribute(richText);
        if (result == null) result = caseStatusTimesheetAttribute(richText);
        if (result == null) result = caseNikuReportAttribute(richText);
        if (result == null) result = caseColumnAttribute(richText);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.WORK_HOURS:
      {
        WorkHours workHours = (WorkHours)theEObject;
        T result = caseWorkHours(workHours);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.WEEKDAYS:
      {
        Weekdays weekdays = (Weekdays)theEObject;
        T result = caseWeekdays(weekdays);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProjectPackage.DEFINTIONS:
      {
        Defintions defintions = (Defintions)theEObject;
        T result = caseDefintions(defintions);
        if (result == null) result = caseDefinitions(defintions);
        if (result == null) result = caseExportAttribute(defintions);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Global</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Global</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGlobal(Global object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Global Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Global Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGlobalAttribute(GlobalAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Account</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Account</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAccount(Account object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Account Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Account Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAccountAttribute(AccountAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Account Report</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Account Report</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAccountReport(AccountReport object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Account Root</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Account Root</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAccountRoot(AccountRoot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Project</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Project</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProject(Project object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProjectAttribute(ProjectAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Task</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTask(Task object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Task Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Task Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTaskAttribute(TaskAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Report</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Report</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReport(Report object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Report Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Report Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReportAttribute(ReportAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Export</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Export</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExport(Export object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Export Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Export Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExportAttribute(ExportAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResource(Resource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Resource Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Resource Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResourceAttribute(ResourceAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Allocate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Allocate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAllocate(Allocate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Allocate Resource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Allocate Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAllocateResource(AllocateResource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Allocate Resource Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Allocate Resource Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAllocateResourceAttribute(AllocateResourceAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Navigator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Navigator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNavigator(Navigator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Navigator Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Navigator Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNavigatorAttribute(NavigatorAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>New Task</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>New Task</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNewTask(NewTask object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>New Task Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>New Task Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNewTaskAttribute(NewTaskAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Niku Report</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Niku Report</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNikuReport(NikuReport object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Niku Report Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Niku Report Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNikuReportAttribute(NikuReportAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Alert</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Alert</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlert(Alert object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Alternative</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Alternative</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlternative(Alternative object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Author</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Author</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAuthor(Author object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Balance</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Balance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBalance(Balance object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Booking</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Booking</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooking(Booking object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Booking Task</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Booking Task</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBookingTask(BookingTask object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Booking Resource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Booking Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBookingResource(BookingResource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Caption</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Caption</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCaption(Caption object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cell Color</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cell Color</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCellColor(CellColor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cell Text</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cell Text</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCellText(CellText object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Center</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Center</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCenter(Center object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Charge</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Charge</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCharge(Charge object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Charge Set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Charge Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChargeSet(ChargeSet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Columns</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Columns</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColumns(Columns object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Complete</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Complete</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComplete(Complete object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Copyright</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Copyright</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCopyright(Copyright object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Credit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Credit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCredit(Credit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Currency</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Currency</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCurrency(Currency object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Currency Format</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Currency Format</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCurrencyFormat(CurrencyFormat object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Daily Max</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Daily Max</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDailyMax(DailyMax object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Daily Min</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Daily Min</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDailyMin(DailyMin object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Daily Working Hours</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Daily Working Hours</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDailyWorkingHours(DailyWorkingHours object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Definitions</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Definitions</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefinitions(Definitions object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Depends</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Depends</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDepends(Depends object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Details</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Details</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDetails(Details object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Duration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Duration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDuration(Duration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Efficiency</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Efficiency</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEfficiency(Efficiency object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Effort</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Effort</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEffort(Effort object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Email</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Email</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEmail(Email object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>End</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>End</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnd(End object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>End Credit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>End Credit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEndCredit(EndCredit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Epilog</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Epilog</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEpilog(Epilog object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Extend</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Extend</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExtend(Extend object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Extend Resource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Extend Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExtendResource(ExtendResource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Extended Resource Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Extended Resource Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExtendedResourceAttribute(ExtendedResourceAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Extend Task</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Extend Task</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExtendTask(ExtendTask object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Extended Task Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Extended Task Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExtendedTaskAttribute(ExtendedTaskAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fail</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fail</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFail(Fail object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Flags</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Flags</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFlags(Flags object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Font Color</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Font Color</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFontColor(FontColor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Footer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Footer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFooter(Footer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Formats</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Formats</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFormats(Formats object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Gap Duration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Gap Duration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGapDuration(GapDuration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Gap Length</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Gap Length</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGapLength(GapLength object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>HAlign</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>HAlign</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHAlign(HAlign object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Header</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Header</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHeader(Header object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Headline</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Headline</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHeadline(Headline object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Hide Account</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Hide Account</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHideAccount(HideAccount object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Hide Journal Entry</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Hide Journal Entry</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHideJournalEntry(HideJournalEntry object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Hide Report</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Hide Report</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHideReport(HideReport object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Hide Resource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Hide Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHideResource(HideResource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Hide Task</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Hide Task</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHideTask(HideTask object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Include</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Include</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInclude(Include object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interval1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interval1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterval1(Interval1 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interval2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interval2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterval2(Interval2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interval3</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interval3</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterval3(Interval3 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interval4</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interval4</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterval4(Interval4 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Journal Attributes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Journal Attributes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJournalAttributes(JournalAttributes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Journal Entry</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Journal Entry</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJournalEntry(JournalEntry object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Journal Mode</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Journal Mode</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJournalMode(JournalMode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Left</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Left</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLeft(Left object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Length</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Length</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLength(Length object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Limits</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Limits</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLimits(Limits object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Limits Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Limits Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLimitsAttribute(LimitsAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseListItem(ListItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseListType(ListType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Load Unit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Load Unit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLoadUnit(LoadUnit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Macro</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Macro</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMacro(Macro object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Managers</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Managers</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseManagers(Managers object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mandatory</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mandatory</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMandatory(Mandatory object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Max End</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Max End</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMaxEnd(MaxEnd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Maximum</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Maximum</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMaximum(Maximum object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Max Start</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Max Start</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMaxStart(MaxStart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Milestone</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Milestone</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMilestone(Milestone object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Minimum</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Minimum</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMinimum(Minimum object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Min End</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Min End</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMinEnd(MinEnd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Min Start</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Min Start</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMinStart(MinStart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Monthly Max</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Monthly Max</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMonthlyMax(MonthlyMax object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Monthly Min</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Monthly Min</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMonthlyMin(MonthlyMin object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Note</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Note</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNote(Note object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Now</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Now</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNow(Now object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number Format</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number Format</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumberFormat(NumberFormat object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Period</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Period</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePeriod(Period object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Persistent</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Persistent</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePersistent(Persistent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Precedes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Precedes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrecedes(Precedes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Priority</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Priority</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePriority(Priority object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Id</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Id</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProjectId(ProjectId object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ids</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ids</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProjectIds(ProjectIds object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Prolog</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Prolog</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProlog(Prolog object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Purge Report</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Purge Report</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePurgeReport(PurgeReport object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Purge Resource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Purge Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePurgeResource(PurgeResource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Purge Task</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Purge Task</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePurgeTask(PurgeTask object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRate(Rate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Remaining</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Remaining</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRemaining(Remaining object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Report Prefix</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Report Prefix</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReportPrefix(ReportPrefix object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Resource Attributes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Resource Attributes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResourceAttributes(ResourceAttributes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Resource Prefix</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Resource Prefix</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResourcePrefix(ResourcePrefix object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Resource Report</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Resource Report</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResourceReport(ResourceReport object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Resource Root</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Resource Root</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResourceRoot(ResourceRoot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Responsible</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Responsible</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResponsible(Responsible object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>RGB</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>RGB</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRGB(RGB object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Right</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Right</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRight(Right object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rollup Account</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rollup Account</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRollupAccount(RollupAccount object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rollup Resource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rollup Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRollupResource(RollupResource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rollup Task</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rollup Task</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRollupTask(RollupTask object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scale</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scale</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScale(Scale object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scenario</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scenario</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScenario(Scenario object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scenarios</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scenarios</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScenarios(Scenarios object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scheduled</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scheduled</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScheduled(Scheduled object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scheduling</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scheduling</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScheduling(Scheduling object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Select</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Select</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelect(Select object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Self Contained</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Self Contained</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelfContained(SelfContained object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Shift</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Shift</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseShift(Shift object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Shift Timesheet</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Shift Timesheet</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseShiftTimesheet(ShiftTimesheet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Shifts</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Shifts</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseShifts(Shifts object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Shifts Limit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Shifts Limit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseShiftsLimit(ShiftsLimit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Shifts Allocate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Shifts Allocate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseShiftsAllocate(ShiftsAllocate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Shifts Resource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Shifts Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseShiftsResource(ShiftsResource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Shifts Task</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Shifts Task</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseShiftsTask(ShiftsTask object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Short Time Format</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Short Time Format</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseShortTimeFormat(ShortTimeFormat object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sort</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sort</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSort(Sort object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sort Accounts</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sort Accounts</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSortAccounts(SortAccounts object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sort Journal Entries</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sort Journal Entries</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSortJournalEntries(SortJournalEntries object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sort Resources</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sort Resources</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSortResources(SortResources object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sort Tasks</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sort Tasks</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSortTasks(SortTasks object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Start</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Start</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStart(Start object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Status Status Sheet</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Status Status Sheet</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatusStatusSheet(StatusStatusSheet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Status Status Sheet Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Status Status Sheet Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatusStatusSheetAttribute(StatusStatusSheetAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Status Timesheet</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Status Timesheet</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatusTimesheet(StatusTimesheet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Status Timesheet Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Status Timesheet Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatusTimesheetAttribute(StatusTimesheetAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Status Sheet</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Status Sheet</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatusSheet(StatusSheet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Status Sheet Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Status Sheet Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatusSheetAttribute(StatusSheetAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Status Sheet Report</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Status Sheet Report</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatusSheetReport(StatusSheetReport object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Status Sheet Report Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Status Sheet Report Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatusSheetReportAttribute(StatusSheetReportAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Summary</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Summary</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSummary(Summary object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Supplement Account</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Supplement Account</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSupplementAccount(SupplementAccount object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Supplement Report</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Supplement Report</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSupplementReport(SupplementReport object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Supplement Resource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Supplement Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSupplementResource(SupplementResource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Supplement Task</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Supplement Task</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSupplementTask(SupplementTask object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tag File</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tag File</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTagFile(TagFile object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Task Status Sheet</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Task Status Sheet</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTaskStatusSheet(TaskStatusSheet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Task Status Sheet Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Task Status Sheet Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTaskStatusSheetAttribute(TaskStatusSheetAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Task Timesheet</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Task Timesheet</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTaskTimesheet(TaskTimesheet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Task Timesheet Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Task Timesheet Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTaskTimesheetAttribute(TaskTimesheetAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Task Attributes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Task Attributes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTaskAttributes(TaskAttributes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Task Prefix</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Task Prefix</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTaskPrefix(TaskPrefix object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Task Report</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Task Report</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTaskReport(TaskReport object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Task Root</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Task Root</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTaskRoot(TaskRoot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Text Report</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Text Report</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTextReport(TextReport object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Time Format</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Time Format</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTimeFormat(TimeFormat object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Timeoff</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Timeoff</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTimeoff(Timeoff object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Timesheet</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Timesheet</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTimesheet(Timesheet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Timesheet Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Timesheet Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTimesheetAttribute(TimesheetAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Timesheet Report</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Timesheet Report</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTimesheetReport(TimesheetReport object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Timesheet Report Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Timesheet Report Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTimesheetReportAttribute(TimesheetReportAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Timezone</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Timezone</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTimezone(Timezone object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Timing Resolution</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Timing Resolution</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTimingResolution(TimingResolution object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Title</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Title</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTitle(Title object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tool Tip</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tool Tip</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseToolTip(ToolTip object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tracking Scenario</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tracking Scenario</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTrackingScenario(TrackingScenario object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tree Level</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tree Level</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTreeLevel(TreeLevel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Vacation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Vacation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVacation(Vacation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Warn</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Warn</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWarn(Warn object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Week Starts</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Week Starts</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWeekStarts(WeekStarts object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Weekly Max</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Weekly Max</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWeeklyMax(WeeklyMax object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Weekly Min</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Weekly Min</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWeeklyMin(WeeklyMin object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Width</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Width</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWidth(Width object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Work</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Work</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWork(Work object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Working Hours</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Working Hours</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWorkingHours(WorkingHours object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Yearly Working Days</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Yearly Working Days</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseYearlyWorkingDays(YearlyWorkingDays object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Account Share</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Account Share</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAccountShare(AccountShare object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Column Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Column Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColumnAttribute(ColumnAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Column</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Column</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColumn(Column object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Criterion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Criterion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCriterion(Criterion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Duration Quantity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Duration Quantity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDurationQuantity(DurationQuantity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Limit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Limit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLimit(Limit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Limit Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Limit Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLimitAttribute(LimitAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Real Format</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Real Format</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRealFormat(RealFormat object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Task Dependency</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Task Dependency</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTaskDependency(TaskDependency object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rich Text</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rich Text</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRichText(RichText object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Work Hours</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Work Hours</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWorkHours(WorkHours object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Weekdays</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Weekdays</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWeekdays(Weekdays object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Defintions</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Defintions</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefintions(Defintions object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //ProjectSwitch
