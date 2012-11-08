package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.LinkoptAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.CoreAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.IdreqAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.OutcomeAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.RefersAttrGroup;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Quorum;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Count;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class ParliamentaryAnalysisTypeComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public ParliamentaryAnalysisTypeComplexType(Element element) {
    super(element);
}

// FIELDS ------------------
private LinkoptAttrGroup linkopt;
private CoreAttrGroup core;
private IdreqAttrGroup idreq;
private OutcomeAttrGroup outcome;
private RefersAttrGroup refers;
private java.util.List<Quorum> quorums = new ArrayList<Quorum>();
private java.util.List<Count> counts = new ArrayList<Count>();

public LinkoptAttrGroup getLinkopt() {
return linkopt;
}

public void setLinkopt(final LinkoptAttrGroup linkopt) {
this.linkopt = linkopt;
}
public CoreAttrGroup getCore() {
return core;
}

public void setCore(final CoreAttrGroup core) {
this.core = core;
}
public IdreqAttrGroup getIdreq() {
return idreq;
}

public void setIdreq(final IdreqAttrGroup idreq) {
this.idreq = idreq;
}
public OutcomeAttrGroup getOutcome() {
return outcome;
}

public void setOutcome(final OutcomeAttrGroup outcome) {
this.outcome = outcome;
}
public RefersAttrGroup getRefers() {
return refers;
}

public void setRefers(final RefersAttrGroup refers) {
this.refers = refers;
}
public java.util.List<Quorum> getQuorum() {
return quorums;
}

public void setQuorum(final java.util.List<Quorum> quorums) {
this.quorums = quorums;
}
public java.util.List<Count> getCount() {
return counts;
}

public void setCount(final java.util.List<Count> counts) {
this.counts = counts;
}
/**
* Returns possible children as list of String
*/
@Override
public String[] getAllowedChildTypes() {
    String[] subtypes = new String[]{"quorum","coreAttrGroup","count","linkoptAttrGroup","idreqAttrGroup","outcomeAttrGroup","refersAttrGroup"};
    return  subtypes;
}
}

