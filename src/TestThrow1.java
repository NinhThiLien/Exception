public class TestThrow1 {
    static void validate(int age){
        if(age<18) throw new ArithmeticException("not vaild");
        else System.out.println("welcome to vote ");
    }

    public static void main(String []agrs){
        validate(13);
        System.out.println("rest of the code...");
    }
}
