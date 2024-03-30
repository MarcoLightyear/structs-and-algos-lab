package algorithms;

public class InsertionSort {
    public void sort(int[] array){
        for(int i=1; i<array.length; i++){
            int position = i;
            int tmp = array[i];
            while(position>0 && tmp < array[position-1]){
                array[position] = array[position-1];
                position --;
            }
            array[position] = tmp;
        }
    }
}
