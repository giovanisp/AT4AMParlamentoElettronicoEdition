package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.LinkoptAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.IdreqAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.ValueAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.RefersAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.CoreAttrGroup;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class CountTypeComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public CountTypeComplexType(Element element) {
    super(element);
}

// FIELDS ------------------
private LinkoptAttrGroup linkopt;
private IdreqAttrGroup idreq;
private ValueAttrGroup value;
private RefersAttrGroup refers;
private CoreAttrGroup core;
private java.util.List<AmendableWidgetImpl> wildcardContents = new ArrayList<AmendableWidgetImpl>();

public LinkoptAttrGroup getLinkopt() {
return linkopt;
}

public void setLinkopt(final LinkoptAttrGroup linkopt) {
this.linkopt = linkopt;
}
public IdreqAttrGroup getIdreq() {
return idreq;
}

public void setIdreq(final IdreqAttrGroup idreq) {
this.idreq = idreq;
}
public ValueAttrGroup getValue() {
return value;
}

public void setValue(final ValueAttrGroup value) {
this.value = value;
}
public RefersAttrGroup getRefers() {
return refers;
}

public void setRefers(final RefersAttrGroup refers) {
this.refers = refers;
}
public CoreAttrGroup getCore() {
return core;
}

public void setCore(final CoreAttrGroup core) {
this.core = core;
}
public java.util.List<AmendableWidgetImpl> getWildcardContent() {
return wildcardContents;
}

public void setWildcardContent(final java.util.List<AmendableWidgetImpl> wildcardContents) {
this.wildcardContents = wildcardContents;
}
/**
* Returns possible children as list of String
*/
@Override
public String[] getAllowedChildTypes() {
    String[] subtypes = new String[]{"coreAttrGroup","valueAttrGroup","*","linkoptAttrGroup","idreqAttrGroup","refersAttrGroup"};
    return  subtypes;
}
}

