package com.trickypig.aperiamus.client;

import com.trickypig.aperiamus.client.utils.IDrillResultsDelegate;

public interface IDrillContentManager {
	public IDrillInstanceContent generateDrillInstanceContent(IDrillContent availableContent, IDrillInstancePresenter currentInstancePresenter);
	public IDrillInstancePresenter getValidDrillPresenter(IDrillContent availableContent, IDrillResultsDelegate drillResultsDelegate);
}
