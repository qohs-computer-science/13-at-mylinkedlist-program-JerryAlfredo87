public class MyLLTester
{
  public static void main(String [] args)
  {

    MyLinkedList leo = new MyLinkedList();
    MyLinkedList liam = new MyLinkedList();
    MyLinkedList chris = new MyLinkedList();
    
    System.out.println(leo.size());
    System.out.println(leo.isEmpty());
    System.out.println("Leo List:\n"+leo.toString()+"\nend\n");
    leo.add("Yuzhe");
    leo.addFirst("Leo");
    leo.addLast("Wang");
    System.out.println("Leo List:\n"+leo.toString()+"\nend\n");
    System.out.println(leo.set(1, "Thomas"));
    System.out.println(leo.get(1));
    System.out.println(leo.remove(1));
    leo.add("Yuzhe");
    System.out.println("Leo List:\n"+leo.toString()+"\nend\n");
    System.out.println(leo.size());
    System.out.println(leo.isEmpty());//last of leo

    System.out.println(liam.size());
    System.out.println(liam.isEmpty());
    System.out.println("Liam List:\n"+liam.toString()+"\nend\n");
    liam.addLast("Gillaspy");
    liam.addFirst("Liam");
    liam.add("Nice");
    System.out.println("Liam List:\n"+liam.toString()+"\nend\n");
    System.out.println(liam.set(2, "Cool"));
    System.out.println(liam.get(2));
    System.out.println(liam.removeLast());
    System.out.println("Liam List:\n"+liam.toString()+"\nend\n");
    System.out.println(liam.size());
    System.out.println(liam.isEmpty());//last of liam

    System.out.println(chris.size());
    System.out.println(chris.isEmpty());
    System.out.println("Chris List:\n"+chris.toString()+"\nend\n");
    chris.addFirst("Christopher");
    chris.add("Wong");
    chris.addLast("Lee");
    System.out.println("Chris List:\n"+chris.toString()+"\nend\n");
    System.out.println(chris.set(0, "Chris"));
    System.out.println(chris.get(0));
    System.out.println(chris.removeFirst());
    System.out.println(chris.set(0, "Christopher"));
    System.out.println(chris.get(0));
    System.out.println("Chris List:\n"+chris.toString()+"\nend\n");
    System.out.println(chris.size());
    System.out.println(chris.isEmpty());//last of chris
  }// end main
}// end class

