// import javax.lang.model.util.ElementScanner6;

public class Pattern5 {

// 1 4 3 16 
// 5 36 7 
// 8 81
// 10
 


   public static void main(String[] args) {
    
         int num = 1;
         int N = 4;


         for(int i = 1; i <= N; i++){

            for(int j = 1; j <= (N - i + 1) ; j++){

               if(j % 2 == 0){

                  System.out.print(num * num + " ");

               }else{

                  System.out.print(num + " ");
               }
               num++;
               // System.out.print("* ");
            }

            System.out.println();
         }
   } 
    
}
