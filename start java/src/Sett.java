
	import java.util.HashSet;
	
	import java.util.Set;

	public class Sett {

	public static void main (String args[])

	{
	Set<String> l1=new HashSet<String>();
	l1.add("Sagar");
	l1.add("Chowdary");
	l1.add("siva rama krishna");
	l1.add("vimala");
	l1.add("sowmya chowdary");
	System.out.println("1"+l1);
	Set<String> l2=new HashSet<String>();
	l2.add("dad");
	l2.add("mom");
	l2.add("son");
	l2.add("daughther");
	System.out.println(l2);
	l1.addAll(l2);
	System.out.println(l1);
	l1.remove("surya");
	System.out.println(l1);
	l1.retainAll(l2);
	System.out.println(l1);
	l1.removeAll(l2);
	System.out.println(l1);
	int size=l2.size();
	System.out.println(size);
	l2.clear();
	System.out.println(l2);

	}

	}






