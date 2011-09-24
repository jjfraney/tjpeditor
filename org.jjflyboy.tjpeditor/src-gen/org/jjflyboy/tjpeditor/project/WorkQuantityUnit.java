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
 * A representation of the literals of the enumeration '<em><b>Work Quantity Unit</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getWorkQuantityUnit()
 * @model
 * @generated
 */
public enum WorkQuantityUnit implements Enumerator
{
  /**
   * The '<em><b>PERCENT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PERCENT_VALUE
   * @generated
   * @ordered
   */
  PERCENT(0, "PERCENT", "%"),

  /**
   * The '<em><b>MINUTES</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MINUTES_VALUE
   * @generated
   * @ordered
   */
  MINUTES(1, "MINUTES", "min"),

  /**
   * The '<em><b>HOURS</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #HOURS_VALUE
   * @generated
   * @ordered
   */
  HOURS(2, "HOURS", "h"),

  /**
   * The '<em><b>DAYS</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DAYS_VALUE
   * @generated
   * @ordered
   */
  DAYS(3, "DAYS", "d");

  /**
   * The '<em><b>PERCENT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PERCENT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PERCENT
   * @model literal="%"
   * @generated
   * @ordered
   */
  public static final int PERCENT_VALUE = 0;

  /**
   * The '<em><b>MINUTES</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MINUTES</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MINUTES
   * @model literal="min"
   * @generated
   * @ordered
   */
  public static final int MINUTES_VALUE = 1;

  /**
   * The '<em><b>HOURS</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>HOURS</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #HOURS
   * @model literal="h"
   * @generated
   * @ordered
   */
  public static final int HOURS_VALUE = 2;

  /**
   * The '<em><b>DAYS</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DAYS</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DAYS
   * @model literal="d"
   * @generated
   * @ordered
   */
  public static final int DAYS_VALUE = 3;

  /**
   * An array of all the '<em><b>Work Quantity Unit</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final WorkQuantityUnit[] VALUES_ARRAY =
    new WorkQuantityUnit[]
    {
      PERCENT,
      MINUTES,
      HOURS,
      DAYS,
    };

  /**
   * A public read-only list of all the '<em><b>Work Quantity Unit</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<WorkQuantityUnit> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Work Quantity Unit</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static WorkQuantityUnit get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      WorkQuantityUnit result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Work Quantity Unit</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static WorkQuantityUnit getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      WorkQuantityUnit result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Work Quantity Unit</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static WorkQuantityUnit get(int value)
  {
    switch (value)
    {
      case PERCENT_VALUE: return PERCENT;
      case MINUTES_VALUE: return MINUTES;
      case HOURS_VALUE: return HOURS;
      case DAYS_VALUE: return DAYS;
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
  private WorkQuantityUnit(int value, String name, String literal)
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
  
} //WorkQuantityUnit
