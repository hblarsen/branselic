/**
 */
package configurator.branselic;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link configurator.branselic.Rule#getIf <em>If</em>}</li>
 *   <li>{@link configurator.branselic.Rule#getThen <em>Then</em>}</li>
 * </ul>
 *
 * @see configurator.branselic.BranselicPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject {
	/**
	 * Returns the value of the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If</em>' containment reference.
	 * @see #setIf(BooleanExpression)
	 * @see configurator.branselic.BranselicPackage#getRule_If()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BooleanExpression getIf();

	/**
	 * Sets the value of the '{@link configurator.branselic.Rule#getIf <em>If</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If</em>' containment reference.
	 * @see #getIf()
	 * @generated
	 */
	void setIf(BooleanExpression value);

	/**
	 * Returns the value of the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Then</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then</em>' containment reference.
	 * @see #setThen(BooleanExpression)
	 * @see configurator.branselic.BranselicPackage#getRule_Then()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BooleanExpression getThen();

	/**
	 * Sets the value of the '{@link configurator.branselic.Rule#getThen <em>Then</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then</em>' containment reference.
	 * @see #getThen()
	 * @generated
	 */
	void setThen(BooleanExpression value);

} // Rule
