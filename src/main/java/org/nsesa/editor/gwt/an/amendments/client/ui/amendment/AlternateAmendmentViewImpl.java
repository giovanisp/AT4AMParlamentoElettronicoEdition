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
package org.nsesa.editor.gwt.an.amendments.client.ui.amendment;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.*;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.ui.*;
import com.google.inject.Inject;
import org.nsesa.editor.gwt.amendment.client.ui.amendment.AmendmentView;
import org.nsesa.editor.gwt.amendment.client.ui.amendment.resources.Constants;

/**
 * Date: 20/03/13 11:27
 *
 * @author <a href="philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class AlternateAmendmentViewImpl extends Composite implements AmendmentView {
    interface MyUiBinder extends UiBinder<Widget, AlternateAmendmentViewImpl> {
    }

    private static MyUiBinder uiBinder = GWT.create(MyUiBinder.class);

    private final Constants constants;

    @UiField
    Label title;

    @UiField
    Label status;

    @UiField
    InlineHTML introduction;

    @UiField
    HTMLPanel body;

    @UiField
    Image moreImage;

    @UiField
    Image editImage;

    @UiField
    Image deleteImage;

    @Inject
    public AlternateAmendmentViewImpl(final Constants constants) {
        this.constants = constants;
        final Widget widget = uiBinder.createAndBindUi(this);
        initWidget(widget);
    }

    @Override
    public HandlerRegistration addClickHandler(ClickHandler handler) {
        return addDomHandler(handler, ClickEvent.getType());
    }

    @Override
    public HandlerRegistration addDoubleClickHandler(DoubleClickHandler handler) {
        return addDomHandler(handler, DoubleClickEvent.getType());
    }

    @Override
    public void setTitle(String title) {
        super.setTitle(title);
        this.title.setText(title);
    }

    @Override
    public void setStatus(final String status) {
        if (status != null) {
            // do a lookup ...
            final String lookup = constants != null ? constants.getString(status.toLowerCase()) : null;
            if (lookup != null)
                this.status.setText(lookup);
            else
                this.status.setText(status);
        }
    }

    /**
     * Overridden to ensure that browser events do not bubble up to the parent DOM element.
     *
     * @param event the event
     */
    @Override
    public void onBrowserEvent(Event event) {
        event.stopPropagation();
        super.onBrowserEvent(event);
    }

    @Override
    public void setBody(String xmlContent) {
        body.getElement().setInnerHTML(xmlContent);
    }

    @Override
    public Element getBody() {
        return (Element) body.getElement().getFirstChildElement();
    }

    @Override
    public HasClickHandlers getMoreActionsButton() {
        return moreImage;
    }

    @Override
    public HasClickHandlers getEditButton() {
        return editImage;
    }

    @Override
    public HasClickHandlers getDeleteButton() {
        return deleteImage;
    }

    @Override
    public void setIntroduction(String introduction) {
        this.introduction.setText(introduction);
    }
}
