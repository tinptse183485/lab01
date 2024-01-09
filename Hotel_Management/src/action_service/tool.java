package action_service;

import java.util.Scanner;

public class tool {

    public static Scanner sc = new Scanner(System.in);

    //method phục vụ việc nhập ko dc để trống 
    public static int getAnInteger(String inpMsg, String errMsg) {
        System.out.println(inpMsg);
        while (true) {
            try {
                int number = Integer.parseInt(sc.nextLine());
                return number;
            } catch (NumberFormatException e) {
                System.out.println(errMsg);
            }
        }
    }

    //method phục vụ việc nhập số nguyên trong khoảng và ko dc để trống 
    public static int getAnInteger(String inpMsg, String errMsg, int lowerBound, int upperBound) {
        if (lowerBound > upperBound) {
            int tmp = lowerBound;
            lowerBound = upperBound;
            upperBound = tmp;
        }
        System.out.println(inpMsg);
        while (true) {
            try {
                int number = Integer.parseInt(sc.nextLine());
                if (number < lowerBound || number > upperBound) {
                    throw new Exception();
                }
                return number;
            } catch (Exception e) {
                System.out.println(errMsg);
            }
        }
    }

    // nhập số trong khoảng, được quyền bỏ trống 
    public static int getAnIntegerk(String inpMsg, String errMsg, int lowerBound, int upperBound) {
        if (lowerBound > upperBound) {
            int tmp = lowerBound;
            lowerBound = upperBound;
            upperBound = tmp;
        }
        System.out.println(inpMsg);

        try {
            int number = Integer.parseInt(sc.nextLine());
            if (number < lowerBound || number > upperBound) {
                throw new Exception();
            }
            return number;
        } catch (Exception e) {
            System.out.println(errMsg);
            return -1;

        }
    }

// nhập chuỗi tới khi có chuỗi
    public static String getString(String inpMsg, String errMsg) {
        System.out.println(inpMsg);
        while (true) {
            try {
                String str = sc.nextLine();
                if (str.isEmpty()) {
                    throw new Exception();
                }
                return str;//chuỗi rỗng không phải là NULL
            } catch (Exception e) {
                System.out.println(errMsg);
            }
        }
    }

    //String ép nhập theo regex
    public static String getString(String inpMsg, String errMsg, String regex) {
        System.out.println(inpMsg);
        while (true) {
            try {
                String str = sc.nextLine();
                if (str.isEmpty() || !str.matches(regex)) {
                    throw new Exception();
                }
                return str;//chuỗi rỗng không phải là NULL
            } catch (Exception e) {
                System.out.println(errMsg);
            }
        }
    }

    // nhập chuỗi tới khi đúng regex...........đang sửa
    public static String getStringk(String inpMsg, String errMsg, String regex) {
        System.out.println(inpMsg);
        while (true) {
            try {
                String str = sc.nextLine();
                if (!str.matches(regex) && !str.isEmpty()) {
                    throw new Exception();
                }
                return str;//chuỗi rỗng không phải là NULL
            } catch (Exception e) {
                System.out.println(errMsg);

            }
        }

    }

//nhập chuỗi 1 lần 
    public static String getStringk(String inpMsg) {
        System.out.println(inpMsg);

        String str = sc.nextLine();
        return str;
    }

    public static int getAnInteger(String inpMsg, String errMsg, int min) {
        System.out.println(inpMsg);
        while (true) {
            try {
                int number = Integer.parseInt(sc.nextLine());
                if (number < min) {
                    throw new Exception();
                }
                return number;
            } catch (Exception e) {
                System.out.println(errMsg);
            }
        }

    }

    public static void menu() {
        System.out.println("1) Adding new Hotel.\n"
                + "2) Checking exits Hotel.\n"
                + "3) Updating Hotel information.\n"
                + "4) Deleting Hotel.\n"
                + "5) Searching Hotel.\n"
                + "6) Displaying a hotel list (descending by Hotel_Name).\n"
                + "7) Others Quit.");
       // return getAnInteger("Enter your choice ", "Enter again", 0, 7);
    }

//nhập số nguyên 1 lần duy nhất 
    public static int getAnIntegerk(String inpMsg) {

        System.out.println(inpMsg);
        int number = Integer.parseInt(sc.nextLine());
        return number;

    }

    //nhập số nguyên cho tới khi > min, có quyền bỏ trống
    public static int getAnIntegerk(String inpMsg, String errMsg, int min) {
        System.out.println(inpMsg);
        while (true) {
            try {
                int number = Integer.parseInt(sc.nextLine());
                if (number < min ) {
                    throw new Exception();
                }
                return number;
            } catch (Exception e) {
                System.out.println(errMsg);
            }
        }

    }
}
