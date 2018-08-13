package firstjava.proj;

public class AnimalThings extends HumanThings implements LivingThingsCommon{
    @Override
    public void CanWalk() {
        System.out.println("walks on four legs");
    }
    @Override
    public void EatsFood(){
        System.out.println("eats meat, eats grass");
    }
    public void Canwalk(String s){
        System.out.println("the animal is " + s );
    }

    public void LiveInZoo(){
        System.out.println("animal are put in zoo for public viewing");
    }
    public void HasFourLegs(){
        System.out.println("walks or runs on four legs");
    }
}
