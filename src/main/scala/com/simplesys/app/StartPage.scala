package com.simplesys.app

import com.simplesys.gantt.GanttChart._
import com.simplesys.gantt._
import org.scalajs.dom

import scala.language.implicitConversions
import scala.scalajs.js.annotation.JSExportTopLevel

object GanttImprovedTest {

    @JSExportTopLevel("GanttImprovedTest")
    def get() = {
        val div = dom.document.getElementById("GanttChartDIV")

        val g = new GanttChartExt(div, Format.day)
        /*g.addLang("rus", GanttChart.langRus)
        g setLang "rus"*/

        g.getDivId.foreach {
            _ ⇒
                g setCaptionType CaptionType.Complete
                g setQuarterColWidth 36
                g setDateTaskDisplayFormat "day dd month yyyy"
                g setDayMajorDateDisplayFormat "mon yyyy - Week ww"
                g setWeekMinorDateDisplayFormat "dd mon"
                g setShowTaskInfoLink 1
                g setShowEndWeekDate 0
                g setUseSingleCell 10000
                g setFormatArr(Format.hour, Format.day, Format.week, Format.month, Format.quarter)

                g.AddTaskItem(new TaskItem(1, "Define Chart API", "", "", "ggroupblack", "", 0, "Brian", 0, 1, 0, 1, "", "", "Some Notes text", g))
                g.AddTaskItem(new TaskItem(11, "Chart Object", "2016-02-20", "2016-02-20", "gmilestone", "", 1, "Shlomy", 100, 0, 1, 1, "", "", "", g))
                g.Draw()
        }

    }
}
