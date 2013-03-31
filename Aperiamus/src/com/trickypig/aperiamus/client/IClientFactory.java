package com.trickypig.aperiamus.client;

import com.trickypig.aperiamus.client.view.IMazeDrillView;

public interface IClientFactory {

	public DrillModeController getDrillMode();
	public IGameController getGameController();
	public void setGameController(IGameController gameController);
	public IExperienceTracker getExperienceTracker();
	public IDrillContentGenerator getDrillContentGenerator();
	public ITextManager getDrillTextManager();
	public IMazeDrillView getMazeDrillView();
}
