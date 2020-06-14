public class Part2 {
    public String findSimpleGene(String dna, String startCodon, String stopCodon) {
        char firstLetter = dna.charAt(0);
        if (Character.isUpperCase(firstLetter)) {
            startCodon = startCodon.toUpperCase();
            stopCodon = stopCodon.toUpperCase();
        } else {
            startCodon = startCodon.toLowerCase();
            stopCodon = stopCodon.toLowerCase();
        }
        int startIndex = dna.indexOf(startCodon);
        if (startIndex == -1) {
            return "";
        }
        int stopIndex = dna.indexOf(stopCodon, startIndex);
        if (stopIndex == -1) {
            return "";
        }
        if ((stopIndex - startIndex) % 3 == 0) {
            String dnaStrand = dna.substring(startIndex, stopIndex + 3);
            return dnaStrand;
        } else {
            return "";
        }
    }

    public void testSimpleGene() {
        String dnaTest1 = "aatgcgaccctaacgt"; // valid
        String dnaTest2 = "AATGAGTTCGTCATAA"; // valid but CAPS
        String dnaTest3 = "AAATAACAATCCATCA"; // no start codon
        String dnaTest4 = "AATAATGCTGCTGCTG"; // no stop codon
        String dnaTest5 = "AAAACACACACACGCA"; // no start or stop codons
        String lastTest = "AAATGCCCTAACTAGATTAAGAAACC";
        String start = "ATG";
        String stop  = "TAA";
        System.out.println("dna string is = " + dnaTest1);
        System.out.println("the gene found is = " + findSimpleGene(dnaTest1, start, stop));
        System.out.println("dna string is = " + dnaTest2);
        System.out.println("the gene found is = " + findSimpleGene(dnaTest2, start, stop));
        System.out.println("dna string is = " + dnaTest3);
        System.out.println("the gene found is = " + findSimpleGene(dnaTest3, start, stop));
        System.out.println("dna string is = " + dnaTest4);
        System.out.println("the gene found is = " + findSimpleGene(dnaTest4, start, stop));
        System.out.println("dna string is = " + lastTest);
        System.out.println("the gene found is = " + findSimpleGene(lastTest, start, stop));
    }

    public static void main(String[] args) {
        Part2 p2 = new Part2();
        p2.testSimpleGene();


    }

}
