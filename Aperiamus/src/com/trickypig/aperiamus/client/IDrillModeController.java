package com.trickypig.aperiamus.client;

public interface IDrillModeController extends IModeController {
	public void startNewDrill(IDrillContent availableContent);
	public void restartCurrentDrill();
	public void requestNewDrillContent();
	public void requestNewDrillModule();
}
