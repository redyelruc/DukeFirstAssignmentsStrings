import org.junit.*;

public class Part2Test {
    Part2 part2;
    String start;
    String stop;

    @Before
    public void setup() {
        part2 = new Part2();
        start = "ATG";
        stop  = "TAA";
    }

    @Test
    public void testFindSimpleGeneValid() {
        String dnaTest1 = "AATGCGACCCTAACGT";
        String expected = "ATGCGACCCTAA";
        Assert.assertEquals(part2.findSimpleGene(dnaTest1,start,stop), expected);
    }

    @Test
    public void testFindSimpleGeneNoStartCodonReturnsEmpty() {
        String dnaTest3 = "AAATAACAATCCATCA";
        String expected = "";
        Assert.assertEquals(part2.findSimpleGene(dnaTest3, start, stop), expected);
    }

    @Test
    public void testFindSimpleGeneNoStopCodonReturnsEmpty() {
        String dnaTest4 = "AATAATGCTGCTGCTG";
        String expected = "";
        Assert.assertEquals(part2.findSimpleGene(dnaTest4, start, stop), expected);
    }

    @Test
    public void testFindSimpleGeneNotStartOrStopCodonsReturnsEmpty() {
        String dnaTest5 = "AAAACACACACACGCA";
        String expected = "";
        Assert.assertEquals(part2.findSimpleGene(dnaTest5, start, stop), expected);
    }
}
