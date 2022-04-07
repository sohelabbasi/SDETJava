package collection;

public class Array2D {

    public static void main(String[] args) {
        int [][] ibm = new int[3][3];

        ibm[0][0] = 11;
        ibm[0][1] = 11;
        ibm[0][2] = 11;
        ibm[1][0] = 11;
        ibm[1][1] = 11;
        ibm[1][2] = 11;
        ibm[2][0] = 11;
        ibm[2][1] = 11;
        ibm[2][2] = 11;

        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print(ibm[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
