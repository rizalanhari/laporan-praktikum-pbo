# Laporan Praktikum #2 - Class dan Object

## Kompetensi

* Mahasiswa dapat memahami deskripsi dari class dan object
* Mahasiswa memahami implementasi dari class
* Mahasiswa dapat memahami implementasi dari attribute
* Mahasiswa dapat memahami implementasi dari method
* Mahasiswa dapat memahami implementasi dari proses instansiasi
* Mahasiswa dapat memahami implementasi dari try-catch
* Mahasiswa dapat memahami proses pemodelan class diagram menggunakan UML

## Ringkasan Materi

1. Class dan Objek 
   Secara singkat class adalah abstraksi dari sebuah object (nyata ataupun tdk nyata) (roger s pressman). Apabila kita ingin membuat class mahasiswa, maka kita perlu melakukan abstraksi (mengindikasi bagian – bagian penting yang merepresentasikan benda itu sendiri) dari object mahasiswa itu sendiri.
2. Attribute
   Aturan penulisan atribut adalah sebagai berikut:
   * Berupa kata benda,
   * Diawali dengan HURUF KECIL,
   * Jika terdiri dari 2 atau lebih kata, kata pertama diawali HURUF KECIL sedangkan kata selanjutnya diawali HURUF BESAR. Dan antar kata disambung tidak (dipisah).
4. Method
   Method adalah suatu blok dari program yang berisi kode program nama dan properti yang dapat digunakan kembali. Method dapat mempunyai nilai balik atau tidak
   Aturan penulisan method adalah sebagai berikut:
   * Berupa kata kerja
   * Diawali dengan HURUF KECIL,
   * Jika terdiri dari 2 atau lebih kata, kata pertama diawali HURUF KECIL sedangkan kata selanjutnya diawali HURUF BESAR. Dan antar kata disambung tidak (dipisah).
5. Object
   ekumpulan software yang terdiri dari variable dan method-method yang terkait. Objek juga merupakan benda nyata yang di buat berdasarkan rancangan yang di definisikan di dalam class
6. Try – catch
   Untuk menangani error di Java, digunakan sebuah statement yang bernama try - catch. Statement tersebut digunakan untuk mengurung eksekusi yang menampilkan error dan dapat membuat program tetap berjalan tanpa dihentikan secara langsung. Error yang ditangani oleh try – catch biasa disebut dengan exception.

## Percobaan

### Percobaan 1

Membuat Class Diagram

Dalam suatu perusahaan salah satu data yang diolah adalah data karyawan. Setiap karyawan memiliki id, nama, jenis kelamin, jabatan, jabatan, dan gaji. Setiap mahasiswa juga bisa menampilkan data diri pribadi dan melihat gajinya.

1. Gambarkan desain class diagram dari studi kasus 1!
   ![](img/classdiagramKaryawan1841720218Rizal.png)

2. Sebutkan Class apa saja yang bisa dibuat dari studi kasus 1!
   * Karyawan1841720218RIzal
   * KaryawanMain1841720218Rizal

3. Sebutkan atribut beserta tipe datanya yang dapat diidentifikasi dari masing-masing class dari studi kasus 1!
   * String mId
   * String mNama
   * String  mJabatan
   * char mJenisKelamin
   * int mGaji

4. Sebutkan method-method yang sudah anda buat dari masing-masing class pada studi kasus 1!
   * public Karyawan1841720218Rizal(String mId, String mNama, String mJabatan, char mJenisKelamin, int mGaji)
   * void tampilDataRizal()

![](img/Karyawan1841720218Rizal.png)

[kode program](../../src/2_Class_dan_Object/Percobaan/Karyawan1841720218Rizal.java)

### Percobaan 2

Membuat program berdasarkan class diagram Mahasiswa

![](img/TestMahasiswa1841720218Rizal.png)

[kode program](../../src/2_Class_dan_Object/Percobaan/Mahasiswa1841720218Rizal.java)

1. Jelaskan pada bagian mana proses pendeklarasian atribut pada program diatas!

        public int nim;
        public String nama;
        public String alamat;
        public String kelas;

2. Jelaskan pada bagian mana proses pendeklarasian method pada program diatas!

        public void tampilBiodata(){
            System.out.println("Nim     : "+nim);
            System.out.println("Nama    : "+nama);
            System.out.println("Alamat  : "+alamat);
            System.out.println("Kelas   : "+kelas);
        }

3. Berapa banyak objek yang di instansiasi pada program diatas!

        satu
        Mahasiswa1841720218Rizal mhs1 = new Mahasiswa1841720218Rizal();

4.  Apakah yang sebenarnya dilakukan pada sintaks program “mhs1.nim=101” ?

        Objek memanggil atribut nim yang diisi dengan nilai 101

5.  Apakah yang sebenarnya dilakukan pada sintaks program “mhs1.tampilBiodata()” ?

        Objek memanggil method tampilBiodataRizal()

6.  Instansiasi 2 objek lagi pada program diatas!

![](img/Percobaan2no12.png)

[kode program](../../src/2_Class_dan_Object/Percobaan/TestMahasiswa1841720218Rizal.java)

### Percobaan3

Menulis method yang memiliki argument/parameter dan memiliki return

![](img/TestBarang1841720218Rizal.png)
[kode program](../../src/2_Class_dan_Object/Percobaan/Barang1841720218Rizal.java)

7. Apakah fungsi argumen dalam suatu method?

        Untuk menentukan nilai atau merubah suatu nilai

8. Ambil kesimpulan tentang kegunaan dari kata kunci return , dan kapan suatu method harus memiliki return!

        return berfungsi untuk mengembalikan/mengeluarkan suatu nilai, 
        method dengan tipe data bukan void haru menggunakan return

## Tugas

### Tugas1

![](img/PersewaanVideoMain1841720218Rizal.png)
[kode program](../../src/2_Class_dan_Object/Tugas/PersewaanVideo1841720218Rizal.java)

[kode program main](../../src/2_Class_dan_Object/Tugas/PersewaanVideoMain1841720218Rizal.java)

### Tugas2

![](img/LingkaranMain1841720218Rizal.png)
[kode program](../../src/2_Class_dan_Object/Tugas/Lingkaran1841720218Rizal.java)

[kode program main](../../src/2_Class_dan_Object/Tugas/LingkaranMain1841720218Rizal.java)

### Tugas3

![](img/BarangTugasMain1841720218Rizal.png)
[kode program](../../src/2_Class_dan_Object/Tugas/BarangTugas1841720218Rizal.java)

[kode program main](../../src/2_Class_dan_Object/Tugas/BarangTugasMain1841720218Rizal.java)

## Kesimpulan

* Memahami materi object
* Mengetahui nilai balik method
* Memahami materi Pemrograman Orientasi Objek

## Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,

***(Rizal Anhari)***