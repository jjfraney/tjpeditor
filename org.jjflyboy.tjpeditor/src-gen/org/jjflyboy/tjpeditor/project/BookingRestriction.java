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
 * A representation of the literals of the enumeration '<em><b>Booking Restriction</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getBookingRestriction()
 * @model
 * @generated
 */
public enum BookingRestriction implements Enumerator
{
  /**
   * The '<em><b>WORKING TIME ONLY</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #WORKING_TIME_ONLY_VALUE
   * @generated
   * @ordered
   */
  WORKING_TIME_ONLY(0, "WORKING_TIME_ONLY", "0"),

  /**
   * The '<em><b>PLUS OFF DUTY</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PLUS_OFF_DUTY_VALUE
   * @generated
   * @ordered
   */
  PLUS_OFF_DUTY(1, "PLUS_OFF_DUTY", "1"),

  /**
   * The '<em><b>PLUS VACATION</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PLUS_VACATION_VALUE
   * @generated
   * @ordered
   */
  PLUS_VACATION(2, "PLUS_VACATION", "2");

  /**
   * The '<em><b>WORKING TIME ONLY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>WORKING TIME ONLY</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #WORKING_TIME_ONLY
   * @model literal="0"
   * @generated
   * @ordered
   */
  public static final int WORKING_TIME_ONLY_VALUE = 0;

  /**
   * The '<em><b>PLUS OFF DUTY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PLUS OFF DUTY</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PLUS_OFF_DUTY
   * @model literal="1"
   * @generated
   * @ordered
   */
  public static final int PLUS_OFF_DUTY_VALUE = 1;

  /**
   * The '<em><b>PLUS VACATION</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PLUS VACATION</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PLUS_VACATION
   * @model literal="2"
   * @generated
   * @ordered
   */
  public static final int PLUS_VACATION_VALUE = 2;

  /**
   * An array of all the '<em><b>Booking Restriction</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final BookingRestriction[] VALUES_ARRAY =
    new BookingRestriction[]
    {
      WORKING_TIME_ONLY,
      PLUS_OFF_DUTY,
      PLUS_VACATION,
    };

  /**
   * A public read-only list of all the '<em><b>Booking Restriction</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<BookingRestriction> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Booking Restriction</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BookingRestriction get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      BookingRestriction result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Booking Restriction</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BookingRestriction getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      BookingRestriction result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Booking Restriction</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BookingRestriction get(int value)
  {
    switch (value)
    {
      case WORKING_TIME_ONLY_VALUE: return WORKING_TIME_ONLY;
      case PLUS_OFF_DUTY_VALUE: return PLUS_OFF_DUTY;
      case PLUS_VACATION_VALUE: return PLUS_VACATION;
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
  private BookingRestriction(int value, String name, String literal)
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
  
} //BookingRestriction
