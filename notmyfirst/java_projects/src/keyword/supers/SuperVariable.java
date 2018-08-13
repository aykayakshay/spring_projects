package keyword.supers;

public class SuperVariable {
            int maxSpeed = 120;
        }

        /* sub class Car extending vehicle */
        class Car extends SuperVariable
        {
            int maxSpeed = 180;

            void display()
            {
                /* print maxSpeed of base class (vehicle) */
                System.out.println("Maximum Speed: " + super.maxSpeed);
            }
        }

        class Test
        {
            public static void main(String[] args)
            {
                Car small = new Car();
                small.display();
            }
        }