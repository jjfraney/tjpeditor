/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tracking Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.TrackingScenario#getScenario <em>Scenario</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getTrackingScenario()
 * @model
 * @generated
 */
public interface TrackingScenario extends ProjectAttribute
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
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getTrackingScenario_Scenario()
   * @model
   * @generated
   */
  Scenario getScenario();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.TrackingScenario#getScenario <em>Scenario</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scenario</em>' reference.
   * @see #getScenario()
   * @generated
   */
  void setScenario(Scenario value);

} // TrackingScenario
