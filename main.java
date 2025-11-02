package TUGAS_RPL;
public class main {
    public static void main(String[] args) {
        dosen dosenPaijo = new dosen("Dr. Paijo", "12345");

        mahasiswa mhsBudi = new mahasiswa("Budi", "001");
        mahasiswa mhsAni = new mahasiswa("Ani", "002");

        dosenPaijo.tambahMahasiswaBimbingan(mhsBudi);
        dosenPaijo.tambahMahasiswaBimbingan(mhsAni);

        System.out.println( "\n---Verifikasi Data---");
        dosenPaijo.lihatDaftarBimbingan();
        mhsBudi.belajar();
    }
}

