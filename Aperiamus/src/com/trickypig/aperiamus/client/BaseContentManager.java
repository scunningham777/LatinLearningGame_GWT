package com.trickypig.aperiamus.client;

public class BaseContentManager implements IDrillContentManager {

	private IClientFactory clientFactory;
	private IDrillContent currentDrillContent;
	
	public BaseContentManager(IClientFactory clientFactory) {
		this.clientFactory = clientFactory;
	}

	@Override
	public void storeDrillContent(IDrillContent content) {
		currentDrillContent = content;
	}

	@Override
	public IDrillInstanceContent generateDrillInstanceContent() {
		IDrillInstanceContent newInstance = new BaseDrillInstanceContent();
		newInstance.setDrillPresenter(new BaseDrillInstancePresenter(clientFactory));
		return newInstance;
	}

}
