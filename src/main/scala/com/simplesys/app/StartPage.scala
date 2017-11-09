package com.simplesys.app

import com.simplesys.gantt.{Format, JSGantt, JSGanttStatic}

import scala.scalajs.js.annotation.JSExportTopLevel
import org.scalajs.dom

import scalatags.Text.all._

object GanttImprovedTest {
    @JSExportTopLevel("GanttImprovedTest")
    def get() = {
        val div = dom.document.getElementById("GanttChartDIV")
        val g = (new JSGantt).GanttChart(div, Format.day)
        val textExample = h1("Header 1")
        div.innerHTML = textExample.render
    }
}
