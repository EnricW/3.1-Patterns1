package level2.exercise1.phone;

public class InternationalPhoneNumber extends AbstractPhoneNumber {
    private String number;
    private String prefix;

    public String getFormattedNumber() {
        return prefix + " " + number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
}