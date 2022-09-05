package ödev35.java101_Boks_Müsabakasi;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    

    Match (Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        
    }

    void start () {
        if (isCheck()) {

            int firstHit = Math.round((float)Math.random());
            int round = 1;
        
            if (firstHit == 0) {
                while (this.f1.health > 0 && this.f2.health > 0) {
                    System.out.println("\n===== ROUND -"+ round +"- =====");

                    this.f2.health = this.f1.hit(this.f2);
                    System.out.println(f2.name+ " kalan canı : " +this.f2.health);
                    if (isWin()) {
                        break;
                    }

                    this.f1.health = this.f2.hit(this.f1);
                    System.out.println(f1.name+ " kalan canı : " +this.f1.health);
                    if (isWin()) {
                        break;
                    }

                    round++;
                }       
            } 

            if ( firstHit == 1) {
                while (this.f1.health > 0 && this.f2.health > 0) {
                    System.out.println("\n===== ROUND -"+ round +"- =====");

                    this.f1.health = this.f2.hit(this.f1);
                    System.out.println(f1.name+ " kalan canı : " +this.f1.health);
                    if (isWin()) {
                        break;
                    }

                    this.f2.health = this.f1.hit(this.f2);
                    System.out.println(f2.name+ " kalan canı : " +this.f2.health);
                    if (isWin()) {
                        break;
                    }

                    round++;
                }    
            }    
        
        } else {
            System.out.println("\nSporcuların sikletleri uyuşmuyor. => Müsabaka başlayamaz!!\n");
        }
    }

    boolean isCheck () {
        return ((this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight));

    }

    boolean isWin () {
        if (this.f1.health == 0) {
            System.out.println("\n==============================");
            System.out.println("Sonuç => "+ this.f2.name+ " KAZANDI !!!");
            System.out.println("==============================\n");
            return true;
        }
        if (this.f2.health == 0) {
            System.out.println("\n==============================");
            System.out.println("Sonuç => "+ this.f1.name+ " KAZANDI !!!");
            System.out.println("==============================\n");
            return true;
        }

        return false;
    }
}
