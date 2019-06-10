  <head>
    <META HTTP-EQUIV="Content-Style-Type" CONTENT="text/css">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>DataWorkFlow</title>
    
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"/>
    <style>
       <%@include file="../css/bootstrap.min.css" %>
       <%@include file="../css/custom.min.css" %>
    </style>
  </head>
  
  <body class="nav-md">
    <div class="container body">
      <div class="main_container">
        <div class="col-md-3 left_col">
          <div class="left_col scroll-view">
            <div class="navbar nav_title" style="border: 0;">
              <a href="/dwf" class="site_title"><i class="fa fa-signal"></i> <span><font face="script mt">DataWorkFlow</font></span></a>
            </div>
			
            <div class="clearfix"></div>

            <br /> <br />
            <!-- sidebar menu -->
            <div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
              <div class="menu_section">
                <h3>General</h3>
                <ul class="nav side-menu">
                  <li><a href="/dwf"><i class="fa fa-home"></i> Accueil </a>
                  </li>
                </ul>
              </div>
              
              <div class="menu_section">
                <h3>Domaine</h3>
                <ul class="nav side-menu">
                  <li><a><i class="fa fa-bar-chart-o"></i>Société<span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="${pageContext.request.contextPath}/societe/list.html">Afficher les sociétés</a></li>
                      <li><a href="${pageContext.request.contextPath}/societe/add.html">Ajouter une société</a></li>
                    </ul>
                  </li> 
				</ul>
              </div>

            </div>
            <!-- /sidebar menu -->
          </div>
        </div>

        <!-- top navigation -->
        <div class="top_nav">
          <div class="nav_menu">
            <nav>
              <div class="nav toggle">
                <a id="menu_toggle"><i class="fa fa-bars"></i></a>
              </div>
              <ul class="nav navbar-nav navbar-right">
                <li class="dropdown" onclick="history.go(+1)">
                    <a class="dropdown-toggle" data-toggle="dropdown">
                        <i class="fa fa-chevron-right fa-fw"></i>
                    </a>
                </li>
                <li class="dropdown" onclick="history.go(-1)">
                    <a class="dropdown-toggle" data-toggle="dropdown">
                        <i class="fa fa-chevron-left fa-fw"></i>
                    </a>
                </li>               
              </ul>
            </nav>
          </div>
        </div>
        <!-- /top navigation -->