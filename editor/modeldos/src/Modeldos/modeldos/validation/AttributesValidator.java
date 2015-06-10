/**
 *
 * $Id$
 */
package Modeldos.modeldos.validation;

import Modeldos.modeldos.TypeAttributeForm;
import Modeldos.modeldos.TypeData;
import Modeldos.modeldos.TypeRol;

/**
 * A sample validator interface for {@link Modeldos.modeldos.Attributes}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface AttributesValidator {
	boolean validate();

	boolean validateName(String value);
	boolean validateRol(TypeRol value);
	boolean validateValue(String value);
	boolean validatePrimaryKey(boolean value);
	boolean validateDataType(TypeData value);
	boolean validateInTheForm(TypeAttributeForm value);
}