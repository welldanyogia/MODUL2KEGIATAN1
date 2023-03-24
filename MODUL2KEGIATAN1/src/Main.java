import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. Buat object ArrayList kosong
        ArrayList<String> hewan = new ArrayList<>();

        // Isi ArrayList dengan nama-nama hewan
        hewan.add("Angsa");
        hewan.add("Bebek");
        hewan.add("Cicak");
        hewan.add("Domba");
        hewan.add("Elang");
        hewan.add("Gajah");

        // 2. Tambahkan elemen "Badak" dan "Bebek", hitung jumlah "Bebek", dan tampilkan posisi index dari "Bebek"
        hewan.add("Badak");
        hewan.add("Bebek");
        int countBebek = 0;
        System.out.println("========2========");
        System.out.println(hewan);
        for (int i = 0; i < hewan.size(); i++) {
            if (hewan.get(i).equals("Bebek")) {
                countBebek++;
                System.out.println("Index of Bebek: " + i);
            }
        }
        System.out.println("Jumlah Bebek : "+countBebek);
        System.out.println("================");

        // 3. Hapus posisi "Bebek" yang pertama
        System.out.println("=======3========");
        hewan.remove("Bebek");
        System.out.println(hewan);
        System.out.println("================");

        // 4. Tampilkan elemen pada index ke-0 dan ke-2, selanjutnya hapus index ke-0
        System.out.println("=======4========");
        System.out.println("Element at index 0: " + hewan.get(0));
        System.out.println("Element at index 2: " + hewan.get(2));
        hewan.remove(0);
        System.out.println(hewan);
        System.out.println("================");

        // 5. Ubahlah index ke-0 dari "Cicak" Menjadi "Ular", selanjutnya tambahkan elemen baru pada index ke-2 dengan "Itik"
        System.out.println("=======5========");
        hewan.set(0, "Ular");
        System.out.println(hewan);
        hewan.add(2, "Itik");
        System.out.println(hewan);
        System.out.println("================");

        // 6. Hapus elemen diantara index ke-1 dan ke-5
        System.out.println("=======6========");
        hewan.remove(2);
        hewan.remove(3);
        hewan.remove(4);
        System.out.println(hewan);
        System.out.println("================");

        // 7. Tampilkan elemen pertama dan terakhir
        System.out.println("=======7========");
        System.out.println("First element: " + hewan.get(0));
        System.out.println("Last element: " + hewan.get(hewan.size() - 1));
        System.out.println(hewan);
        System.out.println("================");

        // 8. Tampilkan jumlah elemen pada ArrayList
        System.out.println("=======8========");
        System.out.println("Number of elements: " + hewan.size());
        System.out.println(hewan);
        System.out.println("================");

        // 9. Carilah posisi index dari "Badak"
        System.out.println("=======9========");
        Scanner inp = new Scanner(System.in);
        System.out.println("Masukkan Hewan yang ingin anda cari : ");
        String input = inp.nextLine();
        System.out.println("Index of Badak: " + hewan.indexOf(input));
        System.out.println("================");
    }
}
