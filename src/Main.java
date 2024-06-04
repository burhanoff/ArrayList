import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<User> arrList = new ArrayList<>();
        arrList.add(new User(1,"Eran",26,Gender.MALE));
        arrList.add(new User(1,"Nazika",18,Gender.FEMALE));
        arrList.add(new User(1,"Beka",30,Gender.MALE));
        arrList.add(new User(1,"Ely",19,Gender.FEMALE));
        arrList.add(new User(1,"Zarema",15,Gender.FEMALE));

        System.out.println("FEMALE");
        for (User user : arrList) {

            if (user.getGender() == Gender.FEMALE){
                System.out.println(user);

            }
        }
        System.out.println("25");
        for (User user : arrList) {
            if (user.getAge() >25){
                System.out.println(user);
            }

        }





    }
}