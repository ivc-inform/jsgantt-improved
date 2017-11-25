package com.simplesys.gantt

import com.simplesys.gantt.Group.Group
import com.simplesys.gantt.MileStone.MileStone
import com.simplesys.gantt.Opening.Opening

case class TaskItemExt(
                        pID: Int,
                        pName: String,
                        pStart: String = "",
                        pEnd: String = "",
                        pClass: String,
                        pLink: String = "",
                        pMile: MileStone = MileStone.notMilestone,
                        pRes: String = "",
                        pComp: Int = 0,
                        pGroup: Group = Group.normalTask,
                        pParent: Int = 0,
                        pOpen: Opening = Opening.open,
                        pDepend: String = "",
                        pCaption: String = "",
                        pNotes: String = ""
                      )
