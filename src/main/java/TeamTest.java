public class TeamTest {
    //All other classes are the structure
    //Now we start running the program
    public static void main(String[] args) {

        //These students joins the teams
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        //Create a team
//      Team liverpool = new Team("Liverpool");
        //You can't leave inside of Team empty, because "new" always triggers the constructor
        //And constructor of Team has a String paramater


        //If we don't add T on Team.java and decleare liverpool like down below
        //it accepts any player, But we want to make sure that only SoccerPlayers
        //are added to SoccerTeams

        Team<SoccerPlayer> liverpool = new Team<>("Liverpool");

//        Team<String> brokenTEam = new Team<>("this won't work");
        //Team.java line 3 forbids this line execution

//        liverpool.addPlayer(joe); //gives an error because joe is not a SoccerPlayer
//        liverpool.addPlayer(pat); //gives an error because joe is not a SoccerPlayer
        liverpool.addPlayer(beckham);

        System.out.println(liverpool.numPlayers());
    }
}
