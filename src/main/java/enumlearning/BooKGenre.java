package enumlearning;

public enum BooKGenre {
    BIOGRAPHY(12), HORROR(15);


    private BooKGenre(int minAgeToRead){
        this.minAgeToRead =minAgeToRead;
    }

    private int minAgeToRead;

    public int getMinAgeToRead(){
        return minAgeToRead;
    }
}

//we cannot extend this enum
//we cannot initiate
//it can have instant variables, method and so one........

/*
public final class BookGenre extends  Enum {

    public static final BookGenre BIOGRAPHY = new BookGenre("BIOGRAPHY,0);
    public static final BookGenre HORROR = new BookGenre("HORROR,1);


      public static BookGenre[] values();
      public static BookGenre[] valuesOf(java.lang.String)
      static{};


    private BookGenre(String name, int ordinal) {
    super(name,ordinal)
   }


 */