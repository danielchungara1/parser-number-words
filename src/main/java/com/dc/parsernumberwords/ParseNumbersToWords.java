package com.dc.parsernumberwords;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ParseNumbersToWords {

    private static final Map<String, String> dictionaryUnits;
    private static final Map<String, String> dictionaryDecenas;
    private static final Map<String, String> dictionaryCentenas;
    private static final Map<String, String> dictionaryMiles;
    private static final Map<String, String> dictionaryVarios;

    /**
     * Parse a number to its equivalent in words (Spanish)
     * Restriction: numbers from 0 to up 999 999 999 999
     * @param target number to parse
     * @return words equivalent
     */
    public String parse(String target) {
        if (target == null || target.equals("")) {
            return "";
        }
        // Remove left zeros, 'no son significativos'.
        target = String.valueOf(Long.parseLong(target));
        int MAX_DIGITS = 12;
        String[] digits = new String[MAX_DIGITS];
        String[] targetArray = (new StringBuilder(target).reverse()).toString().split("");
        for (int i = 0; i < MAX_DIGITS; i++) {
            if (i < targetArray.length) {
                digits[i] = targetArray[i];
            } else {
                digits[i] = "0";
            }
        }
        String result = "";

        // unidades/decenas/centenas de mil millones
        result += getPartialResult(digits, 9, 12, "mil millones", "mil millon");
        // unidades/decenas/centenas de mil millones
        result += getPartialResult(digits, 6, 9, "millones", "millon");
        // unidades/decenas/centenas de miles
        result += getPartialResult(digits, 3, 6, "mil", "mil");
        // unidades/decenas/centenas
        result += parseUnidadesDecenasCentenas(Arrays.copyOfRange(digits, 0, 3));

        return result.trim();
    }

    private String getPartialResult(String[] digits, int from, int to, String ending, String endingSingular) {
        String partial = "";
        if(parseUnidadesDecenasCentenas(Arrays.copyOfRange(digits, from, to)).equals("uno")) {
            partial += endingSingular + " ";
        } else {
            if(!parseUnidadesDecenasCentenas(Arrays.copyOfRange(digits, from, to)).equals("")) {
                partial += parseUnidadesDecenasCentenas(Arrays.copyOfRange(digits, from, to)) + " " + ending + " ";
            }
        }
        return partial;
    }

    private String parseUnidadesDecenasCentenas(String[] digits) {
        String result = "";

        if ((!digits[0].equals("0") || !digits[1].equals("0")) && digits[2].equals("1")) {
            result += "ciento";
        } else {
            result += dictionaryCentenas.get(digits[2]);
        }

        if (!digits[0].equals("0") && !digits[1].equals("0") && dictionaryVarios.containsKey(digits[1] + digits[0])) {
            if (!digits[2].equals("0")) {
                result += " ";
            }
            result += dictionaryVarios.get(digits[1] + digits[0]);
        } else {
            if (!dictionaryDecenas.get(digits[1]).equals("")) {
                result += " " + dictionaryDecenas.get(digits[1]);
            }

            if ((!digits[0].equals("0") && !digits[2].equals("0")) ||
                    (!digits[0].equals("0") && !digits[1].equals("0"))
            ) {
                result += " y " + dictionaryUnits.get(digits[0]);
            } else {
                result += " " + dictionaryUnits.get(digits[0]);
            }
            result = result.trim();

        }

        return result;
    }

    static {
        Map<String, String> map = new HashMap<>();
        map.put("0", "");
        map.put("1", "uno");
        map.put("2", "dos");
        map.put("3", "tres");
        map.put("4", "cuatro");
        map.put("5", "cinco");
        map.put("6", "seis");
        map.put("7", "siete");
        map.put("8", "ocho");
        map.put("9", "nueve");
        dictionaryUnits = map;
    }

    static {
        Map<String, String> map = new HashMap<>();
        map.put("0", "");
        map.put("1", "diez");
        map.put("2", "veinte");
        map.put("3", "treinta");
        map.put("4", "cuarenta");
        map.put("5", "cincuenta");
        map.put("6", "sesenta");
        map.put("7", "setenta");
        map.put("8", "ochenta");
        map.put("9", "noventa");
        dictionaryDecenas = map;
    }

    static {
        Map<String, String> map = new HashMap<>();
        map.put("0", "");
        map.put("1", "cien");
        map.put("2", "docientos");
        map.put("3", "trecientos");
        map.put("4", "cuatrocientos");
        map.put("5", "quinientos");
        map.put("6", "seicientos");
        map.put("7", "setecientos");
        map.put("8", "ochocientos");
        map.put("9", "novecientos");
        dictionaryCentenas = map;
    }

    static {
        Map<String, String> map = new HashMap<>();
        map.put("", "");
        map.put("1000", "mil");
        map.put("1000000", "millon");
        map.put("1000000000", "mil millon");
        dictionaryMiles = map;
    }

    static {
        Map<String, String> map = new HashMap<>();
        map.put("", "");
        map.put("11", "once");
        map.put("12", "doce");
        map.put("13", "trece");
        map.put("14", "catorce");
        map.put("15", "quince");
        map.put("16", "dieciseis");
        map.put("17", "diecisiete");
        map.put("18", "dieciocho");
        map.put("19", "diecinueve");
        map.put("21", "veintiuno");
        map.put("22", "veintidos");
        map.put("23", "veintitres");
        map.put("24", "veinticuatro");
        map.put("25", "veinticinco");
        map.put("26", "veintiseis");
        map.put("27", "veintisiete");
        map.put("28", "veintiocho");
        map.put("29", "veintinueve");

        dictionaryVarios = map;
    }
}
