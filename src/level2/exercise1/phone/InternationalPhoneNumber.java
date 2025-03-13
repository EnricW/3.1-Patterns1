package level2.exercise1.phone;

public class InternationalPhoneNumber implements PhoneNumber {
    private String number;
    private String prefix;

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
        this.prefix = prefix;
    }
}
