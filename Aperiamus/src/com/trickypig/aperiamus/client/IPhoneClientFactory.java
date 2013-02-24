package com.trickypig.aperiamus.client;

public class IPhoneClientFactory implements IClientFactory {

	DrillModeController drillMode;
	IGameController gameController;
	IExperienceTracker experienceTracker;
	BaseDrillContentGenerator drillContentGenerator;
	
	@Override
	public DrillModeController getDrillMode() {
		if (drillMode == null){
			drillMode = new DrillModeController(this);
		}
		return drillMode;
	}

	@Override
	public IGameController getGameController() {
		return gameController;
	}

	@Override
	public void setGameController(IGameController gameController) {
		this.gameController = gameController;
	}

	@Override
	public IExperienceTracker getExperienceTracker() {
		if (experienceTracker == null){
			experienceTracker = new BaseExperienceTracker();
		}
		return experienceTracker;
	}

	@Override
	public IDrillContentGenerator getDrillContentGenerator() {
		if (drillContentGenerator == null){
			drillContentGenerator = new BaseDrillContentGenerator(this);
		}
		return drillContentGenerator;
	}
	

}
