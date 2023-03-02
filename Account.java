import java.util.ArrayList;
public class Account extends Card {
    private String type;
    public ArrayList<String>services = new ArrayList<String>();
    Account(){
        type="";
    }
    public void setType(String type){
        this.type=type;
    }
    public String getType(){
        return type;
    }
}
