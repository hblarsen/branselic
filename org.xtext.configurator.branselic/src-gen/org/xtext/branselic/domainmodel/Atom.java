/**
 * generated by Xtext 2.10.0
 */
package org.xtext.branselic.domainmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.branselic.domainmodel.Atom#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see org.xtext.branselic.domainmodel.DomainmodelPackage#getAtom()
 * @model
 * @generated
 */
public interface Atom extends BooleanExpression
{
  /**
   * Returns the value of the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' containment reference.
   * @see #setOperator(Operator)
   * @see org.xtext.branselic.domainmodel.DomainmodelPackage#getAtom_Operator()
   * @model containment="true"
   * @generated
   */
  Operator getOperator();

  /**
   * Sets the value of the '{@link org.xtext.branselic.domainmodel.Atom#getOperator <em>Operator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' containment reference.
   * @see #getOperator()
   * @generated
   */
  void setOperator(Operator value);

} // Atom