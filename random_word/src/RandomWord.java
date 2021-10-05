import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    static public void main(String[] args) {
        double wordCounter = 1;
        String championWord = "";
        while (!StdIn.isEmpty() && StdRandom.bernoulli(1 / wordCounter)) {
            championWord = StdIn.readString();
            ++wordCounter;
        }
        System.out.print(championWord);
    }
}
