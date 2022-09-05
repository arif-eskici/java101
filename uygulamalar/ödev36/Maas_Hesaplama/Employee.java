package ödev36.Maas_Hesaplama;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee (String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary= salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    double tax () {
        double taxAmount;
        if (this.salary < 1000) {
            return taxAmount = 0;
        } else {
            return taxAmount = this.salary * 0.03;
        }
    }

    double bonus () {
        double bonusAmount;
        if (workHours > 40) {
            return bonusAmount = (workHours - 40) * 30;
        } else {
            return bonusAmount = 0;
        }
    }

    double raiseSalary () {
        int nowYear = 2021;
        double raiseAmount;
        if ((nowYear - this.hireYear) < 10) {
           return raiseAmount = this.salary * 0.05;
        } else if ((nowYear - this.hireYear) > 9 && (nowYear - this.hireYear) < 20 ) {
            return raiseAmount = this.salary * 0.10;
        } else {
            return raiseAmount = this.salary * 0.15;
        }
    }

    public String toString () {
      //  this.salary = this.salary - tax() + bonus() + raiseSalary();
        double newSalary = this.salary - tax() + bonus() + raiseSalary();
        System.out.println("\nÇalışanın Adı            : " +this.name+ 
                        "\nMaaşı                    : " +this.salary+ 
                        "\nÇalışma Saati            : " +this.workHours+ 
                        "\nBaşlangıç Yılı           : " +this.hireYear+ 
                        "\nVergi Kesinti Miktarı    : " +tax()+ 
                        "\nFazla Mesai Ücreti       : " +bonus()+ 
                        "\nYapılacak Zam Miktarı    : " +raiseSalary()+ 
                        "\nEle Geçen Toplam Maaş    : " +newSalary+"\n");
        return null;
        
    }
}
