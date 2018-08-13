package keyword.supers;
    class SuperClass
    {
        void message()
        {
            System.out.println("This is person class");
        }
    }
    class Student extends SuperClass
    {
        void message()
        {
            System.out.println("This is student class");
        }
        void display()
        {
            message();
            super.message();
        }
    }
    class Test1
    {
        public static void main(String args[])
        {
            Student s = new Student();
            s.display();
        }
    }


