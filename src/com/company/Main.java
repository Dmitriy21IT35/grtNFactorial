package com.company;

public class Main {
    static class Formula {
        public double N;
        public double x;

        public Formula(double N, double x) {
            this.N = N;
            this.x = x;
        }

        public void displayformula() {
            double Y = getFactorial(N) / Math.pow(x, x);
            System.out.println(Y);
            System.out.println(N);
        }

        private double getFactorial(double N) {
            if (N <= 1) {
                return (1);
            }
            else {
                return N * getFactorial( N- 1);
            }
        }
    }
    public static void main(String[] args) {
        Formula formula=new Formula(2,2);
        formula.displayformula();
        formula.N=3;
        formula.displayformula();
        formula.x=6;

    }
}
