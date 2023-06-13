public class Account {
    int id;
    String name;
    String document;
    String email;
    String password;

    public Account(String name, String document, String email, String password){
        this.name = name;
        this.document=document;
        this.email=email;
        this.password=password;
    }

    public void printDataAccount(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(document);
        System.out.println(email);
        System.out.println(password);
    }
}
