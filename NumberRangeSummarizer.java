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
public interface NumberRangeSummarizer {
        /**
     * Parses a comma delimited string of integers into a collection.
     *
     * @param input a comma delimited string of integers; may contain whitespace
     * @return a collection of integers in the order they appear in the input
     * @throws IllegalArgumentException if input is {@code null}
     * @throws NumberFormatException    if any token cannot be parsed as an integer
     */
    Collection<Integer> collect(String input);

    /**
     * Summarizes a collection of integers into a comma delimited string,
     * grouping consecutive numbers into ranges.
     *
     * @param input a collection of integers
     * @return a summarized string representation of the input
     * @throws IllegalArgumentException if input is {@code null}
     */
    String summarizeCollection(Collection<Integer> input);
}
