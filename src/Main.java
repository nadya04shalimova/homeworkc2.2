import Transport.Car;
import HW.Human;
import HW.Flower;
     public class Main {
            public static void main(String[] args) {

                Human maksim = new Human("maksim", "minsk",27,"brand-manager");
                Human anya = new Human("anya","moskva",29,"methodist");
                Human katya = new Human("katya","kaliningrad",28,"prodact-manager");
                Human artem = new Human("artem","moskva",27,"director");


                Flower rose = new Flower("Rose ",null,"Holland ",35.59 ,0);
                Flower chrysanthemum = new Flower("Chrysanthemum ",null,null,15.00 ,5);
                Flower pion = new Flower("Pion ",null,"England ",69.9 ,1);
                Flower hipsophyla = new Flower("Hipsophyla ",null,"Turkey ",19.5 ,10);
                System.out.println(rose.toString());
                System.out.println(chrysanthemum.toString());
                System.out.println(pion.toString());
                System.out.println(hipsophyla.toString());

                Car.Insurance insurance = new Car.Insurance("FD90876OO",1000,"oo123OO");

                Car lada = new Car("Lada ","Grande ","Russia ","red ",2002,150,1.5,"автомат ","o123oo ","седан ",6);
                lada.setInsurance(insurance);
                Car audi = new Car("Audi ","A8 ","Germany ","black ",2020,200,2.0,"автомат ","o555oo ","седан ",6);
                System.out.println(lada.toString());
                System.out.println(audi.toString());
                lada.refill();
}
     }