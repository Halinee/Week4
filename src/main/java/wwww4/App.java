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

        User h2 = new User();
        h2.setName("이현수");
        h2.setAge(24);
        h2.setNumber(201413339);

        User h3 = new User();
        h3.setName("김종원");
        h3.setAge(24);
        h3.setNumber(201413286);
      
        User h4 = new User();
        h4.setName("조성준");
        h4.setAge(24);
        h4.setNumber(201413358);

        System.out.println("-----사용자-----");
        System.out.println("이름 : " + h1.getName());
        System.out.println("나이 : " + h1.getAge());
        System.out.println("학번 : " + h1.getNumber());

        System.out.println("\n-----사용자-----");
        System.out.println("이름 : " + h2.getName());
        System.out.println("나이 : " + h2.getAge());
        System.out.println("학번 : " + h2.getNumber());

        System.out.println("\n-----사용자-----");
        System.out.println("이름 : " + h3.getName());
        System.out.println("나이 : " + h3.getAge());
        System.out.println("학번 : " + h3.getNumber());

        System.out.println( "\n-----사용자-----" );
        System.out.println( "이름 : " + h4.getName() );
        System.out.println( "나이 : " + h4.getAge() );
        System.out.println( "학번 : " + h4.getNumber());

        if(h4.getName().contains("이")){
        System.out.println( "\n이름에 \'이\'가 있네");
        }
        else{
        System.out.println("\n이름에 \'이\'가 네");
        }
    }
}
