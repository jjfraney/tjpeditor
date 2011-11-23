package org.jjflyboy.tjpeditor.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.jjflyboy.tjpeditor.project.Account;
import org.jjflyboy.tjpeditor.project.AccountPrefix;
import org.jjflyboy.tjpeditor.project.AccountRoot;
import org.jjflyboy.tjpeditor.project.AccountShare;
import org.jjflyboy.tjpeditor.project.Alert;
import org.jjflyboy.tjpeditor.project.Allocate;
import org.jjflyboy.tjpeditor.project.AllocateResource;
import org.jjflyboy.tjpeditor.project.Alternative;
import org.jjflyboy.tjpeditor.project.Author;
import org.jjflyboy.tjpeditor.project.Balance;
import org.jjflyboy.tjpeditor.project.Booking;
import org.jjflyboy.tjpeditor.project.BookingResource;
import org.jjflyboy.tjpeditor.project.BookingTask;
import org.jjflyboy.tjpeditor.project.CellColor;
import org.jjflyboy.tjpeditor.project.CellText;
import org.jjflyboy.tjpeditor.project.Charge;
import org.jjflyboy.tjpeditor.project.ChargeSet;
import org.jjflyboy.tjpeditor.project.Column;
import org.jjflyboy.tjpeditor.project.Columns;
import org.jjflyboy.tjpeditor.project.Complete;
import org.jjflyboy.tjpeditor.project.Copyright;
import org.jjflyboy.tjpeditor.project.Credit;
import org.jjflyboy.tjpeditor.project.Criterion;
import org.jjflyboy.tjpeditor.project.Currency;
import org.jjflyboy.tjpeditor.project.DailyWorkingHours;
import org.jjflyboy.tjpeditor.project.Definitions;
import org.jjflyboy.tjpeditor.project.Defintions;
import org.jjflyboy.tjpeditor.project.Duration;
import org.jjflyboy.tjpeditor.project.DurationQuantity;
import org.jjflyboy.tjpeditor.project.Efficiency;
import org.jjflyboy.tjpeditor.project.Effort;
import org.jjflyboy.tjpeditor.project.Email;
import org.jjflyboy.tjpeditor.project.End;
import org.jjflyboy.tjpeditor.project.EndCredit;
import org.jjflyboy.tjpeditor.project.Export;
import org.jjflyboy.tjpeditor.project.Extend;
import org.jjflyboy.tjpeditor.project.ExtendResource;
import org.jjflyboy.tjpeditor.project.ExtendTask;
import org.jjflyboy.tjpeditor.project.ExtendedResourceAttribute;
import org.jjflyboy.tjpeditor.project.ExtendedTaskAttribute;
import org.jjflyboy.tjpeditor.project.Fail;
import org.jjflyboy.tjpeditor.project.Flags;
import org.jjflyboy.tjpeditor.project.FontColor;
import org.jjflyboy.tjpeditor.project.Formats;
import org.jjflyboy.tjpeditor.project.Global;
import org.jjflyboy.tjpeditor.project.HAlign;
import org.jjflyboy.tjpeditor.project.HideAccount;
import org.jjflyboy.tjpeditor.project.HideJournalEntry;
import org.jjflyboy.tjpeditor.project.HideReport;
import org.jjflyboy.tjpeditor.project.HideResource;
import org.jjflyboy.tjpeditor.project.HideTask;
import org.jjflyboy.tjpeditor.project.IcalReport;
import org.jjflyboy.tjpeditor.project.Interval1;
import org.jjflyboy.tjpeditor.project.Interval2;
import org.jjflyboy.tjpeditor.project.Interval3;
import org.jjflyboy.tjpeditor.project.Interval4;
import org.jjflyboy.tjpeditor.project.JournalAttributes;
import org.jjflyboy.tjpeditor.project.JournalEntry;
import org.jjflyboy.tjpeditor.project.JournalMode;
import org.jjflyboy.tjpeditor.project.Length;
import org.jjflyboy.tjpeditor.project.Limit;
import org.jjflyboy.tjpeditor.project.LimitAttribute;
import org.jjflyboy.tjpeditor.project.Limits;
import org.jjflyboy.tjpeditor.project.ListType;
import org.jjflyboy.tjpeditor.project.LoadUnit;
import org.jjflyboy.tjpeditor.project.Macro;
import org.jjflyboy.tjpeditor.project.Managers;
import org.jjflyboy.tjpeditor.project.Mandatory;
import org.jjflyboy.tjpeditor.project.MaxEnd;
import org.jjflyboy.tjpeditor.project.MaxStart;
import org.jjflyboy.tjpeditor.project.Milestone;
import org.jjflyboy.tjpeditor.project.MinEnd;
import org.jjflyboy.tjpeditor.project.MinStart;
import org.jjflyboy.tjpeditor.project.Navigator;
import org.jjflyboy.tjpeditor.project.NewTask;
import org.jjflyboy.tjpeditor.project.NikuReport;
import org.jjflyboy.tjpeditor.project.Note;
import org.jjflyboy.tjpeditor.project.Now;
import org.jjflyboy.tjpeditor.project.Period;
import org.jjflyboy.tjpeditor.project.Persistent;
import org.jjflyboy.tjpeditor.project.Priority;
import org.jjflyboy.tjpeditor.project.Project;
import org.jjflyboy.tjpeditor.project.ProjectId;
import org.jjflyboy.tjpeditor.project.ProjectIds;
import org.jjflyboy.tjpeditor.project.ProjectPackage;
import org.jjflyboy.tjpeditor.project.PurgeReport;
import org.jjflyboy.tjpeditor.project.PurgeResource;
import org.jjflyboy.tjpeditor.project.PurgeTask;
import org.jjflyboy.tjpeditor.project.RGB;
import org.jjflyboy.tjpeditor.project.Rate;
import org.jjflyboy.tjpeditor.project.RealFormat;
import org.jjflyboy.tjpeditor.project.Remaining;
import org.jjflyboy.tjpeditor.project.Report;
import org.jjflyboy.tjpeditor.project.ReportPrefix;
import org.jjflyboy.tjpeditor.project.Resource;
import org.jjflyboy.tjpeditor.project.ResourceAttributes;
import org.jjflyboy.tjpeditor.project.ResourcePrefix;
import org.jjflyboy.tjpeditor.project.ResourceRoot;
import org.jjflyboy.tjpeditor.project.Responsible;
import org.jjflyboy.tjpeditor.project.RichText;
import org.jjflyboy.tjpeditor.project.RollupAccount;
import org.jjflyboy.tjpeditor.project.RollupResource;
import org.jjflyboy.tjpeditor.project.RollupTask;
import org.jjflyboy.tjpeditor.project.Scale;
import org.jjflyboy.tjpeditor.project.Scenario;
import org.jjflyboy.tjpeditor.project.ScenarioIcal;
import org.jjflyboy.tjpeditor.project.Scenarios;
import org.jjflyboy.tjpeditor.project.Scheduled;
import org.jjflyboy.tjpeditor.project.Scheduling;
import org.jjflyboy.tjpeditor.project.Select;
import org.jjflyboy.tjpeditor.project.SelfContained;
import org.jjflyboy.tjpeditor.project.Shift;
import org.jjflyboy.tjpeditor.project.ShiftTimesheet;
import org.jjflyboy.tjpeditor.project.Shifts;
import org.jjflyboy.tjpeditor.project.ShiftsAllocate;
import org.jjflyboy.tjpeditor.project.ShiftsLimit;
import org.jjflyboy.tjpeditor.project.ShortTimeFormat;
import org.jjflyboy.tjpeditor.project.Sort;
import org.jjflyboy.tjpeditor.project.Start;
import org.jjflyboy.tjpeditor.project.StatusSheet;
import org.jjflyboy.tjpeditor.project.StatusSheetReport;
import org.jjflyboy.tjpeditor.project.StatusStatusSheet;
import org.jjflyboy.tjpeditor.project.StatusTimesheet;
import org.jjflyboy.tjpeditor.project.SupplementAccount;
import org.jjflyboy.tjpeditor.project.SupplementReport;
import org.jjflyboy.tjpeditor.project.SupplementResource;
import org.jjflyboy.tjpeditor.project.SupplementTask;
import org.jjflyboy.tjpeditor.project.TagFile;
import org.jjflyboy.tjpeditor.project.Task;
import org.jjflyboy.tjpeditor.project.TaskAttributes;
import org.jjflyboy.tjpeditor.project.TaskDependency;
import org.jjflyboy.tjpeditor.project.TaskPrefix;
import org.jjflyboy.tjpeditor.project.TaskRoot;
import org.jjflyboy.tjpeditor.project.TaskStatusSheet;
import org.jjflyboy.tjpeditor.project.TaskTimesheet;
import org.jjflyboy.tjpeditor.project.TimeFormat;
import org.jjflyboy.tjpeditor.project.Timeoff;
import org.jjflyboy.tjpeditor.project.Timesheet;
import org.jjflyboy.tjpeditor.project.TimesheetReport;
import org.jjflyboy.tjpeditor.project.Timezone;
import org.jjflyboy.tjpeditor.project.TimingResolution;
import org.jjflyboy.tjpeditor.project.Title;
import org.jjflyboy.tjpeditor.project.ToolTip;
import org.jjflyboy.tjpeditor.project.TrackingScenario;
import org.jjflyboy.tjpeditor.project.TreeLevel;
import org.jjflyboy.tjpeditor.project.Vacation;
import org.jjflyboy.tjpeditor.project.Warn;
import org.jjflyboy.tjpeditor.project.WeekStarts;
import org.jjflyboy.tjpeditor.project.Weekdays;
import org.jjflyboy.tjpeditor.project.Width;
import org.jjflyboy.tjpeditor.project.Work;
import org.jjflyboy.tjpeditor.project.WorkHours;
import org.jjflyboy.tjpeditor.project.WorkingHours;
import org.jjflyboy.tjpeditor.project.YearlyWorkingDays;
import org.jjflyboy.tjpeditor.services.ProjectGrammarAccess;

@SuppressWarnings("restriction")
public class AbstractProjectSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected ProjectGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ProjectPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ProjectPackage.ACCOUNT:
				if(context == grammarAccess.getAccountRule() ||
				   context == grammarAccess.getAccountAttributeRule() ||
				   context == grammarAccess.getGlobalAttributeRule()) {
					sequence_Account(context, (Account) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.ACCOUNT_PREFIX:
				if(context == grammarAccess.getAccountPrefixRule()) {
					sequence_AccountPrefix(context, (AccountPrefix) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.ACCOUNT_ROOT:
				if(context == grammarAccess.getAccountRootRule() ||
				   context == grammarAccess.getReportAttributeRule()) {
					sequence_AccountRoot(context, (AccountRoot) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.ACCOUNT_SHARE:
				if(context == grammarAccess.getAccountShareRule()) {
					sequence_AccountShare(context, (AccountShare) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.ALERT:
				if(context == grammarAccess.getAlertRule()) {
					sequence_Alert(context, (Alert) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.ALLOCATE:
				if(context == grammarAccess.getAllocateRule() ||
				   context == grammarAccess.getTaskAttributeRule()) {
					sequence_Allocate(context, (Allocate) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.ALLOCATE_RESOURCE:
				if(context == grammarAccess.getAllocateResourceRule()) {
					sequence_AllocateResource(context, (AllocateResource) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.ALTERNATIVE:
				if(context == grammarAccess.getAllocateResourceAttributeRule() ||
				   context == grammarAccess.getAlternativeRule()) {
					sequence_Alternative(context, (Alternative) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.AUTHOR:
				if(context == grammarAccess.getAuthorRule() ||
				   context == grammarAccess.getStatusStatusSheetAttributeRule()) {
					sequence_Author(context, (Author) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.BALANCE:
				if(context == grammarAccess.getBalanceRule() ||
				   context == grammarAccess.getGlobalAttributeRule() ||
				   context == grammarAccess.getReportAttributeRule()) {
					sequence_Balance(context, (Balance) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.BOOKING:
				if(context == grammarAccess.getBookingRule()) {
					sequence_Booking(context, (Booking) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.BOOKING_RESOURCE:
				if(context == grammarAccess.getBookingResourceRule() ||
				   context == grammarAccess.getResourceAttributeRule()) {
					sequence_BookingResource(context, (BookingResource) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.BOOKING_TASK:
				if(context == grammarAccess.getBookingTaskRule() ||
				   context == grammarAccess.getTaskAttributeRule()) {
					sequence_BookingTask(context, (BookingTask) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.CELL_COLOR:
				if(context == grammarAccess.getCellColorRule() ||
				   context == grammarAccess.getColumnAttributeRule()) {
					sequence_CellColor(context, (CellColor) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.CELL_TEXT:
				if(context == grammarAccess.getCellTextRule() ||
				   context == grammarAccess.getColumnAttributeRule()) {
					sequence_CellText(context, (CellText) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.CHARGE:
				if(context == grammarAccess.getChargeRule() ||
				   context == grammarAccess.getTaskAttributeRule()) {
					sequence_Charge(context, (Charge) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.CHARGE_SET:
				if(context == grammarAccess.getChargeSetRule() ||
				   context == grammarAccess.getTaskAttributeRule()) {
					sequence_ChargeSet(context, (ChargeSet) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.COLUMN:
				if(context == grammarAccess.getColumnRule()) {
					sequence_Column(context, (Column) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.COLUMNS:
				if(context == grammarAccess.getColumnsRule() ||
				   context == grammarAccess.getReportAttributeRule()) {
					sequence_Columns(context, (Columns) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.COMPLETE:
				if(context == grammarAccess.getCompleteRule() ||
				   context == grammarAccess.getTaskAttributeRule()) {
					sequence_Complete(context, (Complete) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.COPYRIGHT:
				if(context == grammarAccess.getCopyrightRule() ||
				   context == grammarAccess.getGlobalAttributeRule()) {
					sequence_Copyright(context, (Copyright) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.CREDIT:
				if(context == grammarAccess.getAccountAttributeRule() ||
				   context == grammarAccess.getCreditRule()) {
					sequence_Credit(context, (Credit) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.CRITERION:
				if(context == grammarAccess.getCriterionRule()) {
					sequence_Criterion(context, (Criterion) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.CURRENCY:
				if(context == grammarAccess.getCurrencyRule() ||
				   context == grammarAccess.getProjectAttributeRule()) {
					sequence_Currency(context, (Currency) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.DAILY_WORKING_HOURS:
				if(context == grammarAccess.getDailyWorkingHoursRule() ||
				   context == grammarAccess.getProjectAttributeRule()) {
					sequence_DailyWorkingHours(context, (DailyWorkingHours) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.DEFINITIONS:
				if(context == grammarAccess.getDefinitionsRule() ||
				   context == grammarAccess.getExportAttributeRule()) {
					sequence_Definitions(context, (Definitions) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.DEFINTIONS:
				if(context == grammarAccess.getDefinitionsRule() ||
				   context == grammarAccess.getExportAttributeRule()) {
					sequence_Definitions(context, (Defintions) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.DURATION:
				if(context == grammarAccess.getDurationRule() ||
				   context == grammarAccess.getTaskAttributeRule()) {
					sequence_Duration(context, (Duration) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.DURATION_QUANTITY:
				if(context == grammarAccess.getDurationQuantityRule() ||
				   context == grammarAccess.getGapDurationRule() ||
				   context == grammarAccess.getGapLengthRule()) {
					sequence_DurationQuantity(context, (DurationQuantity) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.EFFICIENCY:
				if(context == grammarAccess.getEfficiencyRule() ||
				   context == grammarAccess.getResourceAttributeRule()) {
					sequence_Efficiency(context, (Efficiency) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.EFFORT:
				if(context == grammarAccess.getEffortRule() ||
				   context == grammarAccess.getTaskAttributeRule()) {
					sequence_Effort(context, (Effort) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.EMAIL:
				if(context == grammarAccess.getEmailRule() ||
				   context == grammarAccess.getResourceAttributeRule()) {
					sequence_Email(context, (Email) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.END:
				if(context == grammarAccess.getColumnAttributeRule() ||
				   context == grammarAccess.getEndRule() ||
				   context == grammarAccess.getExportAttributeRule() ||
				   context == grammarAccess.getIcalReportAttributeRule() ||
				   context == grammarAccess.getNewTaskAttributeRule() ||
				   context == grammarAccess.getNikuReportAttributeRule() ||
				   context == grammarAccess.getReportAttributeRule() ||
				   context == grammarAccess.getStatusSheetReportAttributeRule() ||
				   context == grammarAccess.getTaskAttributeRule() ||
				   context == grammarAccess.getTaskTimesheetAttributeRule() ||
				   context == grammarAccess.getTimesheetReportAttributeRule()) {
					sequence_End(context, (End) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.END_CREDIT:
				if(context == grammarAccess.getEndCreditRule() ||
				   context == grammarAccess.getTaskAttributeRule()) {
					sequence_EndCredit(context, (EndCredit) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.EXPORT:
				if(context == grammarAccess.getExportRule() ||
				   context == grammarAccess.getGlobalAttributeRule()) {
					sequence_Export(context, (Export) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.EXTEND:
				if(context == grammarAccess.getExtendRule()) {
					sequence_Extend(context, (Extend) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.EXTEND_RESOURCE:
				if(context == grammarAccess.getExtendResourceRule() ||
				   context == grammarAccess.getProjectAttributeRule()) {
					sequence_ExtendResource(context, (ExtendResource) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.EXTEND_TASK:
				if(context == grammarAccess.getExtendTaskRule() ||
				   context == grammarAccess.getProjectAttributeRule()) {
					sequence_ExtendTask(context, (ExtendTask) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.EXTENDED_RESOURCE_ATTRIBUTE:
				if(context == grammarAccess.getExtendedResourceAttributeRule() ||
				   context == grammarAccess.getResourceAttributeRule()) {
					sequence_ExtendedResourceAttribute(context, (ExtendedResourceAttribute) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.EXTENDED_TASK_ATTRIBUTE:
				if(context == grammarAccess.getExtendedTaskAttributeRule() ||
				   context == grammarAccess.getTaskAttributeRule()) {
					sequence_ExtendedTaskAttribute(context, (ExtendedTaskAttribute) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.FAIL:
				if(context == grammarAccess.getFailRule() ||
				   context == grammarAccess.getResourceAttributeRule() ||
				   context == grammarAccess.getTaskAttributeRule()) {
					sequence_Fail(context, (Fail) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.FLAGS:
				if(context == grammarAccess.getAccountAttributeRule() ||
				   context == grammarAccess.getFlagsRule() ||
				   context == grammarAccess.getGlobalAttributeRule() ||
				   context == grammarAccess.getReportAttributeRule() ||
				   context == grammarAccess.getResourceAttributeRule() ||
				   context == grammarAccess.getStatusStatusSheetAttributeRule() ||
				   context == grammarAccess.getStatusTimesheetAttributeRule() ||
				   context == grammarAccess.getTaskAttributeRule()) {
					sequence_Flags(context, (Flags) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.FONT_COLOR:
				if(context == grammarAccess.getColumnAttributeRule() ||
				   context == grammarAccess.getFontColorRule()) {
					sequence_FontColor(context, (FontColor) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.FORMATS:
				if(context == grammarAccess.getFormatsRule() ||
				   context == grammarAccess.getNikuReportAttributeRule() ||
				   context == grammarAccess.getReportAttributeRule()) {
					sequence_Formats(context, (Formats) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.GLOBAL:
				if(context == grammarAccess.getGlobalRule()) {
					sequence_Global(context, (Global) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.HALIGN:
				if(context == grammarAccess.getColumnAttributeRule() ||
				   context == grammarAccess.getHAlignRule()) {
					sequence_HAlign(context, (HAlign) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.HIDE_ACCOUNT:
				if(context == grammarAccess.getHideAccountRule() ||
				   context == grammarAccess.getReportAttributeRule()) {
					sequence_HideAccount(context, (HideAccount) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.HIDE_JOURNAL_ENTRY:
				if(context == grammarAccess.getHideJournalEntryRule() ||
				   context == grammarAccess.getIcalReportAttributeRule() ||
				   context == grammarAccess.getReportAttributeRule()) {
					sequence_HideJournalEntry(context, (HideJournalEntry) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.HIDE_REPORT:
				if(context == grammarAccess.getHideReportRule() ||
				   context == grammarAccess.getNavigatorAttributeRule()) {
					sequence_HideReport(context, (HideReport) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.HIDE_RESOURCE:
				if(context == grammarAccess.getExportAttributeRule() ||
				   context == grammarAccess.getHideResourceRule() ||
				   context == grammarAccess.getIcalReportAttributeRule() ||
				   context == grammarAccess.getNikuReportAttributeRule() ||
				   context == grammarAccess.getReportAttributeRule() ||
				   context == grammarAccess.getStatusSheetReportAttributeRule() ||
				   context == grammarAccess.getTimesheetReportAttributeRule()) {
					sequence_HideResource(context, (HideResource) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.HIDE_TASK:
				if(context == grammarAccess.getExportAttributeRule() ||
				   context == grammarAccess.getHideTaskRule() ||
				   context == grammarAccess.getIcalReportAttributeRule() ||
				   context == grammarAccess.getNikuReportAttributeRule() ||
				   context == grammarAccess.getReportAttributeRule() ||
				   context == grammarAccess.getStatusSheetReportAttributeRule()) {
					sequence_HideTask(context, (HideTask) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.ICAL_REPORT:
				if(context == grammarAccess.getGlobalAttributeRule() ||
				   context == grammarAccess.getIcalReportRule()) {
					sequence_IcalReport(context, (IcalReport) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.INTERVAL1:
				if(context == grammarAccess.getInterval1Rule()) {
					sequence_Interval1(context, (Interval1) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.INTERVAL2:
				if(context == grammarAccess.getInterval2Rule()) {
					sequence_Interval2(context, (Interval2) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.INTERVAL3:
				if(context == grammarAccess.getInterval3Rule()) {
					sequence_Interval3(context, (Interval3) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.INTERVAL4:
				if(context == grammarAccess.getInterval4Rule()) {
					sequence_Interval4(context, (Interval4) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.JOURNAL_ATTRIBUTES:
				if(context == grammarAccess.getJournalAttributesRule() ||
				   context == grammarAccess.getReportAttributeRule()) {
					sequence_JournalAttributes(context, (JournalAttributes) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.JOURNAL_ENTRY:
				if(context == grammarAccess.getJournalEntryRule() ||
				   context == grammarAccess.getProjectAttributeRule() ||
				   context == grammarAccess.getResourceAttributeRule() ||
				   context == grammarAccess.getTaskAttributeRule()) {
					sequence_JournalEntry(context, (JournalEntry) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.JOURNAL_MODE:
				if(context == grammarAccess.getJournalModeRule() ||
				   context == grammarAccess.getReportAttributeRule()) {
					sequence_JournalMode(context, (JournalMode) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.LENGTH:
				if(context == grammarAccess.getLengthRule() ||
				   context == grammarAccess.getTaskAttributeRule()) {
					sequence_Length(context, (Length) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.LIMIT:
				if(context == grammarAccess.getDailyMaxRule() ||
				   context == grammarAccess.getDailyMinRule() ||
				   context == grammarAccess.getLimitRule() ||
				   context == grammarAccess.getLimitsAttributeRule() ||
				   context == grammarAccess.getMaximumRule() ||
				   context == grammarAccess.getMinimumRule() ||
				   context == grammarAccess.getMonthlyMaxRule() ||
				   context == grammarAccess.getMonthlyMinRule() ||
				   context == grammarAccess.getWeeklyMaxRule() ||
				   context == grammarAccess.getWeeklyMinRule()) {
					sequence_Limit(context, (Limit) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.LIMIT_ATTRIBUTE:
				if(context == grammarAccess.getLimitAttributeRule()) {
					sequence_LimitAttribute(context, (LimitAttribute) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.LIMITS:
				if(context == grammarAccess.getGlobalAttributeRule() ||
				   context == grammarAccess.getLimitsRule() ||
				   context == grammarAccess.getResourceAttributeRule() ||
				   context == grammarAccess.getTaskAttributeRule()) {
					sequence_Limits(context, (Limits) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.LIST_TYPE:
				if(context == grammarAccess.getColumnAttributeRule() ||
				   context == grammarAccess.getListTypeRule()) {
					sequence_ListType(context, (ListType) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.LOAD_UNIT:
				if(context == grammarAccess.getLoadUnitRule() ||
				   context == grammarAccess.getReportAttributeRule()) {
					sequence_LoadUnit(context, (LoadUnit) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.MACRO:
				if(context == grammarAccess.getGlobalAttributeRule() ||
				   context == grammarAccess.getMacroRule()) {
					sequence_Macro(context, (Macro) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.MANAGERS:
				if(context == grammarAccess.getManagersRule() ||
				   context == grammarAccess.getResourceAttributeRule()) {
					sequence_Managers(context, (Managers) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.MANDATORY:
				if(context == grammarAccess.getAllocateResourceAttributeRule() ||
				   context == grammarAccess.getMandatoryRule()) {
					sequence_Mandatory(context, (Mandatory) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.MAX_END:
				if(context == grammarAccess.getMaxEndRule() ||
				   context == grammarAccess.getTaskAttributeRule()) {
					sequence_MaxEnd(context, (MaxEnd) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.MAX_START:
				if(context == grammarAccess.getMaxStartRule() ||
				   context == grammarAccess.getTaskAttributeRule()) {
					sequence_MaxStart(context, (MaxStart) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.MILESTONE:
				if(context == grammarAccess.getMilestoneRule() ||
				   context == grammarAccess.getTaskAttributeRule()) {
					sequence_Milestone(context, (Milestone) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.MIN_END:
				if(context == grammarAccess.getMinEndRule() ||
				   context == grammarAccess.getTaskAttributeRule()) {
					sequence_MinEnd(context, (MinEnd) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.MIN_START:
				if(context == grammarAccess.getMinStartRule() ||
				   context == grammarAccess.getTaskAttributeRule()) {
					sequence_MinStart(context, (MinStart) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.NAVIGATOR:
				if(context == grammarAccess.getGlobalAttributeRule() ||
				   context == grammarAccess.getNavigatorRule()) {
					sequence_Navigator(context, (Navigator) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.NEW_TASK:
				if(context == grammarAccess.getNewTaskRule() ||
				   context == grammarAccess.getTimesheetAttributeRule()) {
					sequence_NewTask(context, (NewTask) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.NIKU_REPORT:
				if(context == grammarAccess.getGlobalAttributeRule() ||
				   context == grammarAccess.getNikuReportRule()) {
					sequence_NikuReport(context, (NikuReport) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.NOTE:
				if(context == grammarAccess.getNoteRule() ||
				   context == grammarAccess.getTaskAttributeRule()) {
					sequence_Note(context, (Note) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.NOW:
				if(context == grammarAccess.getNowRule() ||
				   context == grammarAccess.getProjectAttributeRule()) {
					sequence_Now(context, (Now) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.PERIOD:
				if(context == grammarAccess.getColumnAttributeRule() ||
				   context == grammarAccess.getExportAttributeRule() ||
				   context == grammarAccess.getIcalReportAttributeRule() ||
				   context == grammarAccess.getNikuReportAttributeRule() ||
				   context == grammarAccess.getPeriodRule() ||
				   context == grammarAccess.getReportAttributeRule() ||
				   context == grammarAccess.getStatusSheetReportAttributeRule() ||
				   context == grammarAccess.getTaskAttributeRule() ||
				   context == grammarAccess.getTimesheetReportAttributeRule()) {
					sequence_Period(context, (Period) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.PERSISTENT:
				if(context == grammarAccess.getAllocateResourceAttributeRule() ||
				   context == grammarAccess.getPersistentRule()) {
					sequence_Persistent(context, (Persistent) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.PRIORITY:
				if(context == grammarAccess.getNewTaskAttributeRule() ||
				   context == grammarAccess.getPriorityRule() ||
				   context == grammarAccess.getTaskAttributeRule() ||
				   context == grammarAccess.getTaskTimesheetAttributeRule()) {
					sequence_Priority(context, (Priority) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.PROJECT:
				if(context == grammarAccess.getProjectRule()) {
					sequence_Project(context, (Project) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.PROJECT_ID:
				if(context == grammarAccess.getProjectIdRule() ||
				   context == grammarAccess.getTaskAttributeRule()) {
					sequence_ProjectId(context, (ProjectId) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.PROJECT_IDS:
				if(context == grammarAccess.getGlobalAttributeRule() ||
				   context == grammarAccess.getProjectIdsRule()) {
					sequence_ProjectIds(context, (ProjectIds) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.PURGE_REPORT:
				if(context == grammarAccess.getPurgeReportRule() ||
				   context == grammarAccess.getReportAttributeRule()) {
					sequence_PurgeReport(context, (PurgeReport) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.PURGE_RESOURCE:
				if(context == grammarAccess.getPurgeResourceRule() ||
				   context == grammarAccess.getResourceAttributeRule()) {
					sequence_PurgeResource(context, (PurgeResource) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.PURGE_TASK:
				if(context == grammarAccess.getPurgeTaskRule() ||
				   context == grammarAccess.getTaskAttributeRule()) {
					sequence_PurgeTask(context, (PurgeTask) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.RGB:
				if(context == grammarAccess.getRGBRule()) {
					sequence_RGB(context, (RGB) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.RATE:
				if(context == grammarAccess.getGlobalAttributeRule() ||
				   context == grammarAccess.getRateRule() ||
				   context == grammarAccess.getResourceAttributeRule()) {
					sequence_Rate(context, (Rate) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.REAL_FORMAT:
				if(context == grammarAccess.getCurrencyFormatRule() ||
				   context == grammarAccess.getNikuReportAttributeRule() ||
				   context == grammarAccess.getNumberFormatRule() ||
				   context == grammarAccess.getProjectAttributeRule() ||
				   context == grammarAccess.getRealFormatRule() ||
				   context == grammarAccess.getReportAttributeRule()) {
					sequence_RealFormat(context, (RealFormat) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.REMAINING:
				if(context == grammarAccess.getNewTaskAttributeRule() ||
				   context == grammarAccess.getRemainingRule() ||
				   context == grammarAccess.getTaskTimesheetAttributeRule()) {
					sequence_Remaining(context, (Remaining) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.REPORT:
				if(context == grammarAccess.getAccountReportRule() ||
				   context == grammarAccess.getGlobalAttributeRule() ||
				   context == grammarAccess.getReportRule() ||
				   context == grammarAccess.getReportAttributeRule() ||
				   context == grammarAccess.getResourceReportRule() ||
				   context == grammarAccess.getTaskReportRule() ||
				   context == grammarAccess.getTextReportRule()) {
					sequence_Report(context, (Report) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.REPORT_PREFIX:
				if(context == grammarAccess.getReportPrefixRule()) {
					sequence_ReportPrefix(context, (ReportPrefix) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.RESOURCE:
				if(context == grammarAccess.getGlobalAttributeRule() ||
				   context == grammarAccess.getResourceRule() ||
				   context == grammarAccess.getResourceAttributeRule()) {
					sequence_Resource(context, (Resource) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.RESOURCE_ATTRIBUTES:
				if(context == grammarAccess.getExportAttributeRule() ||
				   context == grammarAccess.getResourceAttributesRule()) {
					sequence_ResourceAttributes(context, (ResourceAttributes) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.RESOURCE_PREFIX:
				if(context == grammarAccess.getResourcePrefixRule()) {
					sequence_ResourcePrefix(context, (ResourcePrefix) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.RESOURCE_ROOT:
				if(context == grammarAccess.getReportAttributeRule() ||
				   context == grammarAccess.getResourceRootRule()) {
					sequence_ResourceRoot(context, (ResourceRoot) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.RESPONSIBLE:
				if(context == grammarAccess.getResponsibleRule() ||
				   context == grammarAccess.getTaskAttributeRule()) {
					sequence_Responsible(context, (Responsible) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.RICH_TEXT:
				if(context == grammarAccess.getCaptionRule() ||
				   context == grammarAccess.getCenterRule() ||
				   context == grammarAccess.getColumnAttributeRule() ||
				   context == grammarAccess.getDetailsRule() ||
				   context == grammarAccess.getEpilogRule() ||
				   context == grammarAccess.getFooterRule() ||
				   context == grammarAccess.getHeaderRule() ||
				   context == grammarAccess.getHeadlineRule() ||
				   context == grammarAccess.getLeftRule() ||
				   context == grammarAccess.getListItemRule() ||
				   context == grammarAccess.getNikuReportAttributeRule() ||
				   context == grammarAccess.getPrologRule() ||
				   context == grammarAccess.getReportAttributeRule() ||
				   context == grammarAccess.getRichTextRule() ||
				   context == grammarAccess.getRightRule() ||
				   context == grammarAccess.getStatusStatusSheetAttributeRule() ||
				   context == grammarAccess.getStatusTimesheetAttributeRule() ||
				   context == grammarAccess.getSummaryRule()) {
					sequence_RichText(context, (RichText) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.ROLLUP_ACCOUNT:
				if(context == grammarAccess.getReportAttributeRule() ||
				   context == grammarAccess.getRollupAccountRule()) {
					sequence_RollupAccount(context, (RollupAccount) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.ROLLUP_RESOURCE:
				if(context == grammarAccess.getExportAttributeRule() ||
				   context == grammarAccess.getIcalReportAttributeRule() ||
				   context == grammarAccess.getReportAttributeRule() ||
				   context == grammarAccess.getRollupResourceRule()) {
					sequence_RollupResource(context, (RollupResource) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.ROLLUP_TASK:
				if(context == grammarAccess.getExportAttributeRule() ||
				   context == grammarAccess.getIcalReportAttributeRule() ||
				   context == grammarAccess.getReportAttributeRule() ||
				   context == grammarAccess.getRollupTaskRule()) {
					sequence_RollupTask(context, (RollupTask) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.SCALE:
				if(context == grammarAccess.getColumnAttributeRule() ||
				   context == grammarAccess.getScaleRule()) {
					sequence_Scale(context, (Scale) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.SCENARIO:
				if(context == grammarAccess.getProjectAttributeRule() ||
				   context == grammarAccess.getScenarioRule()) {
					sequence_Scenario(context, (Scenario) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.SCENARIO_ICAL:
				if(context == grammarAccess.getIcalReportAttributeRule() ||
				   context == grammarAccess.getScenarioIcalRule()) {
					sequence_ScenarioIcal(context, (ScenarioIcal) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.SCENARIOS:
				if(context == grammarAccess.getExportAttributeRule() ||
				   context == grammarAccess.getReportAttributeRule() ||
				   context == grammarAccess.getScenariosRule()) {
					sequence_Scenarios(context, (Scenarios) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.SCHEDULED:
				if(context == grammarAccess.getScheduledRule() ||
				   context == grammarAccess.getTaskAttributeRule()) {
					sequence_Scheduled(context, (Scheduled) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.SCHEDULING:
				if(context == grammarAccess.getSchedulingRule() ||
				   context == grammarAccess.getTaskAttributeRule()) {
					sequence_Scheduling(context, (Scheduling) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.SELECT:
				if(context == grammarAccess.getAllocateResourceAttributeRule() ||
				   context == grammarAccess.getSelectRule()) {
					sequence_Select(context, (Select) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.SELF_CONTAINED:
				if(context == grammarAccess.getReportAttributeRule() ||
				   context == grammarAccess.getSelfContainedRule()) {
					sequence_SelfContained(context, (SelfContained) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.SHIFT:
				if(context == grammarAccess.getGlobalAttributeRule() ||
				   context == grammarAccess.getShiftRule()) {
					sequence_Shift(context, (Shift) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.SHIFT_TIMESHEET:
				if(context == grammarAccess.getShiftTimesheetRule() ||
				   context == grammarAccess.getTimesheetAttributeRule()) {
					sequence_ShiftTimesheet(context, (ShiftTimesheet) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.SHIFTS:
				if(context == grammarAccess.getResourceAttributeRule() ||
				   context == grammarAccess.getShiftsRule() ||
				   context == grammarAccess.getShiftsResourceRule() ||
				   context == grammarAccess.getShiftsTaskRule() ||
				   context == grammarAccess.getTaskAttributeRule()) {
					sequence_Shifts(context, (Shifts) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.SHIFTS_ALLOCATE:
				if(context == grammarAccess.getAllocateResourceAttributeRule() ||
				   context == grammarAccess.getShiftsAllocateRule()) {
					sequence_ShiftsAllocate(context, (ShiftsAllocate) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.SHIFTS_LIMIT:
				if(context == grammarAccess.getShiftsLimitRule()) {
					sequence_ShiftsLimit(context, (ShiftsLimit) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.SHORT_TIME_FORMAT:
				if(context == grammarAccess.getProjectAttributeRule() ||
				   context == grammarAccess.getShortTimeFormatRule()) {
					sequence_ShortTimeFormat(context, (ShortTimeFormat) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.SORT:
				if(context == grammarAccess.getReportAttributeRule() ||
				   context == grammarAccess.getSortRule() ||
				   context == grammarAccess.getSortAccountsRule() ||
				   context == grammarAccess.getSortJournalEntriesRule() ||
				   context == grammarAccess.getSortResourcesRule() ||
				   context == grammarAccess.getSortTasksRule() ||
				   context == grammarAccess.getStatusSheetReportAttributeRule()) {
					sequence_Sort(context, (Sort) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.START:
				if(context == grammarAccess.getColumnAttributeRule() ||
				   context == grammarAccess.getExportAttributeRule() ||
				   context == grammarAccess.getIcalReportAttributeRule() ||
				   context == grammarAccess.getNikuReportAttributeRule() ||
				   context == grammarAccess.getReportAttributeRule() ||
				   context == grammarAccess.getStartRule() ||
				   context == grammarAccess.getStatusSheetReportAttributeRule() ||
				   context == grammarAccess.getTaskAttributeRule() ||
				   context == grammarAccess.getTimesheetReportAttributeRule()) {
					sequence_Start(context, (Start) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.STATUS_SHEET:
				if(context == grammarAccess.getGlobalAttributeRule() ||
				   context == grammarAccess.getStatusSheetRule()) {
					sequence_StatusSheet(context, (StatusSheet) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.STATUS_SHEET_REPORT:
				if(context == grammarAccess.getGlobalAttributeRule() ||
				   context == grammarAccess.getStatusSheetReportRule()) {
					sequence_StatusSheetReport(context, (StatusSheetReport) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.STATUS_STATUS_SHEET:
				if(context == grammarAccess.getStatusStatusSheetRule() ||
				   context == grammarAccess.getTaskStatusSheetAttributeRule()) {
					sequence_StatusStatusSheet(context, (StatusStatusSheet) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.STATUS_TIMESHEET:
				if(context == grammarAccess.getStatusTimesheetRule() ||
				   context == grammarAccess.getTaskTimesheetAttributeRule() ||
				   context == grammarAccess.getTimesheetAttributeRule()) {
					sequence_StatusTimesheet(context, (StatusTimesheet) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.SUPPLEMENT_ACCOUNT:
				if(context == grammarAccess.getGlobalAttributeRule() ||
				   context == grammarAccess.getSupplementAccountRule()) {
					sequence_SupplementAccount(context, (SupplementAccount) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.SUPPLEMENT_REPORT:
				if(context == grammarAccess.getGlobalAttributeRule() ||
				   context == grammarAccess.getSupplementReportRule()) {
					sequence_SupplementReport(context, (SupplementReport) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.SUPPLEMENT_RESOURCE:
				if(context == grammarAccess.getGlobalAttributeRule() ||
				   context == grammarAccess.getResourceAttributeRule() ||
				   context == grammarAccess.getSupplementResourceRule()) {
					sequence_SupplementResource(context, (SupplementResource) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.SUPPLEMENT_TASK:
				if(context == grammarAccess.getGlobalAttributeRule() ||
				   context == grammarAccess.getSupplementTaskRule() ||
				   context == grammarAccess.getTaskAttributeRule()) {
					sequence_SupplementTask(context, (SupplementTask) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.TAG_FILE:
				if(context == grammarAccess.getGlobalAttributeRule() ||
				   context == grammarAccess.getTagFileRule()) {
					sequence_TagFile(context, (TagFile) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.TASK:
				if(context == grammarAccess.getGlobalAttributeRule() ||
				   context == grammarAccess.getTaskRule() ||
				   context == grammarAccess.getTaskAttributeRule()) {
					sequence_Task(context, (Task) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.TASK_ATTRIBUTES:
				if(context == grammarAccess.getExportAttributeRule() ||
				   context == grammarAccess.getTaskAttributesRule()) {
					sequence_TaskAttributes(context, (TaskAttributes) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.TASK_DEPENDENCY:
				if(context == grammarAccess.getDependsRule() ||
				   context == grammarAccess.getPrecedesRule() ||
				   context == grammarAccess.getTaskAttributeRule() ||
				   context == grammarAccess.getTaskDependencyRule()) {
					sequence_TaskDependency(context, (TaskDependency) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.TASK_PREFIX:
				if(context == grammarAccess.getTaskPrefixRule()) {
					sequence_TaskPrefix(context, (TaskPrefix) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.TASK_ROOT:
				if(context == grammarAccess.getReportAttributeRule() ||
				   context == grammarAccess.getTaskRootRule()) {
					sequence_TaskRoot(context, (TaskRoot) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.TASK_STATUS_SHEET:
				if(context == grammarAccess.getStatusSheetAttributeRule() ||
				   context == grammarAccess.getTaskStatusSheetRule() ||
				   context == grammarAccess.getTaskStatusSheetAttributeRule()) {
					sequence_TaskStatusSheet(context, (TaskStatusSheet) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.TASK_TIMESHEET:
				if(context == grammarAccess.getTaskTimesheetRule() ||
				   context == grammarAccess.getTimesheetAttributeRule()) {
					sequence_TaskTimesheet(context, (TaskTimesheet) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.TIME_FORMAT:
				if(context == grammarAccess.getReportAttributeRule() ||
				   context == grammarAccess.getTimeFormatRule()) {
					sequence_TimeFormat(context, (TimeFormat) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.TIMEOFF:
				if(context == grammarAccess.getNikuReportAttributeRule() ||
				   context == grammarAccess.getTimeoffRule()) {
					sequence_Timeoff(context, (Timeoff) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.TIMESHEET:
				if(context == grammarAccess.getGlobalAttributeRule() ||
				   context == grammarAccess.getTimesheetRule()) {
					sequence_Timesheet(context, (Timesheet) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.TIMESHEET_REPORT:
				if(context == grammarAccess.getGlobalAttributeRule() ||
				   context == grammarAccess.getTimesheetReportRule()) {
					sequence_TimesheetReport(context, (TimesheetReport) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.TIMEZONE:
				if(context == grammarAccess.getExportAttributeRule() ||
				   context == grammarAccess.getProjectAttributeRule() ||
				   context == grammarAccess.getReportAttributeRule() ||
				   context == grammarAccess.getTimezoneRule()) {
					sequence_Timezone(context, (Timezone) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.TIMING_RESOLUTION:
				if(context == grammarAccess.getProjectAttributeRule() ||
				   context == grammarAccess.getTimingResolutionRule()) {
					sequence_TimingResolution(context, (TimingResolution) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.TITLE:
				if(context == grammarAccess.getColumnAttributeRule() ||
				   context == grammarAccess.getNikuReportAttributeRule() ||
				   context == grammarAccess.getReportAttributeRule() ||
				   context == grammarAccess.getTitleRule()) {
					sequence_Title(context, (Title) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.TOOL_TIP:
				if(context == grammarAccess.getColumnAttributeRule() ||
				   context == grammarAccess.getToolTipRule()) {
					sequence_ToolTip(context, (ToolTip) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.TRACKING_SCENARIO:
				if(context == grammarAccess.getGlobalAttributeRule() ||
				   context == grammarAccess.getTrackingScenarioRule()) {
					sequence_TrackingScenario(context, (TrackingScenario) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.TREE_LEVEL:
				if(context == grammarAccess.getTreeLevelRule()) {
					sequence_TreeLevel(context, (TreeLevel) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.VACATION:
				if(context == grammarAccess.getResourceAttributeRule() ||
				   context == grammarAccess.getVacationResourceRule()) {
					sequence_VacationResource(context, (Vacation) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getVacationShiftRule()) {
					sequence_VacationShift(context, (Vacation) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getGlobalAttributeRule() ||
				   context == grammarAccess.getVacationRule()) {
					sequence_Vacation(context, (Vacation) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.WARN:
				if(context == grammarAccess.getResourceAttributeRule() ||
				   context == grammarAccess.getTaskAttributeRule() ||
				   context == grammarAccess.getWarnRule()) {
					sequence_Warn(context, (Warn) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.WEEK_STARTS:
				if(context == grammarAccess.getProjectAttributeRule() ||
				   context == grammarAccess.getWeekStartsRule()) {
					sequence_WeekStarts(context, (WeekStarts) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.WEEKDAYS:
				if(context == grammarAccess.getWeekdaysRule()) {
					sequence_Weekdays(context, (Weekdays) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.WIDTH:
				if(context == grammarAccess.getColumnAttributeRule() ||
				   context == grammarAccess.getWidthRule()) {
					sequence_Width(context, (Width) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.WORK:
				if(context == grammarAccess.getNewTaskAttributeRule() ||
				   context == grammarAccess.getTaskTimesheetAttributeRule() ||
				   context == grammarAccess.getWorkRule()) {
					sequence_Work(context, (Work) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.WORK_HOURS:
				if(context == grammarAccess.getWorkHoursRule()) {
					sequence_WorkHours(context, (WorkHours) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.WORKING_HOURS:
				if(context == grammarAccess.getProjectAttributeRule() ||
				   context == grammarAccess.getResourceAttributeRule() ||
				   context == grammarAccess.getWorkingHoursRule()) {
					sequence_WorkingHours(context, (WorkingHours) semanticObject); 
					return; 
				}
				else break;
			case ProjectPackage.YEARLY_WORKING_DAYS:
				if(context == grammarAccess.getProjectAttributeRule() ||
				   context == grammarAccess.getYearlyWorkingDaysRule()) {
					sequence_YearlyWorkingDays(context, (YearlyWorkingDays) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     account=[Account|ID]
	 *
	 * Features:
	 *    account[1, 1]
	 */
	protected void sequence_AccountPrefix(EObject context, AccountPrefix semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getAccountPrefix_Account()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getAccountPrefix_Account()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAccountPrefixAccess().getAccountAccountIDTerminalRuleCall_1_0_1(), semanticObject.getAccount());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     account=[Account|AbsoluteId]
	 *
	 * Features:
	 *    account[1, 1]
	 */
	protected void sequence_AccountRoot(EObject context, AccountRoot semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getAccountRoot_Account()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getAccountRoot_Account()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAccountRootAccess().getAccountAccountAbsoluteIdParserRuleCall_1_0_1(), semanticObject.getAccount());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (account=[Account|ID] share=XFloat)
	 *
	 * Features:
	 *    account[1, 1]
	 *    share[1, 1]
	 */
	protected void sequence_AccountShare(EObject context, AccountShare semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getAccountShare_Account()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getAccountShare_Account()));
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getAccountShare_Share()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getAccountShare_Share()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAccountShareAccess().getAccountAccountIDTerminalRuleCall_0_0_1(), semanticObject.getAccount());
		feeder.accept(grammarAccess.getAccountShareAccess().getShareXFloatParserRuleCall_1_0(), semanticObject.getShare());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (id=ID? name=STRING attributes+=AccountAttribute*)
	 *
	 * Features:
	 *    id[0, 1]
	 *    name[1, 1]
	 *    attributes[0, *]
	 */
	protected void sequence_Account(EObject context, Account semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     level=AlertLevel
	 *
	 * Features:
	 *    level[1, 1]
	 */
	protected void sequence_Alert(EObject context, Alert semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getAlert_Level()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getAlert_Level()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAlertAccess().getLevelAlertLevelEnumRuleCall_1_0(), semanticObject.getLevel());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (resource=[Resource|ID] attributes+=AllocateResourceAttribute*)
	 *
	 * Features:
	 *    resource[1, 1]
	 *    attributes[0, *]
	 */
	protected void sequence_AllocateResource(EObject context, AllocateResource semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (resources+=AllocateResource resources+=AllocateResource*)
	 *
	 * Features:
	 *    resources[1, *]
	 */
	protected void sequence_Allocate(EObject context, Allocate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (resources+=[Resource|ID] resources+=[Resource|ID]*)
	 *
	 * Features:
	 *    resources[1, *]
	 */
	protected void sequence_Alternative(EObject context, Alternative semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     resource=[Resource|ID]
	 *
	 * Features:
	 *    resource[1, 1]
	 */
	protected void sequence_Author(EObject context, Author semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getAuthor_Resource()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getAuthor_Resource()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAuthorAccess().getResourceResourceIDTerminalRuleCall_1_0_1(), semanticObject.getResource());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (cost=[Account|ID] revenue=[Account|ID])
	 *
	 * Features:
	 *    cost[1, 1]
	 *    revenue[1, 1]
	 */
	protected void sequence_Balance(EObject context, Balance semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getBalance_Cost()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getBalance_Cost()));
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getBalance_Revenue()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getBalance_Revenue()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBalanceAccess().getCostAccountIDTerminalRuleCall_1_0_1(), semanticObject.getCost());
		feeder.accept(grammarAccess.getBalanceAccess().getRevenueAccountIDTerminalRuleCall_2_0_1(), semanticObject.getRevenue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (task=[Task|ID] booking=Booking)
	 *
	 * Features:
	 *    task[1, 1]
	 *    booking[1, 1]
	 */
	protected void sequence_BookingResource(EObject context, BookingResource semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getBookingResource_Task()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getBookingResource_Task()));
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getBookingResource_Booking()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getBookingResource_Booking()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBookingResourceAccess().getTaskTaskIDTerminalRuleCall_1_0_1(), semanticObject.getTask());
		feeder.accept(grammarAccess.getBookingResourceAccess().getBookingBookingParserRuleCall_2_0(), semanticObject.getBooking());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (resource=[Resource|ID] booking=Booking)
	 *
	 * Features:
	 *    resource[1, 1]
	 *    booking[1, 1]
	 */
	protected void sequence_BookingTask(EObject context, BookingTask semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getBookingTask_Resource()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getBookingTask_Resource()));
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getBookingTask_Booking()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getBookingTask_Booking()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBookingTaskAccess().getResourceResourceIDTerminalRuleCall_1_0_1(), semanticObject.getResource());
		feeder.accept(grammarAccess.getBookingTaskAccess().getBookingBookingParserRuleCall_2_0(), semanticObject.getBooking());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (interval=Interval4 (overtime=INT? sloppy=INT?)?)
	 *
	 * Features:
	 *    interval[1, 1]
	 *    overtime[0, 1]
	 *    sloppy[0, 1]
	 */
	protected void sequence_Booking(EObject context, Booking semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression=LogicalExpression color=RGB)
	 *
	 * Features:
	 *    expression[1, 1]
	 *    color[1, 1]
	 */
	protected void sequence_CellColor(EObject context, CellColor semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getCellColor_Expression()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getCellColor_Expression()));
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getCellColor_Color()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getCellColor_Color()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCellColorAccess().getExpressionLogicalExpressionParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.accept(grammarAccess.getCellColorAccess().getColorRGBParserRuleCall_2_0(), semanticObject.getColor());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (text=STRING expresssion=LogicalExpression)
	 *
	 * Features:
	 *    text[1, 1]
	 *    expresssion[1, 1]
	 */
	protected void sequence_CellText(EObject context, CellText semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getCellText_Text()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getCellText_Text()));
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getCellText_Expresssion()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getCellText_Expresssion()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCellTextAccess().getTextSTRINGTerminalRuleCall_1_0(), semanticObject.getText());
		feeder.accept(grammarAccess.getCellTextAccess().getExpresssionLogicalExpressionParserRuleCall_2_0(), semanticObject.getExpresssion());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (accountShares+=AccountShare accountShares+=AccountShare*)
	 *
	 * Features:
	 *    accountShares[1, *]
	 */
	protected void sequence_ChargeSet(EObject context, ChargeSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (amount=XFloat applies=ChargeApplies)
	 *
	 * Features:
	 *    amount[1, 1]
	 *    applies[1, 1]
	 */
	protected void sequence_Charge(EObject context, Charge semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getCharge_Amount()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getCharge_Amount()));
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getCharge_Applies()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getCharge_Applies()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getChargeAccess().getAmountXFloatParserRuleCall_1_0(), semanticObject.getAmount());
		feeder.accept(grammarAccess.getChargeAccess().getAppliesChargeAppliesEnumRuleCall_2_0(), semanticObject.getApplies());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (id=ColumnId attribute=ColumnAttribute)
	 *
	 * Features:
	 *    id[1, 1]
	 *    attribute[1, 1]
	 */
	protected void sequence_Column(EObject context, Column semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getColumn_Id()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getColumn_Id()));
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getColumn_Attribute()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getColumn_Attribute()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getColumnAccess().getIdColumnIdEnumRuleCall_0_0(), semanticObject.getId());
		feeder.accept(grammarAccess.getColumnAccess().getAttributeColumnAttributeParserRuleCall_1_0(), semanticObject.getAttribute());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (columns+=Column columns+=Column*)
	 *
	 * Features:
	 *    columns[1, *]
	 */
	protected void sequence_Columns(EObject context, Columns semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     complete=XFloat
	 *
	 * Features:
	 *    complete[1, 1]
	 */
	protected void sequence_Complete(EObject context, Complete semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getComplete_Complete()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getComplete_Complete()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCompleteAccess().getCompleteXFloatParserRuleCall_1_0(), semanticObject.getComplete());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     text=STRING
	 *
	 * Features:
	 *    text[1, 1]
	 */
	protected void sequence_Copyright(EObject context, Copyright semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getCopyright_Text()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getCopyright_Text()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCopyrightAccess().getTextSTRINGTerminalRuleCall_1_0(), semanticObject.getText());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (date=ISODATE description=STRING amount=XFloat)
	 *
	 * Features:
	 *    date[1, 1]
	 *    description[1, 1]
	 *    amount[1, 1]
	 */
	protected void sequence_Credit(EObject context, Credit semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getCredit_Date()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getCredit_Date()));
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getCredit_Description()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getCredit_Description()));
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getCredit_Amount()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getCredit_Amount()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCreditAccess().getDateISODATETerminalRuleCall_1_0(), semanticObject.getDate());
		feeder.accept(grammarAccess.getCreditAccess().getDescriptionSTRINGTerminalRuleCall_2_0(), semanticObject.getDescription());
		feeder.accept(grammarAccess.getCreditAccess().getAmountXFloatParserRuleCall_3_0(), semanticObject.getAmount());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (columnId=ColumnId direction=CriterionDirection)
	 *
	 * Features:
	 *    columnId[1, 1]
	 *    direction[1, 1]
	 */
	protected void sequence_Criterion(EObject context, Criterion semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getCriterion_ColumnId()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getCriterion_ColumnId()));
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getCriterion_Direction()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getCriterion_Direction()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCriterionAccess().getColumnIdColumnIdEnumRuleCall_0_0(), semanticObject.getColumnId());
		feeder.accept(grammarAccess.getCriterionAccess().getDirectionCriterionDirectionEnumRuleCall_2_0(), semanticObject.getDirection());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     currency=STRING
	 *
	 * Features:
	 *    currency[1, 1]
	 */
	protected void sequence_Currency(EObject context, Currency semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getCurrency_Currency()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getCurrency_Currency()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCurrencyAccess().getCurrencySTRINGTerminalRuleCall_1_0(), semanticObject.getCurrency());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     dailyWorkingHours=XFloat
	 *
	 * Features:
	 *    dailyWorkingHours[1, 1]
	 */
	protected void sequence_DailyWorkingHours(EObject context, DailyWorkingHours semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getDailyWorkingHours_DailyWorkingHours()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getDailyWorkingHours_DailyWorkingHours()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDailyWorkingHoursAccess().getDailyWorkingHoursXFloatParserRuleCall_1_0(), semanticObject.getDailyWorkingHours());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (all?='*' | none?='-')
	 *
	 * Features:
	 *    all[0, 1]
	 *         EXCLUDE_IF_SET none
	 *    none[0, 1]
	 *         EXCLUDE_IF_SET all
	 */
	protected void sequence_Definitions(EObject context, Definitions semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (flags?='flags'? resources?='resources'? tasks?='tasks'? project?='project'? projectids?='projectids'?)
	 *
	 * Features:
	 *    flags[0, 1]
	 *    resources[0, 1]
	 *    tasks[0, 1]
	 *    project[0, 1]
	 *    projectids[0, 1]
	 */
	protected void sequence_Definitions(EObject context, Defintions semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=XFloat unit=TimeUnit)
	 *
	 * Features:
	 *    value[1, 1]
	 *    unit[1, 1]
	 */
	protected void sequence_DurationQuantity(EObject context, DurationQuantity semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getDurationQuantity_Value()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getDurationQuantity_Value()));
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getDurationQuantity_Unit()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getDurationQuantity_Unit()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDurationQuantityAccess().getValueXFloatParserRuleCall_0_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getDurationQuantityAccess().getUnitTimeUnitEnumRuleCall_1_0(), semanticObject.getUnit());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     duration=DurationQuantity
	 *
	 * Features:
	 *    duration[1, 1]
	 */
	protected void sequence_Duration(EObject context, Duration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getDuration_Duration()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getDuration_Duration()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDurationAccess().getDurationDurationQuantityParserRuleCall_1_0(), semanticObject.getDuration());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     efficiency=XFloat
	 *
	 * Features:
	 *    efficiency[1, 1]
	 */
	protected void sequence_Efficiency(EObject context, Efficiency semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getEfficiency_Efficiency()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getEfficiency_Efficiency()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEfficiencyAccess().getEfficiencyXFloatParserRuleCall_1_0(), semanticObject.getEfficiency());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     effort=DurationQuantity
	 *
	 * Features:
	 *    effort[1, 1]
	 */
	protected void sequence_Effort(EObject context, Effort semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getEffort_Effort()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getEffort_Effort()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEffortAccess().getEffortDurationQuantityParserRuleCall_1_0(), semanticObject.getEffort());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     address=STRING
	 *
	 * Features:
	 *    address[1, 1]
	 */
	protected void sequence_Email(EObject context, Email semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getEmail_Address()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getEmail_Address()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEmailAccess().getAddressSTRINGTerminalRuleCall_1_0(), semanticObject.getAddress());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     credit=XFloat
	 *
	 * Features:
	 *    credit[1, 1]
	 */
	protected void sequence_EndCredit(EObject context, EndCredit semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getEndCredit_Credit()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getEndCredit_Credit()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEndCreditAccess().getCreditXFloatParserRuleCall_1_0(), semanticObject.getCredit());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     end=ISODATE
	 *
	 * Features:
	 *    end[1, 1]
	 */
	protected void sequence_End(EObject context, End semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getEnd_End()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getEnd_End()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEndAccess().getEndISODATETerminalRuleCall_1_0(), semanticObject.getEnd());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (id=ID? filename=STRING attributes+=ExportAttribute*)
	 *
	 * Features:
	 *    id[0, 1]
	 *    filename[1, 1]
	 *    attributes[0, *]
	 */
	protected void sequence_Export(EObject context, Export semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (extends+=Extend*)
	 *
	 * Features:
	 *    extends[0, *]
	 */
	protected void sequence_ExtendResource(EObject context, ExtendResource semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (extends+=Extend*)
	 *
	 * Features:
	 *    extends[0, *]
	 */
	protected void sequence_ExtendTask(EObject context, ExtendTask semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (id=ID name=STRING (inherit?='inherit'? scenariospecific?='scenariospecific'?)?)
	 *
	 * Features:
	 *    id[1, 1]
	 *    name[1, 1]
	 *    inherit[0, 1]
	 *    scenariospecific[0, 1]
	 */
	protected void sequence_Extend(EObject context, Extend semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (extend=[Extend|ID] value=STRING)
	 *
	 * Features:
	 *    extend[1, 1]
	 *    value[1, 1]
	 */
	protected void sequence_ExtendedResourceAttribute(EObject context, ExtendedResourceAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getExtendedResourceAttribute_Extend()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getExtendedResourceAttribute_Extend()));
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getExtendedResourceAttribute_Value()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getExtendedResourceAttribute_Value()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExtendedResourceAttributeAccess().getExtendExtendIDTerminalRuleCall_0_0_1(), semanticObject.getExtend());
		feeder.accept(grammarAccess.getExtendedResourceAttributeAccess().getValueSTRINGTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (extend=[Extend|ID] value=STRING)
	 *
	 * Features:
	 *    extend[1, 1]
	 *    value[1, 1]
	 */
	protected void sequence_ExtendedTaskAttribute(EObject context, ExtendedTaskAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getExtendedTaskAttribute_Extend()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getExtendedTaskAttribute_Extend()));
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getExtendedTaskAttribute_Value()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getExtendedTaskAttribute_Value()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExtendedTaskAttributeAccess().getExtendExtendIDTerminalRuleCall_0_0_1(), semanticObject.getExtend());
		feeder.accept(grammarAccess.getExtendedTaskAttributeAccess().getValueSTRINGTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expression=LogicalExpression
	 *
	 * Features:
	 *    expression[1, 1]
	 */
	protected void sequence_Fail(EObject context, Fail semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getFail_Expression()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getFail_Expression()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFailAccess().getExpressionLogicalExpressionParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (flags+=ID flags+=ID*)
	 *
	 * Features:
	 *    flags[1, *]
	 */
	protected void sequence_Flags(EObject context, Flags semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     color=STRING
	 *
	 * Features:
	 *    color[1, 1]
	 */
	protected void sequence_FontColor(EObject context, FontColor semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getFontColor_Color()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getFontColor_Color()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFontColorAccess().getColorSTRINGTerminalRuleCall_1_0(), semanticObject.getColor());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (formats+=ReportFormat formats+=ReportFormat*)
	 *
	 * Features:
	 *    formats[1, *]
	 */
	protected void sequence_Formats(EObject context, Formats semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (project=Project attributes+=GlobalAttribute*)
	 *
	 * Features:
	 *    project[1, 1]
	 *    attributes[0, *]
	 */
	protected void sequence_Global(EObject context, Global semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression=LogicalExpression justification=Justification)
	 *
	 * Features:
	 *    expression[1, 1]
	 *    justification[1, 1]
	 */
	protected void sequence_HAlign(EObject context, HAlign semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getHAlign_Expression()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getHAlign_Expression()));
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getHAlign_Justification()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getHAlign_Justification()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHAlignAccess().getExpressionLogicalExpressionParserRuleCall_0_0(), semanticObject.getExpression());
		feeder.accept(grammarAccess.getHAlignAccess().getJustificationJustificationEnumRuleCall_1_0(), semanticObject.getJustification());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expression=LogicalFlagExpression
	 *
	 * Features:
	 *    expression[1, 1]
	 */
	protected void sequence_HideAccount(EObject context, HideAccount semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getHideAccount_Expression()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getHideAccount_Expression()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHideAccountAccess().getExpressionLogicalFlagExpressionParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expression=LogicalFlagExpression
	 *
	 * Features:
	 *    expression[1, 1]
	 */
	protected void sequence_HideJournalEntry(EObject context, HideJournalEntry semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getHideJournalEntry_Expression()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getHideJournalEntry_Expression()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHideJournalEntryAccess().getExpressionLogicalFlagExpressionParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expression=LogicalExpression
	 *
	 * Features:
	 *    expression[1, 1]
	 */
	protected void sequence_HideReport(EObject context, HideReport semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getHideReport_Expression()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getHideReport_Expression()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHideReportAccess().getExpressionLogicalExpressionParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expression=LogicalExpression
	 *
	 * Features:
	 *    expression[1, 1]
	 */
	protected void sequence_HideResource(EObject context, HideResource semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getHideResource_Expression()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getHideResource_Expression()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHideResourceAccess().getExpressionLogicalExpressionParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expression=LogicalExpression
	 *
	 * Features:
	 *    expression[1, 1]
	 */
	protected void sequence_HideTask(EObject context, HideTask semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getHideTask_Expression()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getHideTask_Expression()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHideTaskAccess().getExpressionLogicalExpressionParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (filename=STRING attributes+=IcalReportAttribute*)
	 *
	 * Features:
	 *    filename[1, 1]
	 *    attributes[0, *]
	 */
	protected void sequence_IcalReport(EObject context, IcalReport semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (start=ISODATE (end=ISODATE | duration=DurationQuantity))
	 *
	 * Features:
	 *    start[1, 1]
	 *    end[0, 1]
	 *         EXCLUDE_IF_SET duration
	 *    duration[0, 1]
	 *         EXCLUDE_IF_SET end
	 */
	protected void sequence_Interval1(EObject context, Interval1 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (start=ISODATE (end=ISODATE | duration=DurationQuantity))
	 *
	 * Features:
	 *    start[1, 1]
	 *    end[0, 1]
	 *         EXCLUDE_IF_SET duration
	 *    duration[0, 1]
	 *         EXCLUDE_IF_SET end
	 */
	protected void sequence_Interval2(EObject context, Interval2 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (start=ISODATE (end=ISODATE | duration=DurationQuantity)?)
	 *
	 * Features:
	 *    start[1, 1]
	 *    end[0, 1]
	 *         EXCLUDE_IF_SET duration
	 *    duration[0, 1]
	 *         EXCLUDE_IF_SET end
	 */
	protected void sequence_Interval3(EObject context, Interval3 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (start=ISODATE (end=ISODATE | duration=DurationQuantity)?)
	 *
	 * Features:
	 *    start[1, 1]
	 *    end[0, 1]
	 *         EXCLUDE_IF_SET duration
	 *    duration[0, 1]
	 *         EXCLUDE_IF_SET end
	 */
	protected void sequence_Interval4(EObject context, Interval4 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         flags?='flags'? 
	 *         property?='property'? 
	 *         details?='details'? 
	 *         author?='author'? 
	 *         headline?='headline'? 
	 *         date?='date'? 
	 *         timesheet?='timesheet'? 
	 *         propertyid?='propertyid'? 
	 *         summary?='summary'?
	 *     )
	 *
	 * Features:
	 *    flags[0, 1]
	 *    property[0, 1]
	 *    details[0, 1]
	 *    author[0, 1]
	 *    headline[0, 1]
	 *    date[0, 1]
	 *    timesheet[0, 1]
	 *    propertyid[0, 1]
	 *    summary[0, 1]
	 */
	protected void sequence_JournalAttributes(EObject context, JournalAttributes semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (date=ISODATE headline=STRING (alert=Alert? author=Author? details=Details? summary=Summary?)?)
	 *
	 * Features:
	 *    date[1, 1]
	 *    headline[1, 1]
	 *    alert[0, 1]
	 *    author[0, 1]
	 *    details[0, 1]
	 *    summary[0, 1]
	 */
	protected void sequence_JournalEntry(EObject context, JournalEntry semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     mode=JournalModeValue
	 *
	 * Features:
	 *    mode[1, 1]
	 */
	protected void sequence_JournalMode(EObject context, JournalMode semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getJournalMode_Mode()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getJournalMode_Mode()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getJournalModeAccess().getModeJournalModeValueEnumRuleCall_1_0(), semanticObject.getMode());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     length=DurationQuantity
	 *
	 * Features:
	 *    length[1, 1]
	 */
	protected void sequence_Length(EObject context, Length semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getLength_Length()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getLength_Length()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLengthAccess().getLengthDurationQuantityParserRuleCall_1_0(), semanticObject.getLength());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (end=ISODATE | period=Interval1 | (resources+=[Resource|ID] resources+=[Resource|ID]*) | start=ISODATE)
	 *
	 * Features:
	 *    end[0, 1]
	 *         EXCLUDE_IF_SET period
	 *         EXCLUDE_IF_SET resources
	 *         EXCLUDE_IF_SET resources
	 *         EXCLUDE_IF_SET start
	 *    period[0, 1]
	 *         EXCLUDE_IF_SET end
	 *         EXCLUDE_IF_SET resources
	 *         EXCLUDE_IF_SET resources
	 *         EXCLUDE_IF_SET start
	 *    resources[0, *]
	 *         EXCLUDE_IF_SET end
	 *         EXCLUDE_IF_SET period
	 *         EXCLUDE_IF_SET start
	 *    start[0, 1]
	 *         EXCLUDE_IF_SET end
	 *         EXCLUDE_IF_SET period
	 *         EXCLUDE_IF_SET resources
	 *         EXCLUDE_IF_SET resources
	 */
	protected void sequence_LimitAttribute(EObject context, LimitAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (duration=DurationQuantity attributes+=LimitAttribute*)
	 *
	 * Features:
	 *    duration[1, 1]
	 *    attributes[0, *]
	 */
	protected void sequence_Limit(EObject context, Limit semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (attributes+=LimitsAttribute*)
	 *
	 * Features:
	 *    attributes[0, *]
	 */
	protected void sequence_Limits(EObject context, Limits semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     type=ListTypeValues
	 *
	 * Features:
	 *    type[1, 1]
	 */
	protected void sequence_ListType(EObject context, ListType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getListType_Type()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getListType_Type()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getListTypeAccess().getTypeListTypeValuesEnumRuleCall_1_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     unit=LoadDisplayUnit
	 *
	 * Features:
	 *    unit[1, 1]
	 */
	protected void sequence_LoadUnit(EObject context, LoadUnit semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getLoadUnit_Unit()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getLoadUnit_Unit()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLoadUnitAccess().getUnitLoadDisplayUnitEnumRuleCall_1_0(), semanticObject.getUnit());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 *
	 * Features:
	 *    value[1, 1]
	 */
	protected void sequence_Macro(EObject context, Macro semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getMacro_Value()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getMacro_Value()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMacroAccess().getValueSTRINGTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (resources+=[Resource|ID] resources+=[Resource|ID]*)
	 *
	 * Features:
	 *    resources[1, *]
	 */
	protected void sequence_Managers(EObject context, Managers semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     mandatory?='mandatory'
	 *
	 * Features:
	 *    mandatory[1, 1]
	 */
	protected void sequence_Mandatory(EObject context, Mandatory semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getMandatory_Mandatory()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getMandatory_Mandatory()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMandatoryAccess().getMandatoryMandatoryKeyword_0(), semanticObject.isMandatory());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     maxEnd=ISODATE
	 *
	 * Features:
	 *    maxEnd[1, 1]
	 */
	protected void sequence_MaxEnd(EObject context, MaxEnd semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getMaxEnd_MaxEnd()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getMaxEnd_MaxEnd()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMaxEndAccess().getMaxEndISODATETerminalRuleCall_1_0(), semanticObject.getMaxEnd());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     maxStart=ISODATE
	 *
	 * Features:
	 *    maxStart[1, 1]
	 */
	protected void sequence_MaxStart(EObject context, MaxStart semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getMaxStart_MaxStart()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getMaxStart_MaxStart()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMaxStartAccess().getMaxStartISODATETerminalRuleCall_1_0(), semanticObject.getMaxStart());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     milestone?='milestone'
	 *
	 * Features:
	 *    milestone[1, 1]
	 */
	protected void sequence_Milestone(EObject context, Milestone semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getMilestone_Milestone()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getMilestone_Milestone()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMilestoneAccess().getMilestoneMilestoneKeyword_0(), semanticObject.isMilestone());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     minEnd=ISODATE
	 *
	 * Features:
	 *    minEnd[1, 1]
	 */
	protected void sequence_MinEnd(EObject context, MinEnd semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getMinEnd_MinEnd()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getMinEnd_MinEnd()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMinEndAccess().getMinEndISODATETerminalRuleCall_1_0(), semanticObject.getMinEnd());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     minStart=ISODATE
	 *
	 * Features:
	 *    minStart[1, 1]
	 */
	protected void sequence_MinStart(EObject context, MinStart semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getMinStart_MinStart()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getMinStart_MinStart()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMinStartAccess().getMinStartISODATETerminalRuleCall_1_0(), semanticObject.getMinStart());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (id=ID attributes+=NavigatorAttribute*)
	 *
	 * Features:
	 *    id[1, 1]
	 *    attributes[0, *]
	 */
	protected void sequence_Navigator(EObject context, Navigator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (id=ID text=STRING attributes+=NewTaskAttribute*)
	 *
	 * Features:
	 *    id[1, 1]
	 *    text[1, 1]
	 *    attributes[0, *]
	 */
	protected void sequence_NewTask(EObject context, NewTask semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (filename=STRING attributes+=NikuReportAttribute*)
	 *
	 * Features:
	 *    filename[1, 1]
	 *    attributes[0, *]
	 */
	protected void sequence_NikuReport(EObject context, NikuReport semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     note=STRING
	 *
	 * Features:
	 *    note[1, 1]
	 */
	protected void sequence_Note(EObject context, Note semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getNote_Note()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getNote_Note()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNoteAccess().getNoteSTRINGTerminalRuleCall_1_0(), semanticObject.getNote());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     now=ISODATE
	 *
	 * Features:
	 *    now[1, 1]
	 */
	protected void sequence_Now(EObject context, Now semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getNow_Now()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getNow_Now()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNowAccess().getNowISODATETerminalRuleCall_1_0(), semanticObject.getNow());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     period=Interval2
	 *
	 * Features:
	 *    period[1, 1]
	 */
	protected void sequence_Period(EObject context, Period semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getPeriod_Period()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getPeriod_Period()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPeriodAccess().getPeriodInterval2ParserRuleCall_1_0(), semanticObject.getPeriod());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     persistent?='persistent'
	 *
	 * Features:
	 *    persistent[1, 1]
	 */
	protected void sequence_Persistent(EObject context, Persistent semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getPersistent_Persistent()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getPersistent_Persistent()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPersistentAccess().getPersistentPersistentKeyword_0(), semanticObject.isPersistent());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     priority=INT
	 *
	 * Features:
	 *    priority[1, 1]
	 */
	protected void sequence_Priority(EObject context, Priority semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getPriority_Priority()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getPriority_Priority()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPriorityAccess().getPriorityINTTerminalRuleCall_1_0(), semanticObject.getPriority());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     projectId=ID
	 *
	 * Features:
	 *    projectId[1, 1]
	 */
	protected void sequence_ProjectId(EObject context, ProjectId semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getProjectId_ProjectId()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getProjectId_ProjectId()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getProjectIdAccess().getProjectIdIDTerminalRuleCall_1_0(), semanticObject.getProjectId());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (ids+=ID ids+=ID*)
	 *
	 * Features:
	 *    ids[1, *]
	 */
	protected void sequence_ProjectIds(EObject context, ProjectIds semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (id=ID? name=STRING version=STRING? interval=Interval2 attributes+=ProjectAttribute*)
	 *
	 * Features:
	 *    id[0, 1]
	 *    name[1, 1]
	 *    version[0, 1]
	 *    interval[1, 1]
	 *    attributes[0, *]
	 */
	protected void sequence_Project(EObject context, Project semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     listAttribute=PurgeReportAttribute
	 *
	 * Features:
	 *    listAttribute[1, 1]
	 */
	protected void sequence_PurgeReport(EObject context, PurgeReport semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getPurgeReport_ListAttribute()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getPurgeReport_ListAttribute()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPurgeReportAccess().getListAttributePurgeReportAttributeEnumRuleCall_1_0(), semanticObject.getListAttribute());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     listAttribute=PurgeResourceAttribute
	 *
	 * Features:
	 *    listAttribute[1, 1]
	 */
	protected void sequence_PurgeResource(EObject context, PurgeResource semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getPurgeResource_ListAttribute()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getPurgeResource_ListAttribute()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPurgeResourceAccess().getListAttributePurgeResourceAttributeEnumRuleCall_1_0(), semanticObject.getListAttribute());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     listAttribute=PurgeTaskAttribute
	 *
	 * Features:
	 *    listAttribute[1, 1]
	 */
	protected void sequence_PurgeTask(EObject context, PurgeTask semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getPurgeTask_ListAttribute()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getPurgeTask_ListAttribute()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPurgeTaskAccess().getListAttributePurgeTaskAttributeEnumRuleCall_1_0(), semanticObject.getListAttribute());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 *
	 * Features:
	 *    value[1, 1]
	 */
	protected void sequence_RGB(EObject context, RGB semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getRGB_Value()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getRGB_Value()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRGBAccess().getValueSTRINGTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     rate=XFloat
	 *
	 * Features:
	 *    rate[1, 1]
	 */
	protected void sequence_Rate(EObject context, Rate semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getRate_Rate()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getRate_Rate()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRateAccess().getRateXFloatParserRuleCall_1_0(), semanticObject.getRate());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (negativePrefix=STRING negativeSuffix=STRING thousandsSeparator=STRING fractionSeparator=STRING fractionDigits=INT)
	 *
	 * Features:
	 *    negativePrefix[1, 1]
	 *    negativeSuffix[1, 1]
	 *    thousandsSeparator[1, 1]
	 *    fractionSeparator[1, 1]
	 *    fractionDigits[1, 1]
	 */
	protected void sequence_RealFormat(EObject context, RealFormat semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getRealFormat_NegativePrefix()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getRealFormat_NegativePrefix()));
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getRealFormat_NegativeSuffix()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getRealFormat_NegativeSuffix()));
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getRealFormat_ThousandsSeparator()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getRealFormat_ThousandsSeparator()));
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getRealFormat_FractionSeparator()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getRealFormat_FractionSeparator()));
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getRealFormat_FractionDigits()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getRealFormat_FractionDigits()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRealFormatAccess().getNegativePrefixSTRINGTerminalRuleCall_0_0(), semanticObject.getNegativePrefix());
		feeder.accept(grammarAccess.getRealFormatAccess().getNegativeSuffixSTRINGTerminalRuleCall_1_0(), semanticObject.getNegativeSuffix());
		feeder.accept(grammarAccess.getRealFormatAccess().getThousandsSeparatorSTRINGTerminalRuleCall_2_0(), semanticObject.getThousandsSeparator());
		feeder.accept(grammarAccess.getRealFormatAccess().getFractionSeparatorSTRINGTerminalRuleCall_3_0(), semanticObject.getFractionSeparator());
		feeder.accept(grammarAccess.getRealFormatAccess().getFractionDigitsINTTerminalRuleCall_4_0(), semanticObject.getFractionDigits());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     remaining=DurationQuantity
	 *
	 * Features:
	 *    remaining[1, 1]
	 */
	protected void sequence_Remaining(EObject context, Remaining semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getRemaining_Remaining()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getRemaining_Remaining()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRemainingAccess().getRemainingDurationQuantityParserRuleCall_1_0(), semanticObject.getRemaining());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     report=[Report|ID]
	 *
	 * Features:
	 *    report[1, 1]
	 */
	protected void sequence_ReportPrefix(EObject context, ReportPrefix semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getReportPrefix_Report()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getReportPrefix_Report()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getReportPrefixAccess().getReportReportIDTerminalRuleCall_1_0_1(), semanticObject.getReport());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (id=ID? name=STRING attributes+=ReportAttribute*)
	 *
	 * Features:
	 *    id[0, 1]
	 *    name[1, 1]
	 *    attributes[0, *]
	 */
	protected void sequence_Report(EObject context, Report semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (vacation?='vacation'? booking?='booking'? workingHours?='workinghours'?)
	 *
	 * Features:
	 *    vacation[0, 1]
	 *    booking[0, 1]
	 *    workingHours[0, 1]
	 */
	protected void sequence_ResourceAttributes(EObject context, ResourceAttributes semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     resource=[Resource|ID]
	 *
	 * Features:
	 *    resource[1, 1]
	 */
	protected void sequence_ResourcePrefix(EObject context, ResourcePrefix semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getResourcePrefix_Resource()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getResourcePrefix_Resource()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getResourcePrefixAccess().getResourceResourceIDTerminalRuleCall_1_0_1(), semanticObject.getResource());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     resource=[Resource|AbsoluteId]
	 *
	 * Features:
	 *    resource[1, 1]
	 */
	protected void sequence_ResourceRoot(EObject context, ResourceRoot semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getResourceRoot_Resource()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getResourceRoot_Resource()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getResourceRootAccess().getResourceResourceAbsoluteIdParserRuleCall_1_0_1(), semanticObject.getResource());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (id=ID? name=STRING attributes+=ResourceAttribute*)
	 *
	 * Features:
	 *    id[0, 1]
	 *    name[1, 1]
	 *    attributes[0, *]
	 */
	protected void sequence_Resource(EObject context, Resource semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (resources+=[Resource|ID] resources+=[Resource|ID]*)
	 *
	 * Features:
	 *    resources[1, *]
	 */
	protected void sequence_Responsible(EObject context, Responsible semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     text=STRING
	 *
	 * Features:
	 *    text[1, 1]
	 */
	protected void sequence_RichText(EObject context, RichText semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getRichText_Text()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getRichText_Text()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRichTextAccess().getTextSTRINGTerminalRuleCall_0(), semanticObject.getText());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expression=LogicalExpression
	 *
	 * Features:
	 *    expression[1, 1]
	 */
	protected void sequence_RollupAccount(EObject context, RollupAccount semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getRollupAccount_Expression()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getRollupAccount_Expression()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRollupAccountAccess().getExpressionLogicalExpressionParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expression=LogicalExpression
	 *
	 * Features:
	 *    expression[1, 1]
	 */
	protected void sequence_RollupResource(EObject context, RollupResource semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getRollupResource_Expression()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getRollupResource_Expression()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRollupResourceAccess().getExpressionLogicalExpressionParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expression=LogicalExpression
	 *
	 * Features:
	 *    expression[1, 1]
	 */
	protected void sequence_RollupTask(EObject context, RollupTask semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getRollupTask_Expression()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getRollupTask_Expression()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRollupTaskAccess().getExpressionLogicalExpressionParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         scale='hour' | 
	 *         scale='day' | 
	 *         scale='week' | 
	 *         scale='month' | 
	 *         scale='quarter' | 
	 *         scale='year'
	 *     )
	 *
	 * Features:
	 *    scale[0, 6]
	 */
	protected void sequence_Scale(EObject context, Scale semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     scenario=[Scenario|ID]
	 *
	 * Features:
	 *    scenario[1, 1]
	 */
	protected void sequence_ScenarioIcal(EObject context, ScenarioIcal semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getScenarioIcal_Scenario()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getScenarioIcal_Scenario()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getScenarioIcalAccess().getScenarioScenarioIDTerminalRuleCall_1_0_1(), semanticObject.getScenario());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (id=ID name=STRING (active=YesNo? scenario=Scenario?)?)
	 *
	 * Features:
	 *    id[1, 1]
	 *    name[1, 1]
	 *    active[0, 1]
	 *    scenario[0, 1]
	 */
	protected void sequence_Scenario(EObject context, Scenario semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (scenarios+=[Scenario|ID] scenarios+=[Scenario|ID]*)
	 *
	 * Features:
	 *    scenarios[1, *]
	 */
	protected void sequence_Scenarios(EObject context, Scenarios semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     scheduled?='scheduled'
	 *
	 * Features:
	 *    scheduled[1, 1]
	 */
	protected void sequence_Scheduled(EObject context, Scheduled semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getScheduled_Scheduled()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getScheduled_Scheduled()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getScheduledAccess().getScheduledScheduledKeyword_0(), semanticObject.isScheduled());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     scheduling=SchedulingPolicy
	 *
	 * Features:
	 *    scheduling[1, 1]
	 */
	protected void sequence_Scheduling(EObject context, Scheduling semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getScheduling_Scheduling()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getScheduling_Scheduling()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSchedulingAccess().getSchedulingSchedulingPolicyEnumRuleCall_1_0(), semanticObject.getScheduling());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     argument=SelectArgument
	 *
	 * Features:
	 *    argument[1, 1]
	 */
	protected void sequence_Select(EObject context, Select semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getSelect_Argument()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getSelect_Argument()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSelectAccess().getArgumentSelectArgumentEnumRuleCall_1_0(), semanticObject.getArgument());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     selfcontained=YesNo
	 *
	 * Features:
	 *    selfcontained[1, 1]
	 */
	protected void sequence_SelfContained(EObject context, SelfContained semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getSelfContained_Selfcontained()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getSelfContained_Selfcontained()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSelfContainedAccess().getSelfcontainedYesNoEnumRuleCall_1_0(), semanticObject.getSelfcontained());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     shift=[Shift|ID]
	 *
	 * Features:
	 *    shift[1, 1]
	 */
	protected void sequence_ShiftTimesheet(EObject context, ShiftTimesheet semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getShiftTimesheet_Shift()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getShiftTimesheet_Shift()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getShiftTimesheetAccess().getShiftShiftIDTerminalRuleCall_1_0_1(), semanticObject.getShift());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (id=ID? name=STRING (replace='replace'? timezone=STRING? vacation=VacationShift? shift=Shift? workingHours=WorkingHours?)?)
	 *
	 * Features:
	 *    id[0, 1]
	 *    name[1, 1]
	 *    replace[0, 1]
	 *    timezone[0, 1]
	 *    vacation[0, 1]
	 *    shift[0, 1]
	 *    workingHours[0, 1]
	 */
	protected void sequence_Shift(EObject context, Shift semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (shift=[Shift|ID] (intervals+=Interval3 intervals+=Interval3*)?)
	 *
	 * Features:
	 *    shift[1, 1]
	 *    intervals[0, *]
	 */
	protected void sequence_ShiftsAllocate(EObject context, ShiftsAllocate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (shift=[Shift|ID] limit=Interval2?)
	 *
	 * Features:
	 *    shift[1, 1]
	 *    limit[0, 1]
	 */
	protected void sequence_ShiftsLimit(EObject context, ShiftsLimit semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (limits+=ShiftsLimit limits+=ShiftsLimit*)
	 *
	 * Features:
	 *    limits[1, *]
	 */
	protected void sequence_Shifts(EObject context, Shifts semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     shortTimeFormat=STRING
	 *
	 * Features:
	 *    shortTimeFormat[1, 1]
	 */
	protected void sequence_ShortTimeFormat(EObject context, ShortTimeFormat semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getShortTimeFormat_ShortTimeFormat()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getShortTimeFormat_ShortTimeFormat()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getShortTimeFormatAccess().getShortTimeFormatSTRINGTerminalRuleCall_1_0(), semanticObject.getShortTimeFormat());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((tree?='tree'? | criteria+=Criterion) criteria+=Criterion*)
	 *
	 * Features:
	 *    tree[0, 1]
	 *         EXCLUDE_IF_SET criteria
	 *    criteria[0, *]
	 */
	protected void sequence_Sort(EObject context, Sort semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     start=ISODATE
	 *
	 * Features:
	 *    start[1, 1]
	 */
	protected void sequence_Start(EObject context, Start semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getStart_Start()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getStart_Start()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStartAccess().getStartISODATETerminalRuleCall_1_0(), semanticObject.getStart());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (filename=STRING attributes+=StatusSheetReportAttribute*)
	 *
	 * Features:
	 *    filename[1, 1]
	 *    attributes[0, *]
	 */
	protected void sequence_StatusSheetReport(EObject context, StatusSheetReport semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (resource=[Resource|ID] interval=Interval4 attributes+=StatusSheetAttribute*)
	 *
	 * Features:
	 *    resource[1, 1]
	 *    interval[1, 1]
	 *    attributes[0, *]
	 */
	protected void sequence_StatusSheet(EObject context, StatusSheet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (level=AlertLevel text=STRING attributes+=StatusStatusSheetAttribute*)
	 *
	 * Features:
	 *    level[1, 1]
	 *    text[1, 1]
	 *    attributes[0, *]
	 */
	protected void sequence_StatusStatusSheet(EObject context, StatusStatusSheet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (level=AlertLevel text=STRING attributes+=StatusTimesheetAttribute*)
	 *
	 * Features:
	 *    level[1, 1]
	 *    text[1, 1]
	 *    attributes[0, *]
	 */
	protected void sequence_StatusTimesheet(EObject context, StatusTimesheet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (account=[Account|ID] attributes+=AccountAttribute*)
	 *
	 * Features:
	 *    account[1, 1]
	 *    attributes[0, *]
	 */
	protected void sequence_SupplementAccount(EObject context, SupplementAccount semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (report=[Report|ID] attributes+=ReportAttribute*)
	 *
	 * Features:
	 *    report[1, 1]
	 *    attributes[0, *]
	 */
	protected void sequence_SupplementReport(EObject context, SupplementReport semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (resource=[Resource|ID] attributes+=ResourceAttribute*)
	 *
	 * Features:
	 *    resource[1, 1]
	 *    attributes[0, *]
	 */
	protected void sequence_SupplementResource(EObject context, SupplementResource semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (task=[Task|TaskPath] attributes+=TaskAttribute*)
	 *
	 * Features:
	 *    task[1, 1]
	 *    attributes[0, *]
	 */
	protected void sequence_SupplementTask(EObject context, SupplementTask semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (id=ID? filename=STRING (hideResource=HideResource? hideTask=HideTask? rollupResource=RollupResource? rollupTask=RollupTask?)?)
	 *
	 * Features:
	 *    id[0, 1]
	 *    filename[1, 1]
	 *    hideResource[0, 1]
	 *    hideTask[0, 1]
	 *    rollupResource[0, 1]
	 *    rollupTask[0, 1]
	 */
	protected void sequence_TagFile(EObject context, TagFile semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         responsible?='responsible'? 
	 *         flags?='flags'? 
	 *         maxstart?='maxstart'? 
	 *         maxend?='maxend'? 
	 *         priority?='priority'? 
	 *         booking?='booking'? 
	 *         note?='note'? 
	 *         minstart?='minstart'? 
	 *         minend?='minend'? 
	 *         complete?='complete'? 
	 *         depends?='depends'?
	 *     )
	 *
	 * Features:
	 *    responsible[0, 1]
	 *    flags[0, 1]
	 *    maxstart[0, 1]
	 *    maxend[0, 1]
	 *    priority[0, 1]
	 *    booking[0, 1]
	 *    note[0, 1]
	 *    minstart[0, 1]
	 *    minend[0, 1]
	 *    complete[0, 1]
	 *    depends[0, 1]
	 */
	protected void sequence_TaskAttributes(EObject context, TaskAttributes semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (task=[Task|TaskPath] (gapDuration=GapDuration? gapLength=GapLength? policy=DependsPolicy?)?)
	 *
	 * Features:
	 *    task[1, 1]
	 *    gapDuration[0, 1]
	 *    gapLength[0, 1]
	 *    policy[0, 1]
	 */
	protected void sequence_TaskDependency(EObject context, TaskDependency semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     task=[Task|ID]
	 *
	 * Features:
	 *    task[1, 1]
	 */
	protected void sequence_TaskPrefix(EObject context, TaskPrefix semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getTaskPrefix_Task()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getTaskPrefix_Task()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTaskPrefixAccess().getTaskTaskIDTerminalRuleCall_1_0_1(), semanticObject.getTask());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     task=[Task|AbsoluteId]
	 *
	 * Features:
	 *    task[1, 1]
	 */
	protected void sequence_TaskRoot(EObject context, TaskRoot semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getTaskRoot_Task()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getTaskRoot_Task()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTaskRootAccess().getTaskTaskAbsoluteIdParserRuleCall_1_0_1(), semanticObject.getTask());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (task=[Task|AbsoluteId] attributes+=TaskStatusSheetAttribute*)
	 *
	 * Features:
	 *    task[1, 1]
	 *    attributes[0, *]
	 */
	protected void sequence_TaskStatusSheet(EObject context, TaskStatusSheet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (task=[Task|ID] attributes+=TaskTimesheetAttribute*)
	 *
	 * Features:
	 *    task[1, 1]
	 *    attributes[0, *]
	 */
	protected void sequence_TaskTimesheet(EObject context, TaskTimesheet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (id=ID? name=STRING attributes+=TaskAttribute*)
	 *
	 * Features:
	 *    id[0, 1]
	 *    name[1, 1]
	 *    attributes[0, *]
	 */
	protected void sequence_Task(EObject context, Task semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     timeformat=STRING
	 *
	 * Features:
	 *    timeformat[1, 1]
	 */
	protected void sequence_TimeFormat(EObject context, TimeFormat semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getTimeFormat_Timeformat()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getTimeFormat_Timeformat()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTimeFormatAccess().getTimeformatSTRINGTerminalRuleCall_1_0(), semanticObject.getTimeformat());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (id=STRING name=STRING)
	 *
	 * Features:
	 *    id[1, 1]
	 *    name[1, 1]
	 */
	protected void sequence_Timeoff(EObject context, Timeoff semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getTimeoff_Id()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getTimeoff_Id()));
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getTimeoff_Name()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getTimeoff_Name()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTimeoffAccess().getIdSTRINGTerminalRuleCall_1_0(), semanticObject.getId());
		feeder.accept(grammarAccess.getTimeoffAccess().getNameSTRINGTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (filename=STRING attributes+=TimesheetReportAttribute*)
	 *
	 * Features:
	 *    filename[1, 1]
	 *    attributes[0, *]
	 */
	protected void sequence_TimesheetReport(EObject context, TimesheetReport semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (resource=[Resource|ID] interval=Interval4 attributes+=TimesheetAttribute*)
	 *
	 * Features:
	 *    resource[1, 1]
	 *    interval[1, 1]
	 *    attributes[0, *]
	 */
	protected void sequence_Timesheet(EObject context, Timesheet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     timezone=STRING
	 *
	 * Features:
	 *    timezone[1, 1]
	 */
	protected void sequence_Timezone(EObject context, Timezone semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getTimezone_Timezone()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getTimezone_Timezone()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTimezoneAccess().getTimezoneSTRINGTerminalRuleCall_1_0(), semanticObject.getTimezone());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     timingResolution=INT
	 *
	 * Features:
	 *    timingResolution[1, 1]
	 */
	protected void sequence_TimingResolution(EObject context, TimingResolution semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getTimingResolution_TimingResolution()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getTimingResolution_TimingResolution()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTimingResolutionAccess().getTimingResolutionINTTerminalRuleCall_1_0(), semanticObject.getTimingResolution());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     title=STRING
	 *
	 * Features:
	 *    title[1, 1]
	 */
	protected void sequence_Title(EObject context, Title semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getTitle_Title()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getTitle_Title()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTitleAccess().getTitleSTRINGTerminalRuleCall_1_0(), semanticObject.getTitle());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (expression=LogicalExpression tip=STRING)
	 *
	 * Features:
	 *    expression[1, 1]
	 *    tip[1, 1]
	 */
	protected void sequence_ToolTip(EObject context, ToolTip semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getToolTip_Expression()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getToolTip_Expression()));
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getToolTip_Tip()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getToolTip_Tip()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getToolTipAccess().getExpressionLogicalExpressionParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.accept(grammarAccess.getToolTipAccess().getTipSTRINGTerminalRuleCall_2_0(), semanticObject.getTip());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     scenario=[Scenario|ID]
	 *
	 * Features:
	 *    scenario[1, 1]
	 */
	protected void sequence_TrackingScenario(EObject context, TrackingScenario semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getTrackingScenario_Scenario()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getTrackingScenario_Scenario()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTrackingScenarioAccess().getScenarioScenarioIDTerminalRuleCall_1_0_1(), semanticObject.getScenario());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     level=STRING
	 *
	 * Features:
	 *    level[1, 1]
	 */
	protected void sequence_TreeLevel(EObject context, TreeLevel semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getTreeLevel_Level()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getTreeLevel_Level()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTreeLevelAccess().getLevelSTRINGTerminalRuleCall_1_0(), semanticObject.getLevel());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING? intervals+=Interval3 intervals+=Interval3*)
	 *
	 * Features:
	 *    name[0, 1]
	 *    intervals[1, *]
	 */
	protected void sequence_VacationResource(EObject context, Vacation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING? (intervals+=Interval3 intervals+=Interval3*)?)
	 *
	 * Features:
	 *    name[0, 1]
	 *    intervals[0, *]
	 */
	protected void sequence_VacationShift(EObject context, Vacation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING intervals+=Interval3 intervals+=Interval3*)
	 *
	 * Features:
	 *    name[1, 1]
	 *    intervals[1, *]
	 */
	protected void sequence_Vacation(EObject context, Vacation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=LogicalExpression
	 *
	 * Features:
	 *    expression[1, 1]
	 */
	protected void sequence_Warn(EObject context, Warn semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getWarn_Expression()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getWarn_Expression()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWarnAccess().getExpressionLogicalExpressionParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (sunday?='weekstartssunday' | monday?='weekstartsmonday')
	 *
	 * Features:
	 *    sunday[0, 1]
	 *         EXCLUDE_IF_SET monday
	 *    monday[0, 1]
	 *         EXCLUDE_IF_SET sunday
	 */
	protected void sequence_WeekStarts(EObject context, WeekStarts semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (first=Weekday last=Weekday?)
	 *
	 * Features:
	 *    first[1, 1]
	 *    last[0, 1]
	 */
	protected void sequence_Weekdays(EObject context, Weekdays semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     width=XFloat
	 *
	 * Features:
	 *    width[1, 1]
	 */
	protected void sequence_Width(EObject context, Width semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getWidth_Width()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getWidth_Width()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWidthAccess().getWidthXFloatParserRuleCall_1_0(), semanticObject.getWidth());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (start=TIME stop=TIME)
	 *
	 * Features:
	 *    start[1, 1]
	 *    stop[1, 1]
	 */
	protected void sequence_WorkHours(EObject context, WorkHours semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getWorkHours_Start()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getWorkHours_Start()));
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getWorkHours_Stop()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getWorkHours_Stop()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWorkHoursAccess().getStartTIMETerminalRuleCall_0_0(), semanticObject.getStart());
		feeder.accept(grammarAccess.getWorkHoursAccess().getStopTIMETerminalRuleCall_2_0(), semanticObject.getStop());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=XFloat unit=WorkQuantityUnit)
	 *
	 * Features:
	 *    value[1, 1]
	 *    unit[1, 1]
	 */
	protected void sequence_Work(EObject context, Work semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getWork_Value()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getWork_Value()));
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getWork_Unit()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getWork_Unit()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWorkAccess().getValueXFloatParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getWorkAccess().getUnitWorkQuantityUnitEnumRuleCall_2_0(), semanticObject.getUnit());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (weekdays+=Weekdays weekdays+=Weekdays* (off?='off' | (hours+=WorkHours hours+=WorkHours*)))
	 *
	 * Features:
	 *    weekdays[1, *]
	 *    off[0, 1]
	 *         EXCLUDE_IF_SET hours
	 *         EXCLUDE_IF_SET hours
	 *    hours[0, *]
	 *         EXCLUDE_IF_SET off
	 */
	protected void sequence_WorkingHours(EObject context, WorkingHours semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     yearlyWorkingDays=INT
	 *
	 * Features:
	 *    yearlyWorkingDays[1, 1]
	 */
	protected void sequence_YearlyWorkingDays(EObject context, YearlyWorkingDays semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProjectPackage.eINSTANCE.getYearlyWorkingDays_YearlyWorkingDays()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectPackage.eINSTANCE.getYearlyWorkingDays_YearlyWorkingDays()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getYearlyWorkingDaysAccess().getYearlyWorkingDaysINTTerminalRuleCall_1_0(), semanticObject.getYearlyWorkingDays());
		feeder.finish();
	}
}
