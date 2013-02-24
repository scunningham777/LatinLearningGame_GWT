package com.trickypig.aperiamus.client;

public interface IDrillContentManager {
	public IDrillInstanceContent generateDrillInstanceContent(IDrillContent availableContent, IDrillInstancePresenter currentInstancePresenter);
	public IDrillInstancePresenter getValidDrillPresenter(IDrillContent availableContent);
}
