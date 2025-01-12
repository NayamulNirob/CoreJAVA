class Solution {
    public static void main(String[]agrs){

        double discount= calculateDiscount(200,150);

        System.out.println(discount);
    }
    
      public static double calculateDiscount(double originalPrice, double discountedPrice) {
        return (originalPrice - discountedPrice);
    }
}