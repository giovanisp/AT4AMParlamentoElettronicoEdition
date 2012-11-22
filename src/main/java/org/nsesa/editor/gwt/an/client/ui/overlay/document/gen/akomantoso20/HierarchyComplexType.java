package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.BasehierarchyComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Intro;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.ComponentRef;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Wrap;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Content;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Hcontainer;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.StatusTypeSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.LanguageSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Clause;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Section;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Part;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Paragraph;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Chapter;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Title;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Article;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Book;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Tome;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Division;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.List;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Point;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Indent;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Alinea;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Subsection;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Subpart;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Subparagraph;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Subchapter;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Subtitle;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Subclause;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Sublist;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import java.util.LinkedHashMap;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class HierarchyComplexType extends BasehierarchyComplexType  {

// CONSTRUCTORS ------------------

    public HierarchyComplexType(Element element) {
        super(element);
    }

// FIELDS ------------------
    private StatusTypeSimpleType statusAttr;
    private IDSimpleType idAttr;
    private NMTOKENSimpleType evolvingIdAttr;
    private StringSimpleType classAttr;
    private StringSimpleType styleAttr;
    private StringSimpleType titleAttr;
    private String wildcardContentAttr;
    private AnyURISimpleType alternativeToAttr;
    private LanguageSimpleType langAttr;
    private AnyURISimpleType refersToAttr;
    private AnyURISimpleType periodAttr;
    public Intro getIntro() {
        Intro result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Intro".equalsIgnoreCase(widget.getType())) {
                result = (Intro)widget;
                break;
            }
        }
        return result;
    }
    public java.util.List<ComponentRef> getComponentRefs() {
        java.util.List<ComponentRef> result = new ArrayList<ComponentRef>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("ComponentRef".equalsIgnoreCase(widget.getType())) {
                result.add((ComponentRef)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public Wrap getWrap() {
        Wrap result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Wrap".equalsIgnoreCase(widget.getType())) {
                result = (Wrap)widget;
                break;
            }
        }
        return result;
    }
    public Content getContent_() {
        Content result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Content".equalsIgnoreCase(widget.getType())) {
                result = (Content)widget;
                break;
            }
        }
        return result;
    }
    public java.util.List<Hcontainer> getHcontainers() {
        java.util.List<Hcontainer> result = new ArrayList<Hcontainer>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Hcontainer".equalsIgnoreCase(widget.getType())) {
                result.add((Hcontainer)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public StatusTypeSimpleType getStatusAttr() {
        if (statusAttr == null) {
            statusAttr = StatusTypeSimpleType.fromString(amendableElement.getAttribute("status"));
        }

        return statusAttr;
    }
    public void setStatusAttr(final StatusTypeSimpleType statusAttr) {
        this.statusAttr = statusAttr;
    }
    public IDSimpleType getIdAttr() {
        if (idAttr == null) {
            idAttr = new IDSimpleType();
            idAttr.setValue(amendableElement.getAttribute("id"));
        }

        return idAttr;
    }
    public void setIdAttr(final IDSimpleType idAttr) {
        this.idAttr = idAttr;
    }
    public NMTOKENSimpleType getEvolvingIdAttr() {
        if (evolvingIdAttr == null) {
            evolvingIdAttr = new NMTOKENSimpleType();
            evolvingIdAttr.setValue(amendableElement.getAttribute("evolvingId"));
        }

        return evolvingIdAttr;
    }
    public void setEvolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        this.evolvingIdAttr = evolvingIdAttr;
    }
    public StringSimpleType getClassAttr() {
        if (classAttr == null) {
            classAttr = new StringSimpleType();
            classAttr.setValue(amendableElement.getAttribute("class"));
        }

        return classAttr;
    }
    public void setClassAttr(final StringSimpleType classAttr) {
        this.classAttr = classAttr;
    }
    public StringSimpleType getStyleAttr() {
        if (styleAttr == null) {
            styleAttr = new StringSimpleType();
            styleAttr.setValue(amendableElement.getAttribute("style"));
        }

        return styleAttr;
    }
    public void setStyleAttr(final StringSimpleType styleAttr) {
        this.styleAttr = styleAttr;
    }
    public StringSimpleType getTitleAttr() {
        if (titleAttr == null) {
            titleAttr = new StringSimpleType();
            titleAttr.setValue(amendableElement.getAttribute("title"));
        }

        return titleAttr;
    }
    public void setTitleAttr(final StringSimpleType titleAttr) {
        this.titleAttr = titleAttr;
    }
    public String getWildcardContentAttr() {
        if (wildcardContentAttr == null) {
            //hmm nothing to do here
        }

        return wildcardContentAttr;
    }
    public void setWildcardContentAttr(final String wildcardContentAttr) {
        this.wildcardContentAttr = wildcardContentAttr;
    }
    public AnyURISimpleType getAlternativeToAttr() {
        if (alternativeToAttr == null) {
            alternativeToAttr = new AnyURISimpleType();
            alternativeToAttr.setValue(amendableElement.getAttribute("alternativeTo"));
        }

        return alternativeToAttr;
    }
    public void setAlternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        this.alternativeToAttr = alternativeToAttr;
    }
    public LanguageSimpleType getLangAttr() {
        if (langAttr == null) {
            langAttr = new LanguageSimpleType();
            langAttr.setValue(amendableElement.getAttribute("lang"));
        }

        return langAttr;
    }
    public void setLangAttr(final LanguageSimpleType langAttr) {
        this.langAttr = langAttr;
    }
    public AnyURISimpleType getRefersToAttr() {
        if (refersToAttr == null) {
            refersToAttr = new AnyURISimpleType();
            refersToAttr.setValue(amendableElement.getAttribute("refersTo"));
        }

        return refersToAttr;
    }
    public void setRefersToAttr(final AnyURISimpleType refersToAttr) {
        this.refersToAttr = refersToAttr;
    }
    public java.util.List<Clause> getClauses() {
        java.util.List<Clause> result = new ArrayList<Clause>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Clause".equalsIgnoreCase(widget.getType())) {
                result.add((Clause)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Section> getSections() {
        java.util.List<Section> result = new ArrayList<Section>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Section".equalsIgnoreCase(widget.getType())) {
                result.add((Section)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Part> getParts() {
        java.util.List<Part> result = new ArrayList<Part>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Part".equalsIgnoreCase(widget.getType())) {
                result.add((Part)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Paragraph> getParagraphs() {
        java.util.List<Paragraph> result = new ArrayList<Paragraph>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Paragraph".equalsIgnoreCase(widget.getType())) {
                result.add((Paragraph)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Chapter> getChapters() {
        java.util.List<Chapter> result = new ArrayList<Chapter>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Chapter".equalsIgnoreCase(widget.getType())) {
                result.add((Chapter)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Title> getTitle_s() {
        java.util.List<Title> result = new ArrayList<Title>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Title".equalsIgnoreCase(widget.getType())) {
                result.add((Title)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Article> getArticles() {
        java.util.List<Article> result = new ArrayList<Article>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Article".equalsIgnoreCase(widget.getType())) {
                result.add((Article)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Book> getBooks() {
        java.util.List<Book> result = new ArrayList<Book>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Book".equalsIgnoreCase(widget.getType())) {
                result.add((Book)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Tome> getTomes() {
        java.util.List<Tome> result = new ArrayList<Tome>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Tome".equalsIgnoreCase(widget.getType())) {
                result.add((Tome)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Division> getDivisions() {
        java.util.List<Division> result = new ArrayList<Division>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Division".equalsIgnoreCase(widget.getType())) {
                result.add((Division)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<List> getLists() {
        java.util.List<List> result = new ArrayList<List>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("List".equalsIgnoreCase(widget.getType())) {
                result.add((List)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Point> getPoints() {
        java.util.List<Point> result = new ArrayList<Point>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Point".equalsIgnoreCase(widget.getType())) {
                result.add((Point)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Indent> getIndents() {
        java.util.List<Indent> result = new ArrayList<Indent>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Indent".equalsIgnoreCase(widget.getType())) {
                result.add((Indent)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Alinea> getAlineas() {
        java.util.List<Alinea> result = new ArrayList<Alinea>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Alinea".equalsIgnoreCase(widget.getType())) {
                result.add((Alinea)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Subsection> getSubsections() {
        java.util.List<Subsection> result = new ArrayList<Subsection>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Subsection".equalsIgnoreCase(widget.getType())) {
                result.add((Subsection)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Subpart> getSubparts() {
        java.util.List<Subpart> result = new ArrayList<Subpart>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Subpart".equalsIgnoreCase(widget.getType())) {
                result.add((Subpart)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Subparagraph> getSubparagraphs() {
        java.util.List<Subparagraph> result = new ArrayList<Subparagraph>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Subparagraph".equalsIgnoreCase(widget.getType())) {
                result.add((Subparagraph)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Subchapter> getSubchapters() {
        java.util.List<Subchapter> result = new ArrayList<Subchapter>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Subchapter".equalsIgnoreCase(widget.getType())) {
                result.add((Subchapter)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Subtitle> getSubtitles() {
        java.util.List<Subtitle> result = new ArrayList<Subtitle>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Subtitle".equalsIgnoreCase(widget.getType())) {
                result.add((Subtitle)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Subclause> getSubclauses() {
        java.util.List<Subclause> result = new ArrayList<Subclause>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Subclause".equalsIgnoreCase(widget.getType())) {
                result.add((Subclause)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Sublist> getSublists() {
        java.util.List<Sublist> result = new ArrayList<Sublist>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Sublist".equalsIgnoreCase(widget.getType())) {
                result.add((Sublist)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public AnyURISimpleType getPeriodAttr() {
        if (periodAttr == null) {
            periodAttr = new AnyURISimpleType();
            periodAttr.setValue(amendableElement.getAttribute("period"));
        }

        return periodAttr;
    }
    public void setPeriodAttr(final AnyURISimpleType periodAttr) {
        this.periodAttr = periodAttr;
    }
    /**
    * Returns possible children as list of String
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"tome","subparagraph","paragraph","subheading","subsection","title","chapter","division","alinea","componentRef","subchapter","wrap","indent","subclause","list","sublist","section","intro","content","point","num","article","subpart","hcontainer","book","subtitle","part","heading","clause"};
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        LinkedHashMap attrs = new LinkedHashMap();
        attrs.putAll(super.getAttributes());
        attrs.put("statusAttr", getStatusAttr().value());
        attrs.put("idAttr", getIdAttr().getValue());
        attrs.put("evolvingIdAttr", getEvolvingIdAttr().getValue());
        attrs.put("classAttr", getClassAttr().getValue());
        attrs.put("styleAttr", getStyleAttr().getValue());
        attrs.put("titleAttr", getTitleAttr().getValue());
        attrs.put("wildcardContentAttr", getWildcardContentAttr().toString());
        attrs.put("alternativeToAttr", getAlternativeToAttr().getValue());
        attrs.put("langAttr", getLangAttr().getValue());
        attrs.put("refersToAttr", getRefersToAttr().getValue());
        attrs.put("periodAttr", getPeriodAttr().getValue());

        return attrs;
    }

}
