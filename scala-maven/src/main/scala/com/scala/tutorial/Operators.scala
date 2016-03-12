
package com.scala.tutorial

object Operators extends App {

  val birthYear: Int = 1976
  val currentYear: Int = 2016

  var age: Int = currentYear - birthYear

  if (age > 13 && age < 30)
    println("You are the Junior Java Developer!!!!");
  if (age == 13)
    println("You are the Junior Scala Developer!!!");
  else
    println("You are the Senior Java Developer!!");

}
