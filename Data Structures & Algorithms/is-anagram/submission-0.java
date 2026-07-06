class Solution {
    public boolean isAnagram(String s, String t) {

        int a = s.length();

        int b = t.length();

        if(a != b){

            return false;
        }

        char[] first = s.toCharArray();

        char[] second = t.toCharArray();

        Arrays.sort(first);

        Arrays.sort(second);

        return Arrays.equals(first,second);

    }
}
