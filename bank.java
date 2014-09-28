
package git;
import java.util.Scanner;
class panggil {
	int pass;
}


public class bank {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int pilih,tarik,saldo,kurang,tabung,hasil;
		saldo = 50000;
		panggil p;
		p =  new panggil();
		
		p.pass=1234;
		
		System.out.println("Masukan password :");
		p.pass = sc.nextInt();
		
		if(p.pass == 1234){
			System.out.println("1. Tarik tunai");
			System.out.println("2. Cek Saldo");
			System.out.println("3. Tabung");
			pilih = sc.nextInt();
			
			if(pilih == 1){
				System.out.println("Saldo anda :"+saldo);
				System.out.println("Uang yang akan di tarik");
				tarik = sc.nextInt();
				kurang = saldo - tarik;
				System.out.println("anda berhasil menarik uang sebesar"+tarik+ "\n  sisa saldo anda :"+kurang);
				
			}
			if(pilih == 2){
				System.out.println("Saldo anda :"+saldo);
				
			}
			if(pilih == 3){
				System.out.println("Berapa uang yang ingin anda tabung");
				tabung = sc.nextInt();
				hasil = saldo + tabung;
				System.out.println("Total Saldo anda :"+hasil);
			}
		}
		else {
			System.out.println("password yang masukan salah");
		}
	}
}
