/**
 */
package org.nasdanika.models.ncore.processors.doc;

import org.nasdanika.ncore.DocumentedNamedStringIdentity;

public interface DocumentedNamedStringIdentityNodeProcessorMixIn<T extends DocumentedNamedStringIdentity> extends DocumentedNamedElementNodeProcessorMixIn<T>, StringIdentityNodeProcessorMixIn<T> {
	
} 
