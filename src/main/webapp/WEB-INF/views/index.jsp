<%--
  Created by IntelliJ IDEA.
  User: phoenix
  Date: 4/25/18
  Time: 5:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>FastTrackIT</title>
    <meta name="viewport" content="width=device-width" initial-scale="1.0">
    <link rel="stylesheet" href="css/style.css">
    <script src="http://code.jquery.com/jquery-3.3.1.min.js"
            integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8=" crossorigin="anonymous"></script>
</head>

<body>
<div class="headerContainer">
    <img src="images/logo.png" height="100px">
</div>

<div class="mainContainer">
    <div class="leftDiv">
        <div class="summaryDiv">
            <h3>Summary Statistics</h3>
            <table cellpadding="0" cellspacing="0" border="1" class="tableClass">
                <tr>
                    <td>SKUs in System</td>
                    <td id="curRows">28</td>
                </tr>
                <tr>
                    <td>Last Import</td>
                    <td></td>
                </tr>
            </table>
        </div>

        <div class="uploadDiv">
            <h3>Upload CSV</h3>
            <form id="form1" action="/upload" method="post" enctype="multipart/form-data">
                <input type="file" name="csvFile" onchange="triggerValidation(this)">
            </form>
            <br>
            <img src="images/upload.png" onclick="SubmitForm()" width="50px">
        </div>
    </div>

    <div class="rightDiv">
        <div class="searchBox"><input id="input" type="search" placeholder="Search UPC" name="s" size="medium"><label
                id="errmsg"></label></div>
        <div class="resultBox">
            <div class="resultTable">
                <table id="tableData" cellpadding="0" cellspacing="0" border="1" class="tableClass">
                    <tr>
                        <th>UPC</th>
                        <th>Return Quantity</th>
                        <th>Seller</th>
                        <th>Item Brand</th>
                        <th>Todo</th>
                        <th>Search Date</th>
                    </tr>
                </table>
            </div>
            <br><input id="tab2csv" type="button" name="tab2csv" value="CSV download and FTP upload">
            <script src="js/index.js"></script>
            <script src="js/table2CSV.js"></script>
        </div>
    </div>
</div>
</body>
</html>