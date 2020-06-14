import org.junit.*;

public class Part3Test {
    Part3 part3;
    String stringA;


    @Before
    public void setup() {
        part3 = new Part3();
        stringA = "AT";
    }

    @Test
    public void testTwoOccurrencesTwoValidReturnsTrue() {
        String stringB = "AATGAGTTCGTCATAA";
        Assert.assertTrue(part3.twoOccurrences(stringA, stringB));
    }

    @Test
    public void testTwoOccurrencesMultipleValidReturnsTrue(){
        String stringB = "ATATATATATATATAT";
        Assert.assertTrue(part3.twoOccurrences(stringA, stringB));
    }

    @Test
    public void testTwoOccurrencesOneValidReturnsFalse(){
        String stringB = "AATAAGTGCTGCTGCG";
        Assert.assertFalse(part3.twoOccurrences(stringA, stringB));
    }

    @Test
    public void testTwoOccurrencesNoneValidReturnsFalse(){
        String stringB = "AAAACACACACACGCA";
        Assert.assertFalse(part3.twoOccurrences(stringA, stringB));
    }

    @Test
    public void testTwoOccurrencesStringBShorterThanStringAReturnsFalse(){
        String stringB = "A";
        Assert.assertFalse(part3.twoOccurrences(stringA, stringB));
    }

    @Test
    public void testTwoOccurrencesStringBisEmptyReturnsFalse(){
        String stringB = "";
        Assert.assertFalse(part3.twoOccurrences(stringA, stringB));
    }

    @Test
    public void testLastPartANinBANANAReturnsANA(){
        String stringC = "AN";
        String banana = "BANANA";
        Assert.assertEquals(part3.lastPart(stringC, banana), "ANA");
    }

    @Test
    public void testLastPartZOOinFORESTReturnsFOREST(){
        String stringC = "ZOO";
        String forest = "FOREST";
        Assert.assertEquals(part3.lastPart(stringC, forest), "FOREST");
    }

    @Test
    public void testLastPartBRAinZEBRAReturnsEmptyString() {
        String stringC = "BRA";
        String zebra = "ZEBRA";
        Assert.assertEquals(part3.lastPart(stringC, zebra), "");
    }

}
