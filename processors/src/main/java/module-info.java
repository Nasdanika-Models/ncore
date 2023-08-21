module org.nasdanika.models.ncore.processors {
		
	requires transitive org.nasdanika.ncore;
	requires transitive org.nasdanika.models.ecore.graph;
	
	exports org.nasdanika.models.ncore.processors;
	opens org.nasdanika.models.ncore.processors; // For loading resources
	
}
