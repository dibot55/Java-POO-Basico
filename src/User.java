public class User extends Account{
    String nickName;
    public User(String name, String document, String email, String password, String nickName){
        super(name, document, email, password);
        this.nickName=nickName;
    }
}
