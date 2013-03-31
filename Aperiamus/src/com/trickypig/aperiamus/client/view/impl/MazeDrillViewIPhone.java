package com.trickypig.aperiamus.client.view.impl;

import java.util.List;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.trickypig.aperiamus.client.IMenuButtonDelegate;
import com.trickypig.aperiamus.client.view.IMazeDrillView;

public class MazeDrillViewIPhone extends Composite implements IMazeDrillView {

	private static MazeDrillViewIPhoneUiBinder uiBinder = GWT.create(MazeDrillViewIPhoneUiBinder.class);

	interface MazeDrillViewIPhoneUiBinder extends UiBinder<Widget, MazeDrillViewIPhone> {
	}

	public MazeDrillViewIPhone() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public void displayIntroScreen(String introText) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setRemainingRoomCount(int remainingRoomCount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setCurrentScore(int currentScore) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setQuestion(String question) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setAnswers(List<String> answers) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setMenuButtonDelegate(IMenuButtonDelegate menuButtonDelegate) {
		// TODO Auto-generated method stub
		
	}

}
