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
 * A representation of the literals of the enumeration '<em><b>Purge Resource Attribute</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getPurgeResourceAttribute()
 * @model
 * @generated
 */
public enum PurgeResourceAttribute implements Enumerator
{
  /**
   * The '<em><b>FAIL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FAIL_VALUE
   * @generated
   * @ordered
   */
  FAIL(0, "FAIL", "fail"),

  /**
   * The '<em><b>FLAGS</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FLAGS_VALUE
   * @generated
   * @ordered
   */
  FLAGS(1, "FLAGS", "flags"),

  /**
   * The '<em><b>MANAGERS</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MANAGERS_VALUE
   * @generated
   * @ordered
   */
  MANAGERS(2, "MANAGERS", "managers"),

  /**
   * The '<em><b>REPORTS</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #REPORTS_VALUE
   * @generated
   * @ordered
   */
  REPORTS(3, "REPORTS", "reports"),

  /**
   * The '<em><b>VACATIONS</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VACATIONS_VALUE
   * @generated
   * @ordered
   */
  VACATIONS(4, "VACATIONS", "vacations"),

  /**
   * The '<em><b>WARN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #WARN_VALUE
   * @generated
   * @ordered
   */
  WARN(5, "WARN", "warn");

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
  public static final int FAIL_VALUE = 0;

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
  public static final int FLAGS_VALUE = 1;

  /**
   * The '<em><b>MANAGERS</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MANAGERS</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MANAGERS
   * @model literal="managers"
   * @generated
   * @ordered
   */
  public static final int MANAGERS_VALUE = 2;

  /**
   * The '<em><b>REPORTS</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>REPORTS</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #REPORTS
   * @model literal="reports"
   * @generated
   * @ordered
   */
  public static final int REPORTS_VALUE = 3;

  /**
   * The '<em><b>VACATIONS</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>VACATIONS</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #VACATIONS
   * @model literal="vacations"
   * @generated
   * @ordered
   */
  public static final int VACATIONS_VALUE = 4;

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
  public static final int WARN_VALUE = 5;

  /**
   * An array of all the '<em><b>Purge Resource Attribute</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final PurgeResourceAttribute[] VALUES_ARRAY =
    new PurgeResourceAttribute[]
    {
      FAIL,
      FLAGS,
      MANAGERS,
      REPORTS,
      VACATIONS,
      WARN,
    };

  /**
   * A public read-only list of all the '<em><b>Purge Resource Attribute</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<PurgeResourceAttribute> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Purge Resource Attribute</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PurgeResourceAttribute get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      PurgeResourceAttribute result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Purge Resource Attribute</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PurgeResourceAttribute getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      PurgeResourceAttribute result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Purge Resource Attribute</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PurgeResourceAttribute get(int value)
  {
    switch (value)
    {
      case FAIL_VALUE: return FAIL;
      case FLAGS_VALUE: return FLAGS;
      case MANAGERS_VALUE: return MANAGERS;
      case REPORTS_VALUE: return REPORTS;
      case VACATIONS_VALUE: return VACATIONS;
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
  private PurgeResourceAttribute(int value, String name, String literal)
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
  
} //PurgeResourceAttribute
