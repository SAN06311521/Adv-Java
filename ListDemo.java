import java.util.*;

class ListDemo
{
    public static void main(String as[])
    {
        ArrayList list=new ArrayList();
        list.add(12345);
        list.add('C');
        list.add("C++");
        list.add(true);
        list.add("C++");
        list.add(49.29);
        System.out.println("list is : "+ list);
        System.out.println("size of list is : "+ list.size());
        list.remove(49.29);
        System.out.println("After removal,the list is : "+ list);  //list.clear();
        System.out.println("is list is blank? "+ list.isEmpty());
        ArrayList list2=new ArrayList();
        list2.add("one");
        list2.add("two");
        list2.add("three");
        list2.add("four");
        list2.add("five"); //list.add(list2);
        list.addAll(list2);
        System.out.println("Now,the list is : "+ list);
        System.out.println("size of list is : "+list.size()); //list.removeAll(list2); //list.retainAll(list2);

        ///*Object obj[]=list.toArray();
        //for(int i=0;i<list.size();i++)
        //	System.out.println("The member is : "+obj[i]);

        for(int i=0; i<list.size(); i++)
            System.out.println(list.get(i));


        System.out.println("The 5th member is : "+list.get(4));
//list.set(4,"Java");
//list.add(4,"Java");
//System.out.println("The List is : "+list);
//System.out.println("The 1st C++ is At : "+list.indexOf("C++"));
//System.out.println("The Last C++ is At : "+list.lastIndexOf("C++"));


    }
}

