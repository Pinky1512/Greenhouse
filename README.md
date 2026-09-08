# Greenhouse
# Number Range Summarizer

A small Java utility I developed that takes a comma‑delimited string of integers and summarizes it by collapsing consecutive numbers into ranges.

## What it does

Given an input like:

1,3,6,7,8,12,13,14,15,21,22,23,24,31


The program produces:

1, 3, 6-8, 12-15, 21-24, 31


## Packages

- `numberrangesummarizer` — Clean implementation of the `NumberRangeSummarizer` interface with JUnit 5 unit tests.
- `loveyou` — NetBeans‑style version of the same utility with a `Loveyou` main class.

## Features

- Parses comma‑delimited integers, ignoring whitespace around numbers
- Removes duplicate values
- Sorts values before summarizing
- Collapses consecutive runs of two or more numbers into a dash range
- Handles empty input and null input safely

## How to run

Compile and run the `loveyou.Loveyou` main class:

##Example output
Input:  1,3,6,7,8,12,13,14,15,21,22,23,24,31
Output: 1, 3, 6-8, 12-15, 21-24, 31

##Build with 

Java(NetBeans 8.2 IDE)
JUnit 5 for testing
