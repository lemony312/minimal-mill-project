package example

import utest._
import upickle.default._

object MainTest extends TestSuite {
  val tests = Tests {
    test("json serialization") {
      val person = Main.Person("Bob", 25)
      val json = write(person)
      val parsed = read[Main.Person](json)
      assert(parsed == person)
    }
  }
}