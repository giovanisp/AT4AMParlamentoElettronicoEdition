package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class Meta extends AmendableWidgetImpl  {

    // STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "meta");
        span.setClassName("widget meta");
        return span;
    }

    // CONSTRUCTORS ------------------
    public Meta() {
        super(create());
        setType("meta");
    }

    public Meta(Element element) {
        super(element);
    }

// FIELDS ------------------

    public Identification getIdentification() {
        Identification result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Identification".equalsIgnoreCase(widget.getType())) {
                result = (Identification)widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public Identification setIdentification(Identification identificationElem) {
        Identification result = getIdentification();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(identificationElem);

        return identificationElem;
    }
    public Publication getPublication() {
        Publication result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Publication".equalsIgnoreCase(widget.getType())) {
                result = (Publication)widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public Publication setPublication(Publication publicationElem) {
        Publication result = getPublication();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(publicationElem);

        return publicationElem;
    }
    public java.util.List<Classification> getClassifications() {
        java.util.List<Classification> result = new ArrayList<Classification>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Classification".equalsIgnoreCase(widget.getType())) {
                result.add((Classification)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<Classification> getClassificationList() {
        return  getClassifications();
    }
    //DSL Style set value
    public Classification addClassification(Classification classificationElem) {
        this.addAmendableWidget(classificationElem);
        return classificationElem;
    }

    public java.util.List<Lifecycle> getLifecycles() {
        java.util.List<Lifecycle> result = new ArrayList<Lifecycle>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Lifecycle".equalsIgnoreCase(widget.getType())) {
                result.add((Lifecycle)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<Lifecycle> getLifecycleList() {
        return  getLifecycles();
    }
    //DSL Style set value
    public Lifecycle addLifecycle(Lifecycle lifecycleElem) {
        this.addAmendableWidget(lifecycleElem);
        return lifecycleElem;
    }

    public java.util.List<Workflow> getWorkflows() {
        java.util.List<Workflow> result = new ArrayList<Workflow>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Workflow".equalsIgnoreCase(widget.getType())) {
                result.add((Workflow)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<Workflow> getWorkflowList() {
        return  getWorkflows();
    }
    //DSL Style set value
    public Workflow addWorkflow(Workflow workflowElem) {
        this.addAmendableWidget(workflowElem);
        return workflowElem;
    }

    public java.util.List<Analysis> getAnalysises() {
        java.util.List<Analysis> result = new ArrayList<Analysis>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Analysis".equalsIgnoreCase(widget.getType())) {
                result.add((Analysis)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<Analysis> getAnalysisList() {
        return  getAnalysises();
    }
    //DSL Style set value
    public Analysis addAnalysis(Analysis analysisElem) {
        this.addAmendableWidget(analysisElem);
        return analysisElem;
    }

    public java.util.List<TemporalData> getTemporalDatas() {
        java.util.List<TemporalData> result = new ArrayList<TemporalData>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("TemporalData".equalsIgnoreCase(widget.getType())) {
                result.add((TemporalData)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<TemporalData> getTemporalDataList() {
        return  getTemporalDatas();
    }
    //DSL Style set value
    public TemporalData addTemporalData(TemporalData temporalDataElem) {
        this.addAmendableWidget(temporalDataElem);
        return temporalDataElem;
    }

    public java.util.List<References> getReferenceses() {
        java.util.List<References> result = new ArrayList<References>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("References".equalsIgnoreCase(widget.getType())) {
                result.add((References)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<References> getReferencesList() {
        return  getReferenceses();
    }
    //DSL Style set value
    public References addReferences(References referencesElem) {
        this.addAmendableWidget(referencesElem);
        return referencesElem;
    }

    public java.util.List<Notes> getNoteses() {
        java.util.List<Notes> result = new ArrayList<Notes>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Notes".equalsIgnoreCase(widget.getType())) {
                result.add((Notes)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<Notes> getNotesList() {
        return  getNoteses();
    }
    //DSL Style set value
    public Notes addNotes(Notes notesElem) {
        this.addAmendableWidget(notesElem);
        return notesElem;
    }

    public java.util.List<Proprietary> getProprietaries() {
        java.util.List<Proprietary> result = new ArrayList<Proprietary>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Proprietary".equalsIgnoreCase(widget.getType())) {
                result.add((Proprietary)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<Proprietary> getProprietaryList() {
        return  getProprietaries();
    }
    //DSL Style set value
    public Proprietary addProprietary(Proprietary proprietaryElem) {
        this.addAmendableWidget(proprietaryElem);
        return proprietaryElem;
    }

    public java.util.List<Presentation> getPresentations() {
        java.util.List<Presentation> result = new ArrayList<Presentation>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Presentation".equalsIgnoreCase(widget.getType())) {
                result.add((Presentation)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    //DSL Style get value
    public java.util.List<Presentation> getPresentationList() {
        return  getPresentations();
    }
    //DSL Style set value
    public Presentation addPresentation(Presentation presentationElem) {
        this.addAmendableWidget(presentationElem);
        return presentationElem;
    }

    /**
    * Returns possible children as a list of <tt>String</tt>s.
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"references","presentation","temporalData","lifecycle","identification","proprietary","classification","notes","analysis","workflow","publication"};
    }

    /**
    * Returns the namespace URI of this amendable widget.
    */
    @Override
    public String getNamespaceURI() {
        return "http://www.akomantoso.org/2.0";
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        return attrs;
    }
}

