// import javax.annotation.processing.SupportedOptions;

public class Pattern4 {
// A 1 B 2 
// C 3 D 
// E 4 
// F 

    public static void main(String[] args) {

            int N = 4;

            char ch = 'A';

            int num = 1;
        
        for(int i = 1; i <= 4 ; i++){

            for(int j = 1; j <= N-i+1; j++){

                if(j % 2 != 0){

                    System.out.print(ch + " ");
                    ch++;

                }else{

                    System.out.print(num + " ");
                    num++;

                }
            }
            System.out.println();
        }
    }
    
}
