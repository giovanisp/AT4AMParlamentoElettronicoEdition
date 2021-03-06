/**
 * Copyright 2013 European Parliament
 *
 * Licensed under the EUPL, Version 1.1 or - as soon they will be approved by the European Commission - subsequent versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 *
 * http://joinup.ec.europa.eu/software/page/eupl
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and limitations under the Licence.
 */
package org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.BooleanSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.StructureIndicator;

import java.util.LinkedHashMap;

/**
 * The element meaningMod is a metadata element specifying an (active or passive) modification in<br/> meaning for the document.
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class MeaningMod extends ModificationTypeComplexType {

    /**
     * Stores a structure indicator coming from xsd structure *
     */
    private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1, 1
            ,
            new StructureIndicator.DefaultSequence(1, 1, new StructureIndicator.DefaultElement(0, 1, new Domain())
            )
            ,

            new StructureIndicator.DefaultSequence(1, 1, new StructureIndicator.DefaultElement(1, -1, new Source())
                    , new StructureIndicator.DefaultElement(1, -1, new Destination())
                    , new StructureIndicator.DefaultElement(0, 1, new Force())
                    , new StructureIndicator.DefaultElement(0, 1, new Efficacy())
                    , new StructureIndicator.DefaultElement(0, 1, new Application())
                    , new StructureIndicator.DefaultElement(0, 1, new Duration())
                    , new StructureIndicator.DefaultElement(0, 1, new Condition())
            )

    );


    /**
     * Create a browser DOM span element and set up "type", "ns" and css class attributes
     */
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "meaningMod");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget meaningMod");
        return span;
    }

// CONSTRUCTORS ------------------

    /**
     * Create a <code>MeaningMod</code> object and set up its type
     */
    public MeaningMod() {
        super(create());
        setType("meaningMod");
    }

    /**
     * Constructor with required attributes
     */
    public MeaningMod(MeaningModsSimpleType typeAttr, IDSimpleType idAttr) {
        this();
        setTypeAttr(typeAttr);
        setIdAttr(idAttr);
    }


    /**
     * Create a <code>MeaningMod</code> object with the given DOM element
     */
    public MeaningMod(Element element) {
        super(element);
    }

    // FIELDS ------------------
    private MeaningModsSimpleType typeAttr;

    /**
     * Return <code>typeAttr</code> property
     *
     * @return typeAttr
     */
    public MeaningModsSimpleType getTypeAttr() {
        if (typeAttr == null) {
            typeAttr = MeaningModsSimpleType.fromString(getElement().getAttribute("type"));
        }

        return typeAttr;
    }

    /**
     * Return <code>typeAttr</code> property in DSL way
     *
     * @return typeAttr
     */
    public MeaningModsSimpleType typeAttr() {
        return getTypeAttr();
    }

    /**
     * Set <code>typeAttr</code> property
     *
     * @param typeAttr the new value
     */
    public void setTypeAttr(final MeaningModsSimpleType typeAttr) {
        this.typeAttr = typeAttr;
        getElement().setAttribute("type", typeAttr.value());
    }

    /**
     * Set <code>typeAttr</code> property in DSL way
     *
     * @param typeAttr the new value
     * @return <code>MeaningMod</code> instance
     */
    public MeaningMod typeAttr(final MeaningModsSimpleType typeAttr) {
        setTypeAttr(typeAttr);
        return this;
    }

    /**
     * Add <code>Domain</code> property in the list of properties
     *
     * @return The property as unmodifiable list
     */
    public Domain getDomain() {
        Domain result = null;
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Domain".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
                result = (Domain) widget;
                break;
            }
        }
        return result;
    }

    /**
     * Set <code>domainElem</code> property in DSL way
     *
     * @param domainElem new value
     * @return <code>Domain</code> instance
     */
    public Domain setDomain(Domain domainElem) {
        Domain result = getDomain();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(domainElem);

        return domainElem;
    }
//Override all attributes methods to be conformant with DSL approach

    /**
     * Set <code>statusAttr</code> property in DSL way
     *
     * @param statusAttr new value
     * @return <code> MeaningMod</code> instance
     */
    public MeaningMod statusAttr(final StatusTypeSimpleType statusAttr) {
        setStatusAttr(statusAttr);
        return this;
    }

    /**
     * Set <code>wildcardContentAttr</code> property in DSL way
     *
     * @param wildcardContentAttr new value
     * @return <code> MeaningMod</code> instance
     */
    public MeaningMod wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
    }

    /**
     * Set <code>refersToAttr</code> property in DSL way
     *
     * @param refersToAttr new value
     * @return <code> MeaningMod</code> instance
     */
    public MeaningMod refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
        return this;
    }

    /**
     * Set <code>idAttr</code> property in DSL way
     *
     * @param idAttr new value
     * @return <code> MeaningMod</code> instance
     */
    public MeaningMod idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
    }

    /**
     * Set <code>evolvingIdAttr</code> property in DSL way
     *
     * @param evolvingIdAttr new value
     * @return <code> MeaningMod</code> instance
     */
    public MeaningMod evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
    }

    /**
     * Set <code>exclusionAttr</code> property in DSL way
     *
     * @param exclusionAttr new value
     * @return <code> MeaningMod</code> instance
     */
    public MeaningMod exclusionAttr(final BooleanSimpleType exclusionAttr) {
        setExclusionAttr(exclusionAttr);
        return this;
    }

    /**
     * Set <code>incompleteAttr</code> property in DSL way
     *
     * @param incompleteAttr new value
     * @return <code> MeaningMod</code> instance
     */
    public MeaningMod incompleteAttr(final BooleanSimpleType incompleteAttr) {
        setIncompleteAttr(incompleteAttr);
        return this;
    }

    /**
     * Set <code>periodAttr</code> property in DSL way
     *
     * @param periodAttr new value
     * @return <code> MeaningMod</code> instance
     */
    public MeaningMod periodAttr(final AnyURISimpleType periodAttr) {
        setPeriodAttr(periodAttr);
        return this;
    }

    /**
     * Returns the namespace URI of this amendable widget.
     *
     * @return The namesapce as String
     */
    @Override
    public String getNamespaceURI() {
        return "http://www.akomantoso.org/2.0";
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        attrs.put("type", getTypeAttr() != null ? getTypeAttr().value() : null);
        return attrs;
    }

    @Override
    public StructureIndicator getStructureIndicator() {
        return STRUCTURE_INDICATOR;
    }

    /**
     * DSL Style for html method
     */
    @Override
    public MeaningMod html(String s) {
        super.html(s);
        return this;
    }
}

