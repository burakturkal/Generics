import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<Integer> items = new ArrayList<>();

        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        //items.add("apple"); //If you don't put <Integer> after ArrayList above this will give an
                            // error when you execute, because you can't convert/cast a String into and an Integer

        printDouble(items);

    }

    private static void printDouble(ArrayList<Integer> items) {

        //BELOW: is if we were not to add <Integer> after <ArrayList> in the definition above and also
        //in the method definition here

        //RULE:
        // There is Integer in the List and you can't multiply that
        // Since it is not primitive
        // So either put Object + Integer or just "int" to case (Look below)

        //NOT ALLOWED

//        for(i : item){
//            System.out.println(i*2);
//        }

        //ALLOWED

//        for(Object i : items){
//            System.out.println((Integer) i * 2);


        for (int i:items){
            System.out.println(i*2);
        }
    }
}
