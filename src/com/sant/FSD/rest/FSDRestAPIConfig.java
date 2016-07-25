package com.sant.FSD.rest;

import org.glassfish.jersey.server.ResourceConfig;

public class FSDRestAPIConfig extends ResourceConfig {

	public FSDRestAPIConfig() {
		packages("com.sant.FSD.rest.resources");
	}
}
