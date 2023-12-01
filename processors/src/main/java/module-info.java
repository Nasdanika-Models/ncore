module org.nasdanika.models.ncore.processors {
		
	requires transitive org.nasdanika.ncore;
	requires transitive org.nasdanika.models.ecore.graph;
	requires transitive org.nasdanika.html.model.app.graph;
	
	exports org.nasdanika.models.ncore.processors.doc;
	opens org.nasdanika.models.ncore.processors.doc; // For loading resources
	
	exports org.nasdanika.models.ncore.processors.ecore;
	opens org.nasdanika.models.ncore.processors.ecore; // For loading resources
	
}
