package kata.kata02;


public class SequentialImpl
             implements Kata02{

    public int chop(int number, int[] array){

        for (int i = 0; i< array.length; i++) {
            if(number == array[i]){
                return i;
            }
        }
        return -1;
    }
}
