public class TestAuthor {
    public static void main(String[] args) {
        Author John = new Author("John", "john@author.com", 'm');
        Author Sarah = new Author("Sarah", "sarah@author.com", 'f');
        Sarah.setEmail("sarah@outlook.com");
        System.out.println(John);
        System.out.println(Sarah);
    }
}
