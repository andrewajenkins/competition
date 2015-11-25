import java.util.*;

public class EmailAliases {
    public static void main(String[] args) {
        Map<String, LinkedList<String>> map = new HashMap<>();
        List<String> ordering = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++) {
            String original = sc.nextLine();
            String mod = original.toLowerCase();
            String[] split = mod.split("@");
            if("bmail.com".equals(split[1])) {
                if(split[0].contains("+"))
                    split[0] = split[0].substring(0, split[0].indexOf("+"));
                split[0] = split[0].replace(".", "");
            }
            String base = split[0] + "@" + split[1];
            LinkedList<String> list = null;
            if(map.containsKey(base)) {
                list = map.get(base);
            } else {
                list = new LinkedList<>();
                ordering.add(base);
            }
            list.add(original);
            map.put(base, list);
        }
        System.out.println(map.keySet().size());
        for(String base : ordering) {
            LinkedList<String> list = map.get(base);
            System.out.print(list.size() + " ");
            for(String s : list) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}
