package com.oops.banner;

public class BannerPrinter {

    private CharacterPattern characterPattern;

    public BannerPrinter() {
        characterPattern = new CharacterPattern();
    }

    // UC1 - Simple Display
    public void displaySimple() {
        System.out.println("OOPS");
    }

    // UC2 - Basic Banner
    public void displayBasicBanner() {
        System.out.println("*****   *****   *****   *****");
        System.out.println("*   *   *   *   *   *   *");
        System.out.println("*   *   *   *   *   *   *");
        System.out.println("*   *   *   *   *   *   *****");
        System.out.println("*****   *****   *****   *   *");
    }

    // UC5 - Advanced Banner using Map
    public void displayBanner(String text) {

        for (int row = 0; row < 5; row++) {
            for (char ch : text.toCharArray()) {

                String[] pattern = characterPattern.getPattern(ch);

                if (pattern != null) {
                    System.out.print(pattern[row] + "  ");
                }
            }
            System.out.println();
        }
    }

    // UC7 - Validation
    public boolean validateInput(String text) {
        return text.matches("[OPSops]+");
    }
}