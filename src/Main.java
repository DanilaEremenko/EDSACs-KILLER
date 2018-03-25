public class Main {
    private static String input = "BinaryToDecimal/BeforeLinkingEdsac.txt";
    private static String output = "BinaryToDecimal/AfterLinkingEdsac.txt";
    private static boolean withComments = true;

    public static void main(String[] args) {
        EdsacLinker edsacLinker = new EdsacLinker("var_", "_var");
        edsacLinker.easyWayFromFile(input, output, withComments);
    }
}
