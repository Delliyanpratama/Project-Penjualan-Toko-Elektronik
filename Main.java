//package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	
		Scanner input = new Scanner (System.in);
		String menu, brg, lapor;
		
		System.out.println("Menu Utama : ");
		System.out.println("\t - Laporan");
		System.out.println("\t - Admin");
		System.out.println("\t - Transaksi");
		System.out.println("\t - Barang");
		System.out.print("\nSilahkan Pilih Menu Yang Akan Ditampilkan : ");
		menu = input.nextLine();
		
		if("Laporan".equals(menu)) {
			Laporan lap = new Laporan();
			lap.buat_lap();
			System.out.print("\nKelola Laporan : (ubah / hapus / cetak) ?");
			lapor = input.nextLine();
			if ("ubah".equals(lapor)) {
			lap.ubah_lap();
			} else if ("hapus".equals(lapor)) {
			lap.hapus_lap();
			} else if ("cetak".equals(lapor)) {
			lap.cetak();
			}
			}			
			
			
		else if ("Barang".equals(menu)) {
			Barang BR = new Barang();	
			BR.tambah_brg();
			System.out.print("\nKelola Barang : (ubah / hapus / jual / retur) ?");
			brg = input.nextLine();
			if ("ubah".equals(brg)) {
			BR.ubah_brg();
			} else if ("hapus".equals(brg)) {
			BR.hapus_brg();
			} else if ("jual".equals(brg)) {
			BR.jual_brg();
			} else if ("retur".equals(brg)) {
			BR.retur_brg();
			}
			}
			
			
		else if ("Transaksi".equals(menu)) {
			Transaksi Trans = new Transaksi();
			Trans.membuat_transaksi();
			}
		
		else if ("Admin".equals(menu)) {
			Admin ADM = new Admin();
			ADM.menginput_admin();
			ADM.menampilkan_data_admin();
		}
		}
		
		
    }
    
	
