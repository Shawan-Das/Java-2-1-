package exam;

public class TestBox {
    public static void main(String[] args) {
        // id in the following 3 statements is the last 3 digits of your registration no.
        int l = 14%10+5;
        int w = 14%7+3;
        int h = 14%4+3;
        Box b1 = new Box(l, w, h);
        Box b2 = new Box(l, w, h);
        //System.out.printf("%d %d %d\n",b1.length,b1.width,b1.height);
        //System.out.printf("%d %d %d\n",b2.length,b2.width,b2.height);
        //System.out.println(b1.getVolume());
        //System.out.println(b2.getVolume());
        fun(b1, b2);
        System.out.printf("line-16--%d %d %d\n",b1.length,b1.width,b1.height);
        System.out.printf("line-16--%d %d %d\n",b2.length,b2.width,b2.height);
        System.out.println(b1.getVolume());
        System.out.println(b2.getVolume());
    }
    public static void fun(Box b1, Box b2) {
        b1.length= b2.width + 10;
        System.out.printf("line-20--%d %d %d\n",b1.length,b1.width,b1.height);
        System.out.printf("line-20--%d %d %d\n",b2.length,b2.width,b2.height);
        System.out.println(b1.getVolume());
        System.out.println(b2.getVolume());
        b2.width +=5;
        System.out.printf("line-25--%d %d %d\n",b1.length,b1.width,b1.height);
        System.out.printf("line-25--%d %d %d\n",b2.length,b2.width,b2.height);
        System.out.println(b1.getVolume());
        System.out.println(b2.getVolume());
        b1 = b2;
        System.out.printf("line-30--%d %d %d\n",b1.length,b1.width,b1.height);
        System.out.printf("line-30--%d %d %d\n",b2.length,b2.width,b2.height);
        System.out.println(b1.getVolume());
        System.out.println(b2.getVolume());
        b2.height = 5;
        System.out.printf("line-35--%d %d %d\n",b1.length,b1.width,b1.height);
        System.out.printf("line-35--%d %d %d\n",b2.length,b2.width,b2.height);
        System.out.println(b1.getVolume());
        System.out.println(b2.getVolume());
        b1.width = 10;
        System.out.printf("line-40--%d %d %d\n",b1.length,b1.width,b1.height);
        System.out.printf("line-40--%d %d %d\n",b2.length,b2.width,b2.height);
        System.out.println(b1.getVolume());
        System.out.println(b2.getVolume());
    }
}
class Box{
    int width, height, length;
    public Box(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }
    public int getVolume() {
        return length*width*height;
    }
}