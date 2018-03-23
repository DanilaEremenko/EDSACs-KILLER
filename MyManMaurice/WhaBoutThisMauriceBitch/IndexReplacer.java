package WhaBoutThisMauriceBitch;
/*Переменная хранится в комментариях в формате var_ИМЯ_var
 * Место, где ее необходимо заменить в комментариях в формате <ИМЯ>*/

import java.util.HashMap;
import java.util.Map;

public class IndexReplacer {

    public static String easyWay(String edsacCode, boolean withComments) {
        String result = edsacCode;
        HashMap<String, Integer> alphabet = alphabetMake(result);
        result = replaceIndices(result, alphabet);
        if (!withComments)
            result = deleteComments(result);
        return result;

    }

    public static HashMap<String, Integer> alphabetMake(String edsacCode) {

        HashMap<String, Integer> alphabet = new HashMap<>();
        String splitResult[] = edsacCode.split("\n");

        for (int i = 0; i < splitResult.length; i++)
            if (splitResult[i].contains("var_"))
                alphabet.put("<" + splitResult[i].
                        substring(splitResult[i].indexOf("var_") + 4, splitResult[i].indexOf("_var")) + ">", i + 1);

        return alphabet;
    }

    public static String replaceIndices(String edsacCode, HashMap<String, Integer> alphabet) {
        String result = edsacCode;

        for (Map.Entry<String, Integer> entry : alphabet.entrySet())
            result = result.replace(entry.getKey(), "" + entry.getValue());
        result = result.replace("\nvar_delete_var", "");


        return result;
    }

    public static String deleteComments(String edsacCode) {
        String splitedCode[] = edsacCode.split("\n");
        for (int i = 0; i < splitedCode.length; i++) {
            if (splitedCode[i].length() != 0 && splitedCode[i].contains("["))
                splitedCode[i] = splitedCode[i].substring(0, splitedCode[i].indexOf("["));
        }

        String result = "";
        for (int i = 0; i < splitedCode.length; i++)
            if (i != splitedCode.length - 1)
                result += splitedCode[i] + "\n";
            else result += splitedCode[i];

        return result;
    }


}
