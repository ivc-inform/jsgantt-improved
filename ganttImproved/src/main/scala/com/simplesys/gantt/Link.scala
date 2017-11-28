package com.simplesys.gantt

import com.simplesys.gantt.DependEn.DependEn

case class Link(httpLink: String = "")

case class Depend(id:Long, suffix: DependEn = DependEn.FS) {
    override def toString = s"${id}${suffix.toString}"
}
