package proxy.example;

/**
 * Created by Nicolas on 11/6/2018.
 */
public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }
}
