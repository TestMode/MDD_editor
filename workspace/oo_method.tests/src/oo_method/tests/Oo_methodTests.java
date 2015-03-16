/**
 */
package oo_method.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>oo_method</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class Oo_methodTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new Oo_methodTests("oo_method Tests");
		suite.addTestSuite(ClassTest.class);
		suite.addTestSuite(NotDerivedTest.class);
		suite.addTestSuite(DerivationFormulaTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oo_methodTests(String name) {
		super(name);
	}

} //Oo_methodTests