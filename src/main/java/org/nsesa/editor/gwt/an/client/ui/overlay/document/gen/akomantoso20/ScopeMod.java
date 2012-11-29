package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;

import java.util.LinkedHashMap;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class ScopeMod extends ModificationTypeComplexType  {

    // STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "scopeMod");
        span.setClassName("widget scopeMod");
        return span;
    }

    // CONSTRUCTORS ------------------
    public ScopeMod() {
        super(create());
        setType("scopeMod");
    }

    public ScopeMod(Element element) {
        super(element);
    }

// FIELDS ------------------
    private ScopeModsSimpleType typeAttr;

    public ScopeModsSimpleType getTypeAttr() {
        if (typeAttr == null) {
            typeAttr = ScopeModsSimpleType.fromString(amendableElement.getAttribute("type"));
        }

        return typeAttr;
    }
    //DSL Style get value
    public ScopeModsSimpleType typeAttr() {
         return  getTypeAttr();
    }

    public void setTypeAttr(final ScopeModsSimpleType typeAttr) {
        this.typeAttr = typeAttr;
    }
    //DSL Style set value
    public ScopeMod typeAttr(final ScopeModsSimpleType typeAttr) {
        setTypeAttr(typeAttr);
        return this;
    }
    public Domain getDomain() {
        Domain result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Domain".equalsIgnoreCase(widget.getType())) {
                result = (Domain)widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public Domain setDomain(Domain domainElem) {
        Domain result = getDomain();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(domainElem);

        return domainElem;
    }
    /**
    * Returns possible children as a list of <tt>String</tt>s.
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"duration","application","source","condition","domain","efficacy","force","destination"};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        attrs.put("typeAttr", getTypeAttr() != null ? getTypeAttr().value() : null);
        return attrs;
    }
}

