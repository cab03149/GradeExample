public class kwon {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]grade={
				{1,3,2,4,3,1,4,2,2,1},
				{3,2,4,2,2,1,1,3,4,1},
				{2,4,3,2,1,2,1,3,3,4},
				{4,3,3,1,1,3,2,2,4,4},
				{5,1,1,2,4,1,2,3,1,3}};
		int []answer=new int[10];
		String []ox=new String[10];
		double []angrade={10,5,8,8,6,4,10,3.4,5,8,8,6,4,7,3.6,4};
		double sum=0;
		for(int i=0;i<5;i++){
			System.out.print("학생"+(i+1));
			for(int j=0; j<10; j++){
				System.out.print(" "+grade[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		
		System.out.print("정답 : ");
		for(int i=0; i<args.length; i++){
			System.out.print(args[i]+" ");
			answer[i]=Integer.parseInt(args[i]);
		}
		System.out.println();
		
		for(int i=0;i<5;i++){
			sum=0;
			System.out.print("학생"+(i+1)+"의 점수 : ");
			for(int j=0; j<10; j++){
				if(grade[i][j]==answer[j]){
					sum+=angrade[j];
					ox[j]="O";
				}else{
					ox[j]="X";
				}
			}
			System.out.print(sum+"점");
			System.out.println();
			for(int k=0;k<10;k++)
				System.out.print(ox[k]);
			System.out.println();
		}

	}
}