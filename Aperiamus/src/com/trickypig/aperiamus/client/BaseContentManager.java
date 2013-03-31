package com.trickypig.aperiamus.client;

import com.trickypig.aperiamus.client.utils.IDrillResultsDelegate;


public class BaseContentManager implements IDrillContentManager {

	private IClientFactory clientFactory;
	
	public BaseContentManager(IClientFactory clientFactory) {
		this.clientFactory = clientFactory;
	}

	@Override
	public IDrillInstanceContent generateDrillInstanceContent(IDrillContent availableContent, IDrillInstancePresenter currentInstancePresenter) {
		IDrillInstanceContent newInstance = new BaseDrillInstanceContent();
		newInstance.setDrillPresenter(currentInstancePresenter);				//should I do this here, or should presenter inject itself to instance?
		return newInstance;
	}

	@Override
	public IDrillInstancePresenter getValidDrillPresenter(IDrillContent availableContent, IDrillResultsDelegate drillResultsDelegate) {
		return new BaseDrillInstancePresenter(clientFactory.getMazeDrillView(), clientFactory.getDrillTextManager(), drillResultsDelegate);
	}

}
