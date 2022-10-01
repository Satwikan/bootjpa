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
                    <td>Enter your name:</td>
                    <td><input type="text" name="aname"></td>
                </tr>
                <tr>
                    <td>Enter your id:</td>
                    <td><input type="text" name="aid"></td>
                </tr>
                <tr>
                    <td>Enter your tech:</td>
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
                    <td>Enter your id:</td>
                    <td><input type="text" name="aid"></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit"></td>
                </tr>
            </table>
        </form>
    </body>
</html>