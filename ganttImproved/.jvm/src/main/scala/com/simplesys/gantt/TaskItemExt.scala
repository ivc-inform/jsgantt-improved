package com.simplesys.gantt

import java.time.LocalDateTime

import com.simplesys.gantt.Group.Group
import com.simplesys.gantt.MileStone.MileStone
import com.simplesys.gantt.Opening.Opening

case class TaskItemExt(
                        pID: Int,
                        pName: String,
                        pStart: Option[LocalDateTime] = None,
                        pEnd: Option[LocalDateTime] = None,
                        pClass: String,
                        pLink: Option[String] = None,
                        pMile: Option[MileStone] = None,
                        pRes: Option[String] = None,
                        pComp: Option[Int] = None,
                        pGroup: Option[Group] = None,
                        pParent: Option[Int] = None,
                        pOpen: Option[Opening] = None,
                        pDepend: Option[String] = None,
                        pCaption: Option[String] = None,
                        pNotes: Option[String] = None
                      )
