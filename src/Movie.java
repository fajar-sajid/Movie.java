public class Movie {
    String title;
    int year;
    int ranking;

    public Movie(String title,int year,int ranking) {
        this.title = title;
        this.year = year;
        this.ranking = ranking;
    }

    @Override
    public String toString()
    {
        return String.format("Title=%s \nYear of release=%d\n Ranking=%d",title,year,ranking);
    }
    public void setTitle(String title){
        this.title=title;
    }
    public void setYear(int year){
        this.year=year;
    }
    public void setRating(int ranking){
        this.ranking=ranking;
    }
    public String getTitle(){
        return title;
    }
    public int getYear(){
        return year;
    }
    public int getRanking(){
        return ranking;
    }
}