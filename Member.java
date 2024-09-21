public class Member {
    private String name;
    private String greeting;

    public Member(String name, String greeting){
        this.name = name;
        this.greeting = greeting;
    }

    public String getName(){
        return name;
    }

    public String getGreeting(){
        return greeting;
    }

    public void printGreeting(){
        System.out.println(name + ": " +greeting);
    }
}
