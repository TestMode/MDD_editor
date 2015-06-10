/**
 *
 * $Id$
 */
package Modeldos.modeldos.validation;

import Modeldos.modeldos.Attributes;
import Modeldos.modeldos.typeHorizontalPosition;
import Modeldos.modeldos.typePresentation;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link Modeldos.modeldos.RelationClass}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface RelationClassValidator {
	boolean validate();

	boolean validateName(String value);
	boolean validateTypePresentation(typePresentation value);
	boolean validatePositionHorizotal(typeHorizontalPosition value);
	boolean validatePositionVertical(int value);
	boolean validateFromClass(EList<Modeldos.modeldos.Class> value);
	boolean validateAttributeGet(Attributes value);
	boolean validateAttributeReplace(Attributes value);
	boolean validateAttributeSave(Attributes value);
}