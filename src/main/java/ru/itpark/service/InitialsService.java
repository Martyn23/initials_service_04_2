package ru.itpark.service;

public class InitialsService {
    public String getInitials(String name) {

        String parts[] = name.split(" ");
        String initials = parts[0].substring(0, 1).toUpperCase();
        if (parts.length > 1) {
            initials = parts[0].substring(0, 1).toUpperCase()+parts[parts.length-1].substring(0,1).toUpperCase();
        }

        return initials;











    }
}
