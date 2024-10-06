public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " ,то он совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + " ,то он не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println("Задача 2");
        int temp = 6;
        if (temp < 5) {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
        }
        if (temp > 5) {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        }
        System.out.println("Задача 3");
        int speed = 65;
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + " ,то можно ехать спокойно");
        }
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " ,то нужно заплатить штраф");
        }
        System.out.println("Задача 4");
        int man = 20;
        if (man >= 2 && man <= 6) {
            System.out.println("Если возраст человека равен " + man + " ,то ему нужно ходить в детский сад");
        } else if (man >= 7 && man <= 17) {
            System.out.println("Если возраст человека равен " + man + " ,то ему нужно ходить в школу");
        } else if (man >= 18 && man <= 24) {
            System.out.println("Если возраст человека равен " + man + " , то его место в университете");
        } else {
            System.out.println("Если возраст человека равен " + man + " , то ему пора ходить на работу");
        }
        System.out.println("Задача 5");
        int child = 14;
        if (child < 5) {
            System.out.println("Если возраст ребенка равен " + child + " ,то ему нельзя кататься на аттракционе");
        } else if (child >= 5 && child < 14) {
            System.out.println("Если возраст ребенка равен " + child + " ,то он может кататься только в сопровождении взрослого");
        } else if (child >= 14) {
            System.out.println("Если возраст ребенка равен " + child + " ,то он может кататься без сопровождения взрослого");
        }
        System.out.println("Задача 6");
        int pass = 104;
        int vsegoMest = 102;
        int sid = 60;
        if (pass < vsegoMest && pass >= sid) {
            System.out.println("В вагоне есть стоячее место");
        } else if (pass < sid && pass > 0) {
            System.out.println("В вагоне есть сидячее место");
        } else if (pass >= vsegoMest) {
            System.out.println("Вагон полностью забит");
        }
        System.out.println("Задача 7");
        int one = 6;
        int two = 5;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Число один наибольшее из всех");
        } else if (two > one && two > three) {
            System.out.println("Число два наибольшее из всех");
        } else {
            System.out.println("Число три наибольшее из всех");
        }

    }
}