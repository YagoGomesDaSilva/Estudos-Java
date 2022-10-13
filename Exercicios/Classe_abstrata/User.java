public class User extends Entity {

    private String name;

    User(String name){
        this.name = name;
    }

    @Override
    public String fileNeme() {
        String str = "User.txt";
        return str;
    }

    @Override
    public boolean validar() {
        if(this.name.length() > 5){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Name: " + this.name;
    }
    
}
