package kr.co.javaex.ex04;

public class printer {
    public void println( int x){
        System.out.println(x);
    }
    public void println(String x){
        System.out.println(x);

    }
    public void println(boolean x){
        System.out.println(x);

    }
    public void println(char x){
        System.out.println(x);
    }

    public static void main(String[] args) {
        printer p = new printer();
        p.println(1);
        p.println(true);
        p.println('a');
    }


}
