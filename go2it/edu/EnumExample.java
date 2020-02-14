package com.go2it.edu;

public class EnumExample {
    public static void main (String[]args){
        System.out.println(BeerType.valueOf("DARK"));
    //     System.out.println(BeerGlass.HUGE);
   //     System.out.println(BeerType.DARK);
    }


    private enum BeerType{
        DARK (55.0), LIGHT(2.0);

        private double alcoholLevel;


        private BeerType (double alcoholLevel) {
            this.alcoholLevel = alcoholLevel;
        }

        public double getAlcoholLevel() {
            return alcoholLevel;
        }
    }

}
