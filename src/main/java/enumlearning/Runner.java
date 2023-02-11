package enumlearning;

public class Runner  {


    public static void main(String[] args) {

        Book b = new Book();
        System.out.println(b.createBook(100, "The Shining", BooKGenre.HORROR));

        for (BooKGenre booKGenre : BooKGenre.values()){
            System.out.println("Name"+" "+booKGenre); //tostring()
            System.out.println("name() :"+booKGenre.name());
            System.out.println("ordinal :"+booKGenre.ordinal());
            System.out.println("declaringclass :"+booKGenre.getDeclaringClass());
            System.out.println("compareTo(HORROR) :"+booKGenre.compareTo(BooKGenre.HORROR));
            System.out.println("equalToTo(HORROR) :"+booKGenre.equals(BooKGenre.HORROR));
        }





    }

}
