package MyList;

public class SomeThing {
    private String type;
    private int age;
    private double size;

    public SomeThing(String type, int age, double size) {
        this.type = type;
        this.age = age;
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double isSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
