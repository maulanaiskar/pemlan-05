import java.util.Date;

public class Pegawai {
    protected String nama;
    protected String noIndukPegawai;
    protected int tahunMasuk;
    protected double gajiPokok;
    protected boolean keluarga;
    protected int jumlahAnak;

    public Pegawai(String nama, String NIP, int thnMasuk, double gajiPokok,
                   boolean keluarga, int jumlahAnak) {
        this.nama = nama;
        this.noIndukPegawai = NIP;
        this.tahunMasuk = thnMasuk;
        this.gajiPokok = gajiPokok;
        this.keluarga = keluarga;
        this.jumlahAnak = jumlahAnak;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public double getBonus() {
        double bonus = 0;

        int thnSekarang = 1900;
        thnSekarang += new Date().getYear();
        int lama = thnSekarang - tahunMasuk;
        if (lama > 1)
            bonus += (0.05 * gajiPokok * lama);
        else if (lama > 5)
            bonus += (0.1 * gajiPokok * lama);

        return bonus;
    }

    public double getTunjangan() {
        int tunjangan = 0;
        int anak = jumlahAnak;
        if (keluarga) {
            tunjangan += (0.05 * gajiPokok);
            if (anak > 2) anak = 2;
            tunjangan += (0.05 * gajiPokok * anak);
        }
        return tunjangan;
    }

    public double getTotalGaji() {
        return getGajiPokok() + getBonus() + getTunjangan();
    }
}