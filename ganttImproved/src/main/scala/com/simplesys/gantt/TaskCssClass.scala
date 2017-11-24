package com.simplesys.gantt

import scala.language.implicitConversions

object TaskCssClass extends Enumeration {
    type TaskCssClass = Value
    val ggroupblack, gtaskblue, gtaskred, gtaskgreen, gtaskyellow, gtaskpurple, gtaskpink, gmilestone = Value
}
