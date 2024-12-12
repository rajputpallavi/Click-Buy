public class Test1 {
    public static void main(Stringss[] args){
        int a=10;
        int b=10;
        System.out.println("post: "+(a++));
        System.out.println("pre: "+(++a));
        System.out.println("post: "+(b--));
        System.out.println("pre: "+(--b));
        System.out.println("a + b = "+(a+b));
        System.out.println("a - b = "+(a-b));
        System.out.println("a * b = "+(a*b));
        System.out.println("a / b = "+(a/b));
        System.out.println("a % b = "+(a%b));
        int x=10;
        System.out.println("x += 3 = "+(x+=3));
        System.out.println("x -= 3 = "+(x-=3));
        System.out.println("x *= 3 = "+(x*=3));
        System.out.println("x /= 4 = "+(x/=4));
        System.out.println("x %= 3 = "+(x%=3));

    }
} 
