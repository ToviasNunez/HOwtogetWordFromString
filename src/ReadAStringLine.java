import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class ReadAStringLine {


    public static void main(String[] args) throws IOException {

        listVersion();
    }



    public static void listVersion() throws IOException {


        System.out.println(" you have to write some ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String test = bufferedReader.readLine();
        String[] words = test.split(" ");

        ArrayList<String> commmandlist = new ArrayList<>();

        String firstCommand = "" ;
        String secondCommand = "";
        String thirstCommand = "";
        String fourthCommand = "";
        for (String word: words){
            System.out.println(word);
        }

        for (int i = 0; i < words.length ; i++) {

             commmandlist.add(words[i]);

        }

        commmandlist.stream().forEach(x -> System.out.println(x));

        for (int i = 0; i < commmandlist.size(); i++) {
            firstCommand = commmandlist.get(1);
        }
    }

    public static void arrayVersion() throws IOException {


        System.out.println(" you have to write some ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String test = bufferedReader.readLine();
        String[] words = test.split(" ");

        String firstCommand = "" ;
        String secondCommand = "";
        String thirstCommand = "";
        String fourthCommand = "";
        for (String word: words){
            System.out.println(word);
        }

        for (int i = 0; i < words.length ; i++) {
            firstCommand = words[0];
            secondCommand = words[1];
            thirstCommand = words[2];
            fourthCommand = words[3];




        }

        System.out.println( firstCommand + " " + secondCommand + " " +thirstCommand + " " + fourthCommand);
    }
}
