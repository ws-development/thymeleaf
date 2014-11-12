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
public class XmlPrefixedElementName extends XmlElementName {

    final String prefix;
    final String completeNamespacedElementName;
    final String[] completeElementNames;






    XmlPrefixedElementName(final String prefix, final String elementName) {

        super(elementName);

        if (prefix == null || prefix.length() == 0) {
            throw new IllegalArgumentException("Element prefix cannot be null or empty");
        }

        this.prefix = prefix;

        this.completeNamespacedElementName = prefix + ":" + elementName;
        this.completeElementNames = new String[] { this.completeNamespacedElementName };

    }


    @Override
    public boolean isPrefixed() {
        return true;
    }


    public String getPrefix() {
        return this.prefix;
    }


    public String getCompleteNamespacedElementName() {
        return this.completeNamespacedElementName;
    }

    @Override
    public String[] getCompleteElementNames() {
        return this.completeElementNames;
    }



    @Override
    public String toString() {
        return "{" + this.completeNamespacedElementName + "}";
    }

}
