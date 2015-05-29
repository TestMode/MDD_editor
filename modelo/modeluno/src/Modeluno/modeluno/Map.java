/**
 */
package Modeluno.modeluno;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Modeluno.modeluno.Map#getRoot_hasClass <em>Root has Class</em>}</li>
 *   <li>{@link Modeluno.modeluno.Map#getRoot_hasAtributte <em>Root has Atributte</em>}</li>
 * </ul>
 * </p>
 *
 * @see Modeluno.modeluno.ModelunoPackage#getMap()
 * @model
 * @generated
 */
public interface Map extends EObject {
	/**
	 * Returns the value of the '<em><b>Root has Class</b></em>' containment reference list.
	 * The list contents are of type {@link Modeluno.modeluno.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root has Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root has Class</em>' containment reference list.
	 * @see Modeluno.modeluno.ModelunoPackage#getMap_Root_hasClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<Modeluno.modeluno.Class> getRoot_hasClass();

	/**
	 * Returns the value of the '<em><b>Root has Atributte</b></em>' containment reference list.
	 * The list contents are of type {@link Modeluno.modeluno.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root has Atributte</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root has Atributte</em>' containment reference list.
	 * @see Modeluno.modeluno.ModelunoPackage#getMap_Root_hasAtributte()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getRoot_hasAtributte();

} // Map