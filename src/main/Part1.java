/**
 *
 */
public class Part1 {

    /**
     * Searches a DNA String for a genetic sequence that starts and ends with codons ("ATG" and "TAA")
     *
     * @param dna the String to search
     * @return a substring starting with "ATG" and ending with "TAA" or an empty String if nothing found
     */
    public String findSimpleGene(String dna) {
        String dnaStrand = "";
        int startIndex = dna.indexOf("ATG");
        if (startIndex != -1) {
            int stopIndex = dna.indexOf("TAA", startIndex);
            if (stopIndex != -1) {
                if ((stopIndex - startIndex) % 3 == 0) {
                    dnaStrand = dna.substring(startIndex, stopIndex + 3);
                }
            }
        }
        return dnaStrand;
    }
}
