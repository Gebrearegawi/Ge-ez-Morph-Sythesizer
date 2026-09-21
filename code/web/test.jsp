<%-- 
    Document   : test
    Created on : Jul 31, 2018, 5:29:10 PM
    Author     : Aregawi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <link href="stylesheet.css" type="text/css" rel="stylesheet" media="all" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MorphSynthesizer</title>
      <script type="text/javascript">

                    function valid_form()
            {
                if(document.form_insert.stem.value == "")
                    {
                        alert("እባክዎ አርእስተ ግስ ያስገቡ/please enter infinitive verb form/");
                        return false;
                    }
                if(document.form_insert.stemType.value == "")
                    {
                        alert("እባክዎ አምደ ግስ ያስገቡ/Please select Stem type");
                        return false;
                    }
                     if(document.form_insert.png.value == "")
                    {
                        alert("እባክዎ መራሄ ግስ ያስገቡ/Please Enter PNG");
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
    <body>
                  
        <table border="1">
        <td class="top">
                      
                    </td>
                </tr>
                <tr>
                    <td class="header">
                         
                        <h2><u>     <center>  ረባሓ ግስ ዘልሳነ ግእዝ /Ge'ez Morphological Synthesizer/</h2>
                        <img src="images/header1.png" width="1100px"  height="40px" alt="" />
                    </td>
                </tr>
                <tr>
                    <td class="menu">
                       <ul>
                        
                        </tr>
                        
                        <tr>
                        <form name="form_insert" action="index.jsp" method="get" onsubmit="return valid_form();">
                        <table border="0" align="center">
                            <tr><td colspan="5"></td>
                              <tr>
                                   <td class="lbl_txt"> ኣግብእ አርእስተ ግስ /Enter Infinitive Verb Form/:</td>
                                   <td><input type="text" name="stem"  class="txt"  value="" /></td>
                               </tr>   
                            <tr>
                                   <td class="lbl_txt">ኅረይ አምደ ግስ /Select Verb Stem/ :</td>
                                   <td><select name="stemType" class="txt"  value=""/>
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
                                 <tr>
                                 <td colspan="1">   <td>
                                       <input type="submit" name="generate" value="አርብሕ" class="btn" />
                                   </td>
                                   <td>
                                       <input type="reset" value="Reset" name="reset"  class="btn" onclick="return clear();" />
                                   </td> 
                               </tr>
                                <tr><td><br>  <tr><td><br>    <tr> <br>   <tr><br>    <tr><br>    <tr> <br>   <tr>
    <table>
            
              <tr>
                    <table border="0" width="100%" height="100%">
                      
                       <tr>
                          <td class="footer">
                            <ul class="footer_ul">
                             
                            </ul>

                          </td>
                       </tr>
                       <tr>
                          <td class="footer">
                            <h3>Developed by : Gebrearegawi Gebremariam, 2018
                            &copy All Rights Reserved.</h3>
                          </td>
                       </tr>
                    </table>
                </tr>
          </table>
        </form>

    </body>
</html>

    </body>
</html>
