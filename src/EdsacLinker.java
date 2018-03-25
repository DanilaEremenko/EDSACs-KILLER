/*Ссылка на строчку хранится в комментариях в формате startOfLink_*ИМЯ*_endOfLink
 * Место, где ее необходимо заменить на номер строчки в формате <*ИМЯ*>         */

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class EdsacLinker {
    private String startOfLink;
    private String endOfLink;

    EdsacLinker(String startOfLink, String endOfLink) {
        this.startOfLink = startOfLink;
        this.endOfLink = endOfLink;
    }

    public String easyWay(String edsacCode, boolean withComments) {
        String result = edsacCode;
        HashMap<String, Integer> alphabet = alphabetMake(result);
        result = replaceIndices(result, alphabet);
        if (!withComments)
            result = deleteComments(result);
        return result;

    }


    public void easyWay(String edsacCode, String outputFile, boolean withComments) throws IOException {
        String result = edsacCode;
        HashMap<String, Integer> alphabet = alphabetMake(result);
        result = replaceIndices(result, alphabet);
        if (!withComments)
            result = deleteComments(result);
        writeToFile(outputFile, result);

    }


    public String easyWayFromFile(String inputFile, boolean withComments) {
        return easyWay(parseFromFile(inputFile), withComments);
    }


    public void easyWayFromFile(String inputFile, String outputFile, boolean withComments) {
        writeToFile(outputFile, easyWayFromFile(inputFile, withComments));
    }


    public HashMap<String, Integer> alphabetMake(String edsacCode) {

        HashMap<String, Integer> alphabet = new HashMap<>();
        String splitResult[] = edsacCode.split("\n");

        for (int i = 0; i < splitResult.length; i++)
            if (splitResult[i].contains(startOfLink))
                alphabet.put("<" + splitResult[i].
                        substring(splitResult[i].indexOf(startOfLink) + 4, splitResult[i].indexOf(endOfLink)) + ">", i + 31);


        return alphabet;
    }


    public String replaceIndices(String edsacCode, HashMap<String, Integer> alphabet) {
        String result = edsacCode;

        for (Map.Entry<String, Integer> entry : alphabet.entrySet())
            result = result.replace(entry.getKey(), "" + entry.getValue());
        result = result.replace("\nvar_delete_var", "");
        result = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" + result;

        return result;
    }


    public String deleteComments(String edsacCode) {
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


    public void writeToFile(String URL, String text) {

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(URL));
            bufferedWriter.write(text);
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public String parseFromFile(String URL) {

        String edsacCode = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(URL));
            int c;
            while ((c = bufferedReader.read()) != -1)
                edsacCode += Character.toString((char) c);
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return edsacCode;
    }


}
