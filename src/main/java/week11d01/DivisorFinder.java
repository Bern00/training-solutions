package week11d01;

public class DivisorFinder {
    public int findDivisors(int n){
        int result = 0;
        String number = Integer.toString(n);
        for(char c: number.toCharArray()){
            int cValue = Character.getNumericValue(c);
            if(n%cValue == 0){
                result++;
            }
        }
        return result;
    }
}
