package com.infotech;

public class CustomExceptionDemo {

    public static void main(String[] args) {

        try {
            int age = 25;
            new CustomExceptionDemo().calculateExtraBenefits(age);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void calculateExtraBenefits(int age) {
        // If age is less than 60 throw exception
        if (age < 60) {
            throw new InvalidAgeException(age);
        }else {
            System.out.println("Recognized as senior citizen..");
            System.out.println("Calculate ExtraBenefit for senior citizen..");
        }
    }

}
