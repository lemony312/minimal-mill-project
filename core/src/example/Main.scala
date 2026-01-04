package example

import upickle.default.*
import requests.*

object Main {
  case class Person(name: String, age: Int)
  implicit val personRW: ReadWriter[Person] = macroRW
  
  def main(args: Array[String]): Unit = {
    val person = Person("Alice", 30)
    val json = write(person)
    println(s"JSON: $json")
    
    val parsed = read[Person](json)
    println(s"Parsed: $parsed")
    
    // Simple HTTP request example
    try {
      val response = get("https://httpbin.org/json")
      println(s"Status: ${response.statusCode}")
    } catch {
      case _: Exception => println("Network request failed (expected in CI)")
    }
  }
}