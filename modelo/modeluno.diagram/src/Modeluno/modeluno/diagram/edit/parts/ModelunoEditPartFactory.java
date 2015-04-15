package Modeluno.modeluno.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class ModelunoEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (Modeluno.modeluno.diagram.part.ModelunoVisualIDRegistry
					.getVisualID(view)) {

			case Modeluno.modeluno.diagram.edit.parts.MapEditPart.VISUAL_ID:
				return new Modeluno.modeluno.diagram.edit.parts.MapEditPart(
						view);

			case Modeluno.modeluno.diagram.edit.parts.ClassEditPart.VISUAL_ID:
				return new Modeluno.modeluno.diagram.edit.parts.ClassEditPart(
						view);

			case Modeluno.modeluno.diagram.edit.parts.ClassCnameEditPart.VISUAL_ID:
				return new Modeluno.modeluno.diagram.edit.parts.ClassCnameEditPart(
						view);

			case Modeluno.modeluno.diagram.edit.parts.ADerivedEditPart.VISUAL_ID:
				return new Modeluno.modeluno.diagram.edit.parts.ADerivedEditPart(
						view);

			case Modeluno.modeluno.diagram.edit.parts.ADerivedAnameEditPart.VISUAL_ID:
				return new Modeluno.modeluno.diagram.edit.parts.ADerivedAnameEditPart(
						view);

			case Modeluno.modeluno.diagram.edit.parts.ANotDerivedEditPart.VISUAL_ID:
				return new Modeluno.modeluno.diagram.edit.parts.ANotDerivedEditPart(
						view);

			case Modeluno.modeluno.diagram.edit.parts.ANotDerivedAnameEditPart.VISUAL_ID:
				return new Modeluno.modeluno.diagram.edit.parts.ANotDerivedAnameEditPart(
						view);

			case Modeluno.modeluno.diagram.edit.parts.RAttributeEditPart.VISUAL_ID:
				return new Modeluno.modeluno.diagram.edit.parts.RAttributeEditPart(
						view);

			case Modeluno.modeluno.diagram.edit.parts.RelationEditPart.VISUAL_ID:
				return new Modeluno.modeluno.diagram.edit.parts.RelationEditPart(
						view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
