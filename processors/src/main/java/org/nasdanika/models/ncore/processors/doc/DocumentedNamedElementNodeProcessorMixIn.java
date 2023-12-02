/**
 */
package org.nasdanika.models.ncore.processors.doc;

import org.nasdanika.ncore.DocumentedNamedElement;

public interface DocumentedNamedElementNodeProcessorMixIn<T extends DocumentedNamedElement> extends NamedElementNodeProcessorMixIn<T>, DocumentedNodeProcessorMixIn<T> {

} 
