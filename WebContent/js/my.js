function u(){
	var b = $("#name").val();
    $.ajax({
	  type: 'POST',
	  url: 'saySome.jhtml',
	  data: {name:b},
	  success: function(data){
		alert(data);
	  }
	});
}