// Animal.java
class Animal 
{
    public void makeSound() 
    {
        System.out.println("Animal makes a sound");
    }
}
// Dog.java
class Dog extends Animal 
{
    public void makeSound() 
    {
        System.out.println("Dog barks");
    }
}
// Cat.java
class Cat extends Animal 
{
    public void makeSound() 
    {
        System.out.println("Cat meows");
    }
}
// Main.java
public class AnimalSound 
{
    public static void main(String[] args) 
    {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        myDog.makeSound();
        myCat.makeSound();
    }
}
