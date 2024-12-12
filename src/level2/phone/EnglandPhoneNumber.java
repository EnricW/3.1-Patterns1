package level2.phone;

public class EnglandPhoneNumber extends AbstractPhoneNumber {
    private String number;

    public String getFormattedNumber() {
        return "+44 " + number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
