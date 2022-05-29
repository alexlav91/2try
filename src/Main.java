import MyList.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    //Compare to

        User user1 = new User("Tition",20, 100);
        User user2 = new User("Jeime",25, 195);
        user1.compareTo(user2);


        //My list impl
        MyList myList = new MyList();
        myList.add("Vasya");
        myList.add("Petya");


        for (Object o:
                myList) {
            System.out.println(o);
        }




    }
}
