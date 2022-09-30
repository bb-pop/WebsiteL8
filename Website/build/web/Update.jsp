<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "model.Shop"  %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>เพิ่มรถสำเร็จ</title>
    </head>
    <body>
        <h1>แก้ไขคำสั่ง</h1>
        <%
            Shop shop = (Shop) session.getAttribute("shop");
        %>
        
            
           ชื่อเกม : 
            <input type="text" name="modelName" value="<%= shop.getModelName()%>"><br>
            
            สี : 
            <input type="radio" id="price1" name="color" value="<%= shop.getprice()%>">
            <label for="price1">200</label>
            <input type="radio" id="price2" name="color"value="<%= shop.getprice()%>">
            <label for="price2">300</label>
            <input type="radio" id="price3" name="color" value="<%= shop.getprice()%>">
            <label for="price3">400</label>
            <input type="radio" id="price4" name="color"value="<%= shop.getprice()%>">
            <label for="price4">500</label><br/>
            
            ชื่อยู่ : 
            <input type="text" name="modelName" value="<%= shop.getModelName()%>"><br>
            
            เบอร์:
            <input type="text" name="phone" value="<%= shop.getPhone()%>"> <br/>
            <input type="submit" value="แก้ไข">
        </form>
    </body>
</html>
