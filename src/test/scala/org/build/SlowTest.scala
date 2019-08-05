package org.build

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{FunSuiteLike, Suite}

@RunWith(classOf[JUnitRunner])
class SlowTest extends Suite
               with FunSuiteLike {

    for(i <- 1 to 14000) {
        test(s"I am slow $i") {
            println(s"Running $i")
        }
    }
}
