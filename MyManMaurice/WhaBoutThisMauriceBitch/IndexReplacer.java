package WhaBoutThisMauriceBitch;
/*Переменная хранится в коде Эдсака в формате var_ИМЯ_var
 * Место, где ее необходимо заменить <ИМЯ>*/

import java.util.HashMap;
import java.util.Map;

public class IndexReplacer {

    public static HashMap<String, Integer> alphabetMaker(String edsacCode) {

        HashMap<String, Integer> alphabet = new HashMap<>();
        String splitResult[] = edsacCode.split("\n");

        for (int i = 0; i < splitResult.length; i++)
            if (splitResult[i].contains("var_"))
                alphabet.put("<" + splitResult[i].
                        substring(splitResult[i].indexOf("var_") + 1, splitResult[i].indexOf("_var")) + ">", i);

        return alphabet;
    }

    public static String replace(String edsacCode, HashMap<String, Integer> alphabet) {
        String result = edsacCode;

        for (Map.Entry<String, Integer> entry : alphabet.entrySet())
            result = result.replace(entry.getKey(), "" + entry.getValue());


        return result;
    }

    public static String deleteComments(String edsacCode) {
        String splitedCode[] = edsacCode.split("\n");
        for (int i = 0; i < splitedCode.length; i++) {
            splitedCode[i] = splitedCode[i].substring(0, splitedCode[i].indexOf("["));
        }

        String result = "";
        for (String aSplitedCode : splitedCode) {
            result += aSplitedCode + "\n\t";
        }
        return result;
    }

    public static void main(String[] args) {
        String edsacCode = "";
        HashMap alphabet = alphabetMaker(edsacCode);

        String normalEdsacCode = IndexReplacer.replace(edsacCode, alphabet);
        System.out.println(normalEdsacCode);


    }
}
