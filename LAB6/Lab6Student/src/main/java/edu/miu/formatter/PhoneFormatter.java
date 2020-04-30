package edu.miu.formatter;

import edu.miu.domain.Phone;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;

@Component
public class PhoneFormatter implements Formatter<Phone> {
    public static final String SEPARATOR = "-";

    @Override
    public String print(Phone phone, Locale locale) {
        return phone.getArea() + SEPARATOR + phone.getPrefix() + SEPARATOR + phone.getNumber();
    }

    @Override
    public Phone parse(String source, Locale locale) throws ParseException {
        Phone phone = null;
        try {
            String[] phoneInput = source.split(SEPARATOR);
            phone = new Phone(Integer.parseInt(phoneInput[0]), Integer.parseInt(phoneInput[1]), Integer.parseInt(phoneInput[2]));
        } catch (Exception e) {
            System.out.println("Error - Bad Phone Format");
        }
        return phone;
    }

}
