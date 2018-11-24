
public class ContactNumber {
    private int areaCode;
    private int line;
    private int exchange;

    public ContactNumber() {
        areaCode = 000;
        line = 000;
        exchange = 0000000;
    }

    public ContactNumber(int areaCode, int line, int exchange) {
        this.areaCode = areaCode;
        this.line = line;
        this.exchange = exchange;
    }

    public int getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(int areaCode) {
        this.areaCode = areaCode;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public int getExchange() {
        return exchange;
    }

    public void setExchange(int exchange) {
        this.exchange = exchange;
    }

   public void SetContact(){

   }

   public void Display(){
        System.out.print(getAreaCode());
        System.out.print(getLine());
        System.out.print(getExchange());
   }
}
