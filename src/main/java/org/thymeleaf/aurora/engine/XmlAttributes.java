/*
 * =============================================================================
 *
 *   Copyright (c) 2011-2014, The THYMELEAF team (http://www.thymeleaf.org)
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 * =============================================================================
 */
package org.thymeleaf.aurora.engine;

/**
 *
 * @author Daniel Fern&aacute;ndez
 * @since 3.0.0
 *
 */
public class XmlAttributes extends Attributes {



    protected XmlAttributes() {
        super();
    }



    @Override
    protected Attribute createAttributeInstance() {
        return new XmlAttribute();
    }





    static final class XmlAttribute extends Attribute {

        XmlAttributeDefinition definition = null;


        /*
         * Before modifying: see notes on parent Attribute class
         */


        XmlAttribute() {
            super();
        }


        @Override
        public void setAttributeDefinition(final AttributeDefinition attributeDefinition) {
            if (attributeDefinition == null) {
                throw new IllegalArgumentException("Attribute definition cannot be null");
            }
            if (!(attributeDefinition instanceof XmlAttributeDefinition)) {
                throw new IllegalArgumentException(
                        "Attribute definition for an XML attribute should be of type " + XmlAttributeDefinition.class.getName());
            }
            this.definition = (XmlAttributeDefinition) attributeDefinition;
        }


        @Override
        public XmlAttributeDefinition getDefinition() {
            return this.definition;
        }

    }


}
