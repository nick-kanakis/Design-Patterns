package singleton.example;

/**
 * Created by Nicolas on 4/6/2018.
 */
public class Singleton {
    private static Singleton instance;
    private String secretMsg;
    private Singleton() {
        secretMsg = "xkcd.com";
    }

    public String getSecretMsg() {
        return secretMsg;
    }

    public void setSecretMsg(String secretMsg) {
        this.secretMsg = secretMsg;
    }

    public static Singleton getInstance(){
        if(instance == null)
            instance = new Singleton();
        return instance;
    }
}
