public class Matriz {
    private int[][] mat;

    public Matriz(int a11, int a12, int b21, int b22){
        mat = new int[2][2];
        mat[0][0] = a11;
        mat[0][1] = a12;
        mat[1][0] = b21;
        mat[1][1] = b22;
    }

    public int determinante(){
        int det = mat[0][0] * mat[1][1] - mat[0][1] * mat[1][0];
        return det;
    }

    public void imprimir(){
        System.out.printf("[%d, %d]\n", mat[0][0], mat[0][1]);
        System.out.printf("[%d, %d]\n", mat[1][0], mat[1][1]);
    }
}
