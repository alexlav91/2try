package MyList;

public class User implements Comparable <User> {

    private String name;
    private int age;
    private int height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public User() {

    }



    public User(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    @Override
    public int compareTo(User u) {
        if(u.height > this.height){
            System.out.println(u.name + "Выше чем " + this.name);
            return 1;
        }else if(u.height < this.height){
            System.out.println(u.name + "Ниже чем " + this.name);
            return -1;
        }else{
            System.out.println(u.name + " Эквивалентен " + this.name);
            return 0;
        }

    }
    @Override
    public java.lang.String toString() {
        return "Name: "+ name+ ", Age: "+ age+ ", Height: "+ height;
    }


}
