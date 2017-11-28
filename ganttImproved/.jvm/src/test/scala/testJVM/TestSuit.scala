package testJVM

import com.simplesys.gantt.JVM.TaskItemExt
import io.circe.generic.auto._
import io.circe.syntax._
import org.scalatest.FunSuite
import com.simplesys.gantt.JVM.TaskItemExt._
import com.simplesys.gantt.TaskCssClass.ggroupblack

class TestSuit extends FunSuite{
  test("1") {
      println(
          TaskItemExt(
              pID = 0L,
              pName = "",
              pClass = ggroupblack
          ).asJson.spaces4
      )
  }

}
