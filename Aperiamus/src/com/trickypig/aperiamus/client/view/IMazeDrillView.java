package com.trickypig.aperiamus.client.view;

import java.util.List;

import com.trickypig.aperiamus.client.IMenuButtonDelegate;

public interface IMazeDrillView {

	void displayIntroScreen(String introText);
	
	void setRemainingRoomCount(int remainingRoomCount);
	void setCurrentScore(int currentScore);		
	void setQuestion(String question);
	void setAnswers(List<String> answers);
	
	// need some setters for passing in the actual display info (background style, characters, etc.), 
	// but I'm not sure what kind of classes I'll use for this, or if I'll just pass IDs and have the view look them up somewhere
	
	void setMenuButtonDelegate(IMenuButtonDelegate menuButtonDelegate);

}
