package random.tests.Arrays;

public class ChildClass extends ParentClass {
    @Override
    public void arrayCopy1(int[][] twoD,int[][] twoD1) {
        twoD1 = twoD.clone();
        System.out.println(twoD1);


        }
    }

