/*
Define class EmailId with members ,username and password. Define default 
and parameterized constructors. Accept values from the command line Throw 
user defined exceptions – “InvalidUsernameException” or 
“InvalidPasswordException” if the username and password are invalid. 
*/
class InvalidUsernameException extends Exception{
    public String toString(){
        return "INVALID USERNAME";
    }
}
class InvalidPasswordException extends Exception{
    public String toString(){
        return "INVALID PASSWORD";
    }
}
class Emailid{
    String username,password;
    Emailid(){
        username=" ";
        password=" ";
    }
    Emailid(String username,String password){
        this.username=username;
        this.password=password;
    }
    public void check(String username,String password)throws InvalidUsernameException,InvalidPasswordException {
        if(!this.username.equals(username)){
            throw new InvalidUsernameException();
        }
        if(!this.password.equals(password)){
            throw new InvalidPasswordException();
        }
    }
}
public class Username_pass {
    public static void main(String[] args) {
      try{
        String username=args[0];
        String password=args[1];
        String storedusername="adhavpranav430@gmail.com";
        String storedpassword="2005";
        Emailid obj=new Emailid(storedusername,storedpassword);
        obj.check(username,password);
        System.out.println("Login Successful!");
      }catch(InvalidUsernameException | InvalidPasswordException e){
        System.out.println("ERROR :"+e);
      }
    }
}
