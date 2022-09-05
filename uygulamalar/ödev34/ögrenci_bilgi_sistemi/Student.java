package ödev34.ögrenci_bilgi_sistemi;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double average;
    double c1_average;
    double c2_average;
    double c3_average;
    boolean isPass;

    Student (String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0;
        this.isPass = false;
        calcAverage();

    }

    void addBulkExamNote (int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
        }
      
    }

    void addBulkVerbalNote (int verbalNote1, int verbalNote2, int verbalNote3) {
        if (verbalNote1 >= 0 && verbalNote1 <= 100) {
            this.c1.verbalNote = verbalNote1;
        }
        if (verbalNote2 >= 0 && verbalNote2 <= 100) {
            this.c2.verbalNote = verbalNote2;
        }
        if (verbalNote3 >= 0 && verbalNote3 <= 100) {
            this.c3.verbalNote = verbalNote3;
        }
    }

    void calcAverage () {
        this.c1_average = (this.c1.note * 0.75 + this.c1.verbalNote * 0.25);
        this.c1_average = Math.round(this.c1_average*100)/100d;
        this.c2_average = (this.c2.note * 0.80 + this.c2.verbalNote * 0.20);
        this.c2_average = Math.round(this.c2_average*100)/100d;
        this.c3_average = (this.c3.note * 0.70 + this.c3.verbalNote * 0.30);
        this.c3_average = Math.round(this.c3_average*100)/100d;
        this.average = (c1_average + c2_average + c3_average) / 3;
        this.average = Math.round(this.average*100)/100d;
         
    }

    void isPass () {
        calcAverage();
        printNote();

        if (this.average > 55) {
            System.out.println("Sınıfı başarılı bir şekilde geçtiniz.");
        } else {
            System.out.println("Sınıfta Kaldınız!!");
        }
        
    }

    void printNote () {
    //    System.out.println("================================");
        System.err.println("Öğrenci => " + this.name + " / numarası : " + this.stuNo);
        System.out.println(this.c1.name + " => Sınav Notu : " +  this.c1.note + " , Sözlü Notu  : " + this.c1.verbalNote + " / Ortalamanız : " + this.c1_average);
        System.out.println(this.c2.name + " => Sınav Notu : " +  this.c2.note + " , Sözlü Notu  : " + this.c2.verbalNote + " / Ortalamanız : " + this.c2_average);
        System.out.println(this.c3.name + " => Sınav Notu : " +  this.c3.note + " , Sözlü Notu  : " + this.c3.verbalNote + " / Ortalamanız : " + this.c3_average);
        System.out.println("Ortalamanız  => " + this.average);
        
    }
}
