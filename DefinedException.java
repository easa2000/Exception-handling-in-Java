class MyException extends Exception{
    String str1;

    public MyException(String str2) {
        str1 = str2;
    }
    public String toString() {
        return "My Exception Occurred: " + str1;
    }
}

class DefinedException {
    public static void main(String[] args) {
        try{
            System.out.println("Starting of the block");
            throw new MyException("This is error message");
        }catch (MyException e) {
            System.out.println("Catch Block");
            System.out.println(e);
        }
    }
}
