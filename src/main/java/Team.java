import java.util.ArrayList;

public class Team<T extends SoccerPlayer> { //CALLED: TYPE SAFETY :: Player class doesn't have it f.e.
    //<T> makes a type checking
    //we used extends to make sure that it doesn't take just ANY type
    //It must be from Player class

    private String name; //team name; soccer, baseball etc

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name){ //constructor
        this.name = name;
        //this represents the object you create. because you can have multiple objects and they will have
        //different names. That's why we use this, because we don't know its/their name/s
    }

    public String getName(){
        return name;
    }

    public boolean addPlayer(T player){
        if(members.contains(player)){
            System.out.println(player.getName() + " is already on this team");
            //you have to do casting here because you used T
            return false;
        }else{
            members.add(player);
            System.out.println(player.getName() + " picked for team " + this.name);
            return true;
        }
    }

    public int numPlayers(){ //method to get get the team size

        return this.members.size(); //refers to ArrayList.size()
    }
}
