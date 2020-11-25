package references.socialnetwork;

import java.util.ArrayList;
import java.util.List;

public class SocialNetwork {

    private List<Member> memberList = new ArrayList<>();


    public void addMember(String name) {
        Member member = new Member(name);
        memberList.add(member);
    }


    public void connect(String name, String otherName) {

        Member firstMember = findByName(name);
        Member otherMember = findByName(otherName);
        firstMember.connectMember(otherMember);


    }

    public List<String> bidirectionalConnections() {
        List<String> connections = new ArrayList<>();
        for(Member member: memberList) {
            for(Member connection: member.getConnections()) {
                if (connection.getConnections().contains(member)) {
                    connections.add(member.getName() + " - " + connection.getName());
                }

            }
        }
        return connections;
    }

    private Member findByName(String name) {

        for(Member member: memberList) {
            if(member.getName().equals(name)) {
                return member;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "SocialNetwork{" +
                "memberList=" + memberList +
                '}';
    }
}
