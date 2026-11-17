package SQL;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class UtilToSqlConversion {

    public static void main(String args[]) {
        java.util.Date utilDate = new java.util.Date();
        System.out.println("java.util.Date is : " + utilDate);

        java.sql.Date sqlDate = convert(utilDate);
        System.out.println("java.sql.Date is : " + sqlDate);

        DateFormat df = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
        System.out.println("dateFormated date is : " + df.format(utilDate));
    }

    private static java.sql.Date convert(java.util.Date uDate) {
        return new java.sql.Date(uDate.getTime());
    }
}