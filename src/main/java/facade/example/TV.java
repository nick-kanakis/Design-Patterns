package facade.example;

/**
 * Created by Nicolas on 8/6/2018.
 */
public class TV {

    public String on(){
        return "TV is On";
    }

    public String off(){
        return "TV is Off";
    }

    public String watchMovie(String movie){
        return "Starting movie: " + movie;
    }

}
