package gongj;
import java.util.Arrays;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class A220113 { 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		int N = Integer.parseInt(br.readLine());//Ƚ�� �ޱ�
		StringTokenizer st = new StringTokenizer(br.readLine()," ");//������ �������� ���ڿ��и�
		
		int index = 0;//�迭����
		int[] arr = new int[N];//�迭����
		while(st.hasMoreTokens()) {//��ū �� ����������
			arr[index] = Integer.parseInt(st.nextToken());//��ū ��� �־��ְ�
			index++;//�迭��ġ �ٲ��ְ�
		}
		
		Arrays.sort(arr);//�迭 �������� ����
		System.out.print(arr[0] + " " + arr[N - 1]);//ù��°�� ����������
	}

//	public static void main(String[] args) { //10818 
//		int a=0;
//		int arr[];
//		int max=-1000001;
//		int low=1000001;
//		Scanner sc=new Scanner(System.in);
//		a=sc.nextInt();
//		arr = new int[a];
//		
//		for(int i=0;i<a;i++) {
//			arr[i]=sc.nextInt();
//		}
//		
//		for (int i=0;i<a;i++){
//			if(arr[i]>max) {
//				max=arr[i];
//			}
//			if(arr[i]<low) {
//				low=arr[i];
//			}
//		}
//		Arrays.sort(arr);//�迭 �����ϴ°�. ù��°,�������ϸ��.
//		System.out.println(low +" "+ max);
//	}
	
	
//	public static int add(int[] scores) { 
//		int sum=0;
//		for(int i=0;i<3;i++) {
//			sum+=scores[i];
//		}
//		return sum;
//		
//	}
//	
//	public static void main(String[] args) 
//	{
//		int[] scores;
//		scores = new int[]{83,90,87};
//		int sum1=0;
//		for(int i=0;i<3;i++) {
//			sum1+=scores[i];
//		}
//		System.out.println("����:" + sum1);
//		
//		int sum2 = add(new int[] {83,90,87});
//		System.out.println("����:" + sum2);
//		System.out.println();
//		}		
//		int a=0;
//		Scanner sc = new Scanner(System.in);
//		a=sc.nextInt();
//		for (int i = 1; i <= a; i++) {
//			System.out.println(i);
//		}
		

}

