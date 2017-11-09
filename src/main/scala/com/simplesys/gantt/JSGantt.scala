package com.simplesys.gantt

import com.simplesys.gantt.Format.Format
import org.scalajs.dom.raw._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("JSGantt.GanttChart")
class GanttChart(val pDiv: Element, val pFormat: String) extends js.Object {
    def getDivId(): js.UndefOr[String] = js.native
}

class GanttChartExt(pDiv: Element, pFormat: Format) extends GanttChart(pDiv, pFormat.toString)
