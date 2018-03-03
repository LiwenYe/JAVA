public class SimpleDotCom {
    private int[] locationCells;
    private int numOfHits = 0;
    
    public String checkYourself(/*int guess*/String usrGuess){
        int guess = Integer.parseInt(usrGuess);
        String result = "miss";
        //for(int i = 0 ; i<locationCells.length ; i++){
        for(int cell : locationCells){
            //if (guess == locationCells[i]){
            if(guess == cell){
                numOfHits++;
                result = "hit";
                break;
            }

        }
        
        if (numOfHits == locationCells.length){
            result = "kill"; 
        }
        
        System.out.println(result);
        return result;
    }
    
    public void setLocationCells(int[] locations){
        locationCells = locations;
    }
    
    
}
