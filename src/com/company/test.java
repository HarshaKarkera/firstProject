package com.company;

public class test

{
    public class Bicycle { String color = "red";
        private void printColor(String color) { color = "purple"; System.out.print(color);
        }
        public static void main(String[] rider) { new Bicycle().printColor("blue");
        }
    }

}
