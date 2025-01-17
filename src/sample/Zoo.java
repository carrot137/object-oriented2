package sample;

public class Zoo {
    public static void main(String[] args) {
        Animal[] animal =new Animal[5];

        animal[0] =new Sheep();
        animal[1] =new Horse();
        animal[2] =new Goat();
        animal[3] =new Monkey();
        animal[4] =new Bear();

        // animal[0].cry();

   

        for(int i=0; i<=5; i++){
            animal[i].cry();;
        }
    }
   

}
