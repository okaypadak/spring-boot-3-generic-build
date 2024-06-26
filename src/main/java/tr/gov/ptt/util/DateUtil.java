package tr.gov.ptt.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public final class DateUtil {

    private DateUtil() {
        throw new IllegalStateException("Utility class!");
    }

    private static Date addDaysToDate(Date date, int dayCount) {
        return new Date(date.getTime() + (86_400_000L * dayCount));
    }

    private static Date convertTextToDate(String date, String pattern) throws ParseException {
        return new SimpleDateFormat(pattern).parse(date);
    }

    private static String convertDateToText(Date date, String pattern) {
        return new SimpleDateFormat(pattern).format(date);
    }

    public static String yyyyMMddTHHmmss2String() {
        return convertDateToText(new Date(),"yyyy-MM-dd'T'HH:mm:ss");
    }
    public static String yyyyMMddHHmmss2String() {
        return convertDateToText(new Date(),"yyyyMMddHHmmss");
    }

    public static String yyyyMMdd2String() {
        return convertDateToText(new Date(),"yyyyMMdd");
    }
    public static Integer yyyyMMdd2Integer() {return Integer.valueOf(convertDateToText(new Date(),"yyyyMMdd"));}

    public static Integer HHmmss2Integer() {return Integer.valueOf(convertDateToText(new Date(),"HHmmss"));}

    public static String MMddHHmmss2String() {
        return convertDateToText(new Date(),"MMddHHmmss");
    }

    public static LocalDateTime yyyyMMdd2LocalDateTime(Integer tarih) {
        return convertIntegerToLocalDate(tarih, "yyyyMMdd");
    }

    private static LocalDateTime convertIntegerToLocalDate(Integer tarih, String format) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        try {
            LocalDate date = LocalDate.parse(tarih.toString(), formatter);
            return date.atStartOfDay();
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Text '" + tarih + "' could not be parsed: " + e.getMessage());
        }
    }

}
