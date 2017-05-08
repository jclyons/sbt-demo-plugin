package demo

import sbt._
import Keys._

object Plugin extends Plugin {
    val greeting = settingKey[String]("greeting")
    val hello = taskKey[Unit]("say hello")
    val garbage = taskKey[Int]("garbage")
   override lazy val buildSettings = Seq(
        greeting := "Hi!",
        garbage := 1,
        hello := {
            println("Hello" + garbage.value)
        }
    )

}