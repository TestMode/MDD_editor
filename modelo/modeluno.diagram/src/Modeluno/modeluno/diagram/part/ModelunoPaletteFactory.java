package Modeluno.modeluno.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class ModelunoPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createModeluno1Group());
	}

	/**
	 * Creates "modeluno" palette tool group
	 * @generated
	 */
	private PaletteContainer createModeluno1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Modeluno.modeluno.diagram.part.Messages.Modeluno1Group_title);
		paletteContainer.setId("createModeluno1Group"); //$NON-NLS-1$
		paletteContainer.add(createClass1CreationTool());
		paletteContainer.add(createClass_Relation2CreationTool());
		paletteContainer.add(createAttribute3CreationTool());
		paletteContainer.add(createAttribute_Relation4CreationTool());
		paletteContainer.add(createAttribute_Not_Derived5CreationTool());
		paletteContainer.add(createAttribute_Derived6CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createClass1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Modeluno.modeluno.diagram.part.Messages.Class1CreationTool_title,
				Modeluno.modeluno.diagram.part.Messages.Class1CreationTool_desc,
				Collections
						.singletonList(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Class_2002));
		entry.setId("createClass1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Modeluno.modeluno.diagram.providers.ModelunoElementTypes
				.getImageDescriptor(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Class_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createClass_Relation2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Modeluno.modeluno.diagram.part.Messages.Class_Relation2CreationTool_title,
				Modeluno.modeluno.diagram.part.Messages.Class_Relation2CreationTool_desc,
				Collections
						.singletonList(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Class_Relation_4002));
		entry.setId("createClass_Relation2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Modeluno.modeluno.diagram.providers.ModelunoElementTypes
				.getImageDescriptor(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Class_Relation_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttribute3CreationTool() {
		ToolEntry entry = new ToolEntry(
				Modeluno.modeluno.diagram.part.Messages.Attribute3CreationTool_title,
				Modeluno.modeluno.diagram.part.Messages.Attribute3CreationTool_desc,
				null, null) {
		};
		entry.setId("createAttribute3CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttribute_Relation4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Modeluno.modeluno.diagram.part.Messages.Attribute_Relation4CreationTool_title,
				Modeluno.modeluno.diagram.part.Messages.Attribute_Relation4CreationTool_desc,
				Collections
						.singletonList(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Attribute_Relation_4001));
		entry.setId("createAttribute_Relation4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Modeluno.modeluno.diagram.providers.ModelunoElementTypes
				.getImageDescriptor(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Attribute_Relation_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttribute_Not_Derived5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Modeluno.modeluno.diagram.part.Messages.Attribute_Not_Derived5CreationTool_title,
				Modeluno.modeluno.diagram.part.Messages.Attribute_Not_Derived5CreationTool_desc,
				Collections
						.singletonList(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Attribute_Not_Derived_2003));
		entry.setId("createAttribute_Not_Derived5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Modeluno.modeluno.diagram.providers.ModelunoElementTypes
				.getImageDescriptor(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Attribute_Not_Derived_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttribute_Derived6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Modeluno.modeluno.diagram.part.Messages.Attribute_Derived6CreationTool_title,
				Modeluno.modeluno.diagram.part.Messages.Attribute_Derived6CreationTool_desc,
				Collections
						.singletonList(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Attribute_Derived_2001));
		entry.setId("createAttribute_Derived6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Modeluno.modeluno.diagram.providers.ModelunoElementTypes
				.getImageDescriptor(Modeluno.modeluno.diagram.providers.ModelunoElementTypes.Attribute_Derived_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}