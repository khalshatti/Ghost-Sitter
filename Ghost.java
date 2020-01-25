//****************************************************************************************//
//    Ghost.java            Author: Khaled Alshatti                                       //      
//                                                                                        //
//    a program that babysits a ghost which likes to eat candy and wants to be the         //
//    spookies ghost around.                                                              //   
//****************************************************************************************//

public class Ghost 
{	
   //These values are not positive. They MUST be negative!
	private int hunger = 0;
	private int spookiness = 0;

	//Constructor
	public Ghost()
   {
	   System.out.println("The world has given birth to a new Ghost!");
	}
	
	//scare: decrease the spookieness level by 3 and set it to 0 if it is greater than 0. . 
	public void scare()
   {
	   spookiness = spookiness -3;
      
      if(spookiness>0)
      {
         spookiness=0;
      }	
	}
	
	//getSpookiness: return the spookines level
	public int getSpookiness()
   {
	   return spookiness;
	}
	
	//getHunger: return the hunger level;
	//add header for getHunger
	public int getHunger()
   {
		return hunger;//add body of getHunger
	}
	
	//getMood: return the mood as the difference of the hunger
	//level and the spookiness level
	public int getMood()
   {
		return hunger + spookiness;//This will be a negative number
	}
	
    //passTime: increase the hunger level and the spookiness
	//level by 1

    public void passTime()
    {
        hunger--;		//won't go larger than 0.
        spookiness--;	//won't go larger than 0.
    }
    
    //eatCandy: increase the hunger level by 3 and set it to 0 if
    //it is greater than 0.
    public void eatCandy()
    {
    	System.out.println("MMMMMMmmmmmmmmmmm.........");
    	//add Code here
      hunger = hunger + 3;
      
      if(hunger>0)
      {
         hunger =0;
      }
    }
    
    public void speakWithTheSpirits()
    {
      System.out.print("I feel ");
    	int mood = getMood();
    	//add Code here.
      
      if(mood >= -5)
      {
         System.out.print("Friendly");
      }
      
      else if(mood<-5 && mood>= -10)
      {
         System.out.print("Spooky");
      }
      
      else if (mood <-10 && mood >= -15)
      {
         System.out.print("Whistful");
      }
      
      else
      {
         System.out.print("Vengeful");
      }
    }
}



