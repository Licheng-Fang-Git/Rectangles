import java.lang.reflect.Array;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Rectangle r = new Rectangle(10, 15,20,10);
        ArrayList<Rectangle> collides = new ArrayList<>();
        double count  = 0;

        for (int i = 0; i < 1000000; i++){
            Rectangle checkingR  = new Rectangle(randomNumber(), randomNumber(), randomLength(), randomWidth());
            if(collidesYesNo(checkingR)){
                collides.add(checkingR);
            }
        }

        double divide =  (double) collides.size() /1000000;
        System.out.println("Percentage: " + divide * 100);

    }

    public static boolean collidesYesNo (Rectangle checkingR){
        if((checkingR.getxTopLeft() >= 10 &&  checkingR.getxTopLeft() <= 30) &&
            (checkingR.getyTopLeft() >= 5 &&  checkingR.getyTopLeft() <= 15)){
            return true;
        }

        if((checkingR.getxTopRight() >= 10 &&  checkingR.getxTopRight() <= 30) &&
                (checkingR.getyTopRight() >= 5 &&  checkingR.getyTopRight() <= 15))  {
            return true;
        }

        if((checkingR.getxBottomLeft() >= 10 &&  checkingR.getxBottomLeft() <= 30) &&
                ( checkingR.getyBottomLeft() >= 5 &&  checkingR.getyBottomLeft() <= 15)){
            return true;
        }

        if(( checkingR.getxBottomRight() >= 10 &&  checkingR.getxBottomRight() <= 30) &&
            (checkingR.getyBottomRight() >= 5 &&  checkingR.getyBottomRight() <= 15)){
            return true;
        }

        return false;
    }

    public static int randomNumber(){
        int random = (int) (Math.random() * (50 - 0 + 1)) + 0;
        return random;
    }

    public static int randomLength(){
        int random = (int) (Math.random() * (50 - 10 + 1)) + 10;
        return random;
    }

    public static int randomWidth(){
        int random = (int) (Math.random() * (10 - 5 + 1)) + 5;
        return random;
    }
}
