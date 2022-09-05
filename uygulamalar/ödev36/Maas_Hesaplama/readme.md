# Ödev - Maaş Hesaplayıcı

Java'da "Employee" adında fabrika çalışanlarını temsil eden ve metotları ile çalışanların maaşlarını hesaplayan
bir sınıf yazmalısınız. Bu sınıf 4 nitelik ve 5 metoda sahip olacaktır.

#### Sınıfın Nitelikleri:

<b>name : </b> Çalışanın adı ve soyadı
<b>salary  :</b> Çalışanın maaşı
<b>workHours :</b> Haftalık çalışma saati
<b>hireYear :</b> İşe başlangıç yılı

#### Sınıfın Metotları

<b>Employee(name,salary,workHours,hireYear) :</b> Kurucu metot olup 4 parametre alacaktır.

<b>tax() :</b> Maaşa uygulanan vergiyi hesaplayacaktır.
 - Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
 - Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.

<b>bonus() :</b> Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.

<b>raiseSalary() :</b> Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. 
 - Şuan ki yılı 2021 olarak alın.
 - Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
 - Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
 - Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.

<b>toString() :</b> Çalışana ait bilgileri ekrana bastıracaktır.
