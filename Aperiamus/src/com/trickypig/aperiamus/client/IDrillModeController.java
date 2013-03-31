package com.trickypig.aperiamus.client;

import com.trickypig.aperiamus.client.utils.IDrillResultsDelegate;

public interface IDrillModeController extends IModeController {
	public void startNewDrill(IDrillContent availableContent, IDrillResultsDelegate drillResultsDelegate);
	public void restartCurrentDrill();
	public void requestNewDrillContent();
	public void requestNewDrillModule();
}
