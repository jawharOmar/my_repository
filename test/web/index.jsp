<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta charset="utf-8">
        <meta name="viewport" content="width=1000, initial-scale=1">
        <meta http-equiv="X-UA-Compatible" content="IE=Edge">
        <link rel='stylesheet' href='css/bootstrap.css'>
        <script src="js/jquery.js"></script>
        <link rel="stylesheet"
              href="//fonts.googleapis.com/css?family=Oxygen:400,700">
        <link rel="stylesheet" href="css/font-awesome.css">
        <script src='js/bootstrap.js'></script>
        <style>
            .login_in{margin: 5px}
            .input_text{position: relative}
            .input_text input{
                padding-left: 30px;
            }
            .input_text input:focus+i{color:blue}
            .input_text i{position: absolute;z-index: 100;font-size: 30px;top:5px;left: 5px;padding: 2px}
        </style>
    </head>
    <body style="background: gray">
        <div class="container">
            <div style="border-top: 4px solid blue;position: relative;height:325px;margin: 0 auto;width: 325px;margin-top: 150px;background:rgba(0,0,0,0.4);padding: 5px">
                <form action="login.jsp" method="POST">
                    <div style="padding:5px;text-align: center">
                        <img src="images/login.png" style="width: 150px">
                    </div>
                    <div class="input-group input_text">

                        <input type="text" class="form-control login_in" name="user_name" placeholder="User Name"/>
                        <i class="fa fa-user"></i>
                    </div>
                    <div class="input-group input_text">

                        <input type="password" class="form-control login_in" name="password"/>
                        <i class="fa fa-lock"></i>
                    </div>
                    <div style="left:10px;width: 305px;position: absolute;bottom: 3px;">
                        <div class="input-group" style="width: 100%">
                            <input value="Login" style="width: 100%" type='submit' class="btn btn-primary"/>
                        </div>
                    </div>
                </form>
            </div>
        </div>




    </body>

</html>