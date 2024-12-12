package level2.phone;

public class USPhoneNumber extends AbstractPhoneNumber {
    private String number;

    public String getFormattedNumber() {
        return "+1 " + number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}