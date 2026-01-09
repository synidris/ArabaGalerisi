🚗 Araba Galerisi Otomasyon Sistemi

Bu proje, Yazılım İnşaası dersi kapsamında geliştirilen, dosya tabanlı ve nesne yönelimli prensiplere uygun bir Araba Galerisi Otomasyon Sistemi’dir.
Sistem; araba ekleme, araba listeleme, satış yapma ve kullanıcı girişi gibi temel galeri işlemlerini konsol tabanlı olarak gerçekleştirmektedir.

📌 Proje Özellikleri

Java ile geliştirilmiştir

Konsol tabanlı (CLI) arayüz

TXT dosyaları ile kalıcı veri saklama

Katmanlı mimari (UI – Service – Data)

Nesne yönelimli tasarım (OOP)

Otomatik ID üretimi

Kullanıcı giriş doğrulaması

Satılan arabaların ayrı dosyada tutulması

🧱 Kullanılan Mimari

Proje katmanlı mimari yaklaşımı ile tasarlanmıştır:

Sunum Katmanı: Kullanıcı ile etkileşim

İş Mantığı Katmanı: İş kuralları ve doğrulamalar

Veri Katmanı: Dosya okuma / yazma işlemleri

Model Katmanı: Sistem varlıkları (Araba, Kullanıcı)

📁 Dizin Yapısı
ArabaGalerisi/
│
├── Main.java
├── KonsolArayuz.java
├── GaleriService.java
├── AuthService.java
├── DosyaService.java
├── Araba.java
├── Kullanici.java
│
├── data/
│   ├── arabalar.txt
│   ├── satilan_arabalar.txt
│   └── kullanicilar.txt
│
└── README.md


📌 Not:
data klasörü yoksa sistem tarafından otomatik olarak oluşturulmaktadır.

🧑‍💻 Sınıflar ve Görevleri
Sınıf	Açıklama
Main	Uygulamanın başlangıç noktası
KonsolArayuz	Menü gösterimi ve kullanıcı etkileşimi
GaleriService	Araba ekleme, satış ve stok yönetimi
AuthService	Kullanıcı giriş doğrulaması
DosyaService	Dosya okuma/yazma ve ID üretimi
Araba	Araba veri modeli
Kullanici	Kullanıcı veri modeli
👥 Proje Ekibi ve Görev Dağılımı
👤 Ferhat Demir

GaleriService

AuthService

İş mantığı ve sistem koordinasyonu

👤 İdris Şeyhun

DosyaService

Araba

Kullanici

Veri katmanı ve model tasarımı

👤 Sabri Kaçar

KonsolAraYuz
