/**
 */
package Modelouno.modeluno;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Modelouno.modeluno.Service#getRol <em>Rol</em>}</li>
 *   <li>{@link Modelouno.modeluno.Service#getHasRelationView <em>Has Relation View</em>}</li>
 *   <li>{@link Modelouno.modeluno.Service#getGoToRelationView <em>Go To Relation View</em>}</li>
 * </ul>
 * </p>
 *
 * @see Modelouno.modeluno.ModelunoPackage#getService()
 * @model
 * @generated
 */
public interface Service extends EObject {
	/**
	 * Returns the value of the '<em><b>Rol</b></em>' attribute.
	 * The literals are from the enumeration {@link Modelouno.modeluno.Rol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rol</em>' attribute.
	 * @see Modelouno.modeluno.Rol
	 * @see #setRol(Rol)
	 * @see Modelouno.modeluno.ModelunoPackage#getService_Rol()
	 * @model
	 * @generated
	 */
	Rol getRol();

	/**
	 * Sets the value of the '{@link Modelouno.modeluno.Service#getRol <em>Rol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rol</em>' attribute.
	 * @see Modelouno.modeluno.Rol
	 * @see #getRol()
	 * @generated
	 */
	void setRol(Rol value);

	/**
	 * Returns the value of the '<em><b>Has Relation View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Relation View</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Relation View</em>' containment reference.
	 * @see #setHasRelationView(Relation_View)
	 * @see Modelouno.modeluno.ModelunoPackage#getService_HasRelationView()
	 * @model containment="true"
	 * @generated
	 */
	Relation_View getHasRelationView();

	/**
	 * Sets the value of the '{@link Modelouno.modeluno.Service#getHasRelationView <em>Has Relation View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Relation View</em>' containment reference.
	 * @see #getHasRelationView()
	 * @generated
	 */
	void setHasRelationView(Relation_View value);

	/**
	 * Returns the value of the '<em><b>Go To Relation View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Go To Relation View</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Go To Relation View</em>' reference.
	 * @see #setGoToRelationView(Relation_View)
	 * @see Modelouno.modeluno.ModelunoPackage#getService_GoToRelationView()
	 * @model
	 * @generated
	 */
	Relation_View getGoToRelationView();

	/**
	 * Sets the value of the '{@link Modelouno.modeluno.Service#getGoToRelationView <em>Go To Relation View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Go To Relation View</em>' reference.
	 * @see #getGoToRelationView()
	 * @generated
	 */
	void setGoToRelationView(Relation_View value);

} // Service