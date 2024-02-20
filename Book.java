package BookLister;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Book {
    private String bookName;
    private int pageNumber;
    private String publisherName;
    private String publishDate;

    public Book(String bookName, int pageNumber, String publisherName, String publishDate) {
        this.bookName = bookName;
        this.pageNumber = pageNumber;
        this.publisherName = publisherName;
        this.publishDate = publishDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public static void main(String[] args) {
        ArrayList<Book> list = new ArrayList<>();
        Book book1 = new Book("A", 100, "Mert", "10.10.2000");
        Book book2 = new Book("B", 200, "John", "12.12.2005");
        Book book3 = new Book("C", 150, "Alice", "05.05.2010");
        Book book4 = new Book("D", 180, "Bob", "07.07.2015");
        Book book5 = new Book("E", 120, "Emma", "09.09.2020");
        Book book6 = new Book("F", 220, "David", "11.11.2023");
        Book book7 = new Book("G", 90, "Sophia", "03.03.2018");
        Book book8 = new Book("H", 130, "Oliver", "04.04.2019");
        Book book9 = new Book("I", 110, "Sophie", "06.06.2017");
        Book book10 = new Book("J", 170, "William", "08.08.2016");

        list.add(book1);
        list.add(book2);
        list.add(book3);
        list.add(book4);
        list.add(book5);
        list.add(book6);
        list.add(book7);
        list.add(book8);
        list.add(book9);
        list.add(book10);

        Map<String, String> bookAuthorMap = list.stream()
                .collect(Collectors.toMap(Book::getBookName, Book::getPublisherName));

        bookAuthorMap.forEach((book, author) -> System.out.println("Book: " + book + ", Author: " + author));
        System.out.println("##########################################");
        list.stream()
                .filter(book -> book.getPageNumber() > 100)
                .forEach(book -> System.out.println(book.getPageNumber()));
    }
}
