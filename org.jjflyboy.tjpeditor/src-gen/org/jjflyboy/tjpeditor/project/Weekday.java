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
 * A representation of the literals of the enumeration '<em><b>Weekday</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getWeekday()
 * @model
 * @generated
 */
public enum Weekday implements Enumerator
{
  /**
   * The '<em><b>MON</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MON_VALUE
   * @generated
   * @ordered
   */
  MON(0, "MON", "mon"),

  /**
   * The '<em><b>TUE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TUE_VALUE
   * @generated
   * @ordered
   */
  TUE(1, "TUE", "tue"),

  /**
   * The '<em><b>WED</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #WED_VALUE
   * @generated
   * @ordered
   */
  WED(2, "WED", "wed"),

  /**
   * The '<em><b>THR</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #THR_VALUE
   * @generated
   * @ordered
   */
  THR(3, "THR", "thu"),

  /**
   * The '<em><b>FRI</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FRI_VALUE
   * @generated
   * @ordered
   */
  FRI(4, "FRI", "fri"),

  /**
   * The '<em><b>SAT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SAT_VALUE
   * @generated
   * @ordered
   */
  SAT(5, "SAT", "sat"),

  /**
   * The '<em><b>SUN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SUN_VALUE
   * @generated
   * @ordered
   */
  SUN(6, "SUN", "sun");

  /**
   * The '<em><b>MON</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MON</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MON
   * @model literal="mon"
   * @generated
   * @ordered
   */
  public static final int MON_VALUE = 0;

  /**
   * The '<em><b>TUE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TUE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TUE
   * @model literal="tue"
   * @generated
   * @ordered
   */
  public static final int TUE_VALUE = 1;

  /**
   * The '<em><b>WED</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>WED</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #WED
   * @model literal="wed"
   * @generated
   * @ordered
   */
  public static final int WED_VALUE = 2;

  /**
   * The '<em><b>THR</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>THR</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #THR
   * @model literal="thu"
   * @generated
   * @ordered
   */
  public static final int THR_VALUE = 3;

  /**
   * The '<em><b>FRI</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>FRI</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FRI
   * @model literal="fri"
   * @generated
   * @ordered
   */
  public static final int FRI_VALUE = 4;

  /**
   * The '<em><b>SAT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SAT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SAT
   * @model literal="sat"
   * @generated
   * @ordered
   */
  public static final int SAT_VALUE = 5;

  /**
   * The '<em><b>SUN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SUN</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SUN
   * @model literal="sun"
   * @generated
   * @ordered
   */
  public static final int SUN_VALUE = 6;

  /**
   * An array of all the '<em><b>Weekday</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Weekday[] VALUES_ARRAY =
    new Weekday[]
    {
      MON,
      TUE,
      WED,
      THR,
      FRI,
      SAT,
      SUN,
    };

  /**
   * A public read-only list of all the '<em><b>Weekday</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Weekday> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Weekday</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Weekday get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Weekday result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Weekday</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Weekday getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Weekday result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Weekday</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Weekday get(int value)
  {
    switch (value)
    {
      case MON_VALUE: return MON;
      case TUE_VALUE: return TUE;
      case WED_VALUE: return WED;
      case THR_VALUE: return THR;
      case FRI_VALUE: return FRI;
      case SAT_VALUE: return SAT;
      case SUN_VALUE: return SUN;
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
  private Weekday(int value, String name, String literal)
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
  
} //Weekday
