package basicquestion;
// to copy one array into another
public class CopyonetoanotherArray {

	public static void main(String[] args) {
		int arr1[]=new int[] {1,2,3,4,5,6};
		int arr2[]=new int[arr1.length];
		for(int i=0; i<arr1.length;i++) {
			arr2[i]=arr1[i];
		}
		System.out.println("Elements of the original array are :");
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
			//System.out.println("Elements of the second array are :");
			//System.out.println(arr2[i]);
		}
		System.out.println("Elements of the copied array are :");
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr2[i]);
	}

}
}

