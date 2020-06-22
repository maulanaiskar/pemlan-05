public class Sales extends Pegawai{
    private double hargaBarang;
    private int stockBarang;
    private int barangTerjual;

    public Sales(String nama,String NIP,int thnMasuk,double gajiPokok,
                 boolean keluarga, int jumlahAnak, double hargaBarang,
                 int stockBarang, int barangTerjual){
        super(nama, NIP, thnMasuk, gajiPokok, keluarga, jumlahAnak);
        this.hargaBarang = hargaBarang;
        this.stockBarang = stockBarang;
        this.barangTerjual = barangTerjual;
    }
    public double getBonusTambahan(){
        double totalBonus = 0;
        int persen = barangTerjual / stockBarang * 100;
        if(persen>70)
            totalBonus = (hargaBarang * barangTerjual) * 0.1;
        else
            totalBonus = (hargaBarang * barangTerjual) * 0.03;
        return totalBonus;
    }

    @Override
    public double getTotalGaji() {
        return super.getTotalGaji() + getBonusTambahan();
    }

}
