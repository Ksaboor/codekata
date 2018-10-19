import java.util.HashSet;
import java.util.Set;

public class UniqueStrings {

    public static boolean hasUniqueChars(String test) {
        Set<Character> set = new HashSet <Character>();
        for (char e:test.toCharArray()) {
            if(set.contains(e)){
                return false;
            }
            set.add(e);
        }
        return true;
    }

    public static boolean checkUnique(String duck) {
        boolean isUnique = false;
        for (int i = 0; i <duck.length() ; i++) {
            for (int j = i + 1; j < duck.length(); j++) {
                if (duck.charAt(i) == duck.charAt(j)) {
                    isUnique = true;
                }
            }
        }
        return isUnique;
    }
}
