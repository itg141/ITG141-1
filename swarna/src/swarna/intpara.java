package swarna;
class Stint
{
	public int sub(int a,int b)
	{
		return a-b;
	}
	public String dis(String a,int b)
	{
		return a+b;
	}
}

public class intpara {
public static void main(String args[]) {
	Stint st= new Stint();
	System.out.println(st.sub(15,4));
	System.out.println(st.dis("Raja", 07));
}
}
