import java.util.Scanner;

public class IfExample{
	public static void main(String[] args){
		int age=0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Masukkan umur Anda:");
		age = sc.nextInt();

		if(age>=17)
			System.out.print("Anda sudah boleh buat KTP");
	}
}