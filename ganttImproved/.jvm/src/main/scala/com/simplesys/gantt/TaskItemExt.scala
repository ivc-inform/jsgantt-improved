package com.simplesys.gantt

import java.time.LocalDateTime

import com.simplesys.gantt.Group.Group
import com.simplesys.gantt.MileStone.MileStone
import com.simplesys.gantt.Opening.Opening
import com.simplesys.gantt.TaskCssClass.TaskCssClass

case class TaskItemExt(
                        pID: Option[Int] = None,
                        pName: Option[String] = None,
                        pStart: Option[LocalDateTime] = None,
                        pEnd: Option[LocalDateTime] = None,
                        pClass: Option[TaskCssClass] = None,
                        pLink: Option[Link] = None,
                        pMile: Option[MileStone] = None,
                        pRes: Option[String] = None,
                        pComp: Option[Int] = None,
                        pGroup: Option[Group] = None,
                        pParentID: Option[Int] = None,
                        pOpen: Option[Opening] = None,
                        pDepend: Option[Seq[Depend]] = None,
                        pCaption: Option[String] = None,
                        pNotes: Option[String] = None
                 )
