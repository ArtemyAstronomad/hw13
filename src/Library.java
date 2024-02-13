class Book {
    private String title;
    private Author author;
    private int Year;

    public Book(String title, Author author, int year) {
        this.title = title;
        this.author = author;
        this.Year = year;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        this.Year = year;
    }
}

class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
public class Library {
    public static void main(String[] args) {
        Author author1 = new Author("Михаил", "Черный");
        Author author2 = new Author("Саша", "Белый");

        Book book1 = new Book("Книга 1", author1, 2000);
        Book book2 = new Book("Книга 2", author2, 2010);

        System.out.println("Книга 1: " + book1.getTitle() + " " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName() + " (" + book1.getYear() + ")");
        System.out.println("Книга 2: " + book2.getTitle() + " " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName() + " (" + book2.getYear() + ")");
        book1.setYear(2005);

        System.out.println("Измененный год публикации первой книги " + book1.getYear());
    }
}
