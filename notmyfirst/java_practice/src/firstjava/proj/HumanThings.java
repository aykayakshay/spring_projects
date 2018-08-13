package firstjava.proj;
enum Food{
    Fruits, HasMeat, NoMeat
}


// out of bounds
public class HumanThings implements LivingThingsCommon{
    public void EatsFood(){
        try {
            Food f[] = Food.values();
            for (int i = 0; i < f.length + 1; i++)
                System.out.println(f[i].ordinal() + "." + f[i]);
        }
        catch(Exception e){
            System.out.println("exception handle is " + e);
        }
    }
    public void BreathesAir(){
        System.out.println("lives on oxygen");
    }
    public void CanWalk(){
        System.out.println("walks on two legs");
    }
    public void IsWorking(){
        System.out.println("has to earn his food");
    }
    public void HumanDiseases(){
        System.out.println("every once in a while gets sick with human affecting diseases");
    }
}


