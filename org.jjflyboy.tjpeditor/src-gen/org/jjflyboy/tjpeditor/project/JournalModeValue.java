/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Journal Mode Value</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getJournalModeValue()
 * @model
 * @generated
 */
public enum JournalModeValue implements Enumerator
{
  /**
   * The '<em><b>JOURNAL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #JOURNAL_VALUE
   * @generated
   * @ordered
   */
  JOURNAL(0, "JOURNAL", "journal"),

  /**
   * The '<em><b>JOURNAL SUB</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #JOURNAL_SUB_VALUE
   * @generated
   * @ordered
   */
  JOURNAL_SUB(1, "JOURNAL_SUB", "journal_sub"),

  /**
   * The '<em><b>STATUS DOWN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STATUS_DOWN_VALUE
   * @generated
   * @ordered
   */
  STATUS_DOWN(2, "STATUS_DOWN", "status_down"),

  /**
   * The '<em><b>STATUS UP</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STATUS_UP_VALUE
   * @generated
   * @ordered
   */
  STATUS_UP(3, "STATUS_UP", "status_up"),

  /**
   * The '<em><b>ALERTS DOWN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ALERTS_DOWN_VALUE
   * @generated
   * @ordered
   */
  ALERTS_DOWN(4, "ALERTS_DOWN", "alerts_down");

  /**
   * The '<em><b>JOURNAL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>JOURNAL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #JOURNAL
   * @model literal="journal"
   * @generated
   * @ordered
   */
  public static final int JOURNAL_VALUE = 0;

  /**
   * The '<em><b>JOURNAL SUB</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>JOURNAL SUB</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #JOURNAL_SUB
   * @model literal="journal_sub"
   * @generated
   * @ordered
   */
  public static final int JOURNAL_SUB_VALUE = 1;

  /**
   * The '<em><b>STATUS DOWN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>STATUS DOWN</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #STATUS_DOWN
   * @model literal="status_down"
   * @generated
   * @ordered
   */
  public static final int STATUS_DOWN_VALUE = 2;

  /**
   * The '<em><b>STATUS UP</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>STATUS UP</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #STATUS_UP
   * @model literal="status_up"
   * @generated
   * @ordered
   */
  public static final int STATUS_UP_VALUE = 3;

  /**
   * The '<em><b>ALERTS DOWN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ALERTS DOWN</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ALERTS_DOWN
   * @model literal="alerts_down"
   * @generated
   * @ordered
   */
  public static final int ALERTS_DOWN_VALUE = 4;

  /**
   * An array of all the '<em><b>Journal Mode Value</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final JournalModeValue[] VALUES_ARRAY =
    new JournalModeValue[]
    {
      JOURNAL,
      JOURNAL_SUB,
      STATUS_DOWN,
      STATUS_UP,
      ALERTS_DOWN,
    };

  /**
   * A public read-only list of all the '<em><b>Journal Mode Value</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<JournalModeValue> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Journal Mode Value</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static JournalModeValue get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      JournalModeValue result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Journal Mode Value</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static JournalModeValue getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      JournalModeValue result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Journal Mode Value</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static JournalModeValue get(int value)
  {
    switch (value)
    {
      case JOURNAL_VALUE: return JOURNAL;
      case JOURNAL_SUB_VALUE: return JOURNAL_SUB;
      case STATUS_DOWN_VALUE: return STATUS_DOWN;
      case STATUS_UP_VALUE: return STATUS_UP;
      case ALERTS_DOWN_VALUE: return ALERTS_DOWN;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private JournalModeValue(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //JournalModeValue
