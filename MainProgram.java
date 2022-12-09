import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args){

        //membuat objek HP
        Phone redmiNote8 = new Xiaomi();

        // membuat objek user
        PhoneUser johan = new PhoneUser(redmiNote8);

        //mencoba menyalakan HP
        johan.turnOnThePHone();

        //menjadikan satu program
        Scanner input = new Scanner(System.in);
        String aksi;

        while (true){
            System.out.println("=== APLIKASI INTERFACE ===");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[0] Keluar");
            System.out.println("===========================");
            System.out.println("Pilih Aksi>");
            aksi = input.nextLine();

            if(aksi.equalsIgnoreCase("1")){
                johan.turnOnThePHone();
            }else if(aksi.equalsIgnoreCase("2")){
                johan.turnOffThePHone();
            }else if(aksi.equalsIgnoreCase("3")){
                johan.makePhoneLouder();
            }else if(aksi.equalsIgnoreCase("4")){
                johan.makePhoneSilent();
            }else if(aksi.equalsIgnoreCase("0")){
                System.exit(0);
            }else{
                System.out.println("Kamu memilih aksi yang salah!");
            }
        }
    }
}
