package level2.exercise1.phone;

public class NationalPhoneNumber extends AbstractPhoneNumber {
    private String number;
    private final String prefix = "+34";

    public String getFormattedNumber() {
        return prefix + " " + number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setPrefix(String prefix) {
    }
}
