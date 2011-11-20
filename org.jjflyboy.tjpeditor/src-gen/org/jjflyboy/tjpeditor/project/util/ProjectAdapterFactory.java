/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.jjflyboy.tjpeditor.project.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage
 * @generated
 */
public class ProjectAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ProjectPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProjectAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = ProjectPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProjectSwitch<Adapter> modelSwitch =
    new ProjectSwitch<Adapter>()
    {
      @Override
      public Adapter caseGlobal(Global object)
      {
        return createGlobalAdapter();
      }
      @Override
      public Adapter caseGlobalAttribute(GlobalAttribute object)
      {
        return createGlobalAttributeAdapter();
      }
      @Override
      public Adapter caseAccount(Account object)
      {
        return createAccountAdapter();
      }
      @Override
      public Adapter caseAccountAttribute(AccountAttribute object)
      {
        return createAccountAttributeAdapter();
      }
      @Override
      public Adapter caseAccountReport(AccountReport object)
      {
        return createAccountReportAdapter();
      }
      @Override
      public Adapter caseAccountRoot(AccountRoot object)
      {
        return createAccountRootAdapter();
      }
      @Override
      public Adapter caseProject(Project object)
      {
        return createProjectAdapter();
      }
      @Override
      public Adapter caseProjectAttribute(ProjectAttribute object)
      {
        return createProjectAttributeAdapter();
      }
      @Override
      public Adapter caseTask(Task object)
      {
        return createTaskAdapter();
      }
      @Override
      public Adapter caseTaskAttribute(TaskAttribute object)
      {
        return createTaskAttributeAdapter();
      }
      @Override
      public Adapter caseReport(Report object)
      {
        return createReportAdapter();
      }
      @Override
      public Adapter caseReportAttribute(ReportAttribute object)
      {
        return createReportAttributeAdapter();
      }
      @Override
      public Adapter caseExport(Export object)
      {
        return createExportAdapter();
      }
      @Override
      public Adapter caseExportAttribute(ExportAttribute object)
      {
        return createExportAttributeAdapter();
      }
      @Override
      public Adapter caseResource(Resource object)
      {
        return createResourceAdapter();
      }
      @Override
      public Adapter caseResourceAttribute(ResourceAttribute object)
      {
        return createResourceAttributeAdapter();
      }
      @Override
      public Adapter caseAllocate(Allocate object)
      {
        return createAllocateAdapter();
      }
      @Override
      public Adapter caseAllocateResource(AllocateResource object)
      {
        return createAllocateResourceAdapter();
      }
      @Override
      public Adapter caseAllocateResourceAttribute(AllocateResourceAttribute object)
      {
        return createAllocateResourceAttributeAdapter();
      }
      @Override
      public Adapter caseNavigator(Navigator object)
      {
        return createNavigatorAdapter();
      }
      @Override
      public Adapter caseNavigatorAttribute(NavigatorAttribute object)
      {
        return createNavigatorAttributeAdapter();
      }
      @Override
      public Adapter caseNewTask(NewTask object)
      {
        return createNewTaskAdapter();
      }
      @Override
      public Adapter caseNewTaskAttribute(NewTaskAttribute object)
      {
        return createNewTaskAttributeAdapter();
      }
      @Override
      public Adapter caseNikuReport(NikuReport object)
      {
        return createNikuReportAdapter();
      }
      @Override
      public Adapter caseNikuReportAttribute(NikuReportAttribute object)
      {
        return createNikuReportAttributeAdapter();
      }
      @Override
      public Adapter caseAlert(Alert object)
      {
        return createAlertAdapter();
      }
      @Override
      public Adapter caseAlternative(Alternative object)
      {
        return createAlternativeAdapter();
      }
      @Override
      public Adapter caseAuthor(Author object)
      {
        return createAuthorAdapter();
      }
      @Override
      public Adapter caseBalance(Balance object)
      {
        return createBalanceAdapter();
      }
      @Override
      public Adapter caseBooking(Booking object)
      {
        return createBookingAdapter();
      }
      @Override
      public Adapter caseBookingTask(BookingTask object)
      {
        return createBookingTaskAdapter();
      }
      @Override
      public Adapter caseBookingResource(BookingResource object)
      {
        return createBookingResourceAdapter();
      }
      @Override
      public Adapter caseCaption(Caption object)
      {
        return createCaptionAdapter();
      }
      @Override
      public Adapter caseCellColor(CellColor object)
      {
        return createCellColorAdapter();
      }
      @Override
      public Adapter caseCellText(CellText object)
      {
        return createCellTextAdapter();
      }
      @Override
      public Adapter caseCenter(Center object)
      {
        return createCenterAdapter();
      }
      @Override
      public Adapter caseCharge(Charge object)
      {
        return createChargeAdapter();
      }
      @Override
      public Adapter caseChargeSet(ChargeSet object)
      {
        return createChargeSetAdapter();
      }
      @Override
      public Adapter caseColumns(Columns object)
      {
        return createColumnsAdapter();
      }
      @Override
      public Adapter caseComplete(Complete object)
      {
        return createCompleteAdapter();
      }
      @Override
      public Adapter caseCopyright(Copyright object)
      {
        return createCopyrightAdapter();
      }
      @Override
      public Adapter caseCredit(Credit object)
      {
        return createCreditAdapter();
      }
      @Override
      public Adapter caseCurrency(Currency object)
      {
        return createCurrencyAdapter();
      }
      @Override
      public Adapter caseCurrencyFormat(CurrencyFormat object)
      {
        return createCurrencyFormatAdapter();
      }
      @Override
      public Adapter caseDailyMax(DailyMax object)
      {
        return createDailyMaxAdapter();
      }
      @Override
      public Adapter caseDailyMin(DailyMin object)
      {
        return createDailyMinAdapter();
      }
      @Override
      public Adapter caseDailyWorkingHours(DailyWorkingHours object)
      {
        return createDailyWorkingHoursAdapter();
      }
      @Override
      public Adapter caseDefinitions(Definitions object)
      {
        return createDefinitionsAdapter();
      }
      @Override
      public Adapter caseDepends(Depends object)
      {
        return createDependsAdapter();
      }
      @Override
      public Adapter caseDetails(Details object)
      {
        return createDetailsAdapter();
      }
      @Override
      public Adapter caseDuration(Duration object)
      {
        return createDurationAdapter();
      }
      @Override
      public Adapter caseEfficiency(Efficiency object)
      {
        return createEfficiencyAdapter();
      }
      @Override
      public Adapter caseEffort(Effort object)
      {
        return createEffortAdapter();
      }
      @Override
      public Adapter caseEmail(Email object)
      {
        return createEmailAdapter();
      }
      @Override
      public Adapter caseEnd(End object)
      {
        return createEndAdapter();
      }
      @Override
      public Adapter caseEndCredit(EndCredit object)
      {
        return createEndCreditAdapter();
      }
      @Override
      public Adapter caseEpilog(Epilog object)
      {
        return createEpilogAdapter();
      }
      @Override
      public Adapter caseExtend(Extend object)
      {
        return createExtendAdapter();
      }
      @Override
      public Adapter caseExtendResource(ExtendResource object)
      {
        return createExtendResourceAdapter();
      }
      @Override
      public Adapter caseExtendedResourceAttribute(ExtendedResourceAttribute object)
      {
        return createExtendedResourceAttributeAdapter();
      }
      @Override
      public Adapter caseExtendTask(ExtendTask object)
      {
        return createExtendTaskAdapter();
      }
      @Override
      public Adapter caseExtendedTaskAttribute(ExtendedTaskAttribute object)
      {
        return createExtendedTaskAttributeAdapter();
      }
      @Override
      public Adapter caseFail(Fail object)
      {
        return createFailAdapter();
      }
      @Override
      public Adapter caseFlags(Flags object)
      {
        return createFlagsAdapter();
      }
      @Override
      public Adapter caseFontColor(FontColor object)
      {
        return createFontColorAdapter();
      }
      @Override
      public Adapter caseFooter(Footer object)
      {
        return createFooterAdapter();
      }
      @Override
      public Adapter caseFormats(Formats object)
      {
        return createFormatsAdapter();
      }
      @Override
      public Adapter caseGapDuration(GapDuration object)
      {
        return createGapDurationAdapter();
      }
      @Override
      public Adapter caseGapLength(GapLength object)
      {
        return createGapLengthAdapter();
      }
      @Override
      public Adapter caseHAlign(HAlign object)
      {
        return createHAlignAdapter();
      }
      @Override
      public Adapter caseHeader(Header object)
      {
        return createHeaderAdapter();
      }
      @Override
      public Adapter caseHeadline(Headline object)
      {
        return createHeadlineAdapter();
      }
      @Override
      public Adapter caseHideAccount(HideAccount object)
      {
        return createHideAccountAdapter();
      }
      @Override
      public Adapter caseHideJournalEntry(HideJournalEntry object)
      {
        return createHideJournalEntryAdapter();
      }
      @Override
      public Adapter caseHideReport(HideReport object)
      {
        return createHideReportAdapter();
      }
      @Override
      public Adapter caseHideResource(HideResource object)
      {
        return createHideResourceAdapter();
      }
      @Override
      public Adapter caseHideTask(HideTask object)
      {
        return createHideTaskAdapter();
      }
      @Override
      public Adapter caseInclude(Include object)
      {
        return createIncludeAdapter();
      }
      @Override
      public Adapter caseInterval1(Interval1 object)
      {
        return createInterval1Adapter();
      }
      @Override
      public Adapter caseInterval2(Interval2 object)
      {
        return createInterval2Adapter();
      }
      @Override
      public Adapter caseInterval3(Interval3 object)
      {
        return createInterval3Adapter();
      }
      @Override
      public Adapter caseInterval4(Interval4 object)
      {
        return createInterval4Adapter();
      }
      @Override
      public Adapter caseJournalAttributes(JournalAttributes object)
      {
        return createJournalAttributesAdapter();
      }
      @Override
      public Adapter caseJournalEntry(JournalEntry object)
      {
        return createJournalEntryAdapter();
      }
      @Override
      public Adapter caseJournalMode(JournalMode object)
      {
        return createJournalModeAdapter();
      }
      @Override
      public Adapter caseLeft(Left object)
      {
        return createLeftAdapter();
      }
      @Override
      public Adapter caseLength(Length object)
      {
        return createLengthAdapter();
      }
      @Override
      public Adapter caseLimits(Limits object)
      {
        return createLimitsAdapter();
      }
      @Override
      public Adapter caseLimitsAttribute(LimitsAttribute object)
      {
        return createLimitsAttributeAdapter();
      }
      @Override
      public Adapter caseListItem(ListItem object)
      {
        return createListItemAdapter();
      }
      @Override
      public Adapter caseListType(ListType object)
      {
        return createListTypeAdapter();
      }
      @Override
      public Adapter caseLoadUnit(LoadUnit object)
      {
        return createLoadUnitAdapter();
      }
      @Override
      public Adapter caseMacro(Macro object)
      {
        return createMacroAdapter();
      }
      @Override
      public Adapter caseManagers(Managers object)
      {
        return createManagersAdapter();
      }
      @Override
      public Adapter caseMandatory(Mandatory object)
      {
        return createMandatoryAdapter();
      }
      @Override
      public Adapter caseMaxEnd(MaxEnd object)
      {
        return createMaxEndAdapter();
      }
      @Override
      public Adapter caseMaximum(Maximum object)
      {
        return createMaximumAdapter();
      }
      @Override
      public Adapter caseMaxStart(MaxStart object)
      {
        return createMaxStartAdapter();
      }
      @Override
      public Adapter caseMilestone(Milestone object)
      {
        return createMilestoneAdapter();
      }
      @Override
      public Adapter caseMinimum(Minimum object)
      {
        return createMinimumAdapter();
      }
      @Override
      public Adapter caseMinEnd(MinEnd object)
      {
        return createMinEndAdapter();
      }
      @Override
      public Adapter caseMinStart(MinStart object)
      {
        return createMinStartAdapter();
      }
      @Override
      public Adapter caseMonthlyMax(MonthlyMax object)
      {
        return createMonthlyMaxAdapter();
      }
      @Override
      public Adapter caseMonthlyMin(MonthlyMin object)
      {
        return createMonthlyMinAdapter();
      }
      @Override
      public Adapter caseNote(Note object)
      {
        return createNoteAdapter();
      }
      @Override
      public Adapter caseNow(Now object)
      {
        return createNowAdapter();
      }
      @Override
      public Adapter caseNumberFormat(NumberFormat object)
      {
        return createNumberFormatAdapter();
      }
      @Override
      public Adapter casePeriod(Period object)
      {
        return createPeriodAdapter();
      }
      @Override
      public Adapter casePersistent(Persistent object)
      {
        return createPersistentAdapter();
      }
      @Override
      public Adapter casePrecedes(Precedes object)
      {
        return createPrecedesAdapter();
      }
      @Override
      public Adapter casePriority(Priority object)
      {
        return createPriorityAdapter();
      }
      @Override
      public Adapter caseProjectId(ProjectId object)
      {
        return createProjectIdAdapter();
      }
      @Override
      public Adapter caseProjectIds(ProjectIds object)
      {
        return createProjectIdsAdapter();
      }
      @Override
      public Adapter caseProlog(Prolog object)
      {
        return createPrologAdapter();
      }
      @Override
      public Adapter casePurgeReport(PurgeReport object)
      {
        return createPurgeReportAdapter();
      }
      @Override
      public Adapter casePurgeResource(PurgeResource object)
      {
        return createPurgeResourceAdapter();
      }
      @Override
      public Adapter casePurgeTask(PurgeTask object)
      {
        return createPurgeTaskAdapter();
      }
      @Override
      public Adapter caseRate(Rate object)
      {
        return createRateAdapter();
      }
      @Override
      public Adapter caseRemaining(Remaining object)
      {
        return createRemainingAdapter();
      }
      @Override
      public Adapter caseReportPrefix(ReportPrefix object)
      {
        return createReportPrefixAdapter();
      }
      @Override
      public Adapter caseResourceAttributes(ResourceAttributes object)
      {
        return createResourceAttributesAdapter();
      }
      @Override
      public Adapter caseResourcePrefix(ResourcePrefix object)
      {
        return createResourcePrefixAdapter();
      }
      @Override
      public Adapter caseResourceReport(ResourceReport object)
      {
        return createResourceReportAdapter();
      }
      @Override
      public Adapter caseResourceRoot(ResourceRoot object)
      {
        return createResourceRootAdapter();
      }
      @Override
      public Adapter caseResponsible(Responsible object)
      {
        return createResponsibleAdapter();
      }
      @Override
      public Adapter caseRGB(RGB object)
      {
        return createRGBAdapter();
      }
      @Override
      public Adapter caseRight(Right object)
      {
        return createRightAdapter();
      }
      @Override
      public Adapter caseRollupAccount(RollupAccount object)
      {
        return createRollupAccountAdapter();
      }
      @Override
      public Adapter caseRollupResource(RollupResource object)
      {
        return createRollupResourceAdapter();
      }
      @Override
      public Adapter caseRollupTask(RollupTask object)
      {
        return createRollupTaskAdapter();
      }
      @Override
      public Adapter caseScale(Scale object)
      {
        return createScaleAdapter();
      }
      @Override
      public Adapter caseScenario(Scenario object)
      {
        return createScenarioAdapter();
      }
      @Override
      public Adapter caseScenarios(Scenarios object)
      {
        return createScenariosAdapter();
      }
      @Override
      public Adapter caseScheduled(Scheduled object)
      {
        return createScheduledAdapter();
      }
      @Override
      public Adapter caseScheduling(Scheduling object)
      {
        return createSchedulingAdapter();
      }
      @Override
      public Adapter caseSelect(Select object)
      {
        return createSelectAdapter();
      }
      @Override
      public Adapter caseSelfContained(SelfContained object)
      {
        return createSelfContainedAdapter();
      }
      @Override
      public Adapter caseShift(Shift object)
      {
        return createShiftAdapter();
      }
      @Override
      public Adapter caseShiftTimesheet(ShiftTimesheet object)
      {
        return createShiftTimesheetAdapter();
      }
      @Override
      public Adapter caseShifts(Shifts object)
      {
        return createShiftsAdapter();
      }
      @Override
      public Adapter caseShiftsLimit(ShiftsLimit object)
      {
        return createShiftsLimitAdapter();
      }
      @Override
      public Adapter caseShiftsAllocate(ShiftsAllocate object)
      {
        return createShiftsAllocateAdapter();
      }
      @Override
      public Adapter caseShiftsResource(ShiftsResource object)
      {
        return createShiftsResourceAdapter();
      }
      @Override
      public Adapter caseShiftsTask(ShiftsTask object)
      {
        return createShiftsTaskAdapter();
      }
      @Override
      public Adapter caseShortTimeFormat(ShortTimeFormat object)
      {
        return createShortTimeFormatAdapter();
      }
      @Override
      public Adapter caseSort(Sort object)
      {
        return createSortAdapter();
      }
      @Override
      public Adapter caseSortAccounts(SortAccounts object)
      {
        return createSortAccountsAdapter();
      }
      @Override
      public Adapter caseSortJournalEntries(SortJournalEntries object)
      {
        return createSortJournalEntriesAdapter();
      }
      @Override
      public Adapter caseSortResources(SortResources object)
      {
        return createSortResourcesAdapter();
      }
      @Override
      public Adapter caseSortTasks(SortTasks object)
      {
        return createSortTasksAdapter();
      }
      @Override
      public Adapter caseStart(Start object)
      {
        return createStartAdapter();
      }
      @Override
      public Adapter caseStatusStatusSheet(StatusStatusSheet object)
      {
        return createStatusStatusSheetAdapter();
      }
      @Override
      public Adapter caseStatusStatusSheetAttribute(StatusStatusSheetAttribute object)
      {
        return createStatusStatusSheetAttributeAdapter();
      }
      @Override
      public Adapter caseStatusSheet(StatusSheet object)
      {
        return createStatusSheetAdapter();
      }
      @Override
      public Adapter caseStatusSheetAttribute(StatusSheetAttribute object)
      {
        return createStatusSheetAttributeAdapter();
      }
      @Override
      public Adapter caseStatusSheetReport(StatusSheetReport object)
      {
        return createStatusSheetReportAdapter();
      }
      @Override
      public Adapter caseStatusSheetReportAttribute(StatusSheetReportAttribute object)
      {
        return createStatusSheetReportAttributeAdapter();
      }
      @Override
      public Adapter caseSummary(Summary object)
      {
        return createSummaryAdapter();
      }
      @Override
      public Adapter caseSupplementAccount(SupplementAccount object)
      {
        return createSupplementAccountAdapter();
      }
      @Override
      public Adapter caseSupplementReport(SupplementReport object)
      {
        return createSupplementReportAdapter();
      }
      @Override
      public Adapter caseSupplementResource(SupplementResource object)
      {
        return createSupplementResourceAdapter();
      }
      @Override
      public Adapter caseSupplementTask(SupplementTask object)
      {
        return createSupplementTaskAdapter();
      }
      @Override
      public Adapter caseTagFile(TagFile object)
      {
        return createTagFileAdapter();
      }
      @Override
      public Adapter caseTaskStatusSheet(TaskStatusSheet object)
      {
        return createTaskStatusSheetAdapter();
      }
      @Override
      public Adapter caseTaskStatusSheetAttribute(TaskStatusSheetAttribute object)
      {
        return createTaskStatusSheetAttributeAdapter();
      }
      @Override
      public Adapter caseTaskTimesheet(TaskTimesheet object)
      {
        return createTaskTimesheetAdapter();
      }
      @Override
      public Adapter caseTaskAttributes(TaskAttributes object)
      {
        return createTaskAttributesAdapter();
      }
      @Override
      public Adapter caseTaskPrefix(TaskPrefix object)
      {
        return createTaskPrefixAdapter();
      }
      @Override
      public Adapter caseTaskReport(TaskReport object)
      {
        return createTaskReportAdapter();
      }
      @Override
      public Adapter caseTaskRoot(TaskRoot object)
      {
        return createTaskRootAdapter();
      }
      @Override
      public Adapter caseTextReport(TextReport object)
      {
        return createTextReportAdapter();
      }
      @Override
      public Adapter caseTimeFormat(TimeFormat object)
      {
        return createTimeFormatAdapter();
      }
      @Override
      public Adapter caseTimeoff(Timeoff object)
      {
        return createTimeoffAdapter();
      }
      @Override
      public Adapter caseTimesheet(Timesheet object)
      {
        return createTimesheetAdapter();
      }
      @Override
      public Adapter caseTimesheetReport(TimesheetReport object)
      {
        return createTimesheetReportAdapter();
      }
      @Override
      public Adapter caseTimezone(Timezone object)
      {
        return createTimezoneAdapter();
      }
      @Override
      public Adapter caseTimingResolution(TimingResolution object)
      {
        return createTimingResolutionAdapter();
      }
      @Override
      public Adapter caseTitle(Title object)
      {
        return createTitleAdapter();
      }
      @Override
      public Adapter caseToolTip(ToolTip object)
      {
        return createToolTipAdapter();
      }
      @Override
      public Adapter caseTrackingScenario(TrackingScenario object)
      {
        return createTrackingScenarioAdapter();
      }
      @Override
      public Adapter caseTreeLevel(TreeLevel object)
      {
        return createTreeLevelAdapter();
      }
      @Override
      public Adapter caseVacation(Vacation object)
      {
        return createVacationAdapter();
      }
      @Override
      public Adapter caseWarn(Warn object)
      {
        return createWarnAdapter();
      }
      @Override
      public Adapter caseWeekStarts(WeekStarts object)
      {
        return createWeekStartsAdapter();
      }
      @Override
      public Adapter caseWeeklyMax(WeeklyMax object)
      {
        return createWeeklyMaxAdapter();
      }
      @Override
      public Adapter caseWeeklyMin(WeeklyMin object)
      {
        return createWeeklyMinAdapter();
      }
      @Override
      public Adapter caseWidth(Width object)
      {
        return createWidthAdapter();
      }
      @Override
      public Adapter caseWork(Work object)
      {
        return createWorkAdapter();
      }
      @Override
      public Adapter caseWorkingHours(WorkingHours object)
      {
        return createWorkingHoursAdapter();
      }
      @Override
      public Adapter caseYearlyWorkingDays(YearlyWorkingDays object)
      {
        return createYearlyWorkingDaysAdapter();
      }
      @Override
      public Adapter caseAccountShare(AccountShare object)
      {
        return createAccountShareAdapter();
      }
      @Override
      public Adapter caseColumnAttribute(ColumnAttribute object)
      {
        return createColumnAttributeAdapter();
      }
      @Override
      public Adapter caseColumn(Column object)
      {
        return createColumnAdapter();
      }
      @Override
      public Adapter caseCriterion(Criterion object)
      {
        return createCriterionAdapter();
      }
      @Override
      public Adapter caseDurationQuantity(DurationQuantity object)
      {
        return createDurationQuantityAdapter();
      }
      @Override
      public Adapter caseLimit(Limit object)
      {
        return createLimitAdapter();
      }
      @Override
      public Adapter caseLimitAttribute(LimitAttribute object)
      {
        return createLimitAttributeAdapter();
      }
      @Override
      public Adapter caseRealFormat(RealFormat object)
      {
        return createRealFormatAdapter();
      }
      @Override
      public Adapter caseTaskDependency(TaskDependency object)
      {
        return createTaskDependencyAdapter();
      }
      @Override
      public Adapter caseTaskTimesheetAttribute(TaskTimesheetAttribute object)
      {
        return createTaskTimesheetAttributeAdapter();
      }
      @Override
      public Adapter caseTimesheetAttribute(TimesheetAttribute object)
      {
        return createTimesheetAttributeAdapter();
      }
      @Override
      public Adapter caseTimesheetReportAttribute(TimesheetReportAttribute object)
      {
        return createTimesheetReportAttributeAdapter();
      }
      @Override
      public Adapter caseRichText(RichText object)
      {
        return createRichTextAdapter();
      }
      @Override
      public Adapter caseWorkHours(WorkHours object)
      {
        return createWorkHoursAdapter();
      }
      @Override
      public Adapter caseWeekdays(Weekdays object)
      {
        return createWeekdaysAdapter();
      }
      @Override
      public Adapter caseDefintions(Defintions object)
      {
        return createDefintionsAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Global <em>Global</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Global
   * @generated
   */
  public Adapter createGlobalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.GlobalAttribute <em>Global Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.GlobalAttribute
   * @generated
   */
  public Adapter createGlobalAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Account <em>Account</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Account
   * @generated
   */
  public Adapter createAccountAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.AccountAttribute <em>Account Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.AccountAttribute
   * @generated
   */
  public Adapter createAccountAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.AccountReport <em>Account Report</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.AccountReport
   * @generated
   */
  public Adapter createAccountReportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.AccountRoot <em>Account Root</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.AccountRoot
   * @generated
   */
  public Adapter createAccountRootAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Project <em>Project</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Project
   * @generated
   */
  public Adapter createProjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.ProjectAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.ProjectAttribute
   * @generated
   */
  public Adapter createProjectAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Task <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Task
   * @generated
   */
  public Adapter createTaskAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.TaskAttribute <em>Task Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.TaskAttribute
   * @generated
   */
  public Adapter createTaskAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Report <em>Report</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Report
   * @generated
   */
  public Adapter createReportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.ReportAttribute <em>Report Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.ReportAttribute
   * @generated
   */
  public Adapter createReportAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Export <em>Export</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Export
   * @generated
   */
  public Adapter createExportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.ExportAttribute <em>Export Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.ExportAttribute
   * @generated
   */
  public Adapter createExportAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Resource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Resource
   * @generated
   */
  public Adapter createResourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.ResourceAttribute <em>Resource Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.ResourceAttribute
   * @generated
   */
  public Adapter createResourceAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Allocate <em>Allocate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Allocate
   * @generated
   */
  public Adapter createAllocateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.AllocateResource <em>Allocate Resource</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.AllocateResource
   * @generated
   */
  public Adapter createAllocateResourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.AllocateResourceAttribute <em>Allocate Resource Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.AllocateResourceAttribute
   * @generated
   */
  public Adapter createAllocateResourceAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Navigator <em>Navigator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Navigator
   * @generated
   */
  public Adapter createNavigatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.NavigatorAttribute <em>Navigator Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.NavigatorAttribute
   * @generated
   */
  public Adapter createNavigatorAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.NewTask <em>New Task</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.NewTask
   * @generated
   */
  public Adapter createNewTaskAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.NewTaskAttribute <em>New Task Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.NewTaskAttribute
   * @generated
   */
  public Adapter createNewTaskAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.NikuReport <em>Niku Report</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.NikuReport
   * @generated
   */
  public Adapter createNikuReportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.NikuReportAttribute <em>Niku Report Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.NikuReportAttribute
   * @generated
   */
  public Adapter createNikuReportAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Alert <em>Alert</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Alert
   * @generated
   */
  public Adapter createAlertAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Alternative <em>Alternative</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Alternative
   * @generated
   */
  public Adapter createAlternativeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Author <em>Author</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Author
   * @generated
   */
  public Adapter createAuthorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Balance <em>Balance</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Balance
   * @generated
   */
  public Adapter createBalanceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Booking <em>Booking</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Booking
   * @generated
   */
  public Adapter createBookingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.BookingTask <em>Booking Task</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.BookingTask
   * @generated
   */
  public Adapter createBookingTaskAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.BookingResource <em>Booking Resource</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.BookingResource
   * @generated
   */
  public Adapter createBookingResourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Caption <em>Caption</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Caption
   * @generated
   */
  public Adapter createCaptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.CellColor <em>Cell Color</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.CellColor
   * @generated
   */
  public Adapter createCellColorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.CellText <em>Cell Text</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.CellText
   * @generated
   */
  public Adapter createCellTextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Center <em>Center</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Center
   * @generated
   */
  public Adapter createCenterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Charge <em>Charge</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Charge
   * @generated
   */
  public Adapter createChargeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.ChargeSet <em>Charge Set</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.ChargeSet
   * @generated
   */
  public Adapter createChargeSetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Columns <em>Columns</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Columns
   * @generated
   */
  public Adapter createColumnsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Complete <em>Complete</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Complete
   * @generated
   */
  public Adapter createCompleteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Copyright <em>Copyright</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Copyright
   * @generated
   */
  public Adapter createCopyrightAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Credit <em>Credit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Credit
   * @generated
   */
  public Adapter createCreditAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Currency <em>Currency</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Currency
   * @generated
   */
  public Adapter createCurrencyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.CurrencyFormat <em>Currency Format</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.CurrencyFormat
   * @generated
   */
  public Adapter createCurrencyFormatAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.DailyMax <em>Daily Max</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.DailyMax
   * @generated
   */
  public Adapter createDailyMaxAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.DailyMin <em>Daily Min</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.DailyMin
   * @generated
   */
  public Adapter createDailyMinAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.DailyWorkingHours <em>Daily Working Hours</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.DailyWorkingHours
   * @generated
   */
  public Adapter createDailyWorkingHoursAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Definitions <em>Definitions</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Definitions
   * @generated
   */
  public Adapter createDefinitionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Depends <em>Depends</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Depends
   * @generated
   */
  public Adapter createDependsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Details <em>Details</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Details
   * @generated
   */
  public Adapter createDetailsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Duration <em>Duration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Duration
   * @generated
   */
  public Adapter createDurationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Efficiency <em>Efficiency</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Efficiency
   * @generated
   */
  public Adapter createEfficiencyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Effort <em>Effort</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Effort
   * @generated
   */
  public Adapter createEffortAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Email <em>Email</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Email
   * @generated
   */
  public Adapter createEmailAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.End <em>End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.End
   * @generated
   */
  public Adapter createEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.EndCredit <em>End Credit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.EndCredit
   * @generated
   */
  public Adapter createEndCreditAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Epilog <em>Epilog</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Epilog
   * @generated
   */
  public Adapter createEpilogAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Extend <em>Extend</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Extend
   * @generated
   */
  public Adapter createExtendAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.ExtendResource <em>Extend Resource</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.ExtendResource
   * @generated
   */
  public Adapter createExtendResourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.ExtendedResourceAttribute <em>Extended Resource Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.ExtendedResourceAttribute
   * @generated
   */
  public Adapter createExtendedResourceAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.ExtendTask <em>Extend Task</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.ExtendTask
   * @generated
   */
  public Adapter createExtendTaskAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.ExtendedTaskAttribute <em>Extended Task Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.ExtendedTaskAttribute
   * @generated
   */
  public Adapter createExtendedTaskAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Fail <em>Fail</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Fail
   * @generated
   */
  public Adapter createFailAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Flags <em>Flags</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Flags
   * @generated
   */
  public Adapter createFlagsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.FontColor <em>Font Color</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.FontColor
   * @generated
   */
  public Adapter createFontColorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Footer <em>Footer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Footer
   * @generated
   */
  public Adapter createFooterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Formats <em>Formats</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Formats
   * @generated
   */
  public Adapter createFormatsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.GapDuration <em>Gap Duration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.GapDuration
   * @generated
   */
  public Adapter createGapDurationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.GapLength <em>Gap Length</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.GapLength
   * @generated
   */
  public Adapter createGapLengthAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.HAlign <em>HAlign</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.HAlign
   * @generated
   */
  public Adapter createHAlignAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Header <em>Header</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Header
   * @generated
   */
  public Adapter createHeaderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Headline <em>Headline</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Headline
   * @generated
   */
  public Adapter createHeadlineAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.HideAccount <em>Hide Account</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.HideAccount
   * @generated
   */
  public Adapter createHideAccountAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.HideJournalEntry <em>Hide Journal Entry</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.HideJournalEntry
   * @generated
   */
  public Adapter createHideJournalEntryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.HideReport <em>Hide Report</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.HideReport
   * @generated
   */
  public Adapter createHideReportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.HideResource <em>Hide Resource</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.HideResource
   * @generated
   */
  public Adapter createHideResourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.HideTask <em>Hide Task</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.HideTask
   * @generated
   */
  public Adapter createHideTaskAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Include <em>Include</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Include
   * @generated
   */
  public Adapter createIncludeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Interval1 <em>Interval1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Interval1
   * @generated
   */
  public Adapter createInterval1Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Interval2 <em>Interval2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Interval2
   * @generated
   */
  public Adapter createInterval2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Interval3 <em>Interval3</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Interval3
   * @generated
   */
  public Adapter createInterval3Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Interval4 <em>Interval4</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Interval4
   * @generated
   */
  public Adapter createInterval4Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.JournalAttributes <em>Journal Attributes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.JournalAttributes
   * @generated
   */
  public Adapter createJournalAttributesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.JournalEntry <em>Journal Entry</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.JournalEntry
   * @generated
   */
  public Adapter createJournalEntryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.JournalMode <em>Journal Mode</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.JournalMode
   * @generated
   */
  public Adapter createJournalModeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Left <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Left
   * @generated
   */
  public Adapter createLeftAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Length <em>Length</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Length
   * @generated
   */
  public Adapter createLengthAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Limits <em>Limits</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Limits
   * @generated
   */
  public Adapter createLimitsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.LimitsAttribute <em>Limits Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.LimitsAttribute
   * @generated
   */
  public Adapter createLimitsAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.ListItem <em>List Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.ListItem
   * @generated
   */
  public Adapter createListItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.ListType <em>List Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.ListType
   * @generated
   */
  public Adapter createListTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.LoadUnit <em>Load Unit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.LoadUnit
   * @generated
   */
  public Adapter createLoadUnitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Macro <em>Macro</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Macro
   * @generated
   */
  public Adapter createMacroAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Managers <em>Managers</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Managers
   * @generated
   */
  public Adapter createManagersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Mandatory <em>Mandatory</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Mandatory
   * @generated
   */
  public Adapter createMandatoryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.MaxEnd <em>Max End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.MaxEnd
   * @generated
   */
  public Adapter createMaxEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Maximum <em>Maximum</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Maximum
   * @generated
   */
  public Adapter createMaximumAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.MaxStart <em>Max Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.MaxStart
   * @generated
   */
  public Adapter createMaxStartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Milestone <em>Milestone</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Milestone
   * @generated
   */
  public Adapter createMilestoneAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Minimum <em>Minimum</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Minimum
   * @generated
   */
  public Adapter createMinimumAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.MinEnd <em>Min End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.MinEnd
   * @generated
   */
  public Adapter createMinEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.MinStart <em>Min Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.MinStart
   * @generated
   */
  public Adapter createMinStartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.MonthlyMax <em>Monthly Max</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.MonthlyMax
   * @generated
   */
  public Adapter createMonthlyMaxAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.MonthlyMin <em>Monthly Min</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.MonthlyMin
   * @generated
   */
  public Adapter createMonthlyMinAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Note <em>Note</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Note
   * @generated
   */
  public Adapter createNoteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Now <em>Now</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Now
   * @generated
   */
  public Adapter createNowAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.NumberFormat <em>Number Format</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.NumberFormat
   * @generated
   */
  public Adapter createNumberFormatAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Period <em>Period</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Period
   * @generated
   */
  public Adapter createPeriodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Persistent <em>Persistent</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Persistent
   * @generated
   */
  public Adapter createPersistentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Precedes <em>Precedes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Precedes
   * @generated
   */
  public Adapter createPrecedesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Priority <em>Priority</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Priority
   * @generated
   */
  public Adapter createPriorityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.ProjectId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.ProjectId
   * @generated
   */
  public Adapter createProjectIdAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.ProjectIds <em>Ids</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.ProjectIds
   * @generated
   */
  public Adapter createProjectIdsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Prolog <em>Prolog</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Prolog
   * @generated
   */
  public Adapter createPrologAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.PurgeReport <em>Purge Report</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.PurgeReport
   * @generated
   */
  public Adapter createPurgeReportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.PurgeResource <em>Purge Resource</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.PurgeResource
   * @generated
   */
  public Adapter createPurgeResourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.PurgeTask <em>Purge Task</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.PurgeTask
   * @generated
   */
  public Adapter createPurgeTaskAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Rate <em>Rate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Rate
   * @generated
   */
  public Adapter createRateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Remaining <em>Remaining</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Remaining
   * @generated
   */
  public Adapter createRemainingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.ReportPrefix <em>Report Prefix</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.ReportPrefix
   * @generated
   */
  public Adapter createReportPrefixAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.ResourceAttributes <em>Resource Attributes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.ResourceAttributes
   * @generated
   */
  public Adapter createResourceAttributesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.ResourcePrefix <em>Resource Prefix</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.ResourcePrefix
   * @generated
   */
  public Adapter createResourcePrefixAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.ResourceReport <em>Resource Report</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.ResourceReport
   * @generated
   */
  public Adapter createResourceReportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.ResourceRoot <em>Resource Root</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.ResourceRoot
   * @generated
   */
  public Adapter createResourceRootAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Responsible <em>Responsible</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Responsible
   * @generated
   */
  public Adapter createResponsibleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.RGB <em>RGB</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.RGB
   * @generated
   */
  public Adapter createRGBAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Right <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Right
   * @generated
   */
  public Adapter createRightAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.RollupAccount <em>Rollup Account</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.RollupAccount
   * @generated
   */
  public Adapter createRollupAccountAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.RollupResource <em>Rollup Resource</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.RollupResource
   * @generated
   */
  public Adapter createRollupResourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.RollupTask <em>Rollup Task</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.RollupTask
   * @generated
   */
  public Adapter createRollupTaskAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Scale <em>Scale</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Scale
   * @generated
   */
  public Adapter createScaleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Scenario <em>Scenario</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Scenario
   * @generated
   */
  public Adapter createScenarioAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Scenarios <em>Scenarios</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Scenarios
   * @generated
   */
  public Adapter createScenariosAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Scheduled <em>Scheduled</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Scheduled
   * @generated
   */
  public Adapter createScheduledAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Scheduling <em>Scheduling</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Scheduling
   * @generated
   */
  public Adapter createSchedulingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Select <em>Select</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Select
   * @generated
   */
  public Adapter createSelectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.SelfContained <em>Self Contained</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.SelfContained
   * @generated
   */
  public Adapter createSelfContainedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Shift <em>Shift</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Shift
   * @generated
   */
  public Adapter createShiftAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.ShiftTimesheet <em>Shift Timesheet</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.ShiftTimesheet
   * @generated
   */
  public Adapter createShiftTimesheetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Shifts <em>Shifts</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Shifts
   * @generated
   */
  public Adapter createShiftsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.ShiftsLimit <em>Shifts Limit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.ShiftsLimit
   * @generated
   */
  public Adapter createShiftsLimitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.ShiftsAllocate <em>Shifts Allocate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.ShiftsAllocate
   * @generated
   */
  public Adapter createShiftsAllocateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.ShiftsResource <em>Shifts Resource</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.ShiftsResource
   * @generated
   */
  public Adapter createShiftsResourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.ShiftsTask <em>Shifts Task</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.ShiftsTask
   * @generated
   */
  public Adapter createShiftsTaskAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.ShortTimeFormat <em>Short Time Format</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.ShortTimeFormat
   * @generated
   */
  public Adapter createShortTimeFormatAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Sort <em>Sort</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Sort
   * @generated
   */
  public Adapter createSortAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.SortAccounts <em>Sort Accounts</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.SortAccounts
   * @generated
   */
  public Adapter createSortAccountsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.SortJournalEntries <em>Sort Journal Entries</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.SortJournalEntries
   * @generated
   */
  public Adapter createSortJournalEntriesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.SortResources <em>Sort Resources</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.SortResources
   * @generated
   */
  public Adapter createSortResourcesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.SortTasks <em>Sort Tasks</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.SortTasks
   * @generated
   */
  public Adapter createSortTasksAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Start <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Start
   * @generated
   */
  public Adapter createStartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.StatusStatusSheet <em>Status Status Sheet</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.StatusStatusSheet
   * @generated
   */
  public Adapter createStatusStatusSheetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.StatusStatusSheetAttribute <em>Status Status Sheet Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.StatusStatusSheetAttribute
   * @generated
   */
  public Adapter createStatusStatusSheetAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.StatusSheet <em>Status Sheet</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.StatusSheet
   * @generated
   */
  public Adapter createStatusSheetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.StatusSheetAttribute <em>Status Sheet Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.StatusSheetAttribute
   * @generated
   */
  public Adapter createStatusSheetAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.StatusSheetReport <em>Status Sheet Report</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.StatusSheetReport
   * @generated
   */
  public Adapter createStatusSheetReportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.StatusSheetReportAttribute <em>Status Sheet Report Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.StatusSheetReportAttribute
   * @generated
   */
  public Adapter createStatusSheetReportAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Summary <em>Summary</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Summary
   * @generated
   */
  public Adapter createSummaryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.SupplementAccount <em>Supplement Account</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.SupplementAccount
   * @generated
   */
  public Adapter createSupplementAccountAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.SupplementReport <em>Supplement Report</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.SupplementReport
   * @generated
   */
  public Adapter createSupplementReportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.SupplementResource <em>Supplement Resource</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.SupplementResource
   * @generated
   */
  public Adapter createSupplementResourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.SupplementTask <em>Supplement Task</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.SupplementTask
   * @generated
   */
  public Adapter createSupplementTaskAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.TagFile <em>Tag File</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.TagFile
   * @generated
   */
  public Adapter createTagFileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.TaskStatusSheet <em>Task Status Sheet</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.TaskStatusSheet
   * @generated
   */
  public Adapter createTaskStatusSheetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.TaskStatusSheetAttribute <em>Task Status Sheet Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.TaskStatusSheetAttribute
   * @generated
   */
  public Adapter createTaskStatusSheetAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.TaskTimesheet <em>Task Timesheet</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.TaskTimesheet
   * @generated
   */
  public Adapter createTaskTimesheetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.TaskAttributes <em>Task Attributes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.TaskAttributes
   * @generated
   */
  public Adapter createTaskAttributesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.TaskPrefix <em>Task Prefix</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.TaskPrefix
   * @generated
   */
  public Adapter createTaskPrefixAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.TaskReport <em>Task Report</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.TaskReport
   * @generated
   */
  public Adapter createTaskReportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.TaskRoot <em>Task Root</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.TaskRoot
   * @generated
   */
  public Adapter createTaskRootAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.TextReport <em>Text Report</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.TextReport
   * @generated
   */
  public Adapter createTextReportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.TimeFormat <em>Time Format</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.TimeFormat
   * @generated
   */
  public Adapter createTimeFormatAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Timeoff <em>Timeoff</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Timeoff
   * @generated
   */
  public Adapter createTimeoffAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Timesheet <em>Timesheet</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Timesheet
   * @generated
   */
  public Adapter createTimesheetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.TimesheetReport <em>Timesheet Report</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.TimesheetReport
   * @generated
   */
  public Adapter createTimesheetReportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Timezone <em>Timezone</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Timezone
   * @generated
   */
  public Adapter createTimezoneAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.TimingResolution <em>Timing Resolution</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.TimingResolution
   * @generated
   */
  public Adapter createTimingResolutionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Title <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Title
   * @generated
   */
  public Adapter createTitleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.ToolTip <em>Tool Tip</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.ToolTip
   * @generated
   */
  public Adapter createToolTipAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.TrackingScenario <em>Tracking Scenario</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.TrackingScenario
   * @generated
   */
  public Adapter createTrackingScenarioAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.TreeLevel <em>Tree Level</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.TreeLevel
   * @generated
   */
  public Adapter createTreeLevelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Vacation <em>Vacation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Vacation
   * @generated
   */
  public Adapter createVacationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Warn <em>Warn</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Warn
   * @generated
   */
  public Adapter createWarnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.WeekStarts <em>Week Starts</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.WeekStarts
   * @generated
   */
  public Adapter createWeekStartsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.WeeklyMax <em>Weekly Max</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.WeeklyMax
   * @generated
   */
  public Adapter createWeeklyMaxAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.WeeklyMin <em>Weekly Min</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.WeeklyMin
   * @generated
   */
  public Adapter createWeeklyMinAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Width <em>Width</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Width
   * @generated
   */
  public Adapter createWidthAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Work <em>Work</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Work
   * @generated
   */
  public Adapter createWorkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.WorkingHours <em>Working Hours</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.WorkingHours
   * @generated
   */
  public Adapter createWorkingHoursAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.YearlyWorkingDays <em>Yearly Working Days</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.YearlyWorkingDays
   * @generated
   */
  public Adapter createYearlyWorkingDaysAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.AccountShare <em>Account Share</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.AccountShare
   * @generated
   */
  public Adapter createAccountShareAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.ColumnAttribute <em>Column Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.ColumnAttribute
   * @generated
   */
  public Adapter createColumnAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Column <em>Column</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Column
   * @generated
   */
  public Adapter createColumnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Criterion <em>Criterion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Criterion
   * @generated
   */
  public Adapter createCriterionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.DurationQuantity <em>Duration Quantity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.DurationQuantity
   * @generated
   */
  public Adapter createDurationQuantityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Limit <em>Limit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Limit
   * @generated
   */
  public Adapter createLimitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.LimitAttribute <em>Limit Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.LimitAttribute
   * @generated
   */
  public Adapter createLimitAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.RealFormat <em>Real Format</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.RealFormat
   * @generated
   */
  public Adapter createRealFormatAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.TaskDependency <em>Task Dependency</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.TaskDependency
   * @generated
   */
  public Adapter createTaskDependencyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.TaskTimesheetAttribute <em>Task Timesheet Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.TaskTimesheetAttribute
   * @generated
   */
  public Adapter createTaskTimesheetAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.TimesheetAttribute <em>Timesheet Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.TimesheetAttribute
   * @generated
   */
  public Adapter createTimesheetAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.TimesheetReportAttribute <em>Timesheet Report Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.TimesheetReportAttribute
   * @generated
   */
  public Adapter createTimesheetReportAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.RichText <em>Rich Text</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.RichText
   * @generated
   */
  public Adapter createRichTextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.WorkHours <em>Work Hours</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.WorkHours
   * @generated
   */
  public Adapter createWorkHoursAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Weekdays <em>Weekdays</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Weekdays
   * @generated
   */
  public Adapter createWeekdaysAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.jjflyboy.tjpeditor.project.Defintions <em>Defintions</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.jjflyboy.tjpeditor.project.Defintions
   * @generated
   */
  public Adapter createDefintionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //ProjectAdapterFactory
