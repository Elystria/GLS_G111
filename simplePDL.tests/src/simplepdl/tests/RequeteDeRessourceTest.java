/**
 */
package simplepdl.tests;

import junit.textui.TestRunner;

import simplepdl.RequeteDeRessource;
import simplepdl.SimplepdlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Requete De Ressource</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RequeteDeRessourceTest extends ProcessElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RequeteDeRessourceTest.class);
	}

	/**
	 * Constructs a new Requete De Ressource test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequeteDeRessourceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Requete De Ressource test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RequeteDeRessource getFixture() {
		return (RequeteDeRessource)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SimplepdlFactory.eINSTANCE.createRequeteDeRessource());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //RequeteDeRessourceTest
