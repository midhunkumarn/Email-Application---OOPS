import java.util.*;

public class Email {
    private String firstName;
    private String lastName;
    private String Deapartment;
    private String Email;
    private String alternateEmail;
    private String companyAdd= "ABC.com";
    private String Password;
    private int Default_Length=12;
    private int mailCapacity;
    

    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        // System.out.println("Email is Created : "+ this.firstName+" "+this.lastName);
        this.Deapartment = Setdepartment();
        // System.out.println("Your Deparment is : "+ this.Deapartment);
        this.Password = setRandompassword(Default_Length);
        System.out.println("Your password : "+ this.Password);
        Email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+Deapartment+"."+ companyAdd;
        // System.out.println("Your Email : "+Email);

    }

    private String Setdepartment(){
        System.out.print("Department Code\n1 for Developer \n2 for Marketting and Sales \n3 for Finance and Accounting \n4 for None\n Enter Department Code : ");
        Scanner sc = new Scanner(System.in);
        int dep = sc.nextInt();
        if(dep==1) return "Dev";
        else if(dep==2) return "Sales";
        else if(dep==3) return "Finance";
        else return "None";
    }
    private String setRandompassword(int length){
        String RandomPassword = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@!#$%&*1234567890";
        char[] password = new char[length];
        for(int i=0;i<length;i++){
            int rand = (int)(Math.random() * RandomPassword.length());
            password[i] = RandomPassword.charAt(rand);
        }
        return new String(password);
    }

    public void setMailBoxCapacity(int capcity){
        this.mailCapacity = capcity;
    }

    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }

    public void changePassword(String pass){
        this.Password = pass;
    }

    public int getMailCapacity(){ return mailCapacity;}
    public String getAlternateEmail(){return alternateEmail;}
    public String getPassword(){return Password;}

    public String showInfo(){
        return "Name : "+firstName+" "+lastName+
                "\nOrganization Email : "+ Email+
                "\nMail Box Capacity : " + mailCapacity;
    }
}
