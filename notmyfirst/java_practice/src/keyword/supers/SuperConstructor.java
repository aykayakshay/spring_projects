package keyword.supers;
    class SuperConstructor
    {
        SuperConstructor()
        {
            System.out.println("SuperConstructor class Constructor");
        }
    }

    /* subclass Student extending the SuperConstructor class */
    class Student1 extends SuperConstructor
    {
        Student1()
        {
            super();

            System.out.println("Student class Constructor");
        }
    }
    class Test2
    {
        public static void main(String[] args)
        {
            Student1 s = new Student1();
        }
    }
