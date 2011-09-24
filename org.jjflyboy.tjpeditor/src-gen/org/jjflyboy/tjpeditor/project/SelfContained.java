/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Self Contained</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.SelfContained#getSelfcontained <em>Selfcontained</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getSelfContained()
 * @model
 * @generated
 */
public interface SelfContained extends ReportAttribute
{
  /**
   * Returns the value of the '<em><b>Selfcontained</b></em>' attribute.
   * The literals are from the enumeration {@link org.jjflyboy.tjpeditor.project.YesNo}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Selfcontained</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selfcontained</em>' attribute.
   * @see org.jjflyboy.tjpeditor.project.YesNo
   * @see #setSelfcontained(YesNo)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getSelfContained_Selfcontained()
   * @model
   * @generated
   */
  YesNo getSelfcontained();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.SelfContained#getSelfcontained <em>Selfcontained</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Selfcontained</em>' attribute.
   * @see org.jjflyboy.tjpeditor.project.YesNo
   * @see #getSelfcontained()
   * @generated
   */
  void setSelfcontained(YesNo value);

} // SelfContained
