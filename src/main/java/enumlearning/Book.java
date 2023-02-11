package enumlearning;

public class Book {


    private int id;
    private String title;
    BooKGenre booKGenre;


    public Book(int id, String title, BooKGenre booKGenre) {
        this.id = id;
        this.title = title;
        this.booKGenre = booKGenre;
    }

    public Book() {

    }

    public Book createBook(int id, String title, BooKGenre booKGenre){

      return new Book(id,title,booKGenre);
    }


    @Override
    public String toString() {
        return "ID :" +id+ " " +
                "TITLE :" +title+" "+
                "GENRE :"+booKGenre;
    }
}
