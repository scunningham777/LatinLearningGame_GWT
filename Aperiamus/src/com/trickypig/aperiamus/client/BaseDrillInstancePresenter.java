package com.trickypig.aperiamus.client;

import com.google.gwt.user.client.Window;
import com.trickypig.aperiamus.client.utils.IDrillResultsDelegate;
import com.trickypig.aperiamus.client.view.IMazeDrillView;

public class BaseDrillInstancePresenter implements IDrillInstancePresenter {
	
//	private IClientFactory clientFactory;
	private IDrillInstanceContent curInstanceContent;
	private IDrillResults drillResults;
	private IResponseEvaluator responseEvaluator;
	private IDrillChallenge currentChallenge;
	private boolean isCurrentChallengeInitialized = false;
	private IMazeDrillView drillView;
	private ITextManager textManager;
	private IDrillResultsDelegate drillResultsDelegate;

	public BaseDrillInstancePresenter(IMazeDrillView drillView, ITextManager textManager, IDrillResultsDelegate drillResultsDelegate) {
		this.drillView = drillView;
		this.textManager = textManager;
		this.drillResultsDelegate = drillResultsDelegate;
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
		drillView.displayIntroScreen(textManager.getBaseDrillIntroText());
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
