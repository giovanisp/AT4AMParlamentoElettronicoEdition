package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.InlineComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.StatusTypeSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.LanguageSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import java.util.HashMap;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.Occurrence;
import java.util.LinkedHashMap;
import java.util.Map;
import com.google.gwt.user.client.DOM;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class Vote extends InlineComplexType  {
    private static Map<AmendableWidget, Occurrence> ALLOWED_SUB_TYPES = new HashMap<AmendableWidget, Occurrence>() {
        {
            put(new Inline(), new Occurrence(0,-1));
            put(new Marker(), new Occurrence(0,-1));
            put(new Popup(), new Occurrence(0,-1));
            put(new Ref(), new Occurrence(0,-1));
            put(new Mref(), new Occurrence(0,-1));
            put(new Rref(), new Occurrence(0,-1));
            put(new Mod(), new Occurrence(0,-1));
            put(new Mmod(), new Occurrence(0,-1));
            put(new Rmod(), new Occurrence(0,-1));
            put(new Remark(), new Occurrence(0,-1));
            put(new RecordedTime(), new Occurrence(0,-1));
            put(new Vote(), new Occurrence(0,-1));
            put(new Outcome(), new Occurrence(0,-1));
            put(new Ins(), new Occurrence(0,-1));
            put(new Del(), new Occurrence(0,-1));
            put(new Omissis(), new Occurrence(0,-1));
            put(new ExtractText(), new Occurrence(0,-1));
            put(new ExtractStructure(), new Occurrence(0,-1));
            put(new Placeholder(), new Occurrence(0,-1));
            put(new FillIn(), new Occurrence(0,-1));
            put(new B(), new Occurrence(0,-1));
            put(new I(), new Occurrence(0,-1));
            put(new A(), new Occurrence(0,-1));
            put(new U(), new Occurrence(0,-1));
            put(new Sub(), new Occurrence(0,-1));
            put(new Sup(), new Occurrence(0,-1));
            put(new Span(), new Occurrence(0,-1));
            put(new DocType(), new Occurrence(0,-1));
            put(new DocTitle(), new Occurrence(0,-1));
            put(new DocNumber(), new Occurrence(0,-1));
            put(new DocProponent(), new Occurrence(0,-1));
            put(new DocDate(), new Occurrence(0,-1));
            put(new Legislature(), new Occurrence(0,-1));
            put(new Session(), new Occurrence(0,-1));
            put(new ShortTitle(), new Occurrence(0,-1));
            put(new DocPurpose(), new Occurrence(0,-1));
            put(new DocCommittee(), new Occurrence(0,-1));
            put(new DocIntroducer(), new Occurrence(0,-1));
            put(new DocStage(), new Occurrence(0,-1));
            put(new DocStatus(), new Occurrence(0,-1));
            put(new DocJurisdiction(), new Occurrence(0,-1));
            put(new DocketNumber(), new Occurrence(0,-1));
            put(new Date(), new Occurrence(0,-1));
            put(new Person(), new Occurrence(0,-1));
            put(new Organization(), new Occurrence(0,-1));
            put(new Concept(), new Occurrence(0,-1));
            put(new Object(), new Occurrence(0,-1));
            put(new Event(), new Occurrence(0,-1));
            put(new Location(), new Occurrence(0,-1));
            put(new Process(), new Occurrence(0,-1));
            put(new Role(), new Occurrence(0,-1));
            put(new Term(), new Occurrence(0,-1));
            put(new Quantity(), new Occurrence(0,-1));
            put(new Def(), new Occurrence(0,-1));
            put(new Entity(), new Occurrence(0,-1));
            put(new CourtType(), new Occurrence(0,-1));
            put(new NeutralCitation(), new Occurrence(0,-1));
            put(new Party(), new Occurrence(0,-1));
            put(new Judge(), new Occurrence(0,-1));
            put(new Lawyer(), new Occurrence(0,-1));
            put(new Signature(), new Occurrence(0,-1));
            put(new Opinion(), new Occurrence(0,-1));
            put(new AffectedDocument(), new Occurrence(0,-1));
            put(new RelatedDocument(), new Occurrence(0,-1));
            put(new Change(), new Occurrence(0,-1));
            put(new NoteRef(), new Occurrence(0,-1));
            put(new Eol(), new Occurrence(0,-1));
            put(new Eop(), new Occurrence(0,-1));
            put(new Img(), new Occurrence(0,-1));
            put(new AuthorialNote(), new Occurrence(0,-1));
        }
    };



    // STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "vote");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget vote");
        return span;
    }

// CONSTRUCTORS ------------------
    public Vote() {
        super(create());
        setType("vote");
    }

    public Vote(Element element) {
        super(element);
    }

// FIELDS ------------------
    private AnyURISimpleType byAttr;
    private AnyURISimpleType asAttr;
    private AnyURISimpleType choiceAttr;

    public AnyURISimpleType getByAttr() {
        if (byAttr == null) {
            byAttr = new AnyURISimpleType();
            byAttr.setValue(getElement().getAttribute("by"));
        }

        return byAttr;
     }
     //DSL Style get value
    public AnyURISimpleType byAttr() {
        return  getByAttr();
    }

    public void setByAttr(final AnyURISimpleType byAttr) {
        this.byAttr = byAttr;
    }
     //DSL Style set value
    public Vote byAttr(final AnyURISimpleType byAttr) {
        setByAttr(byAttr);
        return this;
    }
    public AnyURISimpleType getAsAttr() {
        if (asAttr == null) {
            asAttr = new AnyURISimpleType();
            asAttr.setValue(getElement().getAttribute("as"));
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
    public Vote asAttr(final AnyURISimpleType asAttr) {
        setAsAttr(asAttr);
        return this;
    }
    public AnyURISimpleType getChoiceAttr() {
        if (choiceAttr == null) {
            choiceAttr = new AnyURISimpleType();
            choiceAttr.setValue(getElement().getAttribute("choice"));
        }

        return choiceAttr;
     }
     //DSL Style get value
    public AnyURISimpleType choiceAttr() {
        return  getChoiceAttr();
    }

    public void setChoiceAttr(final AnyURISimpleType choiceAttr) {
        this.choiceAttr = choiceAttr;
    }
     //DSL Style set value
    public Vote choiceAttr(final AnyURISimpleType choiceAttr) {
        setChoiceAttr(choiceAttr);
        return this;
    }
    //Override all attributes methods to be conformant with DSL approach
    //DSL Style set value
    public Vote classAttr(final StringSimpleType classAttr) {
        setClassAttr(classAttr);
        return this;
    }
    //DSL Style set value
    public Vote styleAttr(final StringSimpleType styleAttr) {
        setStyleAttr(styleAttr);
        return this;
    }
    //DSL Style set value
    public Vote titleAttr(final StringSimpleType titleAttr) {
        setTitleAttr(titleAttr);
        return this;
    }
    //DSL Style set value
    public Vote wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
    }
    //DSL Style set value
    public Vote alternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        setAlternativeToAttr(alternativeToAttr);
        return this;
    }
    //DSL Style set value
    public Vote refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
        return this;
    }
    //DSL Style set value
    public Vote statusAttr(final StatusTypeSimpleType statusAttr) {
        setStatusAttr(statusAttr);
        return this;
    }
    //DSL Style set value
    public Vote langAttr(final LanguageSimpleType langAttr) {
        setLangAttr(langAttr);
        return this;
    }
    //DSL Style set value
    public Vote idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
    }
    //DSL Style set value
    public Vote evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
    }
    //DSL Style set value
    public Vote periodAttr(final AnyURISimpleType periodAttr) {
        setPeriodAttr(periodAttr);
        return this;
    }

    /**
    * Returns possible children as a map of <tt>AmendableWidget, Occurrence</tt>s.
    */
    @Override
    public Map<AmendableWidget, Occurrence> getAllowedChildTypes() {
        return java.util.Collections.unmodifiableMap(ALLOWED_SUB_TYPES);
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
        attrs.put("by", getByAttr() != null ? getByAttr().getValue() : null);
        attrs.put("as", getAsAttr() != null ? getAsAttr().getValue() : null);
        attrs.put("choice", getChoiceAttr() != null ? getChoiceAttr().getValue() : null);
        return attrs;
    }
}

