import java.util.Arrays;

public class Sorting_method {
    public static void main(String[] args) {
        int[] arr={0,5,1,9,3,8,2};
       // System.out.println("Bubble Sort -> "+ Arrays.toString(bubbleSort(arr)));
        //System.out.println("Selection Sort -> "+ Arrays.toString(selectionSort(arr)));
      // System.out.println("Insertion Sort -> "+ Arrays.toString(insertionSort(arr)));
        mergeSort(arr);
        System.out.print("Merge Sort -> " );
        for (int i: arr) {
            System.out.print(i +" ");
        }
        System.out.println();
    }
    public static void conqurer(int []arr,int s,int mid,int e){
        int [] mergeArray=new int[e-s+1];
        int i=s,j=mid+1,k=0;
        while(i<=mid&&j<=e){
            if(arr[i]<=arr[j]){
                mergeArray[k]=arr[i];
                i++;
                k++;
            }else{
                mergeArray[k]=arr[j];
                k++;
                j++;
            }
        }
        while(i<=mid){
            mergeArray[k++]=arr[i++];
        }
        while (j<=e){
            mergeArray[k++]=arr[j++];
        }
        for (int l =0,m=s;l< mergeArray.length;l++,m++) {
            arr[m]=mergeArray[l];
        }
    }
    public  static void divideArr(int [] arr,int s,int e){
        if(s>=e) return;
        int mid=s+(e-s)/2;
        divideArr(arr,s,mid);
        divideArr(arr,mid+1,e);
        conqurer(arr,s,mid,e);
    }
    public  static void mergeSort(int [] arr){

        divideArr(arr,0,arr.length-1);
    }
    public static int [] insertionSort(int [] arr){
        for (int i = 1; i < arr.length; i++) {
            int k=arr[i];
            int j=i-1;
            while (j>=0&&arr[j]>k){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=k;
        }
//        for (int i = 1; i < arr.length; i++) {
//            for(int j=0;j<=i;j++){
//                if(arr[i]<arr[j]){
//                    swap(arr,i,j);
//                }
//            }
//        }
        return arr;
    }
    public static int[] selectionSort(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            int min=minVal(arr,i);
            swap(arr,i,min);
        }
        return arr;
    }
    public static int minVal(int [] arr,int idx){
        int min=idx;
        for (int i = idx+1; i < arr.length ; i++) {
            if(arr[i]<arr[min]){
                min=i;
            }
        }
        return min;
    }
    public static int[] bubbleSort(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            boolean flag=false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    flag=true;
                }
            }
            if(!flag){
                break;
            }
        }
        return arr;
    }
    public static void swap(int [] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }


}
