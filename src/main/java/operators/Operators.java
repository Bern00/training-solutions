package operators;

public class Operators {

   public boolean isEven(int n) {
       if( n%2 == 0){
           return true;
       }
       return false;
   }

   public String multiplyByPowerOfTwo(int numberOne, int numberTwo){
       return Integer.toBinaryString(numberOne << numberTwo);
   }

}
