package data_structures.stack;

/**
 * Created by TasdiqueC on 7/31/17.
 */
public class App {
    public static void main(String[] args) {
        Stack myStack = new Stack(10);
        myStack.push(30);
        myStack.push(12);
        myStack.push(510);
        myStack.push(34);
        myStack.push(84);
        myStack.push(90);

        while(!myStack.isEmpty()) {
            long var = myStack.pop();
            System.out.println(var);
        }

        WordToReverse wordToReverse = new WordToReverse("hello");
        wordToReverse.reverseWordAndDisplay();
    }
}
