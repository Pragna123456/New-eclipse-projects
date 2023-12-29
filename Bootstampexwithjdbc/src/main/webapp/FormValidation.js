function validateForm() {
  var proId = document.getElementById("proId").value;
  var proName = document.getElementById("proName").value;
  var proPrice = document.getElementById("proPrice").value;
  var proBand = document.getElementById("proBand").value;
  var proMade = document.getElementById("proMade").value;
  var proMdate = document.getElementById("proMdate").value;
  var proExdate = document.getElementById("proExdate").value;

  if (proId.trim() === "" || proName.trim() === "" || proPrice.trim() === "" || proBand.trim() === "" || proMade.trim() === "") {
    alert("All fields must be filled out..");
    return false;
  }

  if (parseFloat(proPrice) < 0) {
    alert("Product price must be a non-negative value.");
    return false;
  }

  if (proName.length > 50 || proBand.length > 50) {
    alert("Product name and product brand must be less than 50 characters");
    return false;
  }

  // Conversion mfgdate and expDate into date format
  var manufactureDateObj = new Date(proMdate);
  var expiryDateObj = new Date(proExdate);

  if (manufactureDateObj > expiryDateObj) {
    alert("Manufacturing date cannot be greater than expiry date.");
    return false;
  }

  return true;
}
