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

    <link rel="stylesheet" href="CSS/bld.css">
    <link rel="stylesheet" href="CSS/post.css">


</head>

<body>


<?php include "web_header.php" ?>
<div class="container">
    <form action="action_page.php">
    <form method="POST" action="create.php">
        <div class="col-sm-12">
            <h1>Post a Recipe</h1>
            <p>Please fill in the details to Post your Recipe</p>
            <hr>
            
                <div class="row">
                    <div class="col-25">

                        <label for="username">Username</label>
                    </div>
                    <div class="col-75">
                        <input type="text" id="username" name="username" placeholder="Your Username..">
                    </div>
                </div>
                <hr>
                <div class="row">
                    <div class="col-25">
                        <label for="cuisine">Cuisine</label>
                    </div>
                    <div class="col-75">
                        <select id="cuisine" name="cuisine">
                            <option value="#">Select one</option>
                            <option value="chinese">Chinese</option>

                            <option value="indian">Indian</option>
                            <option value="mexican">Mexican</option>
                            <option value="swedish">Swedish</option>
                            <option value="italian">Italian</option>
                            <option value="turkish">Turkish</option>
                        </select>
                    </div>
                </div>
                <hr>
                <div class="row">
                    <div class="col-25">
                        <label for="ingredients">Ingredients</label>
                    </div>
                    <div class="col-75">
                        <textarea id="ingredients" name="ingredients" placeholder="Your Secret Ingredients.." style="height:200px"></textarea>
                    </div>
                </div>
                <hr>
                <div class="row">
                    <div class="col-25">
                        <label for="instructions">Instructions</label>
                    </div>
                    <div class="col-75">
                        <textarea id="instructions" name="instructions" placeholder="Write something.." style="height:200px"></textarea>
                    </div>
                </div>
                <hr>

                <div class="row">
                    <div class="col-25">
                        <label for="nandn">Notes & Nutrition Info</label>
                    </div>
                    <div class="col-75">
                        <input id="nandn" name="nandn" placeholder="Notes & Nutritions..." type="text">
                    </div>
                </div>
                <hr>




                <div class="row">
                    <div class="col-25">
                        <label for="video">Video Link</label>
                    </div>
                    <div class="col-75">
                        <input type="text" id="video" name="video" placeholder="Upload Video link url">
                    </div>
                    <div>

                        <label for="image">Select Image:</label>
                        <input type="file" id="image" name="image">
                    </div>

                </div>
        </div>
        <input type="submit" value="Submit">
    
</div>
</form>
    </form>



        </div>





</div>



</body>

</html>
<?php include 'footer.php' ?>
