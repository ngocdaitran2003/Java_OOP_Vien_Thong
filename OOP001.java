class Dog{
    private String name;
    private String breed;
    private int age;
    
    public void Dog(){

    }

    public void setName(String name){
        this.name = name;
    }

    // public String getName()

    public void setBreed(String breed){
        this.breed = breed;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void printDogDetail(){
        System.out.println("Name:" + this.name + "--Breed:"+this.breed + "--Age:"+this.age);
    }
}


public class OOP001 {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.setName("Micky");
        myDog.setBreed("Husky");
        myDog.setAge(12);
        myDog.printDogDetail();
    }
}
