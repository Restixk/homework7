public class Main {
    public static void main(String[] args) {
        int deferred = 15000;//задача 1
        int deferredTotal = 0;
        int i = 0;
        while (deferredTotal <=2459000){
            deferredTotal = deferredTotal + deferred;
            i = i + 1;
            System.out.println("Месяц " + i + ", cумма накоплений равна " + deferredTotal + " рублей");
        }
        i = 0;// задача 2
        while (i < 10){
            i = i + 1;
            System.out.print(i + " ");
        }
        System.out.println();
        for ( i = 10; i >= 1; i = i - 1) {
            System.out.print(i + " ");
        }
        System.out.println();
        double populationSize = 12000000;// задача 3
        double birthRate = 0.017 ;
        double mortality = 0.008;
        double populationYear = populationSize * birthRate - populationSize * mortality;
        for (i = 1 ; i <=10 ; i = i + 1){
            populationSize = populationYear + populationSize;
            System.out.println("Год " + i + ", численность население состовляет " + (int)populationSize );
        }
        double deferredNew = 15000;//задача 4
        i = 0;
        while (deferredNew <= 1200000){
            i = i +1;
            deferredNew = deferredNew * 1.07;
            System.out.println("Месяц " + i +  " " + (int)deferredNew);
        }
        deferredNew = 15000;//задача 5
        i = 0;
        while (deferredNew <= 1200000){
            i = i +1;
            deferredNew = deferredNew * 1.07;
            if ( i % 6 == 0) {
                System.out.println("Месяц " + i + " " + (int) deferredNew);
            }
        }
        deferredNew = 15000;//задача 7
        i = 0;
        while (i  <= 9 * 12 ){
            i = i +1;
            deferredNew = deferredNew * 1.07;
            if ( i % 6 == 0) {
                System.out.println("Месяц " + i + " " + (int) deferredNew);
            }
        }
        i = 3 ;
        System.out.println("Сегодня пятница," + i + "-е число. Необходимо подготовить отчет");
        while ( i <= 31 ){
            if ( (i-3)  % 7 == 0 ){
            System.out.println("Сегодня пятница," + i + "-е число. Необходимо подготовить отчет");
            }
            i = i + 1;
        }
        int pastYears = 1823;
        int futureYears = 2123;
        i = pastYears;
        while (pastYears <= futureYears){
            if (i % 79 == 0){
                System.out.println(i);
            }
            pastYears = pastYears + 1;
            i = i + 1;


        }





    }
}