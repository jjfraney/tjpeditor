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
	protected AbstractElementAlias match_AccountReport_ResourceReport_TaskReport_TextReport_AccountreportKeyword_0_or_ResourcereportKeyword_0_or_TaskreportKeyword_0_or_TextreportKeyword_0;
	protected AbstractElementAlias match_Account___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q;
	protected AbstractElementAlias match_AllocateResource___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__q;
	protected AbstractElementAlias match_Booking___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__q;
	protected AbstractElementAlias match_Caption_Center_Epilog_Footer_Header_Headline_Left_Prolog_Right_CaptionKeyword_0_or_CenterKeyword_0_or_EpilogKeyword_0_or_FooterKeyword_0_or_HeaderKeyword_0_or_HeadlineKeyword_0_or_LeftKeyword_0_or_PrologKeyword_0_or_RightKeyword_0;
	protected AbstractElementAlias match_CurrencyFormat_NumberFormat_CurrencyformatKeyword_0_or_NumberformatKeyword_0;
	protected AbstractElementAlias match_DailyMax_DailyMin_Maximum_Minimum_MonthlyMax_MonthlyMin_WeeklyMax_WeeklyMin_DailymaxKeyword_0_or_DailyminKeyword_0_or_MaximumKeyword_0_or_MinimumKeyword_0_or_MonthlymaxKeyword_0_or_MonthlyminKeyword_0_or_WeeklymaxKeyword_0_or_WeeklyminKeyword_0;
	protected AbstractElementAlias match_Depends_Precedes_DependsKeyword_0_or_PrecedesKeyword_0;
	protected AbstractElementAlias match_Details_Summary_DetailsKeyword_0_or_SummaryKeyword_0;
	protected AbstractElementAlias match_Export___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q;
	protected AbstractElementAlias match_ExtendResource___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q;
	protected AbstractElementAlias match_ExtendTask___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q;
	protected AbstractElementAlias match_Extend_DateKeyword_0_1_or_ReferenceKeyword_0_0_or_RichtextKeyword_0_2_or_TextKeyword_0_3;
	protected AbstractElementAlias match_Extend___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q;
	protected AbstractElementAlias match_Function_HasalertKeyword_1_0_0_0_or_Hasalert_Keyword_1_0_0_1;
	protected AbstractElementAlias match_Function_IsactiveKeyword_1_1_0_0_or_Isactive_Keyword_1_1_0_1;
	protected AbstractElementAlias match_Function_IschildofKeyword_1_2_0_0_or_Ischildof_Keyword_1_2_0_1;
	protected AbstractElementAlias match_Function_IsdependencyofKeyword_1_3_0_0_or_Isdependencyof_Keyword_1_3_0_1;
	protected AbstractElementAlias match_Function_IsdutyofKeyword_1_4_0_0_or_Isdutyof_Keyword_1_4_0_1;
	protected AbstractElementAlias match_Function_IsfeatureofKeyword_1_5_0_0_or_Isfeatureof_Keyword_1_5_0_1;
	protected AbstractElementAlias match_Function_IsmilestoneKeyword_1_7_0_0_or_Ismilestone_Keyword_1_7_0_1;
	protected AbstractElementAlias match_Function_IsongoingKeyword_1_8_0_0_or_Isongoing_Keyword_1_8_0_1;
	protected AbstractElementAlias match_Function_IsresponsbilityofKeyword_1_10_0_0_or_Isresponsbilityof_Keyword_1_10_0_1;
	protected AbstractElementAlias match_Function_____IsleafKeyword_1_6_0_0_or_Isleaf_Keyword_1_6_0_1___LeftParenthesisKeyword_1_6_1_RightParenthesisKeyword_1_6_2___or_____IsresourceKeyword_1_9_0_0_or_Isresource_Keyword_1_9_0_1___LeftParenthesisKeyword_1_9_1_RightParenthesisKeyword_1_9_2___or_____IstaskKeyword_1_11_0_0_or_Istask_Keyword_1_11_0_1___LeftParenthesisKeyword_1_11_1_RightParenthesisKeyword_1_11_2___or_____TreelevelKeyword_1_12_0_0_or_Treelevel_Keyword_1_12_0_1___LeftParenthesisKeyword_1_12_1_RightParenthesisKeyword_1_12_2__;
	protected AbstractElementAlias match_IcalReport___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q;
	protected AbstractElementAlias match_IncludeProperties___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q;
	protected AbstractElementAlias match_JournalEntry___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q;
	protected AbstractElementAlias match_Limit___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__q;
	protected AbstractElementAlias match_Limits___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q;
	protected AbstractElementAlias match_LogicalPrenthesizedExpression_LeftParenthesisKeyword_0_a;
	protected AbstractElementAlias match_LogicalPrenthesizedExpression_LeftParenthesisKeyword_0_p;
	protected AbstractElementAlias match_Navigator___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q;
	protected AbstractElementAlias match_NewTask___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q;
	protected AbstractElementAlias match_NikuReport___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q;
	protected AbstractElementAlias match_Project___LeftCurlyBracketKeyword_5_0_RightCurlyBracketKeyword_5_2__q;
	protected AbstractElementAlias match_Report___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q;
	protected AbstractElementAlias match_Resource___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q;
	protected AbstractElementAlias match_Scenario___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q;
	protected AbstractElementAlias match_Shift___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q;
	protected AbstractElementAlias match_SortAccounts_SortJournalEntries_SortResources_SortTasks_SortaccountsKeyword_0_or_SortjournalentriesKeyword_0_or_SortresourcesKeyword_0_or_SorttasksKeyword_0;
	protected AbstractElementAlias match_SortResources_SortTasks_SortresourcesKeyword_0_or_SorttasksKeyword_0;
	protected AbstractElementAlias match_StatusSheetReport___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q;
	protected AbstractElementAlias match_StatusSheet___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q;
	protected AbstractElementAlias match_StatusStatusSheet___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q;
	protected AbstractElementAlias match_StatusTimesheet___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q;
	protected AbstractElementAlias match_SupplementAccount___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q;
	protected AbstractElementAlias match_SupplementReport___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q;
	protected AbstractElementAlias match_SupplementResource___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q;
	protected AbstractElementAlias match_SupplementTask___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q;
	protected AbstractElementAlias match_TagFile___LeftCurlyBracketKeyword_3_0_0_or_RightCurlyBracketKeyword_3_3_1__a;
	protected AbstractElementAlias match_TagFile___RightCurlyBracketKeyword_3_3_1_LeftCurlyBracketKeyword_3_0_0_a__p;
	protected AbstractElementAlias match_TagFile___RightCurlyBracketKeyword_3_3_1_a_LeftCurlyBracketKeyword_3_0_0__p;
	protected AbstractElementAlias match_TagFile___RightCurlyBracketKeyword_3_3_1_p_LeftCurlyBracketKeyword_3_0_0_p__p;
	protected AbstractElementAlias match_TaskDependency___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__q;
	protected AbstractElementAlias match_TaskStatusSheet___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q;
	protected AbstractElementAlias match_TaskTimesheet___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q;
	protected AbstractElementAlias match_Task___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q;
	protected AbstractElementAlias match_TimesheetReport___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q;
	protected AbstractElementAlias match_Timesheet___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q;
	protected AbstractElementAlias match_XBlockExpression_SemicolonKeyword_2_1_q;
	protected AbstractElementAlias match_XExpressionInClosure_SemicolonKeyword_1_1_q;
	protected AbstractElementAlias match_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q;
	protected AbstractElementAlias match_XParenthesizedExpression_LeftParenthesisKeyword_0_a;
	protected AbstractElementAlias match_XParenthesizedExpression_LeftParenthesisKeyword_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ProjectGrammarAccess) access;
		match_AccountReport_ResourceReport_TaskReport_TextReport_AccountreportKeyword_0_or_ResourcereportKeyword_0_or_TaskreportKeyword_0_or_TextreportKeyword_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getAccountReportAccess().getAccountreportKeyword_0()), new TokenAlias(false, false, grammarAccess.getResourceReportAccess().getResourcereportKeyword_0()), new TokenAlias(false, false, grammarAccess.getTaskReportAccess().getTaskreportKeyword_0()), new TokenAlias(false, false, grammarAccess.getTextReportAccess().getTextreportKeyword_0()));
		match_Account___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getAccountAccess().getLeftCurlyBracketKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getAccountAccess().getRightCurlyBracketKeyword_3_2()));
		match_AllocateResource___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getAllocateResourceAccess().getLeftCurlyBracketKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getAllocateResourceAccess().getRightCurlyBracketKeyword_1_2()));
		match_Booking___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getBookingAccess().getLeftCurlyBracketKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getBookingAccess().getRightCurlyBracketKeyword_1_2()));
		match_Caption_Center_Epilog_Footer_Header_Headline_Left_Prolog_Right_CaptionKeyword_0_or_CenterKeyword_0_or_EpilogKeyword_0_or_FooterKeyword_0_or_HeaderKeyword_0_or_HeadlineKeyword_0_or_LeftKeyword_0_or_PrologKeyword_0_or_RightKeyword_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getCaptionAccess().getCaptionKeyword_0()), new TokenAlias(false, false, grammarAccess.getCenterAccess().getCenterKeyword_0()), new TokenAlias(false, false, grammarAccess.getEpilogAccess().getEpilogKeyword_0()), new TokenAlias(false, false, grammarAccess.getFooterAccess().getFooterKeyword_0()), new TokenAlias(false, false, grammarAccess.getHeaderAccess().getHeaderKeyword_0()), new TokenAlias(false, false, grammarAccess.getHeadlineAccess().getHeadlineKeyword_0()), new TokenAlias(false, false, grammarAccess.getLeftAccess().getLeftKeyword_0()), new TokenAlias(false, false, grammarAccess.getPrologAccess().getPrologKeyword_0()), new TokenAlias(false, false, grammarAccess.getRightAccess().getRightKeyword_0()));
		match_CurrencyFormat_NumberFormat_CurrencyformatKeyword_0_or_NumberformatKeyword_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getCurrencyFormatAccess().getCurrencyformatKeyword_0()), new TokenAlias(false, false, grammarAccess.getNumberFormatAccess().getNumberformatKeyword_0()));
		match_DailyMax_DailyMin_Maximum_Minimum_MonthlyMax_MonthlyMin_WeeklyMax_WeeklyMin_DailymaxKeyword_0_or_DailyminKeyword_0_or_MaximumKeyword_0_or_MinimumKeyword_0_or_MonthlymaxKeyword_0_or_MonthlyminKeyword_0_or_WeeklymaxKeyword_0_or_WeeklyminKeyword_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getDailyMaxAccess().getDailymaxKeyword_0()), new TokenAlias(false, false, grammarAccess.getDailyMinAccess().getDailyminKeyword_0()), new TokenAlias(false, false, grammarAccess.getMaximumAccess().getMaximumKeyword_0()), new TokenAlias(false, false, grammarAccess.getMinimumAccess().getMinimumKeyword_0()), new TokenAlias(false, false, grammarAccess.getMonthlyMaxAccess().getMonthlymaxKeyword_0()), new TokenAlias(false, false, grammarAccess.getMonthlyMinAccess().getMonthlyminKeyword_0()), new TokenAlias(false, false, grammarAccess.getWeeklyMaxAccess().getWeeklymaxKeyword_0()), new TokenAlias(false, false, grammarAccess.getWeeklyMinAccess().getWeeklyminKeyword_0()));
		match_Depends_Precedes_DependsKeyword_0_or_PrecedesKeyword_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getDependsAccess().getDependsKeyword_0()), new TokenAlias(false, false, grammarAccess.getPrecedesAccess().getPrecedesKeyword_0()));
		match_Details_Summary_DetailsKeyword_0_or_SummaryKeyword_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getDetailsAccess().getDetailsKeyword_0()), new TokenAlias(false, false, grammarAccess.getSummaryAccess().getSummaryKeyword_0()));
		match_Export___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getExportAccess().getLeftCurlyBracketKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getExportAccess().getRightCurlyBracketKeyword_3_2()));
		match_ExtendResource___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getExtendResourceAccess().getLeftCurlyBracketKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getExtendResourceAccess().getRightCurlyBracketKeyword_3_2()));
		match_ExtendTask___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getExtendTaskAccess().getLeftCurlyBracketKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getExtendTaskAccess().getRightCurlyBracketKeyword_3_2()));
		match_Extend_DateKeyword_0_1_or_ReferenceKeyword_0_0_or_RichtextKeyword_0_2_or_TextKeyword_0_3 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getExtendAccess().getDateKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getExtendAccess().getReferenceKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getExtendAccess().getRichtextKeyword_0_2()), new TokenAlias(false, false, grammarAccess.getExtendAccess().getTextKeyword_0_3()));
		match_Extend___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getExtendAccess().getLeftCurlyBracketKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getExtendAccess().getRightCurlyBracketKeyword_3_2()));
		match_Function_HasalertKeyword_1_0_0_0_or_Hasalert_Keyword_1_0_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFunctionAccess().getHasalertKeyword_1_0_0_0()), new TokenAlias(false, false, grammarAccess.getFunctionAccess().getHasalert_Keyword_1_0_0_1()));
		match_Function_IsactiveKeyword_1_1_0_0_or_Isactive_Keyword_1_1_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFunctionAccess().getIsactiveKeyword_1_1_0_0()), new TokenAlias(false, false, grammarAccess.getFunctionAccess().getIsactive_Keyword_1_1_0_1()));
		match_Function_IschildofKeyword_1_2_0_0_or_Ischildof_Keyword_1_2_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFunctionAccess().getIschildofKeyword_1_2_0_0()), new TokenAlias(false, false, grammarAccess.getFunctionAccess().getIschildof_Keyword_1_2_0_1()));
		match_Function_IsdependencyofKeyword_1_3_0_0_or_Isdependencyof_Keyword_1_3_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFunctionAccess().getIsdependencyofKeyword_1_3_0_0()), new TokenAlias(false, false, grammarAccess.getFunctionAccess().getIsdependencyof_Keyword_1_3_0_1()));
		match_Function_IsdutyofKeyword_1_4_0_0_or_Isdutyof_Keyword_1_4_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFunctionAccess().getIsdutyofKeyword_1_4_0_0()), new TokenAlias(false, false, grammarAccess.getFunctionAccess().getIsdutyof_Keyword_1_4_0_1()));
		match_Function_IsfeatureofKeyword_1_5_0_0_or_Isfeatureof_Keyword_1_5_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFunctionAccess().getIsfeatureofKeyword_1_5_0_0()), new TokenAlias(false, false, grammarAccess.getFunctionAccess().getIsfeatureof_Keyword_1_5_0_1()));
		match_Function_IsmilestoneKeyword_1_7_0_0_or_Ismilestone_Keyword_1_7_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFunctionAccess().getIsmilestoneKeyword_1_7_0_0()), new TokenAlias(false, false, grammarAccess.getFunctionAccess().getIsmilestone_Keyword_1_7_0_1()));
		match_Function_IsongoingKeyword_1_8_0_0_or_Isongoing_Keyword_1_8_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFunctionAccess().getIsongoingKeyword_1_8_0_0()), new TokenAlias(false, false, grammarAccess.getFunctionAccess().getIsongoing_Keyword_1_8_0_1()));
		match_Function_IsresponsbilityofKeyword_1_10_0_0_or_Isresponsbilityof_Keyword_1_10_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFunctionAccess().getIsresponsbilityofKeyword_1_10_0_0()), new TokenAlias(false, false, grammarAccess.getFunctionAccess().getIsresponsbilityof_Keyword_1_10_0_1()));
		match_Function_____IsleafKeyword_1_6_0_0_or_Isleaf_Keyword_1_6_0_1___LeftParenthesisKeyword_1_6_1_RightParenthesisKeyword_1_6_2___or_____IsresourceKeyword_1_9_0_0_or_Isresource_Keyword_1_9_0_1___LeftParenthesisKeyword_1_9_1_RightParenthesisKeyword_1_9_2___or_____IstaskKeyword_1_11_0_0_or_Istask_Keyword_1_11_0_1___LeftParenthesisKeyword_1_11_1_RightParenthesisKeyword_1_11_2___or_____TreelevelKeyword_1_12_0_0_or_Treelevel_Keyword_1_12_0_1___LeftParenthesisKeyword_1_12_1_RightParenthesisKeyword_1_12_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFunctionAccess().getIsleafKeyword_1_6_0_0()), new TokenAlias(false, false, grammarAccess.getFunctionAccess().getIsleaf_Keyword_1_6_0_1())), new TokenAlias(false, false, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_1_6_1()), new TokenAlias(false, false, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_1_6_2())), new GroupAlias(false, false, new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFunctionAccess().getIsresourceKeyword_1_9_0_0()), new TokenAlias(false, false, grammarAccess.getFunctionAccess().getIsresource_Keyword_1_9_0_1())), new TokenAlias(false, false, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_1_9_1()), new TokenAlias(false, false, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_1_9_2())), new GroupAlias(false, false, new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFunctionAccess().getIstaskKeyword_1_11_0_0()), new TokenAlias(false, false, grammarAccess.getFunctionAccess().getIstask_Keyword_1_11_0_1())), new TokenAlias(false, false, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_1_11_1()), new TokenAlias(false, false, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_1_11_2())), new GroupAlias(false, false, new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFunctionAccess().getTreelevelKeyword_1_12_0_0()), new TokenAlias(false, false, grammarAccess.getFunctionAccess().getTreelevel_Keyword_1_12_0_1())), new TokenAlias(false, false, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_1_12_1()), new TokenAlias(false, false, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_1_12_2())));
		match_IcalReport___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getIcalReportAccess().getLeftCurlyBracketKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getIcalReportAccess().getRightCurlyBracketKeyword_2_2()));
		match_IncludeProperties___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getIncludePropertiesAccess().getLeftCurlyBracketKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getIncludePropertiesAccess().getRightCurlyBracketKeyword_2_2()));
		match_JournalEntry___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getJournalEntryAccess().getLeftCurlyBracketKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getJournalEntryAccess().getRightCurlyBracketKeyword_3_2()));
		match_Limit___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getLimitAccess().getLeftCurlyBracketKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getLimitAccess().getRightCurlyBracketKeyword_1_2()));
		match_Limits___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getLimitsAccess().getLeftCurlyBracketKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getLimitsAccess().getRightCurlyBracketKeyword_2_2()));
		match_LogicalPrenthesizedExpression_LeftParenthesisKeyword_0_a = new TokenAlias(true, true, grammarAccess.getLogicalPrenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
		match_LogicalPrenthesizedExpression_LeftParenthesisKeyword_0_p = new TokenAlias(true, false, grammarAccess.getLogicalPrenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
		match_Navigator___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getNavigatorAccess().getLeftCurlyBracketKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getNavigatorAccess().getRightCurlyBracketKeyword_2_2()));
		match_NewTask___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getNewTaskAccess().getLeftCurlyBracketKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getNewTaskAccess().getRightCurlyBracketKeyword_3_2()));
		match_NikuReport___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getNikuReportAccess().getLeftCurlyBracketKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getNikuReportAccess().getRightCurlyBracketKeyword_2_2()));
		match_Project___LeftCurlyBracketKeyword_5_0_RightCurlyBracketKeyword_5_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_5_2()));
		match_Report___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getReportAccess().getLeftCurlyBracketKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getReportAccess().getRightCurlyBracketKeyword_2_2()));
		match_Resource___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_3_2()));
		match_Scenario___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getScenarioAccess().getLeftCurlyBracketKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getScenarioAccess().getRightCurlyBracketKeyword_3_2()));
		match_Shift___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getShiftAccess().getLeftCurlyBracketKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getShiftAccess().getRightCurlyBracketKeyword_3_2()));
		match_SortAccounts_SortJournalEntries_SortResources_SortTasks_SortaccountsKeyword_0_or_SortjournalentriesKeyword_0_or_SortresourcesKeyword_0_or_SorttasksKeyword_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getSortAccountsAccess().getSortaccountsKeyword_0()), new TokenAlias(false, false, grammarAccess.getSortJournalEntriesAccess().getSortjournalentriesKeyword_0()), new TokenAlias(false, false, grammarAccess.getSortResourcesAccess().getSortresourcesKeyword_0()), new TokenAlias(false, false, grammarAccess.getSortTasksAccess().getSorttasksKeyword_0()));
		match_SortResources_SortTasks_SortresourcesKeyword_0_or_SorttasksKeyword_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getSortResourcesAccess().getSortresourcesKeyword_0()), new TokenAlias(false, false, grammarAccess.getSortTasksAccess().getSorttasksKeyword_0()));
		match_StatusSheetReport___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getStatusSheetReportAccess().getLeftCurlyBracketKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getStatusSheetReportAccess().getRightCurlyBracketKeyword_2_2()));
		match_StatusSheet___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getStatusSheetAccess().getLeftCurlyBracketKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getStatusSheetAccess().getRightCurlyBracketKeyword_3_2()));
		match_StatusStatusSheet___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getStatusStatusSheetAccess().getLeftCurlyBracketKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getStatusStatusSheetAccess().getRightCurlyBracketKeyword_3_2()));
		match_StatusTimesheet___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getStatusTimesheetAccess().getLeftCurlyBracketKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getStatusTimesheetAccess().getRightCurlyBracketKeyword_3_2()));
		match_SupplementAccount___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getSupplementAccountAccess().getLeftCurlyBracketKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getSupplementAccountAccess().getRightCurlyBracketKeyword_3_2()));
		match_SupplementReport___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getSupplementReportAccess().getLeftCurlyBracketKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getSupplementReportAccess().getRightCurlyBracketKeyword_3_2()));
		match_SupplementResource___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getSupplementResourceAccess().getLeftCurlyBracketKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getSupplementResourceAccess().getRightCurlyBracketKeyword_3_2()));
		match_SupplementTask___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getSupplementTaskAccess().getLeftCurlyBracketKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getSupplementTaskAccess().getRightCurlyBracketKeyword_3_2()));
		match_TagFile___LeftCurlyBracketKeyword_3_0_0_or_RightCurlyBracketKeyword_3_3_1__a = new AlternativeAlias(true, true, new TokenAlias(false, false, grammarAccess.getTagFileAccess().getLeftCurlyBracketKeyword_3_0_0()), new TokenAlias(false, false, grammarAccess.getTagFileAccess().getRightCurlyBracketKeyword_3_3_1()));
		match_TagFile___RightCurlyBracketKeyword_3_3_1_LeftCurlyBracketKeyword_3_0_0_a__p = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getTagFileAccess().getRightCurlyBracketKeyword_3_3_1()), new TokenAlias(true, true, grammarAccess.getTagFileAccess().getLeftCurlyBracketKeyword_3_0_0()));
		match_TagFile___RightCurlyBracketKeyword_3_3_1_a_LeftCurlyBracketKeyword_3_0_0__p = new GroupAlias(true, false, new TokenAlias(true, true, grammarAccess.getTagFileAccess().getRightCurlyBracketKeyword_3_3_1()), new TokenAlias(false, false, grammarAccess.getTagFileAccess().getLeftCurlyBracketKeyword_3_0_0()));
		match_TagFile___RightCurlyBracketKeyword_3_3_1_p_LeftCurlyBracketKeyword_3_0_0_p__p = new GroupAlias(true, false, new TokenAlias(true, false, grammarAccess.getTagFileAccess().getRightCurlyBracketKeyword_3_3_1()), new TokenAlias(true, false, grammarAccess.getTagFileAccess().getLeftCurlyBracketKeyword_3_0_0()));
		match_TaskDependency___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getTaskDependencyAccess().getLeftCurlyBracketKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getTaskDependencyAccess().getRightCurlyBracketKeyword_1_2()));
		match_TaskStatusSheet___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getTaskStatusSheetAccess().getLeftCurlyBracketKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getTaskStatusSheetAccess().getRightCurlyBracketKeyword_2_2()));
		match_TaskTimesheet___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getTaskTimesheetAccess().getLeftCurlyBracketKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getTaskTimesheetAccess().getRightCurlyBracketKeyword_2_2()));
		match_Task___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_3_2()));
		match_TimesheetReport___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getTimesheetReportAccess().getLeftCurlyBracketKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getTimesheetReportAccess().getRightCurlyBracketKeyword_2_2()));
		match_Timesheet___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getTimesheetAccess().getLeftCurlyBracketKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getTimesheetAccess().getRightCurlyBracketKeyword_3_2()));
		match_XBlockExpression_SemicolonKeyword_2_1_q = new TokenAlias(false, true, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
		match_XExpressionInClosure_SemicolonKeyword_1_1_q = new TokenAlias(false, true, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
		match_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2()));
		match_XParenthesizedExpression_LeftParenthesisKeyword_0_a = new TokenAlias(true, true, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
		match_XParenthesizedExpression_LeftParenthesisKeyword_0_p = new TokenAlias(true, false, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getOpSingleAssignRule())
			return getOpSingleAssignToken(semanticObject, ruleCall, node);
		return "";
	}
	
	protected String getOpSingleAssignToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "=";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_AccountReport_ResourceReport_TaskReport_TextReport_AccountreportKeyword_0_or_ResourcereportKeyword_0_or_TaskreportKeyword_0_or_TextreportKeyword_0.equals(syntax))
				emit_AccountReport_ResourceReport_TaskReport_TextReport_AccountreportKeyword_0_or_ResourcereportKeyword_0_or_TaskreportKeyword_0_or_TextreportKeyword_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Account___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q.equals(syntax))
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
			else if(match_Export___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q.equals(syntax))
				emit_Export___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ExtendResource___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q.equals(syntax))
				emit_ExtendResource___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ExtendTask___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q.equals(syntax))
				emit_ExtendTask___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Extend_DateKeyword_0_1_or_ReferenceKeyword_0_0_or_RichtextKeyword_0_2_or_TextKeyword_0_3.equals(syntax))
				emit_Extend_DateKeyword_0_1_or_ReferenceKeyword_0_0_or_RichtextKeyword_0_2_or_TextKeyword_0_3(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Extend___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q.equals(syntax))
				emit_Extend___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Function_HasalertKeyword_1_0_0_0_or_Hasalert_Keyword_1_0_0_1.equals(syntax))
				emit_Function_HasalertKeyword_1_0_0_0_or_Hasalert_Keyword_1_0_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Function_IsactiveKeyword_1_1_0_0_or_Isactive_Keyword_1_1_0_1.equals(syntax))
				emit_Function_IsactiveKeyword_1_1_0_0_or_Isactive_Keyword_1_1_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Function_IschildofKeyword_1_2_0_0_or_Ischildof_Keyword_1_2_0_1.equals(syntax))
				emit_Function_IschildofKeyword_1_2_0_0_or_Ischildof_Keyword_1_2_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Function_IsdependencyofKeyword_1_3_0_0_or_Isdependencyof_Keyword_1_3_0_1.equals(syntax))
				emit_Function_IsdependencyofKeyword_1_3_0_0_or_Isdependencyof_Keyword_1_3_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Function_IsdutyofKeyword_1_4_0_0_or_Isdutyof_Keyword_1_4_0_1.equals(syntax))
				emit_Function_IsdutyofKeyword_1_4_0_0_or_Isdutyof_Keyword_1_4_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Function_IsfeatureofKeyword_1_5_0_0_or_Isfeatureof_Keyword_1_5_0_1.equals(syntax))
				emit_Function_IsfeatureofKeyword_1_5_0_0_or_Isfeatureof_Keyword_1_5_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Function_IsmilestoneKeyword_1_7_0_0_or_Ismilestone_Keyword_1_7_0_1.equals(syntax))
				emit_Function_IsmilestoneKeyword_1_7_0_0_or_Ismilestone_Keyword_1_7_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Function_IsongoingKeyword_1_8_0_0_or_Isongoing_Keyword_1_8_0_1.equals(syntax))
				emit_Function_IsongoingKeyword_1_8_0_0_or_Isongoing_Keyword_1_8_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Function_IsresponsbilityofKeyword_1_10_0_0_or_Isresponsbilityof_Keyword_1_10_0_1.equals(syntax))
				emit_Function_IsresponsbilityofKeyword_1_10_0_0_or_Isresponsbilityof_Keyword_1_10_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Function_____IsleafKeyword_1_6_0_0_or_Isleaf_Keyword_1_6_0_1___LeftParenthesisKeyword_1_6_1_RightParenthesisKeyword_1_6_2___or_____IsresourceKeyword_1_9_0_0_or_Isresource_Keyword_1_9_0_1___LeftParenthesisKeyword_1_9_1_RightParenthesisKeyword_1_9_2___or_____IstaskKeyword_1_11_0_0_or_Istask_Keyword_1_11_0_1___LeftParenthesisKeyword_1_11_1_RightParenthesisKeyword_1_11_2___or_____TreelevelKeyword_1_12_0_0_or_Treelevel_Keyword_1_12_0_1___LeftParenthesisKeyword_1_12_1_RightParenthesisKeyword_1_12_2__.equals(syntax))
				emit_Function_____IsleafKeyword_1_6_0_0_or_Isleaf_Keyword_1_6_0_1___LeftParenthesisKeyword_1_6_1_RightParenthesisKeyword_1_6_2___or_____IsresourceKeyword_1_9_0_0_or_Isresource_Keyword_1_9_0_1___LeftParenthesisKeyword_1_9_1_RightParenthesisKeyword_1_9_2___or_____IstaskKeyword_1_11_0_0_or_Istask_Keyword_1_11_0_1___LeftParenthesisKeyword_1_11_1_RightParenthesisKeyword_1_11_2___or_____TreelevelKeyword_1_12_0_0_or_Treelevel_Keyword_1_12_0_1___LeftParenthesisKeyword_1_12_1_RightParenthesisKeyword_1_12_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_IcalReport___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q.equals(syntax))
				emit_IcalReport___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_IncludeProperties___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q.equals(syntax))
				emit_IncludeProperties___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_JournalEntry___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q.equals(syntax))
				emit_JournalEntry___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Limit___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__q.equals(syntax))
				emit_Limit___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Limits___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q.equals(syntax))
				emit_Limits___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_LogicalPrenthesizedExpression_LeftParenthesisKeyword_0_a.equals(syntax))
				emit_LogicalPrenthesizedExpression_LeftParenthesisKeyword_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_LogicalPrenthesizedExpression_LeftParenthesisKeyword_0_p.equals(syntax))
				emit_LogicalPrenthesizedExpression_LeftParenthesisKeyword_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Navigator___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q.equals(syntax))
				emit_Navigator___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_NewTask___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q.equals(syntax))
				emit_NewTask___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_NikuReport___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q.equals(syntax))
				emit_NikuReport___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Project___LeftCurlyBracketKeyword_5_0_RightCurlyBracketKeyword_5_2__q.equals(syntax))
				emit_Project___LeftCurlyBracketKeyword_5_0_RightCurlyBracketKeyword_5_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Report___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q.equals(syntax))
				emit_Report___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Resource___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q.equals(syntax))
				emit_Resource___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Scenario___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q.equals(syntax))
				emit_Scenario___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Shift___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q.equals(syntax))
				emit_Shift___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SortAccounts_SortJournalEntries_SortResources_SortTasks_SortaccountsKeyword_0_or_SortjournalentriesKeyword_0_or_SortresourcesKeyword_0_or_SorttasksKeyword_0.equals(syntax))
				emit_SortAccounts_SortJournalEntries_SortResources_SortTasks_SortaccountsKeyword_0_or_SortjournalentriesKeyword_0_or_SortresourcesKeyword_0_or_SorttasksKeyword_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SortResources_SortTasks_SortresourcesKeyword_0_or_SorttasksKeyword_0.equals(syntax))
				emit_SortResources_SortTasks_SortresourcesKeyword_0_or_SorttasksKeyword_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_StatusSheetReport___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q.equals(syntax))
				emit_StatusSheetReport___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_StatusSheet___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q.equals(syntax))
				emit_StatusSheet___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_StatusStatusSheet___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q.equals(syntax))
				emit_StatusStatusSheet___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_StatusTimesheet___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q.equals(syntax))
				emit_StatusTimesheet___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SupplementAccount___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q.equals(syntax))
				emit_SupplementAccount___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SupplementReport___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q.equals(syntax))
				emit_SupplementReport___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SupplementResource___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q.equals(syntax))
				emit_SupplementResource___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SupplementTask___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q.equals(syntax))
				emit_SupplementTask___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TagFile___LeftCurlyBracketKeyword_3_0_0_or_RightCurlyBracketKeyword_3_3_1__a.equals(syntax))
				emit_TagFile___LeftCurlyBracketKeyword_3_0_0_or_RightCurlyBracketKeyword_3_3_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TagFile___RightCurlyBracketKeyword_3_3_1_LeftCurlyBracketKeyword_3_0_0_a__p.equals(syntax))
				emit_TagFile___RightCurlyBracketKeyword_3_3_1_LeftCurlyBracketKeyword_3_0_0_a__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TagFile___RightCurlyBracketKeyword_3_3_1_a_LeftCurlyBracketKeyword_3_0_0__p.equals(syntax))
				emit_TagFile___RightCurlyBracketKeyword_3_3_1_a_LeftCurlyBracketKeyword_3_0_0__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TagFile___RightCurlyBracketKeyword_3_3_1_p_LeftCurlyBracketKeyword_3_0_0_p__p.equals(syntax))
				emit_TagFile___RightCurlyBracketKeyword_3_3_1_p_LeftCurlyBracketKeyword_3_0_0_p__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TaskDependency___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__q.equals(syntax))
				emit_TaskDependency___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TaskStatusSheet___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q.equals(syntax))
				emit_TaskStatusSheet___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TaskTimesheet___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q.equals(syntax))
				emit_TaskTimesheet___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Task___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q.equals(syntax))
				emit_Task___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TimesheetReport___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q.equals(syntax))
				emit_TimesheetReport___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Timesheet___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q.equals(syntax))
				emit_Timesheet___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XBlockExpression_SemicolonKeyword_2_1_q.equals(syntax))
				emit_XBlockExpression_SemicolonKeyword_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XExpressionInClosure_SemicolonKeyword_1_1_q.equals(syntax))
				emit_XExpressionInClosure_SemicolonKeyword_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q.equals(syntax))
				emit_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XParenthesizedExpression_LeftParenthesisKeyword_0_a.equals(syntax))
				emit_XParenthesizedExpression_LeftParenthesisKeyword_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XParenthesizedExpression_LeftParenthesisKeyword_0_p.equals(syntax))
				emit_XParenthesizedExpression_LeftParenthesisKeyword_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'accountreport' | 'textreport' | 'taskreport' | 'resourcereport'
	 */
	protected void emit_AccountReport_ResourceReport_TaskReport_TextReport_AccountreportKeyword_0_or_ResourcereportKeyword_0_or_TaskreportKeyword_0_or_TextreportKeyword_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
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
	     'header' | 
	     'footer' | 
	     'prolog' | 
	     'center' | 
	     'epilog' | 
	     'right' | 
	     'caption' | 
	     'left' | 
	     'headline'
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
	     'maximum' | 
	     'monthlymin' | 
	     'minimum' | 
	     'dailymin' | 
	     'weeklymax' | 
	     'dailymax' | 
	     'monthlymax' | 
	     'weeklymin'
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
	protected void emit_Export___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_ExtendResource___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_ExtendTask___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'richtext' | 'reference' | 'date' | 'text'
	 */
	protected void emit_Extend_DateKeyword_0_1_or_ReferenceKeyword_0_0_or_RichtextKeyword_0_2_or_TextKeyword_0_3(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_Extend___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'hasalert_' | 'hasalert'
	 */
	protected void emit_Function_HasalertKeyword_1_0_0_0_or_Hasalert_Keyword_1_0_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'isactive' | 'isactive_'
	 */
	protected void emit_Function_IsactiveKeyword_1_1_0_0_or_Isactive_Keyword_1_1_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'ischildof_' | 'ischildof'
	 */
	protected void emit_Function_IschildofKeyword_1_2_0_0_or_Ischildof_Keyword_1_2_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'isdependencyof_' | 'isdependencyof'
	 */
	protected void emit_Function_IsdependencyofKeyword_1_3_0_0_or_Isdependencyof_Keyword_1_3_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'isdutyof' | 'isdutyof_'
	 */
	protected void emit_Function_IsdutyofKeyword_1_4_0_0_or_Isdutyof_Keyword_1_4_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'isfeatureof_' | 'isfeatureof'
	 */
	protected void emit_Function_IsfeatureofKeyword_1_5_0_0_or_Isfeatureof_Keyword_1_5_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'ismilestone' | 'ismilestone_'
	 */
	protected void emit_Function_IsmilestoneKeyword_1_7_0_0_or_Ismilestone_Keyword_1_7_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'isongoing_' | 'isongoing'
	 */
	protected void emit_Function_IsongoingKeyword_1_8_0_0_or_Isongoing_Keyword_1_8_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'isresponsbilityof' | 'isresponsbilityof_'
	 */
	protected void emit_Function_IsresponsbilityofKeyword_1_10_0_0_or_Isresponsbilityof_Keyword_1_10_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (
	     (('isleaf' | 'isleaf_') '(' ')') | 
	     (('treelevel' | 'treelevel_') '(' ')') | 
	     (('isresource_' | 'isresource') '(' ')') | 
	     (('istask_' | 'istask') '(' ')')
	 )
	 */
	protected void emit_Function_____IsleafKeyword_1_6_0_0_or_Isleaf_Keyword_1_6_0_1___LeftParenthesisKeyword_1_6_1_RightParenthesisKeyword_1_6_2___or_____IsresourceKeyword_1_9_0_0_or_Isresource_Keyword_1_9_0_1___LeftParenthesisKeyword_1_9_1_RightParenthesisKeyword_1_9_2___or_____IstaskKeyword_1_11_0_0_or_Istask_Keyword_1_11_0_1___LeftParenthesisKeyword_1_11_1_RightParenthesisKeyword_1_11_2___or_____TreelevelKeyword_1_12_0_0_or_Treelevel_Keyword_1_12_0_1___LeftParenthesisKeyword_1_12_1_RightParenthesisKeyword_1_12_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_IcalReport___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_IncludeProperties___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_JournalEntry___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_Limit___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     '('*
	 */
	protected void emit_LogicalPrenthesizedExpression_LeftParenthesisKeyword_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('+
	 */
	protected void emit_LogicalPrenthesizedExpression_LeftParenthesisKeyword_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	protected void emit_NikuReport___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     'sortjournalentries' | 'sortresources' | 'sortaccounts' | 'sorttasks'
	 */
	protected void emit_SortAccounts_SortJournalEntries_SortResources_SortTasks_SortaccountsKeyword_0_or_SortjournalentriesKeyword_0_or_SortresourcesKeyword_0_or_SorttasksKeyword_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	protected void emit_StatusSheetReport___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_StatusSheet___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	protected void emit_StatusTimesheet___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     ('{' | '}')*
	 */
	protected void emit_TagFile___LeftCurlyBracketKeyword_3_0_0_or_RightCurlyBracketKeyword_3_3_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('}' '{'*)+
	 */
	protected void emit_TagFile___RightCurlyBracketKeyword_3_3_1_LeftCurlyBracketKeyword_3_0_0_a__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('}'* '{')+
	 */
	protected void emit_TagFile___RightCurlyBracketKeyword_3_3_1_a_LeftCurlyBracketKeyword_3_0_0__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('}'+ '{'+)+
	 */
	protected void emit_TagFile___RightCurlyBracketKeyword_3_3_1_p_LeftCurlyBracketKeyword_3_0_0_p__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	protected void emit_TimesheetReport___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_Timesheet___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_XBlockExpression_SemicolonKeyword_2_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_XExpressionInClosure_SemicolonKeyword_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('(' ')')?
	 */
	protected void emit_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('*
	 */
	protected void emit_XParenthesizedExpression_LeftParenthesisKeyword_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('+
	 */
	protected void emit_XParenthesizedExpression_LeftParenthesisKeyword_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
