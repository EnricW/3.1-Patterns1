package level2.exercise1.phone;

public class NationalPhoneNumber implements PhoneNumber {
    private String number;
    private final String prefix = "+34";

    @Override
    public String getFormattedNumber() {
        return prefix + " " + number;
    }

    @Override
    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public void setPrefix(String prefix) {
    }
}