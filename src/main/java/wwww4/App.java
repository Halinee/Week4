package wwww4;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        User h1 = new User();
        h1.setName("이승환");
        h1.setAge(24);
        h1.setNumber(201413328);

        System.out.println("------이승환------");
        System.out.println("이름 : " + h1.getName());
        System.out.println("나이 : " + h1.getAge());
        System.out.println("학번 : " + h1.getNumber());
    }
}
