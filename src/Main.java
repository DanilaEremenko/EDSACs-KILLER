public class Main {
    private static String input = "RightBinaryToDecimal/BeforeLinkingEdsac.txt";
    private static String output = "RightBinaryToDecimal/AfterLinkingEdsac.txt";
    private static String numberedInput="RightBinaryToDecimal/NumberedBeforeLinkingEdsac.txt";
    private static String numberedOutput="RightBinaryToDecimal/NumberedAfterLinkingEdsac.txt";
//    private static String input = "RightBinaryToDecimal/NotDebugBeforeLinkingEdsac.txt";
//    private static String output = "RightBinaryToDecimal/NotDebugAfterLinkingEdsac.txt";
    private static boolean withComments = true;

    public static void main(String[] args) {
        EdsacLinker edsacLinker = new EdsacLinker("link_", "_link");
        edsacLinker.deleteUnusedComments(input,input);
        edsacLinker.makeLinkingFromFile(input, output, withComments);
        edsacLinker.printNumberOfLines(input,numberedInput);
        edsacLinker.printNumberOfLines(output,numberedOutput);


    }
}
