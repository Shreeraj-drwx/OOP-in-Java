public class insertion{
	
	public static void main(String [ ] args){

		int arr[] ={5,4,9,2,4,8,12};
		int length = arr.length;
		int prev = 0;
		int curr = 0;

		for(int i = 0; i < arr.length; i++){
			curr = arr[i];
			prev = i -1;

			while(prev >= 0 && arr[prev] > curr){
				arr[prev+1] = arr[prev];
				prev--;
 			}
 			arr[prev + 1] = curr;

		}

		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
	}
}