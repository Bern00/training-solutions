package exam02;

public class ArraySelector {

    public String build(String[] tomb) {

        StringBuilder result = new StringBuilder();

        if(tomb.length == 0) {
            return "";
        }

        for(int i = 0; i<tomb.length; i++) {
            if(i%2 != 0) {
                result.append(tomb[i]);
            }
        }

        return result.toString();
    }
}
