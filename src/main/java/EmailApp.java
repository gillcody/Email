import model.Email;

public class EmailApp {

    public static void main(String[] args) {
        Email email = new Email("Cody", "Gill");

        email.setAltEmail("Alternate email: cody.gill@gmail.com");
        System.out.println(email.getAltEmail());
    }
}
