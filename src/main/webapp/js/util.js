/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function getXmlHttpRequest() {
	var xhr;

	try {
		// Firefox, Opera 8.0+, Safari
		xhr = new XMLHttpRequest();
	} catch (e) {

		// Internet Explorer
		try {
			xhr = new ActiveXObject("Msxml2.XMLHTTP");
		} catch (e) {

			try {
				xhr = new ActiveXObject("Microsoft.XMLHTTP");
			} catch (e) {
				alert("Your browser doesn't support AJAX");
				return false;
			}
		}
	}
	return xhr;
}