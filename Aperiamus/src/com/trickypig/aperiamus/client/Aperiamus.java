package com.trickypig.aperiamus.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.trickypig.aperiamus.client.utils.IDrillResultsDelegate;

public class Aperiamus implements EntryPoint, IGameController, IDrillResultsDelegate {

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
		clientFactory.getDrillMode().startNewDrill(null, this);
	}

	@Override
	public void recordDrillResults(IDrillResults drillResults) {
		// TODO Auto-generated method stub
		
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
