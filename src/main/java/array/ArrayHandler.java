package array;

public class ArrayHandler {

    boolean contains(int[] source, int itemToFind) {
        for (int szam: source) {

           if(szam == itemToFind) {
               return true;
           }

        }
        return false;
    }

    int find(int[] source, int itemToFind) {

        for (int i = 0; i < source.length; i++) {

            if(source[i] == itemToFind) {
                return i;
            }
        } return -1;


    }

}
