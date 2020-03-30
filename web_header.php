 <?php include 'db.php'; ?>


 <!DOCTYPE html>
 <html lang="en">

 <head>
     <!-- Required meta tags -->
     <meta charset="utf-8">
     <meta name="viewport" content="width=device-width, initial-scale=1"> <!-- mobile first -->

     <!-- Latest compiled and minified CSS -->
     <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">

     <!-- jQuery library -->
     <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

     <!-- Popper JS -->
     <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>

     <!-- Latest compiled JavaScript -->
     <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>

     <!--for the social media-->
     <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

     <!-- my CSS-->
     <link rel="stylesheet" href="CSS/bld.css">
     <link rel="stylesheet" href="CSS/frontPage1.css">
     <link rel="stylesheet" href="CSS/end_recipe_css.css">


     <!--favicon link-->
     <link rel="shortcut icon" href="image/favicon.ico" />



 </head>

 <body>
     <div class="container-fluid">
         <div class="row">
             <div class="col-sm-5">
                 <a href="frontPage.php">
                     <img src="image/fud-hub_logo_ns.png" alt="fud-hub_logo" id="logo">
                 </a>
             </div>
             <div class="col-sm-7">
                 <img src="image/loggedin.png" alt="user_logged_in" id="quan" class="image-fluid"><br>
             </div>
         </div>
         <div class="row">
             <div class="col-sm-12">
                 <h4 class="hello">
                     <?php
                        session_start();
                        echo "<a href='#' onclick='myFunction1()'>Hello, " . $_SESSION['user'] . "!</a>";

                        ?>
                 </h4><br>
             </div>
         </div>
         <!-- log out function -->
         <div class="row">
             <div class="col-sm-12">
                 <h3 id="logout" onclick="myFunction2()">Log out?</h3>
             </div>
         </div>


         <!-- <div class="row">
             <div class="col-sm-12">
                 <button type="button" class="btn btn-danger logout">Log out</button>
             </div>
         </div> -->

         <!-- nav bar -->
         <div class="row">
             <div class="col-sm-12">
                 <nav class="navbar navbar-expand-lg bg-dark navbar-dark">
                     <a class="navbar-brand" href="frontPage.php">Home</a>
                     <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                         <span class="navbar-toggler-icon"></span>
                     </button>

                     <div class="collapse navbar-collapse" id="navbarSupportedContent">
                         <ul class="navbar-nav mr-auto">

                             <!-- social media -->
                             <li class="nav-item dropdown">
                                 <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                     Follow us

                                 </a>
                                 <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                     <a class="dropdown-item fa fa-facebook" href="https://www.facebook.com/fud.hub.35"> Facebook</a>
                                     <div class="dropdown-divider"></div>
                                     <a class="dropdown-item fa fa-instagram" href="https://www.instagram.com/fudhub_official/"> Instagram</a>
                                     <div class="dropdown-divider"></div>
                                     <a class="dropdown-item fa fa-twitter" href="#"> Twitter</a>
                                     <div class="dropdown-divider"></div>
                                     <a class="dropdown-item fa fa-youtube" href="#"> Youtube</a>
                                     <div class="dropdown-divider"></div>
                                     <a class="dropdown-item fa fa-linkedin" href="#"> Linkedin</a>

                                 </div>
                             </li>

                             <!-- services -->
                             <li class="nav-item dropdown">
                                 <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                     Meals

                                 </a>
                                 <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                     <a class="dropdown-item" href="breakfast.php">Breakfast</a>
                                     <div class="dropdown-divider"></div>
                                     <a class="dropdown-item" href="lunch.php">Lunch</a>
                                     <div class="dropdown-divider"></div>
                                     <a class="dropdown-item" href="dinner.php">Dinner</a>
                                 </div>
                             </li>



                             <li class="nav-item">
                                 <a style="margin-left: 20px; font-size: large;" class="nav-link" href="post.php">
                                     Post a Recipe </a>
                             </li>

                             <!-- <li class="nav-item">
                                 <a style="margin-left: 20px; font-size: large;" class="nav-link" href="homePage.php">
                                     Log Out </a>
                             </li> -->


                             <!-- <li class="nav-item">
                                 <a style="margin-left: 20px; font-size: large;" class="nav-link" href="breakfast.php">
                                     Breakfast </a style="margin-left: 10px;">
                             </li>
                             <li class="nav-item">
                                 <a style="margin-left: 20px; font-size: large;" class="nav-link" href="lunch.php">
                                     Lunch </a style="margin-left: 10px;">
                             </li>
                             <li class="nav-item">
                                 <a style="margin-left: 20px; font-size: large;" class="nav-link" href="dinner.php">
                                     Dinner </a>
                             </li> -->
                         </ul>

                         <form class="form-inline my-2 my-lg-0" id="search">
                             <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                             <button class="btn btn-success my-2 my-sm-0" type="submit">Search</button>
                         </form>
                     </div>
                 </nav>
             </div>
         </div>
     </div>

     <script>
         function myFunction1() {
             var x = document.getElementById("logout");
             if (x.style.display === "none") {
                 x.style.display = "block";
             } else {
                 x.style.display = "none";
             }
         }

         function myFunction2() {
             var result = confirm("Do you really want to log out?");
             if (result == true) {
                 alert("Thanks for visiting FUD-HUB!");
                 location.replace('homePage.php');
             } else {
                 var x = document.getElementById("logout");
                 x.style.display = "none";
             }
         }
     </script>