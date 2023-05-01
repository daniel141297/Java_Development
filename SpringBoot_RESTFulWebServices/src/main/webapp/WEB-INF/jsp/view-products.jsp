<!DOCTYPE html>
<html>
   <head>
      <meta charset = "ISO-8859-1"/>
      <title>View Products</title>
      <script src = "https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
      
      <script>
         $(document).ready(function(){
            $.getJSON("http://localhost:9090/products", function(result){
               $.each(result, function(key,value) {
                  $("#productsJson").append(value.id+" "+value.name+" ");
               }); 
            });
         });
      </script>
   </head>
   
   <body>
      <div id = "productsJson"> </div>
   </body>
</html>