package core;

import impl.MyLinkead;
import impl.MyLinkeadList;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

        MyLinkead<Object> myLinkeadList = new MyLinkeadList<>();
        myLinkeadList.add(1);
        myLinkeadList.add(2);
        myLinkeadList.add(3);
        System.out.println(myLinkeadList.getElementByIndex(0));
        System.out.println(myLinkeadList.size());



//        Scanner scaner = new Scanner(System.in);
//
//            System.out.println("Выберите команду : 1 - Добавить в элемент в начало списка, " +
//                    "2 - Получить элемент по индексу " + "3 - Распечатать список "
//            );
//            String s = scaner.nextLine();
//            switch (s) {
//                case "1":
//                    System.out.println("Вы выбрали добвление элемента в начало списка, введите элемент: ");
//                    String a = scaner.nextLine();
//                    myLinkeadList.add(a);
//                    break;
//                case "2":
//                    System.out.println("Вы выбрали получение элемента по индексу");
//                    Integer b = scaner.nextInt();
//                    myLinkeadList.getElementByIndex(b);
//                    break;
//                case "3":
//                    System.out.println("Вывод списка на экран");
//                    break;
//            }
//        main(args);
    }
}
