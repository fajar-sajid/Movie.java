import java.util.ArrayList;


public class Main{
    public static void main(String[] args) {
        ArrayList<Movie> arraylist = new ArrayList<>();

        Movie movie1 = new Movie("ABS", 2020, 3);
        Movie movie2 = new Movie("DEF", 2021, 5);
        Movie movie3 = new Movie("GHI", 1998, 5);
        Movie movie4 = new Movie("JKL", 2000, 4);

        System.out.println(arraylist.isEmpty());
        System.out.println(arraylist.size());

        arraylist.add(movie1);
        arraylist.add(movie2);
        arraylist.add(movie3);
        arraylist.add(movie4);

        System.out.println(arraylist.isEmpty());
        System.out.println(arraylist.size());

        for(Movie a: arraylist){
            System.out.println(arraylist);
        }

        arraylist.remove(1);
        System.out.println(arraylist.size());

        arraylist.set(0,new Movie("Chemistry",2020,3));
        for(Movie b: arraylist){
            System.out.println(arraylist);
        }
        for(Movie c: arraylist){
            c.setRating(c.getRanking()+1);
        }


    }}