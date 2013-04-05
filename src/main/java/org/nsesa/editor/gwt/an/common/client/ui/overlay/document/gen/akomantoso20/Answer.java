/**
 * Copyright 2013 European Parliament
 *
 * Licensed under the EUPL, Version 1.1 or – as soon they will be approved by the European Commission - subsequent versions of the EUPL (the "Licence");
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

import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.SpeechTypeComplexType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.DateTimeSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.StatusTypeSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.LanguageSimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;
import java.util.HashMap;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.StructureIndicator;
import java.util.LinkedHashMap;
import java.util.Map;
import com.google.gwt.user.client.DOM;

/**
* the element answer is a container of a single official answer to a question
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class Answer extends SpeechTypeComplexType  {

/** Stores a structure indicator coming from xsd structure **/
private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1,1
        ,
        new StructureIndicator.DefaultSequence(1,1,        new StructureIndicator.DefaultElement(0,1,new From())
,        new StructureIndicator.DefaultSequence(1,-1,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultElement(1,1,new BlockList())
,        new StructureIndicator.DefaultElement(1,1,new Toc())
,        new StructureIndicator.DefaultElement(1,1,new Tblock())
)
)
,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultElement(1,1,new Ul())
,        new StructureIndicator.DefaultElement(1,1,new Ol())
,        new StructureIndicator.DefaultElement(1,1,new Table())
,        new StructureIndicator.DefaultElement(1,1,new P())
)
)
,        new StructureIndicator.DefaultElement(1,1,new Foreign())
,        new StructureIndicator.DefaultElement(1,1,new Block())
)
)
)
)
        ,

        new StructureIndicator.DefaultSequence(1,1,        new StructureIndicator.DefaultElement(0,1,new Num())
,        new StructureIndicator.DefaultElement(0,1,new Heading())
,        new StructureIndicator.DefaultElement(0,1,new Subheading())
)
        
);


/**
* Create a browser DOM span element and set up "type", "ns" and css class attributes
*/
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "answer");
span.setAttribute("ns", "http://www.akomantoso.org/2.0");
span.setClassName("widget answer");
return span;
}

// CONSTRUCTORS ------------------
/**
* Create a <code>Answer</code> object and set up its type
*/
public Answer() {
super(create());
setType("answer");
}

/**
* Constructor with required attributes
*/
public Answer(AnyURISimpleType byAttr) {
this();
setByAttr(byAttr);
}


/**
* Create a <code>Answer</code> object with the given DOM element
*/
public Answer(Element element) {
super(element);
}

// FIELDS ------------------

//Override all attributes methods to be conformant with DSL approach
        /**
        * Set <code>byAttr</code> property in DSL way
        * @param byAttr new value
        * @return <code> Answer</code> instance
        */
        public Answer byAttr(final AnyURISimpleType byAttr) {
        setByAttr(byAttr);
        return this;
        }
        /**
        * Set <code>asAttr</code> property in DSL way
        * @param asAttr new value
        * @return <code> Answer</code> instance
        */
        public Answer asAttr(final AnyURISimpleType asAttr) {
        setAsAttr(asAttr);
        return this;
        }
        /**
        * Set <code>startTimeAttr</code> property in DSL way
        * @param startTimeAttr new value
        * @return <code> Answer</code> instance
        */
        public Answer startTimeAttr(final DateTimeSimpleType startTimeAttr) {
        setStartTimeAttr(startTimeAttr);
        return this;
        }
        /**
        * Set <code>endTimeAttr</code> property in DSL way
        * @param endTimeAttr new value
        * @return <code> Answer</code> instance
        */
        public Answer endTimeAttr(final DateTimeSimpleType endTimeAttr) {
        setEndTimeAttr(endTimeAttr);
        return this;
        }
        /**
        * Set <code>toAttr</code> property in DSL way
        * @param toAttr new value
        * @return <code> Answer</code> instance
        */
        public Answer toAttr(final AnyURISimpleType toAttr) {
        setToAttr(toAttr);
        return this;
        }
        /**
        * Set <code>statusAttr</code> property in DSL way
        * @param statusAttr new value
        * @return <code> Answer</code> instance
        */
        public Answer statusAttr(final StatusTypeSimpleType statusAttr) {
        setStatusAttr(statusAttr);
        return this;
        }
        /**
        * Set <code>classAttr</code> property in DSL way
        * @param classAttr new value
        * @return <code> Answer</code> instance
        */
        public Answer classAttr(final StringSimpleType classAttr) {
        setClassAttr(classAttr);
        return this;
        }
        /**
        * Set <code>styleAttr</code> property in DSL way
        * @param styleAttr new value
        * @return <code> Answer</code> instance
        */
        public Answer styleAttr(final StringSimpleType styleAttr) {
        setStyleAttr(styleAttr);
        return this;
        }
        /**
        * Set <code>titleAttr</code> property in DSL way
        * @param titleAttr new value
        * @return <code> Answer</code> instance
        */
        public Answer titleAttr(final StringSimpleType titleAttr) {
        setTitleAttr(titleAttr);
        return this;
        }
        /**
        * Set <code>alternativeToAttr</code> property in DSL way
        * @param alternativeToAttr new value
        * @return <code> Answer</code> instance
        */
        public Answer alternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        setAlternativeToAttr(alternativeToAttr);
        return this;
        }
        /**
        * Set <code>wildcardContentAttr</code> property in DSL way
        * @param wildcardContentAttr new value
        * @return <code> Answer</code> instance
        */
        public Answer wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
        }
        /**
        * Set <code>idAttr</code> property in DSL way
        * @param idAttr new value
        * @return <code> Answer</code> instance
        */
        public Answer idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
        }
        /**
        * Set <code>evolvingIdAttr</code> property in DSL way
        * @param evolvingIdAttr new value
        * @return <code> Answer</code> instance
        */
        public Answer evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
        }
        /**
        * Set <code>refersToAttr</code> property in DSL way
        * @param refersToAttr new value
        * @return <code> Answer</code> instance
        */
        public Answer refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
        return this;
        }
        /**
        * Set <code>langAttr</code> property in DSL way
        * @param langAttr new value
        * @return <code> Answer</code> instance
        */
        public Answer langAttr(final LanguageSimpleType langAttr) {
        setLangAttr(langAttr);
        return this;
        }
        /**
        * Set <code>periodAttr</code> property in DSL way
        * @param periodAttr new value
        * @return <code> Answer</code> instance
        */
        public Answer periodAttr(final AnyURISimpleType periodAttr) {
        setPeriodAttr(periodAttr);
        return this;
        }

/**
* Returns the namespace URI of this amendable widget.
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
public Answer html(String s) {
    super.html(s);
    return this;
}
}
