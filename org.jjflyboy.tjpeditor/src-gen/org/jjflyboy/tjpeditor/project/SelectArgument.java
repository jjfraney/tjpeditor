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
 * A representation of the literals of the enumeration '<em><b>Select Argument</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getSelectArgument()
 * @model
 * @generated
 */
public enum SelectArgument implements Enumerator
{
  /**
   * The '<em><b>MAXLOADED</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MAXLOADED_VALUE
   * @generated
   * @ordered
   */
  MAXLOADED(0, "MAXLOADED", "maxloaded"),

  /**
   * The '<em><b>MINLOADED</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MINLOADED_VALUE
   * @generated
   * @ordered
   */
  MINLOADED(1, "MINLOADED", "minloaded"),

  /**
   * The '<em><b>MINALLOCATED</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MINALLOCATED_VALUE
   * @generated
   * @ordered
   */
  MINALLOCATED(2, "MINALLOCATED", "minallocated"),

  /**
   * The '<em><b>ORDER</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ORDER_VALUE
   * @generated
   * @ordered
   */
  ORDER(3, "ORDER", "order"),

  /**
   * The '<em><b>RANDOM</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RANDOM_VALUE
   * @generated
   * @ordered
   */
  RANDOM(4, "RANDOM", "random");

  /**
   * The '<em><b>MAXLOADED</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MAXLOADED</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MAXLOADED
   * @model literal="maxloaded"
   * @generated
   * @ordered
   */
  public static final int MAXLOADED_VALUE = 0;

  /**
   * The '<em><b>MINLOADED</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MINLOADED</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MINLOADED
   * @model literal="minloaded"
   * @generated
   * @ordered
   */
  public static final int MINLOADED_VALUE = 1;

  /**
   * The '<em><b>MINALLOCATED</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MINALLOCATED</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MINALLOCATED
   * @model literal="minallocated"
   * @generated
   * @ordered
   */
  public static final int MINALLOCATED_VALUE = 2;

  /**
   * The '<em><b>ORDER</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ORDER</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ORDER
   * @model literal="order"
   * @generated
   * @ordered
   */
  public static final int ORDER_VALUE = 3;

  /**
   * The '<em><b>RANDOM</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>RANDOM</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #RANDOM
   * @model literal="random"
   * @generated
   * @ordered
   */
  public static final int RANDOM_VALUE = 4;

  /**
   * An array of all the '<em><b>Select Argument</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final SelectArgument[] VALUES_ARRAY =
    new SelectArgument[]
    {
      MAXLOADED,
      MINLOADED,
      MINALLOCATED,
      ORDER,
      RANDOM,
    };

  /**
   * A public read-only list of all the '<em><b>Select Argument</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<SelectArgument> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Select Argument</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SelectArgument get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      SelectArgument result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Select Argument</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SelectArgument getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      SelectArgument result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Select Argument</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SelectArgument get(int value)
  {
    switch (value)
    {
      case MAXLOADED_VALUE: return MAXLOADED;
      case MINLOADED_VALUE: return MINLOADED;
      case MINALLOCATED_VALUE: return MINALLOCATED;
      case ORDER_VALUE: return ORDER;
      case RANDOM_VALUE: return RANDOM;
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
  private SelectArgument(int value, String name, String literal)
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
  
} //SelectArgument
