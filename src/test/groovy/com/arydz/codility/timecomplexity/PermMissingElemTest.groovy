package com.arydz.codility.timecomplexity

import spock.lang.Specification

class PermMissingElemTest extends Specification {
    PermMissingElem permMissingElem = new PermMissingElem()
    def "test solution"() {
        expect:
        expected == permMissingElem.solution(array)
        where:
        array                       | expected
        [2, 3, 1, 5] as int[]       | 4
        [4, 3, 1, 5] as int[]       | 2

    }
}
