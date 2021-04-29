package com.summitthai.tennis.legacy01;

public class Tennis {

	private String player1;
	private String player2;
	private int player1Point;
	private int player2Point;
	private String[] scoreName;
	
	public Tennis(String player1,String player2) {
		this.player1 = player1;
		this.player2 = player2;
		this.player1Point = 0;
		this.player2Point = 0;
		this.scoreName = new String[] { "love", "fifteen", "thirty", "forty" };
		System.out.println("Begin Game "+player1+" vs "+player2);
	}

	public String getPlayer1() {
		return player1;
	}

	public void setPlayer1(String player1) {
		this.player1 = player1;
	}

	public String getPlayer2() {
		return player2;
	}

	public void setPlayer2(String player2) {
		this.player2 = player2;
	}
	
	public void addPlayer1Point() {
		this.player1Point+=1;
		System.out.println(caculateScore());
	}
	
	public void addPlayer2Point() {
		this.player2Point+=1;
		System.out.println(caculateScore());
	}
	
	public String caculateScore() {
		if (player1Point == player2Point) {
			return deuce();
		}else if (player1Point > 3 || player2Point > 3) {
			return winOrAdvantage();
		}else {
			return ongoing();
		}
	}

	private String deuce() {
		if (player1Point < 3) {
			return player1+ " "+ scoreName[player1Point] + " : " + player2 + " "+ scoreName[player2Point]; 
		}else {
			return "deuce";
		}
	}

	private String winOrAdvantage() {
		if (player1Point - player2Point >= 2) {
			return win();
		}else{
			return advantage();
		}
	}

	private String win() {
		if (player1Point > player2Point) {
			return "!!! "+ player1+" win game !!!" ;
		}else {
			return "!!! "+ player2+" win game !!!";
		}
	}

	private String advantage() {
		if (player1Point > player2Point) {
			return "player1 advantage";
		}else {
			return  "player2 advantage";
		}
	}

	private String ongoing() {
		return player1+ " "+ scoreName[player1Point] + " : " + player2 + " "+ scoreName[player2Point];
	}
	
	public int getPlayer1Point() {
		return player1Point;
	}

	public void setPlayer1Point(int player1Point) {
		this.player1Point = player1Point;
	}

	public int getPlayer2Point() {
		return player2Point;
	}

	public void setPlayer2Point(int player2Point) {
		this.player2Point = player2Point;
	}

	public static void main(String[] args) {
		Tennis t = new Tennis("Federer", "Nadal");
		t.addPlayer1Point();
		t.addPlayer1Point();
		t.addPlayer1Point();
		t.addPlayer2Point();
		t.addPlayer1Point();
	}
	
	
}