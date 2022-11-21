public class Main {
    public static void main(String[] args) {



        Author author1 = new Author("Dan Brown", "Brown");
        Book book1 = new Book("Later", author1, 2003);

        System.out.println("book1.bookName = " + book1.getBookName() + "\n" + "author1.authorFirstName = " +
                author1.getAuthorFirstName() + "\n" + "author1.authorLastName = " + author1.getAuthorLastName() + "\n" +
                "book1.publishingYear = " + book1.getPublishingYear() + "\n");

        book1.setPublishingYear(2003);
        System.out.println("book1.getPublishingYear() = " + book1.getPublishingYear());

        System.out.println();

        Author author2 = new Author("Steven", "King");
        Book book2 = new Book("Harry Potter and the Chamber of Secrets", author2, 1996);

        System.out.println("book2.bookName = " + book2.getBookName() + "\n" + "author2.authorFirstName = " +
                author2.getAuthorFirstName() + "\n" + "author2.authorLastName = " + author2.getAuthorLastName() + "\n" +
                "book2.publishingYear = " + book2.getPublishingYear() + "\n");

        book2.setPublishingYear(1996);
        System.out.println("book2.getPublishingYear() = " + book2.getPublishingYear());
    }
}