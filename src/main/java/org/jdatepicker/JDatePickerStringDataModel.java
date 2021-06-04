package org.jdatepicker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.jdatepicker.AbstractDateModel;

public class JDatePickerStringDataModel extends AbstractDateModel<String> {

    private final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    public JDatePickerStringDataModel() {
        super();
    }

    @Override
    protected String fromCalendar(Calendar from) {
        return sdf.format(from.getTime());
    }

    @Override
    protected Calendar toCalendar(String from) {
        try {
            Calendar c = Calendar.getInstance();
            c.setTime(sdf.parse(from));
            return c;
        } catch (ParseException e) {
            throw new IllegalArgumentException(e);
        }
    }

}