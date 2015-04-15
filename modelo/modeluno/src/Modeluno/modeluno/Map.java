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
 *   <li>{@link Modeluno.modeluno.Map#getHasClass <em>Has Class</em>}</li>
 *   <li>{@link Modeluno.modeluno.Map#getHasAtributte <em>Has Atributte</em>}</li>
 * </ul>
 * </p>
 *
 * @see Modeluno.modeluno.ModelunoPackage#getMap()
 * @model
 * @generated
 */
public interface Map extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Class</b></em>' containment reference list.
	 * The list contents are of type {@link Modeluno.modeluno.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Class</em>' containment reference list.
	 * @see Modeluno.modeluno.ModelunoPackage#getMap_HasClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<Modeluno.modeluno.Class> getHasClass();

	/**
	 * Returns the value of the '<em><b>Has Atributte</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Atributte</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Atributte</em>' containment reference.
	 * @see #setHasAtributte(Atributte)
	 * @see Modeluno.modeluno.ModelunoPackage#getMap_HasAtributte()
	 * @model containment="true"
	 * @generated
	 */
	Atributte getHasAtributte();

	/**
	 * Sets the value of the '{@link Modeluno.modeluno.Map#getHasAtributte <em>Has Atributte</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Atributte</em>' containment reference.
	 * @see #getHasAtributte()
	 * @generated
	 */
	void setHasAtributte(Atributte value);

} // Map
