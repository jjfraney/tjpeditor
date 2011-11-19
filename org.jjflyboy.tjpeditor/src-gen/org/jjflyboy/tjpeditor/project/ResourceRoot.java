/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.ResourceRoot#getResource <em>Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getResourceRoot()
 * @model
 * @generated
 */
public interface ResourceRoot extends ReportAttribute
{
  /**
   * Returns the value of the '<em><b>Resource</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resource</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resource</em>' reference.
   * @see #setResource(Resource)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getResourceRoot_Resource()
   * @model
   * @generated
   */
  Resource getResource();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.ResourceRoot#getResource <em>Resource</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Resource</em>' reference.
   * @see #getResource()
   * @generated
   */
  void setResource(Resource value);

} // ResourceRoot
