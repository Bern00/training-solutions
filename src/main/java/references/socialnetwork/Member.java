package references.socialnetwork;

import java.util.ArrayList;
import java.util.List;

public class Member {

    private String name;
    private List<Member> connections = new ArrayList<>();

    public Member(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Member> getConnections() {
        return connections;
    }

    public void connectMember(Member member) {
        connections.add(member);
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                '}';
    }

    private List<String> connectedNames() {
        List<String> connectedNames = new ArrayList<>();
        for(Member member: connections) {
            member.getName();
            connectedNames.add(member.getName());
        }
        return  connectedNames;
    }
}
