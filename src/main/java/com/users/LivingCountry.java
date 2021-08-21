package com.users;

public enum LivingCountry {
    UKRAINE("Украина"),
    POLAND("Польша"),
    MOLDOVA("Молдова");

    String alias;

    LivingCountry(String alias) {
        this.alias = alias;
    }

    public static LivingCountry getCountryByAlias(String country){

        for(LivingCountry livingCountry : values()){
            if(livingCountry.alias.equals(country)){
                return livingCountry;
            }
        }

        return null;
    }

    public static boolean isValid(String country){
        for(LivingCountry livingCountry : values()){
            if(livingCountry.alias.equals(country)){
                return true;
            }
        }

        return false;
    }
}
