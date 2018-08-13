package firstjava.proj;

import java.util.Scanner;

public class BirdSelection {
    public void birdSelection() {
        Scanner sc = new Scanner(System.in);
        BirdThings b = new BirdThings();
        System.out.println("Hi. You have picked Bird Things, choose from the following: ");
        System.out.println("1.Food 2.Air 3. Walks 4.Fly 5.Little ");
        int input1 = sc.nextInt();
        switch (input1) {
            case 1:
                b.EatsFood();
                break;
            case 2:
                b.BreathesAir();

                break;
            case 3:
                b.CanWalk();
                break;
            case 4:
                System.out.println("flying distance everyday in miles");
                System.out.println();
                b.CanFly();
                break;
            case 5:
                System.out.println("Guess the smallest bird in two tries ; Eagle, Crow, Kingfisher");
                int count = 0;
                String s2;
                do {
                    s2 = sc.next();
                    count++;
                    b.AreLittle(s2);
                }
                while (!(s2.equals("Crow")) && (count <2));
                System.out.println();
                if(count == 2 ){
                    System.out.println("you lose, the bird was Crow.");
                }
                break;
            default:
                System.out.println("Restrict your choices to the provided options");
        }
    }
}
