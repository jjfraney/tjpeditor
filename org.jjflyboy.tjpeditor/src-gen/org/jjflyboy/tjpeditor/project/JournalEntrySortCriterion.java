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
 * A representation of the literals of the enumeration '<em><b>Journal Entry Sort Criterion</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getJournalEntrySortCriterion()
 * @model
 * @generated
 */
public enum JournalEntrySortCriterion implements Enumerator
{
  /**
   * The '<em><b>DATE DOWN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DATE_DOWN_VALUE
   * @generated
   * @ordered
   */
  DATE_DOWN(0, "DATE_DOWN", "date.down"),

  /**
   * The '<em><b>DATE UP</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DATE_UP_VALUE
   * @generated
   * @ordered
   */
  DATE_UP(1, "DATE_UP", "date.up"),

  /**
   * The '<em><b>ALERT DOWN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ALERT_DOWN_VALUE
   * @generated
   * @ordered
   */
  ALERT_DOWN(2, "ALERT_DOWN", "alert.down"),

  /**
   * The '<em><b>ALERT UP</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ALERT_UP_VALUE
   * @generated
   * @ordered
   */
  ALERT_UP(3, "ALERT_UP", "alert.up"),

  /**
   * The '<em><b>PROPERTY UP</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PROPERTY_UP_VALUE
   * @generated
   * @ordered
   */
  PROPERTY_UP(4, "PROPERTY_UP", "property.up");

  /**
   * The '<em><b>DATE DOWN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DATE DOWN</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DATE_DOWN
   * @model literal="date.down"
   * @generated
   * @ordered
   */
  public static final int DATE_DOWN_VALUE = 0;

  /**
   * The '<em><b>DATE UP</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DATE UP</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DATE_UP
   * @model literal="date.up"
   * @generated
   * @ordered
   */
  public static final int DATE_UP_VALUE = 1;

  /**
   * The '<em><b>ALERT DOWN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ALERT DOWN</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ALERT_DOWN
   * @model literal="alert.down"
   * @generated
   * @ordered
   */
  public static final int ALERT_DOWN_VALUE = 2;

  /**
   * The '<em><b>ALERT UP</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ALERT UP</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ALERT_UP
   * @model literal="alert.up"
   * @generated
   * @ordered
   */
  public static final int ALERT_UP_VALUE = 3;

  /**
   * The '<em><b>PROPERTY UP</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PROPERTY UP</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PROPERTY_UP
   * @model literal="property.up"
   * @generated
   * @ordered
   */
  public static final int PROPERTY_UP_VALUE = 4;

  /**
   * An array of all the '<em><b>Journal Entry Sort Criterion</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final JournalEntrySortCriterion[] VALUES_ARRAY =
    new JournalEntrySortCriterion[]
    {
      DATE_DOWN,
      DATE_UP,
      ALERT_DOWN,
      ALERT_UP,
      PROPERTY_UP,
    };

  /**
   * A public read-only list of all the '<em><b>Journal Entry Sort Criterion</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<JournalEntrySortCriterion> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Journal Entry Sort Criterion</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static JournalEntrySortCriterion get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      JournalEntrySortCriterion result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Journal Entry Sort Criterion</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static JournalEntrySortCriterion getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      JournalEntrySortCriterion result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Journal Entry Sort Criterion</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static JournalEntrySortCriterion get(int value)
  {
    switch (value)
    {
      case DATE_DOWN_VALUE: return DATE_DOWN;
      case DATE_UP_VALUE: return DATE_UP;
      case ALERT_DOWN_VALUE: return ALERT_DOWN;
      case ALERT_UP_VALUE: return ALERT_UP;
      case PROPERTY_UP_VALUE: return PROPERTY_UP;
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
  private JournalEntrySortCriterion(int value, String name, String literal)
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
  
} //JournalEntrySortCriterion
