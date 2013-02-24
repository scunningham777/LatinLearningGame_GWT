package com.trickypig.aperiamus.client;

public class BaseDrillInstanceContent implements IDrillInstanceContent {

	private IDrillInstancePresenter presenter;
	
	@Override
	public IDrillInstancePresenter getDrillPresenter() {
		return presenter;
	}

	@Override
	public void setDrillPresenter(IDrillInstancePresenter presenter) {
		this.presenter = presenter;
	}

}
