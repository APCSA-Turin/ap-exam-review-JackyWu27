import java.util.ArrayList;

public class ClubMembers {
    private ArrayList<MemberInfo> memberList;

    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    public ClubMembers() {
        memberList = new ArrayList<MemberInfo>();
    }

    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    public ArrayList<MemberInfo> getMemberList() {
        return memberList;
    }

    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    public void setMemberList(ArrayList<MemberInfo> newList) {
        memberList = newList;
    }

    public void addMembers(String[] names, int gradYear) {
for (int c = 0; c < names.length; c ++) {
		memberList.add(new MemberInfo(names[c], gradYear, true));
}
    }

    public ArrayList<MemberInfo> removeMembers(int year) {
ArrayList<MemberInfo> rtrn = new ArrayList<MemberInfo>();
	for (int c = 0; c < memberList.size(); c ++) {
		if (memberList.get(c).getGradYear() <= year) {
			MemberInfo m = memberList.remove(c);
            c--;
			if (m.inGoodStanding()) {
				rtrn.add(m);
}
}
}
return rtrn;
    }
}
