package testJVM

import com.simplesys.gantt.{Group, TaskItemExt}
import io.circe.generic.auto._
import io.circe.syntax._
import org.scalatest.FunSuite
import com.simplesys.gantt.JVM.TaskItemExt._
import com.simplesys.gantt.TaskCssClass.ggroupblack
import com.simplesys.circe.Circe._

class TestSuit extends FunSuite{
  test("1") {
      println(
          TaskItemExt(
              pID = 0L,
              pName = "",
              pClass = ggroupblack,
              pGroup = Some(Group.standardGroupTask)
          ).asJson.spaces41
      )
  }

}
