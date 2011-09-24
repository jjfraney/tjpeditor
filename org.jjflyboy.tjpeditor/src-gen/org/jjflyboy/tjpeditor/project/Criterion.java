/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Criterion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Criterion#getScenario <em>Scenario</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Criterion#getCriterionId <em>Criterion Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getCriterion()
 * @model
 * @generated
 */
public interface Criterion extends EObject
{
  /**
   * Returns the value of the '<em><b>Scenario</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scenario</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scenario</em>' reference.
   * @see #setScenario(Scenario)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getCriterion_Scenario()
   * @model
   * @generated
   */
  Scenario getScenario();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Criterion#getScenario <em>Scenario</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scenario</em>' reference.
   * @see #getScenario()
   * @generated
   */
  void setScenario(Scenario value);

  /**
   * Returns the value of the '<em><b>Criterion Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Criterion Id</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Criterion Id</em>' containment reference.
   * @see #setCriterionId(CriterionId)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getCriterion_CriterionId()
   * @model containment="true"
   * @generated
   */
  CriterionId getCriterionId();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Criterion#getCriterionId <em>Criterion Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Criterion Id</em>' containment reference.
   * @see #getCriterionId()
   * @generated
   */
  void setCriterionId(CriterionId value);

} // Criterion
