package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
      /*  FootballPlayer adelaideCrows=new FootballPlayer("sanjay");
        BaseballPlayer baseballPlayer=new BaseballPlayer("Luci");
        SoccerPlayer soccerPlayer=new SoccerPlayer("Prince");


        baseballPlayerTeam.addPlayer(baseballPlayer);


        //starting..
        Team<FootballPlayer> melbourne=new Team<>("Melbourne");
        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle=new Team<>("frmantle");

        hawthorn.matchResult(fremantle,1,4);
        hawthorn.matchResult(melbourne,3,0); */

        League<Team<FootballPlayer>> footballLeague=new League<>("Afl");
        Team<FootballPlayer> adelaideCrows = new Team<>("adelideCrows");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> hawthrone = new Team<>("Hawthrone");
        Team<FootballPlayer> fremantle=new Team<>("Fremantle");



        League<Team<BaseballPlayer>> baseballLeague = new League<>("BFL");
        Team<BaseballPlayer> baseballPlayerTeam=new Team("neruStadium");


        footballLeague.add(adelaideCrows);
        footballLeague.add(melbourne);
        footballLeague.add(hawthrone);
        footballLeague.add(fremantle);
        footballLeague.ScoreBoard();
        hawthrone.matchResult(fremantle,5,8);
        hawthrone.matchResult(melbourne,9,4);


    }
}
