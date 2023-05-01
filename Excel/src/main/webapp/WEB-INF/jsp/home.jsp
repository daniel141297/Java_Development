<html>
<head>
<title>Excel Data Insert</title>
<style>
body{
    background: -webkit-linear-gradient(left, #0072ff, #00c6ff);
}
.contact-form{
    background: #fff;
    margin-top: 10%;
    margin-bottom: 5%;
    width: 70%;
}
.contact-form .form-control{
    border-radius:1rem;
}
.contact-image{
    text-align: center;
}
.contact-image img{
    border-radius: 6rem;
    width: 11%;
    margin-top: -3%;
    transform: rotate(29deg);
}
.contact-form form{
    padding: 14%;
}
.contact-form form .row{
    margin-bottom: -7%;
}
.contact-form h3{
    margin-bottom: 8%;
    margin-top: -10%;
    text-align: center;
    color: #0062cc;
}
.contact-form .btnContact {
    width: 50%;
    border: none;
    border-radius: 1rem;
    padding: 1.5%;
    background: #dc3545;
    font-weight: 600;
    color: #fff;
    cursor: pointer;
}
.btnContactSubmit
{
    width: 50%;
    border-radius: 1rem;
    padding: 1.5%;
    color: #fff;
    background-color: #0062cc;
    border: none;
    cursor: pointer;
}
</style>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">

</head>
<body>
<div class="container contact-form">
          
            <form action="#" method="post" enctype="multipart/form-data" onsubmit="return validate()">
                <h3>Home Page</h3>
               <div class="row">
                    <div class="col-md-12">
                        <div class="form-group">
						<label>Template Id</label>
                            <input type="text" name="tempid" id="tempid" class="form-control" placeholder="Enter Template Id"  />
                        </div>
                        <div class="form-group">
						<label>No Of  Parameter</label>
                            <select name="param" id="param">
								<option value="0">0</option>
								<option value="1">1</option>
								<option value="2">2</option>
								<option value="3">3</option>
								<option value="4">4</option>
								<option value="5">5</option>
								<option value="6">6</option>
								<option value="7">7</option>
								<option value="8">8</option>
								<option value="9">9</option>
							  </select>  
					       </div>
                        <div class="form-group">
						<label>Upload the Excel Sheet</label>
                            <input type="file" name="excel_file" id="excel_file" class="form-control" placeholder="Your Phone Number *"  />
                        </div>
                        <div class="form-group">
                            <button type="button" class="btn btn-primary pull-right" id="upload">Submit</button>
                        </div>
                    </div>
                   
                </div>
            </form>
</div>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script>
/* function validate(){
	var tempid=document.getElementById("tempid").value;
	var param=document.getElementById("param").value;
	var file=document.getElementById("file").value;
	if(tempid==null || tempid ==""){
		alert("Please Enter the Template Id");
		return false;
	}if(param==null || param ==""){
		alert("Please Enter the No of Parameter");
		return false;
	}
	if (!(/\.(xlsx|xls|xlsm)$/i).test(file)) {
	    alert('Please upload valid excel file .xlsx, .xlsm, .xls only.');
	    return false;
	}
	
	 var gfg = new FormData();
	
} */

$("#upload").on("click", function () {
    var url = "import_excel";

    var tempid = $('#tempid').val();
    var param = $('#param').val();

    var excel_file = $('#excel_file').val();
    if (excel_file == null || excel_file == "")
    {
        alert("Please select the Excel File and then click upload button");
        return false;
    }

    if ($('#excel_file')[0].files[0].size > 153600) { // 2 MB
        alert(" Maximum is 150 kb size allowed");
        return false;
    } else if (!(/\.(xlsx|xls|xlsm)$/i).test(excel_file)) {
	    alert('Please upload valid excel file .xlsx, .xlsm, .xls only.');
	    return false;
	} 
    var gfg = new FormData();

    gfg.append('excel_file', $('#excel_file')[0].files[0]);
    gfg.append('excel_file_name', excel_file);
    gfg.append('tempid', tempid);
    gfg.append('param', param);
    $("#upload").prop("disabled", true);
    $.ajax({
        type: "POST",
        //encType : "multipart/form-data",
        url: url,
        data: gfg,
        async: false,
        processData: false,
        contentType: false,
        cache: false,

        success: function (status) {
           
          
            if (status == true) {
                alert("File has been uploaded successfully");
                $("#upload").prop("disabled", false);
               
               
                
               
            } else {
                alert("Couldn't upload the file");
                $("#upload").prop("disabled", false);
            }
        },
        error: function (msg) {
            alert("Couldn't upload the file");
            $("#upload").prop("disabled", false);
        }
    });
});
</script>
</body>
</html>