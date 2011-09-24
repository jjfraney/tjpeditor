/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extend Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.ExtendAttribute#getId <em>Id</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.ExtendAttribute#getName <em>Name</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.ExtendAttribute#isInherit <em>Inherit</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.ExtendAttribute#isScenariospecific <em>Scenariospecific</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getExtendAttribute()
 * @model
 * @generated
 */
public interface ExtendAttribute extends DateExtend, ReferenceExtend, RichTextExtend, TextExtend
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getExtendAttribute_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.ExtendAttribute#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getExtendAttribute_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.ExtendAttribute#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Inherit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inherit</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inherit</em>' attribute.
   * @see #setInherit(boolean)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getExtendAttribute_Inherit()
   * @model
   * @generated
   */
  boolean isInherit();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.ExtendAttribute#isInherit <em>Inherit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inherit</em>' attribute.
   * @see #isInherit()
   * @generated
   */
  void setInherit(boolean value);

  /**
   * Returns the value of the '<em><b>Scenariospecific</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scenariospecific</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scenariospecific</em>' attribute.
   * @see #setScenariospecific(boolean)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getExtendAttribute_Scenariospecific()
   * @model
   * @generated
   */
  boolean isScenariospecific();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.ExtendAttribute#isScenariospecific <em>Scenariospecific</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scenariospecific</em>' attribute.
   * @see #isScenariospecific()
   * @generated
   */
  void setScenariospecific(boolean value);

} // ExtendAttribute
