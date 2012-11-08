package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.CoreoptAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.BlockElementsGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.PrefaceContainersGroup;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class PrefaceoptComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public PrefaceoptComplexType(Element element) {
    super(element);
}

// FIELDS ------------------
private CoreoptAttrGroup coreopt;
private java.util.List<BlockElementsGroup> blockElementses = new ArrayList<BlockElementsGroup>();
private java.util.List<PrefaceContainersGroup> prefaceContainerses = new ArrayList<PrefaceContainersGroup>();

public CoreoptAttrGroup getCoreopt() {
return coreopt;
}

public void setCoreopt(final CoreoptAttrGroup coreopt) {
this.coreopt = coreopt;
}
public java.util.List<BlockElementsGroup> getBlockElements() {
return blockElementses;
}

public void setBlockElements(final java.util.List<BlockElementsGroup> blockElementses) {
this.blockElementses = blockElementses;
}
public java.util.List<PrefaceContainersGroup> getPrefaceContainers() {
return prefaceContainerses;
}

public void setPrefaceContainers(final java.util.List<PrefaceContainersGroup> prefaceContainerses) {
this.prefaceContainerses = prefaceContainerses;
}
/**
* Returns possible children as list of String
*/
@Override
public String[] getAllowedChildTypes() {
    String[] subtypes = new String[]{"blockElementsGroup","prefaceContainersGroup","coreoptAttrGroup"};
    return  subtypes;
}
}

