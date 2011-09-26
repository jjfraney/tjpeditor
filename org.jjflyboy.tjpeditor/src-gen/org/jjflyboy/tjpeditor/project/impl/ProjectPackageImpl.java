/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project.impl;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.jjflyboy.tjpeditor.project.ProjectFactory;
import org.jjflyboy.tjpeditor.project.ProjectPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProjectPackageImpl extends EPackageImpl implements ProjectPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected String packageFilename = "project.ecore";

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass globalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass globalAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass accountEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass accountAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass supplementAccountEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass projectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass projectAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass taskEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass supplementTaskEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass taskAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass reportEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass supplementReportEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass reportAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass supplementResourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resourceAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass allocateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass allocateResourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass allocateResourceAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass navigatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass navigatorAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass newTaskEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass newTaskAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nikuReportEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nikuReportAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alertEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alternativeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass authorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass balanceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bookingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bookingTaskEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bookingResourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass captionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cellColorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cellTextEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass centerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass chargeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass chargeSetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass columnsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass completeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass copyrightEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass creditEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass currencyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass currencyFormatEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dateExtendEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass limitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dailyWorkingHoursEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass definitionsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dependsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass detailsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass durationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass efficiencyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass effortEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass emailEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass endEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass endCreditEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass epilogEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass extendEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass failEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass flagsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fontColorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass footerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass formatsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass gapDurationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass gapLengthEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hAlignEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass headerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass headlineEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hideReportEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hideResourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hideTaskEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass includeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interval1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interval2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interval3EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interval4EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass journalAttributesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass journalEntryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass journalModeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass leftEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lengthEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass limitsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass listItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass listTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass loadUnitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass managersEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mandatoryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass maxEndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass maximumEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass maxStartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass milestoneEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass minimumEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass minEndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass minStartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass monthlyMaxEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass monthlyMinEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass noteEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nowEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberFormatEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass periodEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass persistentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass precedesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass priorityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass projectIdEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass projectIdsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass prologEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass purgeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass referenceExtendEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass remainingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass reportPrefixEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resourceAttributesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resourcePrefixEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resourceReportEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resourceRootEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass responsibleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass richTextExtendEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rightEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rollupResourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rollupTaskEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scaleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scenarioEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scenariosEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scheduledEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass schedulingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selfContainedEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass shiftEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass shiftTimesheetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass shiftsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass shortTimeFormatEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sortJournalEntriesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sortResourcesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sortTasksEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass startEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass startCreditEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statusStatusSheetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statusStatusSheetAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass summaryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tagFileEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass taskStatusSheetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass taskStatusSheetAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass taskTimesheetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass taskAttributesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass taskPrefixEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass taskReportEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass taskRootEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass textExtendEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass textReportEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass timeFormatEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass timeoffEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass timesheetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass timesheetReportEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass timezoneEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass timingResolutionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass titleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass toolTipEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass trackingScenarioEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass treeLevelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass vacationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass vacationShiftEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass warnEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass weekStartsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass weeklyMaxEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass weeklyMinEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass widthEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass workEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass workingHoursEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass yearlyWorkingDaysEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass accountShareEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass columnAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass columnEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass criterionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass criterionIdEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass durationQuantityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass extendAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass realFormatEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass shiftLimitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sortEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass taskDependencyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass taskTimesheetAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass timesheetAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass timesheetReportAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass richTextEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass workHoursEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass weekdaysEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum chargeAppliesEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum justificationEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum journalModeValueEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum journalEntrySortCriterionEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum listTypeValuesEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum criterionDirectionEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum yesNoEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum reportFormatEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum loadDisplayUnitEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum scaleResolutionEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum selectArgumentEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum columnIdEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum alertLevelEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum dependsPolicyEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum schedulingPolicyEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum timeUnitEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum weekdayEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum workQuantityUnitEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ProjectPackageImpl()
  {
    super(eNS_URI, ProjectFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link ProjectPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @generated
   */
  public static ProjectPackage init()
  {
    if (isInited) return (ProjectPackage)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI);

    // Obtain or create and register package
    ProjectPackageImpl theProjectPackage = (ProjectPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ProjectPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ProjectPackageImpl());

    isInited = true;

    // Load packages
    theProjectPackage.loadPackage();

    // Fix loaded packages
    theProjectPackage.fixPackageContents();

    // Mark meta-data to indicate it can't be changed
    theProjectPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ProjectPackage.eNS_URI, theProjectPackage);
    return theProjectPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGlobal()
  {
    if (globalEClass == null)
    {
      globalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(0);
    }
    return globalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGlobal_Project()
  {
        return (EReference)getGlobal().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGlobal_Attributes()
  {
        return (EReference)getGlobal().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGlobalAttribute()
  {
    if (globalAttributeEClass == null)
    {
      globalAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(1);
    }
    return globalAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAccount()
  {
    if (accountEClass == null)
    {
      accountEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(2);
    }
    return accountEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAccount_Id()
  {
        return (EAttribute)getAccount().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAccount_Name()
  {
        return (EAttribute)getAccount().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAccount_Attributes()
  {
        return (EReference)getAccount().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAccountAttribute()
  {
    if (accountAttributeEClass == null)
    {
      accountAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(3);
    }
    return accountAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSupplementAccount()
  {
    if (supplementAccountEClass == null)
    {
      supplementAccountEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(4);
    }
    return supplementAccountEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSupplementAccount_Account()
  {
        return (EReference)getSupplementAccount().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSupplementAccount_Attributes()
  {
        return (EReference)getSupplementAccount().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProject()
  {
    if (projectEClass == null)
    {
      projectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(5);
    }
    return projectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProject_Id()
  {
        return (EAttribute)getProject().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProject_Name()
  {
        return (EAttribute)getProject().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProject_Version()
  {
        return (EAttribute)getProject().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProject_Interval()
  {
        return (EReference)getProject().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProject_Attributes()
  {
        return (EReference)getProject().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProjectAttribute()
  {
    if (projectAttributeEClass == null)
    {
      projectAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(6);
    }
    return projectAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTask()
  {
    if (taskEClass == null)
    {
      taskEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(7);
    }
    return taskEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTask_Id()
  {
        return (EAttribute)getTask().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTask_Name()
  {
        return (EAttribute)getTask().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTask_Attributes()
  {
        return (EReference)getTask().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSupplementTask()
  {
    if (supplementTaskEClass == null)
    {
      supplementTaskEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(8);
    }
    return supplementTaskEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSupplementTask_Task()
  {
        return (EReference)getSupplementTask().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSupplementTask_Attributes()
  {
        return (EReference)getSupplementTask().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTaskAttribute()
  {
    if (taskAttributeEClass == null)
    {
      taskAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(9);
    }
    return taskAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReport()
  {
    if (reportEClass == null)
    {
      reportEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(10);
    }
    return reportEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReport_Id()
  {
        return (EAttribute)getReport().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReport_Name()
  {
        return (EAttribute)getReport().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReport_Attributes()
  {
        return (EReference)getReport().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSupplementReport()
  {
    if (supplementReportEClass == null)
    {
      supplementReportEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(11);
    }
    return supplementReportEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSupplementReport_Report()
  {
        return (EReference)getSupplementReport().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSupplementReport_Attributes()
  {
        return (EReference)getSupplementReport().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReportAttribute()
  {
    if (reportAttributeEClass == null)
    {
      reportAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(12);
    }
    return reportAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResource()
  {
    if (resourceEClass == null)
    {
      resourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(13);
    }
    return resourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResource_Id()
  {
        return (EAttribute)getResource().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResource_Name()
  {
        return (EAttribute)getResource().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getResource_Attributes()
  {
        return (EReference)getResource().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSupplementResource()
  {
    if (supplementResourceEClass == null)
    {
      supplementResourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(14);
    }
    return supplementResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSupplementResource_Resource()
  {
        return (EReference)getSupplementResource().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSupplementResource_Attributes()
  {
        return (EReference)getSupplementResource().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResourceAttribute()
  {
    if (resourceAttributeEClass == null)
    {
      resourceAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(15);
    }
    return resourceAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAllocate()
  {
    if (allocateEClass == null)
    {
      allocateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(16);
    }
    return allocateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAllocate_Resources()
  {
        return (EReference)getAllocate().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAllocateResource()
  {
    if (allocateResourceEClass == null)
    {
      allocateResourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(17);
    }
    return allocateResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAllocateResource_Resource()
  {
        return (EReference)getAllocateResource().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAllocateResource_Attributes()
  {
        return (EReference)getAllocateResource().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAllocateResourceAttribute()
  {
    if (allocateResourceAttributeEClass == null)
    {
      allocateResourceAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(18);
    }
    return allocateResourceAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNavigator()
  {
    if (navigatorEClass == null)
    {
      navigatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(19);
    }
    return navigatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNavigator_Id()
  {
        return (EAttribute)getNavigator().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNavigator_Attributes()
  {
        return (EReference)getNavigator().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNavigatorAttribute()
  {
    if (navigatorAttributeEClass == null)
    {
      navigatorAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(20);
    }
    return navigatorAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNewTask()
  {
    if (newTaskEClass == null)
    {
      newTaskEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(21);
    }
    return newTaskEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNewTask_Id()
  {
        return (EAttribute)getNewTask().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNewTask_Text()
  {
        return (EAttribute)getNewTask().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNewTask_Attributes()
  {
        return (EReference)getNewTask().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNewTaskAttribute()
  {
    if (newTaskAttributeEClass == null)
    {
      newTaskAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(22);
    }
    return newTaskAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNikuReport()
  {
    if (nikuReportEClass == null)
    {
      nikuReportEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(23);
    }
    return nikuReportEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNikuReport_Filename()
  {
        return (EAttribute)getNikuReport().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNikuReport_Attributes()
  {
        return (EReference)getNikuReport().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNikuReportAttribute()
  {
    if (nikuReportAttributeEClass == null)
    {
      nikuReportAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(24);
    }
    return nikuReportAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAlert()
  {
    if (alertEClass == null)
    {
      alertEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(25);
    }
    return alertEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAlert_Level()
  {
        return (EAttribute)getAlert().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAlternative()
  {
    if (alternativeEClass == null)
    {
      alternativeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(26);
    }
    return alternativeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlternative_Resources()
  {
        return (EReference)getAlternative().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAuthor()
  {
    if (authorEClass == null)
    {
      authorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(27);
    }
    return authorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAuthor_Resource()
  {
        return (EReference)getAuthor().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBalance()
  {
    if (balanceEClass == null)
    {
      balanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(28);
    }
    return balanceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBalance_Cost()
  {
        return (EReference)getBalance().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBalance_Revenue()
  {
        return (EReference)getBalance().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooking()
  {
    if (bookingEClass == null)
    {
      bookingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(29);
    }
    return bookingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBooking_Interval()
  {
        return (EReference)getBooking().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBooking_Overtime()
  {
        return (EAttribute)getBooking().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBooking_Sloppy()
  {
        return (EAttribute)getBooking().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBookingTask()
  {
    if (bookingTaskEClass == null)
    {
      bookingTaskEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(30);
    }
    return bookingTaskEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBookingTask_Resource()
  {
        return (EReference)getBookingTask().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBookingResource()
  {
    if (bookingResourceEClass == null)
    {
      bookingResourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(31);
    }
    return bookingResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBookingResource_Task()
  {
        return (EReference)getBookingResource().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCaption()
  {
    if (captionEClass == null)
    {
      captionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(32);
    }
    return captionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCellColor()
  {
    if (cellColorEClass == null)
    {
      cellColorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(33);
    }
    return cellColorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCellColor_Expression()
  {
        return (EAttribute)getCellColor().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCellColor_Color()
  {
        return (EAttribute)getCellColor().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCellText()
  {
    if (cellTextEClass == null)
    {
      cellTextEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(34);
    }
    return cellTextEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCellText_Text()
  {
        return (EAttribute)getCellText().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCellText_Expresssion()
  {
        return (EAttribute)getCellText().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCenter()
  {
    if (centerEClass == null)
    {
      centerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(35);
    }
    return centerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCharge()
  {
    if (chargeEClass == null)
    {
      chargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(36);
    }
    return chargeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCharge_Amount()
  {
        return (EAttribute)getCharge().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCharge_Applies()
  {
        return (EAttribute)getCharge().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getChargeSet()
  {
    if (chargeSetEClass == null)
    {
      chargeSetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(37);
    }
    return chargeSetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChargeSet_AccountShares()
  {
        return (EReference)getChargeSet().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColumns()
  {
    if (columnsEClass == null)
    {
      columnsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(38);
    }
    return columnsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getColumns_Columns()
  {
        return (EReference)getColumns().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComplete()
  {
    if (completeEClass == null)
    {
      completeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(39);
    }
    return completeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComplete_Complete()
  {
        return (EAttribute)getComplete().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCopyright()
  {
    if (copyrightEClass == null)
    {
      copyrightEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(40);
    }
    return copyrightEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCopyright_Text()
  {
        return (EAttribute)getCopyright().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCredit()
  {
    if (creditEClass == null)
    {
      creditEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(41);
    }
    return creditEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCredit_Date()
  {
        return (EAttribute)getCredit().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCredit_Description()
  {
        return (EAttribute)getCredit().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCredit_Amount()
  {
        return (EAttribute)getCredit().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCurrency()
  {
    if (currencyEClass == null)
    {
      currencyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(42);
    }
    return currencyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCurrency_Currency()
  {
        return (EAttribute)getCurrency().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCurrencyFormat()
  {
    if (currencyFormatEClass == null)
    {
      currencyFormatEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(43);
    }
    return currencyFormatEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDateExtend()
  {
    if (dateExtendEClass == null)
    {
      dateExtendEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(44);
    }
    return dateExtendEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLimit()
  {
    if (limitEClass == null)
    {
      limitEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(45);
    }
    return limitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLimit_Value()
  {
        return (EAttribute)getLimit().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLimit_Unit()
  {
        return (EAttribute)getLimit().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLimit_End()
  {
        return (EAttribute)getLimit().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLimit_Period()
  {
        return (EReference)getLimit().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLimit_Resources()
  {
        return (EReference)getLimit().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDailyWorkingHours()
  {
    if (dailyWorkingHoursEClass == null)
    {
      dailyWorkingHoursEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(46);
    }
    return dailyWorkingHoursEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDailyWorkingHours_DailyWorkingHours()
  {
        return (EAttribute)getDailyWorkingHours().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDefinitions()
  {
    if (definitionsEClass == null)
    {
      definitionsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(47);
    }
    return definitionsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDefinitions_All()
  {
        return (EAttribute)getDefinitions().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDefinitions_None()
  {
        return (EAttribute)getDefinitions().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDefinitions_Flags()
  {
        return (EAttribute)getDefinitions().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDefinitions_Resources()
  {
        return (EAttribute)getDefinitions().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDefinitions_Tasks()
  {
        return (EAttribute)getDefinitions().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDefinitions_Project()
  {
        return (EAttribute)getDefinitions().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDefinitions_Projectids()
  {
        return (EAttribute)getDefinitions().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDepends()
  {
    if (dependsEClass == null)
    {
      dependsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(48);
    }
    return dependsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDetails()
  {
    if (detailsEClass == null)
    {
      detailsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(49);
    }
    return detailsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDuration()
  {
    if (durationEClass == null)
    {
      durationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(50);
    }
    return durationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDuration_Duration()
  {
        return (EReference)getDuration().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEfficiency()
  {
    if (efficiencyEClass == null)
    {
      efficiencyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(51);
    }
    return efficiencyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEfficiency_Efficiency()
  {
        return (EAttribute)getEfficiency().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEffort()
  {
    if (effortEClass == null)
    {
      effortEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(52);
    }
    return effortEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEffort_Effort()
  {
        return (EReference)getEffort().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEmail()
  {
    if (emailEClass == null)
    {
      emailEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(53);
    }
    return emailEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEmail_Address()
  {
        return (EAttribute)getEmail().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnd()
  {
    if (endEClass == null)
    {
      endEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(54);
    }
    return endEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnd_End()
  {
        return (EAttribute)getEnd().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEndCredit()
  {
    if (endCreditEClass == null)
    {
      endCreditEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(55);
    }
    return endCreditEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEndCredit_Credit()
  {
        return (EAttribute)getEndCredit().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEpilog()
  {
    if (epilogEClass == null)
    {
      epilogEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(56);
    }
    return epilogEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExtend()
  {
    if (extendEClass == null)
    {
      extendEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(57);
    }
    return extendEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExtend_Type()
  {
        return (EAttribute)getExtend().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExtend_Reference()
  {
        return (EReference)getExtend().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExtend_Date()
  {
        return (EReference)getExtend().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExtend_Richtext()
  {
        return (EReference)getExtend().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExtend_Text()
  {
        return (EReference)getExtend().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFail()
  {
    if (failEClass == null)
    {
      failEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(58);
    }
    return failEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFail_Expression()
  {
        return (EAttribute)getFail().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFlags()
  {
    if (flagsEClass == null)
    {
      flagsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(59);
    }
    return flagsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFlags_Flags()
  {
        return (EAttribute)getFlags().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFontColor()
  {
    if (fontColorEClass == null)
    {
      fontColorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(60);
    }
    return fontColorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFontColor_Color()
  {
        return (EAttribute)getFontColor().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFooter()
  {
    if (footerEClass == null)
    {
      footerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(61);
    }
    return footerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFormats()
  {
    if (formatsEClass == null)
    {
      formatsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(62);
    }
    return formatsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFormats_Formats()
  {
        return (EAttribute)getFormats().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGapDuration()
  {
    if (gapDurationEClass == null)
    {
      gapDurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(63);
    }
    return gapDurationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGapLength()
  {
    if (gapLengthEClass == null)
    {
      gapLengthEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(64);
    }
    return gapLengthEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHAlign()
  {
    if (hAlignEClass == null)
    {
      hAlignEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(65);
    }
    return hAlignEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHAlign_Expression()
  {
        return (EAttribute)getHAlign().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHAlign_Justification()
  {
        return (EAttribute)getHAlign().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHeader()
  {
    if (headerEClass == null)
    {
      headerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(66);
    }
    return headerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHeadline()
  {
    if (headlineEClass == null)
    {
      headlineEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(67);
    }
    return headlineEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHideReport()
  {
    if (hideReportEClass == null)
    {
      hideReportEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(68);
    }
    return hideReportEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHideReport_Expression()
  {
        return (EAttribute)getHideReport().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHideResource()
  {
    if (hideResourceEClass == null)
    {
      hideResourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(69);
    }
    return hideResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHideResource_Expression()
  {
        return (EAttribute)getHideResource().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHideTask()
  {
    if (hideTaskEClass == null)
    {
      hideTaskEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(70);
    }
    return hideTaskEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHideTask_Expression()
  {
        return (EAttribute)getHideTask().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInclude()
  {
    if (includeEClass == null)
    {
      includeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(71);
    }
    return includeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInclude_Filename()
  {
        return (EAttribute)getInclude().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterval1()
  {
    if (interval1EClass == null)
    {
      interval1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(72);
    }
    return interval1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInterval1_Start()
  {
        return (EAttribute)getInterval1().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInterval1_End()
  {
        return (EAttribute)getInterval1().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterval1_Duration()
  {
        return (EReference)getInterval1().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterval2()
  {
    if (interval2EClass == null)
    {
      interval2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(73);
    }
    return interval2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInterval2_Start()
  {
        return (EAttribute)getInterval2().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInterval2_End()
  {
        return (EAttribute)getInterval2().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterval2_Duration()
  {
        return (EReference)getInterval2().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterval3()
  {
    if (interval3EClass == null)
    {
      interval3EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(74);
    }
    return interval3EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInterval3_Start()
  {
        return (EAttribute)getInterval3().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInterval3_End()
  {
        return (EAttribute)getInterval3().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterval3_Duration()
  {
        return (EReference)getInterval3().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterval4()
  {
    if (interval4EClass == null)
    {
      interval4EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(75);
    }
    return interval4EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInterval4_Start()
  {
        return (EAttribute)getInterval4().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInterval4_End()
  {
        return (EAttribute)getInterval4().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterval4_Duration()
  {
        return (EReference)getInterval4().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJournalAttributes()
  {
    if (journalAttributesEClass == null)
    {
      journalAttributesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(76);
    }
    return journalAttributesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJournalAttributes_All()
  {
        return (EAttribute)getJournalAttributes().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJournalAttributes_None()
  {
        return (EAttribute)getJournalAttributes().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJournalAttributes_Flags()
  {
        return (EAttribute)getJournalAttributes().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJournalAttributes_Property()
  {
        return (EAttribute)getJournalAttributes().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJournalAttributes_Details()
  {
        return (EAttribute)getJournalAttributes().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJournalAttributes_Author()
  {
        return (EAttribute)getJournalAttributes().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJournalAttributes_Headline()
  {
        return (EAttribute)getJournalAttributes().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJournalAttributes_Date()
  {
        return (EAttribute)getJournalAttributes().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJournalAttributes_Timesheet()
  {
        return (EAttribute)getJournalAttributes().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJournalAttributes_Propertyid()
  {
        return (EAttribute)getJournalAttributes().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJournalAttributes_Summary()
  {
        return (EAttribute)getJournalAttributes().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJournalEntry()
  {
    if (journalEntryEClass == null)
    {
      journalEntryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(77);
    }
    return journalEntryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJournalEntry_Date()
  {
        return (EAttribute)getJournalEntry().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJournalEntry_Headline()
  {
        return (EAttribute)getJournalEntry().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJournalEntry_Alert()
  {
        return (EReference)getJournalEntry().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJournalEntry_Author()
  {
        return (EReference)getJournalEntry().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJournalEntry_Details()
  {
        return (EReference)getJournalEntry().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJournalEntry_Summary()
  {
        return (EReference)getJournalEntry().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJournalMode()
  {
    if (journalModeEClass == null)
    {
      journalModeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(78);
    }
    return journalModeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJournalMode_Mode()
  {
        return (EAttribute)getJournalMode().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLeft()
  {
    if (leftEClass == null)
    {
      leftEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(79);
    }
    return leftEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLength()
  {
    if (lengthEClass == null)
    {
      lengthEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(80);
    }
    return lengthEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLength_Length()
  {
        return (EReference)getLength().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLimits()
  {
    if (limitsEClass == null)
    {
      limitsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(81);
    }
    return limitsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLimits_Dailymax()
  {
        return (EReference)getLimits().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLimits_Dailymin()
  {
        return (EReference)getLimits().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLimits_Maximum()
  {
        return (EReference)getLimits().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLimits_Minimum()
  {
        return (EReference)getLimits().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLimits_Monthlymax()
  {
        return (EReference)getLimits().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLimits_Monthlymin()
  {
        return (EReference)getLimits().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLimits_Weeklymax()
  {
        return (EReference)getLimits().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLimits_Weeklymin()
  {
        return (EReference)getLimits().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getListItem()
  {
    if (listItemEClass == null)
    {
      listItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(82);
    }
    return listItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getListType()
  {
    if (listTypeEClass == null)
    {
      listTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(83);
    }
    return listTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getListType_Type()
  {
        return (EAttribute)getListType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLoadUnit()
  {
    if (loadUnitEClass == null)
    {
      loadUnitEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(84);
    }
    return loadUnitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLoadUnit_Unit()
  {
        return (EAttribute)getLoadUnit().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getManagers()
  {
    if (managersEClass == null)
    {
      managersEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(85);
    }
    return managersEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getManagers_Resources()
  {
        return (EReference)getManagers().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMandatory()
  {
    if (mandatoryEClass == null)
    {
      mandatoryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(86);
    }
    return mandatoryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMandatory_Mandatory()
  {
        return (EAttribute)getMandatory().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMaxEnd()
  {
    if (maxEndEClass == null)
    {
      maxEndEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(87);
    }
    return maxEndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMaxEnd_MaxEnd()
  {
        return (EAttribute)getMaxEnd().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMaximum()
  {
    if (maximumEClass == null)
    {
      maximumEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(88);
    }
    return maximumEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMaxStart()
  {
    if (maxStartEClass == null)
    {
      maxStartEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(89);
    }
    return maxStartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMaxStart_MaxStart()
  {
        return (EAttribute)getMaxStart().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMilestone()
  {
    if (milestoneEClass == null)
    {
      milestoneEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(90);
    }
    return milestoneEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMilestone_Milestone()
  {
        return (EAttribute)getMilestone().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMinimum()
  {
    if (minimumEClass == null)
    {
      minimumEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(91);
    }
    return minimumEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMinEnd()
  {
    if (minEndEClass == null)
    {
      minEndEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(92);
    }
    return minEndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMinEnd_MinEnd()
  {
        return (EAttribute)getMinEnd().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMinStart()
  {
    if (minStartEClass == null)
    {
      minStartEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(93);
    }
    return minStartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMinStart_MinStart()
  {
        return (EAttribute)getMinStart().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMonthlyMax()
  {
    if (monthlyMaxEClass == null)
    {
      monthlyMaxEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(94);
    }
    return monthlyMaxEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMonthlyMin()
  {
    if (monthlyMinEClass == null)
    {
      monthlyMinEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(95);
    }
    return monthlyMinEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNote()
  {
    if (noteEClass == null)
    {
      noteEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(96);
    }
    return noteEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNote_Note()
  {
        return (EAttribute)getNote().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNow()
  {
    if (nowEClass == null)
    {
      nowEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(97);
    }
    return nowEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNow_Now()
  {
        return (EAttribute)getNow().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumberFormat()
  {
    if (numberFormatEClass == null)
    {
      numberFormatEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(98);
    }
    return numberFormatEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPeriod()
  {
    if (periodEClass == null)
    {
      periodEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(99);
    }
    return periodEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPeriod_Period()
  {
        return (EReference)getPeriod().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPersistent()
  {
    if (persistentEClass == null)
    {
      persistentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(100);
    }
    return persistentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPersistent_Persistent()
  {
        return (EAttribute)getPersistent().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrecedes()
  {
    if (precedesEClass == null)
    {
      precedesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(101);
    }
    return precedesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPriority()
  {
    if (priorityEClass == null)
    {
      priorityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(102);
    }
    return priorityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPriority_Priority()
  {
        return (EAttribute)getPriority().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProjectId()
  {
    if (projectIdEClass == null)
    {
      projectIdEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(103);
    }
    return projectIdEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProjectId_ProjectId()
  {
        return (EAttribute)getProjectId().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProjectIds()
  {
    if (projectIdsEClass == null)
    {
      projectIdsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(104);
    }
    return projectIdsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProjectIds_Ids()
  {
        return (EAttribute)getProjectIds().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProlog()
  {
    if (prologEClass == null)
    {
      prologEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(105);
    }
    return prologEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPurge()
  {
    if (purgeEClass == null)
    {
      purgeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(106);
    }
    return purgeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPurge_ListAttribute()
  {
        return (EAttribute)getPurge().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRate()
  {
    if (rateEClass == null)
    {
      rateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(107);
    }
    return rateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRate_Rate()
  {
        return (EAttribute)getRate().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReferenceExtend()
  {
    if (referenceExtendEClass == null)
    {
      referenceExtendEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(108);
    }
    return referenceExtendEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRemaining()
  {
    if (remainingEClass == null)
    {
      remainingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(109);
    }
    return remainingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRemaining_Remaining()
  {
        return (EReference)getRemaining().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReportPrefix()
  {
    if (reportPrefixEClass == null)
    {
      reportPrefixEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(110);
    }
    return reportPrefixEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReportPrefix_Report()
  {
        return (EReference)getReportPrefix().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResourceAttributes()
  {
    if (resourceAttributesEClass == null)
    {
      resourceAttributesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(111);
    }
    return resourceAttributesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResourceAttributes_All()
  {
        return (EAttribute)getResourceAttributes().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResourceAttributes_None()
  {
        return (EAttribute)getResourceAttributes().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResourceAttributes_Vacation()
  {
        return (EAttribute)getResourceAttributes().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResourceAttributes_Booking()
  {
        return (EAttribute)getResourceAttributes().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResourceAttributes_WorkingHours()
  {
        return (EAttribute)getResourceAttributes().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResourcePrefix()
  {
    if (resourcePrefixEClass == null)
    {
      resourcePrefixEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(112);
    }
    return resourcePrefixEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getResourcePrefix_Resource()
  {
        return (EReference)getResourcePrefix().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResourceReport()
  {
    if (resourceReportEClass == null)
    {
      resourceReportEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(113);
    }
    return resourceReportEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResourceRoot()
  {
    if (resourceRootEClass == null)
    {
      resourceRootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(114);
    }
    return resourceRootEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getResourceRoot_Resource()
  {
        return (EReference)getResourceRoot().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResponsible()
  {
    if (responsibleEClass == null)
    {
      responsibleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(115);
    }
    return responsibleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getResponsible_Resources()
  {
        return (EReference)getResponsible().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRichTextExtend()
  {
    if (richTextExtendEClass == null)
    {
      richTextExtendEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(116);
    }
    return richTextExtendEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRight()
  {
    if (rightEClass == null)
    {
      rightEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(117);
    }
    return rightEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRollupResource()
  {
    if (rollupResourceEClass == null)
    {
      rollupResourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(118);
    }
    return rollupResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRollupResource_Expression()
  {
        return (EAttribute)getRollupResource().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRollupTask()
  {
    if (rollupTaskEClass == null)
    {
      rollupTaskEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(119);
    }
    return rollupTaskEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRollupTask_Expression()
  {
        return (EAttribute)getRollupTask().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScale()
  {
    if (scaleEClass == null)
    {
      scaleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(120);
    }
    return scaleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getScale_Scale()
  {
        return (EAttribute)getScale().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScenario()
  {
    if (scenarioEClass == null)
    {
      scenarioEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(121);
    }
    return scenarioEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getScenario_Id()
  {
        return (EAttribute)getScenario().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getScenario_Name()
  {
        return (EAttribute)getScenario().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getScenario_Active()
  {
        return (EAttribute)getScenario().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScenario_Scenario()
  {
        return (EReference)getScenario().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScenarios()
  {
    if (scenariosEClass == null)
    {
      scenariosEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(122);
    }
    return scenariosEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScenarios_Scenarios()
  {
        return (EReference)getScenarios().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScheduled()
  {
    if (scheduledEClass == null)
    {
      scheduledEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(123);
    }
    return scheduledEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getScheduled_Scheduled()
  {
        return (EAttribute)getScheduled().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScheduling()
  {
    if (schedulingEClass == null)
    {
      schedulingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(124);
    }
    return schedulingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getScheduling_Scheduling()
  {
        return (EAttribute)getScheduling().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelect()
  {
    if (selectEClass == null)
    {
      selectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(125);
    }
    return selectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSelect_Argument()
  {
        return (EAttribute)getSelect().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelfContained()
  {
    if (selfContainedEClass == null)
    {
      selfContainedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(126);
    }
    return selfContainedEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSelfContained_Selfcontained()
  {
        return (EAttribute)getSelfContained().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getShift()
  {
    if (shiftEClass == null)
    {
      shiftEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(127);
    }
    return shiftEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getShift_Id()
  {
        return (EAttribute)getShift().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getShift_Name()
  {
        return (EAttribute)getShift().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getShift_Replace()
  {
        return (EAttribute)getShift().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getShift_Timezone()
  {
        return (EAttribute)getShift().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getShift_Vacation()
  {
        return (EReference)getShift().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getShift_Shift()
  {
        return (EReference)getShift().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getShift_WorkingHours()
  {
        return (EReference)getShift().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getShiftTimesheet()
  {
    if (shiftTimesheetEClass == null)
    {
      shiftTimesheetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(128);
    }
    return shiftTimesheetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getShiftTimesheet_Shift()
  {
        return (EReference)getShiftTimesheet().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getShifts()
  {
    if (shiftsEClass == null)
    {
      shiftsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(129);
    }
    return shiftsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getShifts_Limits()
  {
        return (EReference)getShifts().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getShortTimeFormat()
  {
    if (shortTimeFormatEClass == null)
    {
      shortTimeFormatEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(130);
    }
    return shortTimeFormatEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getShortTimeFormat_ShortTimeFormat()
  {
        return (EAttribute)getShortTimeFormat().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSortJournalEntries()
  {
    if (sortJournalEntriesEClass == null)
    {
      sortJournalEntriesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(131);
    }
    return sortJournalEntriesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSortJournalEntries_Criteria()
  {
        return (EAttribute)getSortJournalEntries().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSortResources()
  {
    if (sortResourcesEClass == null)
    {
      sortResourcesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(132);
    }
    return sortResourcesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSortTasks()
  {
    if (sortTasksEClass == null)
    {
      sortTasksEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(133);
    }
    return sortTasksEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStart()
  {
    if (startEClass == null)
    {
      startEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(134);
    }
    return startEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStart_Start()
  {
        return (EAttribute)getStart().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStartCredit()
  {
    if (startCreditEClass == null)
    {
      startCreditEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(135);
    }
    return startCreditEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStartCredit_StartCredit()
  {
        return (EAttribute)getStartCredit().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatusStatusSheet()
  {
    if (statusStatusSheetEClass == null)
    {
      statusStatusSheetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(136);
    }
    return statusStatusSheetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStatusStatusSheet_Level()
  {
        return (EAttribute)getStatusStatusSheet().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStatusStatusSheet_Text()
  {
        return (EAttribute)getStatusStatusSheet().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatusStatusSheet_Attributes()
  {
        return (EReference)getStatusStatusSheet().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatusStatusSheetAttribute()
  {
    if (statusStatusSheetAttributeEClass == null)
    {
      statusStatusSheetAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(137);
    }
    return statusStatusSheetAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSummary()
  {
    if (summaryEClass == null)
    {
      summaryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(138);
    }
    return summaryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTagFile()
  {
    if (tagFileEClass == null)
    {
      tagFileEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(139);
    }
    return tagFileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTagFile_File()
  {
        return (EAttribute)getTagFile().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTagFile_HideResource()
  {
        return (EReference)getTagFile().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTagFile_HideTask()
  {
        return (EReference)getTagFile().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTagFile_RollupResource()
  {
        return (EReference)getTagFile().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTagFile_RollupTask()
  {
        return (EReference)getTagFile().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTaskStatusSheet()
  {
    if (taskStatusSheetEClass == null)
    {
      taskStatusSheetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(140);
    }
    return taskStatusSheetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTaskStatusSheet_Task()
  {
        return (EReference)getTaskStatusSheet().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTaskStatusSheet_Attributes()
  {
        return (EReference)getTaskStatusSheet().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTaskStatusSheetAttribute()
  {
    if (taskStatusSheetAttributeEClass == null)
    {
      taskStatusSheetAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(141);
    }
    return taskStatusSheetAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTaskTimesheet()
  {
    if (taskTimesheetEClass == null)
    {
      taskTimesheetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(142);
    }
    return taskTimesheetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTaskTimesheet_Task()
  {
        return (EReference)getTaskTimesheet().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTaskTimesheet_Attributes()
  {
        return (EReference)getTaskTimesheet().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTaskAttributes()
  {
    if (taskAttributesEClass == null)
    {
      taskAttributesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(143);
    }
    return taskAttributesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTaskAttributes_All()
  {
        return (EAttribute)getTaskAttributes().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTaskAttributes_None()
  {
        return (EAttribute)getTaskAttributes().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTaskAttributes_Responsible()
  {
        return (EAttribute)getTaskAttributes().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTaskAttributes_Flags()
  {
        return (EAttribute)getTaskAttributes().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTaskAttributes_Maxstart()
  {
        return (EAttribute)getTaskAttributes().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTaskAttributes_Maxend()
  {
        return (EAttribute)getTaskAttributes().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTaskAttributes_Priority()
  {
        return (EAttribute)getTaskAttributes().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTaskAttributes_Booking()
  {
        return (EAttribute)getTaskAttributes().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTaskAttributes_Note()
  {
        return (EAttribute)getTaskAttributes().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTaskAttributes_Minstart()
  {
        return (EAttribute)getTaskAttributes().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTaskAttributes_Minend()
  {
        return (EAttribute)getTaskAttributes().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTaskAttributes_Complete()
  {
        return (EAttribute)getTaskAttributes().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTaskAttributes_Depends()
  {
        return (EAttribute)getTaskAttributes().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTaskPrefix()
  {
    if (taskPrefixEClass == null)
    {
      taskPrefixEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(144);
    }
    return taskPrefixEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTaskPrefix_Task()
  {
        return (EReference)getTaskPrefix().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTaskReport()
  {
    if (taskReportEClass == null)
    {
      taskReportEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(145);
    }
    return taskReportEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTaskRoot()
  {
    if (taskRootEClass == null)
    {
      taskRootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(146);
    }
    return taskRootEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTaskRoot_Task()
  {
        return (EReference)getTaskRoot().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTextExtend()
  {
    if (textExtendEClass == null)
    {
      textExtendEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(147);
    }
    return textExtendEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTextReport()
  {
    if (textReportEClass == null)
    {
      textReportEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(148);
    }
    return textReportEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTimeFormat()
  {
    if (timeFormatEClass == null)
    {
      timeFormatEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(149);
    }
    return timeFormatEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTimeFormat_Timeformat()
  {
        return (EAttribute)getTimeFormat().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTimeoff()
  {
    if (timeoffEClass == null)
    {
      timeoffEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(150);
    }
    return timeoffEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTimeoff_Id()
  {
        return (EAttribute)getTimeoff().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTimeoff_Name()
  {
        return (EAttribute)getTimeoff().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTimesheet()
  {
    if (timesheetEClass == null)
    {
      timesheetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(151);
    }
    return timesheetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTimesheet_Resource()
  {
        return (EReference)getTimesheet().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTimesheet_Interval()
  {
        return (EReference)getTimesheet().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTimesheet_Attributes()
  {
        return (EReference)getTimesheet().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTimesheetReport()
  {
    if (timesheetReportEClass == null)
    {
      timesheetReportEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(152);
    }
    return timesheetReportEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTimesheetReport_Filename()
  {
        return (EAttribute)getTimesheetReport().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTimesheetReport_Comnent()
  {
        return (EAttribute)getTimesheetReport().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTimesheetReport_Attributes()
  {
        return (EReference)getTimesheetReport().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTimezone()
  {
    if (timezoneEClass == null)
    {
      timezoneEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(153);
    }
    return timezoneEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTimezone_Timezone()
  {
        return (EAttribute)getTimezone().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTimingResolution()
  {
    if (timingResolutionEClass == null)
    {
      timingResolutionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(154);
    }
    return timingResolutionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTimingResolution_TimingResolution()
  {
        return (EAttribute)getTimingResolution().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTitle()
  {
    if (titleEClass == null)
    {
      titleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(155);
    }
    return titleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTitle_Title()
  {
        return (EAttribute)getTitle().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getToolTip()
  {
    if (toolTipEClass == null)
    {
      toolTipEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(156);
    }
    return toolTipEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getToolTip_Expression()
  {
        return (EAttribute)getToolTip().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getToolTip_Tip()
  {
        return (EAttribute)getToolTip().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTrackingScenario()
  {
    if (trackingScenarioEClass == null)
    {
      trackingScenarioEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(157);
    }
    return trackingScenarioEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrackingScenario_Scenario()
  {
        return (EReference)getTrackingScenario().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTreeLevel()
  {
    if (treeLevelEClass == null)
    {
      treeLevelEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(158);
    }
    return treeLevelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTreeLevel_Level()
  {
        return (EAttribute)getTreeLevel().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVacation()
  {
    if (vacationEClass == null)
    {
      vacationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(159);
    }
    return vacationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVacation_Name()
  {
        return (EAttribute)getVacation().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVacation_Intervals()
  {
        return (EReference)getVacation().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVacationShift()
  {
    if (vacationShiftEClass == null)
    {
      vacationShiftEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(160);
    }
    return vacationShiftEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVacationShift_Name()
  {
        return (EAttribute)getVacationShift().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVacationShift_Intervals()
  {
        return (EReference)getVacationShift().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWarn()
  {
    if (warnEClass == null)
    {
      warnEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(161);
    }
    return warnEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWarn_Expression()
  {
        return (EAttribute)getWarn().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWeekStarts()
  {
    if (weekStartsEClass == null)
    {
      weekStartsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(162);
    }
    return weekStartsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWeekStarts_Sunday()
  {
        return (EAttribute)getWeekStarts().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWeekStarts_Monday()
  {
        return (EAttribute)getWeekStarts().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWeeklyMax()
  {
    if (weeklyMaxEClass == null)
    {
      weeklyMaxEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(163);
    }
    return weeklyMaxEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWeeklyMin()
  {
    if (weeklyMinEClass == null)
    {
      weeklyMinEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(164);
    }
    return weeklyMinEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWidth()
  {
    if (widthEClass == null)
    {
      widthEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(165);
    }
    return widthEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWidth_Width()
  {
        return (EAttribute)getWidth().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWork()
  {
    if (workEClass == null)
    {
      workEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(166);
    }
    return workEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWork_Value()
  {
        return (EAttribute)getWork().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWork_Unit()
  {
        return (EAttribute)getWork().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWorkingHours()
  {
    if (workingHoursEClass == null)
    {
      workingHoursEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(167);
    }
    return workingHoursEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWorkingHours_Weekdays()
  {
        return (EReference)getWorkingHours().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWorkingHours_Off()
  {
        return (EAttribute)getWorkingHours().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWorkingHours_Hours()
  {
        return (EReference)getWorkingHours().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getYearlyWorkingDays()
  {
    if (yearlyWorkingDaysEClass == null)
    {
      yearlyWorkingDaysEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(168);
    }
    return yearlyWorkingDaysEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getYearlyWorkingDays_YearlyWorkingDays()
  {
        return (EAttribute)getYearlyWorkingDays().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAccountShare()
  {
    if (accountShareEClass == null)
    {
      accountShareEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(169);
    }
    return accountShareEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAccountShare_Account()
  {
        return (EReference)getAccountShare().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAccountShare_Share()
  {
        return (EAttribute)getAccountShare().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColumnAttribute()
  {
    if (columnAttributeEClass == null)
    {
      columnAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(170);
    }
    return columnAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColumn()
  {
    if (columnEClass == null)
    {
      columnEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(171);
    }
    return columnEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColumn_Id()
  {
        return (EAttribute)getColumn().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getColumn_Attribute()
  {
        return (EReference)getColumn().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCriterion()
  {
    if (criterionEClass == null)
    {
      criterionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(172);
    }
    return criterionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCriterion_Scenario()
  {
        return (EReference)getCriterion().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCriterion_CriterionId()
  {
        return (EReference)getCriterion().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCriterionId()
  {
    if (criterionIdEClass == null)
    {
      criterionIdEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(173);
    }
    return criterionIdEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCriterionId_ColumnId()
  {
        return (EAttribute)getCriterionId().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCriterionId_Direction()
  {
        return (EAttribute)getCriterionId().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDurationQuantity()
  {
    if (durationQuantityEClass == null)
    {
      durationQuantityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(174);
    }
    return durationQuantityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDurationQuantity_Value()
  {
        return (EAttribute)getDurationQuantity().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDurationQuantity_Unit()
  {
        return (EAttribute)getDurationQuantity().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExtendAttribute()
  {
    if (extendAttributeEClass == null)
    {
      extendAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(175);
    }
    return extendAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExtendAttribute_Id()
  {
        return (EAttribute)getExtendAttribute().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExtendAttribute_Name()
  {
        return (EAttribute)getExtendAttribute().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExtendAttribute_Inherit()
  {
        return (EAttribute)getExtendAttribute().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExtendAttribute_Scenariospecific()
  {
        return (EAttribute)getExtendAttribute().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRealFormat()
  {
    if (realFormatEClass == null)
    {
      realFormatEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(176);
    }
    return realFormatEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRealFormat_NegativePrefix()
  {
        return (EAttribute)getRealFormat().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRealFormat_NegativeSuffix()
  {
        return (EAttribute)getRealFormat().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRealFormat_ThousandsSeparator()
  {
        return (EAttribute)getRealFormat().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRealFormat_FractionSeparator()
  {
        return (EAttribute)getRealFormat().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRealFormat_FractionDigits()
  {
        return (EAttribute)getRealFormat().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getShiftLimit()
  {
    if (shiftLimitEClass == null)
    {
      shiftLimitEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(177);
    }
    return shiftLimitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getShiftLimit_Shift()
  {
        return (EReference)getShiftLimit().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getShiftLimit_Intervals()
  {
        return (EReference)getShiftLimit().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSort()
  {
    if (sortEClass == null)
    {
      sortEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(178);
    }
    return sortEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSort_Id()
  {
        return (EAttribute)getSort().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSort_Criteria()
  {
        return (EReference)getSort().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTaskDependency()
  {
    if (taskDependencyEClass == null)
    {
      taskDependencyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(179);
    }
    return taskDependencyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTaskDependency_Task()
  {
        return (EReference)getTaskDependency().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTaskDependency_GapDuration()
  {
        return (EReference)getTaskDependency().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTaskDependency_GapLength()
  {
        return (EReference)getTaskDependency().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTaskDependency_Policy()
  {
        return (EAttribute)getTaskDependency().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTaskTimesheetAttribute()
  {
    if (taskTimesheetAttributeEClass == null)
    {
      taskTimesheetAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(180);
    }
    return taskTimesheetAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTimesheetAttribute()
  {
    if (timesheetAttributeEClass == null)
    {
      timesheetAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(181);
    }
    return timesheetAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTimesheetReportAttribute()
  {
    if (timesheetReportAttributeEClass == null)
    {
      timesheetReportAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(182);
    }
    return timesheetReportAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRichText()
  {
    if (richTextEClass == null)
    {
      richTextEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(183);
    }
    return richTextEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRichText_Text()
  {
        return (EAttribute)getRichText().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWorkHours()
  {
    if (workHoursEClass == null)
    {
      workHoursEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(184);
    }
    return workHoursEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWorkHours_Start()
  {
        return (EAttribute)getWorkHours().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWorkHours_Stop()
  {
        return (EAttribute)getWorkHours().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWeekdays()
  {
    if (weekdaysEClass == null)
    {
      weekdaysEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(185);
    }
    return weekdaysEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWeekdays_First()
  {
        return (EAttribute)getWeekdays().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWeekdays_Last()
  {
        return (EAttribute)getWeekdays().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getChargeApplies()
  {
    if (chargeAppliesEEnum == null)
    {
      chargeAppliesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(186);
    }
    return chargeAppliesEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getJustification()
  {
    if (justificationEEnum == null)
    {
      justificationEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(187);
    }
    return justificationEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getJournalModeValue()
  {
    if (journalModeValueEEnum == null)
    {
      journalModeValueEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(188);
    }
    return journalModeValueEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getJournalEntrySortCriterion()
  {
    if (journalEntrySortCriterionEEnum == null)
    {
      journalEntrySortCriterionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(189);
    }
    return journalEntrySortCriterionEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getListTypeValues()
  {
    if (listTypeValuesEEnum == null)
    {
      listTypeValuesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(190);
    }
    return listTypeValuesEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getCriterionDirection()
  {
    if (criterionDirectionEEnum == null)
    {
      criterionDirectionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(191);
    }
    return criterionDirectionEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getYesNo()
  {
    if (yesNoEEnum == null)
    {
      yesNoEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(192);
    }
    return yesNoEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getReportFormat()
  {
    if (reportFormatEEnum == null)
    {
      reportFormatEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(193);
    }
    return reportFormatEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getLoadDisplayUnit()
  {
    if (loadDisplayUnitEEnum == null)
    {
      loadDisplayUnitEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(194);
    }
    return loadDisplayUnitEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getScaleResolution()
  {
    if (scaleResolutionEEnum == null)
    {
      scaleResolutionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(195);
    }
    return scaleResolutionEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getSelectArgument()
  {
    if (selectArgumentEEnum == null)
    {
      selectArgumentEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(196);
    }
    return selectArgumentEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getColumnId()
  {
    if (columnIdEEnum == null)
    {
      columnIdEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(197);
    }
    return columnIdEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getAlertLevel()
  {
    if (alertLevelEEnum == null)
    {
      alertLevelEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(198);
    }
    return alertLevelEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getDependsPolicy()
  {
    if (dependsPolicyEEnum == null)
    {
      dependsPolicyEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(199);
    }
    return dependsPolicyEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getSchedulingPolicy()
  {
    if (schedulingPolicyEEnum == null)
    {
      schedulingPolicyEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(200);
    }
    return schedulingPolicyEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getTimeUnit()
  {
    if (timeUnitEEnum == null)
    {
      timeUnitEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(201);
    }
    return timeUnitEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getWeekday()
  {
    if (weekdayEEnum == null)
    {
      weekdayEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(202);
    }
    return weekdayEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getWorkQuantityUnit()
  {
    if (workQuantityUnitEEnum == null)
    {
      workQuantityUnitEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI).getEClassifiers().get(203);
    }
    return workQuantityUnitEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProjectFactory getProjectFactory()
  {
    return (ProjectFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isLoaded = false;

  /**
   * Laods the package and any sub-packages from their serialized form.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void loadPackage()
  {
    if (isLoaded) return;
    isLoaded = true;

    URL url = getClass().getResource(packageFilename);
    if (url == null)
    {
      throw new RuntimeException("Missing serialized package: " + packageFilename);
    }
    URI uri = URI.createURI(url.toString());
    Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
    try
    {
      resource.load(null);
    }
    catch (IOException exception)
    {
      throw new WrappedException(exception);
    }
    initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
    createResource(eNS_URI);
  }


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isFixed = false;

  /**
   * Fixes up the loaded package, to make it appear as if it had been programmatically built.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void fixPackageContents()
  {
    if (isFixed) return;
    isFixed = true;
    fixEClassifiers();
  }

  /**
   * Sets the instance class on the given classifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected void fixInstanceClass(EClassifier eClassifier)
  {
    if (eClassifier.getInstanceClassName() == null)
    {
      eClassifier.setInstanceClassName("org.jjflyboy.tjpeditor.project." + eClassifier.getName());
      setGeneratedClassName(eClassifier);
    }
  }

} //ProjectPackageImpl
