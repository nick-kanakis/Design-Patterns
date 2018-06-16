package singleton.example;

/**
 * Created by Nicolas on 4/6/2018.
 */
public class Simulator {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        System.out.println("Instance1 secret msg: " + instance1.getSecretMsg());
        instance1.setSecretMsg("reddit.com");
        Singleton instance2 = Singleton.getInstance();
        System.out.println("Instance2 secret msg: " + instance2.getSecretMsg());
        System.out.println("Instance1 secret msg: " + instance1.getSecretMsg());
    }
}
