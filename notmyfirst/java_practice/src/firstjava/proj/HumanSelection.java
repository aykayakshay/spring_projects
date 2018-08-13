package firstjava.proj;

import java.util.Scanner;

public class HumanSelection {
    public void humanselection() {
        Scanner sc = new Scanner(System.in);
        HumanThings h = new HumanThings();

        System.out.println("Hi. You have picked Human Things, choose from the following: ");
        System.out.println("1.Food 2.Air 3. Walks 4.Works 5.Diseases ");
        int input1 = sc.nextInt();
        System.out.println();
        switch (input1) {
            case 1:
                System.out.println("Foods humans eat are categorized as follows:");
                h.EatsFood();
                System.out.println();
                System.out.println("choose the food you want to to know about from:");
                int input2 = sc.nextInt();
                System.out.println();
                switch (input2) {
                    case 0:
                        System.out.println("Fruits: Apples, Apricot, Pear, and Orange");
                        break;
                    case 1:
                        System.out.println("HasMeat: Chicken, Mutton, Sea-Food");
                        break;
                    case 2:
                        System.out.println("NoMeat: Any Vegetable");
                        break;
                }

                break;
            case 2:
                h.BreathesAir();
                break;
            case 3:
                h.CanWalk();
                break;
            case 4:
                h.IsWorking();
                break;
            case 5:
                h.HumanDiseases();
                break;
            default:
                System.out.println("Restrict your choices to the provided options");

        }
    }
}

