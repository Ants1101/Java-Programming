public class Week8Task7 {
    public static void main(String[]args){
    //Create an array
    float[]mylist =new float[5];
    //Initialize array with random values
    for(int i=1;i<mylist.length;i++){
        mylist[i]=(float)Math.random()*10;
    }
    //Display an array
    for(int i =0;i<mylist.length;i++){
        System.out.print(mylist[i]+" ");
    }
    //Find the largest element
    float max =mylist[0];
    int index0fMax =0;
    for(int i=1;i<mylist.length;i++){
        if(mylist[i]>max){
            max =mylist[i];
            index0fMax =i;
        }
    }
    System.out.println();
    System.out.println("Largest element in the array is: "+max);
    System.out.println("The index of the largest element: "+index0fMax);
    }
}