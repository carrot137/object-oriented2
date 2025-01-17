package sample;

public class Bus extends Car {
   private int price;

    
    @Override
    public void stepOnAccele(){
         speed +=10;
         System.out.println("スピードは"+speed+"km/hです");
        

        price +=30;
        System.out.println("料金は"+price+"円です");

    }
}
