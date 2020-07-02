
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author barry
 */
public class main {
    public static void main(String args[])throws IOException{
        String input;
        int output;
        
        while(true){
            System.out.print("Enter your postfix: ");
            System.out.flush();
            input = getString();
            
            if(input.equals(" ")){
                break;
            }
            ParsePost aParser = new ParsePost(input);
            output = aParser.doParse();
            System.out.println("Evaluates to " + output);
        }
        
         
    }

    private static String getString() throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    
    }
    
}
