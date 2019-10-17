/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118029.latihan40.warnakepribadian;

import java.util.Scanner;

/**
 *
 * @author acer
 * Nama  : Azis komara
 * Nim   : 10118029
 * Kelas : IF-1 
 * Deskripsi program : Program ini menampilkan warna kepribadian
 * 
 */
public class IF0110118029Latihan40Warnakepribadian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String warnaDiri;
        String nama;
        
        Scanner scanner = new Scanner(System.in);
        warnakepribadian warnakepribadian = new warnakepribadian();

        System.out.println("YUK CEK KEPRIBADIANMU DARI WARNA Favoritmu"+warnakepribadian.RED+warnakepribadian.GREEN+warnakepribadian.YELLOW+warnakepribadian.CYAN+warnakepribadian.PURPLE+warnakepribadian.BLUE+warnakepribadian.RESET);
        System.out.println(warnakepribadian.BGRED +warnakepribadian.WHITE+"       MERAH       ");
        System.out.println(warnakepribadian.BGGREEN+warnakepribadian.WHITE+"       HIJAU       ");
        System.out.println(warnakepribadian.BGYELLOW+warnakepribadian.WHITE+"       KUNING      ");
        System.out.println(warnakepribadian.BGBLUE+warnakepribadian.WHITE+"       BIRU        ");
        System.out.println(warnakepribadian.BGMAGENTA+warnakepribadian.WHITE+"       UNGU        ");
        
        System.out.print(warnakepribadian.RESET+"\nPILIH WARNA FAVORITMU\t: ");
        warnaDiri = scanner.nextLine();
        
        System.out.print("NAMA KAMU\t\t: ");
        nama = scanner.nextLine();
        
        System.out.printf("\n===HASIL TEST KEPRIBADIAN %s===%n",nama.toUpperCase());
        warnakepribadian.warnaPribadi(warnaDiri);
    }
    
}
