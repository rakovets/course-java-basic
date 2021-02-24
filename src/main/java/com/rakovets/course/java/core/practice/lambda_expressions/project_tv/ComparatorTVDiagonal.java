package com.rakovets.course.java.core.practice.lambda_expressions.project_tv;

import java.util.Comparator;

public class ComparatorTVDiagonal  implements Comparator<TV> {
    @Override
    public int compare(TV tv1, TV tv2) {
        return Double.compare(tv1.getDiagonal(), tv2.getDiagonal());
    }
}
