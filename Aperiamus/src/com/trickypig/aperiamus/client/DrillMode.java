package com.trickypig.aperiamus.client;

public class DrillMode {

	DrillSessionInfo curDrillSessionInfo;
	DrillSeriesInfo curDrillSeriesInfo;
	DrillInstanceInfo curDrillInstanceInfo;
	IDrillPresenter curDrillPresenter;
	
	//is this the right method name? right method at all? How do I want this process to flow?
	public void startDrillSession(DrillSessionInfo curDrillSessionInfo) { 
		this.curDrillSessionInfo = curDrillSessionInfo;
		this.curDrillSeriesInfo = this.curDrillSessionInfo.generateRandomSeriesInfo();
		this.curDrillInstanceInfo = this.curDrillSeriesInfo.generateRandomInstanceInfo();
		this.curDrillPresenter = this.curDrillInstanceInfo.getDrillPresenter();
		curDrillPresenter.startNewDrillInstance(curDrillInstanceInfo);				//does this seem right?
	}

}
