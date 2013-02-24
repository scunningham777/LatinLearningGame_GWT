package com.trickypig.aperiamus.client;

import com.google.gwt.user.client.Window;

public class BaseDrillInstancePresenter implements IDrillInstancePresenter {
	
	private IClientFactory clientFactory;
	private IDrillInstanceContent curInstanceContent;
	private IDrillResults drillResults;
	private IResponseEvaluator responseEvaluator;
	private IDrillChallenge currentChallenge;
	private boolean isCurrentChallengeInitialized = false;
	private IDrillView drillView;

	public BaseDrillInstancePresenter(IClientFactory clientFactory) {
		this.clientFactory = clientFactory;
		this.drillView = clientFactory.getBaseDrillView();				//this will allow me to have "classes" of Presenters, each with its own View class, which it could request specifically from the ClientFactory
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
		drillView.displayIntroScreen(clientFactory.getTextManager().getBaseDrillIntroText());
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
