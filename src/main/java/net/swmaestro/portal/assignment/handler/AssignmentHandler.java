package net.swmaestro.portal.assignment.handler;

import net.swmaestro.portal.assignment.vo.AssignmentResult;

/**
 * Created by junha on 2016. 11. 6..
 */
public interface AssignmentHandler {

    AssignmentResult selectAssignment(int assignmentId) throws Exception;

}
