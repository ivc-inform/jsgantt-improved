package com.simplesys.gantt

import com.simplesys.gantt.Enabling.Enabling
import com.simplesys.gantt.Group.Group
import com.simplesys.gantt.MileStone.MileStone
import com.simplesys.gantt.Opening.Opening
import com.simplesys.gantt.TaskCssClass.TaskCssClass

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
import scala.language.implicitConversions

object TaskItem {
    implicit def mile2Int(value: MileStone): Int = value.id
    implicit def group2Int(value: Group): Int = value.id
    implicit def open2Int(value: Opening): Int = value.id
}

/**
  * pID:	(required) a unique numeric ID used to identify each row
  * pName:	(required) the task Label
  * pStart:	(required) the task start date, can enter empty date ('') for groups. You can also enter specific time (2016-02-20 12:00) for additional precision.
  * pEnd:	(required) the task end date, can enter empty date ('') for groups
  * pClass:	(required) the css class for this task
  * pLink:	(optional) any http link to be displayed in tool tip as the "More information" link.
  * pMile:	(optional) indicates whether this is a milestone task - Numeric; 1 = milestone, 0 = not milestone
  * pRes:	(optional) resource name
  * pComp:	(required) completion percent, numeric
  * pGroup:	(optional) indicates whether this is a group task (parent) - Numeric; 0 = normal task, 1 = standard group task, 2 = combined group task*
  *
  * * Combined group tasks show all sub-tasks on one row. The information displayed in the task list and row caption are taken from the parent task. Tool tips are generated individually
  * * for each sub-task from its own information. Milestones are not valid as sub-tasks of a combined group task and will not be displayed. No bounds checking of start and end dates of sub-tasks is performed
  * * therefore it is possible for these task bars to overlap. Dependencies can be set to and from sub-tasks only.
  *
  * pParent:	(required) identifies a parent pID, this causes this task to be a child of identified task. Numeric, top level tasks should have pParent set to 0
  * pOpen:	(required) indicates whether a standard group task is open when chart is first drawn. Value must be set for all items but is only used by standard group tasks. Numeric, 1 = open, 0 = closed
  * pDepend:	(optional) comma separated list of id's this task is dependent on. A line will be drawn from each listed task to this item
  * Each id can optionally be followed by a dependency type suffix. Valid values are:
  * 'FS' - Finish to Start (default if suffix is omitted)
  * 'SF' - Start to Finish
  * 'SS' - Start to Start
  * 'FF' - Finish to Finish
  * If present the suffix must be added directly to the id e.g. '123SS'
  * pCaption:	(optional) caption that will be added after task bar if CaptionType set to "Caption"
  * pNotes:	(optional) Detailed task information that will be displayed in tool tip for this task
  * pGantt:	(required) javascript JSGantt.GanttChart object from which to take settings. Defaults to "g" for backwards compatibility
  *
  **/

@js.native
@JSGlobal("JSGantt.TaskItem")
class TaskItem(
                val pID: Int,
                val pName: String,
                val pStart: String,
                val pEnd: String,
                val pClass: String,
                val pLink: String,
                val pMile: Int,
                val pRes: String,
                val pComp: Int,
                val pGroup: Int,
                val pParent: Int,
                val pOpen: Int,
                val pDepend: String,
                val pCaption: String,
                val pNotes: String,
                val pGantt: GanttChart
              ) extends js.Object

import TaskItem._

class TaskItemExt(
                   pID: Int,
                   pName: String,
                   pStart: String = "",
                   pEnd: String = "",
                   pClass: TaskCssClass,
                   pLink: Link = Link(),
                   pMile: MileStone = MileStone.notMilestone,
                   pRes: String = "",
                   pComp: Int = 0,
                   pGroup: Group = Group.normalTask,
                   pParent: Int = 0,
                   pOpen: Opening = Opening.open,
                   pDepend: String = "",
                   pCaption: String = "",
                   pNotes: String = ""
                 )(implicit pGantt: GanttChart) extends TaskItem(
    pID = pID,
    pName = pName,
    pStart = pStart,
    pEnd = pEnd,
    pClass = pClass.toString,
    pLink = pLink.httpLink,
    pMile = pMile.id,
    pRes = pRes,
    pComp = pGroup match {
        case Group.normalTask ⇒ pComp
        case Group.standardGroupTask ⇒ 0
        case Group.combinedGroup ⇒ 0
    },
    pGroup = pGroup.id,
    pParent = pParent,
    pOpen = pOpen.id,
    pDepend = pDepend,
    pCaption = pCaption,
    pNotes = pNotes,
    pGantt = pGantt
)

case class Link(httpLink: String = "")
