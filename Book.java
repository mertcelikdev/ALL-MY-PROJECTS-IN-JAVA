package Java102;

import java.util.*;

 class Book implements Comparable<Book> {

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

     @Override
     public int compareTo(Book other) {
         return this.bookName.compareTo(other.bookName);
     }


     public static void main(String[] args) {
         Book book1 = new Book("Book1", 200, "Author1", "10.10.2000");
         Book book2 = new Book("Book2", 150, "Author2", "11.10.2000");
         Book book3 = new Book("Book3", 300, "Author3", "12.10.2000");
         Book book4 = new Book("Book4", 180, "Author4", "13.10.2000");
         Book book5 = new Book("Book5", 250, "Author5", "14.10.2000");


         Set<Book> bookSetByName = new TreeSet<>();
         bookSetByName.add(book1);
         bookSetByName.add(book2);
         bookSetByName.add(book3);
         bookSetByName.add(book4);
         bookSetByName.add(book5);

         System.out.println("Books sorted by name:");
         for (Book book : bookSetByName) {
             System.out.println(book.getBookName());
         }
         System.out.println("-------------------------------------------------------------------------------");
         System.out.println("-------------------------------------------------------------------------------");


         Set<Book> bookSetByPageNumber = new TreeSet<>(new Comparator<Book>() {
             @Override
             public int compare(Book o1, Book o2) {
                 return o1.getPageNumber() - o2.getPageNumber();
             }
         });


         bookSetByPageNumber.add(book1);
         bookSetByPageNumber.add(book2);
         bookSetByPageNumber.add(book3);
         bookSetByPageNumber.add(book4);
         bookSetByPageNumber.add(book5);

         System.out.println("Books sorted by page number:");
         for (Book book : bookSetByPageNumber) {
             System.out.println(book.getPageNumber());
         }







     }
 }

