package com.simplesys.gantt

import org.scalajs.dom.raw.Element

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("JSGantt")
object JSGanttStatic extends js.Object {

    // function that loads the main gantt chart properties and functions
    // pDiv: (required) this is a div object created in HTML
    // pFormat: (required) - used to indicate whether chart should be drawn in "hour", "day", "week", "month", or "quarter" format

    def GanttChart(pDiv: Element, pFormat: String): JSGanttTrait = js.native
}
