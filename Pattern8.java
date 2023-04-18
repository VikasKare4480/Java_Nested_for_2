public class Pattern8 {

// A b C d 
// E f G h 
// I j K l 
// M n O p 

   public static void main(String[] args) {

    char Ch = 'A';

    char Ch1 = 'b';
    

        for(int i = 1; i <= 4; i++){

            for(int j = 1; j <= 4; j++){
                
                if(j % 2 == 0 ){

                    System.out.print( Ch1 + " ");
                    Ch1++;
                    Ch1++;

                }else{

                    System.out.print(Ch + " ");
                    Ch++;
                    Ch++;

                }

            }
        System.out.println(); 
        }       
   } 
    
}
