package com.simplesys.gantt

import com.simplesys.gantt.Alignment.Alignment
import com.simplesys.gantt.CaptionType.CaptionType
import com.simplesys.gantt.DateInputFormat.DateInputFormat
import com.simplesys.gantt.Enabling.Enabling
import com.simplesys.gantt.Format.Format

import scala.scalajs.js

object GanttChart {
    implicit def date2Opt(date: js.Date): Option[js.Date] = Some(date)
        implicit def int2DepSeq(int: Int): Seq[Depend] = Seq(Depend(int))
        implicit def int2Dep(int: Int): Depend = Depend(int)
        implicit def dep2Seq(dep: Depend): Seq[Depend] = Seq(dep)

        implicit class strOpt(str: String) {
            def toLDT: js.Date = {
                val res = new js.Date(js.Date.parse(str))
                println(res.getTimezoneOffset())
                res
            }
        }

        implicit class dblOpt(double: Double) {
            def toLDT: js.Date = new js.Date(double)
        }

        implicit class longOpt(long: Long) {
            def toLDT: js.Date = new js.Date(long.toDouble)
        }

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

        val langRus = js.Dictionary(
            "format" → "Формат",
            "hour" → "Час",
            "day" → "День",
            "week" → "Неделя",
            "month" → "Месяц",
            "quarter" → "Квартал",
            "hours" → "Часов",
            "days" → "Дней",
            "weeks" → "Недель",
            "months" → "Месяцев",
            "quarters" → "Кварталов",
            "hr" → "Час",
            "dy" → "День",
            "wk" → "Неделя",
            "mth" → "Месяц",
            "qtr" → "Квартал",
            "hrs" → "Часов",
            "dys" → "Дней",
            "wks" → "Недель",
            "mths" → "Месяцев",
            "qtrs" → "Кварталов",
            "resource" → "Ресурс",
            "duration" → "Продолжит.",
            "comp" → "% Выполн.",
            "completion" → "Общая",
            "startdate" → "Начало",
            "enddate" → "Конец",
            "moreinfo" → "Доп. информация",
            "notes" → "Заметки",
            "january" → "Янваль",
            "february" → "Февраль",
            "march" → "Март",
            "april" → "Апрель",
            "maylong" → "Май",
            "june" → "Июнь",
            "july" → "Июль",
            "august" → "Август",
            "september" → "Сентябрь",
            "october" → "Октябрь",
            "november" → "Ноябрь",
            "december" → "Декабрь",
            "jan" → "Январь",
            "feb" → "Февраль",
            "mar" → "Март",
            "apr" → "Апрель",
            "may" → "Май",
            "jun" → "Июнь",
            "jul" → "Июль",
            "aug" → "Август",
            "sep" → "Сентябрь",
            "oct" → "Октябрь",
            "nov" → "Ноябрь",
            "dec" → "Декабрь",
            "sunday" → "Воскресение",
            "monday" → "Понедельник",
            "tuesday" → "Вторник",
            "wednesday" → "Среда",
            "thursday" → "Четверг",
            "friday" → "Пятница",
            "saturday" → "Суббота",
            "sun" → "Воскресение",
            "mon" → "Понедельник",
            "tue" → "Вторник",
            "wed" → "Среда",
            "thu" → "Четверг",
            "fri" → "Пятница",
            "sat" → "Суббота"
        )
}
