//********************************************************************************
// FIU PANTHERID: [4853170]
// CLASS: COP 2210 – [Fall 2017]
// ASSIGNMENT # [2]
// DATE: [10/16/17]
//
// I hereby swear and affirm that this work is solely my own, and not the work 
// or the derivative of the work of someone else.
//********************************************************************************

package antproject;

import javax.swing.JOptionPane;
/**
 *
 * @author Eric
 */
public class Antproject {

    /**
     * @param args the command line arguments
     */
       
    public static void main(String[] args) {
        
        String  queenName;            //creates string for the names inputed
        String colonyName;
        String caretakerName;
        String startingSizeTemp;
        int startingSize;              //create int for the size of the colony
        String expandColony;
        
        caretakerName = JOptionPane.showInputDialog(null, "Welcome to your ant farm." + '\n' +"What is your Name?");
        colonyName = JOptionPane.showInputDialog("Greetings " + caretakerName +", what would you like your colony to be named?");
        startingSizeTemp = JOptionPane.showInputDialog("Ok " + caretakerName + ", What would you like the starting size of " + colonyName + " to be?"); //windows will pop up asking the user for inputs
        startingSize = Integer.parseInt(startingSizeTemp);
        queenName = JOptionPane.showInputDialog("Ok " + caretakerName + "what would you like to name your queen?");
          
        int feed = 0;         //initazile feed to 0
        int breed = 21;       // initazile breed to 21
        String feedtemp;
        feedtemp = JOptionPane.showInputDialog("How many days would you like to feed " + colonyName); //ask user if they want to feed
        feed = Integer.parseInt(feedtemp); //convert the string back into an integer
        String breedtemp;
        breedtemp = JOptionPane.showInputDialog("Would you like your colony to breed?" + '\n' + "(Yes, No)"); //asks the user if they  want to breed
        
        if(breedtemp.equalsIgnoreCase("Yes")||breedtemp.equalsIgnoreCase("Y"))
        { 
            while (breed>20){                                                                      //breeding cant be more than 20 or nothing will happen then is converted back into a innteger
                breedtemp = JOptionPane.showInputDialog("how many times would you like to breed?" + '\n' + "The maximum number of breeding is 20 times");
                breed = Integer.parseInt(breedtemp);
            }
        
        
        }
        else
        { 
          breed = 0;
        }
        Antfarm j = new Antfarm(queenName, colonyName, caretakerName,startingSize,feed,breed);     //new antfarm with values
        j.breeding();                                                                             //pulls values from the other file
        j.lifeSpan();
        expandColony=JOptionPane.showInputDialog("Would you lke to expand your colony?");       //ask user if they want to expand boolean is used for this operator 
                if(expandColony.equalsIgnoreCase("Yes")||expandColony.equalsIgnoreCase("Y"))
                {j.expandColony(true);}
                else{j.expandColony(false);}
                
                j.results();

        
        
        
    
    
    
    
}

}
