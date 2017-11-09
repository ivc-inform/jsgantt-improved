package com.simplesys.gantt

import com.simplesys.gantt.Format.Format
import org.scalajs.dom.raw._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("JSGantt.GanttChart")
protected class GanttChart(val pDiv: Element, val pFormat: String) extends js.Object {
    def getDivId(): js.UndefOr[String] = js.native

    //Controls the display of tool tip boxes, defaults to 1 (enabled)
    def setUseToolTip():Unit = js.native

    //Controls use of the fade effect when showing/hiding tool tips, defaults to 1 (enabled)
    def setUseFade():

    //Controls use of the sliding effect when changing between different task tool tips, defaults to 1 (enabled)
    def setUseMove():

    //Controls the use of row mouseover highlighting, defaults to 1 (enabled)
    def setUseRowHlt():

    //Controls whether the task list is sorted into parent task / start time order or is simply displayed in the order created, defaults to 1 (sort enabled)
    def setUseSort():
    setShowRes():	Controls whether the Resource column is displayed in the task list, defaults to 1 (show column)
    setShowDur():	Controls whether the Task Duration column is displayed in the task list, defaults to 1 (show column)
    setShowComp():	Controls whether the Percentage Complete column is displayed in the task list, defaults to 1 (show column)
    setShowStartDate():	Controls whether the Task Start Date column is displayed in the task list, defaults to 1 (show column)
    setShowEndDate():	Controls whether the Task End Date column is displayed in the task list, defaults to 1 (show column)
    setShowTaskInfoRes():	Controls whether the Resource information is displayed in the task tool tip, defaults to 1 (show information)
    setShowTaskInfoDur():	Controls whether the Task Duration information is displayed in the task tool tip, defaults to 1 (show information)
    setShowTaskInfoComp():	Controls whether the Percentage Complete information is displayed in the task tool tip, defaults to 1 (show information)
    setShowTaskInfoStartDate():	Controls whether the Task Start Date information is displayed in the task tool tip, defaults to 1 (show information)
    setShowTaskInfoEndDate():	Controls whether the Task End Date information is displayed in the task tool tip, defaults to 1 (show information)
    setShowTaskInfoLink():	Controls whether the More Information link is displayed in the task tool tip, defaults to 0 (do NOT show link)
    setShowTaskInfoNotes():	Controls whether the Additional Notes data is displayed in the task tool tip, defaults to 1 (show notes)
    setShowEndWeekDate():	Controls whether the major heading in "Day" view displays the week end-date in the appropriate format (see below), defaults to 1 (show date)
    setShowDeps():	Controls display of dependancy lines, defaults to 1 (show dependencies)
}

class GanttChartExt(pDiv: Element, pFormat: Format) extends GanttChart(pDiv, pFormat.toString)
