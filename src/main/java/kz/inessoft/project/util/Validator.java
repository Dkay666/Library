package kz.inessoft.project.util;


import static kz.inessoft.project.consatnts.Constants.DEFAULT_COUNT_FOR_PAGE;

/**
 * This class check if command length is valid IDs
 * @author Artyom Revinov.
 */
public class Validator {
    public static String takeLimitString(String value, int limit) {

        if (value.length() > limit) {

            return value.substring(0, limit);

        } else {

            return value;
        }
    }

    public static int takeLimitNumber(String value, int limit) {

        if (value.length() > limit) {

            value=value.substring(0, limit);
        }

        try{

            return Integer.valueOf(value);

        }catch (NumberFormatException n){

            return DEFAULT_COUNT_FOR_PAGE;
        }
    }
}
