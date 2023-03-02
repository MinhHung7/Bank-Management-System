public class Card extends Person{
    private String card_No;
    private String pin;
    private long money;
    Card(){
        card_No = "123456789";
        pin="123456";
        money = 20000000;
    }
    public String getCardNo(){
        return card_No;
    }
    public long getMoney(){
        return money;
    }
    public String getPin(){
        return pin;
    }
    public void setCardNo(String card_no){
        this.card_No = card_no;
    }
    public void setPin(String pin){
        this.pin = pin;
    }
    public void setMoney(long money){
        this.money = money;
    }
}
