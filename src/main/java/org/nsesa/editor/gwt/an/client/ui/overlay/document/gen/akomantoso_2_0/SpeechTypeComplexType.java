package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.SpeechAttsAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.CoreoptAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.From;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.BlockElementsGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.BasehierarchyComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.SpeechAttsAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.CoreoptAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.From;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.BlockElementsGroup;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class SpeechTypeComplexType extends BasehierarchyComplexType  {

// CONSTRUCTORS ------------------
public SpeechTypeComplexType(Element element) {
    super(element);
}

// FIELDS ------------------
private SpeechAttsAttrGroup speechAtts;
private CoreoptAttrGroup coreopt;
private From from;
private java.util.List<BlockElementsGroup> blockElementses = new ArrayList<BlockElementsGroup>();

public SpeechAttsAttrGroup getSpeechAtts() {
return speechAtts;
}

public void setSpeechAtts(final SpeechAttsAttrGroup speechAtts) {
this.speechAtts = speechAtts;
}

public CoreoptAttrGroup getCoreopt() {
return coreopt;
}

public void setCoreopt(final CoreoptAttrGroup coreopt) {
this.coreopt = coreopt;
}

public From getFrom() {
return from;
}

public void setFrom(final From from) {
this.from = from;
}

public java.util.List<BlockElementsGroup> getBlockElements() {
return blockElementses;
}

public void setBlockElements(final java.util.List<BlockElementsGroup> blockElementses) {
this.blockElementses = blockElementses;
}

}
