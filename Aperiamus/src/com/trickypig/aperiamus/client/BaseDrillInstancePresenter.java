package com.trickypig.aperiamus.client;

import com.google.gwt.user.client.Window;

public class BaseDrillInstancePresenter implements IDrillInstancePresenter {
	
	private IClientFactory clientFactory;
	private IDrillInstanceContent curInstanceContent;
	private IDrillResults drillResults;
	private IResponseEvaluator responseEvaluator;
	private IDrillChallenge currentChallenge;
	private boolean isCurrentChallengeInitialized = false;

	public BaseDrillInstancePresenter(IClientFactory clientFactory) {
		this.clientFactory = clientFactory;
	}

	@Override
	public void startDrillInstance(IDrillInstanceContent content) {
		curInstanceContent = content;
		Window.alert("Drill Instance started by BaseDrillInstancePresenter");
		
		presentIntroScreen();
		drillResults = initializeDrillResults();
		responseEvaluator = initializeResponseEvaluator();
		currentChallenge = generateNewChallenge();
		
	}

	protected void presentIntroScreen() {
		// TODO Auto-generated method stub
		
	}

	protected IDrillResults initializeDrillResults() {
		// TODO Auto-generated method stub
		return null;
	}

	protected IResponseEvaluator initializeResponseEvaluator() {
		// TODO Auto-generated method stub
		return null;
	}

	protected IDrillChallenge generateNewChallenge() {
		// TODO Auto-generated method stub
		isCurrentChallengeInitialized = true;
		return null;
	}

	@Override
	public void exitRequested() {
		// TODO Auto-generated method stub

	}

}
