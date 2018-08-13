package firstjava.proj;

import java.util.Scanner;

public class MainSwitch  {
    public void Switch(){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        switch(input){
            case 1:
                HumanSelection hs = new HumanSelection();
                hs.humanselection();
                break;
            case 2:
                BirdSelection bs =  new BirdSelection();
                bs.birdSelection();
                break;
            case 3:
                AnimalSelection as = new AnimalSelection();
                as.animalselection();
                break;
            default:
                System.out.println("restrict the options to provides choices");

        }
    }
}
