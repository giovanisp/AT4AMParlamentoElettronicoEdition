package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.AnyOtherTypeComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.ResultTypeSimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class Result extends AnyOtherTypeComplexType  {

// CONSTRUCTORS ------------------
public Result(Element element) {
    super(element);
}

// FIELDS ------------------
private ResultTypeSimpleType typez;

public ResultTypeSimpleType getTypez() {
return typez;
}

public void setTypez(final ResultTypeSimpleType typez) {
this.typez = typez;
}
/**
* Returns possible children as list of String
*/
@Override
public String[] getAllowedChildTypes() {
    String[] subtypes = new String[]{"coreAttrGroup","resultTypeSimpleType","*","linkoptAttrGroup","idoptAttrGroup"};
    return  subtypes;
}
}

