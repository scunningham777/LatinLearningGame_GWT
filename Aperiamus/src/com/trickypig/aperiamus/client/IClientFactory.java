package com.trickypig.aperiamus.client;

public interface IClientFactory {

	public DrillModeController getDrillMode();
	public IGameController getGameController();
	public void setGameController(IGameController gameController);
	public IExperienceTracker getExperienceTracker();
	public IDrillContentGenerator getDrillContentGenerator();
}
