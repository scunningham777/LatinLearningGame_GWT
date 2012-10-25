package com.trickypig.aperiamus.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;

public class Aperiamus implements EntryPoint {

	ClientFactory clientFactory;
	DrillSessionInfo curDrillSessionInfo;
	
	public void onModuleLoad() {
		clientFactory = GWT.create(clientFactory.getClass());
		
		enterDrillMode();
	}
	
	void enterDrillMode() {
		if (curDrillSessionInfo == null) {
			curDrillSessionInfo = clientFactory.getLibrary().getNewDrillSessionInfo();
		}
		clientFactory.getDrillMode().startDrillSession(curDrillSessionInfo);
	}
}
