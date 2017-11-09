package com.simplesys.app

import com.simplesys.gantt.{Format, GanttChartExt}
import org.scalajs.dom

import scala.scalajs.js.annotation.JSExportTopLevel
import scalatags.Text.all._

object GanttImprovedTest {
    @JSExportTopLevel("GanttImprovedTest")
    def get() = {
        val div = dom.document.getElementById("GanttChartDIV")

        val g = new GanttChartExt(div, Format.day)

        val a = g.getDivId
        val textExample = h1(s"getDivId: $a")
        div.innerHTML = textExample.render
    }
}
