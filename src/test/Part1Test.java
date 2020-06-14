import org.junit.*;

public class Part1Test {
    Part1 part1;

    @Before
    public void setup() {
        part1 = new Part1();
    }

    @Test
    public void testFindSimpleGeneValid() {
        String dnaTest1 = "AATGCGACCCTAACGT";
        String expected = "ATGCGACCCTAA";
        Assert.assertEquals(part1.findSimpleGene(dnaTest1), expected);
    }

    @Test
    public void testFindSimpleGeneNotMultiplesOfThreeReturnsEmpty() {
        String dnaTest2 = "ATGAGTGTCGTCATAA";
        Assert.assertTrue(part1.findSimpleGene(dnaTest2).length() == 0);
    }

    @Test
    public void testFindSimpleGeneNoStartCodonReturnsEmpty() {
        String dnaTest3 = "AAATAACAATCCATCA";
        String expected = "";
        Assert.assertEquals(part1.findSimpleGene(dnaTest3), expected);
    }

    @Test
    public void testFindSimpleGeneNoStopCodonReturnsEmpty() {
        String dnaTest4 = "AATAATGCTGCTGCTG";
        String expected = "";
        Assert.assertEquals(part1.findSimpleGene(dnaTest4), expected);
    }

    @Test
    public void testFindSimpleGeneNotStartOrStopCodonsReturnsEmpty() {
        String dnaTest5 = "AAAACACACACACGCA";
        String expected = "";
        Assert.assertEquals(part1.findSimpleGene(dnaTest5), expected);
    }
}
