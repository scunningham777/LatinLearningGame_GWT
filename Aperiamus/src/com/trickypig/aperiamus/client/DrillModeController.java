package com.trickypig.aperiamus.client;

public class DrillModeController implements IDrillModeController{

	private IClientFactory clientFactory;
	private IDrillContentManager contentManager;
	private IDrillInstanceContent curInstance;
	
	public DrillModeController(IClientFactory clientFactory) {
		this.clientFactory = clientFactory;
	}

	@Override
	public void startNewDrill(IDrillContent availableContent) {
		if (availableContent == null) {
			availableContent = clientFactory.getDrillContentGenerator().obtainNewDrillSessionContent();
		}
		getContentManager().storeDrillContent(availableContent);
		
		curInstance = getContentManager().generateDrillInstanceContent();
		curInstance.getDrillPresenter().startDrillInstance(curInstance);			//errm, that seems ugly!!
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
