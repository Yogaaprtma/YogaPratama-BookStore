/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tokobukuapps;
import java.util.Date;

/**
 *
 * @author yogaadipratama
 */
public class cekClass {
    
    public static void main(String[] args){
        Date uDate = new Date();
        System.out.println(""+uDate);
        java.sql.Date sDate = convertUtilToSql(uDate);
        System.out.println(""+sDate);
    }
    
    private static java.sql.Date convertUtilToSql(java.util.Date uDate){
        java.sql.Date sDate = new java.sql.Date(uDate.getTime());
        return sDate;
    }
}
