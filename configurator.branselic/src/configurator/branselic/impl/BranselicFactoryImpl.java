/**
 */
package configurator.branselic.impl;

import configurator.branselic.And;
import configurator.branselic.Atom;
import configurator.branselic.Bool;
import configurator.branselic.BooleanExpression;
import configurator.branselic.BranselicFactory;
import configurator.branselic.BranselicPackage;
import configurator.branselic.ConfiguratorModel;
import configurator.branselic.Const;
import configurator.branselic.Feature;
import configurator.branselic.Int;
import configurator.branselic.Negation;
import configurator.branselic.Operator;
import configurator.branselic.Or;
import configurator.branselic.Rule;
import configurator.branselic.RuleSet;
import configurator.branselic.Type;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BranselicFactoryImpl extends EFactoryImpl implements BranselicFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BranselicFactory init() {
		try {
			BranselicFactory theBranselicFactory = (BranselicFactory)EPackage.Registry.INSTANCE.getEFactory(BranselicPackage.eNS_URI);
			if (theBranselicFactory != null) {
				return theBranselicFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BranselicFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BranselicFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BranselicPackage.FEATURE: return createFeature();
			case BranselicPackage.CONFIGURATOR_MODEL: return createConfiguratorModel();
			case BranselicPackage.RULE_SET: return createRuleSet();
			case BranselicPackage.RULE: return createRule();
			case BranselicPackage.OPERATOR: return createOperator();
			case BranselicPackage.TYPE: return createType();
			case BranselicPackage.BOOL: return createBool();
			case BranselicPackage.INT: return createInt();
			case BranselicPackage.ENUM: return createEnum();
			case BranselicPackage.BOOLEAN_EXPRESSION: return createBooleanExpression();
			case BranselicPackage.ATOM: return createAtom();
			case BranselicPackage.OR: return createOr();
			case BranselicPackage.NEGATION: return createNegation();
			case BranselicPackage.AND: return createAnd();
			case BranselicPackage.CONST: return createConst();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature createFeature() {
		FeatureImpl feature = new FeatureImpl();
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfiguratorModel createConfiguratorModel() {
		ConfiguratorModelImpl configuratorModel = new ConfiguratorModelImpl();
		return configuratorModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleSet createRuleSet() {
		RuleSetImpl ruleSet = new RuleSetImpl();
		return ruleSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule createRule() {
		RuleImpl rule = new RuleImpl();
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operator createOperator() {
		OperatorImpl operator = new OperatorImpl();
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createType() {
		TypeImpl type = new TypeImpl();
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bool createBool() {
		BoolImpl bool = new BoolImpl();
		return bool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Int createInt() {
		IntImpl int_ = new IntImpl();
		return int_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public configurator.branselic.Enum createEnum() {
		EnumImpl enum_ = new EnumImpl();
		return enum_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanExpression createBooleanExpression() {
		BooleanExpressionImpl booleanExpression = new BooleanExpressionImpl();
		return booleanExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Atom createAtom() {
		AtomImpl atom = new AtomImpl();
		return atom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Or createOr() {
		OrImpl or = new OrImpl();
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Negation createNegation() {
		NegationImpl negation = new NegationImpl();
		return negation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public And createAnd() {
		AndImpl and = new AndImpl();
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Const createConst() {
		ConstImpl const_ = new ConstImpl();
		return const_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BranselicPackage getBranselicPackage() {
		return (BranselicPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BranselicPackage getPackage() {
		return BranselicPackage.eINSTANCE;
	}

} //BranselicFactoryImpl
