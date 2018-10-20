package kata.kata02;


import java.util.Arrays;

public class BinarySearch implements Kata02{


    @Override
    public int chop(int number, int[] array) {
        return findElementIndexInArray(number,array,0,array.length-1);

    }

    private int findElementIndexInArray(int number,
                                        int[] array,
                                        int head,
                                        int tail){
        if(array.length == 0){
            return -1;
        }
        if(array.length == 1){
            if (array[0] == number){
                return 0;
            }else {
                return -1;
            }
        }

        int arrayMid = ((tail-head)/2 )+ head;

        //it means that our window size is 1
        //check if the number we are looking for exists in this cell
        //otherwise skip it and return
        if(arrayMid == 0 || arrayMid == array.length-1){
            if(number==array[arrayMid]){
                return arrayMid;
            }else{
                return -1;
            }
        }

        //This a corner case where the array mid greater than the left side of the array
        // and less than the right side of it
        // Ex. [ (1) (2) (5) (7) ] , number : 4
        if(number > array[arrayMid] && number < array[arrayMid+1]){
            return -1;
        }

        if(number<array[arrayMid]){
            head = 0;
            tail=arrayMid;
        }else if(number>array[arrayMid]){
            head=arrayMid+1;
            tail=array.length-1;
        }else if (number==array[arrayMid]){
            return arrayMid;
        }

        if(head == tail){
            if(array[head]==number) {
                return head;
            }
            return -1;
        }
        return findElementIndexInArray(number,array,head,tail);
    }
}
