package facade.librarian;

import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        // 初期値セット
        // (所蔵本リスト)
        BookList bookList = new BookList();
        bookList.addRecord("昆虫図鑑", "棚番号1");
        bookList.addRecord("動物図鑑", "棚番号1");
        bookList.addRecord("桃太郎", "棚番号2");
        bookList.addRecord("金太郎", "棚番号2");
        bookList.addRecord("コンピュータの仕組み", "棚番号3");
        bookList.addRecord("Javaプログラミング", "棚番号3");
        // (貸出リスト)
        LendingList lendingList = new LendingList();
        lendingList.lending("昆虫図鑑");
        lendingList.lending("桃太郎");
        lendingList.lending("コンピュータの仕組み");

        PrintStream out = System.out;

        // 利用者[山田くん]：司書[中村くん]に依頼する場合
        Visitor yamada = new Visitor("山田");
        yamada.setTargetBookName("昆虫図鑑");
        // (司書[中村くん])
        Librarian nakamura = new Librarian(bookList, lendingList);
        // (中村くんに昆虫図鑑の場所を聞く)
        out.println(yamada.name() + "の結果：");
        out.println(nakamura.searchBook(yamada.targetBookName()));
        out.println();

        // 利用者[木下くん]：自分で探す場合
        Visitor kinoshita = new Visitor("木下");
        kinoshita.setTargetBookName("動物図鑑");
        if(!bookList.existsBook(kinoshita.targetBookName())) {
            out.println("他の本にしよう");
            return;
        }
        if(lendingList.isLending(kinoshita.targetBookName())) {
            out.println("他の本にしよう");
            return;
        }
        out.println(kinoshita.name() + "の結果：");
        out.println(bookList.searchLocation(kinoshita.targetBookName()));
        out.println();
    }
}
