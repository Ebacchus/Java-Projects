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

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Eric
 */

public class Antfarm {              //public class
private String queenName;           //creating strings for the names
private String colonyName;
private String caretakerName;
//private String startingSizeTemp;
private int startingSize;            //creating intergers for the numbers
private int feed;
private int breed;
private int breeds;
private long finalAnts;              //long for large numbers
private long deadAnts = 0;
private boolean sick = false;         //boolean true or false
private boolean expanded = false;
private String newqueen =  null;
Antfarm (String queenName, String colonyName, String caretakerName, int startingSize, int feed, int breed){
        this.queenName = queenName;           //this operator pulls it from this section not the above
        this.colonyName = colonyName;
        this.caretakerName = caretakerName;
        this.startingSize = startingSize;
        this.feed = feed;
        this.breed = breed;
        
        }
public void breeding()                       
{ if (feed>=breed){                          //if feed is more than breed mul final ants
    finalAnts = startingSize;
    for (int i =1; i <= breed; i++)
    {
     finalAnts = finalAnts*3;
     breeds = breed;
    System.out.println(startingSize);
    
    }
    if (feed<breed){                         //if feed is less than breed multiphy colony by 3. feed and breed will be equal
        finalAnts = startingSize;
    for (int i =1; i <= feed; i++)
    {
     finalAnts = finalAnts*3;;
     breeds = feed;
    System.out.println(startingSize);
    
    }
    
    //System.out.println(startingSize);
}

 
  
}}
  public void lifeSpan()
    {if (feed>10)                //if queen is fed for more than 10 days she dies and colony will be divided by 2
    {deadAnts = finalAnts;
        deadAnts = deadAnts / 2;
        sick = true;
    //System.out.println(startingSize);
        
    }
    
}
public void expandColony(boolean expand)
{if (expand){Random r = new Random();  	                 //random generator for whether the new queen will be created
expanded = expand;
int x = 1 + r.nextInt(2);                                //1 out of 2 chances so theres a 50% chance of new queen
if (x == 1)
{newqueen = queenName + "2.0";}
}
if (!expand){{Random r = new Random();  	
int x = 1 + r.nextInt(10);
if (x == 1)                                           //if the queen is created then she is given the folowing new name 
{queenName =queenName + "2.0";}
}
}}
public void results()
{ finalAnts = finalAnts - deadAnts;                     //live ants - the dead ants to get the total number left
    JOptionPane.showMessageDialog(null,"The queen's name is " + queenName + "\n" + "The colony name is " + colonyName + "\n" + "The caretaker name is " + caretakerName + "\n" + "The original colony size is " + startingSize + " \n The ants were fed  " + feed + "times \n The ants were bred " + breed + "times \n The ant were bred successfully " + breeds + " times \n New Queen's name is " + newqueen + "\n Did the original queen get sick " + sick + " \n Number of ants that have died " + deadAnts +"\n Was the colony expanded " + expanded + " \n Final amount of ants " + finalAnts );
        
        }
}
