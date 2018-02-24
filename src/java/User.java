
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class User {
    private String Name;
    private String Password;
    private String output_msg;

    public String getOutput_msg() {
        return output_msg;
    }

    public void setOutput_msg(String output_msg) {
        this.output_msg = output_msg;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
    public String login(){
        if (Name.equals("name") && Password.equals("password")) {
            output_msg="username and password  is correct";
        }
        else if(Name.equals("") && Password.equals("")){
            output_msg="Please enter your name and password.";
        }
        else{
            output_msg="name and password is not correct";
        }
        return output_msg;
    }
}
