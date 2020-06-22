public class Freelancer extends Pegawai {
    private int jamKerja;

    public Freelancer(int jamKerja, String nama, String NIP, int thnMasuk, double gajiPokok, boolean keluarga, int jumlahAnak) {
        super(nama, NIP, thnMasuk, gajiPokok, keluarga, jumlahAnak);
        this.jamKerja = jamKerja;
    }

    public double getBonusLembur() {
        double bonus = 0;
        if (jamKerja > 10) {
            bonus = 0.05 * gajiPokok * (jamKerja - 10);
        }
        return bonus;
    }

    @Override
    public double getTotalGaji() {
        return super.getTotalGaji() + getBonusLembur();
    }
}