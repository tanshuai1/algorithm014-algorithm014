public class IsAnagram242 {


    /**
     * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
     * 字符出现的次数要一致，但顺序可以不一致
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram(String s, String t) {
        /*//暴力破解
        if (s == null  || t == null || s.length() != t.length() ){
            return false;
        }
        char[] char_s = s.toCharArray();
        char[] char_t = t.toCharArray();
        Arrays.sort(char_s);
        Arrays.sort(char_t);
        return Arrays.equals(char_s,char_t);*/

        /**
         * 不考虑字母大小写，假设都是小写
         */
        if (s == null  || t == null || s.length() != t.length() ){
            return false;
        }
        
        int[] hash = new int[26];
        for (int i = 0;i < s.length(); i++){
            int idx1 = s.charAt(i) - 'a';
            int idx2 = t.charAt(i) - 'a';
            hash[idx1]++;
            hash[idx2]--;
        }
        
        //判断hash表中是否归零
        for (int i = 0;i<hash.length;i++){
            if (hash[i] != 0){
                return false;
            }
        }
        
        return true;
    }


    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaraf";
        boolean anagram = new IsAnagram242().isAnagram(s, t);
        System.out.println(anagram);
    }
}
