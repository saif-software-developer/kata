package kata.kata02;


public class BinarySearch_V2
        implements Kata02{


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

        int arrayMid = ((tail-head)/2 )+ head;

        /**
         * check if arrayMid is equal to the number
         * else if the number is greater than >> shift the window right
         * else shift the window left
         * else return not found
         */
        if(array[arrayMid] == number){
            return arrayMid;
        }else if(number > array[arrayMid] && number <= array[tail]){
            head=arrayMid+1;
            tail=array.length-1;
        }else if(number<array[arrayMid] && number >= array[head]){
            head = 0;
            tail=arrayMid-1;
        }else{
            return -1;
        }

        return findElementIndexInArray(number,array,head,tail);
    }
}
