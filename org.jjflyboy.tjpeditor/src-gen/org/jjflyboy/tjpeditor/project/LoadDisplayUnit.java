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
 * A representation of the literals of the enumeration '<em><b>Load Display Unit</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getLoadDisplayUnit()
 * @model
 * @generated
 */
public enum LoadDisplayUnit implements Enumerator
{
  /**
   * The '<em><b>DAYS</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DAYS_VALUE
   * @generated
   * @ordered
   */
  DAYS(0, "DAYS", "days"),

  /**
   * The '<em><b>HOURS</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #HOURS_VALUE
   * @generated
   * @ordered
   */
  HOURS(1, "HOURS", "hours"),

  /**
   * The '<em><b>LONGAUTO</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LONGAUTO_VALUE
   * @generated
   * @ordered
   */
  LONGAUTO(2, "LONGAUTO", "longauto"),

  /**
   * The '<em><b>MINUTES</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MINUTES_VALUE
   * @generated
   * @ordered
   */
  MINUTES(3, "MINUTES", "minutes"),

  /**
   * The '<em><b>MONTHS</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MONTHS_VALUE
   * @generated
   * @ordered
   */
  MONTHS(4, "MONTHS", "months"),

  /**
   * The '<em><b>SHORTAUTO</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SHORTAUTO_VALUE
   * @generated
   * @ordered
   */
  SHORTAUTO(5, "SHORTAUTO", "shortauto"),

  /**
   * The '<em><b>WEEKS</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #WEEKS_VALUE
   * @generated
   * @ordered
   */
  WEEKS(6, "WEEKS", "weeks"),

  /**
   * The '<em><b>YEARS</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #YEARS_VALUE
   * @generated
   * @ordered
   */
  YEARS(7, "YEARS", "years");

  /**
   * The '<em><b>DAYS</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DAYS</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DAYS
   * @model literal="days"
   * @generated
   * @ordered
   */
  public static final int DAYS_VALUE = 0;

  /**
   * The '<em><b>HOURS</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>HOURS</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #HOURS
   * @model literal="hours"
   * @generated
   * @ordered
   */
  public static final int HOURS_VALUE = 1;

  /**
   * The '<em><b>LONGAUTO</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>LONGAUTO</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LONGAUTO
   * @model literal="longauto"
   * @generated
   * @ordered
   */
  public static final int LONGAUTO_VALUE = 2;

  /**
   * The '<em><b>MINUTES</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MINUTES</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MINUTES
   * @model literal="minutes"
   * @generated
   * @ordered
   */
  public static final int MINUTES_VALUE = 3;

  /**
   * The '<em><b>MONTHS</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MONTHS</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MONTHS
   * @model literal="months"
   * @generated
   * @ordered
   */
  public static final int MONTHS_VALUE = 4;

  /**
   * The '<em><b>SHORTAUTO</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SHORTAUTO</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SHORTAUTO
   * @model literal="shortauto"
   * @generated
   * @ordered
   */
  public static final int SHORTAUTO_VALUE = 5;

  /**
   * The '<em><b>WEEKS</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>WEEKS</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #WEEKS
   * @model literal="weeks"
   * @generated
   * @ordered
   */
  public static final int WEEKS_VALUE = 6;

  /**
   * The '<em><b>YEARS</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>YEARS</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #YEARS
   * @model literal="years"
   * @generated
   * @ordered
   */
  public static final int YEARS_VALUE = 7;

  /**
   * An array of all the '<em><b>Load Display Unit</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final LoadDisplayUnit[] VALUES_ARRAY =
    new LoadDisplayUnit[]
    {
      DAYS,
      HOURS,
      LONGAUTO,
      MINUTES,
      MONTHS,
      SHORTAUTO,
      WEEKS,
      YEARS,
    };

  /**
   * A public read-only list of all the '<em><b>Load Display Unit</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<LoadDisplayUnit> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Load Display Unit</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LoadDisplayUnit get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      LoadDisplayUnit result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Load Display Unit</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LoadDisplayUnit getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      LoadDisplayUnit result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Load Display Unit</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LoadDisplayUnit get(int value)
  {
    switch (value)
    {
      case DAYS_VALUE: return DAYS;
      case HOURS_VALUE: return HOURS;
      case LONGAUTO_VALUE: return LONGAUTO;
      case MINUTES_VALUE: return MINUTES;
      case MONTHS_VALUE: return MONTHS;
      case SHORTAUTO_VALUE: return SHORTAUTO;
      case WEEKS_VALUE: return WEEKS;
      case YEARS_VALUE: return YEARS;
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
  private LoadDisplayUnit(int value, String name, String literal)
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
  
} //LoadDisplayUnit
