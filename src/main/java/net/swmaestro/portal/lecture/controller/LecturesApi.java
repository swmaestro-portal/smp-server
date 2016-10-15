package net.swmaestro.portal.lecture.controller;

import io.swagger.annotations.*;
import net.swmaestro.portal.lecture.vo.Lecture;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-10-05T11:30:19.659Z")

@Api(value = "lectures", description = "the lectures API")
public interface LecturesApi {

    @ApiOperation(value = "Delete Lecture", notes = "Deletes a Lecture.", response = Void.class, authorizations = {
        @Authorization(value = "smp_auth", scopes = {
            @AuthorizationScope(scope = "manager", description = "Manager")
            })
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Succeed.", response = Void.class) })
    @RequestMapping(value = "/lectures/{lecture-id}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteLecture(
            @ApiParam(value = "Lecture's ID", required = true) @PathVariable("lecture-id") Integer lectureId


    );


    @ApiOperation(value = "Lecture Profile", notes = "Returns lecture's profile.", response = Lecture.class, authorizations = {
        @Authorization(value = "smp_auth", scopes = {
            
            })
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Lecture Profile", response = Lecture.class) })
    @RequestMapping(value = "/lectures/{lecture-id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Lecture> getLecture(
            @ApiParam(value = "Lecture's ID", required = true) @PathVariable("lecture-id") Integer lectureId


    );


    @ApiOperation(value = "lectures List", notes = "Returns list of lectures.", response = Lecture.class, responseContainer = "List", authorizations = {
        @Authorization(value = "smp_auth", scopes = {
            @AuthorizationScope(scope = "manager", description = "Manager")
            })
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "lectures List", response = Lecture.class) })
    @RequestMapping(value = "/lectures",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Lecture>> getLectures();


    @ApiOperation(value = "Create Lecture", notes = "Creates a new lecture (Sign Up).", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Succeed.", response = Void.class),
        @ApiResponse(code = 400, message = "Bad request.", response = Void.class),
        @ApiResponse(code = 409, message = "Conflict.", response = Void.class) })
    @RequestMapping(value = "/lectures",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> postLecture(

            @ApiParam(value = "token of who posts Lecture") @RequestHeader(value="Authorization", required = true) String authorizationHeader
            ,

            @ApiParam(value = "Lecture's articleGenerationId") @RequestParam(value = "articleGenerationId", required = true) Integer articleGenerationId
            ,

            @ApiParam(value = "Lecture's articleSubject") @RequestParam(value = "articleSubject", required = true) String articleSubject
            ,

            @ApiParam(value = "Lecture's articleContent") @RequestParam(value = "articleContent", required = true) String articleContent
            ,

            @ApiParam(value = "Lecture's articleTeacherId") @RequestParam(value = "lectureTeacherId", required = true) Integer lectureTeacherId
            ,

            @ApiParam(value = "Lecture's articleBeginAt") @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") @RequestParam(value = "lectureBeginAt", required = true) Date lectureBeginAt
            ,

            @ApiParam(value = "Lecture's articleEndAt") @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")  @RequestParam(value = "lectureEndAt", required = true) Date lectureEndAt

    );

    @ApiOperation(value = "Edit Lecture", notes = "Edit lecture's profile.", response = Void.class, authorizations = {
        @Authorization(value = "smp_auth", scopes = {
            @AuthorizationScope(scope = "manager", description = "Manager")
            })
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Succeed.", response = Void.class) })
    @RequestMapping(value = "/lectures/{lecture-id}",
        produces = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Void> putLecture(

            @ApiParam(value = "Lecture's ID", required = true) @PathVariable("lecture-id") Integer lectureId
            ,

            @ApiParam(value = "token of who puts Lecture") @RequestHeader(value="Authorization", required = true) String authorizationHeader
            ,

            @ApiParam(value = "Lecture's articleGenerationId") @RequestParam(value = "articleGenerationId", required = false) Integer articleGenerationId
            ,

            @ApiParam(value = "Lecture's articleSubject") @RequestParam(value = "articleSubject", required = false) String articleSubject
            ,

            @ApiParam(value = "Lecture's articleContent") @RequestParam(value = "articleContent", required = false) String articleContent
            ,

            @ApiParam(value = "Lecture's articleTeacherId") @RequestParam(value = "lectureTeacherId", required = false) Integer lectureTeacherId
            ,

            @ApiParam(value = "Lecture's articleBeginAt") @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") @RequestParam(value = "lectureBeginAt", required = false) Date lectureBeginAt
            ,

            @ApiParam(value = "Lecture's articleEndAt") @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")  @RequestParam(value = "lectureEndAt", required = false) Date lectureEndAt

    );

}
