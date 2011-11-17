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
 * A representation of the literals of the enumeration '<em><b>Purge Task Attribute</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getPurgeTaskAttribute()
 * @model
 * @generated
 */
public enum PurgeTaskAttribute implements Enumerator
{
  /**
   * The '<em><b>BOOKING</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BOOKING_VALUE
   * @generated
   * @ordered
   */
  BOOKING(0, "BOOKING", "booking"),

  /**
   * The '<em><b>CHARGE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CHARGE_VALUE
   * @generated
   * @ordered
   */
  CHARGE(1, "CHARGE", "charge"),

  /**
   * The '<em><b>CHARGESET</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CHARGESET_VALUE
   * @generated
   * @ordered
   */
  CHARGESET(2, "CHARGESET", "chargeset"),

  /**
   * The '<em><b>DEPENDS</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DEPENDS_VALUE
   * @generated
   * @ordered
   */
  DEPENDS(3, "DEPENDS", "depends"),

  /**
   * The '<em><b>FAIL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FAIL_VALUE
   * @generated
   * @ordered
   */
  FAIL(4, "FAIL", "fail"),

  /**
   * The '<em><b>FLAGS</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FLAGS_VALUE
   * @generated
   * @ordered
   */
  FLAGS(5, "FLAGS", "flags"),

  /**
   * The '<em><b>PRECEDES</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PRECEDES_VALUE
   * @generated
   * @ordered
   */
  PRECEDES(6, "PRECEDES", "precedes"),

  /**
   * The '<em><b>WARN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #WARN_VALUE
   * @generated
   * @ordered
   */
  WARN(7, "WARN", "warn");

  /**
   * The '<em><b>BOOKING</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>BOOKING</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BOOKING
   * @model literal="booking"
   * @generated
   * @ordered
   */
  public static final int BOOKING_VALUE = 0;

  /**
   * The '<em><b>CHARGE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>CHARGE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CHARGE
   * @model literal="charge"
   * @generated
   * @ordered
   */
  public static final int CHARGE_VALUE = 1;

  /**
   * The '<em><b>CHARGESET</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>CHARGESET</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CHARGESET
   * @model literal="chargeset"
   * @generated
   * @ordered
   */
  public static final int CHARGESET_VALUE = 2;

  /**
   * The '<em><b>DEPENDS</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DEPENDS</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DEPENDS
   * @model literal="depends"
   * @generated
   * @ordered
   */
  public static final int DEPENDS_VALUE = 3;

  /**
   * The '<em><b>FAIL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>FAIL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FAIL
   * @model literal="fail"
   * @generated
   * @ordered
   */
  public static final int FAIL_VALUE = 4;

  /**
   * The '<em><b>FLAGS</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>FLAGS</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FLAGS
   * @model literal="flags"
   * @generated
   * @ordered
   */
  public static final int FLAGS_VALUE = 5;

  /**
   * The '<em><b>PRECEDES</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PRECEDES</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PRECEDES
   * @model literal="precedes"
   * @generated
   * @ordered
   */
  public static final int PRECEDES_VALUE = 6;

  /**
   * The '<em><b>WARN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>WARN</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #WARN
   * @model literal="warn"
   * @generated
   * @ordered
   */
  public static final int WARN_VALUE = 7;

  /**
   * An array of all the '<em><b>Purge Task Attribute</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final PurgeTaskAttribute[] VALUES_ARRAY =
    new PurgeTaskAttribute[]
    {
      BOOKING,
      CHARGE,
      CHARGESET,
      DEPENDS,
      FAIL,
      FLAGS,
      PRECEDES,
      WARN,
    };

  /**
   * A public read-only list of all the '<em><b>Purge Task Attribute</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<PurgeTaskAttribute> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Purge Task Attribute</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PurgeTaskAttribute get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      PurgeTaskAttribute result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Purge Task Attribute</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PurgeTaskAttribute getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      PurgeTaskAttribute result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Purge Task Attribute</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PurgeTaskAttribute get(int value)
  {
    switch (value)
    {
      case BOOKING_VALUE: return BOOKING;
      case CHARGE_VALUE: return CHARGE;
      case CHARGESET_VALUE: return CHARGESET;
      case DEPENDS_VALUE: return DEPENDS;
      case FAIL_VALUE: return FAIL;
      case FLAGS_VALUE: return FLAGS;
      case PRECEDES_VALUE: return PRECEDES;
      case WARN_VALUE: return WARN;
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
  private PurgeTaskAttribute(int value, String name, String literal)
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
  
} //PurgeTaskAttribute
