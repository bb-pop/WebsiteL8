<%-- 
    Document   : add
    Created on : Jul 29, 2022, 8:55:31 PM
    Author     : TUF DASH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "model.Shop"  %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>เพิ่มคำสั่งซื้อสำเร็จ</title>
        <%
            Shop shop = (Shop) session.getAttribute("shop");
        %>
        </head>
    <body>
        <h1 style="text-align: center;font-size: 100px" >Update</h1>
        <div style="text-align: center">
        ชื่อรุ่น : <%= shop.getModelName()%><br>

        สี : <%= shop.getColor()%><br>
        
        ไซส์ : <%= shop.getSize()%><br>
        
        เบอร์ : <%=  shop.getPhone()%><br>
        
        
        <a href="Update.jsp">แก้ไข</a>
        <a href="SaveToFirebase.jsp">SaveToFirebase</a>
        <a href="index.html">หน้าหลัก</a>
        </div>
    </body>
</html>
