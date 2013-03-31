package com.trickypig.aperiamus.client;

import com.trickypig.aperiamus.client.utils.IDrillResultsDelegate;

public class DrillModeController implements IDrillModeController{

	private IClientFactory clientFactory;
	private IDrillContentManager contentManager;
	private IDrillContent currentDrillContent;
	private IDrillInstanceContent currentInstance;
	
	
	public DrillModeController(IClientFactory clientFactory) {
		this.clientFactory = clientFactory;
	}

	@Override
	public void startNewDrill(IDrillContent availableContent, IDrillResultsDelegate drillResultsDelegate) {
		if (availableContent == null) {
			availableContent = clientFactory.getDrillContentGenerator().obtainNewDrillSessionContent();			//is this ok?
		}
//		getContentManager().storeDrillContent(availableContent);
		setCurrentDrillContent(availableContent);
		
		IDrillInstancePresenter currentInstancePresenter = getContentManager().getValidDrillPresenter(availableContent, drillResultsDelegate);
		currentInstance = getContentManager().generateDrillInstanceContent(availableContent, currentInstancePresenter);
		currentInstancePresenter.startDrillInstance(currentInstance);			
	}

	private void setCurrentDrillContent(IDrillContent availableContent) {
		this.currentDrillContent = availableContent;
	}

	private IDrillContentManager getContentManager() {
		if (contentManager == null) {
			contentManager = new BaseContentManager(clientFactory);
		}
		return contentManager;
	}

	@Override
	public void restartCurrentDrill() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void requestNewDrillContent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void requestNewDrillModule() {
		// TODO Auto-generated method stub
		
	}

	//called by IGameController when a switch to this mode is requested
	@Override
	public void activate() {
		// TODO Auto-generated method stub
		
	}

	//called by IGameController when a switch away from this mode is requested
	@Override
	public void exitRequested() {
		// TODO Auto-generated method stub
		
	}

}
