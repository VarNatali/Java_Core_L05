package ua.lviv.lga.task02;

public class Example {
    String name;
    int age;
    int growth;


    public Example(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Example(String name, int age, int growth) {
        this(name,age);
        this.growth = growth;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getGrowth() {
        return growth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrowth(int growth) {
        this.growth = growth;
    }


    public void info() {
        System.out.println(" name = "+name+" age  = "+age+" grotwth  = "+growth);
    }
}
