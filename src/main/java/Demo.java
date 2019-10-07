import com.google.common.base.Joiner;
import org.apache.commons.lang3.StringUtils;

public class Demo {
    public static void main(String[] args) {

//        String ssn = "234432234";
//
//        Joiner joiner = Joiner.on("; ").skipNulls();
//
//        System.out.println(joiner.join("fer", null, "mendoza", 5, ssn));

        System.out.println(StringUtils.isNumeric("fer"));
        System.out.println(StringUtils.isNumeric("5"));
        System.out.println(StringUtils.isNumeric("5.6"));

        System.out.println("StringUtils.swapCase(\"fer\") = " + StringUtils.swapCase("fer"));
        System.out.println("StringUtils.swapCase(\"fer\") = " + StringUtils.swapCase("FER"));
        System.out.println("StringUtils.swapCase(\"fer\") = " + StringUtils.swapCase("FeR"));

        System.out.println(StringUtils.reverse("Fer"));
        System.out.println(StringUtils.reverse("nando"));
        System.out.println(StringUtils.reverse("NaN"));


    }
}