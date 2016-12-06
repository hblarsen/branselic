/**
 * generated by Xtext 2.10.0
 */
package org.xtext.branselic.domainmodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.branselic.domainmodel.ConfiguratorModel;
import org.xtext.branselic.domainmodel.DomainmodelPackage;
import org.xtext.branselic.domainmodel.Feature;
import org.xtext.branselic.domainmodel.RuleSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configurator Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.branselic.domainmodel.impl.ConfiguratorModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.branselic.domainmodel.impl.ConfiguratorModelImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.xtext.branselic.domainmodel.impl.ConfiguratorModelImpl#getRuleset <em>Ruleset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfiguratorModelImpl extends MinimalEObjectImpl.Container implements ConfiguratorModel
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getFeature() <em>Feature</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeature()
   * @generated
   * @ordered
   */
  protected EList<Feature> feature;

  /**
   * The cached value of the '{@link #getRuleset() <em>Ruleset</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRuleset()
   * @generated
   * @ordered
   */
  protected RuleSet ruleset;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConfiguratorModelImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DomainmodelPackage.Literals.CONFIGURATOR_MODEL;
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
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.CONFIGURATOR_MODEL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Feature> getFeature()
  {
    if (feature == null)
    {
      feature = new EObjectContainmentEList<Feature>(Feature.class, this, DomainmodelPackage.CONFIGURATOR_MODEL__FEATURE);
    }
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RuleSet getRuleset()
  {
    return ruleset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRuleset(RuleSet newRuleset, NotificationChain msgs)
  {
    RuleSet oldRuleset = ruleset;
    ruleset = newRuleset;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainmodelPackage.CONFIGURATOR_MODEL__RULESET, oldRuleset, newRuleset);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRuleset(RuleSet newRuleset)
  {
    if (newRuleset != ruleset)
    {
      NotificationChain msgs = null;
      if (ruleset != null)
        msgs = ((InternalEObject)ruleset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.CONFIGURATOR_MODEL__RULESET, null, msgs);
      if (newRuleset != null)
        msgs = ((InternalEObject)newRuleset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.CONFIGURATOR_MODEL__RULESET, null, msgs);
      msgs = basicSetRuleset(newRuleset, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.CONFIGURATOR_MODEL__RULESET, newRuleset, newRuleset));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DomainmodelPackage.CONFIGURATOR_MODEL__FEATURE:
        return ((InternalEList<?>)getFeature()).basicRemove(otherEnd, msgs);
      case DomainmodelPackage.CONFIGURATOR_MODEL__RULESET:
        return basicSetRuleset(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DomainmodelPackage.CONFIGURATOR_MODEL__NAME:
        return getName();
      case DomainmodelPackage.CONFIGURATOR_MODEL__FEATURE:
        return getFeature();
      case DomainmodelPackage.CONFIGURATOR_MODEL__RULESET:
        return getRuleset();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DomainmodelPackage.CONFIGURATOR_MODEL__NAME:
        setName((String)newValue);
        return;
      case DomainmodelPackage.CONFIGURATOR_MODEL__FEATURE:
        getFeature().clear();
        getFeature().addAll((Collection<? extends Feature>)newValue);
        return;
      case DomainmodelPackage.CONFIGURATOR_MODEL__RULESET:
        setRuleset((RuleSet)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DomainmodelPackage.CONFIGURATOR_MODEL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DomainmodelPackage.CONFIGURATOR_MODEL__FEATURE:
        getFeature().clear();
        return;
      case DomainmodelPackage.CONFIGURATOR_MODEL__RULESET:
        setRuleset((RuleSet)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DomainmodelPackage.CONFIGURATOR_MODEL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DomainmodelPackage.CONFIGURATOR_MODEL__FEATURE:
        return feature != null && !feature.isEmpty();
      case DomainmodelPackage.CONFIGURATOR_MODEL__RULESET:
        return ruleset != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ConfiguratorModelImpl