package com.arydz.codility.countingelements

import spock.lang.Specification
import spock.lang.Unroll

class FrogRiverOneTest extends Specification {
    private FrogRiverOne frogRiverOne = new FrogRiverOne()

    @Unroll
    def "test solution"() {
        expect:
        expected == frogRiverOne.solution(x,array)
        where:
        x       | array                             | expected
        5       | [1,3,1,4,2,3,5,4] as int[]        | 6
        5       | [1,3,1,3,2,3,5,4] as int[]        | 7

    }
}
