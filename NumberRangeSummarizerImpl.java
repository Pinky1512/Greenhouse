/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loveyou;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


/**
 *
 * @author Lovelona
 */
public class NumberRangeSummarizerImpl implements NumberRangeSummarizer {



    @Override
    public Collection<Integer> collect(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }

        String trimmed = input.trim();
        if (trimmed.isEmpty()) {
            return Collections.emptyList();
        }

        return Arrays.stream(trimmed.split(","))
                .map(String::trim)
                .filter(token -> !token.isEmpty())
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    @Override
    public String summarizeCollection(Collection<Integer> input) {
        if (input == null) {
            throw new IllegalArgumentException("Input collection cannot be null");
        }

        if (input.isEmpty()) {
            return "";
        }

        List<Integer> sorted = input.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        List<String> ranges = new ArrayList<>();
        int rangeStart = sorted.get(0);
        int previous = rangeStart;

        for (int i = 1; i < sorted.size(); i++) {
            int current = sorted.get(i);
            if (current != previous + 1) {
                ranges.add(formatRange(rangeStart, previous));
                rangeStart = current;
            }
            previous = current;
        }
        ranges.add(formatRange(rangeStart, previous));

        return String.join(", ", ranges);
    }

    private String formatRange(int start, int end) {
        if (start == end) {
            return String.valueOf(start);
        }
        return start + "-" + end;
    }
}
 
