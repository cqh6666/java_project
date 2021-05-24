package book_learn.src.com.haige;

import javax.imageio.IIOException;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameHelper {
    public String getUserInput(String s) {
        String inputLine = null;
        System.out.print(s);
        try {
            //输入
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) {
                return null;
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return inputLine;
    }
}
