package MediamLevel;

public class LongestPalindrome {
        public static void main(String[] args) {
            String str = "babad";
            System.out.println(longestPalindrome(str));
        }

        public static String longestPalindrome(String str) {

            String longest = "";

            for (int i = 0; i < str.length(); i++) {

                // Check odd length palindrome
                String odd = expand(str, i, i);

                // Check even length palindrome
                String even = expand(str, i, i + 1);

                // Pick longer one
                if (odd.length() > longest.length())
                    longest = odd;

                if (even.length() > longest.length())
                    longest = even;
            }

            return longest;
        }

        public static String expand(String str, int left, int right) {

            while (left >= 0 && right < str.length() &&
                    str.charAt(left) == str.charAt(right)) {

                left--;
                right++;
            }

            return str.substring(left + 1, right);
        }
    }

