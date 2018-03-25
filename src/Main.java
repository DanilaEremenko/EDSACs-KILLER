public class Main {
    private static String input = "RightBinaryToDecimal/BeforeLinkingEdsac.txt";
    private static String output = "RightBinaryToDecimal/AfterLinkingEdsac.txt";

    private static boolean withComments = true;

    public static void main(String[] args) {
        EdsacLinker edsacLinker = new EdsacLinker("link_", "_link");
        edsacLinker.easyWayFromFile(input, output, withComments);
    }
}
