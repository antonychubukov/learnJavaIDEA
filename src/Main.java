import java.util.HashSet;
class Main {
    public static void main(String[] args) {
        String[] lst = {"test.email+alex@leetcode.com", "test.email@leetcode.com"};
        System.out.println(numUniqueEmails(lst));
    }
    public static int numUniqueEmails(String[] emails) {
        HashSet<String> res = new HashSet<>();
        for(String s: emails){
            String i = "";
            String j = "";
            if(s.indexOf("+")>=0){
                i = s.substring(0, s.indexOf("+"));
                i = i.replace(".","");
                j = s.substring(s.indexOf("@"));
                i += j;
            }else{
                i = s.substring(0, s.indexOf("@"));
                i = i.replace(".","");
                j = s.substring(s.indexOf("@"));
                i += j;
            }
            res.add(i);
        }
        return res.size();

    }
}