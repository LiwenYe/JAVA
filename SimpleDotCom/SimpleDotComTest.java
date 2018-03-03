import java.util.Scanner;
import java.io.*;

public class SimpleDotComTest {
    
    public static void main(String[] args){
        SimpleDotCom dot = new SimpleDotCom();
        
        int numOfGuess = 0;
        
        int cellLocation = (int)(Math.random()*5);
        int[] locations = {cellLocation,cellLocation+1,cellLocation+2};
        dot.setLocationCells(locations);
        
        Player player = new Player();
        
        boolean isAlive = true;
        while (isAlive) {
            /*
            Scanner input = new Scanner(System.in);
            System.out.print("请输入所猜位置：");
            int usrGuess = input.nextInt();
            String usrGuess = null;
            try {
                System.out.print("请输入所猜位置：");
                BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
                usrGuess = is.readLine();
            }catch (IOException e){
                System.out.println("IOException:" + e);
            }
            */
            String usrGuess = player.getUsrInput();
            
            String result = dot.checkYourself(usrGuess);
            numOfGuess++;
            
            if (result.equals("kill")){
                isAlive = false;
                System.out.println("一共猜了"+numOfGuess+"次");
            }
        }
    }
}
