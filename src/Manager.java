public class Manager extends Pegawai{

    public Manager(String nama,String NIP,int thnMasuk,double gajiPokok,
                   boolean keluarga, int jumlahAnak){
        super(nama, NIP, thnMasuk, gajiPokok, keluarga, jumlahAnak);
    }
    public double getTunjanganJabatan(){
        return super.getTotalGaji() * 0.1;
    }


    @Override
    public double getTotalGaji() {
        return super.getTotalGaji() + getTunjanganJabatan();
    }
}
