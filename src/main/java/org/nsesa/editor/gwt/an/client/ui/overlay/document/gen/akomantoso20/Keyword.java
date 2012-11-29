package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.StringSimpleType;

import java.util.LinkedHashMap;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class Keyword extends MetaoptComplexType  {

    // STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "keyword");
        span.setClassName("widget keyword");
        return span;
    }

    // CONSTRUCTORS ------------------
    public Keyword() {
        super(create());
        setType("keyword");
    }

    public Keyword(Element element) {
        super(element);
    }

// FIELDS ------------------
    private AnyURISimpleType dictionaryAttr;
    private StringSimpleType showAsAttr;
    private StringSimpleType shortFormAttr;
    private StringSimpleType valueAttr;

    public AnyURISimpleType getDictionaryAttr() {
        if (dictionaryAttr == null) {
            dictionaryAttr = new AnyURISimpleType();
            dictionaryAttr.setValue(amendableElement.getAttribute("dictionary"));
        }

        return dictionaryAttr;
    }
    //DSL Style get value
    public AnyURISimpleType dictionaryAttr() {
         return  getDictionaryAttr();
    }

    public void setDictionaryAttr(final AnyURISimpleType dictionaryAttr) {
        this.dictionaryAttr = dictionaryAttr;
    }
    //DSL Style set value
    public Keyword dictionaryAttr(final AnyURISimpleType dictionaryAttr) {
        setDictionaryAttr(dictionaryAttr);
        return this;
    }
    public StringSimpleType getShowAsAttr() {
        if (showAsAttr == null) {
            showAsAttr = new StringSimpleType();
            showAsAttr.setValue(amendableElement.getAttribute("showAs"));
        }

        return showAsAttr;
    }
    //DSL Style get value
    public StringSimpleType showAsAttr() {
         return  getShowAsAttr();
    }

    public void setShowAsAttr(final StringSimpleType showAsAttr) {
        this.showAsAttr = showAsAttr;
    }
    //DSL Style set value
    public Keyword showAsAttr(final StringSimpleType showAsAttr) {
        setShowAsAttr(showAsAttr);
        return this;
    }
    public StringSimpleType getShortFormAttr() {
        if (shortFormAttr == null) {
            shortFormAttr = new StringSimpleType();
            shortFormAttr.setValue(amendableElement.getAttribute("shortForm"));
        }

        return shortFormAttr;
    }
    //DSL Style get value
    public StringSimpleType shortFormAttr() {
         return  getShortFormAttr();
    }

    public void setShortFormAttr(final StringSimpleType shortFormAttr) {
        this.shortFormAttr = shortFormAttr;
    }
    //DSL Style set value
    public Keyword shortFormAttr(final StringSimpleType shortFormAttr) {
        setShortFormAttr(shortFormAttr);
        return this;
    }
    public StringSimpleType getValueAttr() {
        if (valueAttr == null) {
            valueAttr = new StringSimpleType();
            valueAttr.setValue(amendableElement.getAttribute("value"));
        }

        return valueAttr;
    }
    //DSL Style get value
    public StringSimpleType valueAttr() {
         return  getValueAttr();
    }

    public void setValueAttr(final StringSimpleType valueAttr) {
        this.valueAttr = valueAttr;
    }
    //DSL Style set value
    public Keyword valueAttr(final StringSimpleType valueAttr) {
        setValueAttr(valueAttr);
        return this;
    }
    /**
    * Returns possible children as a list of <tt>String</tt>s.
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{};
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
        attrs.put("dictionary", getDictionaryAttr() != null ? getDictionaryAttr().getValue() : null);
        attrs.put("showAs", getShowAsAttr() != null ? getShowAsAttr().getValue() : null);
        attrs.put("shortForm", getShortFormAttr() != null ? getShortFormAttr().getValue() : null);
        attrs.put("value", getValueAttr() != null ? getValueAttr().getValue() : null);
        return attrs;
    }
}

