package com.simplesys.gantt

import com.simplesys.gantt.Alignment.Alignment
import com.simplesys.gantt.CaptionType.CaptionType
import com.simplesys.gantt.DateInputFormat.DateInputFormat
import com.simplesys.gantt.Enabling.Enabling
import com.simplesys.gantt.Format.Format

object GanttChartCommon {
    implicit class intOpt(long: Long) {
        def FS: Depend = Depend(long, DependEn.FS)
        def SS: Depend = Depend(long, DependEn.SS)
        def FF: Depend = Depend(long, DependEn.FF)
        def SF: Depend = Depend(long, DependEn.SF)
    }

    implicit def enabling2Int(value: Enabling): Int = if (value == Enabling.enable) 1 else 0
    implicit def alig2Str(value: Alignment): String = value.toString
    implicit def format2Str(value: Format): String = value.toString
    implicit def captiontp2Str(value: CaptionType): String = value.toString
    implicit def captiontp2Strs(value: CaptionType*): Seq[String] = value.map(_.toString)
    implicit def dateInpur2Str(value: DateInputFormat): String = value.toString
}
