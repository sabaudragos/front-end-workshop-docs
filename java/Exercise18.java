public class Exercise18 {
        public static void main(String[] args) {
            // null
            System.out.println("1. Result= " + indexOfSecondOfString(null, null));
            System.out.println("2. Result= " + indexOfSecondOfString("", null));
            System.out.println("3. Result= " + indexOfSecondOfString(null, ""));
            System.out.println("4. Result= " + indexOfSecondOfString("", ""));
            System.out.println("5. Result= " + indexOfSecondOfString("one", "twenty"));
            System.out.println("6. Result= " + indexOfSecondOfString("one", "two"));
            System.out.println("7. Result= " + indexOfSecondOfString("douacarti", "carti"));
            System.out.println("8. Result= " + indexOfSecondOfString("carti", "carti"));
            System.out.println("9. Result= " + indexOfSecondOfString("douacarti", "cartile"));
            System.out.println("10. Result= " + indexOfSecondOfString("douacartimari", "cartile"));
            System.out.println("11. Result= " + indexOfSecondOfString("douacartimari", "carti"));
        }

        /**
         * @param firstString
         * @param secondString
         * @return the index of the string or -1 otherwise
         */
        private static int indexOfSecondOfString(String firstString, String secondString) {
            if (firstString == null || firstString.equals("") || secondString == null || secondString.equals("")) {
                return -1;
            }

            if (secondString.length() > firstString.length()) {
                return -1;
            }

            for (int i = 0; i < firstString.length(); i++) {
                if (firstString.charAt(i) == secondString.charAt(0)) {
                    if (secondString.length() > (firstString.length() - i)) { // 1.douacarti 2.cartile      i = 4  firstString.length() = 9
                        return -1;
                    } else {
                        boolean firstStringContainsTheSecond = false;
                        for (int j = 0; j < secondString.length(); j++) {
                            if (secondString.charAt(j) == firstString.charAt(i + j)) {
                                firstStringContainsTheSecond = true;
                            } else {
                                firstStringContainsTheSecond = false;
                            }
                        }
                        if (firstStringContainsTheSecond == true) {
                            return i;
                        }
                    }
                }
            }

            return -1;
        }

        private static String first(String word) {// Ana are mere
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == ' ') {
                    String firstWord = "";
                    for (int j = 0; j < i; j++) {
                        firstWord = firstWord + word.charAt(j);
                    }
                    return firstWord;
                }
            }
            return "";
        }
    }
