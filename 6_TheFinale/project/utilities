import sbt._

package object utilities {

    def inTest(testDependencies: ModuleID*): Seq[ModuleID]         = testDependencies.map(_ % Test)
    def inTestWithJars(testDependencies: ModuleID*): Seq[ModuleID] = testDependencies.map(_ % Test classifier "tests")
}
