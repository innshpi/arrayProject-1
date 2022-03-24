
/**
 * Write a description of class arrays here.
 *
 * @author (Piper Inns Hall)
 * @version (16/03/22)
 */
import java.util.Scanner;
public class arrays
{
    // instance variables - replace the example below with your own
    int heights[] = new int[5];
    int months[] = new int[31];
    final int HEIGHTS = 5;
    final int MONTHS = 31;
    /**
     * Constructor for objects of class arrays
     */
    public arrays()
    {
        // initialise instance variables
        System.out.print('\u000c');
        Scanner keyBoard = new Scanner(System.in);
        for (int x=0;x<HEIGHTS;x++){
            System.out.println("Enter the next height");
            heights[x]=Integer.parseInt(keyBoard.nextLine());
        }
        for (int y=HEIGHTS-1;y>=0;y--)
            System.out.println(heights[y]);
        
        // for (int z=0;z<MONTHS;z++){
            // System.out.println("Enter the next temperature");
            // months[z]=Integer.parseInt(keyBoard.nextLine());
            // if(months[z]=7){
                // for
            // }
        // }
    }
}