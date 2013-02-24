package com.trickypig.aperiamus.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;

public class Aperiamus implements EntryPoint, IGameController {

	IClientFactory clientFactory;
	IModeController currentModeController;
	
	public void onModuleLoad() {
		clientFactory = GWT.create(IClientFactory.class);
		clientFactory.setGameController(this);
		
		enterDrillMode(null);
	}
	
	@Override
	public void enterDrillMode(IDrillContent content) {
		if (currentModeController != null){
			currentModeController.exitRequested();
		}
		
		currentModeController = clientFactory.getDrillMode();
		clientFactory.getDrillMode().startNewDrill(null);
	}

	//don't really see a need for this
/*	@Override
	public void requestNewGameMode(IModeController newModeController) {
		
		
		if (newModeController instanceof DrillModeController){
			currentModeController = clientFactory.getDrillMode();
		} 
		
		currentModeController.activate();
	}*/
	
}
