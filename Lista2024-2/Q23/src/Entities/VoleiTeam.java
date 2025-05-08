package Entities;

public class VoleiTeam {

	private int num;
	private String player;
	
	public VoleiTeam() {
	}
	
	public VoleiTeam(String player, int num) {
		this.player = player;
		this.num = num;
	}
	
	public void setPlayer(String player) {
		this.player = player;
	}
	
	public String getPlayer() {
		return player;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public String toString() {
		return player + " - " + num;
	}
}
