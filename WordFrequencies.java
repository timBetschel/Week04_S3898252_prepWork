import java.util.Scanner;

public class WordFrequencies {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      String[] wordList = new String [20]; 

      int wordAmount = scnr.nextInt();

      int i;
   
      
      for (i = 0; i < wordAmount; ++i) {
         if (scnr.hasNext() == true){
            wordList[i] = scnr.next();
         }

      }

      scnr.close();
      

      int j;
      int counter;

      for (i = 0; i < wordAmount; ++i){
         counter = 0;
         for (j = 0; j < wordAmount; ++j){
            if (wordList[j].equals(wordList[i])){
               ++counter;
            }
         }
         System.out.println(wordList[i] + " - " + counter);

      }

   }
}