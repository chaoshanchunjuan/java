package homework2;

public class girlFriendtest {
    public static void main(String[] args) {
        girlFriend g = new girlFriend();
        g.setname("铁锤");
        g.sethigh(150);
        g.setweight(100);
        g.show(g.getname(),g.gethigh(),g.getweight());
        g.wash();
        g.cook();
    }
}
