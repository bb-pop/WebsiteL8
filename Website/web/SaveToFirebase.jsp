<%-- 
    Document   : SaveToFirebase
    Created on : Jul 31, 2022, 9:38:38 PM
    Author     : TUF DASH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "model.Shop"  %>

<% Shop shop = (Shop) session.getAttribute("shop");%>

<!DOCTYPE html>
<html>
    <head>
        <title>Save To Firebase</title>
    </head>
    <body>
        <script src="https://www.gstatic.com/firebasejs/8.10.0/firebase-app.js"></script>
        <script src="https://www.gstatic.com/firebasejs/8.6.3/firebase-database.js"></script>
        
        <script>

            // Your web app's Firebase configuration
            var firebaseConfig = {
                apiKey: "AIzaSyA4AObuS4qoxf2NJ6-LWli076IFaRucGVU",
                authDomain: "shoppoproject.firebaseapp.com",
                databaseURL: "https://shoppoproject-default-rtdb.firebaseio.com",
                projectId: "shoppoproject",
                storageBucket: "shoppoproject.appspot.com",
                messagingSenderId: "115500079924",
                appId: "1:115500079924:web:b07818d848a9630a08e361"
            };

            // Initialize Firebase
            firebase.initializeApp(firebaseConfig);
        </script>
        <h1>Test Firebase 'Shop' connection</h1>

        <p>
            <input type="button" value="Save" Onclick="save_shop();" />
        </p>

        <script>
            var databaseRef = firebase.database().ref('shop/');

            function save_shop() {
                var uid = firebase.database().ref().child('shop').push().key;

                var data = {
                    shop_id: uid,
                    shop_name: 'ดีเลิศ',
                    shop_color: 'ชมพู',
                    shop_size: 'L',
                    shop_phone: '0938455215'
                };

                var updates = {};   
                updates['/shop/' + uid] = data;
                firebase.database().ref().update(updates);

                alert('Shop is created successfully!');
                reload_page();
            }

            function reload_page() {
                window.location.reload();
            }

        </script>
    </body>
</html>