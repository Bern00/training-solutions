package week07d02;

public class DigitSum {

    public int sumOfDigits(int x){

        int number = getNumber(x);
        String str = Integer.toString(number);
        int result = 0;
        String[] numberArray = str.split("");
        for(int i = 0; i < numberArray.length; i++){
            result = result + Integer.parseInt(numberArray[i]);
        }
        return result;
    }

    private int getNumber(int x) {
        int number;
        if(x < 0){
            number = x *(-1);
        } else {
            number = x;
        }
        return number;
    }
}
