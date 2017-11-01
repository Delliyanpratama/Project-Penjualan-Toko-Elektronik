import java.util.Scanner;


public class Transaksi {
Scanner input = new Scanner (System.in);
    public String no_transaksi;
	public String nama_transaksi;
	public String jumlah_transaksi;
    public String tgl_transaksi;
    
    public void membuat_transaksi(){
		System.out.println("\n \n \n");
		System.out.println(">>>>>>> MEMBUAT TRANSAKSI <<<<<<<\n");
		System.out.print("Masukan No Transaksi : ");
		no_transaksi = input.nextLine();
		System.out.print("Masukan Nama Transaksi : ");
		nama_transaksi = input.nextLine();
		System.out.print("Masukan Jumlah Transaksi : ");
		jumlah_transaksi = input.nextLine();
		System.out.print("Masukan Tanggal Transaksi : ");
		tgl_transaksi = input.nextLine();
    }
}
