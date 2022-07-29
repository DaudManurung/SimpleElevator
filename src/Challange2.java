import java.util.Scanner;

public class Challange2 {
    public static void main(String[] args) {

        int start, input;

        Scanner scanner = new Scanner(System.in);
        start = 1;
        while(start > 0){
            System.out.println("\nMau ke Lantai berapa? : ");
            input = scanner.nextInt();

            if(start > 0 && start <=30 && input >= 0 )
            {
                if(start < input){

                    for(int i = start;i <= input; i++){
                        System.out.println("Kamu berada di lantai: " + i);
                        if(i == input){
                            System.out.println("\nKamu sampai di lantai: "+ input);
                        }
                    }
                    start = input;
                }else if ( start > input) {
                    for(int i = start; i>= input; --i){
                        System.out.println("Kamu berada di lantai " + i);
                        if(i == input){
                            System.out.println("\nKamu sampai di lantai: "+ input);
                        }
                    }
                }

            } else{
                System.out.println("Tidak ada lantai segitu bro");
            }
        }


    }
}
