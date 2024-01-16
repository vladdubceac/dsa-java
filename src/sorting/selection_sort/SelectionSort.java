package sorting.selection_sort;

import java.util.Arrays;

public class SelectionSort {

    static void selectionSort(int[] a){
        for(int j=0;j<a.length;j++){
            int minimumIndex = j;
            for(int i=j+1;i<a.length;i++){
                if(a[i] < a[minimumIndex]){
                    minimumIndex = i;
                }
            }
            if(minimumIndex!=j){
                int temp = a[j];
                a[j]=a[minimumIndex];
                a[minimumIndex] = temp;
            }
        }
    }

   static void printArray(int[] arr){
        Arrays.stream(arr).forEach(n->System.out.print(n+" "));
        System.out.println();
    }
}
