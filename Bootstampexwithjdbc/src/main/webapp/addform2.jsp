<!DOCTYPE html>
<html>
<head>
   <title>product list</title>
     <!--Bootstamp CDN link to get the support of bootstamp-->
        <link rel="stylesheet"
href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">     
  <!--This is java script validate code location-->
    <script src="FormValidation.js"></script>
</head>


<body>
	<div class="container mb-5 text-center">
	    <h2 class="text-center font-italic mb-1">Edit Product data......</h2>
	    <form method="post"	action="./UpdateProductServlet" enctype="multipart/form-data" onsubmit="return validateForm()">
			
			<div class="form-group">
				<label class="font-italic font-weight-bold" for="proId">Product Id:</label>
				<input type="text" class="form-control-sm" id="proId"  name="proId" value="${editproduct.proId}"required/>
			</div>
			
			
			<div class="form-group">
				<label class="font-italic font-weight-bold" for="proName">Product Name:</label>
				<input type="text" class="form-control-sm" id="proName"   name="proName" value="${editproduct.proName}"required/>
			</div>
			
			
			<div class="form-group">
				<label class="font-italic font-weight-bold" for="proPrice">Product Price:</label>
				<input type="number" class="form-control-sm" id="proPrice"   name="proPrice" value="${editproduct.proPrice}"required/>
			</div>
			
			
			<div class="form-group">
				<label class="font-italic font-weight-bold" for="proBand">Product Band:</label>
				<input type="text" class="form-control-sm" id="proBand"   name="proBand" value="${editproduct.proBand}" required/>
			</div>
			
			
			<div class="form-group">
				<label class="font-italic font-weight-bold" for="proMade">Product Made:</label>
				<input type="text" class="form-control-sm" id="proMade"  name="proMade"  value="${editproduct.proMade}"required/>
			</div>
			
			
			<div class="form-group">
				<label class="font-italic font-weight-bold" for="proMdate">Product Mdate:</label>
				<input type="date" class="form-control-sm" id="proMdate" name="proMdate" value="${editproduct.proMdate}" required/>
			</div>
			
			
			<div class="form-group">
				<label class="font-italic font-weight-bold" for="proExdate">Product Exdate:</label>
				<input type="date" class="form-control-sm" id="proExdate"   name="proExdate" value="${editproduct.proExdate}" required/>
			</div>
			
			
			<div class="form-group">
				<label class="font-italic font-weight-bold" for="proImage">Product Image:</label>
				<input type="file" class="form-control-file-sm" id="proImage"   name="proImage" accept="image/*" value="${editproduct.proImage}"/>
			</div>
			
			<div>
			     <input type="submit" class="btn btn-success" value="update product">
			</div>
				
		</form>		
	</div>
</body>
</html>