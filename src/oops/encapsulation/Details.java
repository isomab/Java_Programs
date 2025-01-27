package oops.encapsulation;

public class Details {
    private String name;
    private int age;
    private String college;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    @Override
    public String toString() {
        return "Details{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", college='" + college + '\'' +
                '}';
    }
}
