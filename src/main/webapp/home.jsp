<!DOCTYpe html>
<%--create a form--%>
<html>
    <head>
        <title>Form</title>
    </head>
    <body>
        <form action="addAlien" method="post">
            <table>
                <tr>
                    <td>Please Enter your name:</td>
                    <td><input type="text" name="aname"></td>
                </tr>
                <tr>
                    <td>Please Enter your id:</td>
                    <td><input type="text" name="aid"></td>
                </tr>
                <tr>
                    <td>Kindly Enter your tech:</td>
                    <td><input type="text" name="tech"></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit"></td>
                </tr>
            </table>
        </form>
        <hr/>
        <h2>Get Alien</h2>
        <hr/>
        <form action="getAlien" method="post">
            <table>
                <tr>
                    <td>Why don't you Enter your id:</td>
                    <td><input type="text" name="aid"></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit"></td>
                </tr>
            </table>
        </form>
        
        
        
<!--         <form action="getAlien" method="post">
            <table>
                <tr>
                    <td>Why don't you Enter your id:</td>
                    <td><input type="text" name="aid"></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit"></td>
                </tr>
            </table>
        </form> -->
        
<!--     created a new form     -->
    </body>
</html>
