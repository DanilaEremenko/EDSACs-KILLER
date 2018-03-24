import java.io.IOException;

public class Main {
    private static String input = "BinaryToDecimal/FalseEdsac.txt";
    private static String output = "BinaryToDecimal/RightEdsac.txt";
    private static boolean withComments = true;

    public static void main(String[] args) {
        IndexReplacer.easyWayFromFile(input, output, withComments);
    }
}
