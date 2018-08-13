package random.tests.Arrays;

public class ParentClass {
    public void arrayCopy1(int[][] twoD,int[][] twoD1){

        twoD = new int[4][5];
        //twoD1 = new int[4][5];
        int i, j, k = 0;
        for(i=0; i<4; i++)
            for(j=0; j<5; j++) {
                twoD[i][j] = k;
                k++;
            }
        for(i=0; i<4; i++) {
            for(j=0; j<5; j++)
                System.out.print(twoD[i][j] + " ");
            System.out.println();
        }

    }
}
