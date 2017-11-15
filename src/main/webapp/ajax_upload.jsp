<%--
  Created by IntelliJ IDEA.
  User: liyangli
  Date: 2017/11/14
  Time: 上午12:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ajax_upload</title>
    <script src="js/jquery-3.2.1.min%20.js"></script>
    <script type="text/javascript">
        $(function(){
           $("#btn").click(function(){
               var formData = new FormData();
               formData.append("file",$("#file")[0].files[0]);
               $.ajax({
                   url: "/ajaxUpload",
                   method: "POST",
                   data: formData,
                   contentType: "multipart/form-data", // 注意这里应设为false
                   processData: false,
                   cache: false,
                   success: function(data){
                       alert(data.desc);
                       console.info("success-->"+data);
                   },
                   error: function(err,status){
                       console.info(this.arguments);
                       console.info("err->>"+err);
                   }
               });



           });
        });
    </script>
</head>
<body>
    <form id="ajaxForm">
        <input type="file" name="file" id="file"/>
        <input type="button" id="btn" value="提交"/>
    </form>
</body>
</html>
