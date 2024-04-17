class Animal
{
    public void makesound(String sound)
    {
        System.out.println(sound);
    }
}
class Dog extends Animal
{
    public void makesound()
    {
        System.out.print("Sound by Dog : ");
        super.makesound("Bhoww");
    }
}
class Cat extends Animal
{
    public void makesound()
    {
        System.out.print("Sound by Cat : ");
        super.makesound("Meowww");
    }
}
public class AnimalMain
{
    public static void main(String args[])
    {
        Dog d=new Dog();
        d.makesound();
        Cat c=new Cat();
        c.makesound();
    }
}