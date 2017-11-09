package com.simplesys.app

import com.simplesys.gantt.{Format, JSGantt, JSGanttStatic}
import org.scalajs.dom

import scala.scalajs.js.annotation.JSExportTopLevel
import scalatags.Text.all._

object GanttImprovedTest {
    @JSExportTopLevel("GanttImprovedTest")
    def get() = {
        val div = dom.document.getElementById("GanttChartDIV")
        val g = (new JSGantt).GanttChart(div, Format.day)

        if (g.getDivId.isEmpty)
            println(g.getDivId)

        val textExample = h1("Header 1")
        div.innerHTML = textExample.render
    }
}
