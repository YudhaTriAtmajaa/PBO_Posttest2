# PBO_Posttest2

## Deskripsi Program
Program ini adalah aplikasi sederhana berbasis Java yang berfungsi untuk mengelola inventaris bahan dapur. User dapat melakukan operasi CRUD (Create, Read, Update, Delete). Program menyimpan data setiap bahan berupa:
* Nama bahan
* Jumlah stok
* Satuan (kg/liter/pcs)
* Tanggal kadaluarsa (format dd-mm-yyyy)

## Fitur Utama
1. Tambah Bahan -> Menambahkan data baru ke inventaris.
2. Lihat Inventaris -> Menampilkan semua bahan dalam bentuk tabel.
3. Update Bahan -> Mengubah data bahan tertentu berdasarkan nomor urut.
4. Hapus Bahan -> Menghapus bahan dari daftar inventaris.
5. Cari Bahan -> Untuk mencari bahan dengan keyword untuk memudahkan pengguna
6. Keluar -> Mengakhiri program.

# Menerapkan packages, memisahkan class, dan MVC berdasarkan fungsinya
- packages main > MainApp.java
- packages service > Inventaris.java
- packages model > Bahan.java

<img width="264" height="201" alt="image" src="https://github.com/user-attachments/assets/73e8c9b6-a16c-4615-8a30-e699cea512d6" />

terdapat 3 class masing-masing dengan fungsi yang berbeda

- Main dan MainApp
<img width="216" height="47" alt="image" src="https://github.com/user-attachments/assets/844a4cca-f7d1-469c-bc81-4e3ffe30ba3e" />

Class MainApp berfungsi sebagai program utama yang menyediakan menu interaktif berbasis console untuk mengelola inventaris dapur. Melalui class ini, pengguna dapat menambah, melihat, memperbarui, menghapus, dan mencari data bahan. MainApp bertindak sebagai penghubung antara input pengguna dengan logika operasional yang dijalankan oleh class Inventaris, sehingga menjadi pusat kendali sekaligus pintu masuk aplikasi.

- Model dan Bahan

<img width="199" height="49" alt="image" src="https://github.com/user-attachments/assets/1f453ed7-daf7-4ba4-9528-9df7b843984d" />


Class Bahan berfungsi sebagai model atau representasi data untuk setiap bahan dalam inventaris dapur. Class ini menyimpan atribut penting seperti nama, stok, satuan, dan tanggal kadaluarsa, serta menyediakan konstruktor, getter, dan setter untuk mengelola data tersebut. Kesimpulannya, Bahan menjadi struktur data utama yang merepresentasikan informasi bahan yang akan dikelola dalam aplikasi inventaris.

- Service dan Inventaris

<img width="224" height="44" alt="image" src="https://github.com/user-attachments/assets/25e9cc2b-4bf8-4074-916e-9a381664cd0a" />

Class Inventaris berfungsi sebagai pengelola utama data inventaris dapur yang menyimpan daftar bahan dan menyediakan fitur CRUD (tambah, lihat, update, hapus) serta pencarian. Dengan memanfaatkan ArrayList<Bahan>, class ini menjadi inti logika bisnis aplikasi yang mengatur seluruh proses pengelolaan data bahan agar lebih terstruktur dan mudah diakses.

## Class MainApp
<img width="1607" height="818" alt="image" src="https://github.com/user-attachments/assets/08e12b14-485f-47bf-8e9a-d81acab346bc" />
<img width="1600" height="245" alt="image" src="https://github.com/user-attachments/assets/df1e2781-3548-442e-b890-147099136cbd" />

## Class Inventaris
<img width="1605" height="767" alt="image" src="https://github.com/user-attachments/assets/af0cf99f-55e9-415d-bb14-b19b820ed714" />
<img width="1597" height="801" alt="image" src="https://github.com/user-attachments/assets/fd7d31aa-df10-4b26-b695-fc71a144d1a6" />
<img width="1603" height="811" alt="image" src="https://github.com/user-attachments/assets/b483fe25-0d8c-4eca-ae01-cf55b2328675" />
<img width="1608" height="424" alt="image" src="https://github.com/user-attachments/assets/6e766168-4917-4003-8429-97d4ff6f6f8f" />

## Class Bahan
<img width="1602" height="807" alt="Screenshot 2025-09-15 185753" src="https://github.com/user-attachments/assets/500294ab-747d-4ce6-b951-6dbb6682121d" />
<img width="1601" height="267" alt="image" src="https://github.com/user-attachments/assets/d9b7eb05-19c4-419d-bee8-3c2928e9e77b" />


# Properties 

Pada class Bahan, terdapat properties:

<img width="278" height="94" alt="image" src="https://github.com/user-attachments/assets/deb9857d-430b-4364-9687-670cc2f8c09e" />

Properties ini digunakan untuk menyimpan data dari setiap bahan inventaris (nama bahan, jumlah stok, satuan, dan tanggal kadaluarsa). Karena dibuat dengan private, maka data hanya bisa diakses melalui getter & setter, bukan langsung dari luar class

# Constructor

Pada class Bahan, terdapat constructor:

<img width="711" height="130" alt="image" src="https://github.com/user-attachments/assets/69ca44b5-a86f-449d-bf10-496643b81c53" />

Fungsinya untuk menginisialisasi objek baru dengan data yang langsung lengkap (nama, stok, satuan, kadaluarsa)

# Access Modifier

private -> digunakan pada properties (nama, stok, dll.) agar tidak bisa diakses langsung dari luar class untuk melindungi data agar tetap aman

public -> digunakan pada constructor, getter, setter, dan method di Inventaris serta MainApp, sehingga bisa dipanggil dari luar class

final -> digunakan pada ArrayList<Bahan> inventaris agar variabel list tidak bisa diganti referensinya, tapi isinya masih bisa dimodifikasi


# Validasi input

- CLass Inventaris
<img width="718" height="297" alt="image" src="https://github.com/user-attachments/assets/c656131d-dc79-43d1-a580-723975afdf45" />

- Class MainApp
<img width="655" height="198" alt="image" src="https://github.com/user-attachments/assets/956586e4-2dff-4ee5-9bee-5cec9f4a69b8" />

Fungsi ini bertugas untuk memvalidasi input pengguna supaya hanya menerima angka, mencegah error akibat input yang salah

## **Tampilan Menu Utama**

Menu utama:

<img width="406" height="284" alt="image" src="https://github.com/user-attachments/assets/122fdbd8-cc24-4165-b480-4217caff1ce7" />

User diminta menginput angka 1–6.

<img width="476" height="334" alt="image" src="https://github.com/user-attachments/assets/6cfc058f-4338-4df1-868f-9291573aeb5e" />

Jika user menginput lain dari angka, maka tidak valid

## **Alur Program**

### Menu 1 -> Tambah Bahan (CREATE)

* User mengisi:
  * Nama bahan
  * Jumlah stok
  * Satuan
  * Tanggal kadaluarsa

<img width="349" height="139" alt="image" src="https://github.com/user-attachments/assets/bf5e4245-594e-4f23-9cf7-23bfaee4324b" />


* Output setelah user menambahkan bahan dapur


<img width="535" height="192" alt="image" src="https://github.com/user-attachments/assets/0cf12cf8-2883-44b3-9135-54abbfccef4e" />


### Menu 2 -> Lihat Inventaris (READ)

Pada saat user menginput 2 pada pilihan, maka output:


<img width="531" height="163" alt="image" src="https://github.com/user-attachments/assets/b576ecde-a2a9-4a2b-bcd9-3c1eb3d21cf9" />


Output menampilkan isi dari data inventaris dapur yang tersedia

### Menu 3 -> Update Bahan (UPDATE)

* User diminta untuk memilih nomor bahan yang ingin diubah.
* Jika nomor valid maka user dapat mengisi data baru (nama, stok, satuan, kadaluarsa).

Contoh update bahan:


<img width="353" height="140" alt="image" src="https://github.com/user-attachments/assets/5cfffdac-6790-409a-9138-44e83e2071ce" />


Apabila nomor bahan yang di input tidak valid maka output nya sebagai berikut


<img width="422" height="90" alt="image" src="https://github.com/user-attachments/assets/87c3adb6-2f74-4419-99d4-765a137ea48b" />


### Menu 4 -> Hapus Bahan (DELETE)

* User diminta memasukkan nomor bahan yang ingin dihapus.

Contoh output:

<img width="443" height="670" alt="image" src="https://github.com/user-attachments/assets/25609592-e6c4-41e1-9b1c-7c3e3d4e505e" />

Apabila menginputkan huruf, maka tidak valid
<img width="641" height="264" alt="image" src="https://github.com/user-attachments/assets/56eb5673-a768-428e-86ba-ecfde8d1b436" />

Apabila menginputkan angka yang tidak ada, maka output nya nomor bahan tidak valid
<img width="643" height="255" alt="Screenshot 2025-09-15 195456" src="https://github.com/user-attachments/assets/13527c5a-8d77-46eb-a42b-e7c9f1d5cde3" />


### Menu 5 -> Cari Bahan (Search)

User meningputkan angka 5 untuk masuk ke menu cari bahan, dan menginputkan huruf bahan yang diinginkan

<img width="741" height="403" alt="image" src="https://github.com/user-attachments/assets/d0067ff8-f80c-41a2-95d5-fcc9bdc098d4" />

Setelah menginput angka 5 cari bahan, apabila menginput angka pada menu ini maka bahan tidak ada pada daftar inventaris

<img width="425" height="341" alt="image" src="https://github.com/user-attachments/assets/ed91fa34-6673-431e-89ad-d52e4ac24c5e" />


### Menu 6 -> Keluar (Exit)

* Output apabila menginput angka 6 yaitu keluar dari program

<img width="815" height="494" alt="image" src="https://github.com/user-attachments/assets/4e8497d4-0e8c-4443-8222-b2829ad97d2c" />

