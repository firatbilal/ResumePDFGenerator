# Resume Generator

Bu proje, Java programlama dili kullanılarak PDF formatında özgeçmiş oluşturan bir uygulamadır. Kullanıcıdan alınan bilgilerle profesyonel görünümlü bir PDF çıktısı üretir. PDF işlemleri için iText 5 kütüphanesi kullanılmıştır.

## Özellikler
- PDF dosyası oluşturma
- Fotoğraf ekleme
- İş deneyimlerini listeleme
- Dosya çıktısını "output/ozgecmis.pdf" olarak kaydetme

## Gereksinimler
- Java 17 veya üzeri
- IntelliJ IDEA (2025 sürümüyle test edilmiştir)
- itextpdf-5.5.13.3.jar dosyasının lib klasörüne eklenmesi

## Kurulum Adımları
- Projeyi GitHub üzerinden klonlayın.
- "lib" klasörüne itextpdf-5.5.13.3.jar dosyasını ekleyin.  
  JAR dosyasını [buradan indirebilirsiniz](https://mvnrepository.com/artifact/com.itextpdf/itextpdf/5.5.13.3)
- IntelliJ IDEA üzerinden "File > Project Structure > Modules > Dependencies" kısmına girin ve JAR dosyasını ekleyin.
- Projeyi çalıştırın. PDF çıktısı "output/ozgecmis.pdf" olarak oluşacaktır.

## Kullanım
ResumeGenerator sınıfı üzerinden `generate()` metodu çağrılarak PDF oluşturulur.

## Katkı
Projeye katkıda bulunmak isterseniz pull request gönderebilir veya issue açabilirsiniz.

## Lisans
Bu proje MIT lisansı altında sunulmuştur.
