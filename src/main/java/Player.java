public abstract class Player {
    // We don't want to make an object from this class
    // That's why we made it an abstract class/

    private String name;


    public Player(String name){
        this.name = name;
    }
    //encapsulation - setter

    public String getName(){
        return name;
    }
    //encapsulation - getter

}

