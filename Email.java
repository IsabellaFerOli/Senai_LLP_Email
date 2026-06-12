import java.util.HashSet;
import java.util.Scanner;

public class Email {

    public static int contarEmailsUnicos(String[] emails) {
        HashSet<String> unicos = new HashSet<>();

        for (String email : emails) {
            String[] partes = email.split("@");
            String nomeLocal = partes[0];
            String dominio = partes[1];

            if (nomeLocal.contains("+")) {
                nomeLocal = nomeLocal.split("\\+")[0];
            }

            nomeLocal = nomeLocal.replace(".", "");

            String emailNormal = nomeLocal + "@" + dominio;
            unicos.add(emailNormal);
        }

        return unicos.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String[] emails = new String[n];

        for (int i = 0; i < n; i++) {
            emails[i] = sc.nextLine();
        }

        System.out.println(contarEmailsUnicos(emails));
    }
}