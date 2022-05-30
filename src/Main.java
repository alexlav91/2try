import MyList.*;

public class Main {
    public static void main(String[] args) {

        //Compare to
        User user1 = new User("Vasia", 20, 100);
        User user2 = new User("Petr", 25, 195);
        User user3 = new User("Nick", 25, 190);
        User user4 = new User("Den", 25, 180);

        //My list impl
        MyList<User> myList = new MyList<User>();
        myList.add(user1);
        myList.add(user2);
        myList.add(user3);
        myList.add(user4);

        myList.sort();

        for (Object o: myList) {
            System.out.println(o);
        }
    }
}
