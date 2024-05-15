<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <div class="navbar">
        <div class="list">
            <ul>
                <li> <a href="">HOME</a> </li>
                <li> <a href="">ABOUT US</a> </li>
                <li> <a href="">CONTACT US</a> </li>

                
            </ul>
        </div>

    </div>

    <div class="name"><center>
        <h1>Book Worm's Paradise</h1>
    </center>
    </div>

    <div class="form">
      <form action="server" method="get">
         <div class="login">
            <h4> <center> LOGIN</center></h4>
             <input type="text" placeholder="Enter username" name="username"  required> <br>
             <input type="password" placeholder="Enter password"  name="pass" required><br>
             <center><input type="submit" value="submit"></center>
          </div>
          <div class="signup">
             <br> <p><b>Don't have  an Account?</p></b>
             <center> <a href="http://127.0.0.1:5500/Library%20APP/SignUpLibrary.html">SIGN-UP</a></center>
          </div>

          <div class="account">
            <p><center>OR</p>
            <p>Continue With </p></center>
            <a href=""><i class="fa-brands fa-google"></i></a>
            <a href=""><i class="fa-brands fa-instagram"></i></a>
            <a href=""><i class="fa-brands fa-facebook"></i></a>
            <a href=""><i class="fa-brands fa-twitter"></i></a>

          </div>
      </form>
     

      
    </div>

    <style>
        
        *{
            padding: 0px;
            margin: 0px;
            box-sizing: border-box;
            
        }
        .signup , .account{
            font-size: large;
        }
        .account{
            padding-top: 10px;
            font-weight: bolder;
        }
        .account a i{
            color: black;
            font-size: 25px;
            padding-left: 14px;
            padding-top: 10px;
            
        }
        .account a i:hover{
            font-weight: bolder;
            color:blue;
        }
        .signup a{
            text-decoration: none;
            font-family:'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif ;
            font-size: large;
            color: red;
        }
        .signup a:hover{
                font-weight: bolder;
                color: blue;
            
        }
        .login{
            font-size: x-large;
        }
        .form{
            width: 300px;
            height: 320px;
            border: 2px solid;
            padding: 30px;
            margin-top: 100px;
            display: flex;
            margin-left: 10%;
            box-shadow: 5px 5px  5px;
            display: flex;
            justify-content: center;
            
            

        }

        body{
            background-image: url(/img/LibraryMain.jpg);
            background-position: center;
            background-size: cover;
            height: 64vh;

        }
        .list{
            margin-left: 30px;
            margin-top: 10px;
            
        }
        .list li a{
            text-decoration: none;
            color: black;
            
        }
        .list ul{
            font-size: large;
            font-weight: bold;
            font-family: 'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif;
            list-style: none;
            display: flex;
            gap: 20px;
            padding: 10px;
            
            
        }
        .list ul a:hover{
            transition: ease-in-out;
            color:red;
        }
        .name{
            font-family: 'Trebuchet MS', 'Lucida Sans Unicode', 'Lucida Grande', 'Lucida Sans', Arial, sans-serif;
            color: blue;
            text-shadow: 1px 1px black;
            display: flex;
            margin-left: 35%;
            
            

        }
        
        
    </style>
    


</body>
</html>