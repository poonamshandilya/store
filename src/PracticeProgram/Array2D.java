package PracticeProgram;

public class Array2D {
    public static void main(String[] args) {
        int arr[][]=null;
        arr=new int[3][2];
       arr[0][0]=10;
       arr[0][1]=20;
       arr[1][0]=30;
       arr[1][1]=40;
       arr[2][0]=50;
       arr[2][1]=60;
        System.out.println("using normal for loop");
        for (int i=0;i< arr.length;i++){
            for (int j=0; j<arr[i].length; j++){
                System.out.println("\t"+arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("\nusing enhansed forlopp");
        for (int ar[]: arr){
            for (int a:ar){
                System.out.println("\t"+a);
            }
            System.out.println();
        }
    }
}
