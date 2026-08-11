package Design_Patterns;

public class Factory {
   public static void main (String [] args ) throws Exception {
       message m = MesseageFactary.Getfactary("Whatsapp");
       m.message();
   }
}


interface  message {
    void message();
}

class Gmail implements message{
    @Override
    public void message() {
        System.out.println("Gmail");
    }
}

class Whatsapp implements message{
    @Override
    public void message() {
        System.out.println("Whatsapp");
    }
}


class MesseageFactary {
    public static message Getfactary( String data) throws Exception {
        if(data.equals("Gmail")){
            return new Gmail();
        }
        else if(data.equals("Whatsapp")){
            return new Whatsapp();
        }
        else{
            throw  new Exception("Invalid data");
        }


    }
}