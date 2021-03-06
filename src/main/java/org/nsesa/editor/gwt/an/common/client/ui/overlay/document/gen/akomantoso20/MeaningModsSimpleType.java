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

/**
 * The simple type MeaningMods lists all the types of modifications in meaning as values for the type attribute of the meaningMod element.* This file is generated. Rather than changing this file, correct the template called <tt>overlayEnum.ftl</tt>.
 */
public enum MeaningModsSimpleType {

// FIELDS ------------------

    VARIATION("variation"),
    TERMMODIFICATION("termModification"),
    AUTHENTICINTERPRETATION("authenticInterpretation");
    private final String value;

    /**
     * Create an instance of MeaningModsSimpleType class with the given String
     */
    MeaningModsSimpleType(String v) {
        value = v;
    }

    /**
     * Return the value of the instance
     *
     * @return value as String
     */
    public String value() {
        return value;
    }

    /**
     * Return an Enum based on the given input text or null if it does not fit
     *
     * @param text the String representation of the enum
     * @return MeaningModsSimpleType or <code>null</code>
     */
    public static MeaningModsSimpleType fromString(String text) {
        if (text == null) return null;
        for (MeaningModsSimpleType en : MeaningModsSimpleType.values()) {
            if (text.equalsIgnoreCase(en.value())) {
                return en;
            }
        }
        return null;
    }
}
