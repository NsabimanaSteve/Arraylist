import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListPractice{
    public static void main(String[] args){
        
        // 1. Non-Generic ArrayList
        ArrayList mixedList = new ArrayList();
        mixedList.add("Java");
        mixedList.add(123);
        mixedList.add(45.67);
        mixedList.add(true);
        System.out.println("List of mixedList: "+ numberList);

        // 2. Generic ArrayList

        ArrayList<Integer> numberList= new ArrayList<>();
        numberList.add(10);
        numberList.add(20);
        numberList.add(30);
        numberList.add(40);
        numberList.add(50);
        System.out.println("List of NumberList: "+ numberList);

        System.out.println();

        // 3. Accessing and Displaying Elements
        System.out.println("Elements of mixedList:");
        for (int i =0; i < mixedList.size(); i++){
            System.out.println(mixedList.get(i));
        }
        System.out.println();
        int sumNumberList = 0;
        for (int numberLists:numberList){
            sumNumberList +=numberLists;
        }
        System.out.println("The sum of all numbers: " + sumNumberList);
        System.out.println();

        // 4. Manipulating Elements

        mixedList.remove("Java");
        System.out.println("Mixed List is after remove Java: " + mixedList);

        System.out.println();
        numberList.add(2,777);
        System.out.println("Number List is after add 777: " + numberList);

        // 5. Iterating Over Elements
        System.out.println();
        System.out.println("Elements for numberList are: ");
        for (int i = 0; i < numberList.size();i++){
            System.out.println(numberList.get(i));
        }

        System.out.println("Elements of mixedList using Iterator:");
        Iterator iterator = mixedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
       
        
    } 

}

