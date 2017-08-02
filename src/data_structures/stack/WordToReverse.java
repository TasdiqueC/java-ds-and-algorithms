package data_structures.stack;

/**
 * Created by TasdiqueC on 7/31/17.
 */
public class WordToReverse implements StackOperations {
    private String name;
    private Stack stack;

    private char[] turnNameToCharArray(String name) {
        char[] charArray = name.toCharArray();
        return charArray;
    }

    public void fillStack(String name) {
        stack = new Stack(name.length());
        char[] nameInCharArray = turnNameToCharArray(name);
        for (int i = 0; i < name.length(); i++) {
            stack.push(nameInCharArray[i]);
        }
    }

    public WordToReverse(String name) {
        this.name = name;
        fillStack(this.name);
    }

    public void reverseWordAndDisplay() {
        while (!stack.isEmpty()) {
            char letter = (char) stack.pop();
            System.out.print(letter);
        }
    }
}
