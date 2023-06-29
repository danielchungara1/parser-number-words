package com.dc.parsernumberwords;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ParseNumbersToWordsTest {

    @Test
    public void parseUnitsToWordsTest() {
        ParseNumbersToWords parser = new ParseNumbersToWords();
        final String TARGET_1 = "1";
        final String TARGET_2 = "2";
        final String TARGET_3 = "3";
        final String TARGET_4 = "4";
        final String TARGET_5 = "5";
        final String TARGET_6 = "6";
        final String TARGET_7 = "7";
        final String TARGET_8 = "8";
        final String TARGET_9 = "9";

        Assertions.assertEquals("uno", parser.parse(TARGET_1));
        Assertions.assertEquals("dos", parser.parse(TARGET_2));
        Assertions.assertEquals("tres", parser.parse(TARGET_3));
        Assertions.assertEquals("cuatro", parser.parse(TARGET_4));
        Assertions.assertEquals("cinco", parser.parse(TARGET_5));
        Assertions.assertEquals("seis", parser.parse(TARGET_6));
        Assertions.assertEquals("siete", parser.parse(TARGET_7));
        Assertions.assertEquals("ocho", parser.parse(TARGET_8));
        Assertions.assertEquals("nueve", parser.parse(TARGET_9));

    }

    @Test
    public void parseDecenasToWordsTest() {
        ParseNumbersToWords parser = new ParseNumbersToWords();
        final String TARGET_1 = "10";
        final String TARGET_2 = "20";
        final String TARGET_3 = "30";
        final String TARGET_4 = "40";
        final String TARGET_5 = "50";
        final String TARGET_6 = "60";
        final String TARGET_7 = "70";
        final String TARGET_8 = "80";
        final String TARGET_9 = "90";

        Assertions.assertEquals("diez", parser.parse(TARGET_1));
        Assertions.assertEquals("veinte", parser.parse(TARGET_2));
        Assertions.assertEquals("treinta", parser.parse(TARGET_3));
        Assertions.assertEquals("cuarenta", parser.parse(TARGET_4));
        Assertions.assertEquals("cincuenta", parser.parse(TARGET_5));
        Assertions.assertEquals("sesenta", parser.parse(TARGET_6));
        Assertions.assertEquals("setenta", parser.parse(TARGET_7));
        Assertions.assertEquals("ochenta", parser.parse(TARGET_8));
        Assertions.assertEquals("noventa", parser.parse(TARGET_9));

    }

    @Test
    public void parseCentenasToWordsTest() {
        ParseNumbersToWords parser = new ParseNumbersToWords();
        final String TARGET_1 = "100";
        final String TARGET_2 = "200";
        final String TARGET_3 = "300";
        final String TARGET_4 = "400";
        final String TARGET_5 = "500";
        final String TARGET_6 = "600";
        final String TARGET_7 = "700";
        final String TARGET_8 = "800";
        final String TARGET_9 = "900";

        Assertions.assertEquals("cien", parser.parse(TARGET_1));
        Assertions.assertEquals("docientos", parser.parse(TARGET_2));
        Assertions.assertEquals("trecientos", parser.parse(TARGET_3));
        Assertions.assertEquals("cuatrocientos", parser.parse(TARGET_4));
        Assertions.assertEquals("quinientos", parser.parse(TARGET_5));
        Assertions.assertEquals("seicientos", parser.parse(TARGET_6));
        Assertions.assertEquals("setecientos", parser.parse(TARGET_7));
        Assertions.assertEquals("ochocientos", parser.parse(TARGET_8));
        Assertions.assertEquals("novecientos", parser.parse(TARGET_9));

    }

    @Test
    public void parseMilesToWordsTest() {
        ParseNumbersToWords parser = new ParseNumbersToWords();
        final String TARGET_1 = "1000";
        final String TARGET_2 = "1000000";
        final String TARGET_3 = "1000000000";

        Assertions.assertEquals("mil", parser.parse(TARGET_1));
        Assertions.assertEquals("millon", parser.parse(TARGET_2));
        Assertions.assertEquals("mil millon", parser.parse(TARGET_3));

    }

    @Test
    public void parseSomeUnitsAndDecenasToWordsTest() {
        ParseNumbersToWords parser = new ParseNumbersToWords();
        final String TARGET_1 = "11";
        final String TARGET_2 = "18";
        final String TARGET_3 = "21";
        final String TARGET_4 = "55";
        final String TARGET_5 = "77";
        final String TARGET_6 = "89";
        final String TARGET_7 = "99";

        Assertions.assertEquals("once", parser.parse(TARGET_1));
        Assertions.assertEquals("dieciocho", parser.parse(TARGET_2));
        Assertions.assertEquals("veintiuno", parser.parse(TARGET_3));
        Assertions.assertEquals("cincuenta y cinco", parser.parse(TARGET_4));
        Assertions.assertEquals("setenta y siete", parser.parse(TARGET_5));
        Assertions.assertEquals("ochenta y nueve", parser.parse(TARGET_6));
        Assertions.assertEquals("noventa y nueve", parser.parse(TARGET_7));

    }

    @Test
    public void parseSomeCentenasMixToWordsTest() {
        ParseNumbersToWords parser = new ParseNumbersToWords();
        final String TARGET_1 = "100";
        final String TARGET_2 = "219";
        final String TARGET_3 = "112";
        final String TARGET_4 = "120";
        final String TARGET_5 = "135";
        final String TARGET_6 = "200";
        final String TARGET_7 = "710";
        final String TARGET_8 = "999";
        final String TARGET_9 = "101";

        Assertions.assertEquals("cien", parser.parse(TARGET_1));
        Assertions.assertEquals("docientos diecinueve", parser.parse(TARGET_2));
        Assertions.assertEquals("ciento doce", parser.parse(TARGET_3));
        Assertions.assertEquals("ciento veinte", parser.parse(TARGET_4));
        Assertions.assertEquals("ciento treinta y cinco", parser.parse(TARGET_5));
        Assertions.assertEquals("docientos", parser.parse(TARGET_6));
        Assertions.assertEquals("setecientos diez", parser.parse(TARGET_7));
        Assertions.assertEquals("novecientos noventa y nueve", parser.parse(TARGET_8));
        Assertions.assertEquals("ciento y uno", parser.parse(TARGET_9));

    }

    @Test
    public void parseSomeMilesMixToWordsTest() {
        ParseNumbersToWords parser = new ParseNumbersToWords();
        final String TARGET_1 = "1100";
        final String TARGET_2 = "1212";
        final String TARGET_3 = "1551";
        final String TARGET_4 = "1777";
        final String TARGET_5 = "1811";
        final String TARGET_6 = "1999";
        final String TARGET_7 = "5132";
        final String TARGET_8 = "9999";
        final String TARGET_9 = "1101";
        final String TARGET_10 = "1001";

        Assertions.assertEquals("mil cien", parser.parse(TARGET_1));
        Assertions.assertEquals("mil docientos doce", parser.parse(TARGET_2));
        Assertions.assertEquals("mil quinientos cincuenta y uno", parser.parse(TARGET_3));
        Assertions.assertEquals("mil setecientos setenta y siete", parser.parse(TARGET_4));
        Assertions.assertEquals("mil ochocientos once", parser.parse(TARGET_5));
        Assertions.assertEquals("mil novecientos noventa y nueve", parser.parse(TARGET_6));
        Assertions.assertEquals("cinco mil ciento treinta y dos", parser.parse(TARGET_7));
        Assertions.assertEquals("nueve mil novecientos noventa y nueve", parser.parse(TARGET_8));
        Assertions.assertEquals("mil ciento y uno", parser.parse(TARGET_9));
        Assertions.assertEquals("mil uno", parser.parse(TARGET_10));

    }

    @Test
    public void parseSomeMiles2MixToWordsTest() {
        ParseNumbersToWords parser = new ParseNumbersToWords();
        final String TARGET_1 = "5000";
        final String TARGET_2 = "100000";
        final String TARGET_3 = "330000";
        final String TARGET_4 = "999999";

        Assertions.assertEquals("cinco mil", parser.parse(TARGET_1));
        Assertions.assertEquals("cien mil", parser.parse(TARGET_2));
        Assertions.assertEquals("trecientos treinta mil", parser.parse(TARGET_3));
        Assertions.assertEquals("novecientos noventa y nueve mil novecientos noventa y nueve", parser.parse(TARGET_4));

    }

    @Test
    public void parseMillonesAndMilMillonesToWordsTest() {
        ParseNumbersToWords parser = new ParseNumbersToWords();
        final String TARGET_1 = "55000000";
        final String TARGET_2 = "931000000";
        final String TARGET_3 = "1000000000";
        final String TARGET_4 = "124000000000";
        final String TARGET_5 = "999999999999";
        final String TARGET_6 = "085411150109";

        Assertions.assertEquals("cincuenta y cinco millones", parser.parse(TARGET_1));
        Assertions.assertEquals("novecientos treinta y uno millones", parser.parse(TARGET_2));
        Assertions.assertEquals("mil millon", parser.parse(TARGET_3));
        Assertions.assertEquals("ciento veinticuatro mil millones", parser.parse(TARGET_4));
        Assertions.assertEquals("novecientos noventa y nueve mil millones novecientos noventa y nueve millones novecientos noventa y nueve mil novecientos noventa y nueve", parser.parse(TARGET_5));
        Assertions.assertEquals("ochenta y cinco mil millones cuatrocientos once millones ciento cincuenta mil ciento y nueve", parser.parse(TARGET_6));

    }

}
