package ch5;

public class sort {
	
	static void sortf(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j = i+1; j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int tmp;
					tmp = arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
	}
	void sortf2(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j = i+1; j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int tmp;
					tmp = arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] sort = {100,99,23,52,144,155};
		
//		for(int i=0;i<sort.length-1;i++) {
//			for(int j = i+1; j<sort.length;j++) {
//				if(sort[i]<sort[j]) {
//					int tmp;
//					tmp = sort[i];
//					sort[i]=sort[j];
//					sort[j]=tmp;
//				}
//			}
//		}
		sortf(sort);
		for(int i = 0; i<sort.length;i++) {
			System.out.print(sort[i]+" ");
		}
		System.out.print("\n");
		sort st = new sort();
		st.sortf2(sort);
		for(int i = 0; i<sort.length;i++) {
			System.out.print(sort[i]+" ");
		}

	}

}
