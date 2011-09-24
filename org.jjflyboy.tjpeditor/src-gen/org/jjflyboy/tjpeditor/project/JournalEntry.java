/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Journal Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.JournalEntry#getDate <em>Date</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.JournalEntry#getHeadline <em>Headline</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.JournalEntry#getAlert <em>Alert</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.JournalEntry#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.JournalEntry#getDetails <em>Details</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.JournalEntry#getSummary <em>Summary</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getJournalEntry()
 * @model
 * @generated
 */
public interface JournalEntry extends ProjectAttribute, TaskAttribute
{
  /**
   * Returns the value of the '<em><b>Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Date</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Date</em>' attribute.
   * @see #setDate(String)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getJournalEntry_Date()
   * @model
   * @generated
   */
  String getDate();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.JournalEntry#getDate <em>Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Date</em>' attribute.
   * @see #getDate()
   * @generated
   */
  void setDate(String value);

  /**
   * Returns the value of the '<em><b>Headline</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Headline</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Headline</em>' attribute.
   * @see #setHeadline(String)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getJournalEntry_Headline()
   * @model
   * @generated
   */
  String getHeadline();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.JournalEntry#getHeadline <em>Headline</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Headline</em>' attribute.
   * @see #getHeadline()
   * @generated
   */
  void setHeadline(String value);

  /**
   * Returns the value of the '<em><b>Alert</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alert</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alert</em>' containment reference.
   * @see #setAlert(Alert)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getJournalEntry_Alert()
   * @model containment="true"
   * @generated
   */
  Alert getAlert();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.JournalEntry#getAlert <em>Alert</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Alert</em>' containment reference.
   * @see #getAlert()
   * @generated
   */
  void setAlert(Alert value);

  /**
   * Returns the value of the '<em><b>Author</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Author</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Author</em>' containment reference.
   * @see #setAuthor(Author)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getJournalEntry_Author()
   * @model containment="true"
   * @generated
   */
  Author getAuthor();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.JournalEntry#getAuthor <em>Author</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Author</em>' containment reference.
   * @see #getAuthor()
   * @generated
   */
  void setAuthor(Author value);

  /**
   * Returns the value of the '<em><b>Details</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Details</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Details</em>' containment reference.
   * @see #setDetails(Details)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getJournalEntry_Details()
   * @model containment="true"
   * @generated
   */
  Details getDetails();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.JournalEntry#getDetails <em>Details</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Details</em>' containment reference.
   * @see #getDetails()
   * @generated
   */
  void setDetails(Details value);

  /**
   * Returns the value of the '<em><b>Summary</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Summary</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Summary</em>' containment reference.
   * @see #setSummary(Summary)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getJournalEntry_Summary()
   * @model containment="true"
   * @generated
   */
  Summary getSummary();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.JournalEntry#getSummary <em>Summary</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Summary</em>' containment reference.
   * @see #getSummary()
   * @generated
   */
  void setSummary(Summary value);

} // JournalEntry
