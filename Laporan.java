//package laporan;
import java.util.Scanner;


public class Laporan {
Scanner input = new Scanner (System.in);
    public String  no_lap;
    public String tgl_lap;
	public String periode_lap;
    public String jenis_lap;
	
	public String konfirmasi1;

	
	public void buat_lap(){
		System.out.println("\n \n \n");
		System.out.println(">>>>>>> MEMBUAT LAPORAN <<<<<<<\n");
		System.out.print("Masukan No Laporan : ");
		no_lap = input.nextLine();
		System.out.print("Masukan Tanggal Laporan : ");
		tgl_lap = input.nextLine();
		System.out.print("Masukan Periode laporan : ");
		periode_lap = input.nextLine();
		System.out.print("Masukan Jenis Laporan : ");
		jenis_lap = input.nextLine();	
    }
	
    public void ubah_lap(){
	System.out.println("\n\n\n");
		System.out.println("No Laporan Sebelumnya : "+no_lap);
		System.out.print("Masukan No Laporan Barang Baru : ");
		no_lap = input.nextLine();
		System.out.println("No Laporan Telah Diubah Menjadi : "+no_lap);
		
		System.out.println("Tanggal Laporan Sebelumnya : "+tgl_lap);
		System.out.print("Masukan Tanggal Laporan Yang Baru : ");
		tgl_lap = input.nextLine();
		System.out.println("Tanggal Laporan Telah Diubah Menjadi  : "+tgl_lap);
		
		System.out.println("Periode Laporan Sebelumnya : "+periode_lap);
		System.out.print("Masukan Periode Laporan Yang Baru : ");
		periode_lap = input.nextLine();
		System.out.println("Periode Laporan Telah Diubah Menjadi : "+periode_lap);
		
		System.out.println("Jenis Laporan Sebelumnya : "+jenis_lap);
		System.out.print("Masukan Jenis Laporan Yang Baru : ");
		jenis_lap = input.nextLine();
		System.out.println("Jenis Laporan Telah Diubah Menjadi : "+jenis_lap);
	}
        
		
    public void hapus_lap(){
		System.out.println("\n\n\n");
		System.out.println("No Laporan Yang Akan Dihapus : "+no_lap);
		System.out.println("Tanggal Laporan Yang Akan Dihapus : "+tgl_lap);
		System.out.println("Periode Laporan Yang Akan Dihapus : "+periode_lap);
		System.out.println("Jenis Laporan Yang Akan Dihapus : "+jenis_lap);
		System.out.println("\n");
		System.out.print("Yakin akan menghapus data ini (ya / tidak) ? " );
		konfirmasi1 = input.nextLine();
		if ("ya".equals(konfirmasi1))
		System.out.println("\n"); {
		System.out.println("LAPORAN BERHASIL DIHAPUS.. ");
		}
    }
	
	
    public void cetak(){
		System.out.println("\n \n \n");
		System.out.println(">>>>>>> MENAMPILKAN DATA LAPORAN <<<<<<<\n");
		System.out.println("No Laporan : "+no_lap+"");
        System.out.println("Tanggal Laporan : "+tgl_lap);
        System.out.println("Periode Laporan : "+periode_lap);
		System.out.println("Jenis Laporan : "+jenis_lap);
	}
    
    
}