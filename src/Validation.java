import java.util.Scanner;

/**
 * Created by Julio on 8/19/2016.
 */
public class Validation {


    public String userInput(){
        //---------------------------------------------------------
        /**
         * Scans user input
         */
        Scanner scan = new Scanner(System.in);
        //---------------------------------------------------------

        //user input, invalid input will keep cicle going
        while (true){
            //Instructions
            System.out.println("Ingrese LISTA o STACK para comenzar");

            //Gets input and capitalize everyhting
            String userInput = scan.next().toUpperCase();

            //defensive prog
            if (userInput == "LISTA"){
                /**
                 * User input is " Lista "
                 */

                //Breaks while cicle
                return userInput;
            }
            else if(userInput == "STACK"){
                /**
                 * User input is " Stack "
                 */

                //Breaks while cicle
                return userInput;
            }
            else{
                /**
                 * Invalid User Input
                 */
                System.out.println(" Ingrese solamente 'Lista' o 'Stack' ...  ");
            }

        }

    }
}
