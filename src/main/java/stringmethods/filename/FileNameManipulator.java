package stringmethods.filename;

public class FileNameManipulator {

    private boolean hasReadableContent(String s) {
        return s != null && !s.isBlank();
    }

    public char findLastCharacter(String str) {

        if(!hasReadableContent(str)) {
            throw new IllegalArgumentException("Not valid information.");
        }

        return str.charAt(str.length()-1);
    }
/*
    public String findExtension(String fileName) {

    }

    public boolean identifyFilesByExtension(String ext, String fileName) {

    }

    public boolean compareFilesByName(String searchedFileName, String actualFileName) {

    }

    public String changeExtensionToLowerCase(String fileName) {

    }

    public String replaceStringPart(String fileName, String present, String target) {

    }
*/

    public static void main(String[] args) {
        FileNameManipulator fileNameManipulator = new FileNameManipulator();
        System.out.println(fileNameManipulator.findLastCharacter("Utolsó karakter"));
    }
}
