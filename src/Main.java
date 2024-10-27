import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("***");

        //Task#1
        System.out.println("Введите возраст человека:");
        byte age = new Scanner(System.in).nextByte();
        var result = "";
        if (0<age && age<18){
            result="он не достиг совершеннолетия, нужно немного подождать.";
        }else{
            result = "он совершеннолетний.";
        }
        System.out.println("Если возраст человека равен " +age
                +", то " +result);
        System.out.println("***");

        //Task#2
        System.out.println("Сколько градусов на улице?:");
        short temp = new Scanner(System.in).nextShort();
        if (temp<5){
            System.out.println("На улице " +temp +" градусов."
                    +" На улице холодно, нужно надеть шапку.");
        }else{
            System.out.println("На улице " +temp +" градусов."
                    +"Сегодня тепло, можно идти без шапки.");
        }
        System.out.println("***");

        //Task#3
        System.out.println("Введите показатель скорости:");
        result = "";
        byte speed = new Scanner(System.in).nextByte();
        if (0<speed){
            if (speed>60){
                result="придется заплатить штраф.";
            }else{
               result = "можно ездить спокойно.";
            }
        }
        System.out.println("Если скорость " +speed
                +", то " +result);
        System.out.println("***");

        //Task#4
        result = ".";
        System.out.println("Укажите возраст человека:");
        byte ageSecond = new Scanner(System.in).nextByte();
        if (2<=ageSecond && ageSecond<=6){
            result = " в детский сад.";
        }else{
            if (7<=ageSecond && ageSecond<=17){
                result = " в школу.";
            }else{
                if (18<=ageSecond && ageSecond<=24){
                    result = " в университет.";
                }else{
                    if (ageSecond>24){
                        result = " на работу.";
                    }
                }
            }
        }
        System.out.println("Если возраст человека равен " +ageSecond
                +", то ему нужно ходить" +result);
        System.out.println("***");

        //Task#5
        result = "";
        System.out.println("Введите возраст ребёнка:");
        byte ageThird = new Scanner(System.in).nextByte();
        if (0<=ageThird && ageThird<=5){
            result = "нельзя кататься на аттракционе.";
        }else{
            if (5<ageThird && ageThird<=14){
                result = "можно кататься на аттракционе в сопровождении взрослого.";
            }else{
                if (ageThird>14){
                    result = "можно кататься на аттракционе без сопровождения взрослого.";
                }
            }
        }
        System.out.println("Если возраст ребенка равен " +ageThird
                +", то ему " +result);
        System.out.println("***");

        //Task#6
        System.out.println("Введите количество людей в вагоне:");
        byte fullness = new Scanner(System.in).nextByte();
        byte carriageCapacity = 102;
        byte sits = 60;
        if (0<=fullness && fullness<carriageCapacity){
            if (fullness<60){
                result = ". Из них сидячих - " +(sits -fullness) +".";
            }else{
                result = ". Сидячих мест нет.";
            }
            System.out.println("Количество свободных мест в вагоне: "
                    +(carriageCapacity -fullness) +result);
        }else{
            if (fullness==carriageCapacity){
                System.out.println("Свободных мест в вагоне нет.");
            }
        }
        System.out.println("***");

        //Task#7
        System.out.println("Введите поочерёдно три целых числа:");
        int one = new Scanner(System.in).nextInt();
        int two = new Scanner(System.in).nextInt();
        System.out.println("И последнее...");
        int three = new Scanner(System.in).nextInt();
        if (one<two){
            if (two<three){
                System.out.println(three +" - наибольшее число.");
            }else{
                System.out.println(two +" - наибольшее число.");
            }
        }else{
            if (one<three){
                System.out.println(three +" - наибольшее число.");
            }else{
                System.out.println(one +" - наибольшее число.");
            }
        }
        System.out.println("***");
    }
}