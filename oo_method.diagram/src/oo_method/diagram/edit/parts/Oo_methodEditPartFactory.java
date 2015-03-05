package oo_method.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class Oo_methodEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (oo_method.diagram.part.Oo_methodVisualIDRegistry
					.getVisualID(view)) {

			case oo_method.diagram.edit.parts.StructuralModelEditPart.VISUAL_ID:
				return new oo_method.diagram.edit.parts.StructuralModelEditPart(
						view);

			case oo_method.diagram.edit.parts.ClassEditPart.VISUAL_ID:
				return new oo_method.diagram.edit.parts.ClassEditPart(view);

			case oo_method.diagram.edit.parts.ClassNameEditPart.VISUAL_ID:
				return new oo_method.diagram.edit.parts.ClassNameEditPart(view);
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
