package core;

import impl.MyLinkead;
import impl.MyLinkeadList;

public class Main {
    public static void main(String[] args) {

        MyLinkead<Integer> myLinkeadList = new MyLinkeadList<>();
        myLinkeadList.addFirst(1);
        myLinkeadList.addLast(2);
        myLinkeadList.addLast(3);
        System.out.println(myLinkeadList.size());
//        myLinkeadList.getElementByIndex(1);


//        Scanner scaner = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("Выберите команду : 1 - Добавить в элемент в начало списка, " +
//                    "2 - Добавить элемент в конец списка " +
//                    "3 - Получить элемент по индексу"
//            );
//            String s = scaner.nextLine();
//            switch (s) {
//                case "1":
//                    System.out.println("Вы выбрали добвление элемента в начало списка");
//                    break;
//                case "2":
//                    System.out.println("Вы выбрали добвление элемента в конец списка");
//                    break;
//                case "3":
//                    System.out.println("Вы выбрали получение элемента по индексу");
//                    break;
//            }
//        }
    }
}
