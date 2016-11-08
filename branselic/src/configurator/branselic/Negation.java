/**
 */
package configurator.branselic;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Negation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link configurator.branselic.Negation#getBooleanexpression <em>Booleanexpression</em>}</li>
 * </ul>
 *
 * @see configurator.branselic.BranselicPackage#getNegation()
 * @model
 * @generated
 */
public interface Negation extends BooleanExpression {
	/**
	 * Returns the value of the '<em><b>Booleanexpression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Booleanexpression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booleanexpression</em>' containment reference.
	 * @see #setBooleanexpression(BooleanExpression)
	 * @see configurator.branselic.BranselicPackage#getNegation_Booleanexpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BooleanExpression getBooleanexpression();

	/**
	 * Sets the value of the '{@link configurator.branselic.Negation#getBooleanexpression <em>Booleanexpression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booleanexpression</em>' containment reference.
	 * @see #getBooleanexpression()
	 * @generated
	 */
	void setBooleanexpression(BooleanExpression value);

} // Negation
