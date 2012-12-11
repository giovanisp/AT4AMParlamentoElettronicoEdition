package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.*;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.LanguageSimpleType;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */
public class Table extends AmendableWidgetImpl {

    // STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "table");
        span.setClassName("widget table");
        return span;
    }

    // CONSTRUCTORS ------------------
    public Table() {
        super(create());
        setType("table");
    }

    public Table(Element element) {
        super(element);
    }

    // FIELDS ------------------
    private IntegerSimpleType widthAttr;
    private IntegerSimpleType borderAttr;
    private IntegerSimpleType cellspacingAttr;
    private IntegerSimpleType cellpaddingAttr;
    private String wildcardContentAttr;
    private StringSimpleType classAttr;
    private StringSimpleType styleAttr;
    private StringSimpleType titleAttr;
    private IDSimpleType idAttr;
    private NMTOKENSimpleType evolvingIdAttr;
    private LanguageSimpleType langAttr;
    private AnyURISimpleType alternativeToAttr;
    private AnyURISimpleType refersToAttr;
    private StatusTypeSimpleType statusAttr;
    private AnyURISimpleType periodAttr;

    public IntegerSimpleType getWidthAttr() {
        if (widthAttr == null) {
            widthAttr = new IntegerSimpleType();
            widthAttr.setValue(getElement().getAttribute("width"));
        }

        return widthAttr;
    }

    //DSL Style get value
    public IntegerSimpleType widthAttr() {
        return getWidthAttr();
    }

    public void setWidthAttr(final IntegerSimpleType widthAttr) {
        this.widthAttr = widthAttr;
    }

    //DSL Style set value
    public Table widthAttr(final IntegerSimpleType widthAttr) {
        setWidthAttr(widthAttr);
        return this;
    }

    public IntegerSimpleType getBorderAttr() {
        if (borderAttr == null) {
            borderAttr = new IntegerSimpleType();
            borderAttr.setValue(getElement().getAttribute("border"));
        }

        return borderAttr;
    }

    //DSL Style get value
    public IntegerSimpleType borderAttr() {
        return getBorderAttr();
    }

    public void setBorderAttr(final IntegerSimpleType borderAttr) {
        this.borderAttr = borderAttr;
    }

    //DSL Style set value
    public Table borderAttr(final IntegerSimpleType borderAttr) {
        setBorderAttr(borderAttr);
        return this;
    }

    public IntegerSimpleType getCellspacingAttr() {
        if (cellspacingAttr == null) {
            cellspacingAttr = new IntegerSimpleType();
            cellspacingAttr.setValue(getElement().getAttribute("cellspacing"));
        }

        return cellspacingAttr;
    }

    //DSL Style get value
    public IntegerSimpleType cellspacingAttr() {
        return getCellspacingAttr();
    }

    public void setCellspacingAttr(final IntegerSimpleType cellspacingAttr) {
        this.cellspacingAttr = cellspacingAttr;
    }

    //DSL Style set value
    public Table cellspacingAttr(final IntegerSimpleType cellspacingAttr) {
        setCellspacingAttr(cellspacingAttr);
        return this;
    }

    public IntegerSimpleType getCellpaddingAttr() {
        if (cellpaddingAttr == null) {
            cellpaddingAttr = new IntegerSimpleType();
            cellpaddingAttr.setValue(getElement().getAttribute("cellpadding"));
        }

        return cellpaddingAttr;
    }

    //DSL Style get value
    public IntegerSimpleType cellpaddingAttr() {
        return getCellpaddingAttr();
    }

    public void setCellpaddingAttr(final IntegerSimpleType cellpaddingAttr) {
        this.cellpaddingAttr = cellpaddingAttr;
    }

    //DSL Style set value
    public Table cellpaddingAttr(final IntegerSimpleType cellpaddingAttr) {
        setCellpaddingAttr(cellpaddingAttr);
        return this;
    }

    public Caption getCaption() {
        Caption result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Caption".equalsIgnoreCase(widget.getType())) {
                result = (Caption) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public Caption setCaption(Caption captionElem) {
        Caption result = getCaption();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(captionElem);

        return captionElem;
    }

    public java.util.List<Tr> getTrs() {
        java.util.List<Tr> result = new ArrayList<Tr>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Tr".equalsIgnoreCase(widget.getType())) {
                result.add((Tr) widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

    //DSL Style get value
    public java.util.List<Tr> getTrList() {
        return getTrs();
    }

    //DSL Style set value
    public Tr addTr(Tr trElem) {
        this.addAmendableWidget(trElem);
        return trElem;
    }

    public String getWildcardContentAttr() {
        if (wildcardContentAttr == null) {
            //hmm nothing to do here
        }

        return wildcardContentAttr;
    }

    //DSL Style get value
    public String wildcardContentAttr() {
        return getWildcardContentAttr();
    }

    public void setWildcardContentAttr(final String wildcardContentAttr) {
        this.wildcardContentAttr = wildcardContentAttr;
    }

    //DSL Style set value
    public Table wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
    }

    public StringSimpleType getClassAttr() {
        if (classAttr == null) {
            classAttr = new StringSimpleType();
            classAttr.setValue(getElement().getAttribute("class"));
        }

        return classAttr;
    }

    //DSL Style get value
    public StringSimpleType classAttr() {
        return getClassAttr();
    }

    public void setClassAttr(final StringSimpleType classAttr) {
        this.classAttr = classAttr;
    }

    //DSL Style set value
    public Table classAttr(final StringSimpleType classAttr) {
        setClassAttr(classAttr);
        return this;
    }

    public StringSimpleType getStyleAttr() {
        if (styleAttr == null) {
            styleAttr = new StringSimpleType();
            styleAttr.setValue(getElement().getAttribute("style"));
        }

        return styleAttr;
    }

    //DSL Style get value
    public StringSimpleType styleAttr() {
        return getStyleAttr();
    }

    public void setStyleAttr(final StringSimpleType styleAttr) {
        this.styleAttr = styleAttr;
    }

    //DSL Style set value
    public Table styleAttr(final StringSimpleType styleAttr) {
        setStyleAttr(styleAttr);
        return this;
    }

    public StringSimpleType getTitleAttr() {
        if (titleAttr == null) {
            titleAttr = new StringSimpleType();
            titleAttr.setValue(getElement().getAttribute("title"));
        }

        return titleAttr;
    }

    //DSL Style get value
    public StringSimpleType titleAttr() {
        return getTitleAttr();
    }

    public void setTitleAttr(final StringSimpleType titleAttr) {
        this.titleAttr = titleAttr;
    }

    //DSL Style set value
    public Table titleAttr(final StringSimpleType titleAttr) {
        setTitleAttr(titleAttr);
        return this;
    }

    public IDSimpleType getIdAttr() {
        if (idAttr == null) {
            idAttr = new IDSimpleType();
            idAttr.setValue(getElement().getAttribute("id"));
        }

        return idAttr;
    }

    //DSL Style get value
    public IDSimpleType idAttr() {
        return getIdAttr();
    }

    public void setIdAttr(final IDSimpleType idAttr) {
        this.idAttr = idAttr;
    }

    //DSL Style set value
    public Table idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
    }

    public NMTOKENSimpleType getEvolvingIdAttr() {
        if (evolvingIdAttr == null) {
            evolvingIdAttr = new NMTOKENSimpleType();
            evolvingIdAttr.setValue(getElement().getAttribute("evolvingId"));
        }

        return evolvingIdAttr;
    }

    //DSL Style get value
    public NMTOKENSimpleType evolvingIdAttr() {
        return getEvolvingIdAttr();
    }

    public void setEvolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        this.evolvingIdAttr = evolvingIdAttr;
    }

    //DSL Style set value
    public Table evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
    }

    public LanguageSimpleType getLangAttr() {
        if (langAttr == null) {
            langAttr = new LanguageSimpleType();
            langAttr.setValue(getElement().getAttribute("lang"));
        }

        return langAttr;
    }

    //DSL Style get value
    public LanguageSimpleType langAttr() {
        return getLangAttr();
    }

    public void setLangAttr(final LanguageSimpleType langAttr) {
        this.langAttr = langAttr;
    }

    //DSL Style set value
    public Table langAttr(final LanguageSimpleType langAttr) {
        setLangAttr(langAttr);
        return this;
    }

    public AnyURISimpleType getAlternativeToAttr() {
        if (alternativeToAttr == null) {
            alternativeToAttr = new AnyURISimpleType();
            alternativeToAttr.setValue(getElement().getAttribute("alternativeTo"));
        }

        return alternativeToAttr;
    }

    //DSL Style get value
    public AnyURISimpleType alternativeToAttr() {
        return getAlternativeToAttr();
    }

    public void setAlternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        this.alternativeToAttr = alternativeToAttr;
    }

    //DSL Style set value
    public Table alternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        setAlternativeToAttr(alternativeToAttr);
        return this;
    }

    public AnyURISimpleType getRefersToAttr() {
        if (refersToAttr == null) {
            refersToAttr = new AnyURISimpleType();
            refersToAttr.setValue(getElement().getAttribute("refersTo"));
        }

        return refersToAttr;
    }

    //DSL Style get value
    public AnyURISimpleType refersToAttr() {
        return getRefersToAttr();
    }

    public void setRefersToAttr(final AnyURISimpleType refersToAttr) {
        this.refersToAttr = refersToAttr;
    }

    //DSL Style set value
    public Table refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
        return this;
    }

    public StatusTypeSimpleType getStatusAttr() {
        if (statusAttr == null) {
            statusAttr = StatusTypeSimpleType.fromString(getElement().getAttribute("status"));
        }

        return statusAttr;
    }

    //DSL Style get value
    public StatusTypeSimpleType statusAttr() {
        return getStatusAttr();
    }

    public void setStatusAttr(final StatusTypeSimpleType statusAttr) {
        this.statusAttr = statusAttr;
    }

    //DSL Style set value
    public Table statusAttr(final StatusTypeSimpleType statusAttr) {
        setStatusAttr(statusAttr);
        return this;
    }

    public AnyURISimpleType getPeriodAttr() {
        if (periodAttr == null) {
            periodAttr = new AnyURISimpleType();
            periodAttr.setValue(getElement().getAttribute("period"));
        }

        return periodAttr;
    }

    //DSL Style get value
    public AnyURISimpleType periodAttr() {
        return getPeriodAttr();
    }

    public void setPeriodAttr(final AnyURISimpleType periodAttr) {
        this.periodAttr = periodAttr;
    }

    //DSL Style set value
    public Table periodAttr(final AnyURISimpleType periodAttr) {
        setPeriodAttr(periodAttr);
        return this;
    }

    /**
     * Returns possible children as a list of <tt>String</tt>s.
     */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"tr", "caption"};
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
        attrs.put("width", getWidthAttr() != null ? getWidthAttr().getValue() : null);
        attrs.put("border", getBorderAttr() != null ? getBorderAttr().getValue() : null);
        attrs.put("cellspacing", getCellspacingAttr() != null ? getCellspacingAttr().getValue() : null);
        attrs.put("cellpadding", getCellpaddingAttr() != null ? getCellpaddingAttr().getValue() : null);
        attrs.put("wildcardContent", getWildcardContentAttr() != null ? getWildcardContentAttr().toString() : null);
        attrs.put("class", getClassAttr() != null ? getClassAttr().getValue() : null);
        attrs.put("style", getStyleAttr() != null ? getStyleAttr().getValue() : null);
        attrs.put("title", getTitleAttr() != null ? getTitleAttr().getValue() : null);
        attrs.put("id", getIdAttr() != null ? getIdAttr().getValue() : null);
        attrs.put("evolvingId", getEvolvingIdAttr() != null ? getEvolvingIdAttr().getValue() : null);
        attrs.put("lang", getLangAttr() != null ? getLangAttr().getValue() : null);
        attrs.put("alternativeTo", getAlternativeToAttr() != null ? getAlternativeToAttr().getValue() : null);
        attrs.put("refersTo", getRefersToAttr() != null ? getRefersToAttr().getValue() : null);
        attrs.put("status", getStatusAttr() != null ? getStatusAttr().value() : null);
        attrs.put("period", getPeriodAttr() != null ? getPeriodAttr().getValue() : null);
        return attrs;
    }
}

