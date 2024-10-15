package string;

public class TestStringBuilder {
    public static void main(String[] args) {
        int age =15;
        String nom = "Lee";

        String resulta = StringUtils.append("Bonjour M.", nom, ". Vous avez ", age, " ans.");
        System.out.println(resulta);
    }
}
