import java.util.*;
/**
 * Write a description of class pilaPowers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pilaPowers  
{
   private ArrayList<Object> pila = new ArrayList();
   
    
   public void push(Object o)
   {
       pila.add(o);  
    }
   
   public Object pop()
   {
       if(!(pila.isEmpty()))
       {
           Object o = pila.get(pila.size()-1);
           pila.remove(pila.size()-1);
           return o;
        }
       else
       {
           return null;
        }
    }
    
    
   public Object peek()
   {
       if(!(pila.isEmpty()))
       {
           return pila.get(pila.size()-1);
        }
        else{return null;}
    }
    
   public void sizePila()
   {
       if (pila.size()==3)
       {
           
       }
    
    } 
    
   public Boolean empty()
   {
       return pila.isEmpty();
    }
}
