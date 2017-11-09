package com.simplesys.gantt

import language.implicitConversions

object DateInputFormat extends Enumeration {
    type DateInputFormat = Value
    val `dd/mm/yyyy`, `yyyy-mm-dd`, `mm/dd/yyyy` = Value
}
