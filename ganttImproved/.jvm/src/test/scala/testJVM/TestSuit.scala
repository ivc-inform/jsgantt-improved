package testJVM

import com.simplesys.gantt.JVM.TaskItemExt
import org.scalatest.FunSuite
import io.circe.Json
import io.circe.Json._
import io.circe.generic.auto._
import io.circe.syntax._

class TestSuit extends FunSuite{
  test("1") {
      println(
          TaskItemExt(
              pID = 0L,
              pName = "",
              pClass = ""
          ).asJson
      )
  }

}
