public class UnCheckEcxeption {
    public static void main(String[] args) {
        int i = 50/0;//ArithmeticException

        //NullPointerException
        String s = null;
        System.out.println(s.length());

        //NumberFormatException occurs
        String s1 ="abc";
        int i1 = Integer.parseInt(s1);

        //ArrayIndexOutOfBoundsException
        int []a= new int[5];
        a[10] =50;
    }
}
