package com.rakovets.course.java.core.practice.lambda_expressions;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class TaskOneTest {
    @Test
    void mapTest() {
        String[] array = {"-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"};
        
        String actual = new TaskOne().getMap(array).toString();
        
        assertEquals("{-o=out.txt, -d=1, -i=in.txt, --limit=40}", actual);
    }

    @Test
    void arrayTest() {
        Map<String, String> map = Map.of("-i", "in.txt", "--limit", "40", "-d", "1", "-o",
                "out.txt");
        
        String[] actual = new TaskOne().getString(map);
        Arrays.sort(actual);
        
        assertEquals("[--limit : 40, -d : 1, -i : in.txt, -o : out.txt]", Arrays.toString(actual));
    }
}
