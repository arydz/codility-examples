package com.arydz.codility.timecomplexity

import spock.lang.Specification

class TapeEquilibriumTest extends Specification {

    private TapeEquilibrium tapeEquilibrium = new TapeEquilibrium()
    def "test solution"() {
        expect:
        expected == tapeEquilibrium.solution(array)
        where:
        array                       | expected
        [3, 1, 2, 4, 3] as int[]    | 1
        [2, 2, 2, 0] as int[]       | 2
        [1, 2, 0, 2, 1] as int[]    | 0
    }
}
