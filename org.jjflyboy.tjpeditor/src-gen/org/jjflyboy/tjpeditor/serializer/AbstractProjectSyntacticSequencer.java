package org.jjflyboy.tjpeditor.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.jjflyboy.tjpeditor.services.ProjectGrammarAccess;

@SuppressWarnings("restriction")
public class AbstractProjectSyntacticSequencer extends AbstractSyntacticSequencer {

	protected ProjectGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Account___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q;
	protected AbstractElementAlias match_AllocateResource___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__q;
	protected AbstractElementAlias match_Booking___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__q;
	protected AbstractElementAlias match_Caption_Center_Epilog_Footer_Header_Headline_Left_Prolog_Right_CaptionKeyword_0_or_CenterKeyword_0_or_EpilogKeyword_0_or_FooterKeyword_0_or_HeaderKeyword_0_or_HeadlineKeyword_0_or_LeftKeyword_0_or_PrologKeyword_0_or_RightKeyword_0;
	protected AbstractElementAlias match_CurrencyFormat_NumberFormat_CurrencyformatKeyword_0_or_NumberformatKeyword_0;
	protected AbstractElementAlias match_DailyMax_DailyMin_Maximum_Minimum_MonthlyMax_MonthlyMin_WeeklyMax_WeeklyMin_DailymaxKeyword_0_or_DailyminKeyword_0_or_MaximumKeyword_0_or_MinimumKeyword_0_or_MonthlymaxKeyword_0_or_MonthlyminKeyword_0_or_WeeklymaxKeyword_0_or_WeeklyminKeyword_0;
	protected AbstractElementAlias match_Depends_Precedes_DependsKeyword_0_or_PrecedesKeyword_0;
	protected AbstractElementAlias match_Details_Summary_DetailsKeyword_0_or_SummaryKeyword_0;
	protected AbstractElementAlias match_Limit___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q;
	protected AbstractElementAlias match_Limits___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q;
	protected AbstractElementAlias match_Navigator___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q;
	protected AbstractElementAlias match_NewTask___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q;
	protected AbstractElementAlias match_NikuReport___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__q;
	protected AbstractElementAlias match_Project___LeftCurlyBracketKeyword_5_0_RightCurlyBracketKeyword_5_2__q;
	protected AbstractElementAlias match_Report___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q;
	protected AbstractElementAlias match_ResourceReport_TaskReport_TextReport_ResourcereportKeyword_0_or_TaskreportKeyword_0_or_TextreportKeyword_0;
	protected AbstractElementAlias match_Resource___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q;
	protected AbstractElementAlias match_Scenario___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q;
	protected AbstractElementAlias match_Shift___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q;
	protected AbstractElementAlias match_SortResources_SortTasks_SortresourcesKeyword_0_or_SorttasksKeyword_0;
	protected AbstractElementAlias match_StatusStatusSheet___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q;
	protected AbstractElementAlias match_SupplementAccount___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q;
	protected AbstractElementAlias match_SupplementReport___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q;
	protected AbstractElementAlias match_SupplementResource___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q;
	protected AbstractElementAlias match_SupplementTask___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q;
	protected AbstractElementAlias match_TagFile___LeftCurlyBracketKeyword_3_0_0_RightCurlyBracketKeyword_3_3_1__q;
	protected AbstractElementAlias match_TaskDependency___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__q;
	protected AbstractElementAlias match_TaskStatusSheet___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q;
	protected AbstractElementAlias match_TaskTimesheet___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q;
	protected AbstractElementAlias match_Task___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q;
	protected AbstractElementAlias match_TimesheetReport___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q;
	protected AbstractElementAlias match_Timesheet_LeftCurlyBracketKeyword_3_0_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ProjectGrammarAccess) access;
		match_Account___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getAccountAccess().getLeftCurlyBracketKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getAccountAccess().getRightCurlyBracketKeyword_3_2()));
		match_AllocateResource___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getAllocateResourceAccess().getLeftCurlyBracketKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getAllocateResourceAccess().getRightCurlyBracketKeyword_1_2()));
		match_Booking___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getBookingAccess().getLeftCurlyBracketKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getBookingAccess().getRightCurlyBracketKeyword_1_2()));
		match_Caption_Center_Epilog_Footer_Header_Headline_Left_Prolog_Right_CaptionKeyword_0_or_CenterKeyword_0_or_EpilogKeyword_0_or_FooterKeyword_0_or_HeaderKeyword_0_or_HeadlineKeyword_0_or_LeftKeyword_0_or_PrologKeyword_0_or_RightKeyword_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getCaptionAccess().getCaptionKeyword_0()), new TokenAlias(false, false, grammarAccess.getCenterAccess().getCenterKeyword_0()), new TokenAlias(false, false, grammarAccess.getEpilogAccess().getEpilogKeyword_0()), new TokenAlias(false, false, grammarAccess.getFooterAccess().getFooterKeyword_0()), new TokenAlias(false, false, grammarAccess.getHeaderAccess().getHeaderKeyword_0()), new TokenAlias(false, false, grammarAccess.getHeadlineAccess().getHeadlineKeyword_0()), new TokenAlias(false, false, grammarAccess.getLeftAccess().getLeftKeyword_0()), new TokenAlias(false, false, grammarAccess.getPrologAccess().getPrologKeyword_0()), new TokenAlias(false, false, grammarAccess.getRightAccess().getRightKeyword_0()));
		match_CurrencyFormat_NumberFormat_CurrencyformatKeyword_0_or_NumberformatKeyword_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getCurrencyFormatAccess().getCurrencyformatKeyword_0()), new TokenAlias(false, false, grammarAccess.getNumberFormatAccess().getNumberformatKeyword_0()));
		match_DailyMax_DailyMin_Maximum_Minimum_MonthlyMax_MonthlyMin_WeeklyMax_WeeklyMin_DailymaxKeyword_0_or_DailyminKeyword_0_or_MaximumKeyword_0_or_MinimumKeyword_0_or_MonthlymaxKeyword_0_or_MonthlyminKeyword_0_or_WeeklymaxKeyword_0_or_WeeklyminKeyword_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getDailyMaxAccess().getDailymaxKeyword_0()), new TokenAlias(false, false, grammarAccess.getDailyMinAccess().getDailyminKeyword_0()), new TokenAlias(false, false, grammarAccess.getMaximumAccess().getMaximumKeyword_0()), new TokenAlias(false, false, grammarAccess.getMinimumAccess().getMinimumKeyword_0()), new TokenAlias(false, false, grammarAccess.getMonthlyMaxAccess().getMonthlymaxKeyword_0()), new TokenAlias(false, false, grammarAccess.getMonthlyMinAccess().getMonthlyminKeyword_0()), new TokenAlias(false, false, grammarAccess.getWeeklyMaxAccess().getWeeklymaxKeyword_0()), new TokenAlias(false, false, grammarAccess.getWeeklyMinAccess().getWeeklyminKeyword_0()));
		match_Depends_Precedes_DependsKeyword_0_or_PrecedesKeyword_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getDependsAccess().getDependsKeyword_0()), new TokenAlias(false, false, grammarAccess.getPrecedesAccess().getPrecedesKeyword_0()));
		match_Details_Summary_DetailsKeyword_0_or_SummaryKeyword_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getDetailsAccess().getDetailsKeyword_0()), new TokenAlias(false, false, grammarAccess.getSummaryAccess().getSummaryKeyword_0()));
		match_Limit___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getLimitAccess().getLeftCurlyBracketKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getLimitAccess().getRightCurlyBracketKeyword_2_2()));
		match_Limits___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getLimitsAccess().getLeftCurlyBracketKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getLimitsAccess().getRightCurlyBracketKeyword_2_2()));
		match_Navigator___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getNavigatorAccess().getLeftCurlyBracketKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getNavigatorAccess().getRightCurlyBracketKeyword_2_2()));
		match_NewTask___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getNewTaskAccess().getLeftCurlyBracketKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getNewTaskAccess().getRightCurlyBracketKeyword_3_2()));
		match_NikuReport___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getNikuReportAccess().getLeftCurlyBracketKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getNikuReportAccess().getRightCurlyBracketKeyword_1_2()));
		match_Project___LeftCurlyBracketKeyword_5_0_RightCurlyBracketKeyword_5_2__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_5_2()));
		match_Report___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getReportAccess().getLeftCurlyBracketKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getReportAccess().getRightCurlyBracketKeyword_2_2()));
		match_ResourceReport_TaskReport_TextReport_ResourcereportKeyword_0_or_TaskreportKeyword_0_or_TextreportKeyword_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getResourceReportAccess().getResourcereportKeyword_0()), new TokenAlias(false, false, grammarAccess.getTaskReportAccess().getTaskreportKeyword_0()), new TokenAlias(false, false, grammarAccess.getTextReportAccess().getTextreportKeyword_0()));
		match_Resource___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_3_2()));
		match_Scenario___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getScenarioAccess().getLeftCurlyBracketKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getScenarioAccess().getRightCurlyBracketKeyword_3_2()));
		match_Shift___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getShiftAccess().getLeftCurlyBracketKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getShiftAccess().getRightCurlyBracketKeyword_3_2()));
		match_SortResources_SortTasks_SortresourcesKeyword_0_or_SorttasksKeyword_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getSortResourcesAccess().getSortresourcesKeyword_0()), new TokenAlias(false, false, grammarAccess.getSortTasksAccess().getSorttasksKeyword_0()));
		match_StatusStatusSheet___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getStatusStatusSheetAccess().getLeftCurlyBracketKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getStatusStatusSheetAccess().getRightCurlyBracketKeyword_3_2()));
		match_SupplementAccount___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getSupplementAccountAccess().getLeftCurlyBracketKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getSupplementAccountAccess().getRightCurlyBracketKeyword_3_2()));
		match_SupplementReport___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getSupplementReportAccess().getLeftCurlyBracketKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getSupplementReportAccess().getRightCurlyBracketKeyword_3_2()));
		match_SupplementResource___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getSupplementResourceAccess().getLeftCurlyBracketKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getSupplementResourceAccess().getRightCurlyBracketKeyword_3_2()));
		match_SupplementTask___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getSupplementTaskAccess().getLeftCurlyBracketKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getSupplementTaskAccess().getRightCurlyBracketKeyword_3_2()));
		match_TagFile___LeftCurlyBracketKeyword_3_0_0_RightCurlyBracketKeyword_3_3_1__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getTagFileAccess().getLeftCurlyBracketKeyword_3_0_0()), new TokenAlias(false, false, grammarAccess.getTagFileAccess().getRightCurlyBracketKeyword_3_3_1()));
		match_TaskDependency___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getTaskDependencyAccess().getLeftCurlyBracketKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getTaskDependencyAccess().getRightCurlyBracketKeyword_1_2()));
		match_TaskStatusSheet___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getTaskStatusSheetAccess().getLeftCurlyBracketKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getTaskStatusSheetAccess().getRightCurlyBracketKeyword_2_2()));
		match_TaskTimesheet___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getTaskTimesheetAccess().getLeftCurlyBracketKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getTaskTimesheetAccess().getRightCurlyBracketKeyword_2_2()));
		match_Task___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_3_2()));
		match_TimesheetReport___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getTimesheetReportAccess().getLeftCurlyBracketKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getTimesheetReportAccess().getRightCurlyBracketKeyword_3_2()));
		match_Timesheet_LeftCurlyBracketKeyword_3_0_q = new TokenAlias(true, false, grammarAccess.getTimesheetAccess().getLeftCurlyBracketKeyword_3_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Account___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q.equals(syntax))
				emit_Account___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AllocateResource___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__q.equals(syntax))
				emit_AllocateResource___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Booking___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__q.equals(syntax))
				emit_Booking___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Caption_Center_Epilog_Footer_Header_Headline_Left_Prolog_Right_CaptionKeyword_0_or_CenterKeyword_0_or_EpilogKeyword_0_or_FooterKeyword_0_or_HeaderKeyword_0_or_HeadlineKeyword_0_or_LeftKeyword_0_or_PrologKeyword_0_or_RightKeyword_0.equals(syntax))
				emit_Caption_Center_Epilog_Footer_Header_Headline_Left_Prolog_Right_CaptionKeyword_0_or_CenterKeyword_0_or_EpilogKeyword_0_or_FooterKeyword_0_or_HeaderKeyword_0_or_HeadlineKeyword_0_or_LeftKeyword_0_or_PrologKeyword_0_or_RightKeyword_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_CurrencyFormat_NumberFormat_CurrencyformatKeyword_0_or_NumberformatKeyword_0.equals(syntax))
				emit_CurrencyFormat_NumberFormat_CurrencyformatKeyword_0_or_NumberformatKeyword_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DailyMax_DailyMin_Maximum_Minimum_MonthlyMax_MonthlyMin_WeeklyMax_WeeklyMin_DailymaxKeyword_0_or_DailyminKeyword_0_or_MaximumKeyword_0_or_MinimumKeyword_0_or_MonthlymaxKeyword_0_or_MonthlyminKeyword_0_or_WeeklymaxKeyword_0_or_WeeklyminKeyword_0.equals(syntax))
				emit_DailyMax_DailyMin_Maximum_Minimum_MonthlyMax_MonthlyMin_WeeklyMax_WeeklyMin_DailymaxKeyword_0_or_DailyminKeyword_0_or_MaximumKeyword_0_or_MinimumKeyword_0_or_MonthlymaxKeyword_0_or_MonthlyminKeyword_0_or_WeeklymaxKeyword_0_or_WeeklyminKeyword_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Depends_Precedes_DependsKeyword_0_or_PrecedesKeyword_0.equals(syntax))
				emit_Depends_Precedes_DependsKeyword_0_or_PrecedesKeyword_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Details_Summary_DetailsKeyword_0_or_SummaryKeyword_0.equals(syntax))
				emit_Details_Summary_DetailsKeyword_0_or_SummaryKeyword_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Limit___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q.equals(syntax))
				emit_Limit___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Limits___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q.equals(syntax))
				emit_Limits___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Navigator___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q.equals(syntax))
				emit_Navigator___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_NewTask___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q.equals(syntax))
				emit_NewTask___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_NikuReport___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__q.equals(syntax))
				emit_NikuReport___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Project___LeftCurlyBracketKeyword_5_0_RightCurlyBracketKeyword_5_2__q.equals(syntax))
				emit_Project___LeftCurlyBracketKeyword_5_0_RightCurlyBracketKeyword_5_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Report___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q.equals(syntax))
				emit_Report___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ResourceReport_TaskReport_TextReport_ResourcereportKeyword_0_or_TaskreportKeyword_0_or_TextreportKeyword_0.equals(syntax))
				emit_ResourceReport_TaskReport_TextReport_ResourcereportKeyword_0_or_TaskreportKeyword_0_or_TextreportKeyword_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Resource___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q.equals(syntax))
				emit_Resource___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Scenario___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q.equals(syntax))
				emit_Scenario___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Shift___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q.equals(syntax))
				emit_Shift___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SortResources_SortTasks_SortresourcesKeyword_0_or_SorttasksKeyword_0.equals(syntax))
				emit_SortResources_SortTasks_SortresourcesKeyword_0_or_SorttasksKeyword_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_StatusStatusSheet___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q.equals(syntax))
				emit_StatusStatusSheet___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SupplementAccount___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q.equals(syntax))
				emit_SupplementAccount___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SupplementReport___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q.equals(syntax))
				emit_SupplementReport___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SupplementResource___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q.equals(syntax))
				emit_SupplementResource___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SupplementTask___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q.equals(syntax))
				emit_SupplementTask___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TagFile___LeftCurlyBracketKeyword_3_0_0_RightCurlyBracketKeyword_3_3_1__q.equals(syntax))
				emit_TagFile___LeftCurlyBracketKeyword_3_0_0_RightCurlyBracketKeyword_3_3_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TaskDependency___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__q.equals(syntax))
				emit_TaskDependency___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TaskStatusSheet___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q.equals(syntax))
				emit_TaskStatusSheet___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TaskTimesheet___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q.equals(syntax))
				emit_TaskTimesheet___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Task___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q.equals(syntax))
				emit_Task___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TimesheetReport___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q.equals(syntax))
				emit_TimesheetReport___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Timesheet_LeftCurlyBracketKeyword_3_0_q.equals(syntax))
				emit_Timesheet_LeftCurlyBracketKeyword_3_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_Account___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_AllocateResource___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_Booking___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (
	     'left' | 
	     'caption' | 
	     'right' | 
	     'center' | 
	     'footer' | 
	     'prolog' | 
	     'header' | 
	     'headline' | 
	     'epilog'
	 )
	 */
	protected void emit_Caption_Center_Epilog_Footer_Header_Headline_Left_Prolog_Right_CaptionKeyword_0_or_CenterKeyword_0_or_EpilogKeyword_0_or_FooterKeyword_0_or_HeaderKeyword_0_or_HeadlineKeyword_0_or_LeftKeyword_0_or_PrologKeyword_0_or_RightKeyword_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'numberformat' | 'currencyformat'
	 */
	protected void emit_CurrencyFormat_NumberFormat_CurrencyformatKeyword_0_or_NumberformatKeyword_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (
	     'monthlymax' | 
	     'weeklymin' | 
	     'dailymin' | 
	     'monthlymin' | 
	     'weeklymax' | 
	     'minimum' | 
	     'dailymax' | 
	     'maximum'
	 )
	 */
	protected void emit_DailyMax_DailyMin_Maximum_Minimum_MonthlyMax_MonthlyMin_WeeklyMax_WeeklyMin_DailymaxKeyword_0_or_DailyminKeyword_0_or_MaximumKeyword_0_or_MinimumKeyword_0_or_MonthlymaxKeyword_0_or_MonthlyminKeyword_0_or_WeeklymaxKeyword_0_or_WeeklyminKeyword_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'depends' | 'precedes'
	 */
	protected void emit_Depends_Precedes_DependsKeyword_0_or_PrecedesKeyword_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'summary' | 'details'
	 */
	protected void emit_Details_Summary_DetailsKeyword_0_or_SummaryKeyword_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_Limit___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_Limits___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_Navigator___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_NewTask___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_NikuReport___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_Project___LeftCurlyBracketKeyword_5_0_RightCurlyBracketKeyword_5_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_Report___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'textreport' | 'taskreport' | 'resourcereport'
	 */
	protected void emit_ResourceReport_TaskReport_TextReport_ResourcereportKeyword_0_or_TaskreportKeyword_0_or_TextreportKeyword_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_Resource___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_Scenario___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_Shift___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'sortresources' | 'sorttasks'
	 */
	protected void emit_SortResources_SortTasks_SortresourcesKeyword_0_or_SorttasksKeyword_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_StatusStatusSheet___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_SupplementAccount___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_SupplementReport___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_SupplementResource___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_SupplementTask___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_TagFile___LeftCurlyBracketKeyword_3_0_0_RightCurlyBracketKeyword_3_3_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_TaskDependency___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_TaskStatusSheet___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_TaskTimesheet___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_Task___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_TimesheetReport___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '{'?
	 */
	protected void emit_Timesheet_LeftCurlyBracketKeyword_3_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
