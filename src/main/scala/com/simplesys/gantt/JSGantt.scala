package com.simplesys.gantt

import com.simplesys.gantt.Format.Format
import org.scalajs.dom.raw._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("JSGantt.GanttChart")
protected class GanttChart(val pDiv: Element, val pFormat: String) extends js.Object {
    def getDivId(): js.UndefOr[String] = js.native


    /**
      * Configuration Options
      * Switches
      * Many of the features of jsGanttImproved can be customised through the use of setter methods available on the GanttChart object returned by a call to JSGantt.GanttChart()
      * *
      * The following options take a single numeric parameter; a value of 1 will enable the describe functionality, 0 will disable it
      **/

    //Controls the display of tool tip boxes, defaults to 1 (enabled)
    def setUseToolTip(): Unit = js.native

    //Controls use of the fade effect when showing/hiding tool tips, defaults to 1 (enabled)
    def setUseFade(): Unit = js.native

    //Controls use of the sliding effect when changing between different task tool tips, defaults to 1 (enabled)
    def setUseMove(): Unit = js.native

    //Controls the use of row mouseover highlighting, defaults to 1 (enabled)
    def setUseRowHlt(): Unit = js.native

    //Controls whether the task list is sorted into parent task / start time order or is simply displayed in the order created, defaults to 1 (sort enabled)
    def setUseSort(): Unit = js.native

    //Controls whether the Resource column is displayed in the task list, defaults to 1 (show column)
    def setShowRes(): Unit = js.native

    //Controls whether the Task Duration column is displayed in the task list, defaults to 1 (show column)
    def setShowDur(): Unit = js.native

    //Controls whether the Percentage Complete column is displayed in the task list, defaults to 1 (show column)
    def setShowComp(): Unit = js.native

    //Controls whether the Task Start Date column is displayed in the task list, defaults to 1 (show column)
    def setShowStartDate(): Unit = js.native

    //Controls whether the Task End Date column is displayed in the task list, defaults to 1 (show column)
    def setShowEndDate(): Unit = js.native

    //Controls whether the Resource information is displayed in the task tool tip, defaults to 1 (show information)
    def setShowTaskInfoRes(): Unit = js.native

    //Controls whether the Task Duration information is displayed in the task tool tip, defaults to 1 (show information)
    def setShowTaskInfoDur(): Unit = js.native

    //Controls whether the Percentage Complete information is displayed in the task tool tip, defaults to 1 (show information)
    def setShowTaskInfoComp(): Unit = js.native

    //Controls whether the Task Start Date information is displayed in the task tool tip, defaults to 1 (show information)
    def setShowTaskInfoStartDate(): Unit = js.native

    //Controls whether the Task End Date information is displayed in the task tool tip, defaults to 1 (show information)
    def setShowTaskInfoEndDate(): Unit = js.native

    //Controls whether the More Information link is displayed in the task tool tip, defaults to 0 (do NOT show link)
    def setShowTaskInfoLink(): Unit = js.native

    //Controls whether the Additional Notes data is displayed in the task tool tip, defaults to 1 (show notes)
    def setShowTaskInfoNotes(): Unit = js.native

    //Controls whether the major heading in "Day" view displays the week end-date in the appropriate format (see below), defaults to 1 (show date)
    def setShowEndWeekDate(): Unit = js.native

    //Controls display of dependancy lines, defaults to 1 (show dependencies)
    def setShowDeps(): Unit = js.native
}

class GanttChartExt(pDiv: Element, pFormat: Format) extends GanttChart(pDiv, pFormat.toString)
