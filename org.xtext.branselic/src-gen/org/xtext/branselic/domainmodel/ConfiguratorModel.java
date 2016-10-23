/**
 * generated by Xtext 2.10.0
 */
package org.xtext.branselic.domainmodel;

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
 *   <li>{@link org.xtext.branselic.domainmodel.ConfiguratorModel#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.xtext.branselic.domainmodel.ConfiguratorModel#getRuleset <em>Ruleset</em>}</li>
 * </ul>
 *
 * @see org.xtext.branselic.domainmodel.DomainmodelPackage#getConfiguratorModel()
 * @model
 * @generated
 */
public interface ConfiguratorModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Feature</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.branselic.domainmodel.Feature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature</em>' containment reference list.
   * @see org.xtext.branselic.domainmodel.DomainmodelPackage#getConfiguratorModel_Feature()
   * @model containment="true"
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
   * @see org.xtext.branselic.domainmodel.DomainmodelPackage#getConfiguratorModel_Ruleset()
   * @model containment="true"
   * @generated
   */
  RuleSet getRuleset();

  /**
   * Sets the value of the '{@link org.xtext.branselic.domainmodel.ConfiguratorModel#getRuleset <em>Ruleset</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ruleset</em>' containment reference.
   * @see #getRuleset()
   * @generated
   */
  void setRuleset(RuleSet value);

} // ConfiguratorModel
