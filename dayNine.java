public class dayNine {
    public static void main(String[] args) {
        String[] in = {"flower", "flow", "flight"};
        String o = longestCommonPrefix(in);
        System.out.println(o);
    }

        public static String longestCommonPrefix (String[]strs){

            if (strs == null || strs.length == 0) {
                return "";
            }


            String firstString = strs[0];


            for (int i = 0; i < firstString.length(); i++) {
                char currentChar = firstString.charAt(i);


                for (int j = 1; j < strs.length; j++) {

                    if (i >= strs[j].length() || strs[j].charAt(i) != currentChar) {

                        return firstString.substring(0, i);
                    }
                }
            }

            return firstString;
        }
}
