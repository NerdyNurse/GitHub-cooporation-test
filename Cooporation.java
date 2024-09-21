import java.util.ArrayList;

public class Cooporation{
    private String name;
    private ArrayList<Member> members;

    public Cooporation(String name){
        this.name = name;
        members  = new ArrayList<>();
        initializeOwner();
        System.out.println("The cooporation, " + name + " has been initialized.");
        
    }


    private void initializeOwner(){
        members.add(new Member("Amalie", "Hellooooooo, where is everyone....!?!?!?"));
    }

    public void addMember(String name, String greeting){
        members.add(new Member(name, greeting));
    }

    public void printGreetings(){
        for(Member member : members){
            member.printGreeting();
        }
    }

}