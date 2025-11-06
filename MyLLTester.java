public class MyLLTester
{
  public static void main(String [] args)
  {

    MyLinkedList leo = new MyLinkedList();
    MyLinkedList liam = new MyLinkedList();
    MyLinkedList chris = new MyLinkedList();
    
    System.out.println(leo.size());
    System.out.println(leo.isEmpty());
    leo.toString();
    leo.add("Yuzhe");
    leo.addFirst("Leo");
    leo.addLast("Wang");

    System.out.println(liam.size());
    System.out.println(liam.isEmpty());
    liam.toString();
    liam.addLast("Gillaspy");
    liam.addFirst("Liam");
    liam.add("Nice");

    System.out.println(chris.size());
    System.out.println(chris.isEmpty());
    chris.toString();
    chris.addFirst("Christopher");
    chris.add("Wong");
    chris.addLast("Lee");
    
    System.out.println(leo.set(1, "Thomas"));
    System.out.println(leo.get(1));
    
    System.out.println(liam.set(2, "Cool"));
    System.out.println(liam.get(2));
    
    System.out.println(chris.set(0, "Chris"));
    System.out.println(chris.get(0));
  }// end main
}// end class

