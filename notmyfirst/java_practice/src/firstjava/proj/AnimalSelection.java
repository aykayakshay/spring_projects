package firstjava.proj;

import java.util.Scanner;

public class AnimalSelection {
    public void animalselection(){
        Scanner sc = new Scanner(System.in);
        AnimalThings a = new AnimalThings();
        System.out.println("Hi. You have picked Bird Things, choose from the following: ");
        System.out.println("1.Food 2.Air 3. Walks 4.Life in Zoo  5.Legs ");
        int input1 = sc.nextInt();
        switch (input1) {
                case 1:
                    a.EatsFood();
                    break;
                case 2:
                    a.BreathesAir();
                    break;
                case 3:
                    a.CanWalk();
                    a.Canwalk("leopard");
                    break;
                case 4:
                    a.LiveInZoo();
                    break;
                case 5:
                    a.HasFourLegs();
                    break;
                default:
                System.out.println("Restrict your choices to the provided options");
        }

    }

}
