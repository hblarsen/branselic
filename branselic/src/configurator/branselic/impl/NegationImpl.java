/**
 */
package configurator.branselic.impl;

import configurator.branselic.BooleanExpression;
import configurator.branselic.BranselicPackage;
import configurator.branselic.Negation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Negation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link configurator.branselic.impl.NegationImpl#getBooleanexpression <em>Booleanexpression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NegationImpl extends BooleanExpressionImpl implements Negation {
	/**
	 * The cached value of the '{@link #getBooleanexpression() <em>Booleanexpression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanexpression()
	 * @generated
	 * @ordered
	 */
	protected BooleanExpression booleanexpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NegationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BranselicPackage.Literals.NEGATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanExpression getBooleanexpression() {
		return booleanexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBooleanexpression(BooleanExpression newBooleanexpression, NotificationChain msgs) {
		BooleanExpression oldBooleanexpression = booleanexpression;
		booleanexpression = newBooleanexpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BranselicPackage.NEGATION__BOOLEANEXPRESSION, oldBooleanexpression, newBooleanexpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooleanexpression(BooleanExpression newBooleanexpression) {
		if (newBooleanexpression != booleanexpression) {
			NotificationChain msgs = null;
			if (booleanexpression != null)
				msgs = ((InternalEObject)booleanexpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BranselicPackage.NEGATION__BOOLEANEXPRESSION, null, msgs);
			if (newBooleanexpression != null)
				msgs = ((InternalEObject)newBooleanexpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BranselicPackage.NEGATION__BOOLEANEXPRESSION, null, msgs);
			msgs = basicSetBooleanexpression(newBooleanexpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BranselicPackage.NEGATION__BOOLEANEXPRESSION, newBooleanexpression, newBooleanexpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BranselicPackage.NEGATION__BOOLEANEXPRESSION:
				return basicSetBooleanexpression(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BranselicPackage.NEGATION__BOOLEANEXPRESSION:
				return getBooleanexpression();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BranselicPackage.NEGATION__BOOLEANEXPRESSION:
				setBooleanexpression((BooleanExpression)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case BranselicPackage.NEGATION__BOOLEANEXPRESSION:
				setBooleanexpression((BooleanExpression)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BranselicPackage.NEGATION__BOOLEANEXPRESSION:
				return booleanexpression != null;
		}
		return super.eIsSet(featureID);
	}

} //NegationImpl
