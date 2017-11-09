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
        g.getDivId.foreach {
            _ ⇒
                g setCaptionType CaptionType.Caption
                g setQuarterColWidth 36
                g setDateTaskDisplayFormat "day dd month yyyy"
                g setDayMajorDateDisplayFormat "mon yyyy - Week ww"
                g setWeekMinorDateDisplayFormat "dd mon"
                g setShowTaskInfoLink 1
                g setShowEndWeekDate 0
                g setUseSingleCell 10000
                g setFormatArr(Format.day, Format.week, Format.month, Format.quarter)

        }

    }
}
