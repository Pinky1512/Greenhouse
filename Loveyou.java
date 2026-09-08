/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loveyou;

import java.util.Collection;

/**
 *
 * @author Lovelona
 */
public class Loveyou {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      NumberRangeSummarizer summarizer;
      summarizer = new NumberRangeSummarizerImpl();

      String input = "1,3,6,7,8,12,13,14,15,21,22,23,24,31";
      Collection<Integer> collected = summarizer.collect(input);
      String summarized = summarizer.summarizeCollection(collected);

      System.out.println("Input:  " + input);
      System.out.println("Output: " + summarized);
    }
    
}
