import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        double wordCounter = 1;
        String championWord = "";
        while (!StdIn.isEmpty()) {
            String wordRead = StdIn.readString();
            if (StdRandom.bernoulli(1 / wordCounter)) {
                championWord = wordRead;
                ++wordCounter;
            }
        }
        System.out.print(championWord);
    }
}
