package Metawebdesign.metawebdesign.diagram.edit.parts;

/**
 * @generated
 */
public class NotDerived2EditPart extends org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart  {

			/**
 * @generated
 */
	public static final int VISUAL_ID = 3002;

	/**
 * @generated
 */
	protected org.eclipse.draw2d.IFigure contentPane;

	/**
 * @generated
 */
	protected org.eclipse.draw2d.IFigure primaryShape;
	
		/**
 * @generated
 */
	public NotDerived2EditPart(org.eclipse.gmf.runtime.notation.View view) {
		super(view);
	}
	
		/**
 * @generated
 */
	protected void createDefaultEditPolicies() {
			super.createDefaultEditPolicies();
			installEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.SEMANTIC_ROLE, new Metawebdesign.metawebdesign.diagram.edit.policies.NotDerived2ItemSemanticEditPolicy());
							installEditPolicy(org.eclipse.gef.EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
			// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
	// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
		}
	
		/**
 * @generated
 */
	protected org.eclipse.gef.editpolicies.LayoutEditPolicy createLayoutEditPolicy() {
			
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.FlowLayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.FlowLayoutEditPolicy() {
			
			protected org.eclipse.gef.commands.Command createAddCommand(org.eclipse.gef.EditPart child, org.eclipse.gef.EditPart after) {
				return null;
			}

			protected org.eclipse.gef.commands.Command createMoveChildCommand(org.eclipse.gef.EditPart child, org.eclipse.gef.EditPart after) {
				return null;
			}

			protected org.eclipse.gef.commands.Command getCreateCommand(org.eclipse.gef.requests.CreateRequest request) {
				return null;
			}
		};
		return lep;
		}
	
		/**
 * @generated
 */
	protected org.eclipse.draw2d.IFigure createNodeShape() {
		return primaryShape = new NotDerivedFigure();
	}

		/**
 * @generated
 */
	public NotDerivedFigure getPrimaryShape() {
		return (NotDerivedFigure) primaryShape;
	}
	
		/**
 * @generated
 */
	protected boolean addFixedChild(org.eclipse.gef.EditPart childEditPart) {
		if (childEditPart instanceof Metawebdesign.metawebdesign.diagram.edit.parts.NotDerivedName2EditPart) {
			((Metawebdesign.metawebdesign.diagram.edit.parts.NotDerivedName2EditPart) childEditPart).setLabel(getPrimaryShape().getFigureNotDerivedNameFigure());
			return true;
		}
		return false;
	}

		/**
 * @generated
 */
	protected boolean removeFixedChild(org.eclipse.gef.EditPart childEditPart) {
		if (childEditPart instanceof Metawebdesign.metawebdesign.diagram.edit.parts.NotDerivedName2EditPart) {
			return true;
		}
		return false;
	}

		/**
 * @generated
 */
	protected void addChildVisual(org.eclipse.gef.EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

		/**
 * @generated
 */
	protected void removeChildVisual(org.eclipse.gef.EditPart childEditPart) {
		if (removeFixedChild(childEditPart)){
			return;
		}
		super.removeChildVisual(childEditPart);
	}

		/**
 * @generated
 */
	protected org.eclipse.draw2d.IFigure getContentPaneFor(org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart editPart) {
				return getContentPane();
	}

			
		/**
 * @generated
 */
	protected org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure createNodePlate() {
		org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure result = new org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure(40, 40);
				return result;
	}
	
						
		/**
 * Creates figure for this edit part.
 * 
 * Body of this method does not depend on settings in generation model
 * so you may safely remove <i>generated</i> tag and modify it.
 * 
 * @generated
 */
	protected org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure createNodeFigure() {
		org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new org.eclipse.draw2d.StackLayout());
		org.eclipse.draw2d.IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}
	
		/**
 * Default implementation treats passed figure as content pane.
 * Respects layout one may have set for generated figure.
 * @param nodeShape instance of generated figure class
 * @generated
 */
	protected org.eclipse.draw2d.IFigure setupContentPane(org.eclipse.draw2d.IFigure nodeShape) {
					if (nodeShape.getLayoutManager() == null) {
									org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout layout =new org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout();
					layout.setSpacing(5);
					nodeShape.setLayoutManager(layout);
							}
				return nodeShape; // use nodeShape itself as contentPane
	}
	
		/**
 * @generated
 */
	public org.eclipse.draw2d.IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

		/**
 * @generated
 */
	protected void setForegroundColor(org.eclipse.swt.graphics.Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

		/**
 * @generated
 */
	protected void setBackgroundColor(org.eclipse.swt.graphics.Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

		/**
 * @generated
 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof org.eclipse.draw2d.Shape) {
			((org.eclipse.draw2d.Shape) primaryShape).setLineWidth(width);
		}
	}

		/**
 * @generated
 */
	protected void setLineType(int style) {
		if (primaryShape instanceof org.eclipse.draw2d.Shape) {
			((org.eclipse.draw2d.Shape) primaryShape).setLineStyle(style);
		}
	}

				/**
 * @generated
 */
		public org.eclipse.gef.EditPart getPrimaryChildEditPart() {
			return getChildBySemanticHint(Metawebdesign.metawebdesign.diagram.part.MetaWebDesignVisualIDRegistry.getType(Metawebdesign.metawebdesign.diagram.edit.parts.NotDerivedName2EditPart.VISUAL_ID));
		}
	

	
	
	
/**
 * @generated
 */
public class NotDerivedFigure extends org.eclipse.draw2d.RectangleFigure {


	/**
	 * @generated
	 */
	private org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel fFigureNotDerivedNameFigure; 


	/**
	 * @generated
	 */
	public NotDerivedFigure() {
		
	org.eclipse.draw2d.FlowLayout layoutThis = new org.eclipse.draw2d.FlowLayout();
	layoutThis.setStretchMinorAxis(false);
	layoutThis.setMinorAlignment(org.eclipse.draw2d.FlowLayout.ALIGN_LEFTTOP
);

	layoutThis.setMajorAlignment(org.eclipse.draw2d.FlowLayout.ALIGN_LEFTTOP
);
	layoutThis.setMajorSpacing(5);
	layoutThis.setMinorSpacing(5);
	layoutThis.setHorizontal(true);

	this.setLayoutManager(layoutThis);

				createContents();
	}
	/**
	 * @generated
	 */
	private void createContents(){


fFigureNotDerivedNameFigure = new org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel();

fFigureNotDerivedNameFigure.setText("<...>");

this.add(fFigureNotDerivedNameFigure);


	}





	/**
	 * @generated
	 */
	public org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel getFigureNotDerivedNameFigure() {
		return fFigureNotDerivedNameFigure;
	}
	

}


	
	}
