package com.adn.DepInj.SetterInj;

public class CricketCoach implements Coach {

	private String emailAddress;
	private String team;
	CricketEquipments crikEquips;
	
	

	public CricketCoach() {}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public void setCrikEquips(CricketEquipments crikEquips) {
		this.crikEquips = crikEquips;
	}


	@Override
	public String DailyWork() {
		return "Practice Bouncer For 2 hrs";
	}

	@Override
	public String getEquipments() {
		return crikEquips.getEquipments();
	}

}
