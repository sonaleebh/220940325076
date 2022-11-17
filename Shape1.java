
class Shape2
{
    void draw()
    {

        System.out.println("Drawing");
    }

    void erase()
    {
        System.out.println("Drawing");
    }

}

class Circlee extends Shape2
{
    @Override
    void draw()
    {
        System.out.println("Drawing Circle");
    }

    @Override
    void erase()
    {
        System.out.println("Erasing Circle");
    }
}

class Triangle extends Shape2
{
    @Override
    void draw()
    {
        System.out.println("Drawing Triangle");
    }

    @Override
    void erase()
    {
        System.out.println("Erasing Triangle");
    }
}

class Squaree extends Shape2
{
    @Override
    void draw()
    {
        System.out.println("Drawing Square");
    }

    @Override
    void erase()
    {
        System.out.println("Erasing Square");
    }
}


public class Shape1 {
    public static void main(String[] args) {
        Shape2 s1,s2,s3;
        s1=new Circlee();
        s2=new Triangle();
        s3=new Squaree();
        System.out.println("Circle functions: ");
        s1.draw();
        s1.erase();

        System.out.println("Triangle functions: ");
        s2.draw();
        s2.erase();

        System.out.println("Square functions: ");
        s3.draw();
        s3.erase();
    }
}
