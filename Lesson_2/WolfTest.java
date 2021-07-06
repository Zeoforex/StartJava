public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();

        wolfOne.age = 7;
        wolfOne.color = "white";
        
        System.out.println(wolfOne.age);
        System.out.println(wolfOne.color);
        
        wolfOne.hunt();
        wolfOne.move();
        
    }
}