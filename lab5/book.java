import java.util.Scanner;

class Book {
    String title;
    String author;
    int edition;

    public Book(String title, String author, int edition) {
        this.title = title;
        this.author = author;
        this.edition = edition;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getEdition() {
        return edition;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Edition: " + edition;
    }
}

class Books {
    public static void main(String[] args) {
        Book[] books = new Book[6];

        // Create an array of 6 Book objects in ascending order of titles
        books[0] = new Book("Book A", "JOHN GREEN", 1);
        books[1] = new Book("Book B", "AGATHA CHRISTIE", 2);
        books[2] = new Book("Book C", "ARUNDHATI ROY", 1);
        books[3] = new Book("Book D", "SIDNEY SHELDON", 1);
        books[4] = new Book("Book E", "TAYLOR JENKINS REID", 2);
        books[5] = new Book("Book F", "JOHN GREEN", 3);

        Scanner scanner = new Scanner(System.in);

        // Input the author's name
        System.out.print("Enter the author's name: ");
        String authorName = scanner.nextLine();

        // Display books written by the input author
        System.out.println("Books by " + authorName + ":");
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(authorName)) {
                System.out.println(book);
            }
        }
    }
}
