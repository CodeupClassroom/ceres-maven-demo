import com.google.common.base.Joiner;

public class Demo {
    public static void main(String[] args) {

        String ssn = "234432234";

        Joiner joiner = Joiner.on("; ").skipNulls();

        System.out.println(joiner.join("fer", null, "mendoza", 5, ssn));
    }
}