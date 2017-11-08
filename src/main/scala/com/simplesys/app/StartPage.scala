package com.simplesys.app

import scala.scalajs.js.annotation.JSExportTopLevel
import scalatags.Text
import scalatags.Text.all._
import scalatags.Text.tags2

@JSExportTopLevel("GanttImprovedTest")
object GanttImprovedTest {
    def bodyHTML(lastScript: String): Text.TypedTag[String] = {
        div(
            div(
                style := "position:relative",
                `class` := "gantt",
                id := "GanttChartDIV"
            ),
            script(

            )
        )
    }
}
