package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.HierarchyComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.NameAttrGroup;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class Hcontainer extends HierarchyComplexType  {

// CONSTRUCTORS ------------------
public Hcontainer(Element element) {
    super(element);
}

// FIELDS ------------------
private NameAttrGroup name;

public NameAttrGroup getName() {
return name;
}

public void setName(final NameAttrGroup name) {
this.name = name;
}
/**
* Returns possible children as list of String
*/
@Override
public String[] getAllowedChildTypes() {
    String[] subtypes = new String[]{"content","componentRef","wrap","num","subheading","nameAttrGroup","hierElementsGroup","corereqAttrGroup","heading","intro"};
    return  subtypes;
}
}

