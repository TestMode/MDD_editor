package Modeluno.modeluno.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class Attribute_RelationReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public Attribute_RelationReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Modeluno.modeluno.Attribute_Relation) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof Modeluno.modeluno.Class && newEnd instanceof Modeluno.modeluno.Class)) {
			return false;
		}
		Modeluno.modeluno.Attribute target = getLink().getGoAttribute();
		return Modeluno.modeluno.diagram.edit.policies.ModelunoBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistAttribute_Relation_4009(
						getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Modeluno.modeluno.Attribute && newEnd instanceof Modeluno.modeluno.Attribute)) {
			return false;
		}
		if (!(getLink().eContainer() instanceof Modeluno.modeluno.Class)) {
			return false;
		}
		Modeluno.modeluno.Class source = (Modeluno.modeluno.Class) getLink()
				.eContainer();
		return Modeluno.modeluno.diagram.edit.policies.ModelunoBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistAttribute_Relation_4009(
						getLink(), source, getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getOldSource().getHasAtributeRelation().remove(getLink());
		getNewSource().getHasAtributeRelation().add(getLink());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setGoAttribute(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected Modeluno.modeluno.Attribute_Relation getLink() {
		return (Modeluno.modeluno.Attribute_Relation) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Modeluno.modeluno.Class getOldSource() {
		return (Modeluno.modeluno.Class) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Modeluno.modeluno.Class getNewSource() {
		return (Modeluno.modeluno.Class) newEnd;
	}

	/**
	 * @generated
	 */
	protected Modeluno.modeluno.Attribute getOldTarget() {
		return (Modeluno.modeluno.Attribute) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Modeluno.modeluno.Attribute getNewTarget() {
		return (Modeluno.modeluno.Attribute) newEnd;
	}
}
