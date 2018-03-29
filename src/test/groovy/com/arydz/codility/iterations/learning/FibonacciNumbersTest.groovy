package com.arydz.codility.iterations.learning

import spock.lang.Specification

class FibonacciNumbersTest extends Specification {

    FibonacciNumbers fibonacciNumbers = new FibonacciNumbers()

    def "test printFibonacciNumbers"() {
        given:
        int n = 13
        when:
        fibonacciNumbers.printFibonacciNumbers(n)
        then:
        true
    }
}
