<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<!-- Template Name: Rapido - Responsive Admin Template build with Twitter Bootstrap 3.x Version: 1.0 Author: ClipTheme -->
<!--[if IE 8]>
<html class="ie8" lang="en">
   <![endif]-->
   <!--[if IE 9]>
   <html class="ie9" lang="en">
      <![endif]-->
      <!--[if !IE]><!-->
      <html lang="en">
         <!--<![endif]-->
         <!-- start: HEAD -->
         <!-- Mirrored from www.cliptheme.com/demo/rapido/pages_blank_page.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 27 Jul 2014 06:19:20 GMT -->
         <head>
            <title> SNDS Project </title>
            <!-- start: META -->
            <meta charset="utf-8" />
            <!--[if IE]>
            <meta http-equiv='X-UA-Compatible' content="IE=edge,IE=9,IE=8,chrome=1" />
            <![endif]-->
            <meta name="viewport"
               content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
            <meta name="apple-mobile-web-app-capable" content="yes">
            <meta name="apple-mobile-web-app-status-bar-style" content="black">
            <meta content="" name="description" />
            <meta content="" name="author" />
            <!-- end: META -->
            <!-- start: MAIN CSS -->
            <link
               href='http://fonts.googleapis.com/css?family=Raleway:400,300,500,600,700,200,100,800'
               rel='stylesheet' type='text/css'>
            <link rel="stylesheet"
               href="${pageContext.request.contextPath}/assets/plugins/bootstrap/css/bootstrap.min.css">
            <link rel="stylesheet"
               href="${pageContext.request.contextPath}/assets/plugins/font-awesome/css/font-awesome.min.css">
            <link rel="stylesheet"
               href="${pageContext.request.contextPath}/assets/plugins/iCheck/skins/all.css">
            <link rel="stylesheet"
               href="${pageContext.request.contextPath}/assets/plugins/perfect-scrollbar/src/perfect-scrollbar.css">
            <link rel="stylesheet"
               href="${pageContext.request.contextPath}/assets/plugins/animate.css/animate.min.css">
            <!-- end: MAIN CSS -->
            <!-- start: CSS REQUIRED FOR SUBVIEW CONTENTS -->
            <link rel="stylesheet"
               href="${pageContext.request.contextPath}/assets/plugins/owl-carousel/owl-carousel/owl.carousel.css">
            <link rel="stylesheet"
               href="${pageContext.request.contextPath}/assets/plugins/owl-carousel/owl-carousel/owl.theme.css">
            <link rel="stylesheet"
               href="${pageContext.request.contextPath}/assets/plugins/owl-carousel/owl-carousel/owl.transitions.css">
            <link rel="stylesheet"
               href="${pageContext.request.contextPath}/assets/plugins/summernote/dist/summernote.css">
            <link rel="stylesheet"
               href="${pageContext.request.contextPath}/assets/plugins/fullcalendar/fullcalendar/fullcalendar.css">
            <link rel="stylesheet"
               href="${pageContext.request.contextPath}/assets/plugins/toastr/toastr.min.css">
            <link rel="stylesheet"
               href="${pageContext.request.contextPath}/assets/plugins/bootstrap-select/bootstrap-select.min.css">
            <link rel="stylesheet"
               href="${pageContext.request.contextPath}/assets/plugins/bootstrap-switch/dist/css/bootstrap3/bootstrap-switch.min.css">
            <link rel="stylesheet"
               href="${pageContext.request.contextPath}/assets/plugins/DataTables/media/css/DT_bootstrap.css">
            <link rel="stylesheet"
               href="${pageContext.request.contextPath}/assets/plugins/bootstrap-fileupload/bootstrap-fileupload.min.css">
            <link rel="stylesheet"
               href="${pageContext.request.contextPath}/assets/plugins/bootstrap-daterangepicker/daterangepicker-bs3.css">
            <!-- end: CSS REQUIRED FOR THIS SUBVIEW CONTENTS-->
            <!-- start: CSS REQUIRED FOR THIS PAGE ONLY -->
            <link rel="stylesheet" type="text/css"
               href="${pageContext.request.contextPath}/assets/plugins/select2/select2.css" />
            <!-- end: CSS REQUIRED FOR THIS PAGE ONLY -->
            <!-- start: CORE CSS -->
            <link rel="stylesheet"
               href="${pageContext.request.contextPath}/assets/css/styles.css">
            <link rel="stylesheet"
               href="${pageContext.request.contextPath}/assets/css/styles-responsive.css">
            <link rel="stylesheet"
               href="${pageContext.request.contextPath}/assets/css/plugins.css">
            <link rel="stylesheet"
               href="${pageContext.request.contextPath}/assets/css/themes/theme-default.css"
               type="text/css" id="skin_color">
            <link rel="stylesheet"
               href="${pageContext.request.contextPath}/assets/css/print.css"
               type="text/css" media="print" />
            <!-- end: CORE CSS -->
            <link rel="shortcut icon" type="image/ico"
               href="${pageContext.request.contextPath}/assets/images/favicon.ico" />
         </head>
         <!-- end: HEAD -->
         <!-- start: BODY -->
         <body>
            <div class="main-wrapper">
               <!-- start: TOPBAR -->
               <!-- end: TOPBAR -->
               <!-- start: PAGESLIDE LEFT -->
               <a class="closedbar inner hidden-sm hidden-xs" href="#"> </a>
               <nav id="pageslide-left" class="pageslide inner">
                  <div class="navbar-content">
                     <!-- start: SIDEBAR -->
                     <div class="main-navigation left-wrapper transition-left">
                        <div class="navigation-toggler hidden-sm hidden-xs">
                           <a href="#main-navbar" class="sb-toggle-left"> </a>
                        </div>
                        <div class="user-profile border-top padding-horizontal-10 block">
                           <div class="inline-block">
                              <img
                                 src="${pageContext.request.contextPath}/assets/images/Avatar.png"
                                 alt="">
                           </div>
                           <div class="inline-block">
                              <h5 class="no-margin">Welcome</h5>
                              <h4 class="no-margin">UserName</h4>
                              <a class="btn user-options sb_toggle"> <i class="fa fa-cog"></i>
                              </a>
                           </div>
                        </div>
                        <!-- start: MAIN NAVIGATION MENU -->
                       	<%@include file="../menu/LeftMenu.jsp" %>                  
                        <!-- end: MAIN NAVIGATION MENU -->
                     </div>
                     <!-- end: SIDEBAR -->
                  </div>
                  <div class="slide-tools">
                     <div class="col-xs-6 text-left no-padding">
                        <a class="btn btn-sm status" href="#"> Status
                        <i class="fa fa-dot-circle-o text-green"></i> <span>Online</span>
                        </a>
                     </div>
                     <div class="col-xs-6 text-right no-padding">
                        <a class="btn btn-sm log-out text-right" href="login_login.html">
                        <i class="fa fa-power-off"></i> Log Out
                        </a>
                     </div>
                  </div>
               </nav>
               <!-- end: PAGESLIDE LEFT -->
               <!-- start: PAGESLIDE RIGHT -->
               <!-- end: PAGESLIDE RIGHT -->
               <!-- start: MAIN CONTAINER -->
               <div class="main-container inner">
                  <!-- start: PAGE -->
                  <div class="main-content">
                     <!-- start: PANEL CONFIGURATION MODAL FORM -->
                     <div class="modal fade" id="panel-config" tabindex="-1"
                        role="dialog" aria-hidden="true">
                        <div class="modal-dialog">
                           <div class="modal-content">
                              <div class="modal-header">
                                 <button type="button" class="close" data-dismiss="modal"
                                    aria-hidden="true">&times;</button>
                                 <h4 class="modal-title">Panel Configuration</h4>
                              </div>
                              <div class="modal-body">Here will be a configuration form</div>
                              <div class="modal-footer">
                                 <button type="button" class="btn btn-default"
                                    data-dismiss="modal">Close</button>
                                 <button type="button" class="btn btn-primary">Save
                                 changes</button>
                              </div>
                           </div>
                           <!-- /.modal-content -->
                        </div>
                        <!-- /.modal-dialog -->
                     </div>
                     <!-- /.modal -->
                     <!-- end: SPANEL CONFIGURATION MODAL FORM -->
                     <div class="container">
                        <!-- start: PAGE HEADER -->
                        <!-- start: TOOLBAR -->
                        <div class="toolbar row">
                           <div class="col-sm-6 hidden-xs">
                              <div class="page-header">
                                 <h1>
                                 </h1>
                              </div>
                           </div>
                           <div class="col-sm-6 col-xs-12">
                              <a href="#" class="back-subviews"> <i
                                 class="fa fa-chevron-left"></i> BACK
                              </a> <a href="#" class="close-subviews"> <i class="fa fa-times"></i>
                              CLOSE
                              </a>
                              <div class="toolbar-tools pull-right">
                                 <!-- start: TOP NAVIGATION MENU -->
                                 <!-- end: TOP NAVIGATION MENU -->
                              </div>
                           </div>
                        </div>
                        <!-- end: TOOLBAR -->
                        <!-- end: PAGE HEADER -->
                        <!-- start: BREADCRUMB -->
                        <div class="row">
                           <div class="col-md-12">
                              <ol class="breadcrumb">
                                 <li><a href="#"> Dashboard </a></li>
                                 <li class="active">Blank Page</li>
                              </ol>
                           </div>
                        </div>
                        <!-- end: BREADCRUMB -->
                        <!-- start: PAGE CONTENT -->
                        <div class="row">
                     <div class="col-sm-12">
                        <div class="tabbable">
                           <ul class="nav nav-tabs tab-padding tab-space-3 tab-blue" id="myTab4">
                              <li class="active">
                                 <a data-toggle="tab" href="#panel_overview">
                                    Overview
                                 </a>
                              </li>                              
                              <li>
                                 <a data-toggle="tab" href="#panel_projects">
                                    Projects
                                 </a>
                              </li>
                           </ul>
                           <div class="tab-content">
                              <div id="panel_overview" class="tab-pane fade in active">
                                 <div class="row">
                                    <div class="col-sm-5 col-md-4">
                                       <div class="user-left">
                                          <div class="center">
                                             <h4>Peter Clark</h4>
                                             <div class="fileupload fileupload-new" data-provides="fileupload">
                                                <div class="user-image">
                                                   <div class="fileupload-new thumbnail"><img src="assets/images/avatar-1-xl.jpg" alt="">
                                                   </div>
                                                   <div class="fileupload-preview fileupload-exists thumbnail"></div>
                                                   <div class="user-image-buttons">
                                                      <span class="btn btn-azure btn-file btn-sm"><span class="fileupload-new"><i class="fa fa-pencil"></i></span><span class="fileupload-exists"><i class="fa fa-pencil"></i></span>
                                                         <input type="file">
                                                      </span>
                                                      <a href="#" class="btn fileupload-exists btn-red btn-sm" data-dismiss="fileupload">
                                                         <i class="fa fa-times"></i>
                                                      </a>
                                                   </div>
                                                </div>
                                             </div>
                                             <hr>
                                             <div class="social-icons block">
                                                <ul>
                                                   <li data-placement="top" data-original-title="Twitter" class="social-twitter tooltips">
                                                      <a href="http://www.twitter.com/" target="_blank">
                                                         Twitter
                                                      </a>
                                                   </li>
                                                   <li data-placement="top" data-original-title="Facebook" class="social-facebook tooltips">
                                                      <a href="http://facebook.com/" target="_blank">
                                                         Facebook
                                                      </a>
                                                   </li>
                                                   <li data-placement="top" data-original-title="Google" class="social-google tooltips">
                                                      <a href="http://google.com/" target="_blank">
                                                         Google+
                                                      </a>
                                                   </li>
                                                   <li data-placement="top" data-original-title="LinkedIn" class="social-linkedin tooltips">
                                                      <a href="http://linkedin.com/" target="_blank">
                                                         LinkedIn
                                                      </a>
                                                   </li>
                                                   <li data-placement="top" data-original-title="Github" class="social-github tooltips">
                                                      <a href="#" target="_blank">
                                                         Github
                                                      </a>
                                                   </li>
                                                </ul>
                                             </div>
                                             <hr>
                                          </div>
                                          <table class="table table-condensed table-hover">
                                             <thead>
                                                <tr>
                                                   <th colspan="3">Contact Information</th>
                                                </tr>
                                             </thead>
                                             <tbody>
                                                <tr>
                                                   <td>url</td>
                                                   <td>
                                                   <a href="#">
                                                      www.example.com
                                                   </a></td>
                                                   <td><a href="#panel_edit_account" class="show-tab"><i class="fa fa-pencil edit-user-info"></i></a></td>
                                                </tr>
                                                <tr>
                                                   <td>email:</td>
                                                   <td>
                                                   <a href="#">
                                                      peter@example.com
                                                   </a></td>
                                                   <td><a href="#panel_edit_account" class="show-tab"><i class="fa fa-pencil edit-user-info"></i></a></td>
                                                </tr>
                                                <tr>
                                                   <td>phone:</td>
                                                   <td>(641)-734-4763</td>
                                                   <td><a href="#panel_edit_account" class="show-tab"><i class="fa fa-pencil edit-user-info"></i></a></td>
                                                </tr>
                                                <tr>
                                                   <td>skye</td>
                                                   <td>
                                                   <a href="#">
                                                      peterclark82
                                                   </a></td>
                                                   <td><a href="#panel_edit_account" class="show-tab"><i class="fa fa-pencil edit-user-info"></i></a></td>
                                                </tr>
                                             </tbody>
                                          </table>
                                          <table class="table table-condensed table-hover">
                                             <thead>
                                                <tr>
                                                   <th colspan="3">General information</th>
                                                </tr>
                                             </thead>
                                             <tbody>
                                                <tr>
                                                   <td>Position</td>
                                                   <td>UI Designer</td>
                                                   <td><a href="#panel_edit_account" class="show-tab"><i class="fa fa-pencil edit-user-info"></i></a></td>
                                                </tr>
                                                <tr>
                                                   <td>Last Logged In</td>
                                                   <td>56 min</td>
                                                   <td><a href="#panel_edit_account" class="show-tab"><i class="fa fa-pencil edit-user-info"></i></a></td>
                                                </tr>
                                                <tr>
                                                   <td>Position</td>
                                                   <td>Senior Marketing Manager</td>
                                                   <td><a href="#panel_edit_account" class="show-tab"><i class="fa fa-pencil edit-user-info"></i></a></td>
                                                </tr>
                                                <tr>
                                                   <td>Supervisor</td>
                                                   <td>
                                                   <a href="#">
                                                      Kenneth Ross
                                                   </a></td>
                                                   <td><a href="#panel_edit_account" class="show-tab"><i class="fa fa-pencil edit-user-info"></i></a></td>
                                                </tr>
                                                <tr>
                                                   <td>Status</td>
                                                   <td><span class="label label-sm label-info">Administrator</span></td>
                                                   <td><a href="#panel_edit_account" class="show-tab"><i class="fa fa-pencil edit-user-info"></i></a></td>
                                                </tr>
                                             </tbody>
                                          </table>
                                          <table class="table table-condensed table-hover">
                                             <thead>
                                                <tr>
                                                   <th colspan="3">Additional information</th>
                                                </tr>
                                             </thead>
                                             <tbody>
                                                <tr>
                                                   <td>Birth</td>
                                                   <td>21 October 1982</td>
                                                   <td><a href="#panel_edit_account" class="show-tab"><i class="fa fa-pencil edit-user-info"></i></a></td>
                                                </tr>
                                                <tr>
                                                   <td>Groups</td>
                                                   <td>New company web site development, HR Management</td>
                                                   <td><a href="#panel_edit_account" class="show-tab"><i class="fa fa-pencil edit-user-info"></i></a></td>
                                                </tr>
                                             </tbody>
                                          </table>
                                       </div>
                                    </div>
                                    <div class="col-sm-7 col-md-8">
                                       <p>
                                          Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas convallis porta purus, pulvinar mattis nulla tempus ut. Curabitur quis dui orci. Ut nisi dolor, dignissim a aliquet quis, vulputate id dui. Proin ultrices ultrices ligula, dictum varius turpis faucibus non. Curabitur faucibus ultrices nunc, nec aliquet leo tempor cursus.
                                       </p>
                                       <div class="row space20">
                                          <div class="col-sm-3">
                                             <button class="btn btn-icon btn-block">
                                                <i class="clip-clip"></i>
                                                Projects <span class="badge badge-info"> 4 </span>
                                             </button>
                                          </div>
                                          <div class="col-sm-3">
                                             <button class="btn btn-icon btn-block pulsate">
                                                <i class="clip-bubble-2"></i>
                                                Messages <span class="badge badge-info"> 23 </span>
                                             </button>
                                          </div>
                                          <div class="col-sm-3">
                                             <button class="btn btn-icon btn-block">
                                                <i class="clip-calendar"></i>
                                                Calendar <span class="badge badge-info"> 5 </span>
                                             </button>
                                          </div>
                                          <div class="col-sm-3">
                                             <button class="btn btn-icon btn-block">
                                                <i class="clip-list-3"></i>
                                                Notifications <span class="badge badge-info"> 9 </span>
                                             </button>
                                          </div>
                                       </div>
                                       <div class="panel panel-white space20">
                                          <div class="panel-heading">
                                             <i class="clip-menu"></i>
                                             Recent Activities
                                             <div class="panel-tools">
                                                <a class="btn btn-xs btn-link panel-close" href="#">
                                                   <i class="fa fa-times"></i>
                                                </a>
                                             </div>
                                          </div>
                                          <div class="panel-body panel-scroll height-300">
                                             <ul class="activities">
                                                <li>
                                                   <a class="activity" href="javascript:void(0)">
                                                      <span class="fa-stack fa-2x"> <i class="fa fa-square fa-stack-2x text-blue"></i> <i class="fa fa-code fa-stack-1x fa-inverse"></i> </span> <span class="desc">You uploaded a new release.</span>
                                                      <div class="time">
                                                         <i class="fa fa-clock-o"></i>
                                                         2 hours ago
                                                      </div>
                                                   </a>
                                                </li>
                                                <li>
                                                   <a class="activity" href="javascript:void(0)">
                                                      <img alt="image" src="assets/images/avatar-2.jpg"> <span class="desc">Nicole Bell sent you a message.</span>
                                                      <div class="time">
                                                         <i class="fa fa-clock-o"></i>
                                                         3 hours ago
                                                      </div>
                                                   </a>
                                                </li>
                                                <li>
                                                   <a class="activity" href="javascript:void(0)">
                                                      <span class="fa-stack fa-2x"> <i class="fa fa-square fa-stack-2x text-orange"></i> <i class="fa fa-database fa-stack-1x fa-inverse"></i> </span> <span class="desc">DataBase Migration.</span>
                                                      <div class="time">
                                                         <i class="fa fa-clock-o"></i>
                                                         5 hours ago
                                                      </div>
                                                   </a>
                                                </li>
                                                <li>
                                                   <a class="activity" href="javascript:void(0)">
                                                      <span class="fa-stack fa-2x"> <i class="fa fa-square fa-stack-2x text-yellow"></i> <i class="fa fa-calendar-o fa-stack-1x fa-inverse"></i> </span> <span class="desc">You added a new event to the calendar.</span>
                                                      <div class="time">
                                                         <i class="fa fa-clock-o"></i>
                                                         8 hours ago
                                                      </div>
                                                   </a>
                                                </li>
                                                <li>
                                                   <a class="activity" href="javascript:void(0)">
                                                      <span class="fa-stack fa-2x"> <i class="fa fa-square fa-stack-2x text-green"></i> <i class="fa fa-file-image-o fa-stack-1x fa-inverse"></i> </span> <span class="desc">Kenneth Ross uploaded new images.</span>
                                                      <div class="time">
                                                         <i class="fa fa-clock-o"></i>
                                                         9 hours ago
                                                      </div>
                                                   </a>
                                                </li>
                                                <li>
                                                   <a class="activity" href="javascript:void(0)">
                                                      <span class="fa-stack fa-2x"> <i class="fa fa-square fa-stack-2x text-green"></i> <i class="fa fa-file-image-o fa-stack-1x fa-inverse"></i> </span> <span class="desc">Peter Clark uploaded a new image.</span>
                                                      <div class="time">
                                                         <i class="fa fa-clock-o"></i>
                                                         12 hours ago
                                                      </div>
                                                   </a>
                                                </li>
                                             </ul>
                                          </div>
                                       </div>
                                       <div class="panel panel-white space20">
                                          <div class="panel-heading">
                                             <i class="clip-checkmark-2"></i>
                                             To Do
                                             <div class="panel-tools">
                                                <a class="btn btn-xs btn-link panel-close" href="#">
                                                   <i class="fa fa-times"></i>
                                                </a>
                                             </div>
                                          </div>
                                          <div class="panel-body panel-scroll height-300">
                                             <ul class="todo">
                                                <li>
                                                   <a class="todo-actions" href="javascript:void(0)">
                                                      <i class="fa fa-square-o"></i> <span class="desc">Staff Meeting</span> <span class="label label-danger"> today</span>
                                                   </a>
                                                </li>
                                                <li>
                                                   <a class="todo-actions" href="javascript:void(0)">
                                                      <i class="fa fa-square-o"></i> <span class="desc"> New frontend layout</span> <span class="label label-danger"> today</span>
                                                   </a>
                                                </li>
                                                <li>
                                                   <a class="todo-actions" href="javascript:void(0)">
                                                      <i class="fa fa-square-o"></i> <span class="desc"> Hire developers</span> <span class="label label-warning"> tommorow</span>
                                                   </a>
                                                </li>
                                                <li>
                                                   <a class="todo-actions" href="javascript:void(0)">
                                                      <i class="fa fa-square-o"></i> <span class="desc">Staff Meeting</span> <span class="label label-warning"> tommorow</span>
                                                   </a>
                                                </li>
                                                <li>
                                                   <a class="todo-actions" href="javascript:void(0)">
                                                      <i class="fa fa-square-o"></i> <span class="desc"> New frontend layout</span> <span class="label label-success"> this week</span>
                                                   </a>
                                                </li>
                                                <li>
                                                   <a class="todo-actions" href="javascript:void(0)">
                                                      <i class="fa fa-square-o"></i> <span class="desc"> Hire developers</span> <span class="label label-success"> this week</span>
                                                   </a>
                                                </li>
                                                <li>
                                                   <a class="todo-actions" href="javascript:void(0)">
                                                      <i class="fa fa-square-o"></i> <span class="desc"> New frontend layout</span> <span class="label label-info"> this month</span>
                                                   </a>
                                                </li>
                                                <li>
                                                   <a class="todo-actions" href="javascript:void(0)">
                                                      <i class="fa fa-square-o"></i> <span class="desc"> Hire developers</span> <span class="label label-info"> this month</span>
                                                   </a>
                                                </li>
                                                <li>
                                                   <a class="todo-actions" href="javascript:void(0)">
                                                      <i class="fa fa-square-o"></i> <span class="desc">Staff Meeting</span> <span class="label label-danger"> today</span>
                                                   </a>
                                                </li>
                                                <li>
                                                   <a class="todo-actions" href="javascript:void(0)">
                                                      <i class="fa fa-square-o"></i> <span class="desc"> New frontend layout</span> <span class="label label-danger"> today</span>
                                                   </a>
                                                </li>
                                                <li>
                                                   <a class="todo-actions" href="javascript:void(0)">
                                                      <i class="fa fa-square-o"></i> <span class="desc"> Hire developers</span> <span class="label label-warning"> tommorow</span>
                                                   </a>
                                                </li>
                                             </ul>
                                          </div>
                                       </div>
                                    </div>
                                 </div>
                              </div>                             
                              <div id="panel_projects" class="tab-pane fade">
                                 <table class="table table-striped table-bordered table-hover" id="projects">
                                    <thead>
                                       <tr>
                                          <th class="center">
                                          <div class="checkbox-table">
                                             <label>
                                                <input type="checkbox" class="flat-grey selectall">
                                             </label>
                                          </div></th>
                                          <th>Project Name</th>
                                          <th class="hidden-xs">Client</th>
                                          <th>Proj Comp</th>
                                          <th class="hidden-xs">%Comp</th>
                                          <th class="hidden-xs center">Priority</th>
                                          <th></th>
                                       </tr>
                                    </thead>
                                    <tbody>
                                       <tr>
                                          <td class="center">
                                          <div class="checkbox-table">
                                             <label>
                                                <input type="checkbox" class="flat-grey foocheck">
                                             </label>
                                          </div></td>
                                          <td>IT Help Desk</td>
                                          <td class="hidden-xs">Master Company</td>
                                          <td>11 november 2014</td>
                                          <td class="hidden-xs">
                                          <div class="progress active progress-xs">
                                             <div style="width: 70%" aria-valuemax="100" aria-valuemin="0" aria-valuenow="70" role="progressbar" class="progress-bar progress-bar-warning">
                                                <span class="sr-only"> 70% Complete (danger)</span>
                                             </div>
                                          </div></td>
                                          <td class="center hidden-xs"><span class="label label-danger">Critical</span></td>
                                          <td class="center">
                                          <div class="visible-md visible-lg hidden-sm hidden-xs">
                                             <a href="#" class="btn btn-light-blue tooltips" data-placement="top" data-original-title="Edit"><i class="fa fa-edit"></i></a>
                                             <a href="#" class="btn btn-green tooltips" data-placement="top" data-original-title="Share"><i class="fa fa-share"></i></a>
                                             <a href="#" class="btn btn-red tooltips" data-placement="top" data-original-title="Remove"><i class="fa fa-times fa fa-white"></i></a>
                                          </div>
                                          <div class="visible-xs visible-sm hidden-md hidden-lg">
                                             <div class="btn-group">
                                                <a class="btn btn-green dropdown-toggle btn-sm" data-toggle="dropdown" href="#">
                                                   <i class="fa fa-cog"></i> <span class="caret"></span>
                                                </a>
                                                <ul role="menu" class="dropdown-menu dropdown-dark pull-right">
                                                   <li role="presentation">
                                                      <a role="menuitem" tabindex="-1" href="#">
                                                         <i class="fa fa-edit"></i> Edit
                                                      </a>
                                                   </li>
                                                   <li role="presentation">
                                                      <a role="menuitem" tabindex="-1" href="#">
                                                         <i class="fa fa-share"></i> Share
                                                      </a>
                                                   </li>
                                                   <li role="presentation">
                                                      <a role="menuitem" tabindex="-1" href="#">
                                                         <i class="fa fa-times"></i> Remove
                                                      </a>
                                                   </li>
                                                </ul>
                                             </div>
                                          </div></td>
                                       </tr>
                                       <tr>
                                          <td class="center">
                                          <div class="checkbox-table">
                                             <label>
                                                <input type="checkbox" class="flat-grey foocheck">
                                             </label>
                                          </div></td>
                                          <td>PM New Product Dev</td>
                                          <td class="hidden-xs">Brand Company</td>
                                          <td>12 june 2014</td>
                                          <td class="hidden-xs">
                                          <div class="progress active progress-xs">
                                             <div style="width: 40%" aria-valuemax="100" aria-valuemin="0" aria-valuenow="40" role="progressbar" class="progress-bar progress-bar-info">
                                                <span class="sr-only"> 40% Complete</span>
                                             </div>
                                          </div></td>
                                          <td class="center hidden-xs"><span class="label label-warning">High</span></td>
                                          <td class="center">
                                          <div class="visible-md visible-lg hidden-sm hidden-xs">
                                             <a href="#" class="btn btn-light-blue tooltips" data-placement="top" data-original-title="Edit"><i class="fa fa-edit"></i></a>
                                             <a href="#" class="btn btn-green tooltips" data-placement="top" data-original-title="Share"><i class="fa fa-share"></i></a>
                                             <a href="#" class="btn btn-red tooltips" data-placement="top" data-original-title="Remove"><i class="fa fa-times fa fa-white"></i></a>
                                          </div>
                                          <div class="visible-xs visible-sm hidden-md hidden-lg">
                                             <div class="btn-group">
                                                <a class="btn btn-green dropdown-toggle btn-sm" data-toggle="dropdown" href="#">
                                                   <i class="fa fa-cog"></i> <span class="caret"></span>
                                                </a>
                                                <ul role="menu" class="dropdown-menu dropdown-dark pull-right">
                                                   <li role="presentation">
                                                      <a role="menuitem" tabindex="-1" href="#">
                                                         <i class="fa fa-edit"></i> Edit
                                                      </a>
                                                   </li>
                                                   <li role="presentation">
                                                      <a role="menuitem" tabindex="-1" href="#">
                                                         <i class="fa fa-share"></i> Share
                                                      </a>
                                                   </li>
                                                   <li role="presentation">
                                                      <a role="menuitem" tabindex="-1" href="#">
                                                         <i class="fa fa-times"></i> Remove
                                                      </a>
                                                   </li>
                                                </ul>
                                             </div>
                                          </div></td>
                                       </tr>
                                       <tr>
                                          <td class="center">
                                          <div class="checkbox-table">
                                             <label>
                                                <input type="checkbox" class="flat-grey foocheck">
                                             </label>
                                          </div></td>
                                          <td>ClipTheme Web Site</td>
                                          <td class="hidden-xs">Internal</td>
                                          <td>11 november 2014</td>
                                          <td class="hidden-xs">
                                          <div class="progress active progress-xs">
                                             <div style="width: 90%" aria-valuemax="100" aria-valuemin="0" aria-valuenow="90" role="progressbar" class="progress-bar progress-bar-success">
                                                <span class="sr-only"> 90% Complete</span>
                                             </div>
                                          </div></td>
                                          <td class="center hidden-xs"><span class="label label-success">Normal</span></td>
                                          <td class="center">
                                          <div class="visible-md visible-lg hidden-sm hidden-xs">
                                             <a href="#" class="btn btn-light-blue tooltips" data-placement="top" data-original-title="Edit"><i class="fa fa-edit"></i></a>
                                             <a href="#" class="btn btn-green tooltips" data-placement="top" data-original-title="Share"><i class="fa fa-share"></i></a>
                                             <a href="#" class="btn btn-red tooltips" data-placement="top" data-original-title="Remove"><i class="fa fa-times fa fa-white"></i></a>
                                          </div>
                                          <div class="visible-xs visible-sm hidden-md hidden-lg">
                                             <div class="btn-group">
                                                <a class="btn btn-green dropdown-toggle btn-sm" data-toggle="dropdown" href="#">
                                                   <i class="fa fa-cog"></i> <span class="caret"></span>
                                                </a>
                                                <ul role="menu" class="dropdown-menu dropdown-dark pull-right">
                                                   <li role="presentation">
                                                      <a role="menuitem" tabindex="-1" href="#">
                                                         <i class="fa fa-edit"></i> Edit
                                                      </a>
                                                   </li>
                                                   <li role="presentation">
                                                      <a role="menuitem" tabindex="-1" href="#">
                                                         <i class="fa fa-share"></i> Share
                                                      </a>
                                                   </li>
                                                   <li role="presentation">
                                                      <a role="menuitem" tabindex="-1" href="#">
                                                         <i class="fa fa-times"></i> Remove
                                                      </a>
                                                   </li>
                                                </ul>
                                             </div>
                                          </div></td>
                                       </tr>
                                       <tr>
                                          <td class="center">
                                          <div class="checkbox-table">
                                             <label>
                                                <input type="checkbox" class="flat-grey foocheck">
                                             </label>
                                          </div></td>
                                          <td>Local Ad</td>
                                          <td class="hidden-xs">UI Fab</td>
                                          <td>15 april 2014</td>
                                          <td class="hidden-xs">
                                          <div class="progress active progress-xs">
                                             <div style="width: 50%" aria-valuemax="100" aria-valuemin="0" aria-valuenow="50" role="progressbar" class="progress-bar progress-bar-warning">
                                                <span class="sr-only"> 50% Complete</span>
                                             </div>
                                          </div></td>
                                          <td class="center hidden-xs"><span class="label label-success">Normal</span></td>
                                          <td class="center">
                                          <div class="visible-md visible-lg hidden-sm hidden-xs">
                                             <a href="#" class="btn btn-light-blue tooltips" data-placement="top" data-original-title="Edit"><i class="fa fa-edit"></i></a>
                                             <a href="#" class="btn btn-green tooltips" data-placement="top" data-original-title="Share"><i class="fa fa-share"></i></a>
                                             <a href="#" class="btn btn-red tooltips" data-placement="top" data-original-title="Remove"><i class="fa fa-times fa fa-white"></i></a>
                                          </div>
                                          <div class="visible-xs visible-sm hidden-md hidden-lg">
                                             <div class="btn-group">
                                                <a class="btn btn-green dropdown-toggle btn-sm" data-toggle="dropdown" href="#">
                                                   <i class="fa fa-cog"></i> <span class="caret"></span>
                                                </a>
                                                <ul role="menu" class="dropdown-menu dropdown-dark pull-right">
                                                   <li role="presentation">
                                                      <a role="menuitem" tabindex="-1" href="#">
                                                         <i class="fa fa-edit"></i> Edit
                                                      </a>
                                                   </li>
                                                   <li role="presentation">
                                                      <a role="menuitem" tabindex="-1" href="#">
                                                         <i class="fa fa-share"></i> Share
                                                      </a>
                                                   </li>
                                                   <li role="presentation">
                                                      <a role="menuitem" tabindex="-1" href="#">
                                                         <i class="fa fa-times"></i> Remove
                                                      </a>
                                                   </li>
                                                </ul>
                                             </div>
                                          </div></td>
                                       </tr>
                                       <tr>
                                          <td class="center">
                                          <div class="checkbox-table">
                                             <label>
                                                <input type="checkbox" class="flat-grey foocheck">
                                             </label>
                                          </div></td>
                                          <td>Design new theme</td>
                                          <td class="hidden-xs">Internal</td>
                                          <td>2 october 2014</td>
                                          <td class="hidden-xs">
                                          <div class="progress active progress-xs">
                                             <div style="width: 20%" aria-valuemax="100" aria-valuemin="0" aria-valuenow="20" role="progressbar" class="progress-bar progress-bar-success">
                                                <span class="sr-only"> 20% Complete (warning)</span>
                                             </div>
                                          </div></td>
                                          <td class="center hidden-xs"><span class="label label-danger">Critical</span></td>
                                          <td class="center">
                                          <div class="visible-md visible-lg hidden-sm hidden-xs">
                                             <a href="#" class="btn btn-light-blue tooltips" data-placement="top" data-original-title="Edit"><i class="fa fa-edit"></i></a>
                                             <a href="#" class="btn btn-green tooltips" data-placement="top" data-original-title="Share"><i class="fa fa-share"></i></a>
                                             <a href="#" class="btn btn-red tooltips" data-placement="top" data-original-title="Remove"><i class="fa fa-times fa fa-white"></i></a>
                                          </div>
                                          <div class="visible-xs visible-sm hidden-md hidden-lg">
                                             <div class="btn-group">
                                                <a class="btn btn-green dropdown-toggle btn-sm" data-toggle="dropdown" href="#">
                                                   <i class="fa fa-cog"></i> <span class="caret"></span>
                                                </a>
                                                <ul role="menu" class="dropdown-menu dropdown-dark pull-right">
                                                   <li role="presentation">
                                                      <a role="menuitem" tabindex="-1" href="#">
                                                         <i class="fa fa-edit"></i> Edit
                                                      </a>
                                                   </li>
                                                   <li role="presentation">
                                                      <a role="menuitem" tabindex="-1" href="#">
                                                         <i class="fa fa-share"></i> Share
                                                      </a>
                                                   </li>
                                                   <li role="presentation">
                                                      <a role="menuitem" tabindex="-1" href="#">
                                                         <i class="fa fa-times"></i> Remove
                                                      </a>
                                                   </li>
                                                </ul>
                                             </div>
                                          </div></td>
                                       </tr>
                                       <tr>
                                          <td class="center">
                                          <div class="checkbox-table">
                                             <label>
                                                <input type="checkbox" class="flat-grey foocheck">
                                             </label>
                                          </div></td>
                                          <td>IT Help Desk</td>
                                          <td class="hidden-xs">Designer TM</td>
                                          <td>6 december 2014</td>
                                          <td class="hidden-xs">
                                          <div class="progress active progress-xs">
                                             <div style="width: 40%" aria-valuemax="100" aria-valuemin="0" aria-valuenow="40" role="progressbar" class="progress-bar progress-bar-warning">
                                                <span class="sr-only"> 40% Complete (warning)</span>
                                             </div>
                                          </div></td>
                                          <td class="center hidden-xs"><span class="label label-warning">High</span></td>
                                          <td class="center">
                                          <div class="visible-md visible-lg hidden-sm hidden-xs">
                                             <a href="#" class="btn btn-light-blue tooltips" data-placement="top" data-original-title="Edit"><i class="fa fa-edit"></i></a>
                                             <a href="#" class="btn btn-green tooltips" data-placement="top" data-original-title="Share"><i class="fa fa-share"></i></a>
                                             <a href="#" class="btn btn-red tooltips" data-placement="top" data-original-title="Remove"><i class="fa fa-times fa fa-white"></i></a>
                                          </div>
                                          <div class="visible-xs visible-sm hidden-md hidden-lg">
                                             <div class="btn-group">
                                                <a class="btn btn-green dropdown-toggle btn-sm" data-toggle="dropdown" href="#">
                                                   <i class="fa fa-cog"></i> <span class="caret"></span>
                                                </a>
                                                <ul role="menu" class="dropdown-menu dropdown-dark pull-right">
                                                   <li role="presentation">
                                                      <a role="menuitem" tabindex="-1" href="#">
                                                         <i class="fa fa-edit"></i> Edit
                                                      </a>
                                                   </li>
                                                   <li role="presentation">
                                                      <a role="menuitem" tabindex="-1" href="#">
                                                         <i class="fa fa-share"></i> Share
                                                      </a>
                                                   </li>
                                                   <li role="presentation">
                                                      <a role="menuitem" tabindex="-1" href="#">
                                                         <i class="fa fa-times"></i> Remove
                                                      </a>
                                                   </li>
                                                </ul>
                                             </div>
                                          </div></td>
                                       </tr>
                                    </tbody>
                                 </table>
                              </div>
                           </div>
                        </div>
                     </div>
                  </div>
                        <!-- end: PAGE CONTENT-->
                     </div>
                  </div>
                  <!-- end: PAGE -->
               </div>
               <!-- end: MAIN CONTAINER -->
               <!-- start: FOOTER -->
               <footer class="inner">
                  <div class="footer-inner">
                     <div class="pull-left">2014 &copy; Rapido by cliptheme.</div>
                     <div class="pull-right">
                        <span class="go-top"><i class="fa fa-chevron-up"></i></span>
                     </div>
                  </div>
               </footer>
               <!-- end: FOOTER -->
               <!-- start: SUBVIEW SAMPLE CONTENTS -->
               <!-- *** NEW NOTE *** -->
               <!-- end: SUBVIEW SAMPLE CONTENTS -->
            </div>
            <!-- start: MAIN JAVASCRIPTS -->
            <!--[if lt IE 9]>
            <script src="${pageContext.request.contextPath}/assets/plugins/respond.min.js"></script>
            <script src="${pageContext.request.contextPath}/assets/plugins/excanvas.min.js"></script>
            <script type="text/javascript" src="${pageContext.request.contextPath}/assets/plugins/jQuery/jquery-1.11.1.min.js"></script>
            <![endif]-->
            <!--[if gte IE 9]><!-->
            <script
               src="${pageContext.request.contextPath}/assets/plugins/jQuery/jquery-2.1.1.min.js"></script>
            <!--<![endif]-->
            <script
               src="${pageContext.request.contextPath}/assets/plugins/jquery-ui/jquery-ui-1.10.2.custom.min.js"></script>
            <script
               src="${pageContext.request.contextPath}/assets/plugins/bootstrap/js/bootstrap.min.js"></script>
            <script
               src="${pageContext.request.contextPath}/assets/plugins/blockUI/jquery.blockUI.js"></script>
            <script
               src="${pageContext.request.contextPath}/assets/plugins/iCheck/jquery.icheck.min.js"></script>
            <script
               src="${pageContext.request.contextPath}/assets/plugins/moment/min/moment.min.js"></script>
            <script
               src="${pageContext.request.contextPath}/assets/plugins/perfect-scrollbar/src/jquery.mousewheel.js"></script>
            <script
               src="${pageContext.request.contextPath}/assets/plugins/perfect-scrollbar/src/perfect-scrollbar.js"></script>
            <script
               src="${pageContext.request.contextPath}/assets/plugins/bootbox/bootbox.min.js"></script>
            <script
               src="${pageContext.request.contextPath}/assets/plugins/jquery.scrollTo/jquery.scrollTo.min.js"></script>
            <script
               src="${pageContext.request.contextPath}/assets/plugins/ScrollToFixed/jquery-scrolltofixed-min.js"></script>
            <script
               src="${pageContext.request.contextPath}/assets/plugins/jquery.appear/jquery.appear.js"></script>
            <script
               src="${pageContext.request.contextPath}/assets/plugins/jquery-cookie/jquery.cookie.js"></script>
            <script
               src="${pageContext.request.contextPath}/assets/plugins/velocity/jquery.velocity.min.js"></script>
            <!-- end: MAIN JAVASCRIPTS -->
            <!-- start: JAVASCRIPTS REQUIRED FOR SUBVIEW CONTENTS -->
            <script
               src="${pageContext.request.contextPath}/assets/plugins/owl-carousel/owl-carousel/owl.carousel.js"></script>
            <script
               src="${pageContext.request.contextPath}/assets/plugins/jquery-mockjax/jquery.mockjax.js"></script>
            <script
               src="${pageContext.request.contextPath}/assets/plugins/toastr/toastr.js"></script>
            <script
               src="${pageContext.request.contextPath}/assets/plugins/bootstrap-modal/js/bootstrap-modal.js"></script>
            <script
               src="${pageContext.request.contextPath}/assets/plugins/bootstrap-modal/js/bootstrap-modalmanager.js"></script>
            <script
               src="${pageContext.request.contextPath}/assets/plugins/fullcalendar/fullcalendar/fullcalendar.min.js"></script>
            <script
               src="${pageContext.request.contextPath}/assets/plugins/bootstrap-switch/dist/js/bootstrap-switch.min.js"></script>
            <script
               src="${pageContext.request.contextPath}/assets/plugins/bootstrap-select/bootstrap-select.min.js"></script>
            <script
               src="${pageContext.request.contextPath}/assets/plugins/jquery-validation/dist/jquery.validate.min.js"></script>
            <script
               src="${pageContext.request.contextPath}/assets/plugins/bootstrap-fileupload/bootstrap-fileupload.min.js"></script>
            <script
               src="${pageContext.request.contextPath}/assets/plugins/DataTables/media/js/jquery.dataTables.min.js"></script>
            <script
               src="${pageContext.request.contextPath}/assets/plugins/DataTables/media/js/DT_bootstrap.js"></script>
            <script
               src="${pageContext.request.contextPath}/assets/plugins/truncate/jquery.truncate.js"></script>
            <script
               src="${pageContext.request.contextPath}/assets/plugins/summernote/dist/summernote.min.js"></script>
            <script
               src="${pageContext.request.contextPath}/assets/plugins/bootstrap-daterangepicker/daterangepicker.js"></script>
            <script src="${pageContext.request.contextPath}/assets/js/subview.js"></script>
            <script
               src="${pageContext.request.contextPath}/assets/js/subview-examples.js"></script>
            <script type="text/javascript"
               src="${pageContext.request.contextPath}/assets/plugins/select2/select2.min.js"></script>
            <script type="text/javascript"
               src="${pageContext.request.contextPath}/assets/js/table-data.js"></script>
            <script type="text/javascript"
               src="${pageContext.request.contextPath}/assets/scripts/script_01.js"></script>
            <!-- end: JAVASCRIPTS REQUIRED FOR SUBVIEW CONTENTS -->
            <!-- start: JAVASCRIPTS REQUIRED FOR THIS PAGE ONLY -->
            <!-- end: JAVASCRIPTS REQUIRED FOR THIS PAGE ONLY -->
            <!-- start: CORE JAVASCRIPTS  -->
            <script src="${pageContext.request.contextPath}/assets/js/main.js"></script>
            <!-- end: CORE JAVASCRIPTS  -->
            <!-- end: JAVASCRIPTS REQUIRED FOR SUBVIEW CONTENTS -->
            <!-- start: JAVASCRIPTS REQUIRED FOR THIS PAGE ONLY -->
            <!-- end: JAVASCRIPTS REQUIRED FOR THIS PAGE ONLY -->
            <!-- start: CORE JAVASCRIPTS  --
               <script src="${pageContext.request.contextPath}/assets/js/main.js"></script>
               <!-- end: CORE JAVASCRIPTS  -->
            <script>
               jQuery(document).ready(function() {
               	Main.init();
               });
            </script>
         </body>
         <!-- end: BODY -->
         <!-- Mirrored from www.cliptheme.com/demo/rapido/pages_blank_page.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 27 Jul 2014 06:19:20 GMT -->
      </html>