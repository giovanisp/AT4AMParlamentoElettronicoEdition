package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.DateSimpleType;

import java.util.LinkedHashMap;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class Step extends AnyOtherTypeComplexType  {

    // STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "step");
        span.setClassName("widget step");
        return span;
    }

    // CONSTRUCTORS ------------------
    public Step() {
        super(create());
        setType("step");
    }

    public Step(Element element) {
        super(element);
    }

// FIELDS ------------------
    private AnyURISimpleType outcomeAttr;
    private DateSimpleType dateAttr;
    private AnyURISimpleType asAttr;
    private AnyURISimpleType actorAttr;

    public AnyURISimpleType getOutcomeAttr() {
        if (outcomeAttr == null) {
            outcomeAttr = new AnyURISimpleType();
            outcomeAttr.setValue(amendableElement.getAttribute("outcome"));
        }

        return outcomeAttr;
    }
    //DSL Style get value
    public AnyURISimpleType outcomeAttr() {
         return  getOutcomeAttr();
    }

    public void setOutcomeAttr(final AnyURISimpleType outcomeAttr) {
        this.outcomeAttr = outcomeAttr;
    }
    //DSL Style set value
    public Step outcomeAttr(final AnyURISimpleType outcomeAttr) {
        setOutcomeAttr(outcomeAttr);
        return this;
    }
    public DateSimpleType getDateAttr() {
        if (dateAttr == null) {
            dateAttr = new DateSimpleType();
            dateAttr.setValue(amendableElement.getAttribute("date"));
        }

        return dateAttr;
    }
    //DSL Style get value
    public DateSimpleType dateAttr() {
         return  getDateAttr();
    }

    public void setDateAttr(final DateSimpleType dateAttr) {
        this.dateAttr = dateAttr;
    }
    //DSL Style set value
    public Step dateAttr(final DateSimpleType dateAttr) {
        setDateAttr(dateAttr);
        return this;
    }
    public AnyURISimpleType getAsAttr() {
        if (asAttr == null) {
            asAttr = new AnyURISimpleType();
            asAttr.setValue(amendableElement.getAttribute("as"));
        }

        return asAttr;
    }
    //DSL Style get value
    public AnyURISimpleType asAttr() {
         return  getAsAttr();
    }

    public void setAsAttr(final AnyURISimpleType asAttr) {
        this.asAttr = asAttr;
    }
    //DSL Style set value
    public Step asAttr(final AnyURISimpleType asAttr) {
        setAsAttr(asAttr);
        return this;
    }
    public AnyURISimpleType getActorAttr() {
        if (actorAttr == null) {
            actorAttr = new AnyURISimpleType();
            actorAttr.setValue(amendableElement.getAttribute("actor"));
        }

        return actorAttr;
    }
    //DSL Style get value
    public AnyURISimpleType actorAttr() {
         return  getActorAttr();
    }

    public void setActorAttr(final AnyURISimpleType actorAttr) {
        this.actorAttr = actorAttr;
    }
    //DSL Style set value
    public Step actorAttr(final AnyURISimpleType actorAttr) {
        setActorAttr(actorAttr);
        return this;
    }
    /**
    * Returns possible children as a list of <tt>String</tt>s.
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"*"};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        attrs.put("outcomeAttr", getOutcomeAttr() != null ? getOutcomeAttr().getValue() : null);
        attrs.put("dateAttr", getDateAttr() != null ? getDateAttr().getValue() : null);
        attrs.put("asAttr", getAsAttr() != null ? getAsAttr().getValue() : null);
        attrs.put("actorAttr", getActorAttr() != null ? getActorAttr().getValue() : null);
        return attrs;
    }
}

