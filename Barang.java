//package barang;

import java.util.Scanner;

public class Barang {

Scanner input = new Scanner (System.in);
    public String nama_brg;
    public String no_stok_brg;
    public String jenis_brg;
    public String suplier;
	public String jumlah_brg;
	public String harga_brg;
	
	public String konfirmasi1, konfirmasi2, konfirmasi3;
    
    public void jual_brg(){
		System.out.println("\n\n\n");
		System.out.println("Nama Barang : "+nama_brg);
		System.out.println("No Stok Barang  : "+no_stok_brg);
		System.out.println("Jenis Barang  : "+jenis_brg);
		System.out.println("Suplier Barang : "+suplier);
		System.out.println("Jumlah Barang : "+jumlah_brg);
		System.out.println("Harga Barang : "+harga_brg);
		System.out.println("\n");
		System.out.print("Apakah Mau Melanjutkan Penjualan (ya / tidak) ? " );
		konfirmasi1 = input.nextLine();
		if ("ya".equals(konfirmasi1)) {
		System.out.println("\n");
		System.out.println("Barang Telah Terjual.. ");
    }
}    
    public void retur_brg(){
		System.out.println("\n\n\n");
		System.out.println("Nama Barang Yang di Retur : "+nama_brg);
		System.out.println("No Stok Barang Yang Akan Diretur  : "+no_stok_brg);
		System.out.println("Jenis Barang Yang Diretur  : "+jenis_brg);
		System.out.println("Suplier Barang Yang Diretur : "+suplier);
		System.out.println("Jumlah Barang Yang Diretur : "+jumlah_brg);
		System.out.println("Harga Barang Yang Diretur : "+harga_brg);
		System.out.println("\n");
		System.out.print("Apakah Barang Akan Diretur (ya / tidak) ? " );
		konfirmasi3 = input.nextLine();
		if ("ya".equals(konfirmasi3)) {
		System.out.println("\n");
		System.out.println("Data Retur Sekses.. ");
    }
}
    public void tambah_brg(){
		System.out.println("\n \n \n");
		System.out.println(">>>>>>> MASUKAN DATA BARANG <<<<<<<\n");
		System.out.print("Masukan Nama Barang : ");
		nama_brg = input.nextLine();
		System.out.print("Masukan No Stock Barang Baru : ");
		no_stok_brg = input.nextLine();
		System.out.print("Masukan Jenis Barang : ");
		jenis_brg = input.nextLine();
		System.out.print("Masukan Suplier Barang : ");
		suplier = input.nextLine();
		System.out.print("Masukan Jumlah Barang : ");
		jumlah_brg = input.nextLine();
		System.out.print("Masukan Harga Barang : ");
		harga_brg = input.nextLine();	
    }
    public void ubah_brg(){
		System.out.println("\n\n\n");
		System.out.println("Nama Barang Sebelumnya : "+nama_brg);
		System.out.print("Masukan Nama Barang Baru : ");
		nama_brg = input.nextLine();
		System.out.print("Nama Barang Telah Diubah Menjadi : "+no_stok_brg);
		
		System.out.println("No Stock Sebelumnya : "+no_stok_brg);
		System.out.print("Masukan No Stok Baru : ");
		no_stok_brg = input.nextLine();
		System.out.print("No Stock Telah Diubah Menjadi  : "+no_stok_brg);
		
		System.out.println("Jenis Barang Sebelumnya : "+jenis_brg);
		System.out.print("Masukan Jenis Barang Baru : ");
		jenis_brg = input.nextLine();
		System.out.print("Jenis Barang Telah Diubah Menjadi : "+jenis_brg);
		
		System.out.println("Suplier Barang Sebelumnya : "+suplier);
		System.out.print("Masukan Suplier Barang Baru : ");
		nama_brg = input.nextLine();
		System.out.print("Suplier Barang Telah Diubah Menjadi : "+suplier);
		
		System.out.println("Jumlah Barang Sebelumnya : "+jumlah_brg);
		System.out.print("Masukan Jumlah Barang Baru : ");
		nama_brg = input.nextLine();
		System.out.print("Jumlah Barang Telah Diubah Menjadi : "+jumlah_brg);
		
		System.out.println("Harga Barang Sebelumnya : "+harga_brg);
		System.out.print("Masukan Harga Barang Baru : ");
		nama_brg = input.nextLine();
		System.out.print("Harga Barang Telah Diubah Menjadi : "+harga_brg);
		}
		
	public void hapus_brg(){
		System.out.println("\n\n\n");
		System.out.println("Nama Barang Yang Akan Dihapus : "+nama_brg);
		System.out.println("No Stok Barang Yang Akan Dihapus : "+no_stok_brg);
		System.out.println("Jenis Barang Yang Akan Dihapus : "+jenis_brg);
		System.out.println("Suplier Barang Yang Akan Dihapus : "+suplier);
		System.out.println("Jumlah Barang Yang Akan Dihapus : "+jumlah_brg);
		System.out.println("Harga Barang Yang Akan Dihapus : "+harga_brg);
		System.out.print("Yakin akan menghapus data ini (ya / tidak) ? " );
		konfirmasi2 = input.nextLine();
		if ("ya".equals(konfirmasi2)) {
		nama_brg = "-";
		System.out.println("Barang Telah di Hapus.. \nNama barang : "+nama_brg);
		}
	}
}
