package day09;
import java.util.ArrayList;
import java.util.Scanner;

import day06.aaa;
public class Practice11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // [문제 1]
        ArrayList <String> nameList = new ArrayList<>();
        nameList.add("유재석"); nameList.add("강호동"); nameList.add("신동엽");
        System.out.println(nameList);

        // [문제 2]
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("사과"); fruits.add("바나나"); fruits.add("딸기");
        for(int i = 0; i < fruits.size(); i++ ){
            System.out.printf("인덱스 %d: %s \n", i, fruits.get(i) );
        }

        // [문제 3]
        for(String str: fruits){ System.out.println(str);}

        // [문제 4]
        ArrayList<String> abc = new ArrayList<>();
        abc.add("A"); abc.add("B"); abc.add("C"); abc.add("D"); abc.add("E");
        abc.remove(2);
        System.out.println(abc);

        // [문제 5]
        ArrayList <String> lang = new ArrayList<>();
        lang.add("자바"); lang.add("파이썬"); lang.add("C++");
        lang.add(1,"자바스크립트");
        System.out.println(lang);

        // [문제 6]
        ArrayList<Book> library = new ArrayList<>();
        Book book1 = new Book("책1", "작가1");
        Book book2 = new Book("책2", "작가2");
        Book book3 = new Book("책3", "작가3");
        library.add(book1); library.add(book2); library.add(book3);
        for(Book book : library) { System.out.print(book.title); System.out.println(book.author);}

        // [문제 7]
        // ArrayList<String> str = new ArrayList<>();
        // String end = "";
        // while(!end.equals("종료") ){
        //     System.out.print("문자열 입력: ");
        //     end = scan.next();
        //     if( !end.equals("종료") ) {str.add(end); }
        // }
        // System.out.println(str);

        // [문제 8]
        ArrayList<String> sub = new ArrayList<>();
        sub.add("국어"); sub.add("수학"); sub.add("사회"); sub.add("과학");
        sub.set(1,"영어");
        System.out.println(sub);

    } // main end
} // class end

class Book {
    String title;
    String author;
    Book(String title, String author){
        this.title = title;
        this.author = author;
    }
}
