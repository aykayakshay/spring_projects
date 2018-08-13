package hacker_rank.Day4;

public class Day4 {

        private int age;
        public Day4(int initialAge) {
            // Add some more code to run some checks on initialAge
            this.age = initialAge;
            if (initialAge < 0){
                this.age = 0;
                System.out.println("Age is not valid, setting age to 0..");
            }
        }

        public void amIOld() {
            if(this.age < 13)
            // Write code determining if this person's age is old and print the correct statement:
            System.out.println("You are young..");
            else if (this.age >= 13 & this.age < 18 )
                System.out.println("You are a teenager..");
            else
                System.out.println("You are old.");

        }

        public void yearPasses() {
            this.age++;
            // Increment this person's age.
        }

}
