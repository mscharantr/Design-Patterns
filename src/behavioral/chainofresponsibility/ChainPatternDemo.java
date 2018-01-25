package behavioral.chainofresponsibility;

public class ChainPatternDemo {
      //je4 b 44h4b h4h4 b4b4
    //kjvfv hf h
    public static void main(String[] args) {
        TeamLeader teamLeader = new TeamLeader();
        ProjectLeader projectLeader = new ProjectLeader();
        HR hr = new HR();
        teamLeader.setNextSupervisor(projectLeader);
        projectLeader.setNextSupervisor(hr);

        teamLeader.applyLeave("David", 9);
        System.out.println();
        teamLeader.applyLeave("John", 18);
        System.out.println();
        teamLeader.applyLeave("Steve", 30);
        System.out.println();
        teamLeader.applyLeave("Rohan", 50);

    }

}