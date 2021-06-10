package com.example.car_gen;

public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Honda civic = new Honda("BLUE",  2021,  180,  false);
        Lexus rx350 = new Lexus("BLACK",  2021,  300,  true);
        Toyota supra = new Toyota("SILVER",  2021,  180,  true);

        //civic
        System.out.println(civic.getColor());
        civic.convertToElectric();
        System.out.println(civic.getElectricStatus());
        civic.setMaxSpeed(160);
        System.out.println(civic.getMaxSpeed());
        //turbo
        civic.setTurboCharged(true);
        System.out.println(civic.isTurboCharged());

        //rx350
        System.out.println(rx350.getColor());
        rx350.setYear(2020);
        System.out.println(rx350.getYear());
        rx350.convertToElectric();
        System.out.println(rx350.getElectricStatus());
        
	}

}
