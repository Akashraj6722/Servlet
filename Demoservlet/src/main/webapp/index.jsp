<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>


<head>
    <title>SignUp</title>
    <div class="signup">

        <div>
            <h1 class="name">SIGN-UP</h1>
            <form class="form" action="server" method="get">

                <div class="row">
                    <div class="column1">
                        <ul>
                            <li> <label class="userName" for="userName" >UserName:</label></li><br>
                            <li> <label class="DOB " for="DOB">Date.Of.Birth:</label></li><br>
                            <li><label class="gender">Gender:</label></li><br>
                            <li> <label for="ph" class="phone">Phone:</label></li><br>
                            <li> <label for="mail" class="mail">E-mail:</label> </li><br>
                            <li> <label for="pass" class="pass">Password:</label> </li><br>
                            <li><label for="Re-Pass" class="rePass">Re-Enter Password:</label></li>
                        </ul>
                    </div>

                    <div class="column2">
                        <ul>
                            <li><input type="text" name="userName" placeholder="Enter Your FirstName" required></li><br>
                            <li> <input type="date" id="DOB"  name="dob" required></li><br>
                            <li><label for="M" class="male">Male</label> <input type="radio" name="n" id="M" required>
                                <label for="F" class="female">Female</label><input type="radio" name="n" id="F"
                                    required> </li><br>
                            <li><input type="tel" id="ph"  name="phone"  placeholder="+91" required></li><br>
                            <li><input type="email" id="mail"   name="mail"placeholder="abc123@gmail.com" required></li><br>
                            <li><input type="password" id="pass"  name="pass" placeholder="Atleast 8 characters" required></li><br>
                            <li><input type="password" id="Re-Pass" placeholder="Re-Enter Password" required></li>
                        </ul>
                    </div>

                </div>
                <div class="submit">
                    <input id="button"  type="submit" value="submit"></td>
                </div>
            </form>
        </div>

    </div>

</head>

<body>


    <style>
        * {
            margin: 0%;
            padding: 0%;
            box-sizing: border-box;
        }

        body {

            background-image: url('SignupPage.jpg');
            background-repeat: no-repeat;
            background-position: center;
            background-size: cover;

        }
        .submit{
            display: flex;
            justify-content: center;
            margin-top: 20px;
            
        }
        
        #button{
            width: 80px;
            height: 30px;
            /* background-color: ; */
        }

        .row {
            display: flex;
        }

        .column1 ul,
        .column2 ul {
            list-style: none;
        }

        .column1 {
            padding: 10px;
            margin-top: 5px;

        }

        .column2 {
            padding: 10px;
            margin-top: 5px;
            

        }
        .column2 #ph  {
            margin-top: 10px;

        }
        .column2 #Re-Pass{
            margin-top: 2px;

        }
        
       

        .form {
            margin-top: 30px;
        }

        .signup {
            width: 550px;
            height: 450px;
            border: 2px solid;
            margin-left: 30%;
            margin-top: 5%;
            padding: 5px;
            display: flex;
            justify-content: center;
            box-shadow: 5px 5px 5px 5px;

        }

        .name {
            color: red;
            background-color: black;
            width: 150px;
            display: flex;
            justify-content: center;
            margin-left: 30%;

        }
    </style>


    <style>
        .userName {
            background-color: rgb(0, 0, 0);
            font-size: large;
            font-weight: bolder;
            color: aliceblue;
        }

        .lName {
            background-color: rgb(0, 0, 0);
            font-size: large;
            font-weight: bolder;
            color: aliceblue;
        }

        .DOB {
            background-color: rgb(0, 0, 0);
            font-size: large;
            font-weight: bolder;
            color: aliceblue;

        }

        .gender {
            background-color: rgb(0, 0, 0);
            font-size: large;
            font-weight: bolder;
            color: aliceblue;
        }

        .male {

            background-color: aliceblue;

        }

        .female {

            background-color: aliceblue;

        }

        .phone {
            background-color: rgb(0, 0, 0);
            font-size: large;
            font-weight: bolder;
            color: aliceblue;
        }

        .mail {
            background-color: rgb(0, 0, 0);
            font-size: large;
            font-weight: bolder;
            color: aliceblue;
        }

        .category {
            background-color: rgb(0, 0, 0);
            font-size: large;
            font-weight: bolder;
            color: aliceblue;
        }

        .pass {
            background-color: rgb(0, 0, 0);
            font-size: large;
            font-weight: bolder;
            color: aliceblue;
        }

        .rePass {
            background-color: rgb(0, 0, 0);
            font-size: large;
            font-weight: bolder;
            color: aliceblue;
        }
    </style>

</body>