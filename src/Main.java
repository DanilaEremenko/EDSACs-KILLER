public class Main {
//    private static String input = "RightBinaryToDecimal/BeforeLinkingEdsac.txt";
//    private static String output = "RightBinaryToDecimal/AfterLinkingEdsac.txt";
    private static String input = "RightBinaryToDecimal/NotDebugBeforeLinkingEdsac.txt";
    private static String output = "RightBinaryToDecimal/NotDebugAfterLinkingEdsac.txt";
    private static boolean withComments = true;

    public static void main(String[] args) {
        EdsacLinker edsacLinker = new EdsacLinker("link_", "_link");
        edsacLinker.easyWayFromFile(input, output, withComments);
    }
}
