


@VeryImportant
public class Cat {

    String name;
    int age;

    public Cat(String name) {
        this.name =name;
    }

    public Cat(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("meow");
    }

    public void  munch(){
        System.out.println("Crunch");
    }
}
