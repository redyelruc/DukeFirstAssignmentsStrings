public class Part3 {
    public boolean twoOccurrences(String stringa, String stringb) {
        int firstIndex = stringb.indexOf(stringa);
        if (firstIndex == -1) {
            return false;
        }
        int secondIndex = stringb.indexOf(stringa, firstIndex + stringa.length());
        return secondIndex != -1;
    }

    public String lastPart(String stringa, String stringb){
        int firstIndex = stringb.indexOf(stringa);
        if (firstIndex == -1) {
            return stringb;
        }
        return stringb.substring(firstIndex + stringa.length());
    }

    public void testing() {

        System.out.println(lastPart("an", "banana")); //returns ANA
        System.out.println(lastPart("zoo", "forest")); //returns forest
        System.out.println(lastPart("bra", "zebra")); // returns {empty string}

    }
}
