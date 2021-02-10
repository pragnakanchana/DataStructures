/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		//List listB = new LinkedList();
        //List listC = new Vector();
        //List listD = new Stack();
		l.add("Hii");
		l.add("hello");
		l.add("How r u");
		for(String s: l){
		    System.out.println(s);
		}
		
		//Insert All Elements From One List Into Another
		List<String> listSource = new ArrayList<>();
        listSource.add("123");
        listSource.add("456");
        List<String> listDest   = new ArrayList<>();
        listDest.addAll(listSource);
        
        //Get Elements From a Java List - 0 based indexing
        System.out.println(listSource.get(1));
        
        //Find the Index of element
        List<String> list = new ArrayList<>();

        String element1 = "element 1";
        String element2 = "element 2";
        
        list.add(element1);
        list.add(element2);
        list.add("element 1");

        int index1 = list.indexOf(element1);
        int index2 = list.indexOf(element2);

        System.out.println("index1 = " + index1);
        System.out.println("index2 = " + index2);
        
        
        //Find Last Occurrence of Element in a List
         int index = list.lastIndexOf(element1);
         System.out.println(index);
         
         //check if list contains an element
         if(list.contains("element 1")){
             System.out.println("Yes");
         }
         
         //Remove Elements From a Java List
         //remove(Object element)
         //remove(int index)
         list.remove(0);
         
         
         //to clear the list
        //list.clear();
        
        //size
        System.out.println(list.size());
        
        //to create sublist
        List<String> sublist = list.subList(0, 2);
        
        //convert a list to Set
        Set<String> set = new HashSet<>();
        set.addAll(list);
        for(String s : set){
            System.out.print(s + " ");
        }
        
        //sort
        Collections.sort(list);
        
	}
}
