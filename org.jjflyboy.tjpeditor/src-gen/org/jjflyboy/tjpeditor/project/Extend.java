/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extend</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Extend#getType <em>Type</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Extend#getReference <em>Reference</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Extend#getDate <em>Date</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Extend#getRichtext <em>Richtext</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.Extend#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getExtend()
 * @model
 * @generated
 */
public interface Extend extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getExtend_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Extend#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference</em>' containment reference.
   * @see #setReference(ReferenceExtend)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getExtend_Reference()
   * @model containment="true"
   * @generated
   */
  ReferenceExtend getReference();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Extend#getReference <em>Reference</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' containment reference.
   * @see #getReference()
   * @generated
   */
  void setReference(ReferenceExtend value);

  /**
   * Returns the value of the '<em><b>Date</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Date</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Date</em>' containment reference.
   * @see #setDate(DateExtend)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getExtend_Date()
   * @model containment="true"
   * @generated
   */
  DateExtend getDate();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Extend#getDate <em>Date</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Date</em>' containment reference.
   * @see #getDate()
   * @generated
   */
  void setDate(DateExtend value);

  /**
   * Returns the value of the '<em><b>Richtext</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Richtext</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Richtext</em>' containment reference.
   * @see #setRichtext(RichTextExtend)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getExtend_Richtext()
   * @model containment="true"
   * @generated
   */
  RichTextExtend getRichtext();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Extend#getRichtext <em>Richtext</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Richtext</em>' containment reference.
   * @see #getRichtext()
   * @generated
   */
  void setRichtext(RichTextExtend value);

  /**
   * Returns the value of the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' containment reference.
   * @see #setText(TextExtend)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getExtend_Text()
   * @model containment="true"
   * @generated
   */
  TextExtend getText();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.Extend#getText <em>Text</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' containment reference.
   * @see #getText()
   * @generated
   */
  void setText(TextExtend value);

} // Extend
