<%-- 
    Document   : index
    Created on : Aug 2, 2018, 3:04:37 PM
    Author     : Aregawi
--%>

<%@page import="gen.Irregular"%>
<%@page import="gen.generate" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="http://netdna.bootstrapcdn.com/bootstrap/3.0.3/css/bootstrap.min.css">
<link rel="stylesheet" href="http://netdna.bootstrapcdn.com/bootstrap/3.0.3/css/bootstrap-theme.min.css">
<script type="text/javascript" src="http://code.jquery.com/jquery.min.js"></script>
<script src="http://netdna.bootstrapcdn.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>

<link rel="stylesheet" type="text/css" href="default-style.css" />
 <title>Ge'ezMorphGenerator</title>
<style type="text/css">
h5{
    margin: 0;     
    color: #000000;
    padding-top: 90px;
    font-size: 23px;
    font-family: "trebuchet ms", sans-serif;    
}
.item{
    background: #333000;    
    text-align: center;
    height: 150px !important;
}
.carousel{
    margin-top: 20px;
}
.bs-example{
	margin: 20px;
}
</style>
       
            <script type="text/javascript">

                    function valid_form()
            {
                if(document.form_insert.stem.value == "")
                    {
                        alert("እባክዎ አርእስተ ግስ ያስገቡ/please enter infinitive verb form like ቀቲል፣ፈቂድ..../");
                        return false;
                    }
                if(document.form_insert.stemType.value == "")
                    {
                        alert("እባክዎ አምደ ግስ ይምረጡ/Please select Stem type");
                        return false;
                    }
                     if(document.form_insert.png.value == "")
                    {
                        alert("እባክዎ መራሄ ግስ ይምረጡ/Please select PNG");
                        return false;
                    }
                 return true;
            }
            function clear()
            {
                first.value = "";
                last.value = "";
                address.value = "";
                dep.value = "";
                section.value = "";
                age.value = "";
                year.value = "";
            }
            </script>
</head>

<body id="body"> 
<table id="whole">
   <tr>
      
       <td id="moto"><h1>አርባሔ ግስ ዘልሳነ ግእዝ Ge'ez Morphological Synthesizer</h1></td></tr>
   
 <tr><td colspan="3" id="header_menu">
        
		<a href="index.html">Home</a>
		  <a href="help.jsp">Help</a>
		
		
    </td></tr>
   <tr>
 
   <td id="L_menu" colspan="3">
                        <form name="form_insert" action="index.jsp" method="post" onsubmit="return valid_form();">
                        <table border="0" align="center">
                            <tr><td colspan="5"></td>
                              <tr>
                                   <td class="lbl_txt"> ኣግብእ አርእስተ ግስ /Enter Infinitive Verb Form/:</td>
                                   <td><input type="text" name="stem"  class="txt"  value="" /></td>
                               </tr>   
                            <tr>
                                   <td class="lbl_txt">ኅረይ አምደ ግስ /Select Verb Stem/ :</td>
                                   <td><select name="stemType" class="txt" />
                                            <option>
                                             <option>  ገቢር/perfective/
                                               <option>ተገብሮ/reflexive/
                                                 <option>አግብሮ/causative/
                                                    <option>ተጋብሮ/reciprocal/
                                                    <option>አስተጋብሮ/causative-reciprocal/
                                                 </select></td>
                                   <tr><td class="lbl_txt">ኅረይ መራሄ ግስ/Enter PNG/
                                       <td><select  name="png" class="txt"  value=""/>
                                             <option>
                                            <option>ውእቱ/He/                   
                                            <option>ይእቲ/She/
                                            <option>ውእቶሙ/They(3ppm)/
                                            <option>ውእቶን/They(3ppf)/
                                            <option>አንተ/You(2psm)/
                                            <option>አንቲ/You(2psf)/
                                            <option>አንትሙ/You(2ppm)/
                                            <option>አንትን/You(2ppf)/
                                            <option>አነ/I/
                                            <option>ንሕነ/We/
                                              </select>       </td>
                                 </tr>
                     
                        <tr>
                                 <td colspan="1">   <td>
                                       <input type="submit" name="generate" value="አርብሕ" class="btn" />
                                   </td>
                                   <td>
                                       <input type="reset" value="Reset" name="reset"  class="btn" onclick="return clear();" />
                                   </td> 
                               </tr>
                              
             <jsp:useBean id="index" class="gen.generate"/>
             <jsp:useBean id="test" class="gen.Irregular"/>
            <%
               request.setCharacterEncoding("UTF-8");
               Irregular gg=new Irregular();
                generate g= new generate();
                String ste=request.getParameter("stem");
                String stemType=request.getParameter("stemType");
                String png=request.getParameter("png");
                g.ExeMethod(ste, stemType, png);
                gg.createStem13(ste, stemType, png);
                String salis[]={"ሂ","ሊ","ሒ","ሚ","ሢ","ሪ","ሲ","ቂ","ቢ","ቲ","ኒ","ኂ","ኢ","ኪ","ዊ","ዒ","ዚ","ዪ","ዲ","ጊ","ጢ","ጲ","ጺ","ፂ","ፊ","ፒ","ኊ","ቊ","ጒ","ኲ"};
                String sadis[]={"ህ","ል","ሕ","ም","ሥ","ር","ስ","ቅ","ብ","ት","ን","ኅ","እ","ክ","ው","ዕ","ዝ","ይ","ድ","ግ","ጥ","ጵ","ጽ","ፅ","ፍ","ፕ","ኊ","ቚ","ጒ","ኲ"};
String ss=null;

String ss1 =null;
for (int i =0; i<salis.length; i++){
if(ste.substring(1,2).equals(salis[i])){
ss =sadis[i];
}}
for (int i= 0; i<salis.length; i++)
{
if(ste.substring(2,3).equals(sadis[i])){
ss1= sadis[i];
}}
               %>
                  
      <%
          for (int i =0; i<salis.length; i++){
               for (int j=0; j<sadis.length; j++){
        if(ste.substring(1,2).equals(salis[i])&&ste.substring(2,3).equals(sadis[j])){
                if(!ste.contains("ዊ")&&!ste.contains("ዪ")&&!ste.endsWith("ው")&&!ste.endsWith("ይ")&&!ste.substring(1,2).equals("ሂ")&&!ste.contains("ኢ")&&!ste.contains("ሒ")&&!ste.contains("ኂ")&&!ste.contains("ዒ")&&ste.charAt(2)!='ክ'&&ste.charAt(2)!='ቅ'&&ste.charAt(2)!='ግ'&&!ste.contains("ወ")){
            %>
            
            <table class ="app_table" align="center">
                <tr > <th colspan="12"><b> ግስ፡ &nbsp;<% out.print(g.ሓላፊ); %> &nbsp;  አምደ ግስ፡&nbsp; <% out.print(stemType);  %> &nbsp; መራሄ ግስ፡ &nbsp; <% out.print(png); %>  &nbsp;   ርባታ ውጤቶች
             <tr > <th>  አንቀጸ ግስ<th> ዋና ግስ<th>ሊተ <th>ለነ<th>ለከ<th>ለኪ<th>ለክሙ<th>ለክን<th>ሎቱ<th>ሎሙ<th>ላቲ<th>ሎን</tr>
                <tr><td><b> ሐላፊ ዓንቀጽ 
                  <td> <% out.println(g.ገቢር);%>
                     <td> <% out.println(g.ሊተ);%>
                     <td> <% out.println(g.ለነ);%>    
                     <td> <% out.println(g.ለከ);%>
                     <td> <% out.println(g.ለኪ);%>
                     <td> <% out.println(g.ለክሙ);%>
                     <td> <% out.println(g.ለክን);%>
                     <td> <% out.println(g.ሎቱ);%>
                     <td> <% out.println(g.ሎሙ);%>
                     <td> <% out.println(g.ላቲ);%>
                     <td> <% out.println(g.ሎን);%>
  
                     <tr><td> <b>ትንቢት ዓንቀጽ 
                  <td> <% out.println(g.ትንቢት);%>
                     <td> <% out.println(g.ሊተ_ት);%>
                     <td> <% out.println(g.ለነ_ት);%>    
                     <td> <% out.println(g.ለከ_ት);%>
                     <td> <% out.println(g.ለኪ_ት);%>
                     <td> <% out.println(g.ለክሙ_ት);%>
                     <td> <% out.println(g.ለክን_ት);%>
                     <td> <% out.println(g.ሎቱ_ት);%>
                     <td> <% out.println(g.ሎሙ_ት);%>
                     <td> <% out.println(g.ላቲ_ት);%>
                     <td> <% out.println(g.ሎን_ት);%>
                          <tr><td> <b>ምክንያታዊ(ዘንድ) ዓንቀጽ 
                  <td> <% out.println(g.ምክንያታዊ);%>
                     <td> <% out.println(g.ሊተ_ም);%>
                     <td> <% out.println(g.ለነ_ም);%>    
                     <td> <% out.println(g.ለከ_ም);%>
                     <td> <% out.println(g.ለኪ_ም);%>
                     <td> <% out.println(g.ለክሙ_ም);%>
                     <td> <% out.println(g.ለክን_ም);%>
                     <td> <% out.println(g.ሎቱ_ም);%>
                     <td> <% out.println(g.ሎሙ_ም);%>
                     <td> <% out.println(g.ላቲ_ም);%>
                     <td> <% out.println(g.ሎን_ም);%>
                                <tr><td> <b>ትእዛዝ ዓንቀጽ (ሩቅ) 
                  <td> <% out.println(g.ትእዛዝ);%>
                     <td> <% out.println(g.ሊተ_ትእ);%>
                     <td> <% out.println(g.ለነ_ትእ);%>    
                     <td> <% out.println(g.ለከ_ትእ);%>
                     <td> <% out.println(g.ለኪ_ትእ);%>
                     <td> <% out.println(g.ለክሙ_ትእ);%>
                     <td> <% out.println(g.ለክን_ትእ);%>
                     <td> <% out.println(g.ሎቱ_ትእ);%>
                     <td> <% out.println(g.ሎሙ_ትእ);%>
                     <td> <% out.println(g.ላቲ_ትእ);%>
                     <td> <% out.println(g.ሎን_ትእ);%>
                <tr>
                    <td> <b>ቦዝ ዓንቀጽ<td colspan="11"> <% out.println(g.ቦዝ);%>
                         <tr>
                    <td> <b>አርእስት ዓንቀጽ<td colspan="11"> <% out.println(g.አርእስት+" "+g.አርእስት1);%>
                         <tr>
                    <td> <b>ሳድስ ቅጽል <td colspan="11"> <% out.println(g.ሳድስቅጽል+" "+g.ሳድስቅጽል1);%>
                          <tr>
                    <td> <b>ሳልስ ቅጽል <td colspan="11"> <% out.println(g.ሳልስቅጽል4+" "+g.ሳልስቅጽል+" "+g.ሳልስቅጽል1+" "+g.ሳልስቅጽል2+" "+g.ሳልስቅጽል3);%>
                          <tr>
                    <td> <b>ሳቢ ዘር ዓንቀጽ <td colspan="11"> <% out.println(g.ሳቢዘር);%><% }}}}
                if(ste.contains("ዊ")&&!ste.endsWith("ው")){
            %>
            
            <table class ="app_table" align="center">
                <tr> <th class="menu" colspan="12"> ግስ፡ &nbsp;<% out.print(g.ሓላፊ); %> &nbsp;  አምደ ግስ፡&nbsp; <% out.print(stemType);  %> &nbsp; መራሄ ግስ፡ &nbsp; <% out.print(png); %>  &nbsp;   ርባታ ውጤቶች
             <tr class="menu"> <th>  አንቀጸ ግስ<th> ዋና ግስ<th>ሊተ <th>ለነ<th>ለከ<th>ለኪ<th>ለክሙ<th>ለክን<th>ሎቱ<th>ሎሙ<th>ላቲ<th>ሎን</tr>
                <tr><td> ሐላፊ ዓንቀጽ 
                  <td> <% out.println(g.ገቢር);%>
                     <td> <% out.println(g.ሊተ);%>
                     <td> <% out.println(g.ለነ);%>    
                     <td> <% out.println(g.ለከ);%>
                     <td> <% out.println(g.ለኪ);%>
                     <td> <% out.println(g.ለክሙ);%>
                     <td> <% out.println(g.ለክን);%>
                     <td> <% out.println(g.ሎቱ);%>
                     <td> <% out.println(g.ሎሙ);%>
                     <td> <% out.println(g.ላቲ);%>
                     <td> <% out.println(g.ሎን);%>
  
                     <tr><td> ትንቢት ዓንቀጽ 
                  <td> <% out.println(g.ትንቢት);%>
                     <td> <% out.println(g.ሊተ_ት);%>
                     <td> <% out.println(g.ለነ_ት);%>    
                     <td> <% out.println(g.ለከ_ት);%>
                     <td> <% out.println(g.ለኪ_ት);%>
                     <td> <% out.println(g.ለክሙ_ት);%>
                     <td> <% out.println(g.ለክን_ት);%>
                     <td> <% out.println(g.ሎቱ_ት);%>
                     <td> <% out.println(g.ሎሙ_ት);%>
                     <td> <% out.println(g.ላቲ_ት);%>
                     <td> <% out.println(g.ሎን_ት);%>
                          <tr><td> ምክንያታዊ(ዘንድ) ዓንቀጽ 
                  <td> <% out.println(g.ምክንያታዊ);%>
                     <td> <% out.println(g.ሊተ_ም);%>
                     <td> <% out.println(g.ለነ_ም);%>    
                     <td> <% out.println(g.ለከ_ም);%>
                     <td> <% out.println(g.ለኪ_ም);%>
                     <td> <% out.println(g.ለክሙ_ም);%>
                     <td> <% out.println(g.ለክን_ም);%>
                     <td> <% out.println(g.ሎቱ_ም);%>
                     <td> <% out.println(g.ሎሙ_ም);%>
                     <td> <% out.println(g.ላቲ_ም);%>
                     <td> <% out.println(g.ሎን_ም);%>
                                <tr><td> ትእዛዝ ዓንቀጽ (ሩቅ) 
                  <td> <% out.println(g.ትእዛዝ);%>
                     <td> <% out.println(g.ሊተ_ትእ);%>
                     <td> <% out.println(g.ለነ_ትእ);%>    
                     <td> <% out.println(g.ለከ_ትእ);%>
                     <td> <% out.println(g.ለኪ_ትእ);%>
                     <td> <% out.println(g.ለክሙ_ትእ);%>
                     <td> <% out.println(g.ለክን_ትእ);%>
                     <td> <% out.println(g.ሎቱ_ትእ);%>
                     <td> <% out.println(g.ሎሙ_ትእ);%>
                     <td> <% out.println(g.ላቲ_ትእ);%>
                     <td> <% out.println(g.ሎን_ትእ);%>
                <tr>
                    <td> ቦዝ ዓንቀጽ<td colspan="11"> <% out.println(g.ቦዝ);%>
                         <tr>
                    <td> አርእስት ዓንቀጽ<td colspan="11"> <% out.println(g.አርእስት+" "+g.አርእስት1);%>
                         <tr>
                    <td> ሳድስ ቅጽል <td colspan="11"> <% out.println(g.ሳድስቅጽል+" "+g.ሳድስቅጽል1);%>
                          <tr>
                    <td> ሳልስ ቅጽል <td colspan="11"> <% out.println(g.ሳልስቅጽል4+" "+g.ሳልስቅጽል+" "+g.ሳልስቅጽል1+" "+g.ሳልስቅጽል2+" "+g.ሳልስቅጽል3);%>
                          <tr>
                    <td> ሳቢ ዘር ዓንቀጽ <td colspan="11"> <% out.println(g.ሳቢዘር);%><% }

             else if(ste.substring(2,3).equals("ክ") ||ste.substring(2,3).equals("ቅ")||ste.substring(2,3).equals("ግ")){
            %>
            <table border="1" bgcolor="" align="center">
                <tr> <th class="menu" colspan="12"> ግስ፡ &nbsp;<% out.print(gg.ሓላፊ); %> &nbsp;  አምደ ግስ፡&nbsp; <% out.print(stemType);  %> &nbsp; መራሄ ግስ፡ &nbsp; <% out.print(png); %>  &nbsp;   ርባታ ውጤቶች
             <tr class="menu"> <th>  አንቀጸ ግስ<th> ዋና ግስ<th>ሊተ <th>ለነ<th>ለከ<th>ለኪ<th>ለክሙ<th>ለክን<th>ሎቱ<th>ሎሙ<th>ላቲ<th>ሎን</tr>
                <tr><td> ሐላፊ ዓንቀጽ 
                  <td> <% out.println(gg.ገቢር);%>
                     <td> <% out.println(gg.ሊተ);%>
                     <td> <% out.println(gg.ለነ);%>    
                     <td> <% out.println(gg.ለከ);%>
                     <td> <% out.println(gg.ለኪ);%>
                     <td> <% out.println(gg.ለክሙ);%>
                     <td> <% out.println(gg.ለክን);%>
                     <td> <% out.println(gg.ሎቱ);%>
                     <td> <% out.println(gg.ሎሙ);%>
                     <td> <% out.println(gg.ላቲ);%>
                     <td> <% out.println(gg.ሎን);%>
  
                     <tr><td> ትንቢት ዓንቀጽ 
                  <td> <% out.println(gg.ትንቢት);%>
                     <td> <% out.println(gg.ሊተ_ት);%>
                     <td> <% out.println(gg.ለነ_ት);%>    
                     <td> <% out.println(gg.ለከ_ት);%>
                     <td> <% out.println(gg.ለኪ_ት);%>
                     <td> <% out.println(gg.ለክሙ_ት);%>
                     <td> <% out.println(gg.ለክን_ት);%>
                     <td> <% out.println(gg.ሎቱ_ት);%>
                     <td> <% out.println(gg.ሎሙ_ት);%>
                     <td> <% out.println(gg.ላቲ_ት);%>
                     <td> <% out.println(gg.ሎን_ት);%>
                          <tr><td> ምክንያታዊ(ዘንድ) ዓንቀጽ 
                  <td> <% out.println(gg.ምክንያታዊ);%>
                     <td> <% out.println(gg.ሊተ_ም);%>
                     <td> <% out.println(gg.ለነ_ም);%>    
                     <td> <% out.println(gg.ለከ_ም);%>
                     <td> <% out.println(gg.ለኪ_ም);%>
                     <td> <% out.println(gg.ለክሙ_ም);%>
                     <td> <% out.println(gg.ለክን_ም);%>
                     <td> <% out.println(gg.ሎቱ_ም);%>
                     <td> <% out.println(gg.ሎሙ_ም);%>
                     <td> <% out.println(gg.ላቲ_ም);%>
                     <td> <% out.println(gg.ሎን_ም);%>
                                <tr><td> ትእዛዝ ዓንቀጽ (ሩቅ) 
                  <td> <% out.println(gg.ትእዛዝ);%>
                     <td> <% out.println(gg.ሊተ_ትእ);%>
                     <td> <% out.println(gg.ለነ_ትእ);%>    
                     <td> <% out.println(gg.ለከ_ትእ);%>
                     <td> <% out.println(gg.ለኪ_ትእ);%>
                     <td> <% out.println(gg.ለክሙ_ትእ);%>
                     <td> <% out.println(gg.ለክን_ትእ);%>
                     <td> <% out.println(gg.ሎቱ_ትእ);%>
                     <td> <% out.println(gg.ሎሙ_ትእ);%>
                     <td> <% out.println(gg.ላቲ_ትእ);%>
                     <td> <% out.println(gg.ሎን_ትእ);%>
                <tr>
                    <td> ቦዝ ዓንቀጽ<td colspan="11"> <% out.println(gg.ቦዝ);%>
                         <tr>
                    <td> አርእስት ዓንቀጽ<td colspan="11"> <% out.println(gg.አርእስት+" "+gg.አርእስት1);%>
                         <tr>
                    <td> ሳድስ ቅጽል <td colspan="11"> <% out.println(gg.ሳድስቅጽል+" "+gg.ሳድስቅጽል1);%>
                          <tr>
                    <td> ሳልስ ቅጽል <td colspan="11"> <% out.println(gg.ሳልስቅጽል4+" "+gg.ሳልስቅጽል+" "+gg.ሳልስቅጽል1+" "+gg.ሳልስቅጽል2+" "+gg.ሳልስቅጽል3);%>
                          <tr>
                    <td> ሳቢ ዘር ዓንቀጽ <td colspan="11"> <% out.println(gg.ሳቢዘር);%><% }
                     else  if(ste.substring(1,2).equals("ሂ") ||ste.substring(1,2).equals("ሒ")||ste.substring(1,2).equals("ኢ")||ste.substring(1,2).equals("ዒ")||ste.substring(1,2).equals("ኂ")){ 
            %>
            <table border="1" bgcolor="" align="center">
                <tr> <th class="menu" colspan="12"> ግስ፡ &nbsp;<% out.print(gg.ሓላፊ); %> &nbsp;  አምደ ግስ፡&nbsp; <% out.print(stemType);  %> &nbsp; መራሄ ግስ፡ &nbsp; <% out.print(png); %>  &nbsp;   ርባታ ውጤቶች
             <tr class="menu"> <th>  አንቀጸ ግስ<th> ዋና ግስ<th>ሊተ <th>ለነ<th>ለከ<th>ለኪ<th>ለክሙ<th>ለክን<th>ሎቱ<th>ሎሙ<th>ላቲ<th>ሎን</tr>
                <tr><td> ሐላፊ ዓንቀጽ 
                  <td> <% out.println(gg.ገቢር);%>
                     <td> <% out.println(gg.ሊተ);%>
                     <td> <% out.println(gg.ለነ);%>    
                     <td> <% out.println(gg.ለከ);%>
                     <td> <% out.println(gg.ለኪ);%>
                     <td> <% out.println(gg.ለክሙ);%>
                     <td> <% out.println(gg.ለክን);%>
                     <td> <% out.println(gg.ሎቱ);%>
                     <td> <% out.println(gg.ሎሙ);%>
                     <td> <% out.println(gg.ላቲ);%>
                     <td> <% out.println(gg.ሎን);%>
  
                     <tr><td> ትንቢት ዓንቀጽ 
                  <td> <% out.println(gg.ትንቢት);%>
                     <td> <% out.println(gg.ሊተ_ት);%>
                     <td> <% out.println(gg.ለነ_ት);%>    
                     <td> <% out.println(gg.ለከ_ት);%>
                     <td> <% out.println(gg.ለኪ_ት);%>
                     <td> <% out.println(gg.ለክሙ_ት);%>
                     <td> <% out.println(gg.ለክን_ት);%>
                     <td> <% out.println(gg.ሎቱ_ት);%>
                     <td> <% out.println(gg.ሎሙ_ት);%>
                     <td> <% out.println(gg.ላቲ_ት);%>
                     <td> <% out.println(gg.ሎን_ት);%>
                          <tr><td> ምክንያታዊ(ዘንድ) ዓንቀጽ 
                  <td> <% out.println(gg.ምክንያታዊ);%>
                     <td> <% out.println(gg.ሊተ_ም);%>
                     <td> <% out.println(gg.ለነ_ም);%>    
                     <td> <% out.println(gg.ለከ_ም);%>
                     <td> <% out.println(gg.ለኪ_ም);%>
                     <td> <% out.println(gg.ለክሙ_ም);%>
                     <td> <% out.println(gg.ለክን_ም);%>
                     <td> <% out.println(gg.ሎቱ_ም);%>
                     <td> <% out.println(gg.ሎሙ_ም);%>
                     <td> <% out.println(gg.ላቲ_ም);%>
                     <td> <% out.println(gg.ሎን_ም);%>
                                <tr><td> ትእዛዝ ዓንቀጽ (ሩቅ) 
                  <td> <% out.println(gg.ትእዛዝ);%>
                     <td> <% out.println(gg.ሊተ_ትእ);%>
                     <td> <% out.println(gg.ለነ_ትእ);%>    
                     <td> <% out.println(gg.ለከ_ትእ);%>
                     <td> <% out.println(gg.ለኪ_ትእ);%>
                     <td> <% out.println(gg.ለክሙ_ትእ);%>
                     <td> <% out.println(gg.ለክን_ትእ);%>
                     <td> <% out.println(gg.ሎቱ_ትእ);%>
                     <td> <% out.println(gg.ሎሙ_ትእ);%>
                     <td> <% out.println(gg.ላቲ_ትእ);%>
                     <td> <% out.println(gg.ሎን_ትእ);%>
                <tr>
                    <td> ቦዝ ዓንቀጽ<td colspan="11"> <% out.println(gg.ቦዝ);%>
                         <tr>
                    <td> አርእስት ዓንቀጽ<td colspan="11"> <% out.println(gg.አርእስት+" "+gg.አርእስት1);%>
                         <tr>
                    <td> ሳድስ ቅጽል <td colspan="11"> <% out.println(gg.ሳድስቅጽል+" "+gg.ሳድስቅጽል1);%>
                          <tr>
                    <td> ሳልስ ቅጽል <td colspan="11"> <% out.println(gg.ሳልስቅጽል4+" "+gg.ሳልስቅጽል+" "+gg.ሳልስቅጽል1+" "+gg.ሳልስቅጽል2+" "+gg.ሳልስቅጽል3);%>
                          <tr>
                    <td> ሳቢ ዘር ዓንቀጽ <td colspan="11"> <% out.println(gg.ሳቢዘር);%><% }
                     else   if((ste.substring(0,1).equals("ወ")&&ste.substring(2,3).equals("ይ"))){ 
            %>
            <table border="1" bgcolor="" align="center">
                <tr> <th class="menu" colspan="12"> ግስ፡ &nbsp;<% out.print(gg.ሓላፊ); %> &nbsp;  አምደ ግስ፡&nbsp; <% out.print(stemType);  %> &nbsp; መራሄ ግስ፡ &nbsp; <% out.print(png); %>  &nbsp;   ርባታ ውጤቶች
             <tr class="menu"> <th>  አንቀጸ ግስ<th> ዋና ግስ<th>ሊተ <th>ለነ<th>ለከ<th>ለኪ<th>ለክሙ<th>ለክን<th>ሎቱ<th>ሎሙ<th>ላቲ<th>ሎን</tr>
                <tr><td> ሐላፊ ዓንቀጽ 
                  <td> <% out.println(gg.ገቢር);%>
                     <td> <% out.println(gg.ሊተ);%>
                     <td> <% out.println(gg.ለነ);%>    
                     <td> <% out.println(gg.ለከ);%>
                     <td> <% out.println(gg.ለኪ);%>
                     <td> <% out.println(gg.ለክሙ);%>
                     <td> <% out.println(gg.ለክን);%>
                     <td> <% out.println(gg.ሎቱ);%>
                     <td> <% out.println(gg.ሎሙ);%>
                     <td> <% out.println(gg.ላቲ);%>
                     <td> <% out.println(gg.ሎን);%>
  
                     <tr><td> ትንቢት ዓንቀጽ 
                  <td> <% out.println(gg.ትንቢት);%>
                     <td> <% out.println(gg.ሊተ_ት);%>
                     <td> <% out.println(gg.ለነ_ት);%>    
                     <td> <% out.println(gg.ለከ_ት);%>
                     <td> <% out.println(gg.ለኪ_ት);%>
                     <td> <% out.println(gg.ለክሙ_ት);%>
                     <td> <% out.println(gg.ለክን_ት);%>
                     <td> <% out.println(gg.ሎቱ_ት);%>
                     <td> <% out.println(gg.ሎሙ_ት);%>
                     <td> <% out.println(gg.ላቲ_ት);%>
                     <td> <% out.println(gg.ሎን_ት);%>
                          <tr><td> ምክንያታዊ(ዘንድ) ዓንቀጽ 
                  <td> <% out.println(gg.ምክንያታዊ);%>
                     <td> <% out.println(gg.ሊተ_ም);%>
                     <td> <% out.println(gg.ለነ_ም);%>    
                     <td> <% out.println(gg.ለከ_ም);%>
                     <td> <% out.println(gg.ለኪ_ም);%>
                     <td> <% out.println(gg.ለክሙ_ም);%>
                     <td> <% out.println(gg.ለክን_ም);%>
                     <td> <% out.println(gg.ሎቱ_ም);%>
                     <td> <% out.println(gg.ሎሙ_ም);%>
                     <td> <% out.println(gg.ላቲ_ም);%>
                     <td> <% out.println(gg.ሎን_ም);%>
                                <tr><td> ትእዛዝ ዓንቀጽ (ሩቅ) 
                  <td> <% out.println(gg.ትእዛዝ);%>
                     <td> <% out.println(gg.ሊተ_ትእ);%>
                     <td> <% out.println(gg.ለነ_ትእ);%>    
                     <td> <% out.println(gg.ለከ_ትእ);%>
                     <td> <% out.println(gg.ለኪ_ትእ);%>
                     <td> <% out.println(gg.ለክሙ_ትእ);%>
                     <td> <% out.println(gg.ለክን_ትእ);%>
                     <td> <% out.println(gg.ሎቱ_ትእ);%>
                     <td> <% out.println(gg.ሎሙ_ትእ);%>
                     <td> <% out.println(gg.ላቲ_ትእ);%>
                     <td> <% out.println(gg.ሎን_ትእ);%>
                <tr>
                    <td> ቦዝ ዓንቀጽ<td colspan="11"> <% out.println(gg.ቦዝ);%>
                         <tr>
                    <td> አርእስት ዓንቀጽ<td colspan="11"> <% out.println(gg.አርእስት+" "+gg.አርእስት1);%>
                         <tr>
                    <td> ሳድስ ቅጽል <td colspan="11"> <% out.println(gg.ሳድስቅጽል+" "+gg.ሳድስቅጽል1);%>
                          <tr>
                    <td> ሳልስ ቅጽል <td colspan="11"> <% out.println(gg.ሳልስቅጽል4+" "+gg.ሳልስቅጽል+" "+gg.ሳልስቅጽል1+" "+gg.ሳልስቅጽል2+" "+gg.ሳልስቅጽል3);%>
                          <tr>
                    <td> ሳቢ ዘር ዓንቀጽ <td colspan="11"> <% out.println(gg.ሳቢዘር);%><% }
                       else     if(ste.substring(1,2).equals("ዊ")&&ste.substring(2,3).equals("ው")){
            %>
            <table border="1" bgcolor="" align="center">
                <tr> <th class="menu" colspan="12"> ግስ፡ &nbsp;<% out.print(gg.ሓላፊ); %> &nbsp;  አምደ ግስ፡&nbsp; <% out.print(stemType);  %> &nbsp; መራሄ ግስ፡ &nbsp; <% out.print(png); %>  &nbsp;   ርባታ ውጤቶች
             <tr class="menu"> <th>  አንቀጸ ግስ<th> ዋና ግስ<th>ሊተ <th>ለነ<th>ለከ<th>ለኪ<th>ለክሙ<th>ለክን<th>ሎቱ<th>ሎሙ<th>ላቲ<th>ሎን</tr>
                <tr><td> ሐላፊ ዓንቀጽ 
                  <td> <% out.println(gg.ገቢር);%>
                     <td> <% out.println(gg.ሊተ);%>
                     <td> <% out.println(gg.ለነ);%>    
                     <td> <% out.println(gg.ለከ);%>
                     <td> <% out.println(gg.ለኪ);%>
                     <td> <% out.println(gg.ለክሙ);%>
                     <td> <% out.println(gg.ለክን);%>
                     <td> <% out.println(gg.ሎቱ);%>
                     <td> <% out.println(gg.ሎሙ);%>
                     <td> <% out.println(gg.ላቲ);%>
                     <td> <% out.println(gg.ሎን);%>
  
                     <tr><td> ትንቢት ዓንቀጽ 
                  <td> <% out.println(gg.ትንቢት);%>
                     <td> <% out.println(gg.ሊተ_ት);%>
                     <td> <% out.println(gg.ለነ_ት);%>    
                     <td> <% out.println(gg.ለከ_ት);%>
                     <td> <% out.println(gg.ለኪ_ት);%>
                     <td> <% out.println(gg.ለክሙ_ት);%>
                     <td> <% out.println(gg.ለክን_ት);%>
                     <td> <% out.println(gg.ሎቱ_ት);%>
                     <td> <% out.println(gg.ሎሙ_ት);%>
                     <td> <% out.println(gg.ላቲ_ት);%>
                     <td> <% out.println(gg.ሎን_ት);%>
                          <tr><td> ምክንያታዊ(ዘንድ) ዓንቀጽ 
                  <td> <% out.println(gg.ምክንያታዊ);%>
                     <td> <% out.println(gg.ሊተ_ም);%>
                     <td> <% out.println(gg.ለነ_ም);%>    
                     <td> <% out.println(gg.ለከ_ም);%>
                     <td> <% out.println(gg.ለኪ_ም);%>
                     <td> <% out.println(gg.ለክሙ_ም);%>
                     <td> <% out.println(gg.ለክን_ም);%>
                     <td> <% out.println(gg.ሎቱ_ም);%>
                     <td> <% out.println(gg.ሎሙ_ም);%>
                     <td> <% out.println(gg.ላቲ_ም);%>
                     <td> <% out.println(gg.ሎን_ም);%>
                                <tr><td> ትእዛዝ ዓንቀጽ (ሩቅ) 
                  <td> <% out.println(gg.ትእዛዝ);%>
                     <td> <% out.println(gg.ሊተ_ትእ);%>
                     <td> <% out.println(gg.ለነ_ትእ);%>    
                     <td> <% out.println(gg.ለከ_ትእ);%>
                     <td> <% out.println(gg.ለኪ_ትእ);%>
                     <td> <% out.println(gg.ለክሙ_ትእ);%>
                     <td> <% out.println(gg.ለክን_ትእ);%>
                     <td> <% out.println(gg.ሎቱ_ትእ);%>
                     <td> <% out.println(gg.ሎሙ_ትእ);%>
                     <td> <% out.println(gg.ላቲ_ትእ);%>
                     <td> <% out.println(gg.ሎን_ትእ);%>
                <tr>
                    <td> ቦዝ ዓንቀጽ<td colspan="11"> <% out.println(gg.ቦዝ);%>
                         <tr>
                    <td> አርእስት ዓንቀጽ<td colspan="11"> <% out.println(gg.አርእስት+" "+gg.አርእስት1);%>
                         <tr>
                    <td> ሳድስ ቅጽል <td colspan="11"> <% out.println(gg.ሳድስቅጽል+" "+gg.ሳድስቅጽል1);%>
                          <tr>
                    <td> ሳልስ ቅጽል <td colspan="11"> <% out.println(gg.ሳልስቅጽል4+" "+gg.ሳልስቅጽል+" "+gg.ሳልስቅጽል1+" "+gg.ሳልስቅጽል2+" "+gg.ሳልስቅጽል3);%>
                          <tr>
                    <td> ሳቢ ዘር ዓንቀጽ <td colspan="11"> <% out.println(gg.ሳቢዘር);%><% }
                else   if(ste.substring(0,1).equals("ወ") ||ste.substring(0,1).equals("የ")&&!ste.substring(2,3).equals("ይ")&&!ste.substring(2,3).equals("ው")){////step 6
                  %>
            <table border="1" bgcolor="" align="center">
                <tr> <th class="menu" colspan="12"> ግስ፡ &nbsp;<% out.print(gg.ሓላፊ); %> &nbsp;  አምደ ግስ፡&nbsp; <% out.print(stemType);  %> &nbsp; መራሄ ግስ፡ &nbsp; <% out.print(png); %>  &nbsp;   ርባታ ውጤቶች
             <tr class="menu"> <th>  አንቀጸ ግስ<th> ዋና ግስ<th>ሊተ <th>ለነ<th>ለከ<th>ለኪ<th>ለክሙ<th>ለክን<th>ሎቱ<th>ሎሙ<th>ላቲ<th>ሎን</tr>
                <tr><td> ሐላፊ ዓንቀጽ 
                  <td> <% out.println(gg.ገቢር);%>
                     <td> <% out.println(gg.ሊተ);%>
                     <td> <% out.println(gg.ለነ);%>    
                     <td> <% out.println(gg.ለከ);%>
                     <td> <% out.println(gg.ለኪ);%>
                     <td> <% out.println(gg.ለክሙ);%>
                     <td> <% out.println(gg.ለክን);%>
                     <td> <% out.println(gg.ሎቱ);%>
                     <td> <% out.println(gg.ሎሙ);%>
                     <td> <% out.println(gg.ላቲ);%>
                     <td> <% out.println(gg.ሎን);%>
  
                     <tr><td> ትንቢት ዓንቀጽ 
                  <td> <% out.println(gg.ትንቢት);%>
                     <td> <% out.println(gg.ሊተ_ት);%>
                     <td> <% out.println(gg.ለነ_ት);%>    
                     <td> <% out.println(gg.ለከ_ት);%>
                     <td> <% out.println(gg.ለኪ_ት);%>
                     <td> <% out.println(gg.ለክሙ_ት);%>
                     <td> <% out.println(gg.ለክን_ት);%>
                     <td> <% out.println(gg.ሎቱ_ት);%>
                     <td> <% out.println(gg.ሎሙ_ት);%>
                     <td> <% out.println(gg.ላቲ_ት);%>
                     <td> <% out.println(gg.ሎን_ት);%>
                          <tr><td> ምክንያታዊ(ዘንድ) ዓንቀጽ 
                  <td> <% out.println(gg.ምክንያታዊ);%>
                     <td> <% out.println(gg.ሊተ_ም);%>
                     <td> <% out.println(gg.ለነ_ም);%>    
                     <td> <% out.println(gg.ለከ_ም);%>
                     <td> <% out.println(gg.ለኪ_ም);%>
                     <td> <% out.println(gg.ለክሙ_ም);%>
                     <td> <% out.println(gg.ለክን_ም);%>
                     <td> <% out.println(gg.ሎቱ_ም);%>
                     <td> <% out.println(gg.ሎሙ_ም);%>
                     <td> <% out.println(gg.ላቲ_ም);%>
                     <td> <% out.println(gg.ሎን_ም);%>
                                <tr><td> ትእዛዝ ዓንቀጽ (ሩቅ) 
                  <td> <% out.println(gg.ትእዛዝ);%>
                     <td> <% out.println(gg.ሊተ_ትእ);%>
                     <td> <% out.println(gg.ለነ_ትእ);%>    
                     <td> <% out.println(gg.ለከ_ትእ);%>
                     <td> <% out.println(gg.ለኪ_ትእ);%>
                     <td> <% out.println(gg.ለክሙ_ትእ);%>
                     <td> <% out.println(gg.ለክን_ትእ);%>
                     <td> <% out.println(gg.ሎቱ_ትእ);%>
                     <td> <% out.println(gg.ሎሙ_ትእ);%>
                     <td> <% out.println(gg.ላቲ_ትእ);%>
                     <td> <% out.println(gg.ሎን_ትእ);%>
                <tr>
                    <td> ቦዝ ዓንቀጽ<td colspan="11"> <% out.println(gg.ቦዝ);%>
                         <tr>
                    <td> አርእስት ዓንቀጽ<td colspan="11"> <% out.println(gg.አርእስት+" "+gg.አርእስት1);%>
                         <tr>
                    <td> ሳድስ ቅጽል <td colspan="11"> <% out.println(gg.ሳድስቅጽል+" "+gg.ሳድስቅጽል1);%>
                          <tr>
                    <td> ሳልስ ቅጽል <td colspan="11"> <% out.println(gg.ሳልስቅጽል4+" "+gg.ሳልስቅጽል+" "+gg.ሳልስቅጽል1+" "+gg.ሳልስቅጽል2+" "+gg.ሳልስቅጽል3);%>
                          <tr>
                    <td> ሳቢ ዘር ዓንቀጽ <td colspan="11"> <% out.println(gg.ሳቢዘር);%><% }
            else if(ste.substring(0,1).equals("ወ")&&!ste.substring(2,3).equals("ው")){ %>
            <table border="1" bgcolor="" align="center">
                <tr> <th class="menu" colspan="12"> ግስ፡ &nbsp;<% out.print(gg.ሓላፊ); %> &nbsp;  አምደ ግስ፡&nbsp; <% out.print(stemType);  %> &nbsp; መራሄ ግስ፡ &nbsp; <% out.print(png); %>  &nbsp;   ርባታ ውጤቶች
             <tr class="menu"> <th>  አንቀጸ ግስ<th> ዋና ግስ<th>ሊተ <th>ለነ<th>ለከ<th>ለኪ<th>ለክሙ<th>ለክን<th>ሎቱ<th>ሎሙ<th>ላቲ<th>ሎን</tr>
                <tr><td> ሐላፊ ዓንቀጽ 
                  <td> <% out.println(gg.ገቢር);%>
                     <td> <% out.println(gg.ሊተ);%>
                     <td> <% out.println(gg.ለነ);%>    
                     <td> <% out.println(gg.ለከ);%>
                     <td> <% out.println(gg.ለኪ);%>
                     <td> <% out.println(gg.ለክሙ);%>
                     <td> <% out.println(gg.ለክን);%>
                     <td> <% out.println(gg.ሎቱ);%>
                     <td> <% out.println(gg.ሎሙ);%>
                     <td> <% out.println(gg.ላቲ);%>
                     <td> <% out.println(gg.ሎን);%>
  
                     <tr><td> ትንቢት ዓንቀጽ 
                  <td> <% out.println(gg.ትንቢት);%>
                     <td> <% out.println(gg.ሊተ_ት);%>
                     <td> <% out.println(gg.ለነ_ት);%>    
                     <td> <% out.println(gg.ለከ_ት);%>
                     <td> <% out.println(gg.ለኪ_ት);%>
                     <td> <% out.println(gg.ለክሙ_ት);%>
                     <td> <% out.println(gg.ለክን_ት);%>
                     <td> <% out.println(gg.ሎቱ_ት);%>
                     <td> <% out.println(gg.ሎሙ_ት);%>
                     <td> <% out.println(gg.ላቲ_ት);%>
                     <td> <% out.println(gg.ሎን_ት);%>
                          <tr><td> ምክንያታዊ(ዘንድ) ዓንቀጽ 
                  <td> <% out.println(gg.ምክንያታዊ);%>
                     <td> <% out.println(gg.ሊተ_ም);%>
                     <td> <% out.println(gg.ለነ_ም);%>    
                     <td> <% out.println(gg.ለከ_ም);%>
                     <td> <% out.println(gg.ለኪ_ም);%>
                     <td> <% out.println(gg.ለክሙ_ም);%>
                     <td> <% out.println(gg.ለክን_ም);%>
                     <td> <% out.println(gg.ሎቱ_ም);%>
                     <td> <% out.println(gg.ሎሙ_ም);%>
                     <td> <% out.println(gg.ላቲ_ም);%>
                     <td> <% out.println(gg.ሎን_ም);%>
                                <tr><td> ትእዛዝ ዓንቀጽ (ሩቅ) 
                  <td> <% out.println(gg.ትእዛዝ);%>
                     <td> <% out.println(gg.ሊተ_ትእ);%>
                     <td> <% out.println(gg.ለነ_ትእ);%>    
                     <td> <% out.println(gg.ለከ_ትእ);%>
                     <td> <% out.println(gg.ለኪ_ትእ);%>
                     <td> <% out.println(gg.ለክሙ_ትእ);%>
                     <td> <% out.println(gg.ለክን_ትእ);%>
                     <td> <% out.println(gg.ሎቱ_ትእ);%>
                     <td> <% out.println(gg.ሎሙ_ትእ);%>
                     <td> <% out.println(gg.ላቲ_ትእ);%>
                     <td> <% out.println(gg.ሎን_ትእ);%>
                <tr>
                    <td> ቦዝ ዓንቀጽ<td colspan="11"> <% out.println(gg.ቦዝ);%>
                         <tr>
                    <td> አርእስት ዓንቀጽ<td colspan="11"> <% out.println(gg.አርእስት+" "+gg.አርእስት1);%>
                         <tr>
                    <td> ሳድስ ቅጽል <td colspan="11"> <% out.println(gg.ሳድስቅጽል+" "+gg.ሳድስቅጽል1);%>
                          <tr>
                    <td> ሳልስ ቅጽል <td colspan="11"> <% out.println(gg.ሳልስቅጽል4+" "+gg.ሳልስቅጽል+" "+gg.ሳልስቅጽል1+" "+gg.ሳልስቅጽል2+" "+gg.ሳልስቅጽል3);%>
                          <tr>
                    <td> ሳቢ ዘር ዓንቀጽ <td colspan="11"> <% out.println(gg.ሳቢዘር);%><%
            }
            else if(ste.substring(2,3).equals("ው")&&!ste.substring(0,1).equals("ወ") &&!ste.substring(1,2).equals("ዊ")){ %>
            <table border="1" bgcolor="" align="center">
                <tr> <th class="menu" colspan="12"> ግስ፡ &nbsp;<% out.print(gg.ሓላፊ); %> &nbsp;  አምደ ግስ፡&nbsp; <% out.print(stemType);  %> &nbsp; መራሄ ግስ፡ &nbsp; <% out.print(png); %>  &nbsp;   ርባታ ውጤቶች
             <tr class="menu"> <th>  አንቀጸ ግስ<th> ዋና ግስ<th>ሊተ <th>ለነ<th>ለከ<th>ለኪ<th>ለክሙ<th>ለክን<th>ሎቱ<th>ሎሙ<th>ላቲ<th>ሎን</tr>
                <tr><td> ሐላፊ ዓንቀጽ 
                  <td> <% out.println(gg.ገቢር);%>
                     <td> <% out.println(gg.ሊተ);%>
                     <td> <% out.println(gg.ለነ);%>    
                     <td> <% out.println(gg.ለከ);%>
                     <td> <% out.println(gg.ለኪ);%>
                     <td> <% out.println(gg.ለክሙ);%>
                     <td> <% out.println(gg.ለክን);%>
                     <td> <% out.println(gg.ሎቱ);%>
                     <td> <% out.println(gg.ሎሙ);%>
                     <td> <% out.println(gg.ላቲ);%>
                     <td> <% out.println(gg.ሎን);%>
  
                     <tr><td> ትንቢት ዓንቀጽ 
                  <td> <% out.println(gg.ትንቢት);%>
                     <td> <% out.println(gg.ሊተ_ት);%>
                     <td> <% out.println(gg.ለነ_ት);%>    
                     <td> <% out.println(gg.ለከ_ት);%>
                     <td> <% out.println(gg.ለኪ_ት);%>
                     <td> <% out.println(gg.ለክሙ_ት);%>
                     <td> <% out.println(gg.ለክን_ት);%>
                     <td> <% out.println(gg.ሎቱ_ት);%>
                     <td> <% out.println(gg.ሎሙ_ት);%>
                     <td> <% out.println(gg.ላቲ_ት);%>
                     <td> <% out.println(gg.ሎን_ት);%>
                          <tr><td> ምክንያታዊ(ዘንድ) ዓንቀጽ 
                  <td> <% out.println(gg.ምክንያታዊ);%>
                     <td> <% out.println(gg.ሊተ_ም);%>
                     <td> <% out.println(gg.ለነ_ም);%>    
                     <td> <% out.println(gg.ለከ_ም);%>
                     <td> <% out.println(gg.ለኪ_ም);%>
                     <td> <% out.println(gg.ለክሙ_ም);%>
                     <td> <% out.println(gg.ለክን_ም);%>
                     <td> <% out.println(gg.ሎቱ_ም);%>
                     <td> <% out.println(gg.ሎሙ_ም);%>
                     <td> <% out.println(gg.ላቲ_ም);%>
                     <td> <% out.println(gg.ሎን_ም);%>
                                <tr><td> ትእዛዝ ዓንቀጽ (ሩቅ) 
                  <td> <% out.println(gg.ትእዛዝ);%>
                     <td> <% out.println(gg.ሊተ_ትእ);%>
                     <td> <% out.println(gg.ለነ_ትእ);%>    
                     <td> <% out.println(gg.ለከ_ትእ);%>
                     <td> <% out.println(gg.ለኪ_ትእ);%>
                     <td> <% out.println(gg.ለክሙ_ትእ);%>
                     <td> <% out.println(gg.ለክን_ትእ);%>
                     <td> <% out.println(gg.ሎቱ_ትእ);%>
                     <td> <% out.println(gg.ሎሙ_ትእ);%>
                     <td> <% out.println(gg.ላቲ_ትእ);%>
                     <td> <% out.println(gg.ሎን_ትእ);%>
                <tr>
                    <td> ቦዝ ዓንቀጽ<td colspan="11"> <% out.println(gg.ቦዝ);%>
                         <tr>
                    <td> አርእስት ዓንቀጽ<td colspan="11"> <% out.println(gg.አርእስት+" "+gg.አርእስት1);%>
                         <tr>
                    <td> ሳድስ ቅጽል <td colspan="11"> <% out.println(gg.ሳድስቅጽል+" "+gg.ሳድስቅጽል1);%>
                          <tr>
                    <td> ሳልስ ቅጽል <td colspan="11"> <% out.println(gg.ሳልስቅጽል4+" "+gg.ሳልስቅጽል+" "+gg.ሳልስቅጽል1+" "+gg.ሳልስቅጽል2+" "+gg.ሳልስቅጽል3);%>
                          <tr>
                    <td> ሳቢ ዘር ዓንቀጽ <td colspan="11"> <% out.println(gg.ሳቢዘር);%><%
            }
        else if(ste.substring(2,3).equals("ይ")){
          %>
            <table border="1" bgcolor="" align="center">
                <tr> <th class="menu" colspan="12"> ግስ፡ &nbsp;<% out.print(gg.ሓላፊ); %> &nbsp;  አምደ ግስ፡&nbsp; <% out.print(stemType);  %> &nbsp; መራሄ ግስ፡ &nbsp; <% out.print(png); %>  &nbsp;   ርባታ ውጤቶች
             <tr class="menu"> <th>  አንቀጸ ግስ<th> ዋና ግስ<th>ሊተ <th>ለነ<th>ለከ<th>ለኪ<th>ለክሙ<th>ለክን<th>ሎቱ<th>ሎሙ<th>ላቲ<th>ሎን</tr>
                <tr><td> ሐላፊ ዓንቀጽ 
                  <td> <% out.println(gg.ገቢር);%>
                     <td> <% out.println(gg.ሊተ);%>
                     <td> <% out.println(gg.ለነ);%>    
                     <td> <% out.println(gg.ለከ);%>
                     <td> <% out.println(gg.ለኪ);%>
                     <td> <% out.println(gg.ለክሙ);%>
                     <td> <% out.println(gg.ለክን);%>
                     <td> <% out.println(gg.ሎቱ);%>
                     <td> <% out.println(gg.ሎሙ);%>
                     <td> <% out.println(gg.ላቲ);%>
                     <td> <% out.println(gg.ሎን);%>
  
                     <tr><td> ትንቢት ዓንቀጽ 
                  <td> <% out.println(gg.ትንቢት);%>
                     <td> <% out.println(gg.ሊተ_ት);%>
                     <td> <% out.println(gg.ለነ_ት);%>    
                     <td> <% out.println(gg.ለከ_ት);%>
                     <td> <% out.println(gg.ለኪ_ት);%>
                     <td> <% out.println(gg.ለክሙ_ት);%>
                     <td> <% out.println(gg.ለክን_ት);%>
                     <td> <% out.println(gg.ሎቱ_ት);%>
                     <td> <% out.println(gg.ሎሙ_ት);%>
                     <td> <% out.println(gg.ላቲ_ት);%>
                     <td> <% out.println(gg.ሎን_ት);%>
                          <tr><td> ምክንያታዊ(ዘንድ) ዓንቀጽ 
                  <td> <% out.println(gg.ምክንያታዊ);%>
                     <td> <% out.println(gg.ሊተ_ም);%>
                     <td> <% out.println(gg.ለነ_ም);%>    
                     <td> <% out.println(gg.ለከ_ም);%>
                     <td> <% out.println(gg.ለኪ_ም);%>
                     <td> <% out.println(gg.ለክሙ_ም);%>
                     <td> <% out.println(gg.ለክን_ም);%>
                     <td> <% out.println(gg.ሎቱ_ም);%>
                     <td> <% out.println(gg.ሎሙ_ም);%>
                     <td> <% out.println(gg.ላቲ_ም);%>
                     <td> <% out.println(gg.ሎን_ም);%>
                                <tr><td> ትእዛዝ ዓንቀጽ (ሩቅ) 
                  <td> <% out.println(gg.ትእዛዝ);%>
                     <td> <% out.println(gg.ሊተ_ትእ);%>
                     <td> <% out.println(gg.ለነ_ትእ);%>    
                     <td> <% out.println(gg.ለከ_ትእ);%>
                     <td> <% out.println(gg.ለኪ_ትእ);%>
                     <td> <% out.println(gg.ለክሙ_ትእ);%>
                     <td> <% out.println(gg.ለክን_ትእ);%>
                     <td> <% out.println(gg.ሎቱ_ትእ);%>
                     <td> <% out.println(gg.ሎሙ_ትእ);%>
                     <td> <% out.println(gg.ላቲ_ትእ);%>
                     <td> <% out.println(gg.ሎን_ትእ);%>
                <tr>
                    <td> ቦዝ ዓንቀጽ<td colspan="11"> <% out.println(gg.ቦዝ);%>
                         <tr>
                    <td> አርእስት ዓንቀጽ<td colspan="11"> <% out.println(gg.አርእስት+" "+gg.አርእስት1);%>
                         <tr>
                    <td> ሳድስ ቅጽል <td colspan="11"> <% out.println(gg.ሳድስቅጽል+" "+gg.ሳድስቅጽል1);%>
                          <tr>
                    <td> ሳልስ ቅጽል <td colspan="11"> <% out.println(gg.ሳልስቅጽል4+" "+gg.ሳልስቅጽል+" "+gg.ሳልስቅጽል1+" "+gg.ሳልስቅጽል2+" "+gg.ሳልስቅጽል3);%>
                          <tr>
                    <td> ሳቢ ዘር ዓንቀጽ <td colspan="11"> <% out.println(gg.ሳቢዘር);%><%
                        }
        else if(ste.substring(0,1).equals("ሐ") &&ste.substring(0,1).equals("ሀ") &&ste.substring(0,1).equals("ኀ") &&ss==ss1){
          %>
            <table border="1" bgcolor="" align="center">
                <tr> <th class="menu" colspan="12"> ግስ፡ &nbsp;<% out.print(gg.ሓላፊ); %> &nbsp;  አምደ ግስ፡&nbsp; <% out.print(stemType);  %> &nbsp; መራሄ ግስ፡ &nbsp; <% out.print(png); %>  &nbsp;   ርባታ ውጤቶች
             <tr class="menu"> <th>  አንቀጸ ግስ<th> ዋና ግስ<th>ሊተ <th>ለነ<th>ለከ<th>ለኪ<th>ለክሙ<th>ለክን<th>ሎቱ<th>ሎሙ<th>ላቲ<th>ሎን</tr>
                <tr><td> ሐላፊ ዓንቀጽ 
                  <td> <% out.println(gg.ገቢር);%>
                     <td> <% out.println(gg.ሊተ);%>
                     <td> <% out.println(gg.ለነ);%>    
                     <td> <% out.println(gg.ለከ);%>
                     <td> <% out.println(gg.ለኪ);%>
                     <td> <% out.println(gg.ለክሙ);%>
                     <td> <% out.println(gg.ለክን);%>
                     <td> <% out.println(gg.ሎቱ);%>
                     <td> <% out.println(gg.ሎሙ);%>
                     <td> <% out.println(gg.ላቲ);%>
                     <td> <% out.println(gg.ሎን);%>
  
                     <tr><td> ትንቢት ዓንቀጽ 
                  <td> <% out.println(gg.ትንቢት);%>
                     <td> <% out.println(gg.ሊተ_ት);%>
                     <td> <% out.println(gg.ለነ_ት);%>    
                     <td> <% out.println(gg.ለከ_ት);%>
                     <td> <% out.println(gg.ለኪ_ት);%>
                     <td> <% out.println(gg.ለክሙ_ት);%>
                     <td> <% out.println(gg.ለክን_ት);%>
                     <td> <% out.println(gg.ሎቱ_ት);%>
                     <td> <% out.println(gg.ሎሙ_ት);%>
                     <td> <% out.println(gg.ላቲ_ት);%>
                     <td> <% out.println(gg.ሎን_ት);%>
                          <tr><td> ምክንያታዊ(ዘንድ) ዓንቀጽ 
                  <td> <% out.println(gg.ምክንያታዊ);%>
                     <td> <% out.println(gg.ሊተ_ም);%>
                     <td> <% out.println(gg.ለነ_ም);%>    
                     <td> <% out.println(gg.ለከ_ም);%>
                     <td> <% out.println(gg.ለኪ_ም);%>
                     <td> <% out.println(gg.ለክሙ_ም);%>
                     <td> <% out.println(gg.ለክን_ም);%>
                     <td> <% out.println(gg.ሎቱ_ም);%>
                     <td> <% out.println(gg.ሎሙ_ም);%>
                     <td> <% out.println(gg.ላቲ_ም);%>
                     <td> <% out.println(gg.ሎን_ም);%>
                                <tr><td> ትእዛዝ ዓንቀጽ (ሩቅ) 
                  <td> <% out.println(gg.ትእዛዝ);%>
                     <td> <% out.println(gg.ሊተ_ትእ);%>
                     <td> <% out.println(gg.ለነ_ትእ);%>    
                     <td> <% out.println(gg.ለከ_ትእ);%>
                     <td> <% out.println(gg.ለኪ_ትእ);%>
                     <td> <% out.println(gg.ለክሙ_ትእ);%>
                     <td> <% out.println(gg.ለክን_ትእ);%>
                     <td> <% out.println(gg.ሎቱ_ትእ);%>
                     <td> <% out.println(gg.ሎሙ_ትእ);%>
                     <td> <% out.println(gg.ላቲ_ትእ);%>
                     <td> <% out.println(gg.ሎን_ትእ);%>
                <tr>
                    <td> ቦዝ ዓንቀጽ<td colspan="11"> <% out.println(gg.ቦዝ);%>
                         <tr>
                    <td> አርእስት ዓንቀጽ<td colspan="11"> <% out.println(gg.አርእስት+" "+gg.አርእስት1);%>
                         <tr>
                    <td> ሳድስ ቅጽል <td colspan="11"> <% out.println(gg.ሳድስቅጽል+" "+gg.ሳድስቅጽል1);%>
                          <tr>
                    <td> ሳልስ ቅጽል <td colspan="11"> <% out.println(gg.ሳልስቅጽል4+" "+gg.ሳልስቅጽል+" "+gg.ሳልስቅጽል1+" "+gg.ሳልስቅጽል2+" "+gg.ሳልስቅጽል3);%>
                          <tr>
                    <td> ሳቢ ዘር ዓንቀጽ <td colspan="11"> <% out.println(gg.ሳቢዘር);%><%
                        }
                    else{
                          %>
                          <tr><td id="app_warning-msg">
                            <% 
                        out.print("ትክክለኛ ግስ አስገባ!");
                        }
                        %>
                        
                        <tr>
                     </table>
<tr><td colspan="3" id="footer">All rights reserved &copy; 2018 - Aksum University Department of Computing Technology</td></tr>

</table>

</body>
</html>