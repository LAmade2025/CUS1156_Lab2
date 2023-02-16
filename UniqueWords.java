/* Project:  Lab 2 Git
* Class: CUS1156 
* Author: Logan Amade
* Date: Feb 15, 2023
* This program has the ability to calculate the total number of distinct elements in an ArrayList
*/ 

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class UniqueWords
{
	
   /**
		counts the number of unique strings in a list
		@param list ArrayList of strings to be examined
		@return number of unique strings in the list
   */
	public static int countUnique(ArrayList<String> list)
	   {
		  int count = 0;
		  
	      for (int i = 0; i < list.size(); i++)
	      {		 for (int j = 0; j < list.size(); j++)
			 {
				
			 }
	      }
		  return count;
	   }

 
public static void main(String[] args)
   {
      ArrayList <String> words = new ArrayList<>();
      words.add("apple");
	  words.add("orange");
	  words.add("blackboard");
	  words.add("apple");
	  words.add("orange");
	  words.add("sun");
	  words.add("moon");
   
	 //Calculates Total Unique Words 
	  long unique = words.stream().distinct().count();
      System.out.println(words + " has " + unique + " unique words");
      
      
      

   }
}