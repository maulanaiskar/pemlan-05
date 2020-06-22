public class Main {
    public static void main(String[] args) {
        Pegawai peg1 = new Pegawai("Ahmad", "001", 2015, 3000000, true, 2);
        Pegawai peg2 = new Pegawai("Budi", "002", 2010, 3000000, false, 0);
        Pegawai peg3 = new Pegawai("Candra", "003", 2005, 3000000, true, 5);

        Manager man1 = new Manager("Deny", "001", 2009, 4000000, false, 0);
        Manager man2 = new Manager("Eko", "001", 2014, 4000000, true, 2);

        Sales sales1 = new Sales("Fahmi", "004", 2012, 2000000, true, 4, 25000, 100, 50);
        Sales sales2 = new Sales("Gina", "004", 2014, 2000000, true, 1, 10000, 250, 220);

        Freelancer freelancer1 = new Freelancer(10, "Hari", "0005", 2011, 2500000, false, 0);
        Freelancer freelancer2 = new Freelancer(12, "Indra", "0005", 2013, 2500000, false, 0);

        System.out.println("Pegawai 1:");
        System.out.println("Gaji pokok : " + peg1.getGajiPokok());
        System.out.println("Bonus Gaji : " + peg1.getBonus());
        System.out.println("Tunjangan Gaji : " + peg1.getTunjangan());
        System.out.println("Total Gaji : " + peg1.getTotalGaji());

        System.out.println("\nPegawai 2:");
        System.out.println("Gaji pokok : " + peg2.getGajiPokok());
        System.out.println("Bonus Gaji : " + peg2.getBonus());
        System.out.println("Tunjangan Gaji : " + peg2.getTunjangan());
        System.out.println("Total Gaji : " + peg2.getTotalGaji());

        System.out.println("\nPegawai 3:");
        System.out.println("Gaji pokok : " + peg3.getGajiPokok());
        System.out.println("Bonus Gaji : " + peg3.getBonus());
        System.out.println("Tunjangan Gaji : " + peg3.getTunjangan());
        System.out.println("Total Gaji : " + peg3.getTotalGaji());

        System.out.println("\nManager 1:");
        System.out.println("Gaji pokok : " + man1.getGajiPokok());
        System.out.println("Bonus Gaji : " + man1.getBonus());
        System.out.println("Tunjangan Gaji : " + man1.getTunjangan());
        System.out.println("Tunjangan Jabatan : " + man1.getTunjanganJabatan());
        System.out.println("Total Gaji : " + man1.getTotalGaji());

        System.out.println("\nManager 2:");
        System.out.println("Gaji pokok : " + man2.getGajiPokok());
        System.out.println("Bonus Gaji : " + man2.getBonus());
        System.out.println("Tunjangan Gaji : " + man2.getTunjangan());
        System.out.println("Tunjangan Jabatan : " + man2.getTunjanganJabatan());
        System.out.println("Total Gaji : " + man2.getTotalGaji());

        System.out.println("\nSales 1:");
        System.out.println("Gaji pokok : " + sales1.getGajiPokok());
        System.out.println("Bonus Gaji : " + sales1.getBonus());
        System.out.println("Tunjangan Gaji : " + sales1.getTunjangan());
        System.out.println("Bonus Tambahan : " + sales1.getBonusTambahan());
        System.out.println("Total Gaji : " + sales1.getTotalGaji());

        System.out.println("\nSales 2:");
        System.out.println("Gaji pokok : " + sales2.getGajiPokok());
        System.out.println("Bonus Gaji : " + sales2.getBonus());
        System.out.println("Tunjangan Gaji : " + sales2.getTunjangan());
        System.out.println("Bonus Tambahan : " + sales2.getBonusTambahan());
        System.out.println("Total Gaji : " + sales2.getTotalGaji());

        System.out.println("\nFreelancer 1:");
        System.out.println("Gaji pokok : " + freelancer1.getGajiPokok());
        System.out.println("Bonus Gaji : " + freelancer1.getBonus());
        System.out.println("Tunjangan Gaji : " + freelancer1.getTunjangan());
        System.out.println("Bonus Lembur : " + freelancer1.getBonusLembur());
        System.out.println("Total Gaji : " + freelancer1.getTotalGaji());

        System.out.println("\nFreelancer 2:");
        System.out.println("Gaji pokok : " + freelancer2.getGajiPokok());
        System.out.println("Bonus Gaji : " + freelancer2.getBonus());
        System.out.println("Tunjangan Gaji : " + freelancer2.getTunjangan());
        System.out.println("Bonus Lembur : " + freelancer2.getBonusLembur());
        System.out.println("Total Gaji : " + freelancer2.getTotalGaji());
    }
}