function bill(){

price_f = document.getElementById("price").value;
gst_f = document.getElementById("gst").value;
price_main = document.getElementById("price_p").value;
gst_main = document.getElementById("gst_p").value;
gst_amount_f = document.getElementById("gst_amount_p").value;
final_total_f = document.getElementById("final_total_p").value; 


price_f = +price_f;
gst_f = +gst_f;

switch(gst_f){
case 12 :
price_main.innerHtml = price_f;
gst_main.innerHtml = gst_f;
gst_amount_f =price_f*gst_f/100;
gst_amount_f = gst_amount_p;
final_total_f = gst_amount_p+price_f
break;

default : alert("please select gst")








}







}