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
 * A representation of the literals of the enumeration '<em><b>Time Unit</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getTimeUnit()
 * @model
 * @generated
 */
public enum TimeUnit implements Enumerator
{
  /**
   * The '<em><b>MINUTE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MINUTE_VALUE
   * @generated
   * @ordered
   */
  MINUTE(0, "MINUTE", "min"),

  /**
   * The '<em><b>HOUR</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #HOUR_VALUE
   * @generated
   * @ordered
   */
  HOUR(1, "HOUR", "h"),

  /**
   * The '<em><b>DAY</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DAY_VALUE
   * @generated
   * @ordered
   */
  DAY(2, "DAY", "d"),

  /**
   * The '<em><b>WEEK</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #WEEK_VALUE
   * @generated
   * @ordered
   */
  WEEK(3, "WEEK", "w"),

  /**
   * The '<em><b>MONTH</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MONTH_VALUE
   * @generated
   * @ordered
   */
  MONTH(4, "MONTH", "m"),

  /**
   * The '<em><b>YEAR</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #YEAR_VALUE
   * @generated
   * @ordered
   */
  YEAR(5, "YEAR", "y");

  /**
   * The '<em><b>MINUTE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MINUTE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MINUTE
   * @model literal="min"
   * @generated
   * @ordered
   */
  public static final int MINUTE_VALUE = 0;

  /**
   * The '<em><b>HOUR</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>HOUR</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #HOUR
   * @model literal="h"
   * @generated
   * @ordered
   */
  public static final int HOUR_VALUE = 1;

  /**
   * The '<em><b>DAY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DAY</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DAY
   * @model literal="d"
   * @generated
   * @ordered
   */
  public static final int DAY_VALUE = 2;

  /**
   * The '<em><b>WEEK</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>WEEK</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #WEEK
   * @model literal="w"
   * @generated
   * @ordered
   */
  public static final int WEEK_VALUE = 3;

  /**
   * The '<em><b>MONTH</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MONTH</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MONTH
   * @model literal="m"
   * @generated
   * @ordered
   */
  public static final int MONTH_VALUE = 4;

  /**
   * The '<em><b>YEAR</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>YEAR</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #YEAR
   * @model literal="y"
   * @generated
   * @ordered
   */
  public static final int YEAR_VALUE = 5;

  /**
   * An array of all the '<em><b>Time Unit</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final TimeUnit[] VALUES_ARRAY =
    new TimeUnit[]
    {
      MINUTE,
      HOUR,
      DAY,
      WEEK,
      MONTH,
      YEAR,
    };

  /**
   * A public read-only list of all the '<em><b>Time Unit</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<TimeUnit> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Time Unit</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TimeUnit get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      TimeUnit result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Time Unit</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TimeUnit getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      TimeUnit result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Time Unit</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TimeUnit get(int value)
  {
    switch (value)
    {
      case MINUTE_VALUE: return MINUTE;
      case HOUR_VALUE: return HOUR;
      case DAY_VALUE: return DAY;
      case WEEK_VALUE: return WEEK;
      case MONTH_VALUE: return MONTH;
      case YEAR_VALUE: return YEAR;
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
  private TimeUnit(int value, String name, String literal)
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
  
} //TimeUnit
