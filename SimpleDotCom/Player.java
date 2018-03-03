import java.io.*;

public class Player {
    
    public String getUsrInput(){
        String input = null;
        try {
            System.out.print("请输入所猜位置：");
            BufferedReader is = new BufferedReader(new  InputStreamReader(System.in));
            input = is.readLine();
            if (input.length() == 0){
                input = null;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return input;
    }
}
