import java.util.ArrayList;
import java.util.Scanner;

public class Matrix {
    public static final int MATRIX_LENGTH=5;
    public static int numberOfNonZeroValues(int[][] matrix){
        int db=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                if(matrix[i][j]!=0) db++;
            }
        }
        return db;
    }
    public static ArrayList<Integer> indexOfColumnsWithSameValues(int[][] matrix){
        ArrayList<Integer> index = new ArrayList<>();
        int number;
        boolean x;
        for (int i=0;i<matrix.length;i++) {
            for (int j=0;j<matrix.length;j++) {
                x=false;
                number=matrix[i][j];
                if(number==matrix[i][j]){
                    x=true;
                    break;
                }
                if(x==true) index.add(i);
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[][] matrix={{  0,  67,  22,   0,  95},
                        { 72,   0,   0, -88,   0},
                        {  0, -79,   0,   0, -97},
                        {  0,   0, -13, -19,   0},
                        {  0,  89,  95,   0,   0}};
        System.out.println("Nem null elemek száma: "+numberOfNonZeroValues(matrix));
        System.out.println("Egyforma oszlopok indexei: "+indexOfColumnsWithSameValues(matrix));
        Team team=new Team();
        Scanner scanner=new Scanner(System.in);
        System.out.print("Új csapattag neve: ");team.newMember(scanner.next());
        System.out.println(team.getMembers());
    }
}
