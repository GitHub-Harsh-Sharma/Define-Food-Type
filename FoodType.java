import java.util.*;
class FoodType
{
    public void food()
    {
        System.out.println("Eat all kind of food");
    }
}

class Herbivorus extends FoodType
{
    public void food()
    {
        System.out.println("Eat only veg");
    }
}


class Carnivorus extends FoodType
{
    public void food()
    {
        System.out.println("Eat only flash");
    }
}

class Omnivorus extends FoodType
{
  
}

class MainClass
{
    public static void main(String args[])
    {
        Herbivorus h= new Herbivorus();
        h.food();
    
    
        Carnivorus c=new Carnivorus();
        c.food();
    
        Omnivorus o=new Omnivorus();
        o.food();
    }
}