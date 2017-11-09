package com.simplesys.app

import com.simplesys.gantt.{Enabling, Format, GanttChart, GanttChartExt}
import com.simplesys.gantt.GanttChart._
import com.simplesys.gantt.Enabling._
import org.scalajs.dom

import scala.scalajs.js.annotation.JSExportTopLevel
import scalatags.Text.all._
import scala.language.implicitConversions

object GanttImprovedTest {
    
    @JSExportTopLevel("GanttImprovedTest")
    def get() = {
        val div = dom.document.getElementById("GanttChartDIV")

        val g = new GanttChartExt(div, Format.day)
        g setUseToolTip enable

        val a = g.getDivId
        val textExample = h1(s"getDivId: $a")
        div.innerHTML = textExample.render
    }
}
