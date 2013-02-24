package com.trickypig.aperiamus.client;

public interface IDrillInstancePresenter {

	void startDrillInstance(IDrillInstanceContent content);
	void exitRequested();
	
	//all of the following seem like they belong in implementation classes, not in the interface 
	//other classes do not interact with these methods, even if every implmenetation should have them
//	void bindMenuButtons();
//	void presentIntroScreen();
//	void initializeContent(IDrillInstanceContent content);
//	void presentChallenge();				//may not actually be universal - drills like "Troy is Burning" have one continuous "challenge", not a rotating set
//	void displayResults();
//	void recordChallengeResults();
//	void reportDrillResults();
//	void pauseDrill();
//	void resumeDrill();
//	void showMenu();
	
}
