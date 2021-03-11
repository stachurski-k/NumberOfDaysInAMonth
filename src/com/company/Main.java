package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isLeapYear(2017));
    }

    public static boolean isLeapYear(int year) {
        boolean leapYear = (year % 4 == 0);
        boolean leapYear2 = (year % 100 == 0);
        boolean leapYear3 = (year % 400 == 0);

        if ((year < 1 || year > 9999)) {
            return false;
        } else if (leapYear && !leapYear2) {
            return true;
        } else if (leapYear3) {
            return true;
        } else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        } switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    return 31;
                case 2:
                    if(isLeapYear(year)) {
                        return 29;
                    }else {
                        return 28;}
            case 4: case 6: case 9: case 11:
                    return 30;
            default:
                return -1;
            }
        }

    }

