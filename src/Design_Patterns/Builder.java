package Design_Patterns;

import java.text.Format;

public class Builder {
    public static void main (String [] args )  {

        User u =new User.builder().id(10).email("gamil").name("Dayanandd").password("1234").build();
        System.out.println(u.id+" "+u.email+" "+u.name+" "+u.password);

    }
}


class User {
    int  id;
    String name;
    String email;
    String password;

    public User(builder b){
        id = b.id;
        name = b.name;
        email = b.email;
        password = b.password;
    }

    public  static class  builder{
        int  id;
        String name;
        String email;
        String password;

        public builder id(int id){
            this.id=id;
            return this;
        }
        public builder name(String name){
            this.name=name;
            return this;
        }
        public builder email(String email){
            this.email=email;
            return this;
        }
        public builder password(String password){
            this.password=password;
            return this;
        }
        public User build(){
            return new User(this);
        }
    }
}