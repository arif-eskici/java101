package ödev34.ögrenci_bilgi_sistemi;

public class Main {

    public static void main(String[] args) {

       Teacher t1 = new Teacher ("Mahmut Hoca", "90555 123 11 22", "TRH"); 
    //   t1.print();
       Teacher t2 = new Teacher ("Semra Hoca", "90532 555 33 66", "FZK");
    //   t2.print();
       Teacher t3 = new Teacher ("Külyutmaz", "90542 888 77 99 ", "KİM");
    //   t3.print();
    //   System.out.println("===============");
       
       Course tarih = new Course ("Tarih", "101", "TRH");
       tarih.addTeacher(t1);
    //   tarih.printTeacher();
       Course fizik = new Course ("Fizik", "102", "FZK");
       fizik.addTeacher(t2);
    //   fizik.printTeacher();
       Course kimya = new Course ("Kimya", "103", "KİM");
       kimya.addTeacher(t3);
    //   kimya.printTeacher();
       System.out.println("===============");
 
       Student s1 = new Student ("İnek Şaban", "2623", "4", tarih, fizik, kimya);
       s1.addBulkExamNote(90, 85, 100);
       s1.addBulkVerbalNote(100, 50, 90);
       s1.isPass();
       System.out.println("===============");

       Student s2 = new Student ("Güdük Necmi", "2621", "4", tarih, fizik, kimya);
       s2.addBulkExamNote(100, 58, 82);
       s2.addBulkVerbalNote(100, 95, 90);
       s2.isPass();
       System.out.println("===============");

       Student s3 = new Student ("Damat Ferit", "2611", "4", tarih, fizik, kimya);
       s3.addBulkExamNote(50, 45, 30);
       s3.addBulkVerbalNote(85, 55, 65);
       s3.isPass();
       System.out.println("===============");
        
    }
}
