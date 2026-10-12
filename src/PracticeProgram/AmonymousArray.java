package PracticeProgram;

public class AmonymousArray {
    public static void main(String[] args) {
       /* int arr[]=null;
        arr=new int[]{99,88,66,77};
        for (int i=0;i< arr.length;i++)
        System.out.println(arr[i]);
        show(new int[]{99,88,77,66});
    }
    static void show(int arr[]){
        for (int i=0;i< arr.length;i++)
            System.out.println(arr[i]);*/
        int arr[]={99,88,77,66};
        for (int i:arr)
            System.out.println(i);
        String names[]=new String[]{"SRi", "nivas", "Dande"};
        for (String str : names)
            System.out.println(str);

        char arr2[]={'j','l','c','i','n','d','i','a'};
        for (char ch:arr2)
            System.out.println(ch);
    }
}
