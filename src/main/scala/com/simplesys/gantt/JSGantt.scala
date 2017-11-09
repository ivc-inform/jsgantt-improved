package com.simplesys.gantt

import com.simplesys.gantt.Format.Format
import org.scalajs.dom.raw._

import scala.scalajs.js

class JSGantt extends js.Object {
    def GanttChart(pDiv: Element, pFormat: Format): JSGanttTrait = JSGanttStatic.GanttChart(pDiv, pFormat.toString)
}

@js.native
trait JSGanttTrait extends js.Object  {
   def getDivId : js.UndefOr[String]
}
