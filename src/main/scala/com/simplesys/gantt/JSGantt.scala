package com.simplesys.gantt

import com.simplesys.gantt.Format.Format

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
import org.scalajs.dom.raw._

@js.native
@JSGlobal
class JSGantt extends js.Object {

    // function that loads the main gantt chart properties and functions
    // pDiv: (required) this is a div object created in HTML
    // pFormat: (required) - used to indicate whether chart should be drawn in "hour", "day", "week", "month", or "quarter" format

    def GanttChart(pDiv: Element, pFormat: Format): JSGantt = js.native
}
