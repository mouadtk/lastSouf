<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
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
                           <div class="col-md-12">
                              <div class="panel panel-white">
                                 <div class="panel-body">
                                 </div>
                              </div>
                           </div>
                        </div>
                        <div class="row">
                           <div class="col-md-12">
                              <!-- start: DYNAMIC TABLE PANEL -->
                              <div class="panel panel-white">
                                 <div class="panel-heading">
                                    <h4 class="panel-title">Dynamic <span class="text-bold">Table</span></h4>
                                    <div class="panel-tools">
                                       <div class="dropdown">
                                          <a data-toggle="dropdown" class="btn btn-xs dropdown-toggle btn-transparent-grey">
                                          <i class="fa fa-cog"></i>
                                          </a>
                                          <ul class="dropdown-menu dropdown-light pull-right" role="menu">
                                             <li>
                                                <a class="panel-collapse collapses" href="#"><i class="fa fa-angle-up"></i> <span>Collapse</span> </a>
                                             </li>
                                             <li>
                                                <a class="panel-refresh" href="#">
                                                <i class="fa fa-refresh"></i> <span>Refresh</span>
                                                </a>
                                             </li>
                                             <li>
                                                <a class="panel-config" href="#panel-config" data-toggle="modal">
                                                <i class="fa fa-wrench"></i> <span>Configurations</span>
                                                </a>
                                             </li>
                                             <li>
                                                <a class="panel-expand" href="#">
                                                <i class="fa fa-expand"></i> <span>Fullscreen</span>
                                                </a>
                                             </li>
                                          </ul>
                                       </div>
                                    </div>
                                 </div>
                                 <div class="panel-body">
                                    <table class="table table-striped table-bordered table-hover table-full-width" id="sample_1">
                                       <thead>
                                          <tr>
                                             <th>Name</th>
                                             <th>Main IP</th>
                                             <th>Main Domain</th>
                                             <th>Count IPs</th>
                                             <th>Actions</th>
                                          </tr>
                                       </thead>
                                       <tbody>
                                          <c:forEach var="server" items="${Servers}">
                                             <tr id="proxy-${server.id}">
                                                <td>${server.name}		</td>
                                                <td>${server.ip}		</td>
                                                <td>${server.domain}	</td>
                                                <td>${fn:length(server.childs)}</td>
                                                <td >
                                                   <div class="btn-group">
                                                      <button type="button" class="btn green btn-sm dropdown-toggle" data-toggle="dropdown">Action &nbsp;<i class="fa fa-angle-down"></i></button>
                                                      <ul class="dropdown-menu  " role="menu">
                                                         <li class="disabled">
                                                            <a href=""  data-ac> Resume</a>
                                                         </li>
                                                         <li>
                                                            <a href="javascript:;">Pause</a>
                                                         </li>
                                                         <li>
                                                            <a href="javascript:;">Cancel</a>
                                                         </li>
                                                         <li class="divider">
                                                         </li>
                                                         <li>
                                                            <a href="javascript:;">Start Reporting</a>
                                                         </li>
                                                      </ul>
                                                   </div>
                                                   <a href="/snds/Reports/ServerDetails?id=${server.id}" class="btn btn-info btn-sm details-btn" data-id="${server.id}">Details</a>																										
                                                </td>
                                             </tr>
                                          </c:forEach>
                                       </tbody>
                                    </table>
                                 </div>
                              </div>
                              <!-- end: DYNAMIC TABLE PANEL -->
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
            <!-- script type="text/javascript"
               src="${pageContext.request.contextPath}/assets/scripts/script_01.js"></script> -->
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
              	//FormElements.init();
				TableData.init();
               });
            </script>
         </body>
         <!-- end: BODY -->
         <!-- Mirrored from www.cliptheme.com/demo/rapido/pages_blank_page.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 27 Jul 2014 06:19:20 GMT -->
      </html>