package com.adn.DepInj.SetterInj;

public class TrackCoach implements Coach {

	private String email;
	private String team;
	TrackEquipments trakEquips;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
	
	public void setTrakEquips(TrackEquipments trakEquips) {
		this.trakEquips = trakEquips;
	}

	@Override
	public String DailyWork() {
		return "jog for 2km";
	}

	@Override
	public String getEquipments() {
		return trakEquips.getEquipments();
	}

}
