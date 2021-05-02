package com.rakovets.course.java.core.practice.lambda_expressions.projectTV.comparators;

import com.rakovets.course.java.core.practice.lambda_expressions.projectTV.TV;
import java.util.Comparator;

public class DiagonalComparatorAscending implements Comparator<TV> {
    @Override
    public int compare(TV o1, TV o2) {
        return (int)(o1.getDiagonal() - o2.getDiagonal());
    }
}
