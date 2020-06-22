# pemlan-05
Praktikum Pemrograman Lanjut Bab 5. Inheritance

1. Pegawai.java
Buatlah class induk Pegawai dengan definisi sebagai berikut
- nama: String
- noIndukPegawai: String
- tahunMasuk: Date
- gajiPokok: double
- keluarga: boolean
- jumlahAnak: int
+ double getGajiPokok()
+ double getBonus()
+ double getTunjangan()
+ double getTotalGaji()
a. Bonus didapatkan dari lama kerja (tahun sekarang dikurangi tahun masuk)
   - Jika masa kerja dibawah 1 tahun tidak mendapat bonus
   - Jika masa kerja 1-5 tahun mendapat bonus 5% x gajiPokok x lama kerja
   - Jika masa kerja diatas 5 tahun mendapat bonus 10% x gajiPokok x lama kerja
b. Tunjangan didapatkan bila pegawai sudah berkeluarga
   - Jika sudah berkeluarga, mendapat tunjangan 5% dari gaji pokok
   - Jika memiliki anak mendapat tunjangan 5% dari gaji pokok per Anak yang dimiliki (maksimal 2 anak)
c. Total gaji diperoleh dari gaji pokok + bonus + tunjangan

2. Manager.java
Buatlah class Manager yang inherit class Pegawai dengan ketentuan Manager mendapat tunjangan jabatan sebesar 10% dari total gaji

3. Sales.java
Buatlah class Sales yang inherit class Pegawai dengan definisi:
- hargaBarang: double
- stockBarang: int
- barangTerjual: int
+ double getBonusTambahan()
Sales memiliki bonusTambahan dengan ketentuan jika barangTerjual lebih dari 70% stockBarang, maka mendapat bonusTambahan 10% dari hargaBarang x barangTerjual
Jika tidak, maka bonusTambahan yang diperoleh hanya 3% dari hargaBarang x barangTerjual

4. Programmer.java
Buatlah class Programmer yang inherit class Pegawai dengan definisi
- jamKerja: int
+ double getBonusLembur()
Freelancer akan mendapat bonusLembur jika jamKerja lebih dari 10 jam, sejumlah 5% x gajiPokok x jamKerja - 10 jam.

Test Case:
1. Pegawai tahunMasuk 2015, berkeluarga, 2 anak, gajiPokok 3jt
2. Pegawai tahunMasuk 2010, tidak berkeluarga, gajiPokok 3jt
3. Pegawai tahunMasuk 2005, berkeluarga, 5 anak, gajiPokok 3jt
4. Manager tahunMasuk 2009, tidak berkeluarga, gajiPokok 4jt
5. Manager tahunMasuk 2014, berkeluarga, 2 anak, gajiPokok 4jt
6. Sales tahunMasuk 2012, berkeluarga, 4 anak, hargaBarang 25rb, stockBarang 100, barangTerjual 50, gajiPokok 2jt
7. Sales tahunMasuk 2014, berkeluarga, 1 anak, hargaBarang 10rb, stockBarang 250, barangTerjual 220, gajiPokok 2jt
8. Freelancer tahunMasuk 2011, tidak berkeluarga, jamKerja 10 jam, gajiPokok 2,5jt
9. Freelancer tahunMasuk 2013, tidak berkeluarga, jamKerja 12 jam, gajiPokok 2,5jt

Tampilkan totalGaji berserta perhitungannya (gajipokok, bonus, tunjangan) dari setiap Test Case

