package stringmethods.filename;

import java.util.Locale;

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

    public String findFileExtension(String fileName) {
        if (!hasReadableContent(fileName)) {
            throw new IllegalArgumentException("Invalid file name!");
        }
        fileName = fileName.trim();
        int index = fileName.lastIndexOf('.');
        if (index < 1 || index == fileName.length() - 1) {
            throw new IllegalArgumentException("Invalid file name!");
        }

        return fileName.substring(index);
    }

    public boolean identifyFilesByExtension(String ext, String fileName) {

        if (!hasReadableContent(fileName) || !hasReadableContent(ext)) {
            throw new IllegalArgumentException("Invalid argument!");
        }

        fileName = fileName.trim();
        ext = ext.trim();
        int index = fileName.lastIndexOf('.');

        if (index < 1 || index == fileName.length() - 1) {
            throw new IllegalArgumentException("Invalid argument!");
        }

        return fileName.endsWith(ext);
    }

    public boolean compareFilesByName(String searchedFileName, String actualFileName) {

        if (!hasReadableContent(searchedFileName) || !hasReadableContent(actualFileName)) {
            throw new IllegalArgumentException("Invalid argument!");
        }

        searchedFileName = searchedFileName.trim();
        actualFileName = actualFileName.trim();

        return searchedFileName.equalsIgnoreCase(actualFileName);
    }

    public String changeExtensionToLowerCase(String fileName) {
        if (!hasReadableContent(fileName)) {
            throw new IllegalArgumentException("Invalid file name!");
        }
        fileName = fileName.trim();
        int index = fileName.lastIndexOf('.');
        if (index < 1 || index == fileName.length() - 1) {
            throw new IllegalArgumentException("Invalid file name!");
        }

        return fileName = fileName.substring(0,index).concat(fileName.toLowerCase().substring(index));
    }


    public String replaceStringPart(String fileName, String present, String target) {

        if (!hasReadableContent(fileName) || !hasReadableContent(present) || !hasReadableContent(target)) {
            throw new IllegalArgumentException("Invalid file name!");
        }

        if (!fileName.contains(present)) {
            throw new IllegalArgumentException("There is no text like this!");
        }

        return fileName.replace(present, target);

    }


    public static void main(String[] args) {
        FileNameManipulator fileNameManipulator = new FileNameManipulator();
        System.out.println(fileNameManipulator.findLastCharacter("Utolsó karakter"));
        System.out.println(fileNameManipulator.findFileExtension("valami.txt"));
        System.out.println(fileNameManipulator.identifyFilesByExtension("txt", "valami.txt"));
        System.out.println(fileNameManipulator.compareFilesByName("kicsi", "Kicsi"));
        System.out.println(fileNameManipulator.changeExtensionToLowerCase("VALAMI.TXT"));
        System.out.println(fileNameManipulator.replaceStringPart("valami", "lam", "lak"));
    }
}
