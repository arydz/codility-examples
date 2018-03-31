package com.arydz.codility.timecomplexity

import spock.lang.Specification
import spock.lang.Unroll

class FrogJmpTest extends Specification {
    private FrogJmp frogJmp = new FrogJmp()
    @Unroll
    def "test solution"() {
        expect:
        expected == frogJmp.solution(x,y,d)
        where:
        x       | y     | d     | expected
        10      | 85    | 30    | 3
        85      | 85    | 30    | 0
        84      | 85    | 10    | 1
        84      | 85    | 1     | 1
        83      | 85    | 1     | 2
    }
}
