package com.campusdual.classroom;

import org.junit.jupiter.params.shadow.com.univocity.parsers.common.TextParsingException;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {
    private Date expirationDate;

    public FreshMerchandise(String name, String uniqueId, String responsibleId) {
        super(name, uniqueId, responsibleId);
    }

    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf,
                            int quantity, Date expiration) {
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
        this.expirationDate = expiration;
    }

    public String getFormattedDate(Date date) {
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        return formato.format(date);
    }

    @Override
    public Object getSpecificData() {
        StringBuilder builder = new StringBuilder();
        builder.append("Localización: ").append(getLocation());
        builder.append(" Caducidad: ").append(getFormattedDate(expirationDate));
        return builder.toString();
    }

    public Date getExpirationDate() {
        return this.expirationDate;
    }

    public void printSpecificData() {
        System.out.println(getSpecificData());
    }
}