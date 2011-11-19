/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extended Task Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.ExtendedTaskAttribute#getExtend <em>Extend</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.ExtendedTaskAttribute#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getExtendedTaskAttribute()
 * @model
 * @generated
 */
public interface ExtendedTaskAttribute extends TaskAttribute
{
  /**
   * Returns the value of the '<em><b>Extend</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extend</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extend</em>' reference.
   * @see #setExtend(Extend)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getExtendedTaskAttribute_Extend()
   * @model
   * @generated
   */
  Extend getExtend();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.ExtendedTaskAttribute#getExtend <em>Extend</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Extend</em>' reference.
   * @see #getExtend()
   * @generated
   */
  void setExtend(Extend value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getExtendedTaskAttribute_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.ExtendedTaskAttribute#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // ExtendedTaskAttribute
