//ARRAY LISTS:

//1. you need an import:
//   import java.util.ArrayList; 

//2. Create array list:
//   ArrayList <dataType> name = new ArrayList <> (); 

//3. Add to the array list:
//   name.add(); 

//4. To acsess an element in array list:
//   name.get();    -- in brackets use index 0=1st input 

//5. to remove an element from array list:
//   name.remove(); 

//6. to modify an element:
//   name.set(); 

//7. Sort the arraylist with code below:
//   Collections.sort(name); 


package my_arraylists;

import java.util.ArrayList; 
import java.util.Scanner; 


public class My_ArrayLists {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        
        
        ArrayList <String> animals = new ArrayList <>(); 
        
        boolean ask = true; 
        
        while(ask = true){
            System.out.println("Enter an animal (need at least 2)"); 
            String animalName = input.next(); 
            animals.add(animalName); 
            
            if(animalName.equals("done")){
                break; 
            }
            
        }
        
        
        System.out.println(animals);
        
        System.out.println("Your second animal is " + animals.get(1)); 
        
        System.out.println("I will remove your first animal" + animals.remove(0) + animals);
        
          
      
    }
    
}
