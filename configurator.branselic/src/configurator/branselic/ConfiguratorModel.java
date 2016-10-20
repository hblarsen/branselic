/**
 */
package configurator.branselic;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configurator Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link configurator.branselic.ConfiguratorModel#getFeature <em>Feature</em>}</li>
 *   <li>{@link configurator.branselic.ConfiguratorModel#getRuleset <em>Ruleset</em>}</li>
 * </ul>
 *
 * @see configurator.branselic.BranselicPackage#getConfiguratorModel()
 * @model
 * @generated
 */
public interface ConfiguratorModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' containment reference list.
	 * The list contents are of type {@link configurator.branselic.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' containment reference list.
	 * @see configurator.branselic.BranselicPackage#getConfiguratorModel_Feature()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Feature> getFeature();

	/**
	 * Returns the value of the '<em><b>Ruleset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ruleset</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ruleset</em>' containment reference.
	 * @see #setRuleset(RuleSet)
	 * @see configurator.branselic.BranselicPackage#getConfiguratorModel_Ruleset()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RuleSet getRuleset();

	/**
	 * Sets the value of the '{@link configurator.branselic.ConfiguratorModel#getRuleset <em>Ruleset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ruleset</em>' containment reference.
	 * @see #getRuleset()
	 * @generated
	 */
	void setRuleset(RuleSet value);

} // ConfiguratorModel
