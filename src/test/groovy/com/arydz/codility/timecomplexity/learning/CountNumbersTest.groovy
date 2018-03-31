package com.arydz.codility.timecomplexity.learning

import spock.lang.Specification
import spock.lang.Unroll

class CountNumbersTest extends Specification {
    private CountNumbers countNumbers = new CountNumbers()
    @Unroll
    def "test solution"() {
        expect:
        expected == countNumbers.solution(n)
        where:
        n | expected
        5 | 15
        6 | 21
    }
}
