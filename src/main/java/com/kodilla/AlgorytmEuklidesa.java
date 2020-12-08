package com.kodilla;

public class AlgorytmEuklidesa {

        public static Integer NWD(Integer a, Integer b) { // two variables

            while (!a.equals(b)) { //while it continues until the end of finding the divisor of the two variables
                if (a > b) {
                    a -= b;

                }

                else {
                    b -= a;

                }

            }

            return a;

        }

        public static void main(String[] args) {

            Integer NWD = NWD(10, 24);
            System.out.println("Greatest common divisor: NWD " + NWD);

        }
    }