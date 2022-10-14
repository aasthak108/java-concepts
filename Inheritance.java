package javaConcept;

public class Inheritance {
    int length;
    int breadth;

    Inheritance(int x, int y)
    {
        length = x;
        breadth = y;
    }
    int area()
    {
        return length*breadth;
    }
}
class Room extends Inheritance
{
    int height;
    Room(int x,int y,int z)
    {
        super (x,y);
        height = z;
    }
    int volume()
    {
        return length*breadth*height;
    }
}
class InheritanceTest
{
    public static void main(String[] args)
    {
        Room room = new Room (2,4,5);
        int area1 = room.area();
        int volume1 = room.volume();
        System.out.println("Area is "+ area1 + " and Volume is "+ volume1);
    }
}

