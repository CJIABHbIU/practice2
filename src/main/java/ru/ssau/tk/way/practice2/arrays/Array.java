package ru.ssau.tk.way.practice2.arrays;

public class Array {
    int[] arr;
    int i;
    public int[] arr1 (int a){
       return new int[a];
    }

    public int[] arr3 (int a){
        arr = new int[a];
        for(i=0; i<a; i++){
            arr[i]=2*i+1;
        }
        return arr;
    }

    public int[] arr2 (int a){
        arr = new int[a];
        arr[0]=arr[a-1]=2;
        for (i=1; i<a-1; i++){
            arr[i]=1;
        }
        return arr;
    }

    public int[] arr4(int a){
        arr = new int[a];
        for (i=0;i<a;i++){
            arr[i]=(a-i)*2;
        }
        return arr;
    }

    public int[] arr5(int a){
        arr= new int[a];
        arr[0]=0;
        arr[1]=1;
        for(i=2; i<a; i++){
            arr[i] = arr[i-1]+arr[i-2];
        }
        return arr;
    }

    public int[] arr6(int a) {
        arr = new int[a];
        for(i=0; i<a; i++){
            arr[i]=(i+1)*(i+1);
        }
        return arr;
    }

    public double[] arr7(double a, double b, double c){

        if (a==0){
            double[] arr = new double[1];
            arr[0] = (-c/b);
            return arr;
        }
        else if(b*b-4*a*c<0){
            double[] arr = new double[]{};
            return arr;
        }
        else if(b*b-4*a*c==0){
            double[] arr = new double[1];
            arr[0] = (-b)/(2*a);
            return arr;
        }
        double[] arr = new double[2];
        arr[0] = (-b+Math.sqrt(b*b-4*a*c))/(2*a);
        arr[1] = (-b-Math.sqrt(b*b-4*a*c))/(2*a);
        return arr;
    }
}
