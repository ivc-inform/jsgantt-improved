package testJVM

import com.simplesys.gantt.Group
import com.simplesys.gantt.JVM.TaskItemExtJVM
import io.circe.generic.auto._
import io.circe.syntax._
import org.scalatest.FunSuite
import com.simplesys.gantt.JVM.TaskItemExtJVM._
import com.simplesys.gantt.TaskCssClass.ggroupblack
import com.simplesys.circe.Circe._

class TestSuit extends FunSuite{
  test("1") {
      println(
          TaskItemExtJVM(
              pID = 0L,
              pName = "",
              pClass = ggroupblack,
              pGroup = Some(Group.standardGroupTask)
          ).asJson.spaces41
      )
  }

}
