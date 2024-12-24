package Core;
//ArrayList

import java.util.ArrayList;

public class Array_List {
 
  public static void main(String[] args) {
//	  ob1 is collection object and raj is obejct inside collection object
	  ArrayList ob1=new ArrayList();
	  ArrayList ob2=new ArrayList();
	  ArrayList ob3=new ArrayList();
	 ob1.add(100);//100 is also a object 
	 ob1.add("abhijeet");
	 ob1.add("raj");
	 ob1.add(100);//100 is also a object 
	 ob1.add("abhijeet");
	 ob1.add("raj");
	 System.out.println("array list ob1:"+ob1);
	 ob2.add(10000);//100 is also a object 
	 ob2.add("abhijeetkumar");
	 System.out.println("array list ob2:"+ob2);
	 ob1.addAll(ob2);
	 System.out.println("after adding ob2 into ob1 updated ob1:"+ob1);
	 //give first occurence
     System.out.println("raj present at ob1 at what index:"+ob1.indexOf("raj"));
     //if not present return -1
     System.out.println("k present in ob1:"+ob1.indexOf("k"));
     //contain//return boolean yes or no
     System.out.println("raj conatin in ob1:"+ob1.contains("raj"));
     //last indexof oject present
     System.out.println("last index of raj present:"+ob1.lastIndexOf("raj"));
     //clone
    ob3=(ArrayList) ob2.clone();//cast
    System.out.println("after clone ob3:"+ob3);
    //to array
    Object[] ob4 = new Object[10];
    ob2.toArray(ob4);
    System.out.println("return an array containing all of the elements in this list:"+ob4[1]);
    //isEmpty()
    System.out.println("ob1 is empty:"+ob1.isEmpty());
    //remove from particular index
    System.out.println("remove  from index 2 ob1: "+ob1.remove(2));
    System.out.println(ob1);
    //remove particluar object //return boolean
    System.out.println("remove raj from ob1:"+ob1.remove("raj"));
    //sublist(from,to index) 
     Object o=new Object(); //create object and assigned
    o= ob1.subList(3, 6);
    System.out.println("sublist from 3 to 6:"+o);
//    clear to clear list
    ob2.clear();
    System.out.println("clear ob2:"+ob2);
    //sort
    ob1.sort(null);
    System.out.println("after sort ob1:"+ob1);
} 
}
