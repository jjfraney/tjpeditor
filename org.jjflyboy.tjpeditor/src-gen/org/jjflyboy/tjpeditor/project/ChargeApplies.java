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
 * A representation of the literals of the enumeration '<em><b>Charge Applies</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getChargeApplies()
 * @model
 * @generated
 */
public enum ChargeApplies implements Enumerator
{
  /**
   * The '<em><b>ONSTART</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ONSTART_VALUE
   * @generated
   * @ordered
   */
  ONSTART(0, "ONSTART", "onstart"),

  /**
   * The '<em><b>ONEND</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ONEND_VALUE
   * @generated
   * @ordered
   */
  ONEND(1, "ONEND", "onend"),

  /**
   * The '<em><b>PERHOUR</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PERHOUR_VALUE
   * @generated
   * @ordered
   */
  PERHOUR(2, "PERHOUR", "perhour"),

  /**
   * The '<em><b>PERDAY</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PERDAY_VALUE
   * @generated
   * @ordered
   */
  PERDAY(3, "PERDAY", "perday"),

  /**
   * The '<em><b>PERWEEK</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PERWEEK_VALUE
   * @generated
   * @ordered
   */
  PERWEEK(4, "PERWEEK", "perweek");

  /**
   * The '<em><b>ONSTART</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ONSTART</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ONSTART
   * @model literal="onstart"
   * @generated
   * @ordered
   */
  public static final int ONSTART_VALUE = 0;

  /**
   * The '<em><b>ONEND</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ONEND</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ONEND
   * @model literal="onend"
   * @generated
   * @ordered
   */
  public static final int ONEND_VALUE = 1;

  /**
   * The '<em><b>PERHOUR</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PERHOUR</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PERHOUR
   * @model literal="perhour"
   * @generated
   * @ordered
   */
  public static final int PERHOUR_VALUE = 2;

  /**
   * The '<em><b>PERDAY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PERDAY</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PERDAY
   * @model literal="perday"
   * @generated
   * @ordered
   */
  public static final int PERDAY_VALUE = 3;

  /**
   * The '<em><b>PERWEEK</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PERWEEK</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PERWEEK
   * @model literal="perweek"
   * @generated
   * @ordered
   */
  public static final int PERWEEK_VALUE = 4;

  /**
   * An array of all the '<em><b>Charge Applies</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final ChargeApplies[] VALUES_ARRAY =
    new ChargeApplies[]
    {
      ONSTART,
      ONEND,
      PERHOUR,
      PERDAY,
      PERWEEK,
    };

  /**
   * A public read-only list of all the '<em><b>Charge Applies</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<ChargeApplies> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Charge Applies</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ChargeApplies get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ChargeApplies result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Charge Applies</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ChargeApplies getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ChargeApplies result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Charge Applies</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ChargeApplies get(int value)
  {
    switch (value)
    {
      case ONSTART_VALUE: return ONSTART;
      case ONEND_VALUE: return ONEND;
      case PERHOUR_VALUE: return PERHOUR;
      case PERDAY_VALUE: return PERDAY;
      case PERWEEK_VALUE: return PERWEEK;
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
  private ChargeApplies(int value, String name, String literal)
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
  
} //ChargeApplies
