import sbt._
import Versions._

object TestDependencies {

  val junit               = "com.novocode"                 % "junit-interface"              % JunitVersion
  val scalatest           = "org.scalatest"                %% "scalatest"                   % ScalaTestVersion
  val scalamock4Scalatest = "org.scalamock"                %% "scalamock-scalatest-support" % ScalaMockVersion
  val mockitoCore         = "org.mockito"                  % "mockito-core"                 % MockitoVersion

}
