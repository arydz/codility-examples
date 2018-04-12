package com.arydz.codility.countingelements.learning

import spock.lang.Specification
import spock.lang.Unroll

class SwapOperationTest extends Specification {

    SwapOperation swapOperation = new SwapOperation()

    @Unroll
    def "test slowSolution"() {
        expect:
        expected == swapOperation.slowSolution(a, b, m)
        where:
        a                           | b                         | m     | expected
        [1, 2, 4] as int[]          | [3, 5, 1] as int[]        | 5     | true
    }

    @Unroll
    def "test fastSolution"() {
        expect:
        expected == swapOperation.fastSolution(a, b, m)
        where:
        a                           | b                         | m     | expected
        [1, 2, 4] as int[]          | [3, 5, 1] as int[]        | 5     | true
    }
}
