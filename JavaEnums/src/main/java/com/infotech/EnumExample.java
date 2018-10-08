package com.infotech;

// Enum can be made in a separate file and outside as well as inside a class

interface Demo {

}

enum Mobile implements Demo {

    APPLE(80), SAMSUNG, HTC(50);

    int price;

    Mobile() {}

    Mobile(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

// ============  Enum behind the scenes behave as classes  ==================
//class Mobile {
//    static final Mobile APPLE = new Mobile("APPLE");
//    static final Mobile SAMSUNG = new Mobile("SAMSUNG");
//    static final Mobile HTC = new Mobile("HTC");
//
//    String value;
//
//    public Mobile(String value) {
//        this.value = value;
//    }
//
//    public String getValue() {
//        return value;
//    }
//}

public class EnumExample {

    public static void main(String[] args) {
//        System.out.println(Mobile.SAMSUNG.getValue());
        System.out.println(Mobile.SAMSUNG);
        System.out.println("Apple price " + Mobile.APPLE.getPrice());
        System.out.println("Apple sequence " + Mobile.APPLE.ordinal());

        Mobile m = Mobile.APPLE;
        switch (m) {

            case APPLE:
                System.out.println("\nApple is best");
                break;

            case SAMSUNG:
                System.out.println("First copy of Samsung");
                break;

            case HTC:
                System.out.println("HTC is not too good");
                break;
        }

        // Iterate Enum values
        System.out.println("\nMobile Enum values are :");
        Mobile values[] = Mobile.values();
        for (Mobile mobile: values) {
            System.out.println(mobile + "\t" + mobile.ordinal());
        }

        // Example of Enum
        RoleType roleType = RoleType.DEV;
        System.out.println("\n" + roleType);

        RoleType admin = RoleType.ADMIN;
        System.out.println("Admin code :" + admin.getCode() + "\nAdmin msg :" + admin.getMessage());
        System.out.println(RoleType.ADMIN);

    }
}
