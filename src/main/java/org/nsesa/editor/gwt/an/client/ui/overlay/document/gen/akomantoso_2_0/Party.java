package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.InlinereqreqComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.RoleAttrGroup;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class Party extends InlinereqreqComplexType  {

// CONSTRUCTORS ------------------
public Party(Element element) {
    super(element);
}

// FIELDS ------------------
private RoleAttrGroup role;

public RoleAttrGroup getRole() {
return role;
}

public void setRole(final RoleAttrGroup role) {
this.role = role;
}
/**
* Returns possible children as list of String
*/
@Override
public String[] getAllowedChildTypes() {
    String[] subtypes = new String[]{"inlineCMGroup","roleAttrGroup","corereqreqAttrGroup"};
    return  subtypes;
}
}

