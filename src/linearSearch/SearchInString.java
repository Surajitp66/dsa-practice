package linearSearch;

public class SearchInString {
    public static void main(String[] args) {
        String str = "Surajit";
        char targetChar = 'b';
        System.out.println(searchChar(str,targetChar));
    }

    private static boolean searchChar(String str ,char targetChar) {
        for(char element : str.toCharArray()) {
            if(element == targetChar)
                return true;
        }
        return false; // target character not found in string
    }
}
