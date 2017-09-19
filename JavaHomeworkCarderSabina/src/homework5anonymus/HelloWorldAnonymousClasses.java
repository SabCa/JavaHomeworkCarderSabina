package homework5anonymus;

public class HelloWorldAnonymousClasses {
    interface HelloWorld {// Inner interface HelloWorld 
        public void greet();
        public void greetSomeone(String someone); 
    }
    public void sayHello() {
        class EnglishGreeting implements HelloWorld {
            String name ="world";
            public void greet() 
            {
                greetSomeone("world");
            }
            public void greetSomeone(String someone){
                name = someone;
                System.out.println("Hello " + name);
            }
        }
        HelloWorld englishGreeting = new EnglishGreeting();
        // HelloWorld FrenchGreeting = new HelloWorld(){ 
        class FrenchGreeting implements HelloWorld {
            String name = "tout le monde";
            public void greet()
            {
                greetSomeone("tout le monde");
            }
            public void greetSomeone(String someone)
            {
                name = someone;
                System.out.println("Salut " + name); 
             }
        };
        // HelloWorld SpanishGreeting = new HelloWorld(){
        class SpanishGreeting implements HelloWorld {
            String name = "mundo";
            public void greet()
            {
                greetSomeone("mundo"); 
            }
            public void greetSomeone(String someone)
            {
                name = someone;
                System.out.println("Hola, " + name); 
            }
        }; // end of anonymous class
        englishGreeting.greet(); 
        HelloWorld frenchGreeting = new FrenchGreeting();
        HelloWorld spanishGreeting = new SpanishGreeting();
        frenchGreeting.greetSomeone("Fred");
        spanishGreeting.greet();
    }
    /**
     *
     * @param args
     */
    public static void main (String... args)
    {   
        HelloWorldAnonymousClasses myApp = new HelloWorldAnonymousClasses();
        myApp.sayHello(); 
    }
};