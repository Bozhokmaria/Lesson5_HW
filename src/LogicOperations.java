public class LogicOperations {
    public static void main(String[] args) {
        int x = 5, y = 10, z = 15;

        System.out.println(x+=y>>x++*z); //5+=(1010>>5)*15, 5+= 0000 *15, 5+=0, x = 5

        System.out.println(z = ++x & y *5);// z = 6 & 10*5 = 0011 0010 + 0000 0110 = 0000 0010 = 2 (z = 2)

        System.out.println(y/=x+5|z); // y 10/=6+(0101 | 0010) (0111 = 7) 10/=6+7(13) = 0 , y = 0

        System.out.println(z=x++&y*5); // z = 6 & 0*5 =6&0 = 0110 & 0000 = 0000 = 0, z = 0

        System.out.println(x=y<<x++^z); // x = 0000<<7(0111)^0000 (0111) 0000<<7(0), x = 0000, x = 0
    }
}
