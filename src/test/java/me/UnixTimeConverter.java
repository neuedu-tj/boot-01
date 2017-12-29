package me;

import java.sql.Timestamp;

public class UnixTimeConverter {

    public static void main(String[] args) {

        Long now = 1513468800L * 1000;

        Timestamp  t = new Timestamp(now);

        System.out.println(t);
        
    }
    
}
