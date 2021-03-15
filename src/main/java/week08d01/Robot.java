package week08d01;

public class Robot {

    public Position move(String str){
        if(str == null || "".equals(str.trim())) {
            throw new NullPointerException();
        }
        Position position = new Position();
        String strToUpperCase = str.toUpperCase();

        positionSetting(position, strToUpperCase);

        return position;
    }

    private void positionSetting(Position position, String strToUpperCase) {
        validityTest(strToUpperCase);

        for(char c: strToUpperCase.toCharArray()){
            if(c == 'F'){
                position.setY(position.getY() + 1);
            }
            if(c == 'L'){
                position.setY(position.getY() - 1);
            }
            if(c == 'J'){
                position.setX(position.getX() + 1);
            }
            if(c == 'B'){
                position.setX(position.getX() - 1);
            }
        }
    }

    private void validityTest(String strToUpperCase) {

        for(char c: strToUpperCase.toCharArray()){
            if(c != 'L' && c != 'J' && c != 'B' && c != 'F'){
                throw new IllegalArgumentException("Invalid character!");
            }
        }
    }
}
