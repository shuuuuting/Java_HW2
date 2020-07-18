import java.util.Scanner;
public class Innerproduct{
	 public static void main(String[] args) {
	 	Scanner input = new Scanner(System.in);
	 	System.out.print("請輸入兩個向量的維度:");
	 	int dimension = Integer.parseInt(input.next());
	 	Double[]x = new Double[dimension];
	 	for(int i=0;i<=dimension-1;i++){
	 		System.out.print("第一個向量的第"+(i+1)+"個數：");
	 		x[i] = Double.parseDouble(input.next());
	 	}
		Double[]y = new Double[dimension];
	 	for(int i=0;i<=dimension-1;i++){
	 		System.out.print("第二個向量的第"+(i+1)+"個數：");
	 		y[i] = Double.parseDouble(input.next());
	 	}
	 	System.out.println("=======================");
	 	System.out.printf("兩向量內積：%.2f\n",innerProduct(x,y));
	 	System.out.printf("兩向量夾角的cos值：%.2f\n",cos(x,y));
	 	System.out.printf("兩向量夾角：%.2f\n",Math.acos((cos(x,y))));
	 }
	 static Double innerProduct(Double a[],Double b[]){
	 	Double innerproduct=0.0;
	 	for(int i=0;i<=a.length-1;i++){
	 		innerproduct+=a[i]*b[i];
	 	}
	 	return innerproduct;
	 }
	 static Double cos(Double a[],Double b[]){
	 	Double lengthofa = Math.sqrt(innerProduct(a,a));
	 	Double lengthofb = Math.sqrt(innerProduct(b,b));
	 	Double cosine = innerProduct(a,b)/(lengthofa*lengthofb);
	 	return cosine;
	 }
}