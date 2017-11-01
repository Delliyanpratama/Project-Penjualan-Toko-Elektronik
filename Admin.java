
import java.util.Scanner;

public class Admin {
Scanner input = new Scanner (System.in);
	public String id_admin;
    public String nama_admin;
    public String alamat_admin;
	
    public void menginput_admin(){
		System.out.println("\n \n \n");
		System.out.println(">>>>>>> SILAHKAN MASUKAN DATA ADMIN <<<<<<<\n");
		System.out.print("Masukan No Id : ");
		id_admin = input.nextLine();
		System.out.print("Masukan Nama : ");
		nama_admin = input.nextLine();
		System.out.print("Masukan Alamat Lengkap : ");
		alamat_admin = input.nextLine();	
    }

	
	public void menampilkan_data_admin(){
		System.out.println("\n \n \n");
		System.out.println(">>>>>>> MENAMPILKAN DATA ADMIN <<<<<<<\n");
		System.out.println("Id Admin : "+id_admin);
        System.out.println ("Nama Admin : "+nama_admin);
        System.out.println ("Alamat Admin : "+alamat_admin);
    }
}
    
   
    

