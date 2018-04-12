package com.arydz.codility.countingelements

import spock.lang.Specification

class PermCheckTest extends Specification {
    PermCheck permCheck = new PermCheck()

    def "test solution"() {
        expect:
        expected == permCheck.solution(array)
        where:
        array               | expected
        [4,1,3,2] as int[]  | 1
        [4,1,3] as int[]    | 0
    }

    def "test solutionRecommendedByCodesays"() {
        expect:
        expected == permCheck.solutionRecommendedByCodesays(array)
        where:
        array               | expected
        [4,1,3,2] as int[]  | 1
        [4,1,3] as int[]    | 0
    }
}
