/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gode;

/**
 *
 * @author Aregawi
 */
public class generate extends GeezData{
//how to handle the forms of the verb that have the letters ወ,የ,አ,ዐ, ሀ,ሐ,ኀ
     //all the verb forms generated should be synchronized with the personal pronoun inserted.
    @SuppressWarnings("empty-statement")
        public void createStem(String stem,String stemType,String person)
{
    String ste=stem;
    //how to handle verb form that have የ in center 
    //System.out.println("ሐላፊ አንቀጽ:"+stem);
 if(!ste.contains("ዊ")&&!ste.contains("ዪ")&&!ste.endsWith("ው")&&!ste.endsWith("ይ")&&!ste.contains("ሂ")&&!ste.contains("ኢ")&&!ste.contains("ሒ")&&!ste.contains("ኂ")
         &&!ste.contains("ዒ")&&!ste.substring(0,1).equals("ው")&&!ste.substring(0,1).equals("ወ") &&!ste.contains("ሀ")&&!ste.substring(0,1).equals("ሐ")&&!ste.substring(0,1).equals("ኀ")){
    if(ste.charAt(2)!='ክ'&&ste.charAt(2)!='ቅ'&&ste.charAt(2)!='ግ'){ 
          for(int i=0;i<salis.length;i++){
    if( ste.substring(1,2).equals(salis[i])){
         ss=ste.substring(0,1)+geez[i];
    }
  }
   for(int j=0;j<salis.length;j++){
     if( ste.substring(2,3).equals(sadis[j])){
         ሓላፊ=ss+geez[j];
    }
}
   switch(person)
   {
       case "ውእቱ/He/":{
       switch(stemType)
   {
        case "ገቢር/perfective/":{
            for(int j=0;j<sadis.length;j++){
      if( ste.substring(2,3).equals(sadis[j])){
            ገቢር=ሓላፊ;
            ሊተ=ገቢር+OMS[22];
            ለነ=ገቢር+OMS[23];
            ለከ=ገቢር+OMS[0];
            ለክሙ=ገቢር+OMS[10];                
            ለኪ=ገቢር+OMS[2];  
            ለክን=ገቢር+OMS[3];
            ሎቱ=ገቢር.substring(0,2)+sabie[j];
            ሎሙ=ገቢር.substring(0,2)+sabie[j]+OMS[11];
            ላቲ=ገቢር.substring(0,2)+rabie[j];
            ሎን=ገቢር.substring(0,2)+sabie[j]+OMS[20];
                    } 
       }
       for(int j=0;j<sadis.length;j++){
      if( ste.substring(1,2).equals(salis[j])){
            ትንቢት="ይ"+ste.substring(0,1)+sadis[j]+ste.substring(2,3);
          System.out.println("ትንቢት አንቀጽ:"+ትንቢት);
          for(int i=0;i<sadis.length;i++){
               if( ste.substring(2,3).equals(sadis[i])){
                       ትንቢት=ትንቢት;
             ሊተ_ት=ትንቢት.substring(0,3)+geez[i]+OMS[22];
             ለነ_ት=ትንቢት.substring(0,3)+geez[i]+OMS[23];
             ለከ_ት=ትንቢት.substring(0,3)+geez[i]+OMS[0];
             ለክሙ_ት=   ትንቢት.substring(0,3)+geez[i]+OMS[10] ;         
             ለኪ_ት=ትንቢት.substring(0,3)+geez[i]+OMS[2];  
             ለክን_ት=ትንቢት.substring(0,3)+geez[i]+OMS[3];
             ሎቱ_ት=ትንቢት.substring(0,3)+sabie[i] ;
             ሎሙ_ት=ትንቢት.substring(0,3)+sabie[i]+OMS[11];
             ላቲ_ት=ትንቢት.substring(0,3)+rabie[i];
             ሎን_ት=ትንቢት.substring(0,3)+sabie[i]+OMS[20];
                    } }}
       }
        for(int j=0;j<sadis.length;j++){
           if( ste.substring(0,1).equals(geez[j])){
            ትእዛዝ="ይ"+sadis[j];
           }
            }
         for(int j=0;j<sadis.length;j++){
      if( ste.substring(1,2).equals(salis[j])){
            ትእዛዝ=ትእዛዝ+sadis[j]+ste.substring(2,3);
          System.out.println("ትእዛዝ አንቀጽ:"+ትእዛዝ);
          for(int i=0;i<sadis.length;i++){
               if( ste.substring(2,3).equals(sadis[i])){
             ሊተ_ትእ=ትእዛዝ.substring(0,3)+geez[i]+OMS[22];
             ለነ_ትእ=ትእዛዝ.substring(0,3)+geez[i]+OMS[23];
             ለከ_ትእ=ትእዛዝ+OMS[0];
             ለክሙ_ትእ= ትእዛዝ+OMS[10] ;         
             ለኪ_ትእ=ትእዛዝ+OMS[2];  
             ለክን_ትእ=ትእዛዝ+OMS[3];
             ሎቱ_ትእ=ትእዛዝ.substring(0,3)+sabie[i] ;
             ሎሙ_ትእ=ትእዛዝ.substring(0,3)+sabie[i]+OMS[11];
             ላቲ_ትእ=ትእዛዝ.substring(0,3)+rabie[i];
             ሎን_ትእ=ትእዛዝ.substring(0,3)+sabie[i]+OMS[20];
                    } }}
       }
         for(int j=0;j<sadis.length;j++){
           if( ste.substring(0,1).equals(geez[j])){
            ምክንያታዊ="ይ"+sadis[j];
           }
            }
         for(int j=0;j<sadis.length;j++){
      if( ste.substring(1,2).equals(salis[j])){
            ምክንያታዊ=ምክንያታዊ+sadis[j]+ste.substring(2,3);
          for(int i=0;i<sadis.length;i++){
               if( ste.substring(2,3).equals(sadis[i])){
             ሊተ_ም=ምክንያታዊ.substring(0,3)+geez[i]+OMS[22];
             ለነ_ም=ምክንያታዊ.substring(0,3)+geez[i]+OMS[23];
             ለከ_ም=ምክንያታዊ.substring(0,4)+OMS[0];
             ለክሙ_ም= ምክንያታዊ.substring(0,4)+OMS[1] ;         
             ለኪ_ም=ምክንያታዊ.substring(0,4)+OMS[2];   
             ለክን_ም=ምክንያታዊ.substring(0,4)+OMS[3] ;
             ሎቱ_ም=ምክንያታዊ.substring(0,3)+sabie[i] ;
             ሎሙ_ም=ምክንያታዊ.substring(0,3)+sabie[i]+OMS[11];
             ላቲ_ም=ምክንያታዊ.substring(0,3)+rabie[i];
             ሎን_ም=ምክንያታዊ.substring(0,3)+sabie[i]+OMS[20];
                    } }}
         } 
         String d="";
   for(int j=0;j<salis.length;j++){
     if( ste.substring(2,3).equals(sadis[j])){
         ቦዝ=ste.substring(0,2)+sabie[j];
           ሳቢዘር1 = geez[j];
         //ሳድስቅጽል=sadis[j];
        ሳልስቅጽል=salis[j];
        ss=sabie[j];
        ss1=sadis[j];
        d=kaeb[j];
    }}
   አርእስት=ste.substring(0,3)+OMS[5];
   አርእስት1=ste.substring(0,2)+ss+"ቶ";
   for(int j=0;j<salis.length;j++){
     if( ste.substring(0,1).equals(geez[j])){
         ሳቢዘር=sadis[j];
         ሳድስቅጽል=sadis[j];
    }}
   for(int j=0;j<salis.length;j++){
     if( ste.substring(1,2).equals(salis[j])){
        ሳድስቅጽል=ሳድስቅጽል+kaeb[j]+ss1;
        ሳድስቅጽል1=ሳድስቅጽል.substring(0, 2)+d;
        ሳልስቅጽል4=ste.substring(0,1)+rabie[j]+ሳልስቅጽል ;
        ሳልስቅጽል=ste.substring(0,1)+rabie[j]+ሳልስቅጽል+"ሁ" ;
        ሳልስቅጽል1=ሳልስቅጽል.substring(0, 2)+ste.substring(2,3)+"ያኒሁ";
        ሳልስቅጽል2=ሳልስቅጽል.substring(0, 3)+"ቱ";
        ሳልስቅጽል3=ሳልስቅጽል.substring(0, 2)+ste.substring(2,3)+"ያቲሁ";
        ሳቢዘር=ሳቢዘር+sadis[j]+ሳቢዘር1+"ቱ";
    }}
        }
        break;
        case "አግብሮ/causative/":{
             for(int j=0;j<sadis.length;j++){
      if( ste.substring(0,1).equals(geez[j])){
            ገቢር="አ"+sadis[j]+ሓላፊ.substring(1,3);
               //ገቢር=ገቢር+"ኩ";
            ሊተ=ገቢር+OMS[22];
            ለነ=ገቢር+OMS[23];
            ለከ=ገቢር+OMS[0];
            ለክሙ=ገቢር+OMS[10];                
            ለኪ=ገቢር+OMS[2];  
            ለክን=ገቢር+OMS[3];
            for(int i=0;i<sadis.length;i++){
      if( ገቢር.substring(3,4).equals(geez[i])){
          ሎቱ=ገቢር.substring(0,3)+sabie[i];
            ሎሙ=ገቢር.substring(0,3)+sabie[i]+OMS[11];
            ላቲ=ገቢር.substring(0,3)+rabie[i];
            ሎን=ገቢር.substring(0,3)+sabie[i]+OMS[20];
                    } 
       }}}
       for(int j=0;j<sadis.length;j++){
      if( ste.substring(1,2).equals(salis[j])){
            ትንቢት="ያ"+ste.substring(0,1)+sadis[j]+ste.substring(2,3);
          for(int i=0;i<sadis.length;i++){
               if( ste.substring(2,3).equals(sadis[i])){
                   ሊተ_ት=ትንቢት.substring(0,3)+geez[i]+OMS[22];
             ለነ_ት=ትንቢት.substring(0,3)+geez[i]+OMS[23];
             ለከ_ት=ትንቢት.substring(0,3)+geez[i]+OMS[0];
             ለክሙ_ት=   ትንቢት.substring(0,3)+geez[i]+OMS[10] ;         
             ለኪ_ት=ትንቢት.substring(0,3)+geez[i]+OMS[2];  
             ለክን_ት=ትንቢት.substring(0,3)+geez[i]+OMS[3];
             ሎቱ_ት=ትንቢት.substring(0,3)+sabie[i] ;
             ሎሙ_ት=ትንቢት.substring(0,3)+sabie[i]+OMS[11];
             ላቲ_ት=ትንቢት.substring(0,3)+rabie[i];
             ሎን_ት=ትንቢት.substring(0,3)+sabie[i]+OMS[20];
                    } }}
       }
        for(int j=0;j<sadis.length;j++){
           if( ste.substring(0,1).equals(geez[j])){
            ትእዛዝ="ያ"+sadis[j];
           }
            }
         for(int j=0;j<sadis.length;j++){
      if( ste.substring(1,2).equals(salis[j])){
            ትእዛዝ=ትእዛዝ+sadis[j]+ste.substring(2,3);
          for(int i=0;i<sadis.length;i++){
               if( ste.substring(2,3).equals(sadis[i])){
                           ሊተ_ትእ=ትእዛዝ.substring(0,3)+geez[i]+OMS[22];
             ለነ_ትእ=ትእዛዝ.substring(0,3)+geez[i]+OMS[23];
             ለከ_ትእ=ትእዛዝ+OMS[0];
             ለክሙ_ትእ=   ትእዛዝ+OMS[10] ;         
             ለኪ_ትእ=ትእዛዝ+OMS[2];  
             ለክን_ትእ=ትእዛዝ+OMS[3] ;
             ሎቱ_ትእ=ትእዛዝ.substring(0,3)+sabie[i] ;
             ሎሙ_ትእ=ትእዛዝ.substring(0,3)+sabie[i]+OMS[11];
             ላቲ_ትእ=ትእዛዝ.substring(0,3)+rabie[i] ;
             ሎን_ትእ=ትእዛዝ.substring(0,3)+sabie[i]+OMS[20] ;
             //     
             ሊተ_ም=ትእዛዝ.substring(0,3)+geez[i]+OMS[22];
             ለነ_ም=ትእዛዝ.substring(0,3)+geez[i]+OMS[23];
             ለከ_ም=ትእዛዝ+OMS[0];
             ለክሙ_ም=   ትእዛዝ+OMS[10] ;         
             ለኪ_ም=ትእዛዝ+OMS[2];  
             ለክን_ም=ትእዛዝ+OMS[3] ;
             ሎቱ_ም=ትእዛዝ.substring(0,3)+sabie[i] ;
             ሎሙ_ም=ትእዛዝ.substring(0,3)+sabie[i]+OMS[11];
             ላቲ_ም=ትእዛዝ.substring(0,3)+rabie[i] ;
             ሎን_ም=ትእዛዝ.substring(0,3)+sabie[i]+OMS[20] ;
                    } }}
       }
         String d="";
   for(int j=0;j<salis.length;j++){
     if( ste.substring(2,3).equals(sadis[j])){
         ቦዝ=ገቢር.substring(0,2)+ste.substring(1,2)+sabie[j];
         ሳልስቅጽል=ገቢር.substring(0,2);
        ss=sabie[j];
        ss1=salis[j];
        d=hams[j];  
    }}
   for(int j=0;j<salis.length;j++){
     if( ste.substring(1,2).equals(salis[j])){
    
        አርእስት1=ቦዝ.substring(0,2)+sadis[j]+ቦዝ.substring(3,4)+"ቶ";
        ሳልስቅጽል=ሳልስቅጽል+rabie[j]+ss1;
         ሳልስቅጽል1=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያኒሁ";
        ሳልስቅጽል2=ሳልስቅጽል.substring(0, 4)+"ቱ";
        ሳልስቅጽል3=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያቲሁ";
        }}
        }
        
        break;
         case "አስተጋብሮ/causative-reciprocal/":{
             for(int j=0;j<sadis.length;j++){
      if( ste.substring(0,1).equals(geez[j])){
            ገቢር="አስተ"+rabie[j]+ሓላፊ.substring(1,3);
            ሊተ=ገቢር+OMS[22];
            ለነ=ገቢር+OMS[23];
            ለከ=ገቢር+OMS[0];
            ለክሙ=ገቢር+OMS[10];                
            ለኪ=ገቢር+OMS[2];  
            ለክን=ገቢር+OMS[3];
            for(int i=0;i<sadis.length;i++){
      if( ste.substring(2,3).equals(sadis[i])){
           ሎቱ=ገቢር.substring(0,5)+sabie[i];
            ሎሙ=ገቢር.substring(0,5)+sabie[i]+OMS[11];
            ላቲ=ገቢር.substring(0,5)+rabie[i];
            ሎን=ገቢር.substring(0,5)+sabie[i]+OMS[20];
                    } 
       }}}
                   for(int j=0;j<geez.length;j++){
      if( ste.substring(0,1).equals(geez[j])){
            ትንቢት="ያስተ"+rabie[j];
      }}
           for(int j=0;j<sadis.length;j++){
      if( ste.substring(1,2).equals(salis[j])){
            ትንቢት=ትንቢት+sadis[j]+ste.substring(2,3);
            ትእዛዝ=ትንቢት;
            ምክንያታዊ=ትንቢት;  
          for(int i=0;i<sadis.length;i++){
               if( ste.substring(2,3).equals(sadis[i])){
                   ሊተ_ት=ትንቢት.substring(0,5)+geez[i]+OMS[22];
             ለነ_ት=ትንቢት.substring(0,5)+geez[i]+OMS[23];
             ለከ_ት=ትንቢት.substring(0,5)+geez[i]+OMS[0];
             ለክሙ_ት=   ትንቢት.substring(0,5)+geez[i]+OMS[10] ;         
             ለኪ_ት=ትንቢት.substring(0,5)+geez[i]+OMS[2];  
             ለክን_ት=ትንቢት.substring(0,5)+geez[i]+OMS[3];
             ሎቱ_ት=ትንቢት.substring(0,5)+sabie[i] ;
             ሎሙ_ት=ትንቢት.substring(0,5)+sabie[i]+OMS[11];
             ላቲ_ት=ትንቢት.substring(0,5)+rabie[i];
             ሎን_ት=ትንቢት.substring(0,5)+sabie[i]+OMS[20];
                    } }}
       }
           for(int i=0;i<sadis.length;i++){
               if( ste.substring(2,3).equals(sadis[i])){
         
                   ሊተ_ትእ=ትንቢት.substring(0,5)+geez[i]+OMS[22];
             ለነ_ትእ=ትንቢት.substring(0,5)+geez[i]+OMS[23];
             ለከ_ትእ=ትንቢት.substring(0,5)+geez[i]+OMS[0];
             ለክሙ_ትእ=   ትንቢት.substring(0,5)+geez[i]+OMS[10] ;         
             ለኪ_ትእ=ትንቢት.substring(0,5)+geez[i]+OMS[2];  
             ለክን_ትእ=ትንቢት.substring(0,5)+geez[i]+OMS[3];
             ሎቱ_ትእ=ትንቢት.substring(0,5)+sabie[i] ;
             ሎሙ_ትእ=ትንቢት.substring(0,5)+sabie[i]+OMS[11];
             ላቲ_ትእ=ትንቢት.substring(0,5)+rabie[i];
             ሎን_ትእ=ትንቢት.substring(0,5)+sabie[i]+OMS[20];
             //
             ሊተ_ም=ትንቢት.substring(0,5)+geez[i]+OMS[22];
             ለነ_ም=ትንቢት.substring(0,5)+geez[i]+OMS[23];
             ለከ_ም=ትንቢት.substring(0,5)+geez[i]+OMS[0];
             ለክሙ_ም=   ትንቢት.substring(0,5)+geez[i]+OMS[10] ;         
             ለኪ_ም=ትንቢት.substring(0,5)+geez[i]+OMS[2];  
             ለክን_ም=ትንቢት.substring(0,5)+geez[i]+OMS[3];
             ሎቱ_ም=ትንቢት.substring(0,5)+sabie[i] ;
             ሎሙ_ም=ትንቢት.substring(0,5)+sabie[i]+OMS[11];
             ላቲ_ም=ትንቢት.substring(0,5)+rabie[i];
             ሎን_ም=ትንቢት.substring(0,5)+sabie[i]+OMS[20];
               }}
                  for(int j=0;j<geez.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           ቦዝ=ገቢር.substring(0, 4)+ste.substring(1,2)+sabie[j];
           ss=salis[j];
         }}
               for(int j=0;j<geez.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           አርእስት1=ገቢር.substring(0, 4)+sadis[j];
               }} 
               for(int j=0;j<salis.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           አርእስት1=አርእስት1+sabie[j]+"ቶ";
         }}
        }
         break;
         case "ተገብሮ/reflexive/":{
             for(int j=0;j<salis.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           ተገብሮ="ተ"+ste.substring(0,1)+sadis[j];
         }}
               for(int j=0;j<geez.length;j++){
         if( ሓላፊ.substring(2,3).equals(geez[j])){
           ገቢር=ተገብሮ+geez[j];
               }}
                for(int j=0;j<salis.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           ትንቢት="ይት"+ste.substring(0,1)+geez[j];
           ቅርብ_ትእዛዝ="ተ"+ste.substring(0,1)+geez[j]+ste.substring(2,3);
         }}
               for(int j=0;j<geez.length;j++){
         if( ሓላፊ.substring(2,3).equals(geez[j])){
           ትንቢት=ትንቢት+sadis[j];
           ምክንያታዊ=ትእዛዝ=ትንቢት;
               }}
              for(int j=0;j<salis.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           ቦዝ="ተ"+ste.substring(0,2)+sabie[j];
           ss=salis[j];
         }}
               for(int j=0;j<geez.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           አርእስት1="ተ"+ste.substring(0,1)+sadis[j];
               }} 
               for(int j=0;j<salis.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           አርእስት1=አርእስት1+sabie[j]+"ቶ";
         }}
         }
         break;
         case "ተጋብሮ/reciprocal/":{
             for(int j=0;j<geez.length;j++){
         if( ste.substring(0,1).equals(geez[j])){
           ገቢር="ተ"+rabie[j]+ሓላፊ.substring(1,3);
           ሊተ=ገቢር+OMS[22];
            ለነ=ገቢር+OMS[23];
            ለከ=ገቢር+OMS[0];
            ለክሙ=ገቢር+OMS[10];                
            ለኪ=ገቢር+OMS[2];  
            ለክን=ገቢር+OMS[3];  
            for(int i=0;i<sadis.length;i++){
      if( ste.substring(2,3).equals(sadis[i])){
           ሎቱ=ገቢር.substring(0,3)+sabie[i];
            ሎሙ=ገቢር.substring(0,3)+sabie[i]+OMS[11];
            ላቲ=ገቢር.substring(0,3)+rabie[i];
            ሎን=ገቢር.substring(0,3)+sabie[i]+OMS[20];
               }}}}
                for(int j=0;j<geez.length;j++){
         if( ste.substring(0,1).equals(geez[j])){
           ትንቢት="ይት"+rabie[j]+ሓላፊ.substring(1,2);
           ቅርብ_ትእዛዝ="ተ"+rabie[j]+ሓላፊ.substring(1,2);;
         }}
               for(int i=0;i<geez.length;i++){
         if( ሓላፊ.substring(2,3).equals(geez[i])){
           ትንቢት=ትንቢት+sadis[i];
                  ሊተ_ት=ትንቢት.substring(0,4)+geez[i]+OMS[22];
             ለነ_ት=ትንቢት.substring(0,4)+geez[i]+OMS[23];
             ለከ_ት=ትንቢት.substring(0,4)+geez[i]+OMS[0];
             ለክሙ_ት=   ትንቢት.substring(0,4)+geez[i]+OMS[10] ;         
             ለኪ_ት=ትንቢት.substring(0,4)+geez[i]+OMS[2];  
             ለክን_ት=ትንቢት.substring(0,4)+geez[i]+OMS[3];
             ሎቱ_ት=ትንቢት.substring(0,4)+sabie[i] ;
             ሎሙ_ት=ትንቢት.substring(0,4)+sabie[i]+OMS[11];
             ላቲ_ት=ትንቢት.substring(0,4)+rabie[i];
             ሎን_ት=ትንቢት.substring(0,4)+sabie[i]+OMS[20];        
                   ሊተ_ትእ=ትንቢት.substring(0,4)+geez[i]+OMS[22];
             ለነ_ትእ=ትንቢት.substring(0,4)+geez[i]+OMS[23];
             ለከ_ትእ=ትንቢት.substring(0,4)+geez[i]+OMS[0];
             ለክሙ_ትእ=   ትንቢት.substring(0,4)+geez[i]+OMS[10] ;         
             ለኪ_ትእ=ትንቢት.substring(0,4)+geez[i]+OMS[2];  
             ለክን_ትእ=ትንቢት.substring(0,4)+geez[i]+OMS[3];
             ሎቱ_ትእ=ትንቢት.substring(0,4)+sabie[i] ;
             ሎሙ_ትእ=ትንቢት.substring(0,4)+sabie[i]+OMS[11];
             ላቲ_ትእ=ትንቢት.substring(0,4)+rabie[i];
             ሎን_ትእ=ትንቢት.substring(0,4)+sabie[i]+OMS[20];            //
             ሊተ_ም=ትንቢት.substring(0,4)+geez[i]+OMS[22];
             ለነ_ም=ትንቢት.substring(0,4)+geez[i]+OMS[23];
             ለከ_ም=ትንቢት.substring(0,4)+geez[i]+OMS[0];
             ለክሙ_ም=   ትንቢት.substring(0,4)+geez[i]+OMS[10] ;         
             ለኪ_ም=ትንቢት.substring(0,4)+geez[i]+OMS[2];  
             ለክን_ም=ትንቢት.substring(0,4)+geez[i]+OMS[3];
             ሎቱ_ም=ትንቢት.substring(0,4)+sabie[i] ;
             ሎሙ_ም=ትንቢት.substring(0,4)+sabie[i]+OMS[11];
             ላቲ_ም=ትንቢት.substring(0,4)+rabie[i];
             ሎን_ም=ትንቢት.substring(0,4)+sabie[i]+OMS[20];
           ቅርብ_ትእዛዝ=ቅርብ_ትእዛዝ+sadis[i];
           ትእዛዝ=ትንቢት;
            ምክንያታዊ=ትንቢት;
               }}
              for(int j=0;j<salis.length;j++){
         if( ste.substring(0,1).equals(geez[j])){
           ቦዝ="ተ"+rabie[j]+ste.substring(1, 2);
           አርእስት1="ተ"+rabie[j];
            ሳልስቅጽል="ተ"+rabie[j];           
         }}
               for(int j=0;j<geez.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           አርእስት1=አርእስት1+sadis[j];
           ሳልስቅጽል=ሳልስቅጽል+rabie[j];         
               }} 
               for(int j=0;j<salis.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
             ሳልስቅጽል=ሳልስቅጽል+salis[j];
               ሳልስቅጽል1=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያኒሁ";
        ሳልስቅጽል2=ሳልስቅጽል.substring(0, 4)+"ቱ";
        ሳልስቅጽል3=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያቲሁ";
           ቦዝ=ቦዝ+sabie[j];
           አርእስት1=አርእስት1+sabie[j];
           አርእስት1=አርእስት1+"ቶ";
         }}
         }
   }}
       break;
      
        case "ይእቲ/She/":{
       switch(stemType)
   {
        case "ገቢር/perfective/":{
            ገቢር=ሓላፊ+"ት";
    for(int j=0;j<sadis.length;j++){
      if(ገቢር.substring(3,4).equals(sadis[j])){
            ሊተ=ገቢር.substring(0,3)+geez[j]+OMS[22];
            ለነ=ገቢር.substring(0,3)+geez[j]+OMS[23];
            ለከ=ገቢር.substring(0,3)+geez[j]+OMS[0];
            ለክሙ=ገቢር.substring(0,3)+geez[j]+OMS[10];                
            ለኪ=ገቢር.substring(0,3)+geez[j]+OMS[2];  
            ለክን=ገቢር.substring(0,3)+geez[j]+OMS[3];
            ሎቱ=ገቢር.substring(0,3)+sabie[j];
            ሎሙ=ገቢር.substring(0,3)+sabie[j]+OMS[11];
            ላቲ=ገቢር.substring(0,3)+rabie[j];
            ሎን=ገቢር.substring(0,3)+sabie[j]+OMS[20];
                    } 
       }
 for(int j=0;j<sadis.length;j++){
      if( ste.substring(1,2).equals(salis[j])){
            ትንቢት="ት"+ste.substring(0,1)+sadis[j]+ste.substring(2,3);
          System.out.println("ትንቢት አንቀጽ:"+ትንቢት);
          for(int i=0;i<sadis.length;i++){
               if( ste.substring(2,3).equals(sadis[i])){
                       ትንቢት=ትንቢት;
             ሊተ_ት=ትንቢት.substring(0,3)+geez[i]+OMS[22];
             ለነ_ት=ትንቢት.substring(0,3)+geez[i]+OMS[23];
             ለከ_ት=ትንቢት.substring(0,3)+geez[i]+OMS[0];
             ለክሙ_ት=   ትንቢት.substring(0,3)+geez[i]+OMS[10] ;         
             ለኪ_ት=ትንቢት.substring(0,3)+geez[i]+OMS[2];  
             ለክን_ት=ትንቢት.substring(0,3)+geez[i]+OMS[3];
             ሎቱ_ት=ትንቢት.substring(0,3)+sabie[i] ;
             ሎሙ_ት=ትንቢት.substring(0,3)+sabie[i]+OMS[11];
             ላቲ_ት=ትንቢት.substring(0,3)+rabie[i];
             ሎን_ት=ትንቢት.substring(0,3)+sabie[i]+OMS[20];
                    } }}
       }
        for(int j=0;j<sadis.length;j++){
           if( ste.substring(0,1).equals(geez[j])){
            ትእዛዝ="ት"+sadis[j];
           }
            }
         for(int j=0;j<sadis.length;j++){
      if( ste.substring(1,2).equals(salis[j])){
            ትእዛዝ=ትእዛዝ+sadis[j]+ste.substring(2,3);
          System.out.println("ትእዛዝ አንቀጽ:"+ትእዛዝ);
          for(int i=0;i<sadis.length;i++){
               if( ste.substring(2,3).equals(sadis[i])){
             ሊተ_ትእ=ትእዛዝ.substring(0,3)+geez[i]+OMS[22];
             ለነ_ትእ=ትእዛዝ.substring(0,3)+geez[i]+OMS[23];
             ለከ_ትእ=ትእዛዝ+OMS[0];
             ለክሙ_ትእ= ትእዛዝ+OMS[10] ;         
             ለኪ_ትእ=ትእዛዝ+OMS[2];  
             ለክን_ትእ=ትእዛዝ+OMS[3];
             ሎቱ_ትእ=ትእዛዝ.substring(0,3)+sabie[i] ;
             ሎሙ_ትእ=ትእዛዝ.substring(0,3)+sabie[i]+OMS[11];
             ላቲ_ትእ=ትእዛዝ.substring(0,3)+rabie[i];
             ሎን_ትእ=ትእዛዝ.substring(0,3)+sabie[i]+OMS[20];
                    } }}
       }
         for(int j=0;j<sadis.length;j++){
           if( ste.substring(0,1).equals(geez[j])){
            ምክንያታዊ="ት"+sadis[j];
           }
            }
         for(int j=0;j<sadis.length;j++){
      if( ste.substring(1,2).equals(salis[j])){
            ምክንያታዊ=ምክንያታዊ+sadis[j]+ste.substring(2,3);
          for(int i=0;i<sadis.length;i++){
               if( ste.substring(2,3).equals(sadis[i])){
             ሊተ_ም=ምክንያታዊ.substring(0,3)+geez[i]+OMS[22];
             ለነ_ም=ምክንያታዊ.substring(0,3)+geez[i]+OMS[23];
             ለከ_ም=ምክንያታዊ.substring(0,4)+OMS[0];
             ለክሙ_ም= ምክንያታዊ.substring(0,4)+OMS[1] ;         
             ለኪ_ም=ምክንያታዊ.substring(0,4)+OMS[2];   
             ለክን_ም=ምክንያታዊ.substring(0,4)+OMS[3] ;
             ሎቱ_ም=ምክንያታዊ.substring(0,3)+sabie[i] ;
             ሎሙ_ም=ምክንያታዊ.substring(0,3)+sabie[i]+OMS[11];
             ላቲ_ም=ምክንያታዊ.substring(0,3)+rabie[i];
             ሎን_ም=ምክንያታዊ.substring(0,3)+sabie[i]+OMS[20];      
                    } }}
         } 
         String d="";
   for(int j=0;j<salis.length;j++){
     if( ste.substring(2,3).equals(sadis[j])){
         ቦዝ=ste.substring(0,2)+rabie[j];
           ሳቢዘር1 = geez[j];
         //ሳድስቅጽል=sadis[j];
        ሳልስቅጽል=salis[j];
        ss=sabie[j];
        ss1=rabie[j];
        d=kaeb[j];
    }}
   አርእስት1=ste.substring(0,2)+ss+"ታ";
   for(int j=0;j<salis.length;j++){
     if( ste.substring(0,1).equals(geez[j])){
         ሳቢዘር=sadis[j];
         ሳድስቅጽል=sadis[j];
    }}
   for(int j=0;j<salis.length;j++){
     if( ste.substring(1,2).equals(salis[j])){
        ሳድስቅጽል=ሳድስቅጽል+kaeb[j]+ss1;
        ሳድስቅጽል1=ሳድስቅጽል.substring(0, 2)+d;
        ሳልስቅጽል4=ste.substring(0,1)+rabie[j]+ሳልስቅጽል+"ት" ;
        ሳልስቅጽል=ste.substring(0,1)+rabie[j]+ሳልስቅጽል+"ሃ" ;
        ሳልስቅጽል1=ሳልስቅጽል.substring(0, 2)+ste.substring(2,3)+"ያኒሃ";
        ሳልስቅጽል2=ሳልስቅጽል.substring(0, 3)+"ታ";
        ሳልስቅጽል3=ሳልስቅጽል.substring(0, 2)+ste.substring(2,3)+"ያቲሃ";
        ሳቢዘር=ሳቢዘር+sadis[j]+ሳቢዘር1+"ታ";
    }}
        }
        break;
        case "አግብሮ/causative/":{
             for(int j=0;j<sadis.length;j++){
      if( ste.substring(0,1).equals(geez[j])){
            ገቢር="አ"+sadis[j]+ሓላፊ.substring(1,3)+"ት";
           
            for(int i=0;i<sadis.length;i++){
      if( ገቢር.substring(4,5).equals(sadis[i])){
           ሊተ=ገቢር.substring(0,4)+geez[i]+OMS[22];
            ለነ=ገቢር.substring(0,4)+geez[i]+OMS[23];
            ለከ=ገቢር.substring(0,4)+geez[i]+OMS[0];
            ለክሙ=ገቢር.substring(0,4)+geez[i]+OMS[10];                
            ለኪ=ገቢር.substring(0,4)+geez[i]+OMS[2];  
            ለክን=ገቢር.substring(0,4)+geez[i]+OMS[3];
            ሎቱ=ገቢር.substring(0,4)+sabie[i];
            ሎሙ=ገቢር.substring(0,4)+sabie[i]+OMS[11];
            ላቲ=ገቢር.substring(0,4)+rabie[i];
            ሎን=ገቢር.substring(0,4)+sabie[i]+OMS[20];
                    } 
       }}}
       for(int j=0;j<sadis.length;j++){
      if( ste.substring(1,2).equals(salis[j])){
            ትንቢት="ታ"+ste.substring(0,1)+sadis[j]+ste.substring(2,3);
          for(int i=0;i<sadis.length;i++){
               if( ste.substring(2,3).equals(sadis[i])){
             ሊተ_ት=ትንቢት.substring(0,3)+geez[i]+OMS[22];
             ለነ_ት=ትንቢት.substring(0,3)+geez[i]+OMS[23];
             ለከ_ት=ትንቢት.substring(0,3)+geez[i]+OMS[0];
             ለክሙ_ት=   ትንቢት.substring(0,3)+geez[i]+OMS[10] ;         
             ለኪ_ት=ትንቢት.substring(0,3)+geez[i]+OMS[2];  
             ለክን_ት=ትንቢት.substring(0,3)+geez[i]+OMS[3];
             ሎቱ_ት=ትንቢት.substring(0,3)+sabie[i] ;
             ሎሙ_ት=ትንቢት.substring(0,3)+sabie[i]+OMS[11];
             ላቲ_ት=ትንቢት.substring(0,3)+rabie[i];
             ሎን_ት=ትንቢት.substring(0,3)+sabie[i]+OMS[20];
                    } }}
       }
        for(int j=0;j<sadis.length;j++){
           if( ste.substring(0,1).equals(geez[j])){
            ትእዛዝ="ታ"+sadis[j];
           }
            }
         for(int j=0;j<sadis.length;j++){
      if( ste.substring(1,2).equals(salis[j])){
            ትእዛዝ=ትእዛዝ+sadis[j]+ste.substring(2,3);
          for(int i=0;i<sadis.length;i++){
               if( ste.substring(2,3).equals(sadis[i])){
                           ሊተ_ትእ=ትእዛዝ.substring(0,3)+geez[i]+OMS[22];
             ለነ_ትእ=ትእዛዝ.substring(0,3)+geez[i]+OMS[23];
             ለከ_ትእ=ትእዛዝ+OMS[0];
             ለክሙ_ትእ=   ትእዛዝ+OMS[10] ;         
             ለኪ_ትእ=ትእዛዝ+OMS[2];  
             ለክን_ትእ=ትእዛዝ+OMS[3] ;
             ሎቱ_ትእ=ትእዛዝ.substring(0,3)+sabie[i] ;
             ሎሙ_ትእ=ትእዛዝ.substring(0,3)+sabie[i]+OMS[11];
             ላቲ_ትእ=ትእዛዝ.substring(0,3)+rabie[i] ;
             ሎን_ትእ=ትእዛዝ.substring(0,3)+sabie[i]+OMS[20] ;
             //     
             ሊተ_ም=ትእዛዝ.substring(0,3)+geez[i]+OMS[22];
             ለነ_ም=ትእዛዝ.substring(0,3)+geez[i]+OMS[23];
             ለከ_ም=ትእዛዝ+OMS[0];
             ለክሙ_ም=   ትእዛዝ+OMS[10] ;         
             ለኪ_ም=ትእዛዝ+OMS[2];  
             ለክን_ም=ትእዛዝ+OMS[3] ;
             ሎቱ_ም=ትእዛዝ.substring(0,3)+sabie[i] ;
             ሎሙ_ም=ትእዛዝ.substring(0,3)+sabie[i]+OMS[11];
             ላቲ_ም=ትእዛዝ.substring(0,3)+rabie[i] ;
             ሎን_ም=ትእዛዝ.substring(0,3)+sabie[i]+OMS[20] ;
                    } }}
       }
         String d="";
   for(int j=0;j<salis.length;j++){
     if( ste.substring(2,3).equals(sadis[j])){
         ቦዝ=ገቢር.substring(0,2)+ste.substring(1,2)+rabie[j];
         ሳልስቅጽል=ገቢር.substring(0,2);
        ss=sabie[j];
        ss1=salis[j];
        d=hams[j];  
    }}
   for(int j=0;j<salis.length;j++){
     if( ste.substring(1,2).equals(salis[j])){
      
        አርእስት1=ቦዝ.substring(0,2)+sadis[j]+ss+"ታ";
        ሳልስቅጽል=ሳልስቅጽል+rabie[j]+ss1+"ት";
        ሳልስቅጽል4=ሳልስቅጽል.substring(0, 4)+"ሃ";
         ሳልስቅጽል1=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያኒሃ";
        ሳልስቅጽል2=ሳልስቅጽል.substring(0, 4)+"ታ";
        ሳልስቅጽል3=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያቲሃ";
        }}
        }
        
        break;
         case "አስተጋብሮ/causative-reciprocal/":{
             for(int j=0;j<sadis.length;j++){
      if( ste.substring(0,1).equals(geez[j])){
            ገቢር="አስተ"+rabie[j]+ሓላፊ.substring(1,3)+"ት";
            for(int i=0;i<sadis.length;i++){
      if( ገቢር.substring(6,7).equals(sadis[i])){
           ሊተ=ገቢር.substring(0,6)+geez[i]+OMS[22];
            ለነ=ገቢር.substring(0,6)+geez[i]+OMS[23];
            ለከ=ገቢር.substring(0,6)+geez[i]+OMS[0];
            ለክሙ=ገቢር.substring(0,6)+geez[i]+OMS[10];                
            ለኪ=ገቢር.substring(0,6)+geez[i]+OMS[2];  
            ለክን=ገቢር.substring(0,6)+geez[i]+OMS[3];
            ሎቱ=ገቢር.substring(0,6)+sabie[i];
            ሎሙ=ገቢር.substring(0,6)+sabie[i]+OMS[11];
            ላቲ=ገቢር.substring(0,6)+rabie[i];
            ሎን=ገቢር.substring(0,6)+sabie[i]+OMS[20];
                    } 
       }}}
                   for(int j=0;j<geez.length;j++){
      if( ste.substring(0,1).equals(geez[j])){
            ትንቢት="ታስተ"+rabie[j];
      }}
           for(int j=0;j<sadis.length;j++){
      if( ste.substring(1,2).equals(salis[j])){
            ትንቢት=ትንቢት+sadis[j]+ste.substring(2,3);
            ትእዛዝ=ትንቢት;
            ምክንያታዊ=ትንቢት;  
          for(int i=0;i<sadis.length;i++){
               if( ste.substring(2,3).equals(sadis[i])){
                   ሊተ_ት=ትንቢት.substring(0,5)+geez[i]+OMS[22];
             ለነ_ት=ትንቢት.substring(0,5)+geez[i]+OMS[23];
             ለከ_ት=ትንቢት.substring(0,5)+geez[i]+OMS[0];
             ለክሙ_ት=   ትንቢት.substring(0,5)+geez[i]+OMS[10] ;         
             ለኪ_ት=ትንቢት.substring(0,5)+geez[i]+OMS[2];  
             ለክን_ት=ትንቢት.substring(0,5)+geez[i]+OMS[3];
             ሎቱ_ት=ትንቢት.substring(0,5)+sabie[i] ;
             ሎሙ_ት=ትንቢት.substring(0,5)+sabie[i]+OMS[11];
             ላቲ_ት=ትንቢት.substring(0,5)+rabie[i];
             ሎን_ት=ትንቢት.substring(0,5)+sabie[i]+OMS[20];
                    } }}
       }
           for(int i=0;i<sadis.length;i++){
               if( ste.substring(2,3).equals(sadis[i])){
         
                   ሊተ_ትእ=ትንቢት.substring(0,5)+geez[i]+OMS[22];
             ለነ_ትእ=ትንቢት.substring(0,5)+geez[i]+OMS[23];
             ለከ_ትእ=ትንቢት.substring(0,5)+geez[i]+OMS[0];
             ለክሙ_ትእ=   ትንቢት.substring(0,5)+geez[i]+OMS[10] ;         
             ለኪ_ትእ=ትንቢት.substring(0,5)+geez[i]+OMS[2];  
             ለክን_ትእ=ትንቢት.substring(0,5)+geez[i]+OMS[3];
             ሎቱ_ትእ=ትንቢት.substring(0,5)+sabie[i] ;
             ሎሙ_ትእ=ትንቢት.substring(0,5)+sabie[i]+OMS[11];
             ላቲ_ትእ=ትንቢት.substring(0,5)+rabie[i];
             ሎን_ትእ=ትንቢት.substring(0,5)+sabie[i]+OMS[20];
             //
             ሊተ_ም=ትንቢት.substring(0,5)+geez[i]+OMS[22];
             ለነ_ም=ትንቢት.substring(0,5)+geez[i]+OMS[23];
             ለከ_ም=ትንቢት.substring(0,5)+geez[i]+OMS[0];
             ለክሙ_ም=   ትንቢት.substring(0,5)+geez[i]+OMS[10] ;         
             ለኪ_ም=ትንቢት.substring(0,5)+geez[i]+OMS[2];  
             ለክን_ም=ትንቢት.substring(0,5)+geez[i]+OMS[3];
             ሎቱ_ም=ትንቢት.substring(0,5)+sabie[i] ;
             ሎሙ_ም=ትንቢት.substring(0,5)+sabie[i]+OMS[11];
             ላቲ_ም=ትንቢት.substring(0,5)+rabie[i];
             ሎን_ም=ትንቢት.substring(0,5)+sabie[i]+OMS[20];
               }}
           //?
                  for(int j=0;j<geez.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           ቦዝ=ገቢር.substring(0, 4)+ste.substring(1,2)+salis[j];
           ss=salis[j];
         }}
               for(int j=0;j<geez.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           አርእስት1=ገቢር.substring(0, 4)+sadis[j];
           ሳልስቅጽል=ገቢር.substring(0, 4)+rabie[j]+ss;
           ሳልስቅጽል1=ሳልስቅጽል.substring(0, 5)+ste.substring(2,3)+"ያኒሁ";
        ሳልስቅጽል2=ሳልስቅጽል.substring(0, 6)+"ቱ";
        ሳልስቅጽል3=ሳልስቅጽል.substring(0, 5)+ste.substring(2,3)+"ያቲሁ";
               }} 
               for(int j=0;j<salis.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           አርእስት1=አርእስት1+sabie[j];
           አርእስት1=አርእስት1+"ታ";
         }}
        }
         break;
         case "ተገብሮ/reflexive/":{
             for(int j=0;j<salis.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           ተገብሮ="ተ"+ste.substring(0,1)+sadis[j];
         }}
               for(int j=0;j<geez.length;j++){
         if( ሓላፊ.substring(2,3).equals(geez[j])){
           ገቢር=ተገብሮ+geez[j]+"ት";
               }}
                for(int j=0;j<salis.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           ትንቢት="ትት"+ste.substring(0,1)+geez[j];
           ቅርብ_ትእዛዝ="ተ"+ste.substring(0,1)+geez[j]+ste.substring(2,3);
         }}
               for(int j=0;j<geez.length;j++){
         if( ሓላፊ.substring(2,3).equals(geez[j])){
           ትንቢት=ትንቢት+sadis[j];
           ምክንያታዊ=ትእዛዝ=ትንቢት;
               }}
              for(int j=0;j<salis.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           ቦዝ="ተ"+ste.substring(0,2)+rabie[j];
           ss=salis[j];
         }}
               for(int j=0;j<geez.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
             //?
           አርእስት1="ተ"+ste.substring(0,1)+sadis[j];
            ሳልስቅጽል="ተ"+ste.substring(0,1)+rabie[j]+ss;
           ሳልስቅጽል1=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያኒሁ";
        ሳልስቅጽል2=ሳልስቅጽል.substring(0, 4)+"ቱ";
        ሳልስቅጽል3=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያቲሁ";
               }} 
               for(int j=0;j<salis.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           አርእስት1=አርእስት1+sabie[j];
           አርእስት1=አርእስት1+"ታ";
         }}
         }
         break;
         case "ተጋብሮ/reciprocal/":{
             for(int j=0;j<geez.length;j++){
         if( ste.substring(0,1).equals(geez[j])){
           ገቢር="ተ"+rabie[j]+ሓላፊ.substring(1,3)+"ት";
            for(int i=0;i<sadis.length;i++){
      if( ገቢር.substring(4,5).equals(sadis[i])){
           ሊተ=ገቢር.substring(0,4)+geez[i]+OMS[22];
            ለነ=ገቢር.substring(0,4)+geez[i]+OMS[23];
            ለከ=ገቢር.substring(0,4)+geez[i]+OMS[0];
            ለክሙ=ገቢር.substring(0,4)+geez[i]+OMS[10];                
            ለኪ=ገቢር.substring(0,4)+geez[i]+OMS[2];  
            ለክን=ገቢር.substring(0,4)+geez[i]+OMS[3];
            ሎቱ=ገቢር.substring(0,4)+sabie[i];
            ሎሙ=ገቢር.substring(0,4)+sabie[i]+OMS[11];
            ላቲ=ገቢር.substring(0,4)+rabie[i];
            ሎን=ገቢር.substring(0,4)+sabie[i]+OMS[20];
               }}}}
                for(int j=0;j<geez.length;j++){
         if( ste.substring(0,1).equals(geez[j])){
           ትንቢት="ትት"+rabie[j]+ሓላፊ.substring(1,2);
           ቅርብ_ትእዛዝ="ተ"+rabie[j]+ሓላፊ.substring(1,2);;
         }}
               for(int i=0;i<geez.length;i++){
         if( ሓላፊ.substring(2,3).equals(geez[i])){
           ትንቢት=ትንቢት+sadis[i];
                  ሊተ_ት=ትንቢት.substring(0,4)+geez[i]+OMS[22];
             ለነ_ት=ትንቢት.substring(0,4)+geez[i]+OMS[23];
             ለከ_ት=ትንቢት.substring(0,4)+geez[i]+OMS[0];
             ለክሙ_ት=   ትንቢት.substring(0,4)+geez[i]+OMS[10] ;         
             ለኪ_ት=ትንቢት.substring(0,4)+geez[i]+OMS[2];  
             ለክን_ት=ትንቢት.substring(0,4)+geez[i]+OMS[3];
             ሎቱ_ት=ትንቢት.substring(0,4)+sabie[i] ;
             ሎሙ_ት=ትንቢት.substring(0,4)+sabie[i]+OMS[11];
             ላቲ_ት=ትንቢት.substring(0,4)+rabie[i];
             ሎን_ት=ትንቢት.substring(0,4)+sabie[i]+OMS[20];
         
                   ሊተ_ትእ=ትንቢት.substring(0,4)+geez[i]+OMS[22];
             ለነ_ትእ=ትንቢት.substring(0,4)+geez[i]+OMS[23];
             ለከ_ትእ=ትንቢት.substring(0,4)+geez[i]+OMS[0];
             ለክሙ_ትእ=   ትንቢት.substring(0,4)+geez[i]+OMS[10] ;         
             ለኪ_ትእ=ትንቢት.substring(0,4)+geez[i]+OMS[2];  
             ለክን_ትእ=ትንቢት.substring(0,4)+geez[i]+OMS[3];
             ሎቱ_ትእ=ትንቢት.substring(0,4)+sabie[i] ;
             ሎሙ_ትእ=ትንቢት.substring(0,4)+sabie[i]+OMS[11];
             ላቲ_ትእ=ትንቢት.substring(0,4)+rabie[i];
             ሎን_ትእ=ትንቢት.substring(0,4)+sabie[i]+OMS[20];
             //
             ሊተ_ም=ትንቢት.substring(0,4)+geez[i]+OMS[22];
             ለነ_ም=ትንቢት.substring(0,4)+geez[i]+OMS[23];
             ለከ_ም=ትንቢት.substring(0,4)+geez[i]+OMS[0];
             ለክሙ_ም=   ትንቢት.substring(0,4)+geez[i]+OMS[10] ;         
             ለኪ_ም=ትንቢት.substring(0,4)+geez[i]+OMS[2];  
             ለክን_ም=ትንቢት.substring(0,4)+geez[i]+OMS[3];
             ሎቱ_ም=ትንቢት.substring(0,4)+sabie[i] ;
             ሎሙ_ም=ትንቢት.substring(0,4)+sabie[i]+OMS[11];
             ላቲ_ም=ትንቢት.substring(0,4)+rabie[i];
             ሎን_ም=ትንቢት.substring(0,4)+sabie[i]+OMS[20];
           ቅርብ_ትእዛዝ=ቅርብ_ትእዛዝ+sadis[i];
           ትእዛዝ=ትንቢት;
            ምክንያታዊ=ትንቢት;
               }}
              for(int j=0;j<salis.length;j++){
         if( ste.substring(0,1).equals(geez[j])){
           ቦዝ="ተ"+rabie[j]+ste.substring(1, 2);
           አርእስት="ተ"+rabie[j];
            ሳልስቅጽል="ተ"+rabie[j];
         }}
               for(int j=0;j<geez.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           አርእስት1=አርእስት1+sadis[j];
           ሳልስቅጽል=ሳልስቅጽል+rabie[j];       
               }} 
               for(int j=0;j<salis.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
             ሳልስቅጽል=ሳልስቅጽል+salis[j]+"ት";
               ሳልስቅጽል1=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያኒሃ";
        ሳልስቅጽል2=ሳልስቅጽል.substring(0, 4)+"ታ";
        ሳልስቅጽል3=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያቲሃ";
           ቦዝ=ቦዝ+rabie[j];
           አርእስት1=አርእስት1+sabie[j]+"ታ";
         }}
         }
   }}
        break;
           case "ውእቶሙ/They(3ppm)/":{
       switch(stemType)
   {
        case "ገቢር/perfective/":{
            for(int j=0;j<sadis.length;j++){
      if( ste.substring(2,3).equals(sadis[j])){
            ገቢር=ሓላፊ.substring(0,2)+kaeb[j];
            ሊተ=ገቢር+OMS[22];
            ለነ=ገቢር+OMS[23];
            ለከ=ገቢር+OMS[0];
            ለክሙ=ገቢር+OMS[10];                
            ለኪ=ገቢር+OMS[2];  
            ለክን=ገቢር+OMS[3];
            ሎቱ=ገቢር.substring(0,2)+sadis[j]+OMS[7];
            ሎሙ=ገቢር.substring(0,2)+sadis[j]+OMS[9];
            ላቲ=ገቢር.substring(0,2)+sadis[j]+OMS[14];
            ሎን=ገቢር.substring(0,2)+sadis[j]+OMS[18];
                    } 
       }
       for(int j=0;j<sadis.length;j++){
      if( ste.substring(1,2).equals(salis[j])){
             ትንቢት="ይ"+ste.substring(0,1)+sadis[j]+ገቢር.substring(2,3);
          System.out.println("ትንቢት አንቀጽ:"+ትንቢት);
          for(int i=0;i<sadis.length;i++){
               if( ste.substring(2,3).equals(sadis[i])){
                       ትንቢት=ትንቢት;
             ሊተ_ት=ትንቢት.substring(0,4)+OMS[22];
             ለነ_ት=ትንቢት.substring(0,4)+OMS[23];
             ለከ_ት=ትንቢት.substring(0,4)+OMS[0];
             ለክሙ_ት=   ትንቢት.substring(0,4)+OMS[10] ;         
             ለኪ_ት=ትንቢት.substring(0,4)+OMS[2];  
             ለክን_ት=ትንቢት.substring(0,4)+OMS[3];
             ሎቱ_ት=ትንቢት.substring(0,3)+sadis[i]+OMS[7] ;
             ሎሙ_ት=ትንቢት.substring(0,3)+sadis[i]+OMS[9];
             ላቲ_ት=ትንቢት.substring(0,3)+sadis[i]+OMS[14];
             ሎን_ት=ትንቢት.substring(0,3)+sadis[i]+OMS[18];
                    } }}
       }
        for(int j=0;j<sadis.length;j++){
           if( ste.substring(0,1).equals(geez[j])){
            ትእዛዝ="ይ"+sadis[j];
           }
            }
         for(int j=0;j<sadis.length;j++){
      if( ste.substring(1,2).equals(salis[j])){
            ትእዛዝ=ትእዛዝ+sadis[j];
          System.out.println("ትእዛዝ አንቀጽ:"+ትእዛዝ);
          for(int i=0;i<sadis.length;i++){
               if( ste.substring(2,3).equals(sadis[i])){
                   ትእዛዝ=ትእዛዝ+kaeb[i];
             ሊተ_ትእ=ትእዛዝ.substring(0,4)+OMS[22];
             ለነ_ትእ=ትእዛዝ.substring(0,4)+OMS[23];
             ለከ_ትእ=ትእዛዝ+OMS[0];
             ለክሙ_ትእ= ትእዛዝ+OMS[10] ;         
             ለኪ_ትእ=ትእዛዝ+OMS[2];  
             ለክን_ትእ=ትእዛዝ+OMS[3];
             ሎቱ_ትእ=ትእዛዝ.substring(0,3)+sadis[i] +OMS[7];
             ሎሙ_ትእ=ትእዛዝ.substring(0,3)+sadis[i]+OMS[9];
             ላቲ_ትእ=ትእዛዝ.substring(0,3)+sadis[i]+OMS[14];
             ሎን_ትእ=ትእዛዝ.substring(0,3)+sadis[i]+OMS[18];
             ምክንያታዊ=ትእዛዝ;
             ሊተ_ም=ምክንያታዊ.substring(0,4)+OMS[22];
             ለነ_ም=ምክንያታዊ.substring(0,4)+OMS[23];
             ለከ_ም=ምክንያታዊ.substring(0,4)+OMS[0];
             ለክሙ_ም= ምክንያታዊ.substring(0,4)+OMS[1] ;         
             ለኪ_ም=ምክንያታዊ.substring(0,4)+OMS[2];   
             ለክን_ም=ምክንያታዊ.substring(0,4)+OMS[3] ;
             ሎቱ_ም=ምክንያታዊ.substring(0,3)+sadis[i] +OMS[7];
             ሎሙ_ም=ምክንያታዊ.substring(0,3)+sadis[i]+OMS[9];
             ላቲ_ም=ምክንያታዊ.substring(0,3)+sadis[i]+OMS[14];
             ሎን_ም=ምክንያታዊ.substring(0,3)+sadis[i]+OMS[18];
                    } }}
         } 
         String d="";
   for(int j=0;j<salis.length;j++){
     if( ste.substring(2,3).equals(sadis[j])){
         //?
         ቦዝ=ste.substring(0,2)+sabie[j]+SMS[12];  
        ሳልስቅጽል=salis[j];
        ss=sabie[j];
        ss1=sadis[j];
        d=kaeb[j];
    }}
  
   አርእስት1=ste.substring(0,2)+ss+"ቶ"+SMS[12];
   for(int j=0;j<salis.length;j++){
     if( ste.substring(0,1).equals(geez[j])){
         ሳቢዘር=sadis[j];
         ሳድስቅጽል=sadis[j];
    }}
   for(int j=0;j<salis.length;j++){
     if( ste.substring(1,2).equals(salis[j])){
        ሳድስቅጽል=ሳድስቅጽል+kaeb[j]+ss1;
        ሳድስቅጽል1=ሳድስቅጽል.substring(0, 2)+d;
        ሳልስቅጽል4=ste.substring(0,1)+rabie[j]+ሳልስቅጽል ;
        ሳልስቅጽል=ste.substring(0,1)+rabie[j]+ሳልስቅጽል+"ሁ" ;
        ሳልስቅጽል1=ሳልስቅጽል.substring(0, 2)+ste.substring(2,3)+"ያኒሆሙ";
        ሳልስቅጽል2=ሳልስቅጽል.substring(0, 3)+"ቱ";
        ሳልስቅጽል3=ሳልስቅጽል.substring(0, 2)+ste.substring(2,3)+"ያቲሆሙ";
        ሳቢዘር=ሳቢዘር+sadis[j]+ሳቢዘር1+"ቶሙ";
    }}
        }
        break;
        case "አግብሮ/causative/":{
      for(int j=0;j<sadis.length;j++){
      if( ste.substring(0,1).equals(geez[j])){
           for(int i=0;i<sadis.length;i++){
      if( ste.substring(2,3).equals(sadis[i])){
           ገቢር="አ"+sadis[j]+ሓላፊ.substring(1,2)+kaeb[i];
           for(int m=0;m<sadis.length;m++){
               if( ste.substring(1,2).equals(salis[m])){
            ትንቢት="ያ"+ste.substring(0,1)+sadis[m]+kaeb[i];
             ምክንያታዊ= ትእዛዝ="ያ"+sadis[j]+sadis[m]+kaeb[i];;
      }}}
      }}}
            ሊተ=ገቢር+OMS[22];
            ለነ=ገቢር+OMS[23];
            ለከ=ገቢር+OMS[0];
            ለክሙ=ገቢር+OMS[10];                
            ለኪ=ገቢር+OMS[2];  
            ለክን=ገቢር+OMS[3];
            for(int i=0;i<kaeb.length;i++){
      if( ste.substring(2,3).equals(sadis[i])){
          ሎቱ=ገቢር.substring(0,3)+sadis[i] +OMS[7];;
            ሎሙ=ገቢር.substring(0,3)+sadis[i] +OMS[9];
            ላቲ=ገቢር.substring(0,3)+sadis[i] +OMS[14];
            ሎን=ገቢር.substring(0,3)+sadis[i] +OMS[18];
             ሊተ_ት=ትንቢት+OMS[22];
             ለነ_ት=ትንቢት+OMS[23];
             ለከ_ት=ትንቢት+OMS[0];
             ለክሙ_ት=   ትንቢት+OMS[10] ;         
             ለኪ_ት=ትንቢት+OMS[2];  
             ለክን_ት=ትንቢት+OMS[3];
             ሎቱ_ት=ትንቢት.substring(0,3)+sadis[i] +OMS[7];
             ሎሙ_ት=ትንቢት.substring(0,3)+sadis[i]+OMS[9];
             ላቲ_ት=ትንቢት.substring(0,3)+sadis[i]+OMS[14];;
             ሎን_ት=ትንቢት.substring(0,3)+sadis[i]+OMS[18];
           
             ሊተ_ትእ=ትእዛዝ+OMS[22];
             ለነ_ትእ=ትእዛዝ+OMS[23];
             ለከ_ትእ=ትእዛዝ+OMS[0];
             ለክሙ_ትእ=   ትእዛዝ+OMS[10] ;         
             ለኪ_ትእ=ትእዛዝ+OMS[2];  
             ለክን_ትእ=ትእዛዝ+OMS[3] ;
             ሎቱ_ትእ=ትእዛዝ.substring(0,3)+sadis[i] +OMS[7];
             ሎሙ_ትእ=ትእዛዝ.substring(0,3)+sadis[i]+OMS[9];
             ላቲ_ትእ=ትእዛዝ.substring(0,3)+sadis[i] +OMS[14] ;
             ሎን_ትእ=ትእዛዝ.substring(0,3)+sadis[i]+OMS[18] ;
             //     
             ሊተ_ም=ትእዛዝ+OMS[22];
             ለነ_ም=ትእዛዝ+OMS[23];
             ለከ_ም=ትእዛዝ+OMS[0];
             ለክሙ_ም=   ትእዛዝ+OMS[10] ;         
             ለኪ_ም=ትእዛዝ+OMS[2];  
             ለክን_ም=ትእዛዝ+OMS[3] ;
             ሎቱ_ም=ትእዛዝ.substring(0,3)+sadis[i] +OMS[7] ;
             ሎሙ_ም=ትእዛዝ.substring(0,3)+sadis[i]+OMS[9];
             ላቲ_ም=ትእዛዝ.substring(0,3)+sadis[i]+OMS[14]  ;
             ሎን_ም=ትእዛዝ.substring(0,3)+sadis[i]+OMS[18] ;
                    } 
       }
         String d="";
   for(int j=0;j<salis.length;j++){
     if( ste.substring(2,3).equals(sadis[j])){
         ቦዝ=ገቢር.substring(0,2)+ste.substring(1,2)+sabie[j]+SMS[12];
        // ሳልስቅጽል=ገቢር.substring(0,2);
        ss=sabie[j];
        ss1=salis[j];
        d=hams[j];  
    }}
   for(int j=0;j<salis.length;j++){
     if( ste.substring(1,2).equals(salis[j])){
        //    አርእስት=ቦዝ.substring(0,2)+sadis[j]+ቦዝ.substring(3,4);
        አርእስት1=ቦዝ.substring(0,2)+sadis[j]+ቦዝ.substring(3,4)+"ቶ"+SMS[12];
     /*   ሳልስቅጽል=ሳልስቅጽል+rabie[j]+ss1;
         ሳልስቅጽል1=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያኒ"+OMS[12];
        ሳልስቅጽል2=ሳልስቅጽል.substring(0, 4)+"ቶ"+OMS[12];
        ሳልስቅጽል3=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያቲ"+OMS[12];*/
        }}
        }
        
        break;
         case "አስተጋብሮ/causative-reciprocal/":{
              for(int j=0;j<sadis.length;j++){
      if( ste.substring(0,1).equals(geez[j])){
           for(int i=0;i<sadis.length;i++){
      if( ste.substring(2,3).equals(sadis[i])){
           ገቢር="አስተ"+rabie[j]+ሓላፊ.substring(1,2)+kaeb[i];
           for(int m=0;m<sadis.length;m++){
               if( ste.substring(1,2).equals(salis[m])){
            //ትንቢት="ያስተ"+ste.substring(0,1)+sadis[m]+kaeb[i];
             ትንቢት=ምክንያታዊ= ትእዛዝ="ያስተ"+rabie[j]+sadis[m]+kaeb[i];;
      }}}
      }}}
            ሊተ=ገቢር+OMS[22];
            ለነ=ገቢር+OMS[23];
            ለከ=ገቢር+OMS[0];
            ለክሙ=ገቢር+OMS[10];                
            ለኪ=ገቢር+OMS[2];  
            ለክን=ገቢር+OMS[3];
            for(int i=0;i<kaeb.length;i++){
      if( ste.substring(2,3).equals(sadis[i])){
          ሎቱ=ገቢር.substring(0,5)+sadis[i] +OMS[7];;
            ሎሙ=ገቢር.substring(0,5)+sadis[i] +OMS[9];
            ላቲ=ገቢር.substring(0,5)+sadis[i] +OMS[14];
            ሎን=ገቢር.substring(0,5)+sadis[i] +OMS[18];
             ሊተ_ት=ትንቢት+OMS[22];
             ለነ_ት=ትንቢት+OMS[23];
             ለከ_ት=ትንቢት+OMS[0];
             ለክሙ_ት=   ትንቢት+OMS[10] ;         
             ለኪ_ት=ትንቢት+OMS[2];  
             ለክን_ት=ትንቢት+OMS[3];
             ሎቱ_ት=ትንቢት.substring(0,5)+sadis[i] +OMS[7];
             ሎሙ_ት=ትንቢት.substring(0,5)+sadis[i]+OMS[9];
             ላቲ_ት=ትንቢት.substring(0,5)+sadis[i]+OMS[14];;
             ሎን_ት=ትንቢት.substring(0,5)+sadis[i]+OMS[18];
           
             ሊተ_ትእ=ትእዛዝ+OMS[22];
             ለነ_ትእ=ትእዛዝ+OMS[23];
             ለከ_ትእ=ትእዛዝ+OMS[0];
             ለክሙ_ትእ=   ትእዛዝ+OMS[10] ;         
             ለኪ_ትእ=ትእዛዝ+OMS[2];  
             ለክን_ትእ=ትእዛዝ+OMS[3] ;
             ሎቱ_ትእ=ትእዛዝ.substring(0,5)+sadis[i] +OMS[7];
             ሎሙ_ትእ=ትእዛዝ.substring(0,5)+sadis[i]+OMS[9];
             ላቲ_ትእ=ትእዛዝ.substring(0,5)+sadis[i] +OMS[14] ;
             ሎን_ትእ=ትእዛዝ.substring(0,5)+sadis[i]+OMS[18] ;
             //     
             ሊተ_ም=ትእዛዝ+OMS[22];
             ለነ_ም=ትእዛዝ+OMS[23];
             ለከ_ም=ትእዛዝ+OMS[0];
             ለክሙ_ም=   ትእዛዝ+OMS[10] ;         
             ለኪ_ም=ትእዛዝ+OMS[2];  
             ለክን_ም=ትእዛዝ+OMS[3] ;
             ሎቱ_ም=ትእዛዝ.substring(0,5)+sadis[i] +OMS[7] ;
             ሎሙ_ም=ትእዛዝ.substring(0,5)+sadis[i]+OMS[9];
             ላቲ_ም=ትእዛዝ.substring(0,5)+sadis[i]+OMS[14]  ;
             ሎን_ም=ትእዛዝ.substring(0,5)+sadis[i]+OMS[18] ;
                    } 
       }
     
                  for(int j=0;j<geez.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           ቦዝ=ገቢር.substring(0, 4)+ste.substring(1,2)+sabie[j]+SMS[12];
           ss=salis[j];
         }}
               for(int j=0;j<geez.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           አርእስት1=ገቢር.substring(0, 4)+sadis[j];
           ሳልስቅጽል=ገቢር.substring(0, 4)+rabie[j]+ss;
           ሳልስቅጽል1=ሳልስቅጽል.substring(0, 5)+ste.substring(2,3)+"ያኒ"+OMS[13];
           ሳልስቅጽል2=ሳልስቅጽል.substring(0, 6)+"ቶ"+SMS[12];
           ሳልስቅጽል3=ሳልስቅጽል.substring(0, 5)+ste.substring(2,3)+"ያቲ"+OMS[13];
               }} 
               for(int j=0;j<salis.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           አርእስት1=አርእስት1+sabie[j];
           አርእስት1=አርእስት1+"ቶ"+SMS[12];
         }}
        }
         break;
               case "ተገብሮ/reflexive/":{
             for(int j=0;j<salis.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           ተገብሮ="ተ"+ste.substring(0,1)+sadis[j];
         }}
               for(int j=0;j<geez.length;j++){
         if( ሓላፊ.substring(2,3).equals(geez[j])){
           ገቢር=ተገብሮ+kaeb[j];
               }}
                for(int j=0;j<salis.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           ትንቢት="ይት"+ste.substring(0,1)+geez[j];
           ቅርብ_ትእዛዝ="ተ"+ste.substring(0,1)+geez[j]+ste.substring(2,3);
         }}
               for(int j=0;j<geez.length;j++){
         if( ሓላፊ.substring(2,3).equals(geez[j])){
           ትንቢት=ትንቢት+kaeb[j];
           ምክንያታዊ=ትእዛዝ=ትንቢት;
               }}
              for(int j=0;j<salis.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           ቦዝ="ተ"+ste.substring(0,2)+sabie[j]+SMS[12];
           ss=salis[j];
         }}
               for(int j=0;j<geez.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           አርእስት1="ተ"+ste.substring(0,1)+sadis[j];
          // ሳልስቅጽል="ተ"+ste.substring(0,1)+rabie[j]+ss;
          
               }} 
               for(int j=0;j<salis.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           አርእስት1=አርእስት1+sabie[j];
           አርእስት1=አርእስት1+"ቶ"+SMS[12];
         }}
         }
         break;
         case "ተጋብሮ/reciprocal/":{
               for(int j=0;j<sadis.length;j++){
      if( ste.substring(0,1).equals(geez[j])){
           for(int i=0;i<sadis.length;i++){
      if( ste.substring(2,3).equals(sadis[i])){
           ገቢር="ተ"+rabie[j]+ሓላፊ.substring(1,2)+kaeb[i];
           for(int m=0;m<sadis.length;m++){
               if( ste.substring(1,2).equals(salis[m])){
          ምክንያታዊ= ትእዛዝ= ትንቢት="ይት"+rabie[j]+geez[m]+kaeb[i];
            // ምክንያታዊ= ትእዛዝ="ያ"+sadis[j]+sadis[m]+kaeb[i];;
      }}}
      }}}
            ሊተ=ገቢር+OMS[22];
            ለነ=ገቢር+OMS[23];
            ለከ=ገቢር+OMS[0];
            ለክሙ=ገቢር+OMS[10];                
            ለኪ=ገቢር+OMS[2];  
            ለክን=ገቢር+OMS[3];
            for(int i=0;i<kaeb.length;i++){
      if( ste.substring(2,3).equals(sadis[i])){
          ሎቱ=ገቢር.substring(0,3)+sadis[i] +OMS[7];;
            ሎሙ=ገቢር.substring(0,3)+sadis[i] +OMS[9];
            ላቲ=ገቢር.substring(0,3)+sadis[i] +OMS[14];
            ሎን=ገቢር.substring(0,3)+sadis[i] +OMS[18];
             ሊተ_ት=ትንቢት+OMS[22];
             ለነ_ት=ትንቢት+OMS[23];
             ለከ_ት=ትንቢት+OMS[0];
             ለክሙ_ት=   ትንቢት+OMS[10] ;         
             ለኪ_ት=ትንቢት+OMS[2];  
             ለክን_ት=ትንቢት+OMS[3];
             ሎቱ_ት=ትንቢት.substring(0,4)+sadis[i] +OMS[7];
             ሎሙ_ት=ትንቢት.substring(0,4)+sadis[i]+OMS[9];
             ላቲ_ት=ትንቢት.substring(0,4)+sadis[i]+OMS[14];;
             ሎን_ት=ትንቢት.substring(0,4)+sadis[i]+OMS[18];
           
             ሊተ_ትእ=ትእዛዝ+OMS[22];
             ለነ_ትእ=ትእዛዝ+OMS[23];
             ለከ_ትእ=ትእዛዝ+OMS[0];
             ለክሙ_ትእ=   ትእዛዝ+OMS[10] ;         
             ለኪ_ትእ=ትእዛዝ+OMS[2];  
             ለክን_ትእ=ትእዛዝ+OMS[3] ;
             ሎቱ_ትእ=ትእዛዝ.substring(0,4)+sadis[i] +OMS[7];
             ሎሙ_ትእ=ትእዛዝ.substring(0,4)+sadis[i]+OMS[9];
             ላቲ_ትእ=ትእዛዝ.substring(0,4)+sadis[i] +OMS[14] ;
             ሎን_ትእ=ትእዛዝ.substring(0,4)+sadis[i]+OMS[18] ;
             //     
             ሊተ_ም=ትእዛዝ+OMS[22];
             ለነ_ም=ትእዛዝ+OMS[23];
             ለከ_ም=ትእዛዝ+OMS[0];
             ለክሙ_ም=   ትእዛዝ+OMS[10] ;         
             ለኪ_ም=ትእዛዝ+OMS[2];  
             ለክን_ም=ትእዛዝ+OMS[3] ;
             ሎቱ_ም=ትእዛዝ.substring(0,4)+sadis[i] +OMS[7] ;
             ሎሙ_ም=ትእዛዝ.substring(0,4)+sadis[i]+OMS[9];
             ላቲ_ም=ትእዛዝ.substring(0,4)+sadis[i]+OMS[14]  ;
             ሎን_ም=ትእዛዝ.substring(0,4)+sadis[i]+OMS[18] ;
                    } 
       }
               
              for(int j=0;j<salis.length;j++){
         if( ste.substring(0,1).equals(geez[j])){
           ቦዝ="ተ"+rabie[j]+ste.substring(1, 2);
           አርእስት1="ተ"+rabie[j];
            //ሳልስቅጽል="ተ"+rabie[j];
           
         }}
               for(int j=0;j<geez.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           አርእስት1=አርእስት1+sadis[j];
          // ሳልስቅጽል=ሳልስቅጽል+rabie[j];
         
               }} 
               for(int j=0;j<salis.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
             
           ቦዝ=ቦዝ+sabie[j]+SMS[12];
           አርእስት1=አርእስት1+sabie[j]+"ቶ"+SMS[12];
           
         }}
         }
   }}
       break;
                
      case "ውእቶን/They(3ppf)/":{
       switch(stemType)
   {
        case "ገቢር/perfective/":{
            for(int j=0;j<sadis.length;j++){
      if( ste.substring(2,3).equals(sadis[j])){
            ገቢር=ሓላፊ.substring(0,2)+rabie[j];
            ሊተ=ገቢር+OMS[22];
            ለነ=ገቢር+OMS[23];
            ለከ=ገቢር+OMS[0];
            ለክሙ=ገቢር+OMS[10];                
            ለኪ=ገቢር+OMS[2];  
            ለክን=ገቢር+OMS[3];
            ሎቱ=ገቢር.substring(0,3)+OMS[5];
            ሎሙ=ገቢር.substring(0,3)+OMS[12];
            ላቲ=ገቢር.substring(0,3)+OMS[14];
            ሎን=ገቢር.substring(0,3)+OMS[19];
                    } 
       }
       for(int j=0;j<sadis.length;j++){
      if( ste.substring(1,2).equals(salis[j])){
             ትንቢት="ይ"+ste.substring(0,1)+sadis[j]+ገቢር.substring(2,3);
          System.out.println("ትንቢት አንቀጽ:"+ትንቢት);
          for(int i=0;i<sadis.length;i++){
               if( ste.substring(2,3).equals(sadis[i])){
                       ትንቢት=ትንቢት;
             ሊተ_ት=ትንቢት.substring(0,4)+OMS[22];
             ለነ_ት=ትንቢት.substring(0,4)+OMS[23];
             ለከ_ት=ትንቢት.substring(0,4)+OMS[0];
             ለክሙ_ት=   ትንቢት.substring(0,4)+OMS[10] ;         
             ለኪ_ት=ትንቢት.substring(0,4)+OMS[2];  
             ለክን_ት=ትንቢት.substring(0,4)+OMS[3];
             ሎቱ_ት=ትንቢት.substring(0,4)+OMS[5] ;
             ሎሙ_ት=ትንቢት.substring(0,4)+OMS[12];
             ላቲ_ት=ትንቢት.substring(0,4)+OMS[15];
             ሎን_ት=ትንቢት.substring(0,4)+OMS[19];
                    } }}
       }
        for(int j=0;j<sadis.length;j++){
           if( ste.substring(0,1).equals(geez[j])){
            ትእዛዝ="ይ"+sadis[j];
           }
            }
         for(int j=0;j<sadis.length;j++){
      if( ste.substring(1,2).equals(salis[j])){
            ትእዛዝ=ትእዛዝ+sadis[j];
          System.out.println("ትእዛዝ አንቀጽ:"+ትእዛዝ);
          for(int i=0;i<sadis.length;i++){
               if( ste.substring(2,3).equals(sadis[i])){
                 ምክንያታዊ=  ትእዛዝ=ትእዛዝ+rabie[i];
             ሊተ_ትእ=ትእዛዝ.substring(0,4)+OMS[22];
             ለነ_ትእ=ትእዛዝ.substring(0,4)+OMS[23];
             ለከ_ትእ=ትእዛዝ+OMS[0];
             ለክሙ_ትእ= ትእዛዝ+OMS[10] ;         
             ለኪ_ትእ=ትእዛዝ+OMS[2];  
             ለክን_ትእ=ትእዛዝ+OMS[3];
             ሎቱ_ትእ=ትእዛዝ.substring(0,4)+OMS[5];
             ሎሙ_ትእ=ትእዛዝ.substring(0,4)+OMS[12];
             ላቲ_ትእ=ትእዛዝ.substring(0,4)+OMS[15];
             ሎን_ትእ=ትእዛዝ.substring(0,4)+OMS[19];
             
             ሊተ_ም=ምክንያታዊ.substring(0,4)+OMS[22];
             ለነ_ም=ምክንያታዊ.substring(0,4)+OMS[23];
             ለከ_ም=ምክንያታዊ.substring(0,4)+OMS[0];
             ለክሙ_ም= ምክንያታዊ.substring(0,4)+OMS[1] ;         
             ለኪ_ም=ምክንያታዊ.substring(0,4)+OMS[2];   
             ለክን_ም=ምክንያታዊ.substring(0,4)+OMS[3] ;
             ሎቱ_ም=ምክንያታዊ.substring(0,4)+OMS[5];
             ሎሙ_ም=ምክንያታዊ.substring(0,4)+OMS[12];
             ላቲ_ም=ምክንያታዊ.substring(0,4)+OMS[15];
             ሎን_ም=ምክንያታዊ.substring(0,4)+OMS[19];
          
                    } }}
         } 
         String d="";
   for(int j=0;j<salis.length;j++){
     if( ste.substring(2,3).equals(sadis[j])){
         //?
         ቦዝ=ste.substring(0,2)+sabie[j]+"ን";
           ሳቢዘር1 = geez[j];
         //ሳድስቅጽል=sadis[j];
        ሳልስቅጽል=salis[j];
        ss=sabie[j];
        ss1=sadis[j];
        d=rabie[j];
    }}
   አርእስት=ste.substring(0,3)+"ሆን";
   አርእስት1=ste.substring(0,2)+ss+"ቶን";
   for(int j=0;j<salis.length;j++){
     if( ste.substring(0,1).equals(geez[j])){
         ሳቢዘር=sadis[j];
         ሳድስቅጽል=sadis[j];
    }}
   for(int j=0;j<salis.length;j++){
     if( ste.substring(1,2).equals(salis[j])){
        ሳድስቅጽል=ሳድስቅጽል+kaeb[j]+d+"ት";
        ሳድስቅጽል1=ሳድስቅጽል.substring(0, 2)+ss+"ን";
        ሳልስቅጽል4=ste.substring(0,1)+rabie[j]+ss1 +"ያን";
        ሳልስቅጽል=ste.substring(0,1)+rabie[j]+ሳልስቅጽል+"ሆን" ;
        ሳልስቅጽል1=ሳልስቅጽል.substring(0, 2)+ste.substring(2,3)+"ያኒሆን";
        ሳልስቅጽል2=ሳልስቅጽል.substring(0, 3)+"ቶን";
        ሳልስቅጽል3=ሳልስቅጽል.substring(0, 2)+ste.substring(2,3)+"ያቲሆን";
        ሳቢዘር=ሳቢዘር+sadis[j]+ሳቢዘር1+"ቶን";
    }}
        }
        break;
        case "አግብሮ/causative/":{
             for(int j=0;j<sadis.length;j++){
      if( ste.substring(0,1).equals(geez[j])){
           
            for(int i=0;i<sadis.length;i++){
      if( ste.substring(2,3).equals(sadis[i])){
          ገቢር="አ"+sadis[j]+ሓላፊ.substring(1,2)+rabie[i];
           ሊተ=ገቢር+OMS[22];
            ለነ=ገቢር+OMS[23];
            ለከ=ገቢር+OMS[0];
            ለክሙ=ገቢር+OMS[10];                
            ለኪ=ገቢር+OMS[2];  
            ለክን=ገቢር+OMS[3];
          ሎቱ=ገቢር.substring(0,4)+OMS[5];
            ሎሙ=ገቢር.substring(0,4)+OMS[12];
            ላቲ=ገቢር.substring(0,4)+OMS[15];
            ሎን=ገቢር.substring(0,4)+OMS[19];
                    } 
       }}}
       for(int j=0;j<sadis.length;j++){
      if( ste.substring(1,2).equals(salis[j])){  
          for(int i=0;i<sadis.length;i++){
               if( ste.substring(2,3).equals(sadis[i])){
                    ትንቢት="ያ"+ste.substring(0,1)+sadis[j]+rabie[i];
                   ሊተ_ት=ትንቢት.substring(0,4)+OMS[22];
             ለነ_ት=ትንቢት.substring(0,4)+OMS[23];
             ለከ_ት=ትንቢት.substring(0,4)+OMS[0];
             ለክሙ_ት=   ትንቢት.substring(0,4)+OMS[10] ;         
             ለኪ_ት=ትንቢት.substring(0,4)+OMS[2];  
             ለክን_ት=ትንቢት.substring(0,4)+OMS[3];
             ሎቱ_ት=ትንቢት.substring(0,4)+OMS[5];
             ሎሙ_ት=ትንቢት.substring(0,4)+OMS[12];
             ላቲ_ት=ትንቢት.substring(0,4)+OMS[15];
             ሎን_ት=ትንቢት.substring(0,4)+OMS[19];
                    } }}
       }
        for(int j=0;j<sadis.length;j++){
           if( ste.substring(0,1).equals(geez[j])){
            ትእዛዝ="ያ"+sadis[j];
           }
            }
         for(int j=0;j<sadis.length;j++){
      if( ste.substring(1,2).equals(salis[j])){
           
          for(int i=0;i<sadis.length;i++){
               if( ste.substring(2,3).equals(sadis[i])){
                   ምክንያታዊ= ትእዛዝ=ትእዛዝ+sadis[j]+rabie[i];
                           ሊተ_ትእ=ትእዛዝ.substring(0,4)+OMS[22];
             ለነ_ትእ=ትእዛዝ.substring(0,4)+OMS[23];
             ለከ_ትእ=ትእዛዝ+OMS[0];
             ለክሙ_ትእ=   ትእዛዝ+OMS[10] ;         
             ለኪ_ትእ=ትእዛዝ+OMS[2];  
             ለክን_ትእ=ትእዛዝ+OMS[3] ;
             ሎቱ_ትእ=ትእዛዝ.substring(0,4)+OMS[5] ;
             ሎሙ_ትእ=ትእዛዝ.substring(0,4)+OMS[12];
             ላቲ_ትእ=ትእዛዝ.substring(0,4)+OMS[15] ;
             ሎን_ትእ=ትእዛዝ.substring(0,4)+OMS[19] ;
             //     
             ሊተ_ም=ትእዛዝ.substring(0,4)+OMS[22];
             ለነ_ም=ትእዛዝ.substring(0,4)+OMS[23];
             ለከ_ም=ትእዛዝ+OMS[0];
             ለክሙ_ም=   ትእዛዝ+OMS[10] ;         
             ለኪ_ም=ትእዛዝ+OMS[2];  
             ለክን_ም=ትእዛዝ+OMS[3] ;
              ሎቱ_ም=ትእዛዝ.substring(0,4)+OMS[5] ;
             ሎሙ_ም=ትእዛዝ.substring(0,4)+OMS[12];
             ላቲ_ም=ትእዛዝ.substring(0,4)+OMS[15] ;
             ሎን_ም=ትእዛዝ.substring(0,4)+OMS[19] ;
                    } }}
       }
         String d="";
   for(int j=0;j<salis.length;j++){
     if( ste.substring(2,3).equals(sadis[j])){
         ቦዝ=ገቢር.substring(0,2)+ste.substring(1,2)+sabie[j]+OMS[20];
         ss=ገቢር.substring(0,2);
       
        ss1=salis[j];
        d=hams[j];  
    }}
   for(int j=0;j<salis.length;j++){
     if( ste.substring(1,2).equals(salis[j])){
        አርእስት1=ቦዝ.substring(0,2)+sadis[j]+ቦዝ.substring(3,4)+"ቶ"+OMS[20];
        ss=ss+rabie[j]+ss1;
         ሳልስቅጽል1=ss.substring(0, 3)+ste.substring(2,3)+"ያት";
        }}
        }
        
        break;
         case "አስተጋብሮ/causative-reciprocal/":{
             for(int j=0;j<sadis.length;j++){
      if( ste.substring(0,1).equals(geez[j])){
            for(int i=0;i<sadis.length;i++){
      if( ste.substring(2,3).equals(sadis[i])){
            ገቢር="አስተ"+rabie[j]+ሓላፊ.substring(1,2)+rabie[i];
            ሊተ=ገቢር+OMS[22];
            ለነ=ገቢር+OMS[23];
            ለከ=ገቢር+OMS[0];
            ለክሙ=ገቢር+OMS[10];                
            ለኪ=ገቢር+OMS[2];  
            ለክን=ገቢር+OMS[3];
           ሎቱ=ገቢር.substring(0,6)+OMS[5];
            ሎሙ=ገቢር.substring(0,6)+OMS[12];
            ላቲ=ገቢር.substring(0,6)+OMS[15];
            ሎን=ገቢር.substring(0,6)+OMS[19];
                    } 
       }}}
                   for(int j=0;j<geez.length;j++){
      if( ste.substring(0,1).equals(geez[j])){
            ትንቢት="ያስተ"+rabie[j];
      }}
           for(int j=0;j<sadis.length;j++){
      if( ste.substring(1,2).equals(salis[j])){
            
          for(int i=0;i<sadis.length;i++){
               if( ste.substring(2,3).equals(sadis[i])){
                   ትንቢት=ትንቢት+sadis[j]+rabie[i];
            ትእዛዝ=ትንቢት;
            ምክንያታዊ=ትንቢት;  
                   ሊተ_ት=ትንቢት.substring(0,6)+OMS[22];
             ለነ_ት=ትንቢት.substring(0,6)+OMS[23];
             ለከ_ት=ትንቢት.substring(0,6)+OMS[0];
             ለክሙ_ት=   ትንቢት.substring(0,6)+OMS[10] ;         
             ለኪ_ት=ትንቢት.substring(0,6)+OMS[2];  
             ለክን_ት=ትንቢት.substring(0,6)+OMS[3];
             ሎቱ_ት=ትንቢት.substring(0,6)+OMS[5] ;
             ሎሙ_ት=ትንቢት.substring(0,6)+OMS[12];
             ላቲ_ት=ትንቢት.substring(0,6)+OMS[15];
             ሎን_ት=ትንቢት.substring(0,6)+OMS[19];
                    } }}
       }
           for(int i=0;i<sadis.length;i++){
               if( ste.substring(2,3).equals(sadis[i])){
         
                           ሊተ_ትእ=ትንቢት.substring(0,6)+OMS[22];
             ለነ_ትእ=ትንቢት.substring(0,6)+OMS[23];
             ለከ_ትእ=ትንቢት.substring(0,6)+OMS[0];
             ለክሙ_ትእ=   ትንቢት.substring(0,6)+OMS[10] ;         
             ለኪ_ትእ=ትንቢት.substring(0,6)+OMS[2];  
             ለክን_ትእ=ትንቢት.substring(0,6)+OMS[3];
             ሎቱ_ትእ=ትንቢት.substring(0,6)+OMS[5] ;
             ሎሙ_ትእ=ትንቢት.substring(0,6)+OMS[12];
             ላቲ_ትእ=ትንቢት.substring(0,6)+OMS[15];
             ሎን_ትእ=ትንቢት.substring(0,6)+OMS[19];
             //
                    ሊተ_ም=ትንቢት.substring(0,6)+OMS[22];
             ለነ_ም=ትንቢት.substring(0,6)+OMS[23];
             ለከ_ም=ትንቢት.substring(0,6)+OMS[0];
             ለክሙ_ም=   ትንቢት.substring(0,6)+OMS[10] ;         
             ለኪ_ም=ትንቢት.substring(0,6)+OMS[2];  
             ለክን_ም=ትንቢት.substring(0,6)+OMS[3];
             ሎቱ_ም=ትንቢት.substring(0,6)+OMS[5] ;
             ሎሙ_ም=ትንቢት.substring(0,6)+OMS[12];
             ላቲ_ም=ትንቢት.substring(0,6)+OMS[15];
             ሎን_ም=ትንቢት.substring(0,6)+OMS[19];
               }}
           //?
                  for(int j=0;j<geez.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           ቦዝ=ገቢር.substring(0, 4)+ste.substring(1,2)+sabie[j]+OMS[20];
           ss=sabie[j];
         }}
               for(int j=0;j<geez.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           አርእስት1=ገቢር.substring(0, 4)+sadis[j]+ss+"ቶ"+OMS[20];
               }}    
        }
         break;
         case "ተገብሮ/reflexive/":{
             for(int j=0;j<salis.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           ተገብሮ="ተ"+ste.substring(0,1)+sadis[j];
         }}
               for(int j=0;j<geez.length;j++){
         if( ሓላፊ.substring(2,3).equals(geez[j])){
           ገቢር=ተገብሮ+rabie[j];
               }}
                for(int j=0;j<salis.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           ትንቢት="ይት"+ste.substring(0,1)+geez[j];
           ቅርብ_ትእዛዝ="ተ"+ste.substring(0,1)+geez[j]+ste.substring(2,3);
         }}
               for(int j=0;j<geez.length;j++){
         if( ሓላፊ.substring(2,3).equals(geez[j])){
           ትንቢት=ትንቢት+rabie[j];
           ምክንያታዊ=ትእዛዝ=ትንቢት;
               }}
               //?
              for(int j=0;j<salis.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           ቦዝ="ተ"+ste.substring(0,2)+sabie[j]+"ን";
           ss=salis[j];
         }}
               for(int j=0;j<geez.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           አርእስት="ተ"+ste.substring(0,1)+sadis[j];
            ሳልስቅጽል="ተ"+ste.substring(0,1)+rabie[j]+ss;
           ሳልስቅጽል1=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያኒሁ";
        ሳልስቅጽል2=ሳልስቅጽል.substring(0, 4)+"ቱ";
        ሳልስቅጽል3=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያቲሁ";
               }} 
               for(int j=0;j<salis.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           አርእስት=አርእስት+sabie[j]+"ቶን";
         }}
         }
         break;
         case "ተጋብሮ/reciprocal/":{
             for(int j=0;j<geez.length;j++){
         if( ste.substring(0,1).equals(geez[j])){
           
            for(int i=0;i<sadis.length;i++){
      if( ste.substring(2,3).equals(sadis[i])){
          ገቢር="ተ"+rabie[j]+ሓላፊ.substring(1,2)+rabie[i];
           ሊተ=ገቢር+OMS[22];
            ለነ=ገቢር+OMS[23];
            ለከ=ገቢር+OMS[0];
            ለክሙ=ገቢር+OMS[10];                
            ለኪ=ገቢር+OMS[2];  
            ለክን=ገቢር+OMS[3];  
           ሎቱ=ገቢር.substring(0,4)+OMS[5];
            ሎሙ=ገቢር.substring(0,4)+OMS[12];
            ላቲ=ገቢር.substring(0,4)+OMS[15];
            ሎን=ገቢር.substring(0,4)+OMS[19];
               }}}}
                for(int j=0;j<geez.length;j++){
         if( ste.substring(0,1).equals(geez[j])){
           ትንቢት="ይት"+rabie[j]+ሓላፊ.substring(1,2);
           ቅርብ_ትእዛዝ="ተ"+rabie[j]+ሓላፊ.substring(1,2);;
         }}
               for(int i=0;i<geez.length;i++){
         if( ሓላፊ.substring(2,3).equals(geez[i])){
           ትንቢት=ትንቢት+rabie[i];
                  ሊተ_ት=ትንቢት.substring(0,5)+OMS[22];
             ለነ_ት=ትንቢት.substring(0,5)+OMS[23];
             ለከ_ት=ትንቢት.substring(0,5)+OMS[0];
             ለክሙ_ት=   ትንቢት.substring(0,5)+OMS[10] ;         
             ለኪ_ት=ትንቢት.substring(0,5)+OMS[2];  
             ለክን_ት=ትንቢት.substring(0,5)+OMS[3];
             ሎቱ_ት=ትንቢት.substring(0,5)+OMS[5] ;
             ሎሙ_ት=ትንቢት.substring(0,5)+OMS[12];
             ላቲ_ት=ትንቢት.substring(0,5)+OMS[15];
             ሎን_ት=ትንቢት.substring(0,5)+OMS[19];
         
                      ሊተ_ትእ=ትንቢት.substring(0,5)+OMS[22];
             ለነ_ትእ=ትንቢት.substring(0,5)+OMS[23];
             ለከ_ትእ=ትንቢት.substring(0,5)+OMS[0];
             ለክሙ_ትእ=   ትንቢት.substring(0,5)+OMS[10] ;         
             ለኪ_ትእ=ትንቢት.substring(0,5)+OMS[2];  
             ለክን_ትእ=ትንቢት.substring(0,5)+OMS[3];
             ሎቱ_ትእ=ትንቢት.substring(0,5)+OMS[5] ;
             ሎሙ_ትእ=ትንቢት.substring(0,5)+OMS[12];
             ላቲ_ትእ=ትንቢት.substring(0,5)+OMS[15];
             ሎን_ትእ=ትንቢት.substring(0,5)+OMS[19];
             //
               ሊተ_ም=ትንቢት.substring(0,5)+OMS[22];
             ለነ_ም=ትንቢት.substring(0,5)+OMS[23];
             ለከ_ም=ትንቢት.substring(0,5)+OMS[0];
             ለክሙ_ም=   ትንቢት.substring(0,5)+OMS[10] ;         
             ለኪ_ም=ትንቢት.substring(0,5)+OMS[2];  
             ለክን_ም=ትንቢት.substring(0,5)+OMS[3];
             ሎቱ_ም=ትንቢት.substring(0,5)+OMS[5] ;
             ሎሙ_ም=ትንቢት.substring(0,5)+OMS[12];
             ላቲ_ም=ትንቢት.substring(0,5)+OMS[15];
             ሎን_ም=ትንቢት.substring(0,5)+OMS[19];
           ቅርብ_ትእዛዝ=ቅርብ_ትእዛዝ+sadis[i];
           ትእዛዝ=ትንቢት;
            ምክንያታዊ=ትንቢት;
               }}
              for(int j=0;j<salis.length;j++){
         if( ste.substring(0,1).equals(geez[j])){
           ቦዝ="ተ"+rabie[j]+ste.substring(1, 2);
           አርእስት="ተ"+rabie[j];
            ሳልስቅጽል="ተ"+rabie[j];
           
         }}
               for(int j=0;j<geez.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           አርእስት=አርእስት+sadis[j];
           ሳልስቅጽል=ሳልስቅጽል+rabie[j];
         
               }} 
               for(int j=0;j<salis.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
             //ሳ ? ልስቅጽል
             //ሳልስቅጽል=ሳልስቅጽል+salis[j];
              // ሳልስቅጽል1=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያኒሁ";
       // ሳልስቅጽል2=ሳልስቅጽል.substring(0, 4)+"ቱ";
       // ሳልስቅጽል3=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያቲሁ";
           ቦዝ=ቦዝ+sabie[j]+"ን";
           አርእስት=አርእስት+sabie[j]+"ቶን";
           //አርእስት1=አርእስት+"ት";
         }}
         }
   }}
       break; 
   }}}}
    public void createStem1(String stem,String stemType,String person)
{
    String ste=stem;
 if(!ste.contains("ዊ")&&!ste.contains("ዪ")&&!ste.endsWith("ው")&&!ste.endsWith("ይ")&&!ste.contains("ሂ")&&!ste.contains("ኢ")&&!ste.contains("ሒ")&&!ste.contains("ኂ")
         &&!ste.contains("ዒ")&&!ste.contains("ሀ")&&!ste.substring(0,1).equals("ሐ")&&!ste.substring(0,1).equals("ኀ")){
    if(ste.charAt(2)!='ክ'&&ste.charAt(2)!='ቅ'&&ste.charAt(2)!='ግ'){ 
          for(int i=0;i<salis.length;i++){
    if( ste.substring(1,2).equals(salis[i])){
   for(int j=0;j<salis.length;j++){
     if( ste.substring(2,3).equals(sadis[j])){
         ሓላፊ=ste.substring(0,1)+geez[i]+geez[j];
    }}}}
   switch(person)
   {
             case "አንተ/You(2psm)/":{
       switch(stemType)
   {
        case "ገቢር/perfective/":{
            for(int j=0;j<sadis.length;j++){
      if( ste.substring(2,3).equals(sadis[j])){
             ገቢር=ሓላፊ.substring(0,2)+sadis[j]+SMS[2];
            ሊተ=ገቢር+OMS[22];
            ለነ=ገቢር+OMS[23];
            ለከ="";
            ለክሙ="";                
            ለኪ="";  
            ለክን="";
          for(int m=0;m<geez.length;m++){
            if( ገቢር.substring(3,4).equals(geez[m])){
            ሎቱ=ገቢር.substring(0,3)+OMS[24]+" ወይም "+ገቢር.substring(0,3)+rabie[m]+OMS[5];
            ሎሙ=ገቢር.substring(0,3)+sabie[m]+OMS[11]+" ወይም "+ገቢር.substring(0,3)+rabie[m]+OMS[12];
            ላቲ=ገቢር.substring(0,3)+rabie[m]+OMS[15]+" ወይም "+ገቢር.substring(0,3)+rabie[m];
            ሎን=ገቢር.substring(0,3)+sabie[m]+OMS[20]+" ወይም "+ገቢር.substring(0,3)+rabie[m]+OMS[19]; 
                    } }
                    } 
       }
       for(int j=0;j<sadis.length;j++){
      if( ste.substring(1,2).equals(salis[j])){
             ትንቢት="ት"+ste.substring(0,1)+sadis[j]+ገቢር.substring(2,3);    
          for(int i=0;i<sadis.length;i++){
               if( ste.substring(2,3).equals(sadis[i])){
                      ሊተ_ት=ትንቢት.substring(0,3)+geez[i]+OMS[22];
             ለነ_ት=ትንቢት.substring(0,3)+geez[i]+OMS[23];
             ለከ_ት="";
             ለክሙ_ት=  "";         
             ለኪ_ት="";  
             ለክን_ት="";
             ሎቱ_ት=ትንቢት.substring(0,3)+sabie[i] ;
             ሎሙ_ት=ትንቢት.substring(0,3)+sabie[i]+OMS[11];
             ላቲ_ት=ትንቢት.substring(0,3)+rabie[i]; 
             ሎን_ት=ትንቢት.substring(0,3)+sabie[i]+OMS[20];
                    } }}
       }
        for(int j=0;j<sadis.length;j++){
           if( ste.substring(0,1).equals(geez[j])){
            ትእዛዝ=sadis[j];
           }
            }
         for(int j=0;j<sadis.length;j++){
      if( ste.substring(1,2).equals(salis[j])){
            ትእዛዝ=ትእዛዝ+sadis[j];
          System.out.println("ትእዛዝ አንቀጽ:"+ትእዛዝ);
          for(int i=0;i<sadis.length;i++){
               if( ste.substring(2,3).equals(sadis[i])){
                   ትእዛዝ=ትእዛዝ+sadis[i];
             ሊተ_ትእ=ትእዛዝ.substring(0,2)+geez[i]+OMS[22];
             ለነ_ትእ=ትእዛዝ.substring(0,2)+geez[i]+OMS[23];
             ለከ_ትእ="";
             ለክሙ_ትእ= "" ;         
             ለኪ_ትእ="";  
             ለክን_ትእ="";
             ሎቱ_ትእ=ትእዛዝ.substring(0,2)+sabie[i];
             ሎሙ_ትእ=ትእዛዝ.substring(0,2)+sabie[i]+OMS[11];
             ላቲ_ትእ=ትእዛዝ.substring(0,2)+rabie[i];
             ሎን_ትእ=ትእዛዝ.substring(0,2)+sabie[i]+OMS[20];
             ምክንያታዊ="ት"+ትእዛዝ;
               ሊተ_ም=ምክንያታዊ.substring(0,3)+geez[i]+OMS[22];
             ለነ_ም=ምክንያታዊ.substring(0,3)+geez[i]+OMS[23];
             ለከ_ም="";
             ለክሙ_ም= "" ;         
             ለኪ_ም="";  
             ለክን_ም="";
             ሎቱ_ም=ምክንያታዊ.substring(0,3)+sabie[i];
             ሎሙ_ም=ምክንያታዊ.substring(0,3)+sabie[i]+OMS[11];
             ላቲ_ም=ምክንያታዊ.substring(0,3)+rabie[i];
             ሎን_ም=ምክንያታዊ.substring(0,3)+sabie[i]+OMS[20];
          
                    } }}
         } 
         String d="";
   for(int j=0;j<salis.length;j++){
     if( ste.substring(2,3).equals(sadis[j])){
         //?
         ቦዝ=ste.substring(0,2)+sabie[j]+OMS[0];
           ሳቢዘር1 = geez[j];
         //ሳድስቅጽል=sadis[j];
       // ሳልስቅጽል=salis[j];
        ss=sabie[j];
        ss1=sadis[j];
        d=kaeb[j];
    }}
   አርእስት=ste.substring(0,3)+"ትከ";
   አርእስት1="";
   for(int j=0;j<salis.length;j++){
     if( ste.substring(0,1).equals(geez[j])){
         ሳቢዘር=sadis[j];
         //ሳድስቅጽል=sadis[j];
    }}
   for(int j=0;j<salis.length;j++){
     if( ste.substring(1,2).equals(salis[j])){
      /*  ሳድስቅጽል=ሳድስቅጽል+kaeb[j]+ss1;
        ሳድስቅጽል1=ሳድስቅጽል.substring(0, 2)+ss+"ን";
        ሳልስቅጽል4=ste.substring(0,1)+rabie[j]+ss1 +"ያን";
        ሳልስቅጽል=ste.substring(0,1)+rabie[j]+ሳልስቅጽል+"ሆን" ;
        ሳልስቅጽል1=ሳልስቅጽል.substring(0, 2)+ste.substring(2,3)+"ያኒሆን";
        ሳልስቅጽል2=ሳልስቅጽል.substring(0, 3)+"ቶን";
        ሳልስቅጽል3=ሳልስቅጽል.substring(0, 2)+ste.substring(2,3)+"ያቲሆን";*/
        ሳቢዘር=ሳቢዘር+sadis[j]+ሳቢዘር1+"ትከ";
    }}
        }
        break;
        case "አግብሮ/causative/":{
             for(int j=0;j<sadis.length;j++){
      if( ste.substring(0,1).equals(geez[j])){
            for(int i=0;i<sadis.length;i++){
      if( ste.substring(2,3).equals(sadis[i])){
          ገቢር="አ"+sadis[j]+ሓላፊ.substring(1,2)+sadis[i]+SMS[2];
          }}
          for(int m=0;m<geez.length;m++){
            if( ገቢር.substring(4,5).equals(geez[m])){
           ሊተ=ገቢር+OMS[22];
            ለነ=ገቢር+OMS[23];
            ለከ="";
            ለክሙ="";                
            ለኪ="";  
            ለክን="";
          ሎቱ=ገቢር.substring(0,4)+OMS[24]+" ወይም "+ገቢር.substring(0,4)+rabie[m]+OMS[5];
            ሎሙ=ገቢር.substring(0,4)+sabie[m]+OMS[11]+" ወይም "+ገቢር.substring(0,4)+rabie[m]+OMS[12];
            ላቲ=ገቢር.substring(0,4)+rabie[m]+OMS[15]+" ወይም "+ገቢር.substring(0,4)+rabie[m];
            ሎን=ገቢር.substring(0,4)+sabie[m]+OMS[20]+" ወይም "+ገቢር.substring(0,4)+rabie[m]+OMS[19];
                    } 
       }}}
       for(int j=0;j<sadis.length;j++){
      if( ste.substring(1,2).equals(salis[j])){  
          for(int i=0;i<sadis.length;i++){
               if( ste.substring(2,3).equals(sadis[i])){
                    ትንቢት="ታ"+ste.substring(0,1)+sadis[j]+ste.substring(2,3);
                   ሊተ_ት=ትንቢት.substring(0,3)+geez[i]+OMS[22];
             ለነ_ት=ትንቢት.substring(0,3)+geez[i]+OMS[23];
             ለከ_ት="";
             ለክሙ_ት="" ;         
             ለኪ_ት="";  
             ለክን_ት="";
             ሎቱ_ት=ትንቢት.substring(0,3)+sabie[i];
             ሎሙ_ት=ትንቢት.substring(0,3)+sabie[i]+OMS[11];
             ላቲ_ት=ትንቢት.substring(0,3)+rabie[i];
             ሎን_ት=ትንቢት.substring(0,3)+sabie[i]+OMS[20];
                    } }}
       }
        for(int j=0;j<sadis.length;j++){
           if( ste.substring(0,1).equals(geez[j])){
           ትእዛዝ="አ"+sadis[j];
           }
            }
         for(int j=0;j<sadis.length;j++){
      if( ste.substring(1,2).equals(salis[j])){
          for(int i=0;i<sadis.length;i++){
               if( ste.substring(2,3).equals(sadis[i])){
                    ትእዛዝ=ትእዛዝ+sadis[j]+sadis[i];
                           ሊተ_ትእ=ትእዛዝ.substring(0,3)+geez[i]+OMS[22];
             ለነ_ትእ=ትእዛዝ.substring(0,3)+geez[i]+OMS[23];
             ለከ_ትእ="";
             ለክሙ_ትእ=  "";         
             ለኪ_ትእ="";  
             ለክን_ትእ="" ;
             ሎቱ_ትእ=ትእዛዝ.substring(0,3)+sabie[i] ;
             ሎሙ_ትእ=ትእዛዝ.substring(0,3)+sabie[i]+OMS[11];
             ላቲ_ትእ=ትእዛዝ.substring(0,3)+rabie[i] ;
             ሎን_ትእ=ትእዛዝ.substring(0,3)+sabie[i]+OMS[20] ;
             //     
             ምክንያታዊ=ትእዛዝ;
                             ሊተ_ም=ትእዛዝ.substring(0,3)+geez[i]+OMS[22];
             ለነ_ም=ትእዛዝ.substring(0,3)+geez[i]+OMS[23];
             ለከ_ም="";
             ለክሙ_ም=  "";         
             ለኪ_ም="";  
             ለክን_ም="" ;
             ሎቱ_ም=ትእዛዝ.substring(0,3)+sabie[i] ;
             ሎሙ_ም=ትእዛዝ.substring(0,3)+sabie[i]+OMS[11];
             ላቲ_ም=ትእዛዝ.substring(0,3)+rabie[i] ;
             ሎን_ም=ትእዛዝ.substring(0,3)+sabie[i]+OMS[20] ;
                    } }}
       }
         String d="";
   for(int j=0;j<salis.length;j++){
     if( ste.substring(2,3).equals(sadis[j])){
         ቦዝ=ገቢር.substring(0,2)+ste.substring(1,2)+geez[j]+OMS[0];
        // ሳልስቅጽል=ገቢር.substring(0,2);
        ss=sabie[j];
        ss1=salis[j];
        d=hams[j];  
    }}
   for(int j=0;j<salis.length;j++){
     if( ste.substring(1,2).equals(salis[j])){
        አርእስት="";
        አርእስት1=ቦዝ.substring(0,2)+sadis[j]+ss+"ትከ";
        /*ሳልስቅጽል=ሳልስቅጽል+rabie[j]+ss1+OMS[0];
        ሳልስቅጽል1=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያኒሁ";
        ሳልስቅጽል2=ሳልስቅጽል.substring(0, 4)+"ቱ";
        ሳልስቅጽል3=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያቲሁ";*/
        }}
        }     
        break;
         case "አስተጋብሮ/causative-reciprocal/":{
             for(int j=0;j<sadis.length;j++){
      if( ste.substring(0,1).equals(geez[j])){
          ገቢር="አስተ"+rabie[j];}}
             
            for(int i=0;i<sadis.length;i++){
      if( ste.substring(2,3).equals(sadis[i])){
            ገቢር=ገቢር+ሓላፊ.substring(1,2)+sadis[i]+OMS[0];
            ሊተ=ገቢር+OMS[22];
            ለነ=ገቢር+OMS[23];
            ለከ="";
            ለክሙ="";                
            ለኪ="";  
            ለክን="";
              for(int m=0;m<sadis.length;m++){
      if( ገቢር.substring(6,7).equals(geez[m])){
           ሎቱ=ገቢር.substring(0,5)+sadis[i]+OMS[24] +" ወይም "+ገቢር.substring(0,5)+sadis[i]+rabie[m]+OMS[5];
            ሎሙ=ገቢር.substring(0,5)+sadis[i]+OMS[24]+OMS[11]+" ወይም "+ገቢር.substring(0,5)+sadis[i]+rabie[m]+OMS[12];
            ላቲ=ገቢር.substring(0,5)+sadis[i]+rabie[m]+OMS[4];
            ሎን=ገቢር.substring(0,5)+sadis[i]+rabie[m]+OMS[19];
                    } 
       }}}
     for(int j=0;j<geez.length;j++){
      if( ste.substring(0,1).equals(geez[j])){
            ትንቢት=prefix[8]+rabie[j];
      }}
           for(int j=0;j<sadis.length;j++){
      if( ste.substring(1,2).equals(salis[j])){
            
          for(int i=0;i<sadis.length;i++){
               if( ste.substring(2,3).equals(sadis[i])){
                   ትንቢት=ትንቢት+sadis[j]+sadis[i];
            ትእዛዝ=ትንቢት;
            ምክንያታዊ=ትንቢት;  
                   ሊተ_ት=ትንቢት.substring(0,5)+geez[i]+OMS[22];
             ለነ_ት=ትንቢት.substring(0,5)+geez[i]+OMS[23];
             ለከ_ት="";
             ለክሙ_ት= "" ;         
             ለኪ_ት="";  
             ለክን_ት="";
             ሎቱ_ት=ትንቢት.substring(0,5)+sabie[i] ;
             ሎሙ_ት=ትንቢት.substring(0,5)+sabie[i]+OMS[11];
             ላቲ_ት=ትንቢት.substring(0,6)+rabie[i];
             ሎን_ት=ትንቢት.substring(0,6)+sabie[i]+OMS[20];
    
                   ትእዛዝ=prefix[10]+ትንቢት.substring(3,6);
             ሊተ_ትእ=ትእዛዝ.substring(0,5)+geez[i]+OMS[22];
             ለነ_ትእ=ትእዛዝ.substring(0,5)+geez[i]+OMS[23];
             ለከ_ትእ="";
             ለክሙ_ትእ=  "" ;         
             ለኪ_ትእ="";  
             ለክን_ትእ="";
             ሎቱ_ትእ=ትእዛዝ.substring(0,5)+sabie[i] ;
             ሎሙ_ትእ=ትእዛዝ.substring(0,5)+sabie[i]+OMS[11];
             ላቲ_ትእ=ትእዛዝ.substring(0,5)+rabie[i];
             ሎን_ትእ=ትእዛዝ.substring(0,5)+sabie[i]+OMS[20];
             //
             ምክንያታዊ=prefix[8]+ትንቢት.substring(3,6);;
             ሊተ_ም=ምክንያታዊ.substring(0,5)+geez[i]+OMS[22];
             ለነ_ም=ምክንያታዊ.substring(0,5)+geez[i]+OMS[23];
             ለከ_ም="";
             ለክሙ_ም=  "" ;         
             ለኪ_ም="";  
             ለክን_ም="";
             ሎቱ_ም=ምክንያታዊ.substring(0,5)+sabie[i] ;
             ሎሙ_ም=ምክንያታዊ.substring(0,5)+sabie[i]+OMS[11];
             ላቲ_ም=ምክንያታዊ.substring(0,5)+rabie[i];
             ሎን_ም=ምክንያታዊ.substring(0,5)+sabie[i]+OMS[20];
               }}}}
           //?
                  for(int j=0;j<geez.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           ቦዝ=ገቢር.substring(0, 4)+ste.substring(1,2)+geez[j]+SMS[2];
           ss=salis[j];
         }}
               for(int j=0;j<geez.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           አርእስት=ገቢር.substring(0, 4)+sadis[j];
          /* ሳልስቅጽል=ገቢር.substring(0, 4)+rabie[j]+ss;
           ሳልስቅጽል1=ሳልስቅጽል.substring(0, 5)+ste.substring(2,3)+"ያኒሁ";
        ሳልስቅጽል2=ሳልስቅጽል.substring(0, 6)+"ቱ";
        ሳልስቅጽል3=ሳልስቅጽል.substring(0, 5)+ste.substring(2,3)+"ያቲሁ";*/
               }} 
               for(int j=0;j<salis.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           አርእስት=አርእስት+sabie[j]+"ት"+SMS[2];
         
         }}
        }
         break;
         case "ተገብሮ/reflexive/":{
             for(int j=0;j<salis.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           ገቢር=prefix[15]+ሓላፊ.substring(0,2)+sadis[j]+OMS[0];
         }} 
                for(int j=0;j<salis.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           ቅርብ_ትእዛዝ="ተ"+ste.substring(0,1)+geez[j]+ste.substring(2,3);
         }}
               for(int j=0;j<geez.length;j++){
         if( ሓላፊ.substring(2,3).equals(geez[j])){
            ትንቢት=prefix[7]+ሓላፊ.substring(0,2)+sadis[j];
            ትእዛዝ=prefix[15]+ሓላፊ.substring(0,2)+sadis[j];
             ምክንያታዊ=prefix[7]+ሓላፊ.substring(0,2)+sadis[j];
               }}
               //?
              for(int j=0;j<salis.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           ቦዝ="ተ"+ste.substring(0,2)+geez[j]+OMS[0];
           ss=salis[j];
         }}
               for(int j=0;j<geez.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           አርእስት="ተ"+ste.substring(0,1)+sadis[j];
         /*   ሳልስቅጽል="ተ"+ste.substring(0,1)+rabie[j]+ss;
           ሳልስቅጽል1=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያኒሁ";
        ሳልስቅጽል2=ሳልስቅጽል.substring(0, 4)+"ቱ";
        ሳልስቅጽል3=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያቲሁ";*/
               }} 
               for(int j=0;j<salis.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           አርእስት=አርእስት+sabie[j]+"ት"+SMS[2];
         }}
         }
         break;
         case "ተጋብሮ/reciprocal/":{
             for(int j=0;j<geez.length;j++){
         if( ste.substring(0,1).equals(geez[j])){
           
            for(int i=0;i<sadis.length;i++){
      if( ste.substring(2,3).equals(sadis[i])){
          ገቢር="ተ"+rabie[j]+ሓላፊ.substring(1,2)+sadis[i]+OMS[0];
           ሊተ=ገቢር+OMS[22];
            ለነ=ገቢር+OMS[23];
            ለከ="";
            ለክሙ="";                
            ለኪ="";  
            ለክን="";  }}
                      for(int m=0;m<sadis.length;m++){
      if( ገቢር.substring(4,5).equals(geez[m])){
           ሎቱ=ገቢር.substring(0,4)+sabie[m] ;
             ሎሙ=ገቢር.substring(0,4)+sabie[m]+OMS[11];
             ላቲ=ገቢር.substring(0,4)+rabie[m];
             ሎን=ገቢር.substring(0,4)+sabie[m]+OMS[20];
               }}}}
                for(int j=0;j<geez.length;j++){
         if( ste.substring(0,1).equals(geez[j])){
           ትንቢት=prefix[7]+rabie[j]+ሓላፊ.substring(1,2);
           ቅርብ_ትእዛዝ="ተ"+rabie[j]+ሓላፊ.substring(1,2);;
         }}
               for(int i=0;i<geez.length;i++){
         if( ሓላፊ.substring(2,3).equals(geez[i])){
           ትንቢት=ትንቢት+sadis[i];
                  ሊተ_ት=ትንቢት.substring(0,4)+geez[i]+OMS[22];
             ለነ_ት=ትንቢት.substring(0,4)+geez[i]+OMS[23];
             ለከ_ት="";
             ለክሙ_ት=  "" ;         
             ለኪ_ት="";  
             ለክን_ት="";
           ሎቱ_ት=ትንቢት.substring(0,4)+sabie[i] ;
             ሎሙ_ት=ትንቢት.substring(0,4)+sabie[i]+OMS[11];
             ላቲ_ት=ትንቢት.substring(0,4)+rabie[i];
             ሎን_ት=ትንቢት.substring(0,4)+sabie[i]+OMS[20];
             ትእዛዝ=ገቢር.substring(0,4);
             ሊተ_ትእ=ትእዛዝ.substring(0,3)+geez[i]+OMS[22];
             ለነ_ትእ=ትእዛዝ.substring(0,3)+geez[i]+OMS[23];
             ለከ_ትእ="";
             ለክሙ_ትእ=  "" ;         
             ለኪ_ትእ="";  
             ለክን_ትእ="";
             ሎቱ_ትእ=ትእዛዝ.substring(0,3)+sabie[i] ;
             ሎሙ_ትእ=ትእዛዝ.substring(0,3)+sabie[i]+OMS[11];
             ላቲ_ትእ=ትእዛዝ.substring(0,3)+rabie[i];
             ሎን_ትእ=ትእዛዝ.substring(0,3)+sabie[i]+OMS[20];
             //
               ምክንያታዊ=ትንቢት;
                    ሊተ_ም=ትንቢት.substring(0,4)+geez[i]+OMS[22];
             ለነ_ም=ትንቢት.substring(0,4)+geez[i]+OMS[23];
             ለከ_ም="";
             ለክሙ_ም=  "" ;         
             ለኪ_ም="";  
             ለክን_ም="";
           ሎቱ_ም=ትንቢት.substring(0,4)+sabie[i] ;
             ሎሙ_ም=ትንቢት.substring(0,4)+sabie[i]+OMS[11];
             ላቲ_ም=ትንቢት.substring(0,4)+rabie[i];
             ሎን_ም=ትንቢት.substring(0,4)+sabie[i]+OMS[20];
           ቅርብ_ትእዛዝ=ቅርብ_ትእዛዝ+sadis[i];
          // ትእዛዝ=ትንቢት;
               }}
              for(int j=0;j<salis.length;j++){
         if( ste.substring(0,1).equals(geez[j])){
           ቦዝ="ተ"+rabie[j]+ste.substring(1, 2);
           አርእስት="ተ"+rabie[j];
           // ሳልስቅጽል="ተ"+rabie[j];
         }}
               for(int j=0;j<geez.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           አርእስት=አርእስት+sadis[j];
           //ሳልስቅጽል=ሳልስቅጽል+rabie[j];
               }} 
               for(int j=0;j<salis.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
             //ሳ ? ልስቅጽል
            // ሳልስቅጽል=ሳልስቅጽል+salis[j];
             //  ሳልስቅጽል1=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያኒሁ";
        //ሳልስቅጽል2=ሳልስቅጽል.substring(0, 4)+"ቱ";
        //ሳልስቅጽል3=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያቲሁ";
           ቦዝ=ቦዝ+geez[j]+SMS[2];
           አርእስት=አርእስት+sabie[j]+"ት"+SMS[2];
           //አርእስት1=አርእስት+"ት";
         }}
         }
   }}
       break;
      
  case "አንቲ/You(2psf)/":{
       switch(stemType)
   {
        case "ገቢር/perfective/":{
            for(int j=0;j<sadis.length;j++){
      if( ste.substring(2,3).equals(sadis[j])){
            ገቢር=ሓላፊ.substring(0,2)+sadis[j]+SMS[3];
          for(int m=0;m<geez.length;m++){
            if( ገቢር.substring(3,4).equals(salis[m])){
            ሊተ=ገቢር.substring(0,3)+sadis[m]+OMS[22];
            ለነ=ገቢር.substring(0,3)+sadis[m]+OMS[23];
            ለከ="-";
            ለክሙ="-";                
            ለኪ="-";  
            ለክን="-";
            ሎቱ=ገቢር.substring(0,4)+OMS[8];
            ሎሙ=ገቢር.substring(0,4)+OMS[13];
            ላቲ=ገቢር.substring(0,4)+OMS[17];
            ሎን=ገቢር.substring(0,4)+OMS[21]; 
                    } }
                    } 
       }
       for(int j=0;j<sadis.length;j++){
       if( ste.substring(1,2).equals(salis[j])){
            ትንቢት=prefix[4]+ste.substring(0,1)+sadis[j];
          for(int m=0;m<sadis.length;m++){
            if( ste.substring(2,3).equals(sadis[m])){
                ትንቢት=ትንቢት+salis[m];
            ሊተ_ት=ትንቢት.substring(0,3)+sadis[m]+OMS[22];
            ለነ_ት=ትንቢት.substring(0,3)+sadis[m]+OMS[23];
            ለከ_ት="-";
            ለክሙ_ት="-";                
            ለኪ_ት="-";  
            ለክን_ት="-";
            ሎቱ_ት=ትንቢት.substring(0,3)+sadis[m]+OMS[8];
            ሎሙ_ት=ትንቢት.substring(0,3)+sadis[m]+OMS[13];
            ላቲ_ት=ትንቢት.substring(0,3)+sadis[m]+OMS[17];
            ሎን_ት=ትንቢት.substring(0,3)+sadis[m]+OMS[21]; 
                    } }
                    }  }
  for(int j=0;j<sadis.length;j++){
       if( ste.substring(0,1).equals(geez[j])){
            ትእዛዝ=sadis[j];
       }}
   for(int j=0;j<salis.length;j++){
       if( ste.substring(1,2).equals(salis[j])){  
          for(int m=0;m<sadis.length;m++){
            if( ste.substring(2,3).equals(sadis[m])){
                ትእዛዝ=ትእዛዝ+sadis[j]+salis[m];
            ሊተ_ትእ=ትእዛዝ.substring(0,2)+sadis[m]+OMS[22];
            ለነ_ትእ=ትእዛዝ.substring(0,2)+sadis[m]+OMS[23];
            ለከ_ትእ="-";
            ለክሙ_ትእ="-";                
            ለኪ_ትእ="-";  
            ለክን_ትእ="-";
            ሎቱ_ትእ=ትእዛዝ.substring(0,3)+OMS[8];
            ሎሙ_ትእ=ትእዛዝ.substring(0,3)+OMS[13];
            ላቲ_ትእ=ትእዛዝ.substring(0,3)+OMS[17];
            ሎን_ትእ=ትእዛዝ.substring(0,3)+OMS[21]; 
                    } }
                    } }
     for(int j=0;j<sadis.length;j++){
       if( ste.substring(0,1).equals(geez[j])){
            ምክንያታዊ=prefix[4]+sadis[j];
       }}
   for(int j=0;j<salis.length;j++){
       if( ste.substring(1,2).equals(salis[j])){
            ምክንያታዊ=ምክንያታዊ+sadis[j]+ste.substring(2,3);
          for(int m=0;m<sadis.length;m++){
            if( ste.substring(2,3).equals(sadis[m])){
            ሊተ_ም=ምክንያታዊ.substring(0,4)+OMS[22];
            ለነ_ም=ምክንያታዊ.substring(0,4)+OMS[23];
            ለከ_ም="-";
            ለክሙ_ም="-";                
            ለኪ_ም="-";  
            ለክን_ም="-";
            ሎቱ_ም=ምክንያታዊ.substring(0,3)+sadis[m]+OMS[8];
            ሎሙ_ም=ምክንያታዊ.substring(0,3)+sadis[m]+OMS[13];
            ላቲ_ም=ምክንያታዊ.substring(0,3)+sadis[m]+OMS[17];
            ሎን_ም=ምክንያታዊ.substring(0,3)+sadis[m]+OMS[21]; 
                    } }
                    }
       }
     String d="";
   for(int j=0;j<salis.length;j++){
     if( ste.substring(2,3).equals(sadis[j])){
         //?
         ቦዝ=ste.substring(0,2)+geez[j]+OMS[2];
           ሳቢዘር1 = geez[j];
         //ሳድስቅጽል=sadis[j];
       // ሳልስቅጽል=salis[j];
        ss=sabie[j];
        ss1=sadis[j];
        d=kaeb[j];
    }}
   አርእስት=ste.substring(0,2)+ss+"ትኪ";
   አርእስት1="";
   for(int j=0;j<salis.length;j++){
     if( ste.substring(0,1).equals(geez[j])){
         ሳቢዘር=sadis[j];
         //ሳድስቅጽል=sadis[j];
    }}
   for(int j=0;j<salis.length;j++){
     if( ste.substring(1,2).equals(salis[j])){
      /*  ሳድስቅጽል=ሳድስቅጽል+kaeb[j]+ss1;
        ሳድስቅጽል1=ሳድስቅጽል.substring(0, 2)+ss+"ን";
        ሳልስቅጽል4=ste.substring(0,1)+rabie[j]+ss1 +"ያን";
        ሳልስቅጽል=ste.substring(0,1)+rabie[j]+ሳልስቅጽል+"ሆን" ;
        ሳልስቅጽል1=ሳልስቅጽል.substring(0, 2)+ste.substring(2,3)+"ያኒሆን";
        ሳልስቅጽል2=ሳልስቅጽል.substring(0, 3)+"ቶን";
        ሳልስቅጽል3=ሳልስቅጽል.substring(0, 2)+ste.substring(2,3)+"ያቲሆን";*/
        ሳቢዘር=ሳቢዘር+sadis[j]+ሳቢዘር1+"ትኪ";
    }}
        }
       break;
        case "አግብሮ/causative/":{
             for(int j=0;j<sadis.length;j++){
      if( ste.substring(0,1).equals(geez[j])){
            for(int i=0;i<sadis.length;i++){
      if( ste.substring(2,3).equals(sadis[i])){
          ገቢር="አ"+sadis[j]+ሓላፊ.substring(1,2)+sadis[i]+SMS[3];
      }}
          for(int i=0;i<salis.length;i++){
      if( ገቢር.substring(4,5).equals(salis[i])){
            ሊተ=ገቢር.substring(0,4)+sadis[i]+OMS[22];
            ለነ=ገቢር.substring(0,4)+sadis[i]+OMS[23];
            ለከ="";
            ለክሙ="";                
            ለኪ="";  
            ለክን="";
            ሎቱ=ገቢር+OMS[8];
            ሎሙ=ገቢር+OMS[13];
            ላቲ=ገቢር+OMS[17];
            ሎን=ገቢር+OMS[21];
                    } 
       }}}
       for(int j=0;j<sadis.length;j++){
      if( ste.substring(1,2).equals(salis[j])){ 
          ትንቢት="ታ"+ste.substring(0,1)+sadis[j];
      }}
          for(int i=0;i<sadis.length;i++){
               if( ste.substring(2,3).equals(sadis[i])){
             ትንቢት=ትንቢት+salis[i];
             ሊተ_ት=ትንቢት.substring(0,3)+sadis[i]+OMS[22];
             ለነ_ት=ትንቢት.substring(0,3)+sadis[i]+OMS[23];
             ለከ_ት="";
             ለክሙ_ት="" ;         
             ለኪ_ት="";  
             ለክን_ት="";
             ሎቱ_ት=ትንቢት+OMS[8];
            ሎሙ_ት=ትንቢት+OMS[13];
            ላቲ_ት=ትንቢት+OMS[17];
            ሎን_ት=ትንቢት+OMS[21];
                    }  }
        for(int j=0;j<sadis.length;j++){
           if( ste.substring(0,1).equals(geez[j])){
            ትእዛዝ="አ"+sadis[j];
           }
            }
         for(int j=0;j<sadis.length;j++){
      if( ste.substring(1,2).equals(salis[j])){
          for(int i=0;i<sadis.length;i++){
               if( ste.substring(2,3).equals(sadis[i])){
                    ትእዛዝ=ትእዛዝ+sadis[j]+salis[i];
                    ምክንያታዊ=ትእዛዝ;
             ሊተ_ትእ=ትእዛዝ.substring(0,3)+sadis[i]+OMS[22];
             ለነ_ትእ=ትእዛዝ.substring(0,3)+sadis[i]+OMS[23];
             ለከ_ትእ="";
             ለክሙ_ትእ= "" ;         
             ለኪ_ትእ="";  
             ለክን_ትእ="" ;
             ሎቱ_ትእ=ትእዛዝ+OMS[8];
             ሎሙ_ትእ=ትእዛዝ+OMS[13];
             ላቲ_ትእ=ትእዛዝ+OMS[17];
             ሎን_ትእ=ትእዛዝ+OMS[21];
             // 
             ሊተ_ም=ትእዛዝ.substring(0,3)+sadis[i]+OMS[22];
             ለነ_ም=ትእዛዝ.substring(0,3)+sadis[i]+OMS[23];
             ለከ_ም="";
             ለክሙ_ም= "" ;         
             ለኪ_ም="";  
             ለክን_ም="" ;
             ሎቱ_ም=ትእዛዝ+OMS[8];
             ሎሙ_ም=ትእዛዝ+OMS[13];
             ላቲ_ም=ትእዛዝ+OMS[17];
             ሎን_ም=ትእዛዝ+OMS[21];
                    } }}
       }
         String d="";
   for(int j=0;j<salis.length;j++){
     if( ste.substring(2,3).equals(sadis[j])){
         ቦዝ=ገቢር.substring(0,2)+ste.substring(1,2)+geez[j]+SMS[3];
         ሳልስቅጽል=ገቢር.substring(0,2);
        ss=sabie[j];
        ss1=salis[j];
        d=hams[j];  
    }}
   for(int j=0;j<salis.length;j++){
     if( ste.substring(1,2).equals(salis[j])){
        አርእስት=ቦዝ.substring(0,2)+sadis[j]+ss+"ት"+SMS[3];
        //አርእስት1=ቦዝ.substring(0,2)+sadis[j]+ቦዝ.substring(3,4)+"ት";
        ሳልስቅጽል=ሳልስቅጽል+rabie[j]+ss1;
         ሳልስቅጽል1=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያኒሁ";
        ሳልስቅጽል2=ሳልስቅጽል.substring(0, 4)+"ቱ";
        ሳልስቅጽል3=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያቲሁ";
        }}
        }
        break;
         case "አስተጋብሮ/causative-reciprocal/":{
             for(int j=0;j<sadis.length;j++){
      if( ste.substring(0,1).equals(geez[j])){
          ገቢር="አስተ"+rabie[j]+ሓላፊ.substring(1,2);}}
            for(int i=0;i<sadis.length;i++){
      if( ste.substring(2,3).equals(sadis[i])){
           ገቢር= ገቢር+sadis[i]+SMS[3];
            }}
          for(int i=0;i<salis.length;i++){
      if( ገቢር.substring(6,7).equals(salis[i])){
            ሊተ=ገቢር.substring(0,6)+sadis[i]+OMS[22];
            ለነ=ገቢር.substring(0,6)+sadis[i]+OMS[23];
            ለከ="";
            ለክሙ="";                
            ለኪ="";  
            ለክን="";
             ሎቱ=ገቢር+OMS[8];
            ሎሙ=ገቢር+OMS[13];
            ላቲ=ገቢር+OMS[17];
            ሎን=ገቢር+OMS[21];
                    } 
       }
                   for(int j=0;j<geez.length;j++){
      if( ste.substring(0,1).equals(geez[j])){
            ትንቢት="ታስተ"+rabie[j];
            ትእዛዝ="አስተ"+rabie[j];
      }}
           for(int j=0;j<sadis.length;j++){
      if( ste.substring(1,2).equals(salis[j])){
          for(int i=0;i<sadis.length;i++){
               if( ste.substring(2,3).equals(sadis[i])){
                   ትንቢት=ትንቢት+sadis[j]+salis[i];
            ትእዛዝ=ትእዛዝ+sadis[j]+salis[i];
            ምክንያታዊ=ትንቢት;  
                   ሊተ_ት=ትንቢት.substring(0,5)+sadis[i]+OMS[22];
             ለነ_ት=ትንቢት.substring(0,5)+sadis[i]+OMS[23];
             ለከ_ት="";
             ለክሙ_ት= "" ;         
             ለኪ_ት="";  
             ለክን_ት="";
            ሎቱ_ት=ትንቢት.substring(0,5)+sadis[i]+OMS[8];
            ሎሙ_ት=ትንቢት.substring(0,5)+sadis[i]+OMS[13];
            ላቲ_ት=ትንቢት.substring(0,5)+sadis[i]+OMS[17];
            ሎን_ት=ትንቢት.substring(0,5)+sadis[i]+OMS[21];
            //
              ሊተ_ትእ=ትእዛዝ.substring(0,5)+sadis[i]+OMS[22];
             ለነ_ትእ=ትእዛዝ.substring(0,5)+sadis[i]+OMS[23];
             ለከ_ትእ="";
             ለክሙ_ትእ= "" ;         
             ለኪ_ትእ="";  
             ለክን_ትእ="";
            ሎቱ_ትእ=ትእዛዝ.substring(0,5)+sadis[i]+OMS[8];
            ሎሙ_ትእ=ትእዛዝ.substring(0,5)+sadis[i]+OMS[13];
            ላቲ_ትእ=ትእዛዝ.substring(0,5)+sadis[i]+OMS[17];
            ሎን_ትእ=ትእዛዝ.substring(0,5)+sadis[i]+OMS[21];
             //
             ሊተ_ም=ትንቢት.substring(0,5)+sadis[i]+OMS[22];
             ለነ_ም=ትንቢት.substring(0,5)+sadis[i]+OMS[23];
             ለከ_ም="";
             ለክሙ_ም= "" ;         
             ለኪ_ም="";  
             ለክን_ም="";
             ሎቱ_ም=ትንቢት.substring(0,5)+sadis[i]+OMS[8];
             ሎሙ_ም=ትንቢት.substring(0,5)+sadis[i]+OMS[13];
             ላቲ_ም=ትንቢት.substring(0,5)+sadis[i]+OMS[17];
             ሎን_ም=ትንቢት.substring(0,5)+sadis[i]+OMS[21];
               }}}}
           //?
                  for(int j=0;j<geez.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           ቦዝ=ገቢር.substring(0, 4)+ste.substring(1,2)+geez[j]+SMS[3];
           ss=salis[j];
         }}
               for(int j=0;j<geez.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           አርእስት=ገቢር.substring(0, 4)+sadis[j];
           ሳልስቅጽል=ገቢር.substring(0, 4)+rabie[j]+ss;
           ሳልስቅጽል1=ሳልስቅጽል.substring(0, 5)+ste.substring(2,3)+"ያኒሁ";
        ሳልስቅጽል2=ሳልስቅጽል.substring(0, 6)+"ቱ";
        ሳልስቅጽል3=ሳልስቅጽል.substring(0, 5)+ste.substring(2,3)+"ያቲሁ";
               }} 
               for(int j=0;j<salis.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           አርእስት=አርእስት+sabie[j]+"ት"+SMS[3];
          // አርእስት1=አርእስት+"ት";
         }}
        }
         break;
       
         case "ተገብሮ/reflexive/":{
             for(int j=0;j<salis.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           ተገብሮ="ተ"+ste.substring(0,1)+geez[j];
         }}
               for(int j=0;j<geez.length;j++){
         if( ሓላፊ.substring(2,3).equals(geez[j])){
           ገቢር=ተገብሮ+sadis[j]+SMS[3];
               }}
                for(int j=0;j<salis.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           ትንቢት="ትት"+ste.substring(0,1)+geez[j];
           ትእዛዝ="ተ"+ste.substring(0,1)+geez[j];
         }}
               for(int j=0;j<geez.length;j++){
         if( ሓላፊ.substring(2,3).equals(geez[j])){
           ትንቢት=ትንቢት+salis[j];
           ትእዛዝ=ትእዛዝ+salis[j];
           ምክንያታዊ=ትንቢት;
               }}
               //?
              for(int j=0;j<salis.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           ቦዝ="ተ"+ste.substring(0,2)+geez[j]+SMS[3];
           ss=salis[j];
         }}
               for(int j=0;j<geez.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           አርእስት="ተ"+ste.substring(0,1)+sadis[j];
           /* ሳልስቅጽል="ተ"+ste.substring(0,1)+rabie[j]+ss;
           ሳልስቅጽል1=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያኒሁ";
        ሳልስቅጽል2=ሳልስቅጽል.substring(0, 4)+"ቱ";
        ሳልስቅጽል3=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያቲሁ";*/
               }} 
               for(int j=0;j<salis.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           አርእስት=አርእስት+sabie[j];
           አርእስት=አርእስት+"ት"+SMS[3];
         }} }
         break;
         case "ተጋብሮ/reciprocal/":{
             ገቢር="ተ"+ሓላፊ.substring(1,2);
             for(int j=0;j<geez.length;j++){
         if( ste.substring(0,1).equals(geez[j])){
           ገቢር="ተ"+rabie[j]+ሓላፊ.substring(1,2);
            for(int i=0;i<sadis.length;i++){
      if( ste.substring(2,3).equals(sadis[i])){
          ገቢር=ገቢር+sadis[i]+SMS[3];
           ሊተ=ገቢር+OMS[22];
            ለነ=ገቢር+OMS[23];
            ለከ=ገቢር+OMS[0];
            ለክሙ=ገቢር+OMS[10];                
            ለኪ=ገቢር+OMS[2];  
            ለክን=ገቢር+OMS[3];  
           ሎቱ=ገቢር.substring(0,4)+OMS[5];
            ሎሙ=ገቢር.substring(0,4)+OMS[12];
            ላቲ=ገቢር.substring(0,4)+OMS[15];
            ሎን=ገቢር.substring(0,4)+OMS[19];
               }}}}
            
                for(int j=0;j<geez.length;j++){
         if( ste.substring(0,1).equals(geez[j])){
           ትንቢት="ይት"+rabie[j]+ሓላፊ.substring(1,2);
           ቅርብ_ትእዛዝ="ተ"+rabie[j]+ሓላፊ.substring(1,2);;
         }}
               for(int i=0;i<geez.length;i++){
         if( ሓላፊ.substring(2,3).equals(geez[i])){
           ትንቢት=ትንቢት+rabie[i];
                  ሊተ_ት=ትንቢት.substring(0,5)+OMS[22];
             ለነ_ት=ትንቢት.substring(0,5)+OMS[23];
             ለከ_ት=ትንቢት.substring(0,5)+OMS[0];
             ለክሙ_ት=   ትንቢት.substring(0,5)+OMS[10] ;         
             ለኪ_ት=ትንቢት.substring(0,5)+OMS[2];  
             ለክን_ት=ትንቢት.substring(0,5)+OMS[3];
             ሎቱ_ት=ትንቢት.substring(0,5)+OMS[5] ;
             ሎሙ_ት=ትንቢት.substring(0,5)+OMS[12];
             ላቲ_ት=ትንቢት.substring(0,5)+OMS[15];
             ሎን_ት=ትንቢት.substring(0,5)+OMS[19];
         
                      ሊተ_ትእ=ትንቢት.substring(0,5)+OMS[22];
             ለነ_ትእ=ትንቢት.substring(0,5)+OMS[23];
             ለከ_ትእ=ትንቢት.substring(0,5)+OMS[0];
             ለክሙ_ትእ=   ትንቢት.substring(0,5)+OMS[10] ;         
             ለኪ_ትእ=ትንቢት.substring(0,5)+OMS[2];  
             ለክን_ትእ=ትንቢት.substring(0,5)+OMS[3];
             ሎቱ_ትእ=ትንቢት.substring(0,5)+OMS[5] ;
             ሎሙ_ትእ=ትንቢት.substring(0,5)+OMS[12];
             ላቲ_ትእ=ትንቢት.substring(0,5)+OMS[15];
             ሎን_ትእ=ትንቢት.substring(0,5)+OMS[19];
             //
               ሊተ_ም=ትንቢት.substring(0,5)+OMS[22];
             ለነ_ም=ትንቢት.substring(0,5)+OMS[23];
             ለከ_ም=ትንቢት.substring(0,5)+OMS[0];
             ለክሙ_ም=   ትንቢት.substring(0,5)+OMS[10] ;         
             ለኪ_ም=ትንቢት.substring(0,5)+OMS[2];  
             ለክን_ም=ትንቢት.substring(0,5)+OMS[3];
             ሎቱ_ም=ትንቢት.substring(0,5)+OMS[5] ;
             ሎሙ_ም=ትንቢት.substring(0,5)+OMS[12];
             ላቲ_ም=ትንቢት.substring(0,5)+OMS[15];
             ሎን_ም=ትንቢት.substring(0,5)+OMS[19];
           ቅርብ_ትእዛዝ=ቅርብ_ትእዛዝ+sadis[i];
           ትእዛዝ=ትንቢት;
            ምክንያታዊ=ትንቢት;
               }}
              for(int j=0;j<salis.length;j++){
         if( ste.substring(0,1).equals(geez[j])){
           ቦዝ="ተ"+rabie[j]+ste.substring(1, 2);
           አርእስት="ተ"+rabie[j];
           
         }}
               for(int j=0;j<geez.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           አርእስት=አርእስት+sadis[j];
         
               }} 
               for(int j=0;j<salis.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
             //ሳ ? ልስቅጽ
               /*ሳልስቅጽል1=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያኒሁ";
        ሳልስቅጽል2=ሳልስቅጽል.substring(0, 4)+"ቱ";
        ሳልስቅጽል3=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያቲሁ";*/
           ቦዝ=ቦዝ+geez[j]+SMS[3];
           አርእስት=አርእስት+sabie[j]+"ት"+SMS[3];
         }}
         }
       }}
  break;
    case "አንትሙ/You(2ppm)/":{
       switch(stemType)
   {
        case "ገቢር/perfective/":{
            for(int j=0;j<sadis.length;j++){
      if( ste.substring(2,3).equals(sadis[j])){
            ገቢር=ሓላፊ.substring(0,2)+sadis[j]+SMS[4];
          for(int m=0;m<kaeb.length;m++){
            if( ገቢር.substring(4,5).equals(kaeb[m])){
            ሊተ=ገቢር.substring(0,5)+OMS[22];
            ለነ=ገቢር.substring(0,5)+OMS[23];
            ለከ="-";
            ለክሙ="-";                
            ለኪ="-";  
            ለክን="-";
            ሎቱ=ገቢር.substring(0,4)+sadis[m]+OMS[7];
            ሎሙ=ገቢር.substring(0,4)+sadis[m]+OMS[9];
            ላቲ=ገቢር.substring(0,4)+sadis[m]+OMS[14];
            ሎን=ገቢር.substring(0,4)+sadis[m]+OMS[18]; 
                    } }}}
       for(int j=0;j<sadis.length;j++){
       if( ste.substring(1,2).equals(salis[j])){
            ትንቢት=prefix[4]+ste.substring(0,1)+sadis[j];
          for(int m=0;m<kaeb.length;m++){
            if( ste.substring(2,3).equals(sadis[m])){
                ትንቢት=ትንቢት+kaeb[m];
            ሊተ_ት=ትንቢት.substring(0,4)+OMS[22];
            ለነ_ት=ትንቢት.substring(0,4)+OMS[23];
            ለከ_ት="-";
            ለክሙ_ት="-";                
            ለኪ_ት="-";  
            ለክን_ት="-";
             ሎቱ_ት=ትንቢት.substring(0,3)+sadis[m]+OMS[7];
            ሎሙ_ት=ትንቢት.substring(0,3)+sadis[m]+OMS[9];
            ላቲ_ት=ትንቢት.substring(0,3)+sadis[m]+OMS[14];
            ሎን_ት=ትንቢት.substring(0,3)+sadis[m]+OMS[18]; 
                    } }
                    } 
       }
  for(int j=0;j<sadis.length;j++){
       if( ste.substring(0,1).equals(geez[j])){
            ትእዛዝ=sadis[j];
       }}
   for(int j=0;j<salis.length;j++){
       if( ste.substring(1,2).equals(salis[j])){  
          for(int m=0;m<kaeb.length;m++){
            if( ste.substring(2,3).equals(sadis[m])){
                ትእዛዝ=ትእዛዝ+sadis[j]+kaeb[m];
            ሊተ_ትእ=ትእዛዝ.substring(0,3)+OMS[22];
            ለነ_ትእ=ትእዛዝ.substring(0,3)+OMS[23];
            ለከ_ትእ="-";
            ለክሙ_ትእ="-";                
            ለኪ_ትእ="-";  
            ለክን_ትእ="-";
           ሎቱ_ትእ=ትእዛዝ.substring(0,2)+sadis[m]+OMS[7];
            ሎሙ_ትእ=ትእዛዝ.substring(0,2)+sadis[m]+OMS[9];
            ላቲ_ትእ=ትእዛዝ.substring(0,2)+sadis[m]+OMS[14];
            ሎን_ትእ=ትእዛዝ.substring(0,2)+sadis[m]+OMS[18]; 
                    } }
                    }
       }
     for(int j=0;j<sadis.length;j++){
       if( ste.substring(0,1).equals(geez[j])){
            ምክንያታዊ=prefix[4]+sadis[j];
       }}
   for(int j=0;j<salis.length;j++){
       if( ste.substring(1,2).equals(salis[j])){
          for(int m=0;m<kaeb.length;m++){
            if( ste.substring(2,3).equals(sadis[m])){
                ምክንያታዊ=ምክንያታዊ+sadis[j]+kaeb[m];
            ሊተ_ም=ምክንያታዊ.substring(0,4)+OMS[22];
            ለነ_ም=ምክንያታዊ.substring(0,4)+OMS[23];
            ለከ_ም="-";
            ለክሙ_ም="-";                
            ለኪ_ም="-";  
            ለክን_ም="-";
            ሎቱ_ም=ምክንያታዊ.substring(0,3)+sadis[m]+OMS[7];
            ሎሙ_ም=ምክንያታዊ.substring(0,3)+sadis[m]+OMS[9];
            ላቲ_ም=ምክንያታዊ.substring(0,3)+sadis[m]+OMS[14];
            ሎን_ም=ምክንያታዊ.substring(0,3)+sadis[m]+OMS[18]; 
                    } }
                    }
       }
            for(int j=0;j<salis.length;j++){
         if( ste.substring(0,1).equals(geez[j])){   
           አርእስት=geez[j]+ste.substring(1,2);
           ቦዝ=geez[j]+ste.substring(1, 2);
         }}  
               for(int j=0;j<salis.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
             //ሳ ? ልስቅጽ
               /*ሳልስቅጽል1=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያኒሁ";
        ሳልስቅጽል2=ሳልስቅጽል.substring(0, 4)+"ቱ";
        ሳልስቅጽል3=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያቲሁ";*/
           ቦዝ=ቦዝ+geez[j]+SMS[4];
           አርእስት=አርእስት+sabie[j]+"ት"+SMS[4];
         }}
        
          }  break;
         case "አግብሮ/causative/":{
             for(int j=0;j<sadis.length;j++){
      if( ste.substring(0,1).equals(geez[j])){
            ገቢር="አ"+sadis[j];
      }}
               for(int j=0;j<sadis.length;j++){
      if( ste.substring(1,2).equals(salis[j])){  
            ገቢር=ገቢር+geez[j]+ste.substring(2,3)+SMS[4];
      }}
            ሊተ=ገቢር+OMS[22];
            ለነ=ገቢር+OMS[23];
            ለከ="";
            ለክሙ="";                
            ለኪ="";  
            ለክን="";
            for(int i=0;i<kaeb.length;i++){
      if( ገቢር.substring(5,6).equals(kaeb[i])){
            ሎቱ=ገቢር.substring(0,5)+sadis[i]+OMS[7];
            ሎሙ=ገቢር.substring(0,5)+sadis[i]+OMS[9];
            ላቲ=ገቢር.substring(0,5)+sadis[i]+OMS[14];
            ሎን=ገቢር.substring(0,5)+sadis[i]+OMS[18];
                 
       }}
            //ትንቢት
               for(int j=0;j<sadis.length;j++){
                   for(int i=0;i<sadis.length;i++){
      if( ste.substring(1,2).equals(salis[j])){
       if( ste.substring(2,3).equals(sadis[i])){
            ትንቢት="ታ"+ste.substring(0,1)+sadis[j]+kaeb[i];
      }}}}
            ሊተ_ት=ትንቢት+OMS[22];
            ለነ_ት=ትንቢት+OMS[23];
            ለከ_ት="";
            ለክሙ_ት="";                
            ለኪ_ት="";  
            ለክን_ት="";
            for(int i=0;i<kaeb.length;i++){
      if( ትንቢት.substring(3,4).equals(kaeb[i])){
            ሎቱ_ት=ትንቢት.substring(0,3)+sadis[i]+OMS[7];
            ሎሙ_ት=ትንቢት.substring(0,3)+sadis[i]+OMS[9];
            ላቲ_ት=ትንቢት.substring(0,3)+sadis[i]+OMS[14];
            ሎን_ት=ትንቢት.substring(0,3)+sadis[i]+OMS[18];
                 
       }}
        for(int j=0;j<sadis.length;j++){
           if( ste.substring(0,1).equals(geez[j])){
            ትእዛዝ="አ"+sadis[j];
             ምክንያታዊ="ታ"+sadis[j];
           }
            }
         for(int j=0;j<sadis.length;j++){
      if( ste.substring(1,2).equals(salis[j])){
          for(int i=0;i<sadis.length;i++){
               if( ste.substring(2,3).equals(sadis[i])){
                    ትእዛዝ=ትእዛዝ+sadis[j]+kaeb[i];
                    ምክንያታዊ=ምክንያታዊ+sadis[j]+kaeb[i];
             ሊተ_ትእ=ትእዛዝ+OMS[22];
             ለነ_ትእ=ትእዛዝ+OMS[23];
             ለከ_ትእ="";
             ለክሙ_ትእ= "";         
             ለኪ_ትእ="";  
             ለክን_ትእ="" ;
            ሎቱ_ትእ=ትእዛዝ.substring(0,3)+sadis[i]+OMS[7];
            ሎሙ_ትእ=ትእዛዝ.substring(0,3)+sadis[i]+OMS[9];
            ላቲ_ትእ=ትእዛዝ.substring(0,3)+sadis[i]+OMS[14];
            ሎን_ትእ=ትእዛዝ.substring(0,3)+sadis[i]+OMS[18];
             //     
             ሊተ_ም=ምክንያታዊ+OMS[22];
             ለነ_ም=ምክንያታዊ+OMS[23];
             ለከ_ም="";
             ለክሙ_ም= "";         
             ለኪ_ም="";  
             ለክን_ም="" ;
            ሎቱ_ም=ምክንያታዊ.substring(0,3)+sadis[i]+OMS[7];
            ሎሙ_ም=ምክንያታዊ.substring(0,3)+sadis[i]+OMS[9];
            ላቲ_ም=ምክንያታዊ.substring(0,3)+sadis[i]+OMS[14];
            ሎን_ም=ምክንያታዊ.substring(0,3)+sadis[i]+OMS[18];
                    } }}
       }
         String d="";
   for(int j=0;j<salis.length;j++){
     if( ste.substring(2,3).equals(sadis[j])){
         ቦዝ=ገቢር.substring(0,2)+ste.substring(1,2)+geez[j]+SMS[4];
         //ሳልስቅጽል=ገቢር.substring(0,2);
        ss=sabie[j]; 
    }}
   for(int j=0;j<salis.length;j++){
     if( ste.substring(1,2).equals(salis[j])){
       // አርእስት=ቦዝ.substring(0,2)+sadis[j]+ቦዝ.substring(3,4);
        አርእስት1=ቦዝ.substring(0,2)+sadis[j]+ss+"ት"+SMS[4];
       /* ሳልስቅጽል=ሳልስቅጽል+rabie[j]+ss1;
         ሳልስቅጽል1=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያኒሁ";
        ሳልስቅጽል2=ሳልስቅጽል.substring(0, 4)+"ቱ";
        ሳልስቅጽል3=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያቲሁ";*/
        }}
        }
        break;
         case "አስተጋብሮ/causative-reciprocal/":{
             for(int j=0;j<sadis.length;j++){
      if( ste.substring(0,1).equals(geez[j])){
            ገቢር="አስተ"+rabie[j]+ሓላፊ.substring(1,2)+ste.substring(2,3)+SMS[4];
            ሊተ=ገቢር+OMS[22];
            ለነ=ገቢር+OMS[23];
            ለከ="";
            ለክሙ="";                
            ለኪ="";  
            ለክን="";
            for(int i=0;i<kaeb.length;i++){
      if( ገቢር.substring(7,8).equals(kaeb[i])){
            ሎቱ=ገቢር.substring(0,7)+sadis[i]+OMS[7];
            ሎሙ=ገቢር.substring(0,7)+sadis[i]+OMS[9];
            ላቲ=ገቢር.substring(0,7)+sadis[i]+OMS[14];
            ሎን=ገቢር.substring(0,7)+sadis[i]+OMS[18];
                    } 
       }}}
                   for(int j=0;j<geez.length;j++){
      if( ste.substring(0,1).equals(geez[j])){
            ትንቢት="ታስተ"+rabie[j];
            ትእዛዝ="አስተ"+rabie[j];
      }}
           for(int j=0;j<sadis.length;j++){
      if( ste.substring(1,2).equals(salis[j])){
          for(int i=0;i<sadis.length;i++){
               if( ste.substring(2,3).equals(sadis[i])){
                    ትንቢት=ትንቢት+sadis[j]+kaeb[i];
                   ሊተ_ት=ትንቢት.substring(0,6)+OMS[22];
             ለነ_ት=ትንቢት.substring(0,6)+OMS[23];
             ለከ_ት="";
             ለክሙ_ት="" ;         
             ለኪ_ት="";  
             ለክን_ት="";
              ትእዛዝ=ትእዛዝ+sadis[j]+kaeb[i];
              ሊተ_ትእ=ትእዛዝ.substring(0,6)+OMS[22];
             ለነ_ትእ=ትእዛዝ.substring(0,6)+OMS[23];
             ለከ_ትእ="";
             ለክሙ_ትእ="" ;         
             ለኪ_ትእ="";  
             ለክን_ትእ="";
              ምክንያታዊ=ትንቢት;  
             ሊተ_ም=ምክንያታዊ.substring(0,6)+OMS[22];
             ለነ_ም=ምክንያታዊ.substring(0,6)+OMS[23];
             ለከ_ም="";
             ለክሙ_ም="" ;         
             ለኪ_ም="";  
             ለክን_ም="";
               }}
           for(int i=0;i<kaeb.length;i++){
      if( ትንቢት.substring(5,6).equals(kaeb[i])){
            ሎቱ_ት=ትንቢት.substring(0,5)+sadis[i]+OMS[7];
            ሎሙ_ት=ትንቢት.substring(0,5)+sadis[i]+OMS[9];
            ላቲ_ት=ትንቢት.substring(0,5)+sadis[i]+OMS[14];
            ሎን_ት=ትንቢት.substring(0,5)+sadis[i]+OMS[18];
            //
             ሎቱ_ትእ=ትእዛዝ.substring(0,5)+sadis[i]+OMS[7];
            ሎሙ_ትእ=ትእዛዝ.substring(0,5)+sadis[i]+OMS[9];
            ላቲ_ትእ=ትእዛዝ.substring(0,5)+sadis[i]+OMS[14];
            ሎን_ትእ=ትእዛዝ.substring(0,5)+sadis[i]+OMS[18];
            //
             ሎቱ_ም=ምክንያታዊ.substring(0,5)+sadis[i]+OMS[7];
            ሎሙ_ም=ምክንያታዊ.substring(0,5)+sadis[i]+OMS[9];
            ላቲ_ም=ምክንያታዊ.substring(0,5)+sadis[i]+OMS[14];
            ሎን_ም=ምክንያታዊ.substring(0,5)+sadis[i]+OMS[18];
                    } }}
       }
           
                  for(int j=0;j<geez.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           ቦዝ=ገቢር.substring(0, 4)+ste.substring(1,2)+geez[j]+SMS[4];
           ss=salis[j];
         }}
               for(int j=0;j<geez.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           አርእስት=ገቢር.substring(0, 4)+sadis[j];
           ሳልስቅጽል=ገቢር.substring(0, 4)+rabie[j]+ss+SMS[4];
           ሳልስቅጽል1=ሳልስቅጽል.substring(0, 5)+ste.substring(2,3)+"ያኒሁ";
        ሳልስቅጽል2=ሳልስቅጽል.substring(0, 6)+"ቱ";
        ሳልስቅጽል3=ሳልስቅጽል.substring(0, 5)+ste.substring(2,3)+"ያቲሁ";
               }} 
               for(int j=0;j<salis.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           አርእስት=አርእስት+sabie[j]+"ት"+SMS[4];
         }}
        }
         break;
         case "ተገብሮ/reflexive/":{
             for(int j=0;j<salis.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           ተገብሮ=prefix[15]+ste.substring(0,1)+geez[j];
         }}
               for(int j=0;j<geez.length;j++){
         if( ሓላፊ.substring(2,3).equals(geez[j])){
           ገቢር=ተገብሮ+sadis[j]+SMS[4];
               }}
                for(int j=0;j<kaeb.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
          ምክንያታዊ=ትንቢት=prefix[7]+ሓላፊ.substring(0,2)+kaeb[j];
          ትእዛዝ=prefix[15]+ሓላፊ.substring(0,2)+kaeb[j];
         }}
               for(int j=0;j<geez.length;j++){
         if( ሓላፊ.substring(2,3).equals(geez[j])){
           //ትንቢት=ትንቢት+sadis[j];
           //ምክንያታዊ=ትንቢት;
               }}
              for(int j=0;j<salis.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           ቦዝ="ተ"+ste.substring(0,2)+geez[j]+SMS[4];
           ss=salis[j];
         }}
               for(int j=0;j<geez.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           አርእስት="ተ"+ste.substring(0,1)+sadis[j];
           /* ሳልስቅጽል="ተ"+ste.substring(0,1)+rabie[j]+ss;
           ሳልስቅጽል1=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያኒሁ";
        ሳልስቅጽል2=ሳልስቅጽል.substring(0, 4)+"ቱ";
        ሳልስቅጽል3=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያቲሁ";*/
               }} 
               for(int j=0;j<salis.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           አርእስት=አርእስት+sabie[j]+"ት"+SMS[4];
         }}
         }
         break;
         case "ተጋብሮ/reciprocal/":{
             for(int j=0;j<geez.length;j++){
         if( ste.substring(0,1).equals(geez[j])){
            for(int i=0;i<sadis.length;i++){
      if( ste.substring(2,3).equals(sadis[i])){
          ገቢር="ተ"+rabie[j]+ሓላፊ.substring(1,2)+sadis[i]+SMS[4];
           ሊተ=ገቢር+OMS[22];
           ለነ=ገቢር+OMS[23];
            ለከ="";
            ለክሙ="";                
            ለኪ="";  
            ለክን="";
      }}}}
               for(int i=0;i<kaeb.length;i++){
      if( ገቢር.substring(5,6).equals(kaeb[i])){
          ሎቱ=ገቢር.substring(0,5)+sadis[i]+OMS[7];
            ሎሙ=ገቢር.substring(0,5)+sadis[i]+OMS[9];
            ላቲ=ገቢር.substring(0,5)+sadis[i]+OMS[14];
            ሎን=ገቢር.substring(0,5)+sadis[i]+OMS[18];
               }}
                for(int j=0;j<geez.length;j++){
         if( ste.substring(0,1).equals(geez[j])){
         ትንቢት=prefix[7]+rabie[j];
           ትእዛዝ=prefix[15]+rabie[j]+ሓላፊ.substring(1,2);;
         }}
               for(int i=0;i<geez.length;i++){
         if( ሓላፊ.substring(2,3).equals(geez[i])){ 
             ምክንያታዊ=ትንቢት=ትንቢት+ሓላፊ.substring(1,2)+kaeb[i];
             ትእዛዝ=ትእዛዝ+kaeb[i];
                 ሊተ_ት=ትንቢት+OMS[22];
             ለነ_ት=ትንቢት+OMS[23];
             ለከ_ት="";
             ለክሙ_ት="" ;         
             ለኪ_ት="";  
             ለክን_ት="";
             //
             ሊተ_ም=ትእዛዝ+OMS[22];
             ለነ_ም=ትእዛዝ+OMS[23];
             ለከ_ም="";
             ለክሙ_ም="" ;         
             ለኪ_ም="";  
             ለክን_ም="";
             //
             ሊተ_ትእ=ትእዛዝ+OMS[22];
             ለነ_ትእ=ትእዛዝ+OMS[23];
             ለከ_ትእ="";
             ለክሙ_ትእ="" ;         
             ለኪ_ትእ="";  
             ለክን_ትእ="";
         }}
              for(int i=0;i<kaeb.length;i++){
      if( ትንቢት.substring(4,5).equals(kaeb[i])){
            ሎቱ_ት=ትንቢት.substring(0,4)+sadis[i]+OMS[7];
            ሎሙ_ት=ትንቢት.substring(0,4)+sadis[i]+OMS[9];
            ላቲ_ት=ትንቢት.substring(0,4)+sadis[i]+OMS[14];
            ሎን_ት=ትንቢት.substring(0,4)+sadis[i]+OMS[18];
            //
             ሎቱ_ም=ትንቢት.substring(0,4)+sadis[i]+OMS[7];
            ሎሙ_ም=ትንቢት.substring(0,4)+sadis[i]+OMS[9];
            ላቲ_ም=ትንቢት.substring(0,4)+sadis[i]+OMS[14];
            ሎን_ም=ትንቢት.substring(0,4)+sadis[i]+OMS[18];
               }}
              for(int i=0;i<kaeb.length;i++){
      if( ትእዛዝ.substring(3,4).equals(kaeb[i])){
            ሎቱ_ትእ=ትእዛዝ.substring(0,3)+sadis[i]+OMS[7];
            ሎሙ_ትእ=ትእዛዝ.substring(0,3)+sadis[i]+OMS[9];
            ላቲ_ትእ=ትእዛዝ.substring(0,3)+sadis[i]+OMS[14];
            ሎን_ትእ=ትእዛዝ.substring(0,3)+sadis[i]+OMS[18];
      }}
              for(int j=0;j<salis.length;j++){
         if( ste.substring(0,1).equals(geez[j])){
           ቦዝ="ተ"+rabie[j]+ste.substring(1, 2);
           አርእስት="ተ"+rabie[j];
            ሳልስቅጽል="ተ"+rabie[j];
           
         }}
               for(int j=0;j<geez.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           አርእስት=አርእስት+sadis[j];
           ሳልስቅጽል=ሳልስቅጽል+rabie[j];
         
               }} 
               for(int j=0;j<salis.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
             ሳልስቅጽል=ሳልስቅጽል+salis[j];
            /*   ሳልስቅጽል1=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያኒሁ";
        ሳልስቅጽል2=ሳልስቅጽል.substring(0, 4)+"ቱ";
        ሳልስቅጽል3=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያቲሁ";*/
           ቦዝ=ቦዝ+geez[j]+SMS[4];
           አርእስት=አርእስት+sabie[j]+"ት"+SMS[4];
       
         }}
     }
   }
    }
    break;
    case "አንትን/You(2ppf)/":{
       switch(stemType)
   {
        case "ገቢር/perfective/":{
            for(int j=0;j<sadis.length;j++){
      if( ste.substring(2,3).equals(sadis[j])){
            ገቢር=ሓላፊ.substring(0,2)+sadis[j]+SMS[5];
      }}
          for(int m=0;m<sadis.length;m++){
            if( ገቢር.substring(4,5).equals(sadis[m])){
            ሊተ=ገቢር.substring(0,4)+rabie[m]+OMS[22];
            ለነ=ገቢር.substring(0,4)+rabie[m]+OMS[23];
            ለከ="-";
            ለክሙ="-";                
            ለኪ="-";  
            ለክን="-";
            ሎቱ=ገቢር.substring(0,4)+rabie[m]+OMS[5];
            ሎሙ=ገቢር.substring(0,4)+rabie[m]+OMS[12];
            ላቲ=ገቢር.substring(0,4)+rabie[m]+OMS[4];
            ሎን=ገቢር.substring(0,4)+rabie[m]+OMS[19]; 
                    } }   
             for(int j=0;j<sadis.length;j++){
       if( ste.substring(0,1).equals(geez[j])){
            ትእዛዝ=sadis[j];
            ምክንያታዊ=prefix[4]+sadis[j];
       }}
       for(int j=0;j<sadis.length;j++){
       if( ste.substring(1,2).equals(salis[j])){
            ትንቢት=prefix[4]+ste.substring(0,1)+sadis[j];
            ትእዛዝ=ትእዛዝ+sadis[j];
            ምክንያታዊ=ምክንያታዊ+sadis[j];
       }}
          for(int m=0;m<kaeb.length;m++){
            if( ste.substring(2,3).equals(sadis[m])){
                ትንቢት=ትንቢት+rabie[m];
                ትእዛዝ=ትእዛዝ+rabie[m];
                 ምክንያታዊ=ምክንያታዊ+rabie[m];
            ሊተ_ት=ትንቢት.substring(0,4)+OMS[22];
            ለነ_ት=ትንቢት.substring(0,4)+OMS[23];
            ለከ_ት="-";
            ለክሙ_ት="-";                
            ለኪ_ት="-";  
            ለክን_ት="-";
             ሎቱ_ት=ትንቢት+OMS[5];
            ሎሙ_ት=ትንቢት+OMS[12];
            ላቲ_ት=ትንቢት+OMS[4];
            ሎን_ት=ትንቢት+OMS[19]; 
            //
            ሊተ_ም=ምክንያታዊ.substring(0,4)+OMS[22];
            ለነ_ም=ምክንያታዊ.substring(0,4)+OMS[23];
            ለከ_ም="-";
            ለክሙ_ም="-";                
            ለኪ_ም="-";  
            ለክን_ም="-";
             ሎቱ_ም=ምክንያታዊ+OMS[5];
            ሎሙ_ም=ምክንያታዊ+OMS[12];
            ላቲ_ም=ምክንያታዊ+OMS[4];
            ሎን_ም=ምክንያታዊ+OMS[19]; 
            //
            ሊተ_ትእ=ትእዛዝ.substring(0,3)+OMS[22];
            ለነ_ትእ=ትእዛዝ.substring(0,3)+OMS[23];
            ለከ_ትእ="-";
            ለክሙ_ትእ="-";                
            ለኪ_ትእ="-";  
            ለክን_ትእ="-";
           ሎቱ_ትእ=ትእዛዝ+OMS[5];
            ሎሙ_ትእ=ትእዛዝ+OMS[12];
            ላቲ_ትእ=ትእዛዝ+OMS[4];
            ሎን_ትእ=ትእዛዝ+OMS[19]; 
                    }  }
            for(int j=0;j<salis.length;j++){
         if( ste.substring(0,1).equals(geez[j])){   
           አርእስት=geez[j]+ste.substring(1,2);
           ቦዝ=geez[j]+ste.substring(1, 2);
         }}  
               for(int j=0;j<salis.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
             //ሳ ? ልስቅጽ
               /*ሳልስቅጽል1=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያኒሁ";
        ሳልስቅጽል2=ሳልስቅጽል.substring(0, 4)+"ቱ";
        ሳልስቅጽል3=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያቲሁ";*/
           ቦዝ=ቦዝ+geez[j]+SMS[5];
           አርእስት=አርእስት+sabie[j]+"ት"+SMS[5];
         }}
          }  
        break;
         case "አግብሮ/causative/":{
             for(int j=0;j<sadis.length;j++){
      if( ste.substring(0,1).equals(geez[j])){
            ገቢር=prefix[1]+sadis[j];
            ትንቢት=prefix[5]+ste.substring(0,1);
            ትእዛዝ=sadis[j];
             ምክንያታዊ=prefix[4]+sadis[j];
      }}
               for(int j=0;j<sadis.length;j++){
      if( ste.substring(1,2).equals(salis[j])){  
             for(int i=0;i<sadis.length;i++){
      if( ste.substring(2,3).equals(sadis[i])){ 
            ገቢር=ገቢር+geez[j]+ste.substring(2,3)+SMS[5];
            ትንቢት=ትንቢት+sadis[j]+rabie[i];
            ትእዛዝ=ትእዛዝ+sadis[j]+rabie[i];
             ምክንያታዊ=ምክንያታዊ+sadis[j]+rabie[i];
      }}}}
               for(int m=0;m<sadis.length;m++){
            if( ገቢር.substring(5,6).equals(sadis[m])){
            ሊተ=ገቢር.substring(0,5)+rabie[m]+OMS[22];
            ለነ=ገቢር.substring(0,5)+rabie[m]+OMS[23];
            ለከ="-";
            ለክሙ="-";                
            ለኪ="-";  
            ለክን="-";
            ሎቱ=ገቢር.substring(0,5)+rabie[m]+OMS[5];
            ሎሙ=ገቢር.substring(0,5)+rabie[m]+OMS[12];
            ላቲ=ገቢር.substring(0,5)+rabie[m]+OMS[4];
            ሎን=ገቢር.substring(0,5)+rabie[m]+OMS[19]; 
                    } }
               //ትንቢት
            ሊተ_ት=ትንቢት+OMS[22];
            ለነ_ት=ትንቢት+OMS[23];
            ለከ_ት="";
            ለክሙ_ት="";                
            ለኪ_ት="";  
            ለክን_ት="";
            for(int i=0;i<kaeb.length;i++){
      if( ትንቢት.substring(3,4).equals(rabie[i])){
            ሎቱ_ት=ትንቢት.substring(0,3)+rabie[i]+OMS[5];
            ሎሙ_ት=ትንቢት.substring(0,3)+rabie[i]+OMS[12];
            ላቲ_ት=ትንቢት.substring(0,3)+rabie[i]+OMS[4];
            ሎን_ት=ትንቢት.substring(0,3)+rabie[i]+OMS[19];
                 
       }}
        for(int j=0;j<sadis.length;j++){
           if( ste.substring(0,1).equals(geez[j])){
             ሊተ_ትእ=ትእዛዝ+OMS[22];
             ለነ_ትእ=ትእዛዝ+OMS[23];
             ለከ_ትእ="";
             ለክሙ_ትእ= "";         
             ለኪ_ትእ="";  
             ለክን_ትእ="" ;
            ሎቱ_ትእ=ትእዛዝ+OMS[5];
            ሎሙ_ትእ=ትእዛዝ+OMS[12];
            ላቲ_ትእ=ትእዛዝ+OMS[4];
            ሎን_ትእ=ትእዛዝ+OMS[19];
             //     
             ሊተ_ም=ምክንያታዊ+OMS[22];
             ለነ_ም=ምክንያታዊ+OMS[23];
             ለከ_ም="";
             ለክሙ_ም= "";         
             ለኪ_ም="";  
             ለክን_ም="" ;
            ሎቱ_ም=ምክንያታዊ+OMS[5];
            ሎሙ_ም=ምክንያታዊ+OMS[12];
            ላቲ_ም=ምክንያታዊ+OMS[4];
            ሎን_ም=ምክንያታዊ+OMS[19];
                    } 
       }
         String d="";
   for(int j=0;j<salis.length;j++){
     if( ste.substring(2,3).equals(sadis[j])){
         ቦዝ=ገቢር.substring(0,2)+ste.substring(1,2)+geez[j]+SMS[5];
         //ሳልስቅጽል=ገቢር.substring(0,2);
        ss=sabie[j]; 
    }}
   for(int j=0;j<salis.length;j++){
     if( ste.substring(1,2).equals(salis[j])){
       // አርእስት=ቦዝ.substring(0,2)+sadis[j]+ቦዝ.substring(3,4);
        አርእስት1=ቦዝ.substring(0,2)+sadis[j]+ss+"ት"+SMS[5];
       /* ሳልስቅጽል=ሳልስቅጽል+rabie[j]+ss1;
         ሳልስቅጽል1=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያኒሁ";
        ሳልስቅጽል2=ሳልስቅጽል.substring(0, 4)+"ቱ";
        ሳልስቅጽል3=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያቲሁ";*/
        }}
        }
        break;
         case "አስተጋብሮ/causative-reciprocal/":{
             for(int j=0;j<sadis.length;j++){
      if( ste.substring(0,1).equals(geez[j])){
            ገቢር=prefix[10]+rabie[j]+ሓላፊ.substring(1,2)+ste.substring(2,3)+SMS[5];
             for(int i=0;i<kaeb.length;i++){
      if( ste.substring(1,2).equals(salis[i])){
            ትንቢት=prefix[8]+rabie[j]+sadis[i];
            ትእዛዝ=prefix[10]+rabie[j]+sadis[i];
      }}
        for(int i=0;i<kaeb.length;i++){
      if( ste.substring(2,3).equals(sadis[i])){
            ትንቢት=ትንቢት+rabie[i];
            ትእዛዝ=ትእዛዝ+rabie[i];
      }}      
            for(int i=0;i<kaeb.length;i++){
      if( ገቢር.substring(7,8).equals(sadis[i])){
          ሊተ=ገቢር.substring(0,7)+rabie[i]+OMS[22];
            ለነ=ገቢር.substring(0,7)+rabie[i]+OMS[23];
            ለከ="";
            ለክሙ="";                
            ለኪ="";  
            ለክን="";
            ሎቱ=ገቢር.substring(0,7)+rabie[i]+OMS[5];
            ሎሙ=ገቢር.substring(0,7)+rabie[i]+OMS[12];
            ላቲ=ገቢር.substring(0,7)+rabie[i]+OMS[4];
            ሎን=ገቢር.substring(0,7)+rabie[i]+OMS[19];
                    } 
       }}}
          for(int i=0;i<sadis.length;i++){
               if( ste.substring(2,3).equals(sadis[i])){
                   ሊተ_ት=ትንቢት.substring(0,6)+OMS[22];
             ለነ_ት=ትንቢት.substring(0,6)+OMS[23];
             ለከ_ት="";
             ለክሙ_ት="" ;         
             ለኪ_ት="";  
             ለክን_ት="";
              ሊተ_ትእ=ትእዛዝ.substring(0,6)+OMS[22];
             ለነ_ትእ=ትእዛዝ.substring(0,6)+OMS[23];
             ለከ_ትእ="";
             ለክሙ_ትእ="" ;         
             ለኪ_ትእ="";  
             ለክን_ትእ="";
              ምክንያታዊ=ትንቢት;  
             ሊተ_ም=ምክንያታዊ.substring(0,6)+OMS[22];
             ለነ_ም=ምክንያታዊ.substring(0,6)+OMS[23];
             ለከ_ም="";
             ለክሙ_ም="" ;         
             ለኪ_ም="";  
             ለክን_ም="";
               }}
           for(int i=0;i<kaeb.length;i++){
      if( ትንቢት.substring(5,6).equals(rabie[i])){
            ሎቱ_ት=ትንቢት+OMS[5];
            ሎሙ_ት=ትንቢት+OMS[12];
            ላቲ_ት=ትንቢት+OMS[4];
            ሎን_ት=ትንቢት+OMS[19];
            //
             ሎቱ_ትእ=ትእዛዝ+OMS[5];
            ሎሙ_ትእ=ትእዛዝ+OMS[12];
            ላቲ_ትእ=ትእዛዝ+OMS[4];
            ሎን_ትእ=ትእዛዝ+OMS[19];
            //
             ሎቱ_ም=ምክንያታዊ+OMS[5];
            ሎሙ_ም=ምክንያታዊ+OMS[12];
            ላቲ_ም=ምክንያታዊ+OMS[4];
            ሎን_ም=ምክንያታዊ+OMS[19];
                    } 
       }
           
                  for(int j=0;j<geez.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           ቦዝ=ገቢር.substring(0, 4)+ste.substring(1,2)+geez[j]+SMS[5];
           ss=salis[j];
         }}
               for(int j=0;j<geez.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           አርእስት=ገቢር.substring(0, 4)+sadis[j];
           /*ሳልስቅጽል=ገቢር.substring(0, 4)+rabie[j]+ss;
           ሳልስቅጽል1=ሳልስቅጽል.substring(0, 5)+ste.substring(2,3)+"ያኒሁ";
        ሳልስቅጽል2=ሳልስቅጽል.substring(0, 6)+"ቱ";
        ሳልስቅጽል3=ሳልስቅጽል.substring(0, 5)+ste.substring(2,3)+"ያቲሁ";*/
               }} 
               for(int j=0;j<salis.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           አርእስት=አርእስት+sabie[j]+"ት"+SMS[5];
        
         }}
        }
         break;
         case "ተገብሮ/reflexive/":{
             for(int j=0;j<salis.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           ተገብሮ=prefix[15]+ste.substring(0,1)+geez[j];
         }}
               for(int j=0;j<geez.length;j++){
         if( ሓላፊ.substring(2,3).equals(geez[j])){
           ገቢር=ተገብሮ+sadis[j]+SMS[5];
               }}
                for(int j=0;j<kaeb.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
          ምክንያታዊ=ትንቢት=prefix[7]+ሓላፊ.substring(0,2)+rabie[j];
          ትእዛዝ=prefix[15]+ሓላፊ.substring(0,2)+rabie[j];
         }}
              for(int j=0;j<salis.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           ቦዝ="ተ"+ste.substring(0,2)+geez[j]+SMS[5];
           ss=salis[j];
         }}
               for(int j=0;j<geez.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           አርእስት="ተ"+ste.substring(0,1)+sadis[j];
          /*  ሳልስቅጽል="ተ"+ste.substring(0,1)+rabie[j]+ss;
           ሳልስቅጽል1=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያኒሁ";
        ሳልስቅጽል2=ሳልስቅጽል.substring(0, 4)+"ቱ";
        ሳልስቅጽል3=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያቲሁ";*/
               }} 
               for(int j=0;j<salis.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           አርእስት=አርእስት+sabie[j]+"ት"+SMS[5];
          // አርእስት1=አርእስት+"ት";
         }}
         }
         break;
         case "ተጋብሮ/reciprocal/":{
             for(int j=0;j<geez.length;j++){
         if( ste.substring(0,1).equals(geez[j])){
            for(int i=0;i<sadis.length;i++){
      if( ste.substring(2,3).equals(sadis[i])){
          ገቢር="ተ"+rabie[j]+ሓላፊ.substring(1,2)+sadis[i]+SMS[5];
      }}
     for(int i=0;i<kaeb.length;i++){
      if( ገቢር.substring(5,6).equals(sadis[i])){
          ሊተ=ገቢር.substring(0,5)+rabie[i]+OMS[22];
            ለነ=ገቢር.substring(0,5)+rabie[i]+OMS[23];
            ለከ="";
            ለክሙ="";                
            ለኪ="";  
            ለክን="";
            ሎቱ=ገቢር.substring(0,5)+rabie[i]+OMS[5];
            ሎሙ=ገቢር.substring(0,5)+rabie[i]+OMS[12];
            ላቲ=ገቢር.substring(0,5)+rabie[i]+OMS[4];
            ሎን=ገቢር.substring(0,5)+rabie[i]+OMS[19];
                    } 
       }}}
                for(int j=0;j<geez.length;j++){
         if( ste.substring(0,1).equals(geez[j])){
         ትንቢት=prefix[7]+rabie[j];
           ትእዛዝ=prefix[15]+rabie[j]+ሓላፊ.substring(1,2);;
         }}
               for(int i=0;i<geez.length;i++){
         if( ሓላፊ.substring(2,3).equals(geez[i])){ 
             ምክንያታዊ=ትንቢት=ትንቢት+ሓላፊ.substring(1,2)+rabie[i];
             ትእዛዝ=ትእዛዝ+rabie[i];
                 ሊተ_ት=ትንቢት+OMS[22];
             ለነ_ት=ትንቢት+OMS[23];
             ለከ_ት="";
             ለክሙ_ት="" ;         
             ለኪ_ት="";  
             ለክን_ት="";
             //
             ሊተ_ም=ትእዛዝ+OMS[22];
             ለነ_ም=ትእዛዝ+OMS[23];
             ለከ_ም="";
             ለክሙ_ም="" ;         
             ለኪ_ም="";  
             ለክን_ም="";
             //
             ሊተ_ትእ=ትእዛዝ+OMS[22];
             ለነ_ትእ=ትእዛዝ+OMS[23];
             ለከ_ትእ="";
             ለክሙ_ትእ="" ;         
             ለኪ_ትእ="";  
             ለክን_ትእ="";
         }}
              for(int i=0;i<kaeb.length;i++){
      if( ትንቢት.substring(4,5).equals(rabie[i])){
            ሎቱ_ት=ትንቢት+OMS[5];
            ሎሙ_ት=ትንቢት+OMS[12];
            ላቲ_ት=ትንቢት+OMS[4];
            ሎን_ት=ትንቢት+OMS[19];
            //
             ሎቱ_ም=ትንቢት+OMS[5];
            ሎሙ_ም=ትንቢት+OMS[12];
            ላቲ_ም=ትንቢት+OMS[4];
            ሎን_ም=ትንቢት+OMS[19];
               }}
              for(int i=0;i<kaeb.length;i++){
      if( ትእዛዝ.substring(3,4).equals(rabie[i])){
            ሎቱ_ትእ=ትእዛዝ+OMS[5];
            ሎሙ_ትእ=ትእዛዝ+OMS[12];
            ላቲ_ትእ=ትእዛዝ+OMS[4];
            ሎን_ትእ=ትእዛዝ+OMS[19];
      }}
              for(int j=0;j<salis.length;j++){
         if( ste.substring(0,1).equals(geez[j])){
           ቦዝ="ተ"+rabie[j]+ste.substring(1, 2);
           አርእስት="ተ"+rabie[j];
            ሳልስቅጽል="ተ"+rabie[j];
           
         }}
               for(int j=0;j<geez.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           አርእስት=አርእስት+sadis[j];
           ሳልስቅጽል=ሳልስቅጽል+rabie[j];
         
               }} 
               for(int j=0;j<salis.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
            /* ሳልስቅጽል=ሳልስቅጽል+salis[j];
               ሳልስቅጽል1=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያኒሁ";
        ሳልስቅጽል2=ሳልስቅጽል.substring(0, 4)+"ቱ";
        ሳልስቅጽል3=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያቲሁ";*/
           ቦዝ=ቦዝ+geez[j]+SMS[5];
           አርእስት=አርእስት+sabie[j]+"ት"+SMS[5];
         }}
    }
   }
   
    }
     break;
        case "አነ/I/":{
       switch(stemType)
   {
        case "ገቢር/perfective/":{
            for(int j=0;j<sadis.length;j++){
      if( ste.substring(2,3).equals(sadis[j])){
            ገቢር=ሓላፊ.substring(0,2)+sadis[j]+SMS[0];
            ሊተ="-";
            ለነ="-";
            ለከ=ገቢር+OMS[0];
            ለክሙ=ገቢር+OMS[1];                
            ለኪ=ገቢር+OMS[2];  
            ለክን=ገቢር+OMS[3];
      }}
          for(int m=0;m<kaeb.length;m++){
            if( ገቢር.substring(3,4).equals(kaeb[m])){
            ሎቱ=ገቢር.substring(0,3)+sadis[m]+OMS[7];
            ሎሙ=ገቢር.substring(0,3)+sadis[m]+OMS[9];
            ላቲ=ገቢር.substring(0,3)+sadis[m]+OMS[14];
            ሎን=ገቢር.substring(0,3)+sadis[m]+OMS[18]; 
                    } }   
             for(int j=0;j<sadis.length;j++){
       if( ste.substring(0,1).equals(geez[j])){
            ትእዛዝ=prefix[11]+sadis[j];}}
       for(int j=0;j<sadis.length;j++){
       if( ste.substring(1,2).equals(salis[j])){
            ትንቢት=prefix[11]+ste.substring(0,1)+sadis[j];
            ምክንያታዊ= ትእዛዝ=ትእዛዝ+sadis[j];
       }}
          for(int m=0;m<kaeb.length;m++){
            if( ste.substring(2,3).equals(sadis[m])){
                ትንቢት=ትንቢት+sadis[m];
                ምክንያታዊ=  ትእዛዝ=ትእዛዝ+sadis[m];
            ሊተ_ት="-";
            ለነ_ት="-";
            ለከ_ት=ትንቢት.substring(0,3)+geez[m]+OMS[0];
            ለክሙ_ት=ትንቢት.substring(0,3)+geez[m]+OMS[1];            
            ለኪ_ት=ትንቢት.substring(0,3)+geez[m]+OMS[2];
            ለክን_ት=ትንቢት.substring(0,3)+geez[m]+OMS[3];
             ሎቱ_ት=ትንቢት.substring(0,3)+sabie[m];
            ሎሙ_ት=ትንቢት.substring(0,3)+sabie[m]+OMS[11];
            ላቲ_ት=ትንቢት.substring(0,3)+rabie[m];
            ሎን_ት=ትንቢት.substring(0,3)+sabie[m]+OMS[20];
            //
            ሊተ_ትእ=ሊተ_ም="-";
            ለነ_ትእ=ለነ_ም="-";
           ለከ_ትእ=  ለከ_ም=ምክንያታዊ+OMS[0];
           ለክሙ_ትእ= ለክሙ_ም=ምክንያታዊ+OMS[1];            
           ለክን_ትእ=ለኪ_ትእ= ለኪ_ም=ምክንያታዊ+OMS[2];
            ለክን_ም=ምክንያታዊ+OMS[3];
           ሎቱ_ትእ=   ሎቱ_ም=ምክንያታዊ.substring(0,3)+sabie[m];
           ሎሙ_ትእ= ሎሙ_ም=ምክንያታዊ.substring(0,3)+sabie[m]+OMS[11];
            ላቲ_ትእ=ላቲ_ም=ምክንያታዊ.substring(0,3)+rabie[m];
           ሎን_ትእ= ሎን_ም=ምክንያታዊ.substring(0,3)+sabie[m]+OMS[20];
                    }  }
          for(int j=0;j<salis.length;j++){
         if( ste.substring(0,1).equals(geez[j])){   
           አርእስት=geez[j]+ste.substring(1,2);
           ቦዝ=geez[j]+ste.substring(1, 2);
         }}  
               for(int j=0;j<salis.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
             //ሳ ? ልስቅጽ
               /*ሳልስቅጽል1=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያኒሁ";
        ሳልስቅጽል2=ሳልስቅጽል.substring(0, 4)+"ቱ";
        ሳልስቅጽል3=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያቲሁ";*/
           ቦዝ=ቦዝ+sadis[j]+SMS[10];
           አርእስት=አርእስት+sabie[j]+"ት"+SMS[10];
         }}
          }  
        break;
         case "አግብሮ/causative/":{
             for(int j=0;j<sadis.length;j++){
      if( ste.substring(0,1).equals(geez[j])){
            ገቢር=prefix[1]+sadis[j];
            ትንቢት=prefix[1]+ste.substring(0,1);
            ትእዛዝ=prefix[1]+sadis[j];
             ምክንያታዊ=prefix[1]+sadis[j];
      }}
               for(int j=0;j<sadis.length;j++){
      if( ste.substring(1,2).equals(salis[j])){  
             for(int i=0;i<sadis.length;i++){
      if( ste.substring(2,3).equals(sadis[i])){ 
            ገቢር=ገቢር+geez[j]+ste.substring(2,3)+SMS[0];
            ትንቢት=ትንቢት+sadis[j]+sadis[i];
            ትእዛዝ=ትእዛዝ+sadis[j]+sadis[i];
             ምክንያታዊ=ምክንያታዊ+sadis[j]+sadis[i];
      }}}}
               for(int m=0;m<kaeb.length;m++){
            if( ገቢር.substring(4,5).equals(kaeb[m])){
            ሊተ="-";
            ለነ="-";
            ለከ=ገቢር+OMS[0];
            ለክሙ=ገቢር+OMS[1];                
            ለኪ=ገቢር+OMS[2];  
            ለክን=ገቢር+OMS[3];
      }}
          for(int m=0;m<kaeb.length;m++){
            if( ገቢር.substring(4,5).equals(kaeb[m])){
            ሎቱ=ገቢር.substring(0,4)+sadis[m]+OMS[7];
            ሎሙ=ገቢር.substring(0,4)+sadis[m]+OMS[9];
            ላቲ=ገቢር.substring(0,4)+sadis[m]+OMS[14];
            ሎን=ገቢር.substring(0,4)+sadis[m]+OMS[18]; 
                    } }   
               //ትንቢት
       
            for(int m=0;m<sadis.length;m++){
      if( ትንቢት.substring(3,4).equals(sadis[m])){
            ሊተ_ት="-";
            ለነ_ት="-";
            ለከ_ት=ትንቢት.substring(0,3)+geez[m]+OMS[0];
            ለክሙ_ት=ትንቢት.substring(0,3)+geez[m]+OMS[1];            
            ለኪ_ት=ትንቢት.substring(0,3)+geez[m]+OMS[2];
            ለክን_ት=ትንቢት.substring(0,3)+geez[m]+OMS[3];
             ሎቱ_ት=ትንቢት.substring(0,3)+sabie[m];
            ሎሙ_ት=ትንቢት.substring(0,3)+sabie[m]+OMS[11];
            ላቲ_ት=ትንቢት.substring(0,3)+rabie[m];
            ሎን_ት=ትንቢት.substring(0,3)+sabie[m]+OMS[20];
            //
             ሊተ_ትእ="-";
            ለነ_ትእ="-";
            ለከ_ትእ=ትእዛዝ+OMS[0];
            ለክሙ_ትእ=ትእዛዝ+OMS[1];            
            ለኪ_ትእ=ትእዛዝ+OMS[2];
            ለክን_ትእ=ትእዛዝ+OMS[3];
             ሎቱ_ትእ=ትእዛዝ.substring(0,3)+sabie[m];
            ሎሙ_ትእ=ትእዛዝ.substring(0,3)+sabie[m]+OMS[11];
            ላቲ_ትእ=ትእዛዝ.substring(0,3)+rabie[m];
            ሎን_ትእ=ትእዛዝ.substring(0,3)+sabie[m]+OMS[20];
            //
             ሊተ_ም="-";
            ለነ_ም="-";
            ለከ_ም=ትእዛዝ+OMS[0];
            ለክሙ_ም=ትእዛዝ+OMS[1];            
            ለኪ_ም=ትእዛዝ+OMS[2];
            ለክን_ም=ትእዛዝ+OMS[3];
             ሎቱ_ም=ትእዛዝ.substring(0,3)+sabie[m];
            ሎሙ_ም=ትእዛዝ.substring(0,3)+sabie[m]+OMS[11];
            ላቲ_ም=ትእዛዝ.substring(0,3)+rabie[m];
            ሎን_ም=ትእዛዝ.substring(0,3)+sabie[m]+OMS[20];   
       }}
        
             //     
         String d="";
   for(int j=0;j<salis.length;j++){
     if( ste.substring(2,3).equals(sadis[j])){
         ቦዝ=ገቢር.substring(0,2)+ste.substring(1,2)+sadis[j]+SMS[10];
         ሳልስቅጽል=ገቢር.substring(0,2);
        ss=sabie[j]; 
    }}
   for(int j=0;j<salis.length;j++){
     if( ste.substring(1,2).equals(salis[j])){
        //አርእስት=ቦዝ.substring(0,2)+sadis[j]+ቦዝ.substring(3,4);
        አርእስት1=ቦዝ.substring(0,2)+sadis[j]+ss+"ት"+SMS[10];
        /*ሳልስቅጽል=ሳልስቅጽል+rabie[j]+ss1;
         ሳልስቅጽል1=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያኒሁ";
        ሳልስቅጽል2=ሳልስቅጽል.substring(0, 4)+"ቱ";
        ሳልስቅጽል3=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያቲሁ";*/
        }}
        }
        break;
         case "አስተጋብሮ/causative-reciprocal/":{
             for(int j=0;j<sadis.length;j++){
      if( ste.substring(0,1).equals(geez[j])){
           for(int m=0;m<salis.length;m++){
            if( ste.substring(1,2).equals(salis[m])){
                ገቢር=prefix[10]+rabie[j]+ሓላፊ.substring(1,2)+ste.substring(2,3)+SMS[0];
            ትንቢት=prefix[10]+rabie[j]+sadis[m]+ste.substring(2,3);;
             ምክንያታዊ= ትእዛዝ= ትንቢት;
            }   }   
           
      }}
           ሊተ="-";
            ለነ="-";
            ለከ=ገቢር+OMS[0];
            ለክሙ=ገቢር+OMS[1];                
            ለኪ=ገቢር+OMS[2];  
            ለክን=ገቢር+OMS[3];
          for(int m=0;m<kaeb.length;m++){
            if( ገቢር.substring(6,7).equals(kaeb[m])){
            ሎቱ=ገቢር.substring(0,6)+sadis[m]+OMS[7];
            ሎሙ=ገቢር.substring(0,6)+sadis[m]+OMS[9];
            ላቲ=ገቢር.substring(0,6)+sadis[m]+OMS[14];
            ሎን=ገቢር.substring(0,6)+sadis[m]+OMS[18]; 
                    }  }
          //
          for(int m=0;m<sadis.length;m++){
            if( ገቢር.substring(5,6).equals(sadis[m])){
            ሊተ_ት="-";
            ለነ_ት="-";
            ለከ_ት=ትንቢት.substring(0,5)+geez[m]+OMS[0];
            ለክሙ_ት=ትንቢት.substring(0,5)+geez[m]+OMS[1];                
            ለኪ_ት=ትንቢት.substring(0,5)+geez[m]+OMS[2];  
            ለክን_ት=ትንቢት.substring(0,5)+geez[m]+OMS[3];
            ሎቱ_ት=ትንቢት.substring(0,5)+sabie[m];
            ሎሙ_ት=ትንቢት.substring(0,5)+sabie[m]+OMS[11];
            ላቲ_ት=ትንቢት.substring(0,5)+rabie[m];
            ሎን_ት=ትንቢት.substring(0,5)+sabie[m]+OMS[20]; 
            //
             ሊተ_ትእ="-";
            ለነ_ትእ="-";
            ለከ_ትእ=ትንቢት.substring(0,5)+geez[m]+OMS[0];
            ለክሙ_ትእ=ትንቢት.substring(0,5)+geez[m]+OMS[1];                
            ለኪ_ትእ=ትንቢት.substring(0,5)+geez[m]+OMS[2];  
            ለክን_ትእ=ትንቢት.substring(0,5)+geez[m]+OMS[3];
            ሎቱ_ትእ=ትንቢት.substring(0,5)+sabie[m];
            ሎሙ_ትእ=ትንቢት.substring(0,5)+sabie[m]+OMS[11];
            ላቲ_ትእ=ትንቢት.substring(0,5)+rabie[m];
            ሎን_ትእ=ትንቢት.substring(0,5)+sabie[m]+OMS[20]; 
            //
            ሊተ_ም="-";
            ለነ_ም="-";
            ለከ_ም=ትንቢት.substring(0,5)+geez[m]+OMS[0];
            ለክሙ_ም=ትንቢት.substring(0,5)+geez[m]+OMS[1];                
            ለኪ_ም=ትንቢት.substring(0,5)+geez[m]+OMS[2];  
            ለክን_ም=ትንቢት.substring(0,5)+geez[m]+OMS[3];
            ሎቱ_ም=ትንቢት.substring(0,5)+sabie[m];
            ሎሙ_ም=ትንቢት.substring(0,5)+sabie[m]+OMS[11];
            ላቲ_ም=ትንቢት.substring(0,5)+rabie[m];
            ሎን_ም=ትንቢት.substring(0,5)+sabie[m]+OMS[20]; 
                    }  }
                  for(int j=0;j<geez.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           ቦዝ=ገቢር.substring(0, 4)+ste.substring(1,2)+sadis[j]+SMS[10];
           ss=salis[j];
         }}
               for(int j=0;j<geez.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           አርእስት=ገቢር.substring(0, 4)+sadis[j];
           ሳልስቅጽል=ገቢር.substring(0, 4)+rabie[j]+ss;
           ሳልስቅጽል1=ሳልስቅጽል.substring(0, 5)+ste.substring(2,3)+"ያኒሁ";
        ሳልስቅጽል2=ሳልስቅጽል.substring(0, 6)+"ቱ";
        ሳልስቅጽል3=ሳልስቅጽል.substring(0, 5)+ste.substring(2,3)+"ያቲሁ";
               }} 
               for(int j=0;j<salis.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           አርእስት=አርእስት+sabie[j]+"ት"+SMS[10];
         }}
        }
         break;
         case "ተገብሮ/reflexive/":{
             for(int j=0;j<salis.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           ተገብሮ=prefix[15]+ste.substring(0,1)+geez[j];
         }}
               for(int j=0;j<geez.length;j++){
         if( ሓላፊ.substring(2,3).equals(geez[j])){
           ገቢር=ተገብሮ+sadis[j]+SMS[0];
               }}
                for(int j=0;j<kaeb.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
          ምክንያታዊ=ትንቢት=prefix[13]+ሓላፊ.substring(0,2)+sadis[j];
          ትእዛዝ=prefix[13]+ሓላፊ.substring(0,2)+sadis[j];
         }}
              for(int j=0;j<salis.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           ቦዝ="ተ"+ste.substring(0,2)+sadis[j]+SMS[10];
           ss=salis[j];
         }}
               for(int j=0;j<geez.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           አርእስት="ተ"+ste.substring(0,1)+sadis[j];
            ሳልስቅጽል="ተ"+ste.substring(0,1)+rabie[j]+ss;
           ሳልስቅጽል1=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያኒሁ";
        ሳልስቅጽል2=ሳልስቅጽል.substring(0, 4)+"ቱ";
        ሳልስቅጽል3=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያቲሁ";
               }} 
               for(int j=0;j<salis.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           አርእስት=አርእስት+sabie[j]+SMS[17];
          // አርእስት1=አርእስት+"ት";
         }}
         }
         break;
         case "ተጋብሮ/reciprocal/":{
             for(int j=0;j<geez.length;j++){
         if( ste.substring(0,1).equals(geez[j])){
            for(int i=0;i<sadis.length;i++){
      if( ste.substring(2,3).equals(sadis[i])){
          ገቢር=prefix[15]+rabie[j]+ሓላፊ.substring(1,2)+sadis[i]+SMS[0];
         ትእዛዝ= ምክንያታዊ= ትንቢት=prefix[13]+rabie[j]+ሓላፊ.substring(1,2)+sadis[i];
      }}
     for(int i=0;i<kaeb.length;i++){
      if( ገቢር.substring(4,5).equals(kaeb[i])){
            ሊተ="";
            ለነ="";
            ለከ=ገቢር+OMS[0];
            ለክሙ= ገቢር+OMS[1];               
            ለኪ=ገቢር+OMS[2]; 
            ለክን=ገቢር+OMS[3];
            ሎቱ=ገቢር.substring(0,4)+sadis[i]+OMS[7];
            ሎሙ=ገቢር.substring(0,4)+sadis[i]+OMS[9];
            ላቲ=ገቢር.substring(0,4)+sadis[i]+OMS[14];
            ሎን=ገቢር.substring(0,4)+sadis[i]+OMS[18];
      }}
     for(int i=0;i<kaeb.length;i++){
      if( ትንቢት.substring(4,5).equals(sadis[i])){
            //
            ሊተ_ት="";
            ለነ_ት="";
            ለከ_ት=ትንቢት.substring(0,4)+geez[i]+OMS[0];
            ለክሙ_ት= ትንቢት.substring(0,4)+geez[i]+OMS[1];               
            ለኪ_ት=ትንቢት.substring(0,4)+geez[i]+OMS[2]; 
            ለክን_ት=ትንቢት.substring(0,4)+geez[i]+OMS[3];
            ሎቱ_ት=ትንቢት.substring(0,4)+sabie[i];
            ሎሙ_ት=ትንቢት.substring(0,4)+sabie[i]+OMS[11];
            ላቲ_ት=ትንቢት.substring(0,4)+rabie[i];
            ሎን_ት=ትንቢት.substring(0,4)+sabie[i]+OMS[20];
            //
            ሊተ_ትእ="";
            ለነ_ትእ="";
            ለከ_ትእ=ትንቢት.substring(0,4)+geez[i]+OMS[0];
            ለክሙ_ትእ= ትንቢት.substring(0,4)+geez[i]+OMS[1];               
            ለኪ_ትእ=ትንቢት.substring(0,4)+geez[i]+OMS[2]; 
            ለክን_ትእ=ትንቢት.substring(0,4)+geez[i]+OMS[3];
            ሎቱ_ትእ=ትንቢት.substring(0,4)+sabie[i];
            ሎሙ_ትእ=ትንቢት.substring(0,4)+sabie[i]+OMS[11];
            ላቲ_ትእ=ትንቢት.substring(0,4)+rabie[i];
            ሎን_ትእ=ትንቢት.substring(0,4)+sabie[i]+OMS[20];
            //
            ሊተ_ም="";
            ለነ_ም="";
            ለከ_ም=ትንቢት.substring(0,4)+geez[i]+OMS[0];
            ለክሙ_ም= ትንቢት.substring(0,4)+geez[i]+OMS[1];               
            ለኪ_ም=ትንቢት.substring(0,4)+geez[i]+OMS[2]; 
            ለክን_ም=ትንቢት.substring(0,4)+geez[i]+OMS[3];
            ሎቱ_ም=ትንቢት.substring(0,4)+sabie[i];
            ሎሙ_ም=ትንቢት.substring(0,4)+sabie[i]+OMS[11];
            ላቲ_ም=ትንቢት.substring(0,4)+rabie[i];
            ሎን_ም=ትንቢት.substring(0,4)+sabie[i]+OMS[20];
                    } 
       }}}
             
              for(int j=0;j<salis.length;j++){
         if( ste.substring(0,1).equals(geez[j])){
           ቦዝ="ተ"+rabie[j]+ste.substring(1, 2);
           አርእስት="ተ"+rabie[j];
            //ሳልስቅጽል="ተ"+rabie[j];
           
         }}
               for(int j=0;j<geez.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           አርእስት=አርእስት+sadis[j];
          // ሳልስቅጽል=ሳልስቅጽል+rabie[j];
         
               }} 
               for(int j=0;j<salis.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
             /*ሳልስቅጽል=ሳልስቅጽል+salis[j];
               ሳልስቅጽል1=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያኒሁ";
        ሳልስቅጽል2=ሳልስቅጽል.substring(0, 4)+"ቱ";
        ሳልስቅጽል3=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያቲሁ";*/
           ቦዝ=ቦዝ+sadis[j]+SMS[10];
           አርእስት=አርእስት+sabie[j]+"ት"+SMS[10];
         }} }} }   
     break;
             case "ንሕነ/We/":{
       switch(stemType)
   {
        case "ገቢር/perfective/":{
            for(int j=0;j<sadis.length;j++){
      if( ste.substring(2,3).equals(sadis[j])){
            ገቢር=ሓላፊ.substring(0,2)+sadis[j]+SMS[1];
    }}
          for(int m=0;m<geez.length;m++){
            if( ገቢር.substring(3,4).equals(geez[m])){
                 ሊተ="-";
            ለነ="-";
            ለከ=ገቢር.substring(0,3)+rabie[m]+OMS[0];
            ለክሙ=ገቢር.substring(0,3)+rabie[m]+OMS[1];                
            ለኪ=ገቢር.substring(0,3)+rabie[m]+OMS[2];  
            ለክን=ገቢር.substring(0,3)+rabie[m]+OMS[3];
            ሎቱ=ገቢር.substring(0,3)+rabie[m]+OMS[5];
            ሎሙ=ገቢር.substring(0,3)+rabie[m]+OMS[12];
            ላቲ=ገቢር.substring(0,3)+rabie[m]+OMS[4];
            ሎን=ገቢር.substring(0,3)+rabie[m]+OMS[19]; 
                    } }   
             for(int j=0;j<sadis.length;j++){
       if( ste.substring(0,1).equals(geez[j])){
            ትእዛዝ=prefix[12]+sadis[j];}}
       for(int j=0;j<sadis.length;j++){
       if( ste.substring(1,2).equals(salis[j])){
            ትንቢት=prefix[12]+ste.substring(0,1)+sadis[j];
            ምክንያታዊ= ትእዛዝ=ትእዛዝ+sadis[j];
       }}
          for(int m=0;m<kaeb.length;m++){
            if( ste.substring(2,3).equals(sadis[m])){
                ትንቢት=ትንቢት+sadis[m];
                ምክንያታዊ=  ትእዛዝ=ትእዛዝ+sadis[m];
            ሊተ_ት="-";
            ለነ_ት="-";
            ለከ_ት=ትንቢት.substring(0,3)+geez[m]+OMS[0];
            ለክሙ_ት=ትንቢት.substring(0,3)+geez[m]+OMS[1];            
            ለኪ_ት=ትንቢት.substring(0,3)+geez[m]+OMS[2];
            ለክን_ት=ትንቢት.substring(0,3)+geez[m]+OMS[3];
             ሎቱ_ት=ትንቢት.substring(0,3)+sabie[m];
            ሎሙ_ት=ትንቢት.substring(0,3)+sabie[m]+OMS[11];
            ላቲ_ት=ትንቢት.substring(0,3)+rabie[m];
            ሎን_ት=ትንቢት.substring(0,3)+sabie[m]+OMS[20];
            //
            ሊተ_ትእ=ሊተ_ም="-";
            ለነ_ትእ=ለነ_ም="-";
           ለከ_ትእ=  ለከ_ም=ምክንያታዊ+OMS[0];
           ለክሙ_ትእ= ለክሙ_ም=ምክንያታዊ+OMS[1];            
           ለክን_ትእ=ለኪ_ትእ= ለኪ_ም=ምክንያታዊ+OMS[2];
            ለክን_ም=ምክንያታዊ+OMS[3];
           ሎቱ_ትእ=   ሎቱ_ም=ምክንያታዊ.substring(0,3)+sabie[m];
           ሎሙ_ትእ= ሎሙ_ም=ምክንያታዊ.substring(0,3)+sabie[m]+OMS[11];
            ላቲ_ትእ=ላቲ_ም=ምክንያታዊ.substring(0,3)+rabie[m];
           ሎን_ትእ= ሎን_ም=ምክንያታዊ.substring(0,3)+sabie[m]+OMS[20];
                    }}
          String d="";
   for(int j=0;j<salis.length;j++){
     if( ste.substring(2,3).equals(sadis[j])){
         ቦዝ=ste.substring(0,2)+geez[j]+SMS[1];
       //  ሳልስቅጽል=ገቢር.substring(0,2);
        ss=sabie[j];
        ss1=salis[j];
        d=hams[j];  
    }}
   for(int j=0;j<salis.length;j++){
     if( ste.substring(2,3).equals(sadis[j])){
        አርእስት=ste.substring(0,2)+sabie[j]+"ት"+SMS[1];;
       // አርእስት1=ቦዝ.substring(0,2)+sadis[j]+ቦዝ.substring(3,4)+"ት";
        //ሳልስቅጽል=ሳልስቅጽል+rabie[j]+ss1;
         //ሳልስቅጽል1=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያኒሁ";
        //ሳልስቅጽል2=ሳልስቅጽል.substring(0, 4)+"ቱ";
        //ሳልስቅጽል3=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያቲሁ";
        }}
          }  
        break;
         case "አግብሮ/causative/":{
             for(int j=0;j<sadis.length;j++){
      if( ste.substring(0,1).equals(geez[j])){
            ገቢር=prefix[1]+sadis[j];
            ትንቢት=prefix[16]+geez[j];
            ትእዛዝ=prefix[16]+sadis[j];
             ምክንያታዊ=prefix[16]+sadis[j];
      }}
               for(int j=0;j<sadis.length;j++){
      if( ste.substring(1,2).equals(salis[j])){  
             for(int i=0;i<sadis.length;i++){
      if( ste.substring(2,3).equals(sadis[i])){ 
            ገቢር=ገቢር+geez[j]+ste.substring(2,3)+SMS[1];
            ትንቢት=ትንቢት+sadis[j]+sadis[i];
            ትእዛዝ=ትእዛዝ+sadis[j]+sadis[i];
             ምክንያታዊ=ምክንያታዊ+sadis[j]+sadis[i];
      }}}}
               for(int m=0;m<geez.length;m++){
            if( ገቢር.substring(4,5).equals(geez[m])){
            ሊተ="-";
            ለነ="-";
            ለከ=ገቢር.substring(0,4)+rabie[m]+OMS[0];
            ለክሙ=ገቢር.substring(0,4)+rabie[m]+OMS[1];                
            ለኪ=ገቢር.substring(0,4)+rabie[m]+OMS[2];  
            ለክን=ገቢር.substring(0,4)+rabie[m]+OMS[3];
            ሎቱ=ገቢር.substring(0,4)+rabie[m]+OMS[5];
            ሎሙ=ገቢር.substring(0,4)+rabie[m]+OMS[12];
            ላቲ=ገቢር.substring(0,4)+rabie[m]+OMS[4];
            ሎን=ገቢር.substring(0,4)+rabie[m]+OMS[19]; 
                    } }   
               //ትንቢት
            for(int m=0;m<sadis.length;m++){
      if( ትንቢት.substring(3,4).equals(sadis[m])){
            ሊተ_ት="-";
            ለነ_ት="-";
            ለከ_ት=ትንቢት.substring(0,3)+geez[m]+OMS[0];
            ለክሙ_ት=ትንቢት.substring(0,3)+geez[m]+OMS[1];            
            ለኪ_ት=ትንቢት.substring(0,3)+geez[m]+OMS[2];
            ለክን_ት=ትንቢት.substring(0,3)+geez[m]+OMS[3];
             ሎቱ_ት=ትንቢት.substring(0,3)+sabie[m];
            ሎሙ_ት=ትንቢት.substring(0,3)+sabie[m]+OMS[11];
            ላቲ_ት=ትንቢት.substring(0,3)+rabie[m];
            ሎን_ት=ትንቢት.substring(0,3)+sabie[m]+OMS[20];
            //
             ሊተ_ትእ="-";
            ለነ_ትእ="-";
            ለከ_ትእ=ትእዛዝ+OMS[0];
            ለክሙ_ትእ=ትእዛዝ+OMS[1];            
            ለኪ_ትእ=ትእዛዝ+OMS[2];
            ለክን_ትእ=ትእዛዝ+OMS[3];
             ሎቱ_ትእ=ትእዛዝ.substring(0,3)+sabie[m];
            ሎሙ_ትእ=ትእዛዝ.substring(0,3)+sabie[m]+OMS[11];
            ላቲ_ትእ=ትእዛዝ.substring(0,3)+rabie[m];
            ሎን_ትእ=ትእዛዝ.substring(0,3)+sabie[m]+OMS[20];
            //
             ሊተ_ም="-";
            ለነ_ም="-";
            ለከ_ም=ትእዛዝ+OMS[0];
            ለክሙ_ም=ትእዛዝ+OMS[1];            
            ለኪ_ም=ትእዛዝ+OMS[2];
            ለክን_ም=ትእዛዝ+OMS[3];
             ሎቱ_ም=ትእዛዝ.substring(0,3)+sabie[m];
            ሎሙ_ም=ትእዛዝ.substring(0,3)+sabie[m]+OMS[11];
            ላቲ_ም=ትእዛዝ.substring(0,3)+rabie[m];
            ሎን_ም=ትእዛዝ.substring(0,3)+sabie[m]+OMS[20];   
       }}
        
             //     
         String d="";
   for(int j=0;j<salis.length;j++){
     if( ste.substring(0,1).equals(geez[j])){
         ቦዝ=prefix[1]+sadis[j]+ste.substring(1,2)+ሓላፊ.substring(2,3)+OMS[23];
         ሳልስቅጽል=ገቢር.substring(0,2);
        ss=sabie[j];
        ss1=salis[j];
        d=hams[j];  
    }}
   for(int j=0;j<salis.length;j++){
     if( ste.substring(2,3).equals(sadis[j])){
        አርእስት=ቦዝ.substring(0,3)+sabie[j]+SMS[18];
        //አርእስት1=ቦዝ.substring(0,2)+sadis[j]+ቦዝ.substring(3,4)+"ት";
        ሳልስቅጽል=ሳልስቅጽል+rabie[j]+ss1;
         ሳልስቅጽል1=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያኒሁ";
        ሳልስቅጽል2=ሳልስቅጽል.substring(0, 4)+"ቱ";
        ሳልስቅጽል3=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያቲሁ";
        }}
        }
        break;
         case "አስተጋብሮ/causative-reciprocal/":{
             for(int j=0;j<sadis.length;j++){
      if( ste.substring(0,1).equals(geez[j])){
           for(int m=0;m<salis.length;m++){
            if( ste.substring(1,2).equals(salis[m])){
                ገቢር=prefix[10]+rabie[j]+ሓላፊ.substring(1,2)+ste.substring(2,3)+SMS[1];
            ትንቢት=prefix[17]+rabie[j]+sadis[m]+ste.substring(2,3);;
             ምክንያታዊ= ትእዛዝ= ትንቢት;
            }   }   
           
      }}
          for(int m=0;m<geez.length;m++){
            if( ገቢር.substring(6,7).equals(geez[m])){
            ሊተ="-";
            ለነ="-";
            ለከ=ገቢር.substring(0,6)+rabie[m]+OMS[0];
            ለክሙ=ገቢር.substring(0,6)+rabie[m]+OMS[1];                
            ለኪ=ገቢር.substring(0,6)+rabie[m]+OMS[2];  
            ለክን=ገቢር.substring(0,6)+rabie[m]+OMS[3];
            ሎቱ=ገቢር.substring(0,6)+rabie[m]+OMS[5];
            ሎሙ=ገቢር.substring(0,6)+rabie[m]+OMS[12];
            ላቲ=ገቢር.substring(0,6)+rabie[m]+OMS[4];
            ሎን=ገቢር.substring(0,6)+rabie[m]+OMS[19]; 
                    } }   
          //
          for(int m=0;m<sadis.length;m++){
            if( ገቢር.substring(5,6).equals(sadis[m])){
            ሊተ_ት="-";
            ለነ_ት="-";
            ለከ_ት=ትንቢት.substring(0,5)+geez[m]+OMS[0];
            ለክሙ_ት=ትንቢት.substring(0,5)+geez[m]+OMS[1];                
            ለኪ_ት=ትንቢት.substring(0,5)+geez[m]+OMS[2];  
            ለክን_ት=ትንቢት.substring(0,5)+geez[m]+OMS[3];
            ሎቱ_ት=ትንቢት.substring(0,5)+sabie[m];
            ሎሙ_ት=ትንቢት.substring(0,5)+sabie[m]+OMS[11];
            ላቲ_ት=ትንቢት.substring(0,5)+rabie[m];
            ሎን_ት=ትንቢት.substring(0,5)+sabie[m]+OMS[20]; 
            //
             ሊተ_ትእ="-";
            ለነ_ትእ="-";
            ለከ_ትእ=ትንቢት.substring(0,5)+geez[m]+OMS[0];
            ለክሙ_ትእ=ትንቢት.substring(0,5)+geez[m]+OMS[1];                
            ለኪ_ትእ=ትንቢት.substring(0,5)+geez[m]+OMS[2];  
            ለክን_ትእ=ትንቢት.substring(0,5)+geez[m]+OMS[3];
            ሎቱ_ትእ=ትንቢት.substring(0,5)+sabie[m];
            ሎሙ_ትእ=ትንቢት.substring(0,5)+sabie[m]+OMS[11];
            ላቲ_ትእ=ትንቢት.substring(0,5)+rabie[m];
            ሎን_ትእ=ትንቢት.substring(0,5)+sabie[m]+OMS[20]; 
            //
            ሊተ_ም="-";
            ለነ_ም="-";
            ለከ_ም=ትንቢት.substring(0,5)+geez[m]+OMS[0];
            ለክሙ_ም=ትንቢት.substring(0,5)+geez[m]+OMS[1];                
            ለኪ_ም=ትንቢት.substring(0,5)+geez[m]+OMS[2];  
            ለክን_ም=ትንቢት.substring(0,5)+geez[m]+OMS[3];
            ሎቱ_ም=ትንቢት.substring(0,5)+sabie[m];
            ሎሙ_ም=ትንቢት.substring(0,5)+sabie[m]+OMS[11];
            ላቲ_ም=ትንቢት.substring(0,5)+rabie[m];
            ሎን_ም=ትንቢት.substring(0,5)+sabie[m]+OMS[20]; 
                    }  }
                  for(int j=0;j<geez.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           ቦዝ=ገቢር.substring(0, 4)+ste.substring(1,2)+geez[j]+OMS[23];
           ss=salis[j];
         }}
               for(int j=0;j<geez.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           አርእስት=ገቢር.substring(0, 4)+sadis[j];
        /*   ሳልስቅጽል=ገቢር.substring(0, 4)+rabie[j]+ss;
           ሳልስቅጽል1=ሳልስቅጽል.substring(0, 5)+ste.substring(2,3)+"ያኒሁ";
        ሳልስቅጽል2=ሳልስቅጽል.substring(0, 6)+"ቱ";
        ሳልስቅጽል3=ሳልስቅጽል.substring(0, 5)+ste.substring(2,3)+"ያቲሁ";*/
               }} 
               for(int j=0;j<salis.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           አርእስት=አርእስት+sabie[j]+SMS[18];
          // አርእስት1=አርእስት+"ት";
         }}
        }
         break;
         case "ተገብሮ/reflexive/":{
             for(int j=0;j<salis.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           ተገብሮ=prefix[15]+ste.substring(0,1)+geez[j];
         }}
               for(int j=0;j<geez.length;j++){
         if( ሓላፊ.substring(2,3).equals(geez[j])){
           ገቢር=ተገብሮ+sadis[j]+SMS[1];
               }}
                for(int j=0;j<kaeb.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           ትእዛዝ=ምክንያታዊ=ትንቢት=prefix[14]+ሓላፊ.substring(0,2)+sadis[j];
         }}
         }
         break;
         case "ተጋብሮ/reciprocal/":{
             for(int j=0;j<geez.length;j++){
         if( ste.substring(0,1).equals(geez[j])){
            for(int i=0;i<sadis.length;i++){
      if( ste.substring(2,3).equals(sadis[i])){
          ገቢር=prefix[15]+rabie[j]+ሓላፊ.substring(1,2)+sadis[i]+SMS[1];
         ትእዛዝ= ምክንያታዊ= ትንቢት=prefix[14]+rabie[j]+ሓላፊ.substring(1,2)+sadis[i];
      }}
     for(int m=0;m<geez.length;m++){
      if( ገቢር.substring(4,5).equals(geez[m])){
             ሊተ="-";
            ለነ="-";
            ለከ=ገቢር.substring(0,4)+rabie[m]+OMS[0];
            ለክሙ=ገቢር.substring(0,4)+rabie[m]+OMS[1];                
            ለኪ=ገቢር.substring(0,4)+rabie[m]+OMS[2];  
            ለክን=ገቢር.substring(0,4)+rabie[m]+OMS[3];
            ሎቱ=ገቢር.substring(0,4)+rabie[m]+OMS[5];
            ሎሙ=ገቢር.substring(0,4)+rabie[m]+OMS[12];
            ላቲ=ገቢር.substring(0,4)+rabie[m]+OMS[4];
            ሎን=ገቢር.substring(0,4)+rabie[m]+OMS[19]; 
      }}
     for(int i=0;i<kaeb.length;i++){
      if( ትንቢት.substring(4,5).equals(sadis[i])){
            //
            ሊተ_ት="";
            ለነ_ት="";
            ለከ_ት=ትንቢት.substring(0,4)+geez[i]+OMS[0];
            ለክሙ_ት= ትንቢት.substring(0,4)+geez[i]+OMS[1];               
            ለኪ_ት=ትንቢት.substring(0,4)+geez[i]+OMS[2]; 
            ለክን_ት=ትንቢት.substring(0,4)+geez[i]+OMS[3];
            ሎቱ_ት=ትንቢት.substring(0,4)+sabie[i];
            ሎሙ_ት=ትንቢት.substring(0,4)+sabie[i]+OMS[11];
            ላቲ_ት=ትንቢት.substring(0,4)+rabie[i];
            ሎን_ት=ትንቢት.substring(0,4)+sabie[i]+OMS[20];
            //
            ሊተ_ትእ="";
            ለነ_ትእ="";
            ለከ_ትእ=ትንቢት.substring(0,4)+geez[i]+OMS[0];
            ለክሙ_ትእ= ትንቢት.substring(0,4)+geez[i]+OMS[1];               
            ለኪ_ትእ=ትንቢት.substring(0,4)+geez[i]+OMS[2]; 
            ለክን_ትእ=ትንቢት.substring(0,4)+geez[i]+OMS[3];
            ሎቱ_ትእ=ትንቢት.substring(0,4)+sabie[i];
            ሎሙ_ትእ=ትንቢት.substring(0,4)+sabie[i]+OMS[11];
            ላቲ_ትእ=ትንቢት.substring(0,4)+rabie[i];
            ሎን_ትእ=ትንቢት.substring(0,4)+sabie[i]+OMS[20];
            //
            ሊተ_ም="";
            ለነ_ም="";
            ለከ_ም=ትንቢት.substring(0,4)+geez[i]+OMS[0];
            ለክሙ_ም= ትንቢት.substring(0,4)+geez[i]+OMS[1];               
            ለኪ_ም=ትንቢት.substring(0,4)+geez[i]+OMS[2]; 
            ለክን_ም=ትንቢት.substring(0,4)+geez[i]+OMS[3];
            ሎቱ_ም=ትንቢት.substring(0,4)+sabie[i];
            ሎሙ_ም=ትንቢት.substring(0,4)+sabie[i]+OMS[11];
            ላቲ_ም=ትንቢት.substring(0,4)+rabie[i];
            ሎን_ም=ትንቢት.substring(0,4)+sabie[i]+OMS[20];
                    } 
       }}}
             
              for(int j=0;j<salis.length;j++){
         if( ste.substring(0,1).equals(geez[j])){
           ቦዝ="ተ"+rabie[j]+ste.substring(1, 2);
           አርእስት="ተ"+rabie[j];
            //ሳልስቅጽል="ተ"+rabie[j];
           
         }}
               for(int j=0;j<geez.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           አርእስት=አርእስት+geez[j];
           //ሳልስቅጽል=ሳልስቅጽል+rabie[j];
         
               }} 
               for(int j=0;j<salis.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
            /* ሳልስቅጽል=ሳልስቅጽል+salis[j];
               ሳልስቅጽል1=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያኒሁ";
        ሳልስቅጽል2=ሳልስቅጽል.substring(0, 4)+"ቱ";
        ሳልስቅጽል3=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያቲሁ";*/
           ቦዝ=ቦዝ+sabie[j]+OMS[23];
           አርእስት=አርእስት+sabie[j];
           አርእስት=አርእስት+"ት"+OMS[23];
         }}
   }
   }
    }   
     break;
       }   
       
       }
    
   }
}
     public void createStem2(String stem,String stemType,String person)
{
    String ste=stem;
    //how to handle verb form that have የ in center 
    //System.out.println("ሐላፊ አንቀጽ:"+stem);
 if(stem.contains("ዊ")&&!stem.endsWith("ው")){
          for(int i=0;i<salis.length;i++){
    if( ste.substring(0,1).equals(geez[i])){
   for(int j=0;j<salis.length;j++){
     if( ste.substring(1,2).equals(salis[j])){
          for(int m=0;m<salis.length;m++){
     if( ste.substring(2,3).equals(sadis[m])){
         ሓላፊ=sabie[i]+geez[m];
    }}}}}}
   switch(person)
   {
       case "ውእቱ/He/":{
       switch(stemType)
   {
        case "ገቢር/perfective/":{
            for(int j=0;j<sadis.length;j++){
      if( ste.substring(2,3).equals(sadis[j])){
            ገቢር=ሓላፊ;
            ሊተ=ገቢር+OMS[22];
            ለነ=ገቢር+OMS[23];
            ለከ=ገቢር+OMS[0];
            ለክሙ=ገቢር+OMS[10];                
            ለኪ=ገቢር+OMS[2];  
            ለክን=ገቢር+OMS[3];
            ሎቱ=ገቢር.substring(0,1)+sabie[j];
            ሎሙ=ገቢር.substring(0,1)+sabie[j]+OMS[11];
            ላቲ=ገቢር.substring(0,1)+rabie[j];
            ሎን=ገቢር.substring(0,1)+sabie[j]+OMS[20];
                    } 
       }
       for(int j=0;j<sadis.length;j++){
      if( ste.substring(1,2).equals(salis[j])){
            ትንቢት="የ"+ste.substring(0,1)+sadis[j]+ste.substring(2,3);
          System.out.println("ትንቢት አንቀጽ:"+ትንቢት);
          for(int i=0;i<sadis.length;i++){
               if( ste.substring(2,3).equals(sadis[i])){
                       ትንቢት=ትንቢት;
             ሊተ_ት=ትንቢት.substring(0,3)+geez[i]+OMS[22];
             ለነ_ት=ትንቢት.substring(0,3)+geez[i]+OMS[23];
             ለከ_ት=ትንቢት.substring(0,3)+geez[i]+OMS[0];
             ለክሙ_ት=   ትንቢት.substring(0,3)+geez[i]+OMS[10] ;         
             ለኪ_ት=ትንቢት.substring(0,3)+geez[i]+OMS[2];  
             ለክን_ት=ትንቢት.substring(0,3)+geez[i]+OMS[3];
             ሎቱ_ት=ትንቢት.substring(0,3)+sabie[i] ;
             ሎሙ_ት=ትንቢት.substring(0,3)+sabie[i]+OMS[11];
             ላቲ_ት=ትንቢት.substring(0,3)+rabie[i];
             ሎን_ት=ትንቢት.substring(0,3)+sabie[i]+OMS[20];
                    } }}
       }
        for(int j=0;j<sadis.length;j++){
           if( ste.substring(0,1).equals(geez[j])){
            ትእዛዝ="የ"+sadis[j];
           }
            }
         for(int j=0;j<sadis.length;j++){
      if( ste.substring(1,2).equals(salis[j])){
            ትእዛዝ=ትእዛዝ+sadis[j]+ste.substring(2,3);
          System.out.println("ትእዛዝ አንቀጽ:"+ትእዛዝ);
          for(int i=0;i<sadis.length;i++){
               if( ste.substring(2,3).equals(sadis[i])){
             ሊተ_ትእ=ትእዛዝ.substring(0,3)+geez[i]+OMS[22];
             ለነ_ትእ=ትእዛዝ.substring(0,3)+geez[i]+OMS[23];
             ለከ_ትእ=ትእዛዝ+OMS[0];
             ለክሙ_ትእ= ትእዛዝ+OMS[10] ;         
             ለኪ_ትእ=ትእዛዝ+OMS[2];  
             ለክን_ትእ=ትእዛዝ+OMS[3];
             ሎቱ_ትእ=ትእዛዝ.substring(0,3)+sabie[i] ;
             ሎሙ_ትእ=ትእዛዝ.substring(0,3)+sabie[i]+OMS[11];
             ላቲ_ትእ=ትእዛዝ.substring(0,3)+rabie[i];
             ሎን_ትእ=ትእዛዝ.substring(0,3)+sabie[i]+OMS[20];
                    } }}
       }
         for(int j=0;j<geez.length;j++){
           if( ste.substring(0,1).equals(geez[j])){
            ምክንያታዊ="ይ"+kaeb[j];
           }
            }
     
           
          for(int i=0;i<sadis.length;i++){
               if( ste.substring(2,3).equals(sadis[i])){
                   ትእዛዝ= ምክንያታዊ=ምክንያታዊ+ste.substring(2,3);
             ሊተ_ትእ=ትእዛዝ.substring(0,2)+geez[i]+OMS[22];
             ለነ_ትእ=ትእዛዝ.substring(0,2)+geez[i]+OMS[23];
             ለከ_ትእ=ትእዛዝ+OMS[0];
             ለክሙ_ትእ= ትእዛዝ+OMS[10] ;         
             ለኪ_ትእ=ትእዛዝ+OMS[2];  
             ለክን_ትእ=ትእዛዝ+OMS[3];
             ሎቱ_ትእ=ትእዛዝ.substring(0,2)+sabie[i] ;
             ሎሙ_ትእ=ትእዛዝ.substring(0,2)+sabie[i]+OMS[11];
             ላቲ_ትእ=ትእዛዝ.substring(0,2)+rabie[i];
             ሎን_ትእ=ትእዛዝ.substring(0,2)+sabie[i]+OMS[20];
             ሊተ_ም=ትእዛዝ.substring(0,2)+geez[i]+OMS[22];
             ለነ_ም=ትእዛዝ.substring(0,2)+geez[i]+OMS[23];
             ለከ_ም=ትእዛዝ+OMS[0];
             ለክሙ_ም= ትእዛዝ+OMS[10] ;         
             ለኪ_ም=ትእዛዝ+OMS[2];  
             ለክን_ም=ትእዛዝ+OMS[3];
             ሎቱ_ም=ትእዛዝ.substring(0,2)+sabie[i] ;
             ሎሙ_ም=ትእዛዝ.substring(0,2)+sabie[i]+OMS[11];
             ላቲ_ም=ትእዛዝ.substring(0,2)+rabie[i];
             ሎን_ም=ትእዛዝ.substring(0,2)+sabie[i]+OMS[20];
                    } 
         } 
         String d="";
   for(int j=0;j<salis.length;j++){
     if( ste.substring(2,3).equals(sadis[j])){
         ቦዝ=ste.substring(0,2)+sabie[j];
           ሳቢዘር1 = geez[j];
         //ሳድስቅጽል=sadis[j];
        ሳልስቅጽል=salis[j];
        ss=sabie[j];
        ss1=sadis[j];
        d=kaeb[j];
    }}
   አርእስት=ste.substring(0,3)+OMS[5];
   አርእስት1=ste.substring(0,2)+ss+"ቶ";
   for(int j=0;j<salis.length;j++){
     if( ste.substring(0,1).equals(geez[j])){
         ሳቢዘር=kaeb[j];
         ሳድስቅጽል=sadis[j];
    }}
   for(int j=0;j<salis.length;j++){
     if( ste.substring(1,2).equals(salis[j])){
        ሳድስቅጽል=ሳድስቅጽል+kaeb[j]+ss1;
        ሳድስቅጽል1=ሳድስቅጽል.substring(0, 2)+d;
        ሳልስቅጽል4=ste.substring(0,1)+rabie[j]+ሳልስቅጽል ;
        ሳልስቅጽል=ste.substring(0,1)+rabie[j]+ሳልስቅጽል+"ሁ" ;
        ሳልስቅጽል1=ሳልስቅጽል.substring(0, 2)+ste.substring(2,3)+"ያኒሁ";
        ሳልስቅጽል2=ሳልስቅጽል.substring(0, 3)+"ቱ";
        ሳልስቅጽል3=ሳልስቅጽል.substring(0, 2)+ste.substring(2,3)+"ያቲሁ";
        ሳቢዘር=ሳቢዘር+sadis[j]+ሳቢዘር1+"ቱ";
    }}
        }
        break;
        case "አግብሮ/causative/":{
             for(int j=0;j<sadis.length;j++){
      if( ste.substring(0,1).equals(geez[j])){
            ገቢር="አ"+ሓላፊ.substring(0,2);
               //ገቢር=ገቢር+"ኩ";
            ሊተ=ገቢር+OMS[22];
            ለነ=ገቢር+OMS[23];
            ለከ=ገቢር+OMS[0];
            ለክሙ=ገቢር+OMS[10];                
            ለኪ=ገቢር+OMS[2];  
            ለክን=ገቢር+OMS[3];
            for(int i=0;i<sadis.length;i++){
      if( ገቢር.substring(2,3).equals(geez[i])){
          ሎቱ=ገቢር.substring(0,2)+sabie[i];
            ሎሙ=ገቢር.substring(0,2)+sabie[i]+OMS[11];
            ላቲ=ገቢር.substring(0,2)+rabie[i];
            ሎን=ገቢር.substring(0,2)+sabie[i]+OMS[20];
                    } 
       }}}
       for(int j=0;j<sadis.length;j++){
      if( ste.substring(0,1).equals(geez[j])){
            ትንቢት="ያ"+kaeb[j]+ste.substring(2,3);
          for(int i=0;i<sadis.length;i++){
               if( ste.substring(2,3).equals(sadis[i])){
                   ሊተ_ት=ትንቢት.substring(0,2)+geez[i]+OMS[22];
             ለነ_ት=ትንቢት.substring(0,2)+geez[i]+OMS[23];
             ለከ_ት=ትንቢት.substring(0,2)+geez[i]+OMS[0];
             ለክሙ_ት=   ትንቢት.substring(0,2)+geez[i]+OMS[10] ;         
             ለኪ_ት=ትንቢት.substring(0,2)+geez[i]+OMS[2];  
             ለክን_ት=ትንቢት.substring(0,2)+geez[i]+OMS[3];
             ሎቱ_ት=ትንቢት.substring(0,2)+sabie[i] ;
             ሎሙ_ት=ትንቢት.substring(0,2)+sabie[i]+OMS[11];
             ላቲ_ት=ትንቢት.substring(0,2)+rabie[i];
             ሎን_ት=ትንቢት.substring(0,2)+sabie[i]+OMS[20];
                    } }}
       }
          for(int j=0;j<sadis.length;j++){
      if( ste.substring(0,1).equals(geez[j])){
           ምክንያታዊ= ትእዛዝ="ያ"+kaeb[j]+ste.substring(2,3);
          for(int i=0;i<sadis.length;i++){
               if( ste.substring(2,3).equals(sadis[i])){
                           ሊተ_ትእ=ትእዛዝ.substring(0,2)+geez[i]+OMS[22];
             ለነ_ትእ=ትእዛዝ.substring(0,2)+geez[i]+OMS[23];
             ለከ_ትእ=ትእዛዝ+OMS[0];
             ለክሙ_ትእ=   ትእዛዝ+OMS[10] ;         
             ለኪ_ትእ=ትእዛዝ+OMS[2];  
             ለክን_ትእ=ትእዛዝ+OMS[3] ;
             ሎቱ_ትእ=ትእዛዝ.substring(0,2)+sabie[i] ;
             ሎሙ_ትእ=ትእዛዝ.substring(0,2)+sabie[i]+OMS[11];
             ላቲ_ትእ=ትእዛዝ.substring(0,2)+rabie[i] ;
             ሎን_ትእ=ትእዛዝ.substring(0,2)+sabie[i]+OMS[20] ;
             //     
             ሊተ_ም=ትእዛዝ.substring(0,2)+geez[i]+OMS[22];
             ለነ_ም=ትእዛዝ.substring(0,2)+geez[i]+OMS[23];
             ለከ_ም=ትእዛዝ+OMS[0];
             ለክሙ_ም=   ትእዛዝ+OMS[10] ;         
             ለኪ_ም=ትእዛዝ+OMS[2];  
             ለክን_ም=ትእዛዝ+OMS[3] ;
             ሎቱ_ም=ትእዛዝ.substring(0,2)+sabie[i] ;
             ሎሙ_ም=ትእዛዝ.substring(0,2)+sabie[i]+OMS[11];
             ላቲ_ም=ትእዛዝ.substring(0,2)+rabie[i] ;
             ሎን_ም=ትእዛዝ.substring(0,2)+sabie[i]+OMS[20] ;
                    } }}
       }
         String d="";
   for(int j=0;j<salis.length;j++){
     if( ste.substring(0,1).equals(geez[j])){
          for(int i=0;i<salis.length;i++){
     if( ste.substring(2,3).equals(sadis[i])){
         ቦዝ=ገቢር.substring(0,1)+sadis[j]+ste.substring(1, 2)+sabie[i];
         //ሳልስቅጽል=ገቢር.substring(0,2);
        ss=sabie[j];
        ss1=salis[j];
        d=hams[j];  
    }}}}
   for(int j=0;j<salis.length;j++){
     if( ste.substring(1,2).equals(salis[j])){
    
        አርእስት1=ቦዝ.substring(0,2)+sadis[j]+ቦዝ.substring(3,4)+"ቶ";
        /*
        ሳልስቅጽል=ሳልስቅጽል+rabie[j]+ss1;
         ሳልስቅጽል1=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያኒሁ";
        ሳልስቅጽል2=ሳልስቅጽል.substring(0, 4)+"ቱ";
        ሳልስቅጽል3=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያቲሁ";*/
        }}
        }
        
        break;
         case "አስተጋብሮ/causative-reciprocal/":{
             for(int j=0;j<sadis.length;j++){
      if( ste.substring(0,1).equals(geez[j])){   
            for(int i=0;i<sadis.length;i++){
      if( ste.substring(1,2).equals(salis[i])){
          ገቢር="አስተ"+rabie[j]+geez[i];
          ትንቢት="ያስተ"+rabie[j]+geez[i];
          
      }}}}
            for(int i=0;i<sadis.length;i++){
      if( ste.substring(2,3).equals(sadis[i])){
           ገቢር=ገቢር+ሓላፊ.substring(1,2);
            ትንቢት=ትንቢት+sadis[i];
            ትእዛዝ=ትንቢት;
            ምክንያታዊ=ትንቢት;
            ሊተ=ገቢር+OMS[22];
            ለነ=ገቢር+OMS[23];
            ለከ=ገቢር+OMS[0];
            ለክሙ=ገቢር+OMS[10];                
            ለኪ=ገቢር+OMS[2];  
            ለክን=ገቢር+OMS[3];
           ሎቱ=ገቢር.substring(0,5)+sabie[i];
            ሎሙ=ገቢር.substring(0,5)+sabie[i]+OMS[11];
            ላቲ=ገቢር.substring(0,5)+rabie[i];
            ሎን=ገቢር.substring(0,5)+sabie[i]+OMS[20];
                   ሊተ_ት=ትንቢት.substring(0,5)+geez[i]+OMS[22];
             ለነ_ት=ትንቢት.substring(0,5)+geez[i]+OMS[23];
             ለከ_ት=ትንቢት.substring(0,5)+geez[i]+OMS[0];
             ለክሙ_ት=   ትንቢት.substring(0,5)+geez[i]+OMS[10] ;         
             ለኪ_ት=ትንቢት.substring(0,5)+geez[i]+OMS[2];  
             ለክን_ት=ትንቢት.substring(0,5)+geez[i]+OMS[3];
             ሎቱ_ት=ትንቢት.substring(0,5)+sabie[i] ;
             ሎሙ_ት=ትንቢት.substring(0,5)+sabie[i]+OMS[11];
             ላቲ_ት=ትንቢት.substring(0,5)+rabie[i];
             ሎን_ት=ትንቢት.substring(0,5)+sabie[i]+OMS[20];
         
                   ሊተ_ትእ=ትንቢት.substring(0,5)+geez[i]+OMS[22];
             ለነ_ትእ=ትንቢት.substring(0,5)+geez[i]+OMS[23];
             ለከ_ትእ=ትንቢት.substring(0,5)+geez[i]+OMS[0];
             ለክሙ_ትእ=   ትንቢት.substring(0,5)+geez[i]+OMS[10] ;         
             ለኪ_ትእ=ትንቢት.substring(0,5)+geez[i]+OMS[2];  
             ለክን_ትእ=ትንቢት.substring(0,5)+geez[i]+OMS[3];
             ሎቱ_ትእ=ትንቢት.substring(0,5)+sabie[i] ;
             ሎሙ_ትእ=ትንቢት.substring(0,5)+sabie[i]+OMS[11];
             ላቲ_ትእ=ትንቢት.substring(0,5)+rabie[i];
             ሎን_ትእ=ትንቢት.substring(0,5)+sabie[i]+OMS[20];
             //
             ሊተ_ም=ትንቢት.substring(0,5)+geez[i]+OMS[22];
             ለነ_ም=ትንቢት.substring(0,5)+geez[i]+OMS[23];
             ለከ_ም=ትንቢት.substring(0,5)+geez[i]+OMS[0];
             ለክሙ_ም=   ትንቢት.substring(0,5)+geez[i]+OMS[10] ;         
             ለኪ_ም=ትንቢት.substring(0,5)+geez[i]+OMS[2];  
             ለክን_ም=ትንቢት.substring(0,5)+geez[i]+OMS[3];
             ሎቱ_ም=ትንቢት.substring(0,5)+sabie[i] ;
             ሎሙ_ም=ትንቢት.substring(0,5)+sabie[i]+OMS[11];
             ላቲ_ም=ትንቢት.substring(0,5)+rabie[i];
             ሎን_ም=ትንቢት.substring(0,5)+sabie[i]+OMS[20];
               }}
                  for(int j=0;j<geez.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           ቦዝ=ገቢር.substring(0, 4)+ste.substring(1,2)+sabie[j];
           ss=salis[j];
         }}
               for(int j=0;j<geez.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           አርእስት1=ገቢር.substring(0, 4)+sadis[j];
               }} 
               for(int j=0;j<salis.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           አርእስት1=አርእስት1+sabie[j]+"ቶ";
         }}
        }
         break;
         case "ተገብሮ/reflexive/":{
             for(int j=0;j<salis.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           ተገብሮ="ተ"+ste.substring(0,1)+sadis[j];
         }}
               for(int j=0;j<geez.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           ገቢር=ተገብሮ+geez[j];
               }}
                for(int j=0;j<salis.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           ትንቢት="ይት"+ste.substring(0,1)+geez[j];
           ቅርብ_ትእዛዝ="ተ"+ste.substring(0,1)+geez[j]+ste.substring(2,3);
         }}
               for(int j=0;j<geez.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           ትንቢት=ትንቢት+sadis[j];
           ምክንያታዊ=ትእዛዝ=ትንቢት;
               }}
              for(int j=0;j<salis.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           ቦዝ="ተ"+ste.substring(0,2)+sabie[j];
           ss=salis[j];
         }}
               for(int j=0;j<geez.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           አርእስት1="ተ"+ste.substring(0,1)+sadis[j];
               }} 
               for(int j=0;j<salis.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           አርእስት1=አርእስት1+sabie[j]+"ቶ";
         }}
         }
         break;
         case "ተጋብሮ/reciprocal/":{
             for(int j=0;j<geez.length;j++){
         if( ste.substring(0,1).equals(geez[j])){
             for(int i=0;i<sadis.length;i++){
      if( ste.substring(1,2).equals(salis[i])){
           ገቢር="ተ"+rabie[j]+geez[i]+ሓላፊ.substring(1,2);
           ትንቢት="ይት"+rabie[j]+geez[i]+ste.substring(2,3);
           ትእዛዝ=ትንቢት;
            ምክንያታዊ=ትንቢት;
           
         }}}}
           
            for(int i=0;i<sadis.length;i++){
      if( ste.substring(2,3).equals(sadis[i])){
            ሊተ=ገቢር+OMS[22];
            ለነ=ገቢር+OMS[23];
            ለከ=ገቢር+OMS[0];
            ለክሙ=ገቢር+OMS[10];                
            ለኪ=ገቢር+OMS[2];  
            ለክን=ገቢር+OMS[3];  
            ሎቱ=ገቢር.substring(0,3)+sabie[i];
            ሎሙ=ገቢር.substring(0,3)+sabie[i]+OMS[11];
            ላቲ=ገቢር.substring(0,3)+rabie[i];
            ሎን=ገቢር.substring(0,3)+sabie[i]+OMS[20];

                  ሊተ_ት=ትንቢት.substring(0,4)+geez[i]+OMS[22];
             ለነ_ት=ትንቢት.substring(0,4)+geez[i]+OMS[23];
             ለከ_ት=ትንቢት.substring(0,4)+geez[i]+OMS[0];
             ለክሙ_ት=   ትንቢት.substring(0,4)+geez[i]+OMS[10] ;         
             ለኪ_ት=ትንቢት.substring(0,4)+geez[i]+OMS[2];  
             ለክን_ት=ትንቢት.substring(0,4)+geez[i]+OMS[3];
             ሎቱ_ት=ትንቢት.substring(0,4)+sabie[i] ;
             ሎሙ_ት=ትንቢት.substring(0,4)+sabie[i]+OMS[11];
             ላቲ_ት=ትንቢት.substring(0,4)+rabie[i];
             ሎን_ት=ትንቢት.substring(0,4)+sabie[i]+OMS[20];        
                   ሊተ_ትእ=ትንቢት.substring(0,4)+geez[i]+OMS[22];
             ለነ_ትእ=ትንቢት.substring(0,4)+geez[i]+OMS[23];
             ለከ_ትእ=ትንቢት.substring(0,4)+geez[i]+OMS[0];
             ለክሙ_ትእ=   ትንቢት.substring(0,4)+geez[i]+OMS[10] ;         
             ለኪ_ትእ=ትንቢት.substring(0,4)+geez[i]+OMS[2];  
             ለክን_ትእ=ትንቢት.substring(0,4)+geez[i]+OMS[3];
             ሎቱ_ትእ=ትንቢት.substring(0,4)+sabie[i] ;
             ሎሙ_ትእ=ትንቢት.substring(0,4)+sabie[i]+OMS[11];
             ላቲ_ትእ=ትንቢት.substring(0,4)+rabie[i];
             ሎን_ትእ=ትንቢት.substring(0,4)+sabie[i]+OMS[20];            //
             ሊተ_ም=ትንቢት.substring(0,4)+geez[i]+OMS[22];
             ለነ_ም=ትንቢት.substring(0,4)+geez[i]+OMS[23];
             ለከ_ም=ትንቢት.substring(0,4)+geez[i]+OMS[0];
             ለክሙ_ም=   ትንቢት.substring(0,4)+geez[i]+OMS[10] ;         
             ለኪ_ም=ትንቢት.substring(0,4)+geez[i]+OMS[2];  
             ለክን_ም=ትንቢት.substring(0,4)+geez[i]+OMS[3];
             ሎቱ_ም=ትንቢት.substring(0,4)+sabie[i] ;
             ሎሙ_ም=ትንቢት.substring(0,4)+sabie[i]+OMS[11];
             ላቲ_ም=ትንቢት.substring(0,4)+rabie[i];
             ሎን_ም=ትንቢት.substring(0,4)+sabie[i]+OMS[20];
           ቅርብ_ትእዛዝ=ቅርብ_ትእዛዝ+sadis[i];  
               }}
              for(int j=0;j<salis.length;j++){
         if( ste.substring(0,1).equals(geez[j])){
           ቦዝ="ተ"+rabie[j]+ste.substring(1, 2);
           አርእስት1="ተ"+rabie[j];
            ሳልስቅጽል="ተ"+rabie[j];           
         }}
               for(int j=0;j<geez.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           አርእስት1=አርእስት1+sadis[j];
           ሳልስቅጽል=ሳልስቅጽል+rabie[j];         
               }} 
               for(int j=0;j<salis.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
             ሳልስቅጽል=ሳልስቅጽል+salis[j];
               ሳልስቅጽል1=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያኒሁ";
        ሳልስቅጽል2=ሳልስቅጽል.substring(0, 4)+"ቱ";
        ሳልስቅጽል3=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያቲሁ";
           ቦዝ=ቦዝ+sabie[j];
           አርእስት1=አርእስት1+sabie[j];
           አርእስት1=አርእስት1+"ቶ";
         }}
         }
   }}
       break;
      
        case "ይእቲ/She/":{
       switch(stemType)
   {
        case "ገቢር/perfective/":{
            ገቢር=ሓላፊ+"ት";
    for(int j=0;j<sadis.length;j++){
      if(ገቢር.substring(2,3).equals(sadis[j])){
            ሊተ=ገቢር.substring(0,2)+geez[j]+OMS[22];
            ለነ=ገቢር.substring(0,2)+geez[j]+OMS[23];
            ለከ=ገቢር.substring(0,2)+geez[j]+OMS[0];
            ለክሙ=ገቢር.substring(0,2)+geez[j]+OMS[10];                
            ለኪ=ገቢር.substring(0,2)+geez[j]+OMS[2];  
            ለክን=ገቢር.substring(0,2)+geez[j]+OMS[3];
            ሎቱ=ገቢር.substring(0,2)+sabie[j];
            ሎሙ=ገቢር.substring(0,2)+sabie[j]+OMS[11];
            ላቲ=ገቢር.substring(0,2)+rabie[j];
            ሎን=ገቢር.substring(0,2)+sabie[j]+OMS[20];
                    } 
       }
 for(int j=0;j<sadis.length;j++){
      if( ste.substring(1,2).equals(salis[j])){
          for(int i=0;i<sadis.length;i++){
               if( ste.substring(0,1).equals(geez[i])){
            ትንቢት="ት"+ste.substring(0,1)+sadis[j]+ste.substring(2,3);
            ምክንያታዊ=ትእዛዝ="ት"+kaeb[i]+ste.substring(2,3);;
               }}}} 
           
          for(int i=0;i<sadis.length;i++){
               if( ste.substring(2,3).equals(sadis[i])){
             ሊተ_ት=ትንቢት.substring(0,3)+geez[i]+OMS[22];
             ለነ_ት=ትንቢት.substring(0,3)+geez[i]+OMS[23];
             ለከ_ት=ትንቢት.substring(0,3)+geez[i]+OMS[0];
             ለክሙ_ት=   ትንቢት.substring(0,3)+geez[i]+OMS[10] ;         
             ለኪ_ት=ትንቢት.substring(0,3)+geez[i]+OMS[2];  
             ለክን_ት=ትንቢት.substring(0,3)+geez[i]+OMS[3];
             ሎቱ_ት=ትንቢት.substring(0,3)+sabie[i] ;
             ሎሙ_ት=ትንቢት.substring(0,3)+sabie[i]+OMS[11];
             ላቲ_ት=ትንቢት.substring(0,3)+rabie[i];
             ሎን_ት=ትንቢት.substring(0,3)+sabie[i]+OMS[20];
   
             ሊተ_ትእ=ትእዛዝ.substring(0,2)+geez[i]+OMS[22];
             ለነ_ትእ=ትእዛዝ.substring(0,2)+geez[i]+OMS[23];
             ለከ_ትእ=ትእዛዝ+OMS[0];
             ለክሙ_ትእ= ትእዛዝ+OMS[10] ;         
             ለኪ_ትእ=ትእዛዝ+OMS[2];  
             ለክን_ትእ=ትእዛዝ+OMS[3];
             ሎቱ_ትእ=ትእዛዝ.substring(0,2)+sabie[i] ;
             ሎሙ_ትእ=ትእዛዝ.substring(0,2)+sabie[i]+OMS[11];
             ላቲ_ትእ=ትእዛዝ.substring(0,2)+rabie[i];
             ሎን_ትእ=ትእዛዝ.substring(0,2)+sabie[i]+OMS[20];                  
             ሊተ_ም=ምክንያታዊ.substring(0,2)+geez[i]+OMS[22];
             ለነ_ም=ምክንያታዊ.substring(0,2)+geez[i]+OMS[23];
             ለከ_ም=ምክንያታዊ.substring(0,3)+OMS[0];
             ለክሙ_ም= ምክንያታዊ.substring(0,3)+OMS[1];         
             ለኪ_ም=ምክንያታዊ.substring(0,3)+OMS[2];   
             ለክን_ም=ምክንያታዊ.substring(0,3)+OMS[3] ;
             ሎቱ_ም=ምክንያታዊ.substring(0,2)+sabie[i] ;
             ሎሙ_ም=ምክንያታዊ.substring(0,2)+sabie[i]+OMS[11];
             ላቲ_ም=ምክንያታዊ.substring(0,2)+rabie[i];
             ሎን_ም=ምክንያታዊ.substring(0,2)+sabie[i]+OMS[20];      
                    } 
         } 
        
        }
        break;
        case "አግብሮ/causative/":{
             for(int j=0;j<sadis.length;j++){
      if( ste.substring(0,1).equals(geez[j])){
            ገቢር="አ"+sabie[j]+ሓላፊ.substring(1,2)+"ት";
           
            for(int i=0;i<sadis.length;i++){
      if( ገቢር.substring(3,4).equals(sadis[i])){
           ሊተ=ገቢር.substring(0,3)+geez[i]+OMS[22];
            ለነ=ገቢር.substring(0,3)+geez[i]+OMS[23];
            ለከ=ገቢር.substring(0,3)+geez[i]+OMS[0];
            ለክሙ=ገቢር.substring(0,3)+geez[i]+OMS[10];                
            ለኪ=ገቢር.substring(0,3)+geez[i]+OMS[2];  
            ለክን=ገቢር.substring(0,3)+geez[i]+OMS[3];
            ሎቱ=ገቢር.substring(0,3)+sabie[i];
            ሎሙ=ገቢር.substring(0,3)+sabie[i]+OMS[11];
            ላቲ=ገቢር.substring(0,3)+rabie[i];
            ሎን=ገቢር.substring(0,3)+sabie[i]+OMS[20];
                    } 
       }}}
   
           for(int i=0;i<sadis.length;i++){
               if( ste.substring(0,1).equals(geez[i])){
           ምክንያታዊ=ትእዛዝ=ትንቢት="ታ"+kaeb[i]+ste.substring(2,3);
               }}
          for(int i=0;i<sadis.length;i++){
               if( ste.substring(2,3).equals(sadis[i])){
             ሊተ_ት=ትንቢት.substring(0,2)+geez[i]+OMS[22];
             ለነ_ት=ትንቢት.substring(0,2)+geez[i]+OMS[23];
             ለከ_ት=ትንቢት.substring(0,2)+geez[i]+OMS[0];
             ለክሙ_ት=   ትንቢት.substring(0,2)+geez[i]+OMS[10] ;         
             ለኪ_ት=ትንቢት.substring(0,2)+geez[i]+OMS[2];  
             ለክን_ት=ትንቢት.substring(0,2)+geez[i]+OMS[3];
             ሎቱ_ት=ትንቢት.substring(0,2)+sabie[i] ;
             ሎሙ_ት=ትንቢት.substring(0,2)+sabie[i]+OMS[11];
             ላቲ_ት=ትንቢት.substring(0,2)+rabie[i];
             ሎን_ት=ትንቢት.substring(0,2)+sabie[i]+OMS[20];
            
             ሊተ_ትእ=ትእዛዝ.substring(0,2)+geez[i]+OMS[22];
             ለነ_ትእ=ትእዛዝ.substring(0,2)+geez[i]+OMS[23];
             ለከ_ትእ=ትእዛዝ+OMS[0];
             ለክሙ_ትእ=   ትእዛዝ+OMS[10] ;         
             ለኪ_ትእ=ትእዛዝ+OMS[2];  
             ለክን_ትእ=ትእዛዝ+OMS[3] ;
             ሎቱ_ትእ=ትእዛዝ.substring(0,2)+sabie[i] ;
             ሎሙ_ትእ=ትእዛዝ.substring(0,2)+sabie[i]+OMS[11];
             ላቲ_ትእ=ትእዛዝ.substring(0,2)+rabie[i] ;
             ሎን_ትእ=ትእዛዝ.substring(0,2)+sabie[i]+OMS[20] ;
             //     
             ሊተ_ም=ትእዛዝ.substring(0,2)+geez[i]+OMS[22];
             ለነ_ም=ትእዛዝ.substring(0,2)+geez[i]+OMS[23];
             ለከ_ም=ትእዛዝ+OMS[0];
             ለክሙ_ም=   ትእዛዝ+OMS[10] ;         
             ለኪ_ም=ትእዛዝ+OMS[2];  
             ለክን_ም=ትእዛዝ+OMS[3] ;
             ሎቱ_ም=ትእዛዝ.substring(0,2)+sabie[i] ;
             ሎሙ_ም=ትእዛዝ.substring(0,2)+sabie[i]+OMS[11];
             ላቲ_ም=ትእዛዝ.substring(0,2)+rabie[i] ;
             ሎን_ም=ትእዛዝ.substring(0,2)+sabie[i]+OMS[20] ;
                    } 
       }
         /*String d="";
   for(int j=0;j<salis.length;j++){
     if( ste.substring(2,3).equals(sadis[j])){
         ቦዝ=ገቢር.substring(0,2)+ste.substring(1,2)+rabie[j];
         ሳልስቅጽል=ገቢር.substring(0,2);
        ss=sabie[j];
        ss1=salis[j];
        d=hams[j];  
    }}
   for(int j=0;j<salis.length;j++){
     if( ste.substring(1,2).equals(salis[j])){
      
        አርእስት1=ቦዝ.substring(0,2)+sadis[j]+ss+"ታ";
        ሳልስቅጽል=ሳልስቅጽል+rabie[j]+ss1+"ት";
        ሳልስቅጽል4=ሳልስቅጽል.substring(0, 4)+"ሃ";
         ሳልስቅጽል1=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያኒሃ";
        ሳልስቅጽል2=ሳልስቅጽል.substring(0, 4)+"ታ";
        ሳልስቅጽል3=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያቲሃ";
        }}*/
        }
        
        break;
         case "አስተጋብሮ/causative-reciprocal/":{
             for(int j=0;j<sadis.length;j++){
      if( ste.substring(0,1).equals(geez[j])){
                for(int i=0;i<sadis.length;i++){
      if( ste.substring(1,2).equals(salis[i])){
            ገቢር="አስተ"+rabie[j]+geez[i]+ሓላፊ.substring(1,2)+"ት";
      }}}}
            for(int i=0;i<sadis.length;i++){
      if( ገቢር.substring(6,7).equals(sadis[i])){
           ሊተ=ገቢር.substring(0,6)+geez[i]+OMS[22];
            ለነ=ገቢር.substring(0,6)+geez[i]+OMS[23];
            ለከ=ገቢር.substring(0,6)+geez[i]+OMS[0];
            ለክሙ=ገቢር.substring(0,6)+geez[i]+OMS[10];                
            ለኪ=ገቢር.substring(0,6)+geez[i]+OMS[2];  
            ለክን=ገቢር.substring(0,6)+geez[i]+OMS[3];
            ሎቱ=ገቢር.substring(0,6)+sabie[i];
            ሎሙ=ገቢር.substring(0,6)+sabie[i]+OMS[11];
            ላቲ=ገቢር.substring(0,6)+rabie[i];
            ሎን=ገቢር.substring(0,6)+sabie[i]+OMS[20];
                    } 
       }
                   for(int j=0;j<geez.length;j++){
      if( ste.substring(0,1).equals(geez[j])){
            ትንቢት="ታስተ"+rabie[j];
      }}
           for(int j=0;j<sadis.length;j++){
      if( ste.substring(1,2).equals(salis[j])){
            ትንቢት=ትንቢት+sadis[j]+ste.substring(2,3);
            ትእዛዝ=ትንቢት;
            ምክንያታዊ=ትንቢት;  
          for(int i=0;i<sadis.length;i++){
               if( ste.substring(2,3).equals(sadis[i])){
                   ሊተ_ት=ትንቢት.substring(0,5)+geez[i]+OMS[22];
             ለነ_ት=ትንቢት.substring(0,5)+geez[i]+OMS[23];
             ለከ_ት=ትንቢት.substring(0,5)+geez[i]+OMS[0];
             ለክሙ_ት=   ትንቢት.substring(0,5)+geez[i]+OMS[10] ;         
             ለኪ_ት=ትንቢት.substring(0,5)+geez[i]+OMS[2];  
             ለክን_ት=ትንቢት.substring(0,5)+geez[i]+OMS[3];
             ሎቱ_ት=ትንቢት.substring(0,5)+sabie[i] ;
             ሎሙ_ት=ትንቢት.substring(0,5)+sabie[i]+OMS[11];
             ላቲ_ት=ትንቢት.substring(0,5)+rabie[i];
             ሎን_ት=ትንቢት.substring(0,5)+sabie[i]+OMS[20];
  
         
                   ሊተ_ትእ=ትንቢት.substring(0,5)+geez[i]+OMS[22];
             ለነ_ትእ=ትንቢት.substring(0,5)+geez[i]+OMS[23];
             ለከ_ትእ=ትንቢት.substring(0,5)+geez[i]+OMS[0];
             ለክሙ_ትእ=   ትንቢት.substring(0,5)+geez[i]+OMS[10] ;         
             ለኪ_ትእ=ትንቢት.substring(0,5)+geez[i]+OMS[2];  
             ለክን_ትእ=ትንቢት.substring(0,5)+geez[i]+OMS[3];
             ሎቱ_ትእ=ትንቢት.substring(0,5)+sabie[i] ;
             ሎሙ_ትእ=ትንቢት.substring(0,5)+sabie[i]+OMS[11];
             ላቲ_ትእ=ትንቢት.substring(0,5)+rabie[i];
             ሎን_ትእ=ትንቢት.substring(0,5)+sabie[i]+OMS[20];
             //
             ሊተ_ም=ትንቢት.substring(0,5)+geez[i]+OMS[22];
             ለነ_ም=ትንቢት.substring(0,5)+geez[i]+OMS[23];
             ለከ_ም=ትንቢት.substring(0,5)+geez[i]+OMS[0];
             ለክሙ_ም=   ትንቢት.substring(0,5)+geez[i]+OMS[10] ;         
             ለኪ_ም=ትንቢት.substring(0,5)+geez[i]+OMS[2];  
             ለክን_ም=ትንቢት.substring(0,5)+geez[i]+OMS[3];
             ሎቱ_ም=ትንቢት.substring(0,5)+sabie[i] ;
             ሎሙ_ም=ትንቢት.substring(0,5)+sabie[i]+OMS[11];
             ላቲ_ም=ትንቢት.substring(0,5)+rabie[i];
             ሎን_ም=ትንቢት.substring(0,5)+sabie[i]+OMS[20];
               }}}}
           //?
               /*   for(int j=0;j<geez.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           ቦዝ=ገቢር.substring(0, 4)+ste.substring(1,2)+salis[j];
           ss=salis[j];
         }}
               for(int j=0;j<geez.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           አርእስት1=ገቢር.substring(0, 4)+sadis[j];
           ሳልስቅጽል=ገቢር.substring(0, 4)+rabie[j]+ss;
           ሳልስቅጽል1=ሳልስቅጽል.substring(0, 5)+ste.substring(2,3)+"ያኒሁ";
        ሳልስቅጽል2=ሳልስቅጽል.substring(0, 6)+"ቱ";
        ሳልስቅጽል3=ሳልስቅጽል.substring(0, 5)+ste.substring(2,3)+"ያቲሁ";
               }} 
               for(int j=0;j<salis.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           አርእስት1=አርእስት1+sabie[j];
           አርእስት1=አርእስት1+"ታ";
         }}*/
        }
         break;
         case "ተገብሮ/reflexive/":{
             for(int j=0;j<salis.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           ተገብሮ="ተ"+ste.substring(0,1)+sadis[j];
         }}
               for(int j=0;j<geez.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           ገቢር=ተገብሮ+geez[j]+"ት";
               }}
                for(int j=0;j<salis.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           ትንቢት="ትት"+ste.substring(0,1)+geez[j];
           ቅርብ_ትእዛዝ="ተ"+ste.substring(0,1)+geez[j]+ste.substring(2,3);
         }}
               for(int j=0;j<geez.length;j++){
         if( ste.substring(2,3).equals(geez[j])){
           ትንቢት=ትንቢት+sadis[j];
           ምክንያታዊ=ትእዛዝ=ትንቢት;
               }}
              for(int j=0;j<salis.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           ቦዝ="ተ"+ste.substring(0,2)+rabie[j];
           ss=salis[j];
         }}
              /*  for(int j=0;j<geez.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
             //?
          አርእስት1="ተ"+ste.substring(0,1)+sadis[j];
            ሳልስቅጽል="ተ"+ste.substring(0,1)+rabie[j]+ss;
           ሳልስቅጽል1=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያኒሁ";
        ሳልስቅጽል2=ሳልስቅጽል.substring(0, 4)+"ቱ";
        ሳልስቅጽል3=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያቲሁ";
               }} 
               for(int j=0;j<salis.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           አርእስት1=አርእስት1+sabie[j];
           አርእስት1=አርእስት1+"ታ";
         }}*/
         }
         break;
         case "ተጋብሮ/reciprocal/":{
             for(int j=0;j<geez.length;j++){
         if( ste.substring(0,1).equals(geez[j])){
               for(int i=0;i<sadis.length;i++){
      if( ste.substring(1,2).equals(salis[i])){
           ገቢር="ተ"+rabie[j]+geez[i]+ሓላፊ.substring(1,2)+"ት";
             ትንቢት="ትት"+rabie[j]+geez[i]+ste.substring(2,3);}}}}
            for(int i=0;i<sadis.length;i++){
      if( ገቢር.substring(4,5).equals(sadis[i])){
           ሊተ=ገቢር.substring(0,4)+geez[i]+OMS[22];
            ለነ=ገቢር.substring(0,4)+geez[i]+OMS[23];
            ለከ=ገቢር.substring(0,4)+geez[i]+OMS[0];
            ለክሙ=ገቢር.substring(0,4)+geez[i]+OMS[10];                
            ለኪ=ገቢር.substring(0,4)+geez[i]+OMS[2];  
            ለክን=ገቢር.substring(0,4)+geez[i]+OMS[3];
            ሎቱ=ገቢር.substring(0,4)+sabie[i];
            ሎሙ=ገቢር.substring(0,4)+sabie[i]+OMS[11];
            ላቲ=ገቢር.substring(0,4)+rabie[i];
            ሎን=ገቢር.substring(0,4)+sabie[i]+OMS[20];}}
            for(int i=0;i<sadis.length;i++){
             if( ትንቢት.substring(4,5).equals(sadis[i])){
                  ሊተ_ት=ትንቢት.substring(0,4)+geez[i]+OMS[22];
             ለነ_ት=ትንቢት.substring(0,4)+geez[i]+OMS[23];
             ለከ_ት=ትንቢት.substring(0,4)+geez[i]+OMS[0];
             ለክሙ_ት=   ትንቢት.substring(0,4)+geez[i]+OMS[10] ;         
             ለኪ_ት=ትንቢት.substring(0,4)+geez[i]+OMS[2];  
             ለክን_ት=ትንቢት.substring(0,4)+geez[i]+OMS[3];
             ሎቱ_ት=ትንቢት.substring(0,4)+sabie[i] ;
             ሎሙ_ት=ትንቢት.substring(0,4)+sabie[i]+OMS[11];
             ላቲ_ት=ትንቢት.substring(0,4)+rabie[i];
             ሎን_ት=ትንቢት.substring(0,4)+sabie[i]+OMS[20];
         
                   ሊተ_ትእ=ትንቢት.substring(0,4)+geez[i]+OMS[22];
             ለነ_ትእ=ትንቢት.substring(0,4)+geez[i]+OMS[23];
             ለከ_ትእ=ትንቢት.substring(0,4)+geez[i]+OMS[0];
             ለክሙ_ትእ=   ትንቢት.substring(0,4)+geez[i]+OMS[10] ;         
             ለኪ_ትእ=ትንቢት.substring(0,4)+geez[i]+OMS[2];  
             ለክን_ትእ=ትንቢት.substring(0,4)+geez[i]+OMS[3];
             ሎቱ_ትእ=ትንቢት.substring(0,4)+sabie[i] ;
             ሎሙ_ትእ=ትንቢት.substring(0,4)+sabie[i]+OMS[11];
             ላቲ_ትእ=ትንቢት.substring(0,4)+rabie[i];
             ሎን_ትእ=ትንቢት.substring(0,4)+sabie[i]+OMS[20];
             //
             ሊተ_ም=ትንቢት.substring(0,4)+geez[i]+OMS[22];
             ለነ_ም=ትንቢት.substring(0,4)+geez[i]+OMS[23];
             ለከ_ም=ትንቢት.substring(0,4)+geez[i]+OMS[0];
             ለክሙ_ም=   ትንቢት.substring(0,4)+geez[i]+OMS[10] ;         
             ለኪ_ም=ትንቢት.substring(0,4)+geez[i]+OMS[2];  
             ለክን_ም=ትንቢት.substring(0,4)+geez[i]+OMS[3];
             ሎቱ_ም=ትንቢት.substring(0,4)+sabie[i] ;
             ሎሙ_ም=ትንቢት.substring(0,4)+sabie[i]+OMS[11];
             ላቲ_ም=ትንቢት.substring(0,4)+rabie[i];
             ሎን_ም=ትንቢት.substring(0,4)+sabie[i]+OMS[20];
           ቅርብ_ትእዛዝ=ቅርብ_ትእዛዝ+sadis[i];
           ትእዛዝ=ትንቢት;
            ምክንያታዊ=ትንቢት;
               }}
             /* for(int j=0;j<salis.length;j++){
         if( ste.substring(0,1).equals(geez[j])){
           ቦዝ="ተ"+rabie[j]+ste.substring(1, 2);
           አርእስት="ተ"+rabie[j];
            ሳልስቅጽል="ተ"+rabie[j];
         }}
               for(int j=0;j<geez.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           አርእስት1=አርእስት1+sadis[j];
           ሳልስቅጽል=ሳልስቅጽል+rabie[j];       
               }} 
               for(int j=0;j<salis.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
             ሳልስቅጽል=ሳልስቅጽል+salis[j]+"ት";
               ሳልስቅጽል1=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያኒሃ";
        ሳልስቅጽል2=ሳልስቅጽል.substring(0, 4)+"ታ";
        ሳልስቅጽል3=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያቲሃ";
           ቦዝ=ቦዝ+rabie[j];
           አርእስት1=አርእስት1+sabie[j]+"ታ";
         }}*/
         }
   }}
        break;
           case "ውእቶሙ/They(3ppm)/":{
       switch(stemType)
   {
        case "ገቢር/perfective/":{
            for(int j=0;j<sadis.length;j++){
      if( ste.substring(2,3).equals(sadis[j])){
            ገቢር=ሓላፊ.substring(0,1)+kaeb[j];
            ሊተ=ገቢር+OMS[22];
            ለነ=ገቢር+OMS[23];
            ለከ=ገቢር+OMS[0];
            ለክሙ=ገቢር+OMS[10];                
            ለኪ=ገቢር+OMS[2];  
            ለክን=ገቢር+OMS[3];
            ሎቱ=ገቢር.substring(0,1)+sadis[j]+OMS[7];
            ሎሙ=ገቢር.substring(0,1)+sadis[j]+OMS[9];
            ላቲ=ገቢር.substring(0,1)+sadis[j]+OMS[14];
            ሎን=ገቢር.substring(0,1)+sadis[j]+OMS[18];
                    } 
       }
       for(int j=0;j<sadis.length;j++){
      if( ste.substring(1,2).equals(salis[j])){
             ትንቢት="ይ"+ste.substring(0,1)+sadis[j]+ገቢር.substring(1,2);
          System.out.println("ትንቢት አንቀጽ:"+ትንቢት);
          for(int i=0;i<sadis.length;i++){
               if( ste.substring(2,3).equals(sadis[i])){
                       ትንቢት=ትንቢት;
             ሊተ_ት=ትንቢት.substring(0,4)+OMS[22];
             ለነ_ት=ትንቢት.substring(0,4)+OMS[23];
             ለከ_ት=ትንቢት.substring(0,4)+OMS[0];
             ለክሙ_ት=   ትንቢት.substring(0,4)+OMS[10] ;         
             ለኪ_ት=ትንቢት.substring(0,4)+OMS[2];  
             ለክን_ት=ትንቢት.substring(0,4)+OMS[3];
             ሎቱ_ት=ትንቢት.substring(0,3)+sadis[i]+OMS[7] ;
             ሎሙ_ት=ትንቢት.substring(0,3)+sadis[i]+OMS[9];
             ላቲ_ት=ትንቢት.substring(0,3)+sadis[i]+OMS[14];
             ሎን_ት=ትንቢት.substring(0,3)+sadis[i]+OMS[18];
                    } }}
       }
        for(int j=0;j<sadis.length;j++){
           if( ste.substring(0,1).equals(geez[j])){
            ትእዛዝ="ይ"+kaeb[j];
           }
            }
          for(int i=0;i<sadis.length;i++){
               if( ste.substring(2,3).equals(sadis[i])){
                   ትእዛዝ=ትእዛዝ+kaeb[i];
             ሊተ_ትእ=ትእዛዝ.substring(0,3)+OMS[22];
             ለነ_ትእ=ትእዛዝ.substring(0,3)+OMS[23];
             ለከ_ትእ=ትእዛዝ+OMS[0];
             ለክሙ_ትእ= ትእዛዝ+OMS[10] ;         
             ለኪ_ትእ=ትእዛዝ+OMS[2];  
             ለክን_ትእ=ትእዛዝ+OMS[3];
             ሎቱ_ትእ=ትእዛዝ.substring(0,2)+sadis[i] +OMS[7];
             ሎሙ_ትእ=ትእዛዝ.substring(0,2)+sadis[i]+OMS[9];
             ላቲ_ትእ=ትእዛዝ.substring(0,2)+sadis[i]+OMS[14];
             ሎን_ትእ=ትእዛዝ.substring(0,2)+sadis[i]+OMS[18];
             ምክንያታዊ=ትእዛዝ;
             ሊተ_ም=ምክንያታዊ.substring(0,3)+OMS[22];
             ለነ_ም=ምክንያታዊ.substring(0,3)+OMS[23];
             ለከ_ም=ምክንያታዊ.substring(0,3)+OMS[0];
             ለክሙ_ም= ምክንያታዊ.substring(0,3)+OMS[1] ;         
             ለኪ_ም=ምክንያታዊ.substring(0,3)+OMS[2];   
             ለክን_ም=ምክንያታዊ.substring(0,3)+OMS[3] ;
             ሎቱ_ም=ምክንያታዊ.substring(0,2)+sadis[i] +OMS[7];
             ሎሙ_ም=ምክንያታዊ.substring(0,2)+sadis[i]+OMS[9];
             ላቲ_ም=ምክንያታዊ.substring(0,2)+sadis[i]+OMS[14];
             ሎን_ም=ምክንያታዊ.substring(0,2)+sadis[i]+OMS[18];
                    } 
         } 
         String d="";
   for(int j=0;j<salis.length;j++){
     if( ste.substring(2,3).equals(sadis[j])){
         //?
         ቦዝ=ste.substring(0,2)+sabie[j]+SMS[12];  
        //ሳልስቅጽል=salis[j];
        ss=sabie[j];
        ss1=sadis[j];
        d=rabie[j];
    }}
  
   አርእስት1=ste.substring(0,2)+ss+"ቶ"+SMS[12];
   for(int j=0;j<salis.length;j++){
     if( ste.substring(0,1).equals(geez[j])){
         ሳቢዘር=sadis[j];
         ሳድስቅጽል=sadis[j];
    }}
   for(int j=0;j<salis.length;j++){
     if( ste.substring(1,2).equals(salis[j])){
        ሳድስቅጽል=ሳድስቅጽል+kaeb[j];
        ሳድስቅጽል=ሳድስቅጽል.substring(0, 2)+d+"ን";
        /*ሳልስቅጽል4=ste.substring(0,1)+rabie[j]+ሳልስቅጽል ;
        ሳልስቅጽል=ste.substring(0,1)+rabie[j]+ሳልስቅጽል+"ሁ" ;
        ሳልስቅጽል1=ሳልስቅጽል.substring(0, 2)+ste.substring(2,3)+"ያኒሆሙ";
        ሳልስቅጽል2=ሳልስቅጽል.substring(0, 3)+"ቱ";
        ሳልስቅጽል3=ሳልስቅጽል.substring(0, 2)+ste.substring(2,3)+"ያቲሆሙ";*/
        //ሳቢዘር=ሳቢዘር+sadis[j]+ሳቢዘር1+"ቶሙ";
    }}
        }
        break;
        case "አግብሮ/causative/":{
      for(int j=0;j<sadis.length;j++){
      if( ste.substring(0,1).equals(geez[j])){
               for(int i=0;i<sadis.length;i++){
      if(ste.substring(1,2).equals(salis[i])){
            ገቢር="አ"+sabie[j];
             ትንቢት="ያ"+ste.substring(0,1)+sadis[i];
              ምክንያታዊ=ትእዛዝ="ያ"+kaeb[j];
      }}}}
            
            for(int i=0;i<sadis.length;i++){
      if( ste.substring(2,3).equals(sadis[i])){
           ገቢር=ገቢር+kaeb[i];
          ትንቢት=ትንቢት+kaeb[i];
          ምክንያታዊ=ትእዛዝ=ትእዛዝ+kaeb[i];
          ሊተ=ገቢር+OMS[22];
            ለነ=ገቢር+OMS[23];
            ለከ=ገቢር+OMS[0];
            ለክሙ=ገቢር+OMS[10];                
            ለኪ=ገቢር+OMS[2];  
            ለክን=ገቢር+OMS[3];
         
          ሎቱ=ገቢር.substring(0,2)+sadis[i]+OMS[7];
            ሎሙ=ገቢር.substring(0,2)+sadis[i]+OMS[9];
            ላቲ=ገቢር.substring(0,2)+sadis[i]+OMS[14];
            ሎን=ገቢር.substring(0,2)+sadis[i]+OMS[18];
                    } 
       }
          for(int i=0;i<sadis.length;i++){
               if( ste.substring(2,3).equals(sadis[i])){
                   ሊተ_ት=ትንቢት.substring(0,3)+kaeb[i]+OMS[22];
             ለነ_ት=ትንቢት.substring(0,3)+kaeb[i]+OMS[23];
             ለከ_ት=ትንቢት.substring(0,3)+kaeb[i]+OMS[0];
             ለክሙ_ት=   ትንቢት.substring(0,3)+kaeb[i]+OMS[10] ;         
             ለኪ_ት=ትንቢት.substring(0,3)+kaeb[i]+OMS[2];  
             ለክን_ት=ትንቢት.substring(0,3)+kaeb[i]+OMS[3];
             ሎቱ_ት=ትንቢት.substring(0,3)+sadis[i] +OMS[7];;
             ሎሙ_ት=ትንቢት.substring(0,3)+sadis[i]+OMS[9];
             ላቲ_ት=ትንቢት.substring(0,3)+sadis[i]+OMS[14];;
             ሎን_ት=ትንቢት.substring(0,3)+sadis[i]+OMS[18];
      
             ሊተ_ትእ=ትእዛዝ.substring(0,2)+kaeb[i]+OMS[22];
             ለነ_ትእ=ትእዛዝ.substring(0,2)+kaeb[i]+OMS[23];
             ለከ_ትእ=ትእዛዝ+OMS[0];
             ለክሙ_ትእ=   ትእዛዝ+OMS[10] ;         
             ለኪ_ትእ=ትእዛዝ+OMS[2];  
             ለክን_ትእ=ትእዛዝ+OMS[3] ;
             ሎቱ_ትእ=ትእዛዝ.substring(0,2)+sadis[i] +OMS[7];;
             ሎሙ_ትእ=ትእዛዝ.substring(0,2)+sadis[i]+OMS[9];
             ላቲ_ትእ=ትእዛዝ.substring(0,2)+sadis[i]+OMS[14];;
             ሎን_ትእ=ትእዛዝ.substring(0,2)+sadis[i]+OMS[18];
             //     
             ሊተ_ም=ትእዛዝ.substring(0,3)+geez[i]+OMS[22];
             ለነ_ም=ትእዛዝ.substring(0,3)+geez[i]+OMS[23];
             ለከ_ም=ትእዛዝ+OMS[0];
             ለክሙ_ም=   ትእዛዝ+OMS[10] ;         
             ለኪ_ም=ትእዛዝ+OMS[2];  
             ለክን_ም=ትእዛዝ+OMS[3] ;
             ሎቱ_ም=ትእዛዝ.substring(0,2)+sadis[i] +OMS[7];;
             ሎሙ_ም=ትእዛዝ.substring(0,2)+sadis[i]+OMS[9];
             ላቲ_ም=ትእዛዝ.substring(0,2)+sadis[i]+OMS[14];;
             ሎን_ም=ትእዛዝ.substring(0,2)+sadis[i]+OMS[18];
                    } 
       }
         String d="";
   for(int j=0;j<salis.length;j++){
     if( ste.substring(2,3).equals(sadis[j])){
                for(int i=0;i<sadis.length;i++){
               if( ste.substring(0,1).equals(geez[i])){
         ቦዝ=ገቢር.substring(0,1)+sadis[i]+ste.substring(1,2)+sabie[j]+SMS[12];
         //ሳልስቅጽል=ገቢር.substring(0,2);
        ss=sabie[j];
        ss1=salis[j];
        d=hams[j];  
    }}}}
   for(int j=0;j<salis.length;j++){
     if( ste.substring(1,2).equals(salis[j])){
         
        //    አርእስት=ቦዝ.substring(0,2)+sadis[j]+ቦዝ.substring(3,4);
        አርእስት1=ቦዝ.substring(0,2)+sadis[j]+ቦዝ.substring(3,4)+"ቶ"+SMS[12];/*
        ሳልስቅጽል=ሳልስቅጽል+rabie[j]+ss1;
         ሳልስቅጽል1=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያኒ"+OMS[12];
        ሳልስቅጽል2=ሳልስቅጽል.substring(0, 4)+"ቶ"+OMS[12];
        ሳልስቅጽል3=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያቲ"+OMS[12];*/
        }}
        }
        break;
         case "አስተጋብሮ/causative-reciprocal/":{
             for(int j=0;j<sadis.length;j++){
      if( ste.substring(0,1).equals(geez[j])){
                for(int i=0;i<sadis.length;i++){
      if( ste.substring(1,2).equals(salis[i])){
            ገቢር="አስተ"+rabie[j]+geez[i];
             ትንቢት="ያስተ"+rabie[j]+sadis[i];
      }}}}     
            for(int i=0;i<sadis.length;i++){
      if( ste.substring(2,3).equals(sadis[i])){
           ገቢር=ገቢር+kaeb[i];
            ትንቢት=ትንቢት+kaeb[i];
            ትእዛዝ=ትንቢት;
            ምክንያታዊ=ትንቢት;  
               ሊተ=ገቢር+OMS[22];
            ለነ=ገቢር+OMS[23];
            ለከ=ገቢር+OMS[0];
            ለክሙ=ገቢር+OMS[10];                
            ለኪ=ገቢር+OMS[2];  
            ለክን=ገቢር+OMS[3];
           ሎቱ=ገቢር.substring(0,5)+sadis[i]+OMS[7];
            ሎሙ=ገቢር.substring(0,5)+sadis[i]+OMS[9];
            ላቲ=ገቢር.substring(0,5)+sadis[i]+OMS[14];
            ሎን=ገቢር.substring(0,5)+sadis[i]+OMS[18];
                   ሊተ_ት=ትንቢት+OMS[22];
             ለነ_ት=ትንቢት+OMS[23];
             ለከ_ት=ትንቢት+OMS[0];
             ለክሙ_ት=   ትንቢት+OMS[10] ;         
             ለኪ_ት=ትንቢት+OMS[2];  
             ለክን_ት=ትንቢት+OMS[3];
             ሎቱ_ት=ትንቢት.substring(0,5)+sadis[i] +OMS[7];
             ሎሙ_ት=ትንቢት.substring(0,5)+sadis[i]+OMS[9];
             ላቲ_ት=ትንቢት.substring(0,5)+sadis[i]+OMS[14];
             ሎን_ት=ትንቢት.substring(0,5)+sadis[i]+OMS[18];
             
              ሊተ_ትእ=ትንቢት+OMS[22];
             ለነ_ትእ=ትንቢት+OMS[23];
             ለከ_ትእ=ትንቢት+OMS[0];
             ለክሙ_ትእ=   ትንቢት+OMS[10] ;         
             ለኪ_ትእ=ትንቢት+OMS[2];  
             ለክን_ትእ=ትንቢት+OMS[3];
             ሎቱ_ትእ=ትንቢት.substring(0,5)+sadis[i] +OMS[7];
             ሎሙ_ትእ=ትንቢት.substring(0,5)+sadis[i]+OMS[9];
             ላቲ_ትእ=ትንቢት.substring(0,5)+sadis[i]+OMS[14];
             ሎን_ትእ=ትንቢት.substring(0,5)+sadis[i]+OMS[18];
             
             //
                         ሊተ_ም=ትንቢት+OMS[22];
             ለነ_ም=ትንቢት+OMS[23];
             ለከ_ም=ትንቢት+OMS[0];
             ለክሙ_ም=   ትንቢት+OMS[10] ;         
             ለኪ_ም=ትንቢት+OMS[2];  
             ለክን_ም=ትንቢት+OMS[3];
             ሎቱ_ም=ትንቢት.substring(0,5)+sadis[i] +OMS[7];
             ሎሙ_ም=ትንቢት.substring(0,5)+sadis[i]+OMS[9];
             ላቲ_ም=ትንቢት.substring(0,5)+sadis[i]+OMS[14];
             ሎን_ም=ትንቢት.substring(0,5)+sadis[i]+OMS[18];

               }}
                  for(int j=0;j<geez.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           ቦዝ=ገቢር.substring(0, 4)+ste.substring(1,2)+sabie[j]+SMS[12];
           ss=salis[j];
         }}
               for(int j=0;j<geez.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           አርእስት1=ገቢር.substring(0, 4)+sadis[j];
           /*ሳልስቅጽል=ገቢር.substring(0, 4)+rabie[j]+ss;
           ሳልስቅጽል1=ሳልስቅጽል.substring(0, 5)+ste.substring(2,3)+"ያኒ"+OMS[13];
           ሳልስቅጽል2=ሳልስቅጽል.substring(0, 6)+"ቶ"+SMS[12];
           ሳልስቅጽል3=ሳልስቅጽል.substring(0, 5)+ste.substring(2,3)+"ያቲ"+OMS[13];*/
               }} 
               for(int j=0;j<salis.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           አርእስት1=አርእስት1+sabie[j];
           አርእስት1=አርእስት1+"ቶ"+SMS[12];
         }}
        }
         break;
               case "ተገብሮ/reflexive/":{
             for(int j=0;j<salis.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           ተገብሮ="ተ"+ste.substring(0,1)+sadis[j];
         }}
               for(int j=0;j<geez.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           ገቢር=ተገብሮ+kaeb[j];
               }}
                for(int j=0;j<salis.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           ትንቢት="ይት"+ste.substring(0,1)+geez[j];
           ቅርብ_ትእዛዝ="ተ"+ste.substring(0,1)+geez[j]+ste.substring(2,3);
         }}
               for(int j=0;j<geez.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           ትንቢት=ትንቢት+kaeb[j];
           ምክንያታዊ=ትእዛዝ=ትንቢት;
               }}
              for(int j=0;j<salis.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           ቦዝ="ተ"+ste.substring(0,2)+sabie[j]+SMS[12];
           ss=salis[j];
         }}
               for(int j=0;j<geez.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           አርእስት1="ተ"+ste.substring(0,1)+sadis[j];
          // ሳልስቅጽል="ተ"+ste.substring(0,1)+rabie[j]+ss;
          
               }} 
               for(int j=0;j<salis.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           አርእስት1=አርእስት1+sabie[j];
           አርእስት1=አርእስት1+"ቶ"+SMS[12];
         }}
         }
         break;
         case "ተጋብሮ/reciprocal/":{
             for(int j=0;j<geez.length;j++){
         if( ste.substring(0,1).equals(geez[j])){
                     for(int i=0;i<sadis.length;i++){
      if( ste.substring(1,2).equals(salis[i])){
           ገቢር="ተ"+rabie[j]+geez[i];
            ትንቢት="ይት"+rabie[j]+geez[i];
      }}}} 
      for(int i=0;i<sadis.length;i++){
      if( ste.substring(2,3).equals(sadis[i])){
          ገቢር=ገቢር+kaeb[i];
           ትንቢት=ትንቢት+kaeb[i];
          ሊተ=ገቢር+OMS[22];
            ለነ=ገቢር+OMS[23];
            ለከ=ገቢር+OMS[0];
            ለክሙ=ገቢር+OMS[10];                
            ለኪ=ገቢር+OMS[2];  
            ለክን=ገቢር+OMS[3];  
           ሎቱ=ገቢር.substring(0,3)+sabie[i];
            ሎሙ=ገቢር.substring(0,3)+sabie[i]+OMS[11];
            ላቲ=ገቢር.substring(0,3)+rabie[i];
            ሎን=ገቢር.substring(0,3)+sabie[i]+OMS[20];
                  ሊተ_ት=ትንቢት+OMS[22];
             ለነ_ት=ትንቢት+OMS[23];
             ለከ_ት=ትንቢት+OMS[0];
             ለክሙ_ት=   ትንቢት+OMS[10] ;         
             ለኪ_ት=ትንቢት+OMS[2];  
             ለክን_ት=ትንቢት+OMS[3];
             ሎቱ_ት=ትንቢት.substring(0,4)+sadis[i] +OMS[7];
             ሎሙ_ት=ትንቢት.substring(0,4)+sadis[i]+OMS[9];
             ላቲ_ት=ትንቢት.substring(0,4)+sadis[i]+OMS[14];
             ሎን_ት=ትንቢት.substring(0,4)+sadis[i]+OMS[18];
              
             ሊተ_ትእ=ትንቢት+OMS[22];
             ለነ_ትእ=ትንቢት+OMS[23];
             ለከ_ትእ=ትንቢት+OMS[0];
             ለክሙ_ትእ=   ትንቢት+OMS[10] ;         
             ለኪ_ትእ=ትንቢት+OMS[2];  
             ለክን_ትእ=ትንቢት+OMS[3];
             ሎቱ_ትእ=ትንቢት.substring(0,4)+sadis[i] +OMS[7];
             ሎሙ_ትእ=ትንቢት.substring(0,4)+sadis[i]+OMS[9];
             ላቲ_ትእ=ትንቢት.substring(0,4)+sadis[i]+OMS[14];
             ሎን_ትእ=ትንቢት.substring(0,4)+sadis[i]+OMS[18];
             //
              ሊተ_ም=ትንቢት+OMS[22];
             ለነ_ም=ትንቢት+OMS[23];
             ለከ_ም=ትንቢት+OMS[0];
             ለክሙ_ም=   ትንቢት+OMS[10] ;         
             ለኪ_ም=ትንቢት+OMS[2];  
             ለክን_ም=ትንቢት+OMS[3];
             ሎቱ_ም=ትንቢት.substring(0,4)+sadis[i] +OMS[7];
             ሎሙ_ም=ትንቢት.substring(0,4)+sadis[i]+OMS[9];
             ላቲ_ም=ትንቢት.substring(0,4)+sadis[i]+OMS[14];
             ሎን_ም=ትንቢት.substring(0,4)+sadis[i]+OMS[18];

           ትእዛዝ=ትንቢት;
            ምክንያታዊ=ትንቢት;
               }}
              for(int j=0;j<salis.length;j++){
         if( ste.substring(0,1).equals(geez[j])){
           ቦዝ="ተ"+rabie[j]+ste.substring(1, 2);
           አርእስት1="ተ"+rabie[j];
            //ሳልስቅጽል="ተ"+rabie[j];
           
         }}
               for(int j=0;j<geez.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           አርእስት1=አርእስት1+sadis[j];
          // ሳልስቅጽል=ሳልስቅጽል+rabie[j];
         
               }} 
               for(int j=0;j<salis.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
             
           ቦዝ=ቦዝ+sabie[j]+SMS[12];
           አርእስት1=አርእስት1+sabie[j]+"ቶ"+SMS[12];
           
         }}
         }}
           }
       break;
                
      case "ውእቶን/They(3ppf)/":{
       switch(stemType)
   {
        case "ገቢር/perfective/":{
            for(int j=0;j<sadis.length;j++){
      if( ste.substring(2,3).equals(sadis[j])){
            ገቢር=ሓላፊ.substring(0,1)+rabie[j];
            ሊተ=ገቢር+OMS[22];
            ለነ=ገቢር+OMS[23];
            ለከ=ገቢር+OMS[0];
            ለክሙ=ገቢር+OMS[10];                
            ለኪ=ገቢር+OMS[2];  
            ለክን=ገቢር+OMS[3];
            ሎቱ=ገቢር+OMS[5];
            ሎሙ=ገቢር+OMS[12];
            ላቲ=ገቢር+OMS[15];
            ሎን=ገቢር+OMS[19];
                    } 
       }
       for(int j=0;j<sadis.length;j++){
      if( ste.substring(1,2).equals(salis[j])){
           for(int i=0;i<sadis.length;i++){
               if( ste.substring(0,1).equals(geez[i])){
             ትንቢት="ይ"+ste.substring(0,1)+sadis[j]+ገቢር.substring(1,2);  
              ትእዛዝ="ይ"+kaeb[i];
               }}}}
          for(int i=0;i<sadis.length;i++){
               if( ste.substring(2,3).equals(sadis[i])){  
                 ምክንያታዊ=     ትእዛዝ=ትእዛዝ+rabie[i];
             ሊተ_ት=ትንቢት.substring(0,4)+OMS[22];
             ለነ_ት=ትንቢት.substring(0,4)+OMS[23];
             ለከ_ት=ትንቢት.substring(0,4)+OMS[0];
             ለክሙ_ት=   ትንቢት.substring(0,4)+OMS[10] ;         
             ለኪ_ት=ትንቢት.substring(0,4)+OMS[2];  
             ለክን_ት=ትንቢት.substring(0,4)+OMS[3];
             ሎቱ_ት=ትንቢት.substring(0,4)+OMS[5] ;
             ሎሙ_ት=ትንቢት.substring(0,4)+OMS[12];
             ላቲ_ት=ትንቢት.substring(0,4)+OMS[15];
             ሎን_ት=ትንቢት.substring(0,4)+OMS[19];
                  
             ሊተ_ትእ=ትእዛዝ+OMS[22];
             ለነ_ትእ=ትእዛዝ+OMS[23];
             ለከ_ትእ=ትእዛዝ+OMS[0];
             ለክሙ_ትእ= ትእዛዝ+OMS[10] ;         
             ለኪ_ትእ=ትእዛዝ+OMS[2];  
             ለክን_ትእ=ትእዛዝ+OMS[3];
             ሎቱ_ትእ=ትእዛዝ+OMS[5];
             ሎሙ_ትእ=ትእዛዝ+OMS[12];
             ላቲ_ትእ=ትእዛዝ+OMS[15];
             ሎን_ትእ=ትእዛዝ+OMS[19];
             
             ሊተ_ም=ምክንያታዊ+OMS[22];
             ለነ_ም=ምክንያታዊ+OMS[23];
             ለከ_ም=ምክንያታዊ+OMS[0];
             ለክሙ_ም= ምክንያታዊ+OMS[1] ;         
             ለኪ_ም=ምክንያታዊ+OMS[2];   
             ለክን_ም=ምክንያታዊ+OMS[3] ;
             ሎቱ_ም=ምክንያታዊ+OMS[5];
             ሎሙ_ም=ምክንያታዊ+OMS[12];
             ላቲ_ም=ምክንያታዊ+OMS[15];
             ሎን_ም=ምክንያታዊ+OMS[19];
          
                    } 
         } 
         String d="";
   for(int j=0;j<salis.length;j++){
     if( ste.substring(2,3).equals(sadis[j])){
         //?
         ቦዝ=ste.substring(0,2)+sabie[j]+"ን";
           ሳቢዘር1 = geez[j];
         //ሳድስቅጽል=sadis[j];
        ሳልስቅጽል=salis[j];
        ss=sabie[j];
        ss1=sadis[j];
        d=rabie[j];
    }}
   አርእስት=ste.substring(0,3)+"ሆን";
   አርእስት1=ste.substring(0,2)+ss+"ቶን";
   for(int j=0;j<salis.length;j++){
     if( ste.substring(0,1).equals(geez[j])){
         ሳቢዘር=kaeb[j];
         ሳድስቅጽል=sadis[j];
    }}
   for(int j=0;j<salis.length;j++){
     if( ste.substring(1,2).equals(salis[j])){
        ሳድስቅጽል=ሳድስቅጽል+kaeb[j]+d+"ት";
        ሳድስቅጽል1=ሳድስቅጽል.substring(0, 2)+ss+"ን";
        ሳልስቅጽል4=ste.substring(0,1)+rabie[j]+ss1 +"ያን";
        ሳልስቅጽል=ste.substring(0,1)+rabie[j]+ሳልስቅጽል+"ሆን" ;
        ሳልስቅጽል1=ሳልስቅጽል.substring(0, 2)+ste.substring(2,3)+"ያኒሆን";
        ሳልስቅጽል2=ሳልስቅጽል.substring(0, 3)+"ቶን";
        ሳልስቅጽል3=ሳልስቅጽል.substring(0, 2)+ste.substring(2,3)+"ያቲሆን";
        ሳቢዘር=ሳቢዘር+ሳቢዘር1+"ቶን";
    }}
        }
        break;
        case "አግብሮ/causative/":{
             for(int j=0;j<sadis.length;j++){
      if( ste.substring(0,1).equals(geez[j])){
           for(int i=0;i<sadis.length;i++){
      if( ste.substring(1,2).equals(salis[i])){
          ገቢር="አ"+sadis[j]+geez[i];
          ትንቢት="ያ"+ste.substring(0,1)+sadis[i];
           ትእዛዝ="ያ"+kaeb[j];
      }}}}
            for(int i=0;i<sadis.length;i++){
      if( ste.substring(2,3).equals(sadis[i])){
          ገቢር=ገቢር+rabie[i];
          ትንቢት=ትንቢት+rabie[i];
          ምክንያታዊ=ትእዛዝ=ትእዛዝ+rabie[i];
           ሊተ=ገቢር+OMS[22];
            ለነ=ገቢር+OMS[23];
            ለከ=ገቢር+OMS[0];
            ለክሙ=ገቢር+OMS[10];                
            ለኪ=ገቢር+OMS[2];  
            ለክን=ገቢር+OMS[3];
          ሎቱ=ገቢር.substring(0,4)+OMS[5];
            ሎሙ=ገቢር.substring(0,4)+OMS[12];
            ላቲ=ገቢር.substring(0,4)+OMS[15];
            ሎን=ገቢር.substring(0,4)+OMS[19];
  
                   ሊተ_ት=ትንቢት.substring(0,4)+OMS[22];
             ለነ_ት=ትንቢት.substring(0,4)+OMS[23];
             ለከ_ት=ትንቢት.substring(0,4)+OMS[0];
             ለክሙ_ት=   ትንቢት.substring(0,4)+OMS[10] ;         
             ለኪ_ት=ትንቢት.substring(0,4)+OMS[2];  
             ለክን_ት=ትንቢት.substring(0,4)+OMS[3];
             ሎቱ_ት=ትንቢት.substring(0,4)+OMS[5];
             ሎሙ_ት=ትንቢት.substring(0,4)+OMS[12];
             ላቲ_ት=ትንቢት.substring(0,4)+OMS[15];
             ሎን_ት=ትንቢት.substring(0,4)+OMS[19];
       
                           ሊተ_ትእ=ትእዛዝ+OMS[22];
             ለነ_ትእ=ትእዛዝ+OMS[23];
             ለከ_ትእ=ትእዛዝ+OMS[0];
             ለክሙ_ትእ=   ትእዛዝ+OMS[10] ;         
             ለኪ_ትእ=ትእዛዝ+OMS[2];  
             ለክን_ትእ=ትእዛዝ+OMS[3] ;
             ሎቱ_ትእ=ትእዛዝ+OMS[5] ;
             ሎሙ_ትእ=ትእዛዝ+OMS[12];
             ላቲ_ትእ=ትእዛዝ+OMS[15] ;
             ሎን_ትእ=ትእዛዝ+OMS[19] ;
             //     
             ሊተ_ም=ትእዛዝ+OMS[22];
             ለነ_ም=ትእዛዝ+OMS[23];
             ለከ_ም=ትእዛዝ+OMS[0];
             ለክሙ_ም=   ትእዛዝ+OMS[10] ;         
             ለኪ_ም=ትእዛዝ+OMS[2];  
             ለክን_ም=ትእዛዝ+OMS[3] ;
              ሎቱ_ም=ትእዛዝ+OMS[5] ;
             ሎሙ_ም=ትእዛዝ+OMS[12];
             ላቲ_ም=ትእዛዝ+OMS[15] ;
             ሎን_ም=ትእዛዝ+OMS[19] ;
                    } 
       }
         String d="";
   for(int j=0;j<salis.length;j++){
     if( ste.substring(2,3).equals(sadis[j])){
         ቦዝ=ገቢር.substring(0,2)+ste.substring(1,2)+sabie[j]+OMS[20];
         ss=ገቢር.substring(0,2);
       
        ss1=salis[j];
        d=hams[j];  
    }}
   for(int j=0;j<salis.length;j++){
     if( ste.substring(1,2).equals(salis[j])){
        አርእስት1=ቦዝ.substring(0,2)+sadis[j]+ቦዝ.substring(3,4)+"ቶ"+OMS[20];
        ss=ss+rabie[j]+ss1;
         ሳልስቅጽል1=ss.substring(0, 3)+ste.substring(2,3)+"ያት";
        }}
        }
        
        break;
         case "አስተጋብሮ/causative-reciprocal/":{
            for(int j=0;j<sadis.length;j++){
      if( ste.substring(0,1).equals(geez[j])){
           for(int i=0;i<sadis.length;i++){
      if( ste.substring(1,2).equals(salis[i])){
           ገቢር="አስተ"+rabie[j]+geez[i];
         ትንቢት="ያስተ"+rabie[j]+sadis[i];
      }}}}
            for(int i=0;i<sadis.length;i++){
      if( ste.substring(2,3).equals(sadis[i])){
            ምክንያታዊ=  ትእዛዝ=ትንቢት=ትንቢት+rabie[i];
            ገቢር=ገቢር+rabie[i];
            ሊተ=ገቢር+OMS[22];
            ለነ=ገቢር+OMS[23];
            ለከ=ገቢር+OMS[0];
            ለክሙ=ገቢር+OMS[10];                
            ለኪ=ገቢር+OMS[2];  
            ለክን=ገቢር+OMS[3];
           ሎቱ=ገቢር+OMS[5];
            ሎሙ=ገቢር+OMS[12];
            ላቲ=ገቢር+OMS[15];
            ሎን=ገቢር+OMS[19];

                   ሊተ_ት=ትንቢት+OMS[22];
             ለነ_ት=ትንቢት+OMS[23];
             ለከ_ት=ትንቢት+OMS[0];
             ለክሙ_ት=   ትንቢት+OMS[10] ;         
             ለኪ_ት=ትንቢት+OMS[2];  
             ለክን_ት=ትንቢት+OMS[3];
             ሎቱ_ት=ትንቢት+OMS[5] ;
             ሎሙ_ት=ትንቢት+OMS[12];
             ላቲ_ት=ትንቢት+OMS[15];
             ሎን_ት=ትንቢት+OMS[19];
                           ሊተ_ትእ=ትንቢት+OMS[22];
             ለነ_ትእ=ትንቢት+OMS[23];
             ለከ_ትእ=ትንቢት+OMS[0];
             ለክሙ_ትእ=   ትንቢት+OMS[10] ;         
             ለኪ_ትእ=ትንቢት+OMS[2];  
             ለክን_ትእ=ትንቢት+OMS[3];
             ሎቱ_ትእ=ትንቢት+OMS[5] ;
             ሎሙ_ትእ=ትንቢት+OMS[12];
             ላቲ_ትእ=ትንቢት+OMS[15];
             ሎን_ትእ=ትንቢት+OMS[19];
             //
                    ሊተ_ም=ትንቢት+OMS[22];
             ለነ_ም=ትንቢት+OMS[23];
             ለከ_ም=ትንቢት+OMS[0];
             ለክሙ_ም=   ትንቢት+OMS[10] ;         
             ለኪ_ም=ትንቢት+OMS[2];  
             ለክን_ም=ትንቢት+OMS[3];
             ሎቱ_ም=ትንቢት+OMS[5] ;
             ሎሙ_ም=ትንቢት+OMS[12];
             ላቲ_ም=ትንቢት+OMS[15];
             ሎን_ም=ትንቢት+OMS[19];
               }}
           //?
                  for(int j=0;j<geez.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           ቦዝ=ገቢር.substring(0, 4)+ste.substring(1,2)+sabie[j]+OMS[20];
           ss=sabie[j];
         }}
               for(int j=0;j<geez.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           አርእስት1=ገቢር.substring(0, 4)+sadis[j]+ss+"ቶ"+OMS[20];
               }}    
        }
         break;
         case "ተገብሮ/reflexive/":{
             for(int j=0;j<salis.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           ተገብሮ="ተ"+ste.substring(0,1)+sadis[j];
         }}
               for(int j=0;j<geez.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           ገቢር=ተገብሮ+rabie[j];
               }}
                for(int j=0;j<salis.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           ትንቢት="ይት"+ste.substring(0,1)+geez[j];
           ቅርብ_ትእዛዝ="ተ"+ste.substring(0,1)+geez[j]+ste.substring(2,3);
         }}
               for(int j=0;j<geez.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           ትንቢት=ትንቢት+rabie[j];
           ምክንያታዊ=ትእዛዝ=ትንቢት;
               }}
               //?
              for(int j=0;j<salis.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           ቦዝ="ተ"+ste.substring(0,2)+sabie[j]+"ን";
           ss=salis[j];
         }}
               for(int j=0;j<geez.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           አርእስት="ተ"+ste.substring(0,1)+sadis[j];
          
               }} 
               for(int j=0;j<salis.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           አርእስት=አርእስት+sabie[j]+"ቶን";
         }}
         }
         break;
         case "ተጋብሮ/reciprocal/":{
             for(int j=0;j<geez.length;j++){
         if( ste.substring(0,1).equals(geez[j])){
                       for(int i=0;i<sadis.length;i++){
      if( ste.substring(1,2).equals(salis[i])){
           ገቢር="ተ"+rabie[j]+geez[i];
            ትንቢት="ይት"+rabie[j]+geez[i];
      }}} }
            for(int i=0;i<sadis.length;i++){
      if( ste.substring(2,3).equals(sadis[i])){
             ገቢር=ገቢር+rabie[i];
           ሊተ=ገቢር+OMS[22];
            ለነ=ገቢር+OMS[23];
            ለከ=ገቢር+OMS[0];
            ለክሙ=ገቢር+OMS[10];                
            ለኪ=ገቢር+OMS[2];  
            ለክን=ገቢር+OMS[3];  
           ሎቱ=ገቢር.substring(0,4)+OMS[5];
            ሎሙ=ገቢር.substring(0,4)+OMS[12];
            ላቲ=ገቢር.substring(0,4)+OMS[15];
            ሎን=ገቢር.substring(0,4)+OMS[19];
        
           ትንቢት=ትንቢት+rabie[i];
                  ሊተ_ት=ትንቢት.substring(0,5)+OMS[22];
             ለነ_ት=ትንቢት.substring(0,5)+OMS[23];
             ለከ_ት=ትንቢት.substring(0,5)+OMS[0];
             ለክሙ_ት=   ትንቢት.substring(0,5)+OMS[10] ;         
             ለኪ_ት=ትንቢት.substring(0,5)+OMS[2];  
             ለክን_ት=ትንቢት.substring(0,5)+OMS[3];
             ሎቱ_ት=ትንቢት.substring(0,5)+OMS[5] ;
             ሎሙ_ት=ትንቢት.substring(0,5)+OMS[12];
             ላቲ_ት=ትንቢት.substring(0,5)+OMS[15];
             ሎን_ት=ትንቢት.substring(0,5)+OMS[19];
         
                      ሊተ_ትእ=ትንቢት.substring(0,5)+OMS[22];
             ለነ_ትእ=ትንቢት.substring(0,5)+OMS[23];
             ለከ_ትእ=ትንቢት.substring(0,5)+OMS[0];
             ለክሙ_ትእ=   ትንቢት.substring(0,5)+OMS[10] ;         
             ለኪ_ትእ=ትንቢት.substring(0,5)+OMS[2];  
             ለክን_ትእ=ትንቢት.substring(0,5)+OMS[3];
             ሎቱ_ትእ=ትንቢት.substring(0,5)+OMS[5] ;
             ሎሙ_ትእ=ትንቢት.substring(0,5)+OMS[12];
             ላቲ_ትእ=ትንቢት.substring(0,5)+OMS[15];
             ሎን_ትእ=ትንቢት.substring(0,5)+OMS[19];
             //
               ሊተ_ም=ትንቢት.substring(0,5)+OMS[22];
             ለነ_ም=ትንቢት.substring(0,5)+OMS[23];
             ለከ_ም=ትንቢት.substring(0,5)+OMS[0];
             ለክሙ_ም=   ትንቢት.substring(0,5)+OMS[10] ;         
             ለኪ_ም=ትንቢት.substring(0,5)+OMS[2];  
             ለክን_ም=ትንቢት.substring(0,5)+OMS[3];
             ሎቱ_ም=ትንቢት.substring(0,5)+OMS[5] ;
             ሎሙ_ም=ትንቢት.substring(0,5)+OMS[12];
             ላቲ_ም=ትንቢት.substring(0,5)+OMS[15];
             ሎን_ም=ትንቢት.substring(0,5)+OMS[19];
           ቅርብ_ትእዛዝ=ቅርብ_ትእዛዝ+sadis[i];
           ትእዛዝ=ትንቢት;
            ምክንያታዊ=ትንቢት;
               }}
              for(int j=0;j<salis.length;j++){
         if( ste.substring(0,1).equals(geez[j])){
           ቦዝ="ተ"+rabie[j]+ste.substring(1, 2);
           አርእስት="ተ"+rabie[j];
            ሳልስቅጽል="ተ"+rabie[j];
           
         }}
               for(int j=0;j<geez.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           አርእስት=አርእስት+sadis[j];
           ሳልስቅጽል=ሳልስቅጽል+rabie[j];
               }} 
               for(int j=0;j<salis.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           ቦዝ=ቦዝ+sabie[j]+"ን";
           አርእስት=አርእስት+sabie[j]+"ቶን";
         }}
         }
   }}
       break; 
        case "አንተ/You(2psm)/":{
       switch(stemType)
   {
        case "ገቢር/perfective/":{
            for(int j=0;j<sadis.length;j++){
      if( ste.substring(0,1).equals(geez[j])){
           for(int i=0;i<sadis.length;i++){
      if( ste.substring(1,2).equals(salis[i])){
     
          ገቢር=sabie[j]+ste.substring(2,3)+SMS[2];
          ትንቢት="ት"+ste.substring(0,1)+sadis[i]+ste.substring(2,3);
           ትእዛዝ=kaeb[j]+ste.substring(2,3);;
      }}}}
            
            ሊተ=ገቢር+OMS[22];
            ለነ=ገቢር+OMS[23];
            ለከ="";
            ለክሙ="";                
            ለኪ="";  
            ለክን="";
          for(int m=0;m<geez.length;m++){
            if( ገቢር.substring(2,3).equals(geez[m])){
            ሎቱ=ገቢር.substring(0,2)+OMS[24]+" ወይም "+ገቢር.substring(0,2)+rabie[m]+OMS[5];
            ሎሙ=ገቢር.substring(0,2)+sabie[m]+OMS[11]+" ወይም "+ገቢር.substring(0,2)+rabie[m]+OMS[12];
            ላቲ=ገቢር.substring(0,2)+rabie[m]+OMS[15]+" ወይም "+ገቢር.substring(0,2)+rabie[m];
            ሎን=ገቢር.substring(0,2)+sabie[m]+OMS[20]+" ወይም "+ገቢር.substring(0,2)+rabie[m]+OMS[19]; 
                    } }
          for(int i=0;i<sadis.length;i++){
               if( ste.substring(2,3).equals(sadis[i])){
                      ሊተ_ት=ትንቢት.substring(0,3)+geez[i]+OMS[22];
             ለነ_ት=ትንቢት.substring(0,3)+geez[i]+OMS[23];
             ለከ_ት="";
             ለክሙ_ት=  "";         
             ለኪ_ት="";  
             ለክን_ት="";
             ሎቱ_ት=ትንቢት.substring(0,3)+sabie[i] ;
             ሎሙ_ት=ትንቢት.substring(0,3)+sabie[i]+OMS[11];
             ላቲ_ት=ትንቢት.substring(0,3)+rabie[i]; 
             ሎን_ት=ትንቢት.substring(0,3)+sabie[i]+OMS[20];
             
             ሊተ_ትእ=ትእዛዝ.substring(0,1)+geez[i]+OMS[22];
             ለነ_ትእ=ትእዛዝ.substring(0,1)+geez[i]+OMS[23];
             ለከ_ትእ="";
             ለክሙ_ትእ= "" ;         
             ለኪ_ትእ="";  
             ለክን_ትእ="";
             ሎቱ_ትእ=ትእዛዝ.substring(0,1)+sabie[i];
             ሎሙ_ትእ=ትእዛዝ.substring(0,1)+sabie[i]+OMS[11];
             ላቲ_ትእ=ትእዛዝ.substring(0,1)+rabie[i];
             ሎን_ትእ=ትእዛዝ.substring(0,1)+sabie[i]+OMS[20];
             ምክንያታዊ="ት"+ትእዛዝ;
               ሊተ_ም=ምክንያታዊ.substring(0,2)+geez[i]+OMS[22];
             ለነ_ም=ምክንያታዊ.substring(0,2)+geez[i]+OMS[23];
             ለከ_ም="";
             ለክሙ_ም= "" ;         
             ለኪ_ም="";  
             ለክን_ም="";
             ሎቱ_ም=ምክንያታዊ.substring(0,2)+sabie[i];
             ሎሙ_ም=ምክንያታዊ.substring(0,2)+sabie[i]+OMS[11];
             ላቲ_ም=ምክንያታዊ.substring(0,2)+rabie[i];
             ሎን_ም=ምክንያታዊ.substring(0,2)+sabie[i]+OMS[20];
          
                    } 
         } 
         String d="";
   for(int j=0;j<salis.length;j++){
     if( ste.substring(2,3).equals(sadis[j])){
         //?
         ቦዝ=ste.substring(0,2)+sabie[j]+OMS[0];
           ሳቢዘር1 = geez[j];
         //ሳድስቅጽል=sadis[j];
       // ሳልስቅጽል=salis[j];
        ss=sabie[j];
        ss1=sadis[j];
        d=kaeb[j];
    }}
   አርእስት=ste.substring(0,3)+"ትከ";
   አርእስት1="";
   for(int j=0;j<salis.length;j++){
     if( ste.substring(0,1).equals(geez[j])){
         ሳቢዘር=kaeb[j];
         //ሳድስቅጽል=sadis[j];
    }}
   for(int j=0;j<salis.length;j++){
     if( ste.substring(1,2).equals(salis[j])){
      /*  ሳድስቅጽል=ሳድስቅጽል+kaeb[j]+ss1;
        ሳድስቅጽል1=ሳድስቅጽል.substring(0, 2)+ss+"ን";
        ሳልስቅጽል4=ste.substring(0,1)+rabie[j]+ss1 +"ያን";
        ሳልስቅጽል=ste.substring(0,1)+rabie[j]+ሳልስቅጽል+"ሆን" ;
        ሳልስቅጽል1=ሳልስቅጽል.substring(0, 2)+ste.substring(2,3)+"ያኒሆን";
        ሳልስቅጽል2=ሳልስቅጽል.substring(0, 3)+"ቶን";
        ሳልስቅጽል3=ሳልስቅጽል.substring(0, 2)+ste.substring(2,3)+"ያቲሆን";*/
        ሳቢዘር=ሳቢዘር+ሳቢዘር1+"ትከ";
    }}
        }
        break;
        case "አግብሮ/causative/":{
             for(int j=0;j<sadis.length;j++){
      if( ste.substring(0,1).equals(geez[j])){
            for(int i=0;i<sadis.length;i++){
      if( ste.substring(2,3).equals(sadis[i])){
             for(int m=0;m<sadis.length;m++){
      if( ste.substring(1,2).equals(salis[m])){  
          ገቢር="አ"+sabie[j]+sadis[i]+SMS[2];
          ትንቢት="ታ"+ste.substring(0,1)+sadis[m]+ste.substring(2,3);
          ትእዛዝ="ታ"+kaeb[j]+sadis[i];
           ቦዝ="አ"+sadis[j]+ste.substring(1,2)+geez[i]+OMS[0];
            አርእስት1=ቦዝ.substring(0,1)+kaeb[j]+sabie[i]+"ትከ";
          }}}}}}
          for(int m=0;m<geez.length;m++){
            if( ገቢር.substring(3,4).equals(geez[m])){
           ሊተ=ገቢር+OMS[22];
            ለነ=ገቢር+OMS[23];
            ለከ="";
            ለክሙ="";                
            ለኪ="";  
            ለክን="";
            ሎቱ=ገቢር.substring(0,3)+OMS[24]+" ወይም "+ገቢር.substring(0,3)+rabie[m]+OMS[5];
            ሎሙ=ገቢር.substring(0,3)+sabie[m]+OMS[11]+" ወይም "+ገቢር.substring(0,3)+rabie[m]+OMS[12];
            ላቲ=ገቢር.substring(0,3)+rabie[m]+OMS[15]+" ወይም "+ገቢር.substring(0,3)+rabie[m];
            ሎን=ገቢር.substring(0,3)+sabie[m]+OMS[20]+" ወይም "+ገቢር.substring(0,3)+rabie[m]+OMS[19];            
       }}
          for(int i=0;i<sadis.length;i++){
               if( ste.substring(2,3).equals(sadis[i])){
                   // ትንቢት="ታ"+ste.substring(0,1)+sadis[j]+ste.substring(2,3);
                   ሊተ_ት=ትንቢት.substring(0,3)+geez[i]+OMS[22];
             ለነ_ት=ትንቢት.substring(0,3)+geez[i]+OMS[23];
             ለከ_ት="";
             ለክሙ_ት="" ;         
             ለኪ_ት="";  
             ለክን_ት="";
             ሎቱ_ት=ትንቢት.substring(0,3)+sabie[i];
             ሎሙ_ት=ትንቢት.substring(0,3)+sabie[i]+OMS[11];
             ላቲ_ት=ትንቢት.substring(0,3)+rabie[i];
             ሎን_ት=ትንቢት.substring(0,3)+sabie[i]+OMS[20];
                           ሊተ_ትእ=ትእዛዝ.substring(0,2)+geez[i]+OMS[22];
             ለነ_ትእ=ትእዛዝ.substring(0,2)+geez[i]+OMS[23];
             ለከ_ትእ="";
             ለክሙ_ትእ=  "";         
             ለኪ_ትእ="";  
             ለክን_ትእ="" ;
             ሎቱ_ትእ=ትእዛዝ.substring(0,2)+sabie[i] ;
             ሎሙ_ትእ=ትእዛዝ.substring(0,2)+sabie[i]+OMS[11];
             ላቲ_ትእ=ትእዛዝ.substring(0,2)+rabie[i] ;
             ሎን_ትእ=ትእዛዝ.substring(0,2)+sabie[i]+OMS[20] ;
             //     
             ምክንያታዊ=ትእዛዝ;
                             ሊተ_ም=ትእዛዝ.substring(0,2)+geez[i]+OMS[22];
             ለነ_ም=ትእዛዝ.substring(0,2)+geez[i]+OMS[23];
             ለከ_ም="";
             ለክሙ_ም=  "";         
             ለኪ_ም="";  
             ለክን_ም="" ;
             ሎቱ_ም=ትእዛዝ.substring(0,2)+sabie[i] ;
             ሎሙ_ም=ትእዛዝ.substring(0,2)+sabie[i]+OMS[11];
             ላቲ_ም=ትእዛዝ.substring(0,2)+rabie[i] ;
             ሎን_ም=ትእዛዝ.substring(0,2)+sabie[i]+OMS[20] ;
                    }
       }
   for(int j=0;j<salis.length;j++){
     if( ste.substring(1,2).equals(salis[j])){
        /*ሳልስቅጽል=ሳልስቅጽል+rabie[j]+ss1+OMS[0];
        ሳልስቅጽል1=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያኒሁ";
        ሳልስቅጽል2=ሳልስቅጽል.substring(0, 4)+"ቱ";
        ሳልስቅጽል3=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያቲሁ";*/
        }}
        }     
        break;
         case "አስተጋብሮ/causative-reciprocal/":{
                  for(int j=0;j<sadis.length;j++){
      if( ste.substring(0,1).equals(geez[j])){
           
             for(int m=0;m<sadis.length;m++){
      if( ste.substring(1,2).equals(salis[m])){
           for(int i=0;i<sadis.length;i++){
            if( ste.substring(2,3).equals(sadis[i])){
          ገቢር="አስተ"+rabie[j]+geez[m]+sadis[i]+SMS[2];
          ትንቢት="ታስተ"+rabie[j]+geez[m]+sadis[i];
          ትእዛዝ="ታስተ"+kaeb[j]+sadis[i];
        
          }}}}}} 
            for(int i=0;i<sadis.length;i++){
      if( ste.substring(2,3).equals(sadis[i])){
           // ገቢር=ገቢር+ሓላፊ.substring(1,2)+sadis[i]+OMS[0];
            ሊተ=ገቢር+OMS[22];
            ለነ=ገቢር+OMS[23];
            ለከ="";
            ለክሙ="";                
            ለኪ="";  
            ለክን="";
              for(int m=0;m<sadis.length;m++){
      if( ገቢር.substring(6,7).equals(geez[m])){
           ሎቱ=ገቢር.substring(0,5)+sadis[i]+OMS[24] +" ወይም "+ገቢር.substring(0,5)+sadis[i]+rabie[m]+OMS[5];
            ሎሙ=ገቢር.substring(0,5)+sadis[i]+OMS[24]+OMS[11]+" ወይም "+ገቢር.substring(0,5)+sadis[i]+rabie[m]+OMS[12];
            ላቲ=ገቢር.substring(0,5)+sadis[i]+rabie[m]+OMS[4];
            ሎን=ገቢር.substring(0,5)+sadis[i]+rabie[m]+OMS[19];
                    } 
       }}}
          for(int i=0;i<sadis.length;i++){
               if( ste.substring(2,3).equals(sadis[i])){
                   //ትንቢት=ትንቢት+sadis[j]+sadis[i];
            ትእዛዝ=ትንቢት;
            ምክንያታዊ=ትንቢት;  
                   ሊተ_ት=ትንቢት.substring(0,5)+geez[i]+OMS[22];
             ለነ_ት=ትንቢት.substring(0,5)+geez[i]+OMS[23];
             ለከ_ት="";
             ለክሙ_ት= "" ;         
             ለኪ_ት="";  
             ለክን_ት="";
             ሎቱ_ት=ትንቢት.substring(0,5)+sabie[i] ;
             ሎሙ_ት=ትንቢት.substring(0,5)+sabie[i]+OMS[11];
             ላቲ_ት=ትንቢት.substring(0,6)+rabie[i];
             ሎን_ት=ትንቢት.substring(0,6)+sabie[i]+OMS[20];
    
                   ትእዛዝ=prefix[10]+ትንቢት.substring(3,6);
             ሊተ_ትእ=ትእዛዝ.substring(0,5)+geez[i]+OMS[22];
             ለነ_ትእ=ትእዛዝ.substring(0,5)+geez[i]+OMS[23];
             ለከ_ትእ="";
             ለክሙ_ትእ=  "" ;         
             ለኪ_ትእ="";  
             ለክን_ትእ="";
             ሎቱ_ትእ=ትእዛዝ.substring(0,5)+sabie[i] ;
             ሎሙ_ትእ=ትእዛዝ.substring(0,5)+sabie[i]+OMS[11];
             ላቲ_ትእ=ትእዛዝ.substring(0,5)+rabie[i];
             ሎን_ትእ=ትእዛዝ.substring(0,5)+sabie[i]+OMS[20];
             //
             ምክንያታዊ=prefix[8]+ትንቢት.substring(3,6);;
             ሊተ_ም=ምክንያታዊ.substring(0,5)+geez[i]+OMS[22];
             ለነ_ም=ምክንያታዊ.substring(0,5)+geez[i]+OMS[23];
             ለከ_ም="";
             ለክሙ_ም=  "" ;         
             ለኪ_ም="";  
             ለክን_ም="";
             ሎቱ_ም=ምክንያታዊ.substring(0,5)+sabie[i] ;
             ሎሙ_ም=ምክንያታዊ.substring(0,5)+sabie[i]+OMS[11];
             ላቲ_ም=ምክንያታዊ.substring(0,5)+rabie[i];
             ሎን_ም=ምክንያታዊ.substring(0,5)+sabie[i]+OMS[20];
               }}
           //?
                  for(int j=0;j<geez.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           ቦዝ=ገቢር.substring(0, 4)+ste.substring(1,2)+geez[j]+SMS[2];
           ss=salis[j];
         }}
               for(int j=0;j<geez.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           አርእስት=ገቢር.substring(0, 4)+sadis[j];
          /* ሳልስቅጽል=ገቢር.substring(0, 4)+rabie[j]+ss;
           ሳልስቅጽል1=ሳልስቅጽል.substring(0, 5)+ste.substring(2,3)+"ያኒሁ";
        ሳልስቅጽል2=ሳልስቅጽል.substring(0, 6)+"ቱ";
        ሳልስቅጽል3=ሳልስቅጽል.substring(0, 5)+ste.substring(2,3)+"ያቲሁ";*/
               }} 
               for(int j=0;j<salis.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           አርእስት=አርእስት+sabie[j]+"ት"+SMS[2];
         
         }}
        }
         break;
         //??
         case "ተገብሮ/reflexive/":{
             for(int j=0;j<salis.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           ገቢር=prefix[15]+ሓላፊ.substring(0,2)+sadis[j]+OMS[0];
         }} 
                for(int j=0;j<salis.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           ቅርብ_ትእዛዝ="ተ"+ste.substring(0,1)+geez[j]+ste.substring(2,3);
         }}
               for(int j=0;j<geez.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
            ትንቢት=prefix[7]+ሓላፊ.substring(0,2)+sadis[j];
            ትእዛዝ=prefix[15]+ሓላፊ.substring(0,2)+sadis[j];
             ምክንያታዊ=prefix[7]+ሓላፊ.substring(0,2)+sadis[j];
               }}
               //?
              for(int j=0;j<salis.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           ቦዝ="ተ"+ste.substring(0,2)+geez[j]+OMS[0];
           ss=salis[j];
         }}
               for(int j=0;j<geez.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           አርእስት="ተ"+ste.substring(0,1)+sadis[j];
         /*   ሳልስቅጽል="ተ"+ste.substring(0,1)+rabie[j]+ss;
           ሳልስቅጽል1=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያኒሁ";
        ሳልስቅጽል2=ሳልስቅጽል.substring(0, 4)+"ቱ";
        ሳልስቅጽል3=ሳልስቅጽል.substring(0, 3)+ste.substring(2,3)+"ያቲሁ";*/
               }} 
               for(int j=0;j<salis.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           አርእስት=አርእስት+sabie[j]+"ት"+SMS[2];
         }}
         }
         break;
         case "ተጋብሮ/reciprocal/":{
             for(int j=0;j<geez.length;j++){
      if( ste.substring(0,1).equals(geez[j])){
      for(int i=0;i<sadis.length;i++){
      if( ste.substring(1,2).equals(salis[i])){
          ገቢር="ተ"+rabie[j]+geez[i]+ste.substring(2,3)+OMS[0];
          ትንቢት=prefix[7]+rabie[j]+geez[i];
           ሊተ=ገቢር+OMS[22];
           ለነ=ገቢር+OMS[23];
            ለከ="";
            ለክሙ="";                
            ለኪ="";  
            ለክን="";  }}
                      for(int m=0;m<sadis.length;m++){
      if( ገቢር.substring(4,5).equals(geez[m])){
           ሎቱ=ገቢር.substring(0,4)+sabie[m] ;
             ሎሙ=ገቢር.substring(0,4)+sabie[m]+OMS[11];
             ላቲ=ገቢር.substring(0,4)+rabie[m];
             ሎን=ገቢር.substring(0,4)+sabie[m]+OMS[20];
               }}}}
                for(int j=0;j<geez.length;j++){
         if( ste.substring(0,1).equals(geez[j])){
           
           ቅርብ_ትእዛዝ="ተ"+rabie[j]+ሓላፊ.substring(1,2);;
         }}
               for(int i=0;i<geez.length;i++){
         if( ste.substring(2,3).equals(sadis[i])){
           ትንቢት=ትንቢት+sadis[i];
                  ሊተ_ት=ትንቢት.substring(0,4)+geez[i]+OMS[22];
             ለነ_ት=ትንቢት.substring(0,4)+geez[i]+OMS[23];
             ለከ_ት="";
             ለክሙ_ት=  "" ;         
             ለኪ_ት="";  
             ለክን_ት="";
           ሎቱ_ት=ትንቢት.substring(0,4)+sabie[i] ;
             ሎሙ_ት=ትንቢት.substring(0,4)+sabie[i]+OMS[11];
             ላቲ_ት=ትንቢት.substring(0,4)+rabie[i];
             ሎን_ት=ትንቢት.substring(0,4)+sabie[i]+OMS[20];
             ትእዛዝ=ገቢር.substring(0,4);
             ሊተ_ትእ=ትእዛዝ.substring(0,3)+geez[i]+OMS[22];
             ለነ_ትእ=ትእዛዝ.substring(0,3)+geez[i]+OMS[23];
             ለከ_ትእ="";
             ለክሙ_ትእ=  "" ;         
             ለኪ_ትእ="";  
             ለክን_ትእ="";
             ሎቱ_ትእ=ትእዛዝ.substring(0,3)+sabie[i] ;
             ሎሙ_ትእ=ትእዛዝ.substring(0,3)+sabie[i]+OMS[11];
             ላቲ_ትእ=ትእዛዝ.substring(0,3)+rabie[i];
             ሎን_ትእ=ትእዛዝ.substring(0,3)+sabie[i]+OMS[20];
             //
               ምክንያታዊ=ትንቢት;
                    ሊተ_ም=ትንቢት.substring(0,4)+geez[i]+OMS[22];
             ለነ_ም=ትንቢት.substring(0,4)+geez[i]+OMS[23];
             ለከ_ም="";
             ለክሙ_ም=  "" ;         
             ለኪ_ም="";  
             ለክን_ም="";
           ሎቱ_ም=ትንቢት.substring(0,4)+sabie[i] ;
             ሎሙ_ም=ትንቢት.substring(0,4)+sabie[i]+OMS[11];
             ላቲ_ም=ትንቢት.substring(0,4)+rabie[i];
             ሎን_ም=ትንቢት.substring(0,4)+sabie[i]+OMS[20];
           ቅርብ_ትእዛዝ=ቅርብ_ትእዛዝ+sadis[i];
          // ትእዛዝ=ትንቢት;
               }}
              for(int j=0;j<salis.length;j++){
         if( ste.substring(0,1).equals(geez[j])){
           ቦዝ="ተ"+rabie[j]+ste.substring(1, 2);
           አርእስት="ተ"+rabie[j];
           // ሳልስቅጽል="ተ"+rabie[j];
         }}
               for(int j=0;j<geez.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           አርእስት=አርእስት+sadis[j];
           //ሳልስቅጽል=ሳልስቅጽል+rabie[j];
               }} 
               for(int j=0;j<salis.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           ቦዝ=ቦዝ+geez[j]+SMS[2];
           አርእስት=አርእስት+sabie[j]+"ት"+SMS[2];
           //አርእስት1=አርእስት+"ት";
         }}
         }
   }}
       break;
          case "አንቲ/You(2psf)/":{
       switch(stemType)
   {
        case "ገቢር/perfective/":{
            for(int j=0;j<sadis.length;j++){
      if( ste.substring(0,1).equals(geez[j])){
           for(int i=0;i<sadis.length;i++){
      if( ste.substring(1,2).equals(salis[i])){
          for(int m=0;m<geez.length;m++){
            if( ste.substring(2,3).equals(sadis[m])){
          ገቢር=sabie[j]+ste.substring(2,3)+SMS[3];
          ትንቢት="ት"+ste.substring(0,1)+sadis[i]+salis[m];
           ትእዛዝ=kaeb[j]+salis[m];
      }}}}}}
          for(int m=0;m<geez.length;m++){
            if( ገቢር.substring(2,3).equals(salis[m])){
             ሊተ=ገቢር.substring(0,2)+sadis[m]+OMS[22];
            ለነ=ገቢር.substring(0,2)+sadis[m]+OMS[23];
            ለከ="-";
            ለክሙ="-";                
            ለኪ="-";  
            ለክን="-";
            ሎቱ=ገቢር.substring(0,3)+OMS[8];
            ሎሙ=ገቢር.substring(0,3)+OMS[13];
            ላቲ=ገቢር.substring(0,3)+OMS[17];
            ሎን=ገቢር.substring(0,3)+OMS[21]; 
                    } }
        for(int i=0;i<geez.length;i++){
            if( ste.substring(2,3).equals(sadis[i])){
            ሊተ_ት=ትንቢት.substring(0,3)+sadis[i]+OMS[22];
            ለነ_ት=ትንቢት.substring(0,3)+sadis[i]+OMS[23];
            ለከ_ት="-";
            ለክሙ_ት="-";                
            ለኪ_ት="-";  
            ለክን_ት="-";
            ሎቱ_ት=ትንቢት.substring(0,3)+sadis[i]+OMS[8];
            ሎሙ_ት=ትንቢት.substring(0,3)+sadis[i]+OMS[13];
            ላቲ_ት=ትንቢት.substring(0,3)+sadis[i]+OMS[17];
            ሎን_ት=ትንቢት.substring(0,3)+sadis[i]+OMS[21]; 
             
             ሊተ_ትእ=ትእዛዝ.substring(0,1)+sadis[i]+OMS[22];
             ለነ_ትእ=ትእዛዝ.substring(0,1)+sadis[i]+OMS[23];
             ለከ_ትእ="";
             ለክሙ_ትእ= "" ;         
             ለኪ_ትእ="";  
             ለክን_ትእ="";
             ሎቱ_ትእ=ትእዛዝ.substring(0,1)+sadis[i]+OMS[8];
             ሎሙ_ትእ=ትእዛዝ.substring(0,1)+sadis[i]+OMS[13];
             ላቲ_ትእ=ትእዛዝ.substring(0,1)+sadis[i]+OMS[17];
             ሎን_ትእ=ትእዛዝ.substring(0,1)+sadis[i]+OMS[21]; 
             ምክንያታዊ="ት"+ትእዛዝ;
               ሊተ_ም=ምክንያታዊ.substring(0,2)+geez[i]+OMS[22];
             ለነ_ም=ምክንያታዊ.substring(0,2)+geez[i]+OMS[23];
             ለከ_ም="";
             ለክሙ_ም= "" ;         
             ለኪ_ም="";  
             ለክን_ም="";
             ሎቱ_ም=ምክንያታዊ.substring(0,2)+sadis[i]+OMS[8];
            ሎሙ_ም=ምክንያታዊ.substring(0,2)+sadis[i]+OMS[13];
            ላቲ_ም=ምክንያታዊ.substring(0,2)+sadis[i]+OMS[17];
            ሎን_ም=ምክንያታዊ.substring(0,2)+sadis[i]+OMS[21]; 
                    } 
         } 
         String d="";
   for(int j=0;j<salis.length;j++){
     if( ste.substring(2,3).equals(sadis[j])){
         //?
         ቦዝ=ste.substring(0,2)+geez[j]+SMS[3];
           ሳቢዘር1 = geez[j];
         //ሳድስቅጽል=sadis[j];
       // ሳልስቅጽል=salis[j];
        ss=sabie[j];
        ss1=sadis[j];
        d=kaeb[j];
    }}
   አርእስት=ste.substring(0,3)+"ትኪ";
   አርእስት1="";
   for(int j=0;j<salis.length;j++){
     if( ste.substring(0,1).equals(geez[j])){
         ሳቢዘር=kaeb[j];
         //ሳድስቅጽል=sadis[j];
    }}
   for(int j=0;j<salis.length;j++){
     if( ste.substring(1,2).equals(salis[j])){
        ሳቢዘር=ሳቢዘር+ሳቢዘር1+"ትኪ";
    }}
        }
        break;
        case "አግብሮ/causative/":{
             for(int j=0;j<sadis.length;j++){
      if( ste.substring(0,1).equals(geez[j])){
            for(int i=0;i<sadis.length;i++){
      if( ste.substring(2,3).equals(sadis[i])){
             for(int m=0;m<sadis.length;m++){
      if( ste.substring(1,2).equals(salis[m])){  
          ገቢር="አ"+sabie[j]+sadis[i]+SMS[3];
          ትንቢት="ታ"+ste.substring(0,1)+sadis[m]+salis[m];
          ትእዛዝ="ታ"+kaeb[j]+salis[i];
           ቦዝ="አ"+sadis[j]+ste.substring(1,2)+geez[i]+SMS[3];
            አርእስት1=ቦዝ.substring(0,1)+kaeb[j]+sabie[i]+"ትኪ";
          }}}}}}
          for(int m=0;m<geez.length;m++){
            if( ገቢር.substring(3,4).equals(salis[m])){
            ሊተ=ገቢር.substring(0,3)+sadis[m]+OMS[22];
            ለነ=ገቢር.substring(0,3)+sadis[m]+OMS[23];
            ለከ="";
            ለክሙ="";                
            ለኪ="";  
            ለክን="";
            ሎቱ=ገቢር+OMS[8];
            ሎሙ=ገቢር+OMS[13];
            ላቲ=ገቢር+OMS[17];
            ሎን=ገቢር+OMS[21];        
       }}
          for(int i=0;i<sadis.length;i++){
               if( ste.substring(2,3).equals(sadis[i])){
             ሊተ_ት=ትንቢት.substring(0,3)+sadis[i]+OMS[22];
             ለነ_ት=ትንቢት.substring(0,3)+sadis[i]+OMS[23];
             ለከ_ት="";
             ለክሙ_ት="" ;         
             ለኪ_ት="";  
             ለክን_ት="";
             ሎቱ_ት=ትንቢት+OMS[8];
             ሎሙ_ት=ትንቢት+OMS[13];
             ላቲ_ት=ትንቢት+OMS[17];
             ሎን_ት=ትንቢት+OMS[21];
             
             ሊተ_ትእ=ትእዛዝ.substring(0,2)+sadis[i]+OMS[22];
             ለነ_ትእ=ትእዛዝ.substring(0,2)+sadis[i]+OMS[23];
             ለከ_ትእ="";
             ለክሙ_ትእ=  "";         
             ለኪ_ትእ="";  
             ለክን_ትእ="" ;
             ሎቱ_ትእ=ትእዛዝ+OMS[8];
             ሎሙ_ትእ=ትእዛዝ+OMS[13];
             ላቲ_ትእ=ትእዛዝ+OMS[17];
             ሎን_ትእ=ትእዛዝ+OMS[21];
             //     
             ምክንያታዊ=ትእዛዝ;
             ሊተ_ም=ትእዛዝ.substring(0,2)+sadis[i]+OMS[22];
             ለነ_ም=ትእዛዝ.substring(0,2)+sadis[i]+OMS[23];
             ለከ_ም="";
             ለክሙ_ም=  "";         
             ለኪ_ም="";  
             ለክን_ም="" ;
             ሎቱ_ም=ምክንያታዊ+OMS[8];
             ሎሙ_ም=ምክንያታዊ+OMS[13];
             ላቲ_ም=ምክንያታዊ+OMS[17];
             ሎን_ም=ምክንያታዊ+OMS[21];
                    }
       }
        }     
        break;
         case "አስተጋብሮ/causative-reciprocal/":{
                  for(int j=0;j<sadis.length;j++){
      if( ste.substring(0,1).equals(geez[j])){
             for(int m=0;m<sadis.length;m++){
      if( ste.substring(1,2).equals(salis[m])){
           for(int i=0;i<sadis.length;i++){
            if( ste.substring(2,3).equals(sadis[i])){
          ገቢር="አስተ"+rabie[j]+geez[m]+sadis[i]+SMS[3];
          ትንቢት="ታስተ"+rabie[j]+geez[m]+salis[i];
          ትእዛዝ="ታስተ"+kaeb[j]+salis[i];
          ቦዝ=ገቢር.substring(0, 4)+ste.substring(1,2)+geez[j]+SMS[3];
          }}}}}} 
            for(int i=0;i<sadis.length;i++){
      if( ste.substring(2,3).equals(sadis[i])){
           // ገቢር=ገቢር+ሓላፊ.substring(1,2)+sadis[i]+OMS[0];
            ሊተ=ገቢር+OMS[22];
            ለነ=ገቢር+OMS[23];
            ለከ="";
            ለክሙ="";                
            ለኪ="";  
            ለክን="";
              for(int m=0;m<sadis.length;m++){
      if( ገቢር.substring(6,7).equals(salis[m])){
           ሎቱ=ገቢር+OMS[8];
            ሎሙ=ገቢር+OMS[13];
            ላቲ=ገቢር+OMS[17];
            ሎን=ገቢር+OMS[21]; 
                    } 
       }}}
          for(int i=0;i<sadis.length;i++){
               if( ste.substring(2,3).equals(sadis[i])){
                   //ትንቢት=ትንቢት+sadis[j]+sadis[i];
            ትእዛዝ=ትንቢት;
            ምክንያታዊ=ትንቢት;  
                   ሊተ_ት=ትንቢት.substring(0,5)+sadis[i]+OMS[22];
             ለነ_ት=ትንቢት.substring(0,5)+sadis[i]+OMS[23];
             ለከ_ት="";
             ለክሙ_ት= "" ;         
             ለኪ_ት="";  
             ለክን_ት="";
             ሎቱ_ት=ትንቢት+OMS[8];
            ሎሙ_ት=ትንቢት+OMS[13];
            ላቲ_ት=ትንቢት+OMS[17];
            ሎን_ት=ትንቢት+OMS[21];     
             ትእዛዝ=prefix[10]+ትንቢት.substring(3,6);
             ሊተ_ትእ=ትእዛዝ.substring(0,5)+sadis[i]+OMS[22];
             ለነ_ትእ=ትእዛዝ.substring(0,5)+sadis[i]+OMS[23];
             ለከ_ትእ="";
             ለክሙ_ትእ=  "" ;         
             ለኪ_ትእ="";  
             ለክን_ትእ="";
            ሎቱ_ትእ=ትእዛዝ+OMS[8];
            ሎሙ_ትእ=ትእዛዝ+OMS[13];
            ላቲ_ትእ=ትእዛዝ+OMS[17];
            ሎን_ትእ=ትእዛዝ+OMS[21];  
             //
             ምክንያታዊ=prefix[8]+ትንቢት.substring(3,6);;
             ሊተ_ም=ምክንያታዊ.substring(0,5)+sadis[i]+OMS[22];
             ለነ_ም=ምክንያታዊ.substring(0,5)+sadis[i]+OMS[23];
             ለከ_ም="";
             ለክሙ_ም=  "" ;         
             ለኪ_ም="";  
             ለክን_ም="";
             ሎቱ_ም=ምክንያታዊ+OMS[8];
             ሎሙ_ም=ምክንያታዊ+OMS[13];
             ላቲ_ም=ምክንያታዊ+OMS[17];
             ሎን_ም=ምክንያታዊ+OMS[21];  
               }}
           //?
                  for(int j=0;j<geez.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
          
           ss=salis[j];
         }}
               for(int j=0;j<geez.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           አርእስት=ገቢር.substring(0, 4)+sadis[j];
          /* ሳልስቅጽል=ገቢር.substring(0, 4)+rabie[j]+ss;
           ሳልስቅጽል1=ሳልስቅጽል.substring(0, 5)+ste.substring(2,3)+"ያኒሁ";
        ሳልስቅጽል2=ሳልስቅጽል.substring(0, 6)+"ቱ";
        ሳልስቅጽል3=ሳልስቅጽል.substring(0, 5)+ste.substring(2,3)+"ያቲሁ";*/
               }} 
               for(int j=0;j<salis.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           አርእስት=አርእስት+sabie[j]+"ት"+SMS[3];
         
         }}
        }
         break;
         //??
         case "ተገብሮ/reflexive/":{
             for(int j=0;j<salis.length;j++){
         if( ste.substring(0,1).equals(geez[j])){
          for(int m=0;m<salis.length;m++){
         if( ste.substring(1,2).equals(salis[m])){
         for(int i=0;i<geez.length;i++){
         if( ste.substring(2,3).equals(sadis[i])){
           ገቢር=prefix[15]+ste.substring(0,1)+geez[m]+sadis[i]+SMS[3];
           ትንቢት=prefix[7]+rabie[j]+geez[m]+salis[i];
            ትእዛዝ=prefix[15]+rabie[j]+geez[m]+salis[i];
             ምክንያታዊ=prefix[7]+rabie[j]+geez[m]+salis[i];
               ቦዝ="ተ"+ste.substring(0,2)+geez[i]+SMS[3];
                አርእስት="ተ"+rabie[j]+salis[m]+sabie[i]+"ት"+SMS[3];
         }} 
         }}  }}
         }
         break;
         case "ተጋብሮ/reciprocal/":{
             for(int j=0;j<geez.length;j++){
      if( ste.substring(0,1).equals(geez[j])){
      for(int i=0;i<sadis.length;i++){
      if( ste.substring(1,2).equals(salis[i])){
           for(int m=0;m<geez.length;m++){
         if( ste.substring(2,3).equals(sadis[m])){
          ገቢር="ተ"+rabie[j]+geez[i]+ste.substring(2,3)+OMS[2];
          ምክንያታዊ=ትንቢት=prefix[7]+rabie[j]+geez[i]+salis[m];
           ቦዝ="ተ"+rabie[j]+ste.substring(1, 2)+geez[m]+SMS[3];
           አርእስት="ተ"+rabie[j]+sadis[i]+sabie[m]+"ት"+SMS[3];
           
           }}}}}}
             for(int m=0;m<geez.length;m++){
         if( ገቢር.substring(4,5).equals(salis[m])){
           ሊተ=ገቢር.substring(0,4)+sadis[m]+OMS[22];
            ለነ=ገቢር.substring(0,4)+sadis[m]+OMS[23];
            ለከ="";
            ለክሙ="";                
            ለኪ="";  
            ለክን="";
            ሎቱ=ገቢር+OMS[8];
            ሎሙ=ገቢር+OMS[13];
            ላቲ=ገቢር+OMS[17];
            ሎን=ገቢር+OMS[21];    
         }}
               for(int i=0;i<geez.length;i++){
         if( ste.substring(2,3).equals(sadis[i])){
             ሊተ_ት=ትንቢት.substring(0,4)+sadis[i]+OMS[22];
             ለነ_ት=ትንቢት.substring(0,4)+sadis[i]+OMS[23];
             ለከ_ት="";
             ለክሙ_ት=  "" ;         
             ለኪ_ት="";  
             ለክን_ት="";
             ሎቱ_ት=ትንቢት+OMS[8];
             ሎሙ_ት=ትንቢት+OMS[13];
             ላቲ_ት=ትንቢት+OMS[17];
             ሎን_ት=ትንቢት+OMS[21];    
             ትእዛዝ=ገቢር.substring(0,3)+salis[i];
             ሊተ_ትእ=ትእዛዝ.substring(0,3)+sadis[i]+OMS[22];
             ለነ_ትእ=ትእዛዝ.substring(0,3)+sadis[i]+OMS[23];
             ለከ_ትእ="";
             ለክሙ_ትእ=  "" ;         
             ለኪ_ትእ="";  
             ለክን_ትእ="";
            ሎቱ_ትእ=ትእዛዝ+OMS[8];
             ሎሙ_ትእ=ትእዛዝ+OMS[13];
             ላቲ_ትእ=ትእዛዝ+OMS[17];
             ሎን_ትእ=ትእዛዝ+OMS[21];   
            
                 ሊተ_ም=ትንቢት.substring(0,4)+sadis[i]+OMS[22];
             ለነ_ም=ትንቢት.substring(0,4)+sadis[i]+OMS[23];
             ለከ_ም="";
             ለክሙ_ም=  "" ;         
             ለኪ_ም="";  
             ለክን_ም="";
             ሎቱ_ም=ትንቢት+OMS[8];
             ሎሙ_ም=ትንቢት+OMS[13];
             ላቲ_ም=ትንቢት+OMS[17];
             ሎን_ም=ትንቢት+OMS[21];   
               }}}
         break;
   }}
          break;
   case "አንትሙ/You(2ppm)/":{
       switch(stemType)
   {
        case "ገቢር/perfective/":{
            for(int j=0;j<sadis.length;j++){
      if( ste.substring(0,1).equals(geez[j])){
           for(int i=0;i<sadis.length;i++){
      if( ste.substring(1,2).equals(salis[i])){
          for(int m=0;m<geez.length;m++){
            if( ste.substring(2,3).equals(sadis[m])){
          ገቢር=sabie[j]+ste.substring(2,3)+SMS[4];
          ትንቢት="ት"+ste.substring(0,1)+sadis[i]+kaeb[m];
           ትእዛዝ=kaeb[j]+kaeb[m];
            ቦዝ=ste.substring(0,2)+geez[m]+SMS[4];
             አርእስት=ste.substring(0,2)+sabie[m]+"ት"+SMS[4];
               ሳቢዘር=kaeb[j]+geez[m]+"ት"+SMS[4];
      }}}}}}
          for(int m=0;m<kaeb.length;m++){
            if( ገቢር.substring(3,4).equals(kaeb[m])){
             ሊተ=ገቢር+OMS[22];
            ለነ=ገቢር+OMS[23];
            ለከ="-";
            ለክሙ="-";                
            ለኪ="-";  
            ለክን="-";
            ሎቱ=ገቢር.substring(0,3)+sadis[m]+OMS[7];
            ሎሙ=ገቢር.substring(0,3)+sadis[m]+OMS[9];
            ላቲ=ገቢር.substring(0,3)+sadis[m]+OMS[14];
            ሎን=ገቢር.substring(0,3)+sadis[m]+OMS[18]; 
                    } }
        for(int i=0;i<geez.length;i++){
            if( ste.substring(2,3).equals(sadis[i])){
            ሊተ_ት=ትንቢት+OMS[22];
            ለነ_ት=ትንቢት+OMS[23];
            ለከ_ት="-";
            ለክሙ_ት="-";                
            ለኪ_ት="-";  
            ለክን_ት="-";
            ሎቱ_ት=ትንቢት.substring(0,3)+sadis[i]+OMS[7];
            ሎሙ_ት=ትንቢት.substring(0,3)+sadis[i]+OMS[9];
            ላቲ_ት=ትንቢት.substring(0,3)+sadis[i]+OMS[14];
            ሎን_ት=ትንቢት.substring(0,3)+sadis[i]+OMS[18]; 
             
             ሊተ_ትእ=ትእዛዝ+OMS[22];
             ለነ_ትእ=ትእዛዝ+OMS[23];
             ለከ_ትእ="";
             ለክሙ_ትእ= "" ;         
             ለኪ_ትእ="";  
             ለክን_ትእ="";
             ሎቱ_ትእ=ትእዛዝ.substring(0,1)+sadis[i]+OMS[7];
             ሎሙ_ትእ=ትእዛዝ.substring(0,1)+sadis[i]+OMS[9];
             ላቲ_ትእ=ትእዛዝ.substring(0,1)+sadis[i]+OMS[14];
             ሎን_ትእ=ትእዛዝ.substring(0,1)+sadis[i]+OMS[18]; 
             ምክንያታዊ="ት"+ትእዛዝ;
               ሊተ_ም=ምክንያታዊ+OMS[22];
             ለነ_ም=ምክንያታዊ+OMS[23];
             ለከ_ም="";
             ለክሙ_ም= "" ;         
             ለኪ_ም="";  
             ለክን_ም="";
             ሎቱ_ም=ምክንያታዊ.substring(0,2)+sadis[i]+OMS[7];
            ሎሙ_ም=ምክንያታዊ.substring(0,2)+sadis[i]+OMS[9];
            ላቲ_ም=ምክንያታዊ.substring(0,2)+sadis[i]+OMS[14];
            ሎን_ም=ምክንያታዊ.substring(0,2)+sadis[i]+OMS[18]; 
                    } 
         }  
        }
        break;
        case "አግብሮ/causative/":{
             for(int j=0;j<sadis.length;j++){
      if( ste.substring(0,1).equals(geez[j])){
            for(int i=0;i<sadis.length;i++){
      if( ste.substring(2,3).equals(sadis[i])){
             for(int m=0;m<sadis.length;m++){
      if( ste.substring(1,2).equals(salis[m])){  
          ገቢር="አ"+sabie[j]+sadis[i]+SMS[4];
          ትንቢት="ታ"+ste.substring(0,1)+sadis[m]+kaeb[i];
          ትእዛዝ="ታ"+kaeb[j]+kaeb[i];
           ቦዝ="አ"+sadis[j]+ste.substring(1,2)+geez[i]+SMS[4];
            አርእስት1=ቦዝ.substring(0,1)+kaeb[j]+sabie[i]+"ት"+SMS[4];
          }}}}}}
          for(int m=0;m<kaeb.length;m++){
            if( ገቢር.substring(4,5).equals(kaeb[m])){
            ሊተ=ገቢር+OMS[22];
            ለነ=ገቢር+OMS[23];
            ለከ="";
            ለክሙ="";                
            ለኪ="";  
            ለክን="";
            ሎቱ=ገቢር.substring(0,4)+sadis[m]+OMS[7];
            ሎሙ=ገቢር.substring(0,4)+sadis[m]+OMS[9];
            ላቲ=ገቢር.substring(0,4)+sadis[m]+OMS[14];
            ሎን=ገቢር.substring(0,4)+sadis[m]+OMS[18];        
       }}
          for(int i=0;i<sadis.length;i++){
               if( ste.substring(2,3).equals(sadis[i])){
             ሊተ_ት=ትንቢት+OMS[22];
             ለነ_ት=ትንቢት+OMS[23];
             ለከ_ት="";
             ለክሙ_ት="" ;         
             ለኪ_ት="";  
             ለክን_ት="";
             ሎቱ_ት=ትንቢት.substring(0,3)+sadis[i]+OMS[7];
             ሎሙ_ት=ትንቢት.substring(0,3)+sadis[i]+OMS[9];
             ላቲ_ት=ትንቢት.substring(0,3)+sadis[i]+OMS[14];
             ሎን_ት=ትንቢት.substring(0,3)+sadis[i]+OMS[18];
             
             ሊተ_ትእ=ትእዛዝ+OMS[22];
             ለነ_ትእ=ትእዛዝ+OMS[23];
             ለከ_ትእ="";
             ለክሙ_ትእ=  "";         
             ለኪ_ትእ="";  
             ለክን_ትእ="" ;
             ሎቱ_ትእ=ትእዛዝ.substring(0,2)+sadis[i]+OMS[7];
             ሎሙ_ትእ=ትእዛዝ.substring(0,2)+sadis[i]+OMS[9];
             ላቲ_ትእ=ትእዛዝ.substring(0,2)+sadis[i]+OMS[14];
             ሎን_ትእ=ትእዛዝ.substring(0,2)+sadis[i]+OMS[18];
             //     
             ምክንያታዊ=ትእዛዝ;
             ሊተ_ም=ትእዛዝ+OMS[22];
             ለነ_ም=ትእዛዝ+OMS[23];
             ለከ_ም="";
             ለክሙ_ም=  "";         
             ለኪ_ም="";  
             ለክን_ም="" ;
             ሎቱ_ም=ምክንያታዊ.substring(0,2)+sadis[i]+OMS[7];
             ሎሙ_ም=ምክንያታዊ.substring(0,2)+sadis[i]+OMS[9];
             ላቲ_ም=ምክንያታዊ.substring(0,3)+sadis[i]+OMS[14];
             ሎን_ም=ምክንያታዊ.substring(0,3)+sadis[i]+OMS[18];
                    }
       }
        }     
        break;
         case "አስተጋብሮ/causative-reciprocal/":{
                  for(int j=0;j<sadis.length;j++){
      if( ste.substring(0,1).equals(geez[j])){
           
             for(int m=0;m<sadis.length;m++){
      if( ste.substring(1,2).equals(salis[m])){
           for(int i=0;i<sadis.length;i++){
            if( ste.substring(2,3).equals(sadis[i])){
          ገቢር="አስተ"+rabie[j]+geez[m]+sadis[i]+SMS[4];
         ምክንያታዊ=ትእዛዝ= ትንቢት="ታስተ"+rabie[j]+sadis[m]+kaeb[i];
          ቦዝ=ገቢር.substring(0, 5)+sadis[i]+SMS[4];
          አርእስት=ገቢር.substring(0, 4)+ste.substring(1, 2)+sabie[i]+"ት"+SMS[4];
          }}}}}} 
              for(int m=0;m<kaeb.length;m++){
      if( ገቢር.substring(7,8).equals(kaeb[m])){
            ሊተ=ገቢር+OMS[22];
            ለነ=ገቢር+OMS[23];
            ለከ="";
            ለክሙ="";                
            ለኪ="";  
            ለክን="";
            ሎቱ=ገቢር.substring(0,7)+sadis[m]+OMS[7];
            ሎሙ=ገቢር.substring(0,7)+sadis[m]+OMS[9];
            ላቲ=ገቢር.substring(0,7)+sadis[m]+OMS[14];
            ሎን=ገቢር.substring(0,7)+sadis[m]+OMS[18]; 
                    } 
       }
          for(int i=0;i<sadis.length;i++){
               if( ste.substring(2,3).equals(sadis[i])){
             ሊተ_ት=ትንቢት+OMS[22];
             ለነ_ት=ትንቢት+OMS[23];
             ለከ_ት="";
             ለክሙ_ት= "" ;         
             ለኪ_ት="";  
             ለክን_ት="";
             ሎቱ_ት=ትንቢት.substring(0,5)+sadis[i]+OMS[7];
            ሎሙ_ት=ትንቢት.substring(0,5)+sadis[i]+OMS[9];
            ላቲ_ት=ትንቢት.substring(0,5)+sadis[i]+OMS[14];
            ሎን_ት=ትንቢት.substring(0,5)+sadis[i]+OMS[18];     
             ሊተ_ትእ=ትእዛዝ+OMS[22];
             ለነ_ትእ=ትእዛዝ.substring(0,5)+sadis[i]+OMS[23];
             ለከ_ትእ="";
             ለክሙ_ትእ=  "" ;         
             ለኪ_ትእ="";  
             ለክን_ትእ="";
            ሎቱ_ትእ=ትእዛዝ.substring(0,5)+sadis[i]+OMS[7];
            ሎሙ_ትእ=ትእዛዝ.substring(0,5)+sadis[i]+OMS[9];
            ላቲ_ትእ=ትእዛዝ.substring(0,5)+sadis[i]+OMS[14];
            ሎን_ትእ=ትእዛዝ.substring(0,5)+sadis[i]+OMS[18];  
             //
             ሊተ_ም=ምክንያታዊ+OMS[22];
             ለነ_ም=ምክንያታዊ+OMS[23];
             ለከ_ም="";
             ለክሙ_ም=  "" ;         
             ለኪ_ም="";  
             ለክን_ም="";
             ሎቱ_ም=ምክንያታዊ.substring(0,5)+sadis[i]+OMS[7];
             ሎሙ_ም=ምክንያታዊ.substring(0,5)+sadis[i]+OMS[9];
             ላቲ_ም=ምክንያታዊ.substring(0,5)+sadis[i]+OMS[14];
             ሎን_ም=ምክንያታዊ.substring(0,5)+sadis[i]+OMS[18];  
               }}
        }
         break;
         case "ተገብሮ/reflexive/":{
             for(int j=0;j<salis.length;j++){
         if( ste.substring(0,1).equals(geez[j])){
          for(int m=0;m<salis.length;m++){
         if( ste.substring(1,2).equals(salis[m])){
         for(int i=0;i<geez.length;i++){
         if( ste.substring(2,3).equals(sadis[i])){
           ገቢር=prefix[15]+ste.substring(0,1)+geez[m]+sadis[i]+SMS[4];
           ትንቢት=prefix[7]+rabie[j]+geez[m]+kaeb[i];
            ትእዛዝ=prefix[15]+rabie[j]+geez[m]+kaeb[i];
             ምክንያታዊ=prefix[7]+rabie[j]+geez[m]+kaeb[i];
               ቦዝ="ተ"+ste.substring(0,2)+geez[i]+SMS[4];
                አርእስት="ተ"+rabie[j]+salis[m]+sabie[i]+"ት"+SMS[4];
         }} 
         }}  }}
         }
         break;
         case "ተጋብሮ/reciprocal/":{
             for(int j=0;j<geez.length;j++){
      if( ste.substring(0,1).equals(geez[j])){
      for(int i=0;i<sadis.length;i++){
      if( ste.substring(1,2).equals(salis[i])){
           for(int m=0;m<geez.length;m++){
         if( ste.substring(2,3).equals(sadis[m])){
          ገቢር="ተ"+rabie[j]+geez[i]+ste.substring(2,3)+SMS[4];
          ምክንያታዊ=ትንቢት=prefix[7]+rabie[j]+geez[i]+kaeb[m];
           ቦዝ="ተ"+rabie[j]+ste.substring(1, 2)+geez[m]+SMS[4];
           አርእስት="ተ"+rabie[j]+sadis[i]+sabie[m]+"ት"+SMS[4];
           
           }}}}}}
             for(int m=0;m<kaeb.length;m++){
         if( ገቢር.substring(5,6).equals(kaeb[m])){
           ሊተ=ገቢር+OMS[22];
            ለነ=ገቢር+OMS[23];
            ለከ="";
            ለክሙ="";                
            ለኪ="";  
            ለክን="";
            ሎቱ=ገቢር.substring(0,5)+sadis[m]+OMS[7];
            ሎሙ=ገቢር.substring(0,5)+sadis[m]+OMS[9];
            ላቲ=ገቢር.substring(0,5)+sadis[m]+OMS[14];
            ሎን=ገቢር.substring(0,5)+sadis[m]+OMS[18];    
         }}
               for(int i=0;i<geez.length;i++){
         if( ste.substring(2,3).equals(sadis[i])){
             ሊተ_ት=ትንቢት+OMS[22];
             ለነ_ት=ትንቢት+OMS[23];
             ለከ_ት="";
             ለክሙ_ት=  "" ;         
             ለኪ_ት="";  
             ለክን_ት="";
             ሎቱ_ት=ትንቢት.substring(0,4)+sadis[i]+OMS[7];
             ሎሙ_ት=ትንቢት.substring(0,4)+sadis[i]+OMS[9];
             ላቲ_ት=ትንቢት.substring(0,4)+sadis[i]+OMS[14];
             ሎን_ት=ትንቢት.substring(0,4)+sadis[i]+OMS[18];    
             ትእዛዝ=ገቢር.substring(0,3)+kaeb[i];
             ሊተ_ትእ=ትእዛዝ+OMS[22];
             ለነ_ትእ=ትእዛዝ+OMS[23];
             ለከ_ትእ="";
             ለክሙ_ትእ=  "" ;         
             ለኪ_ትእ="";  
             ለክን_ትእ="";
            ሎቱ_ትእ=ትእዛዝ.substring(0,3)+sadis[i]+OMS[7];
             ሎሙ_ትእ=ትእዛዝ.substring(0,3)+sadis[i]+OMS[9];
             ላቲ_ትእ=ትእዛዝ.substring(0,3)+sadis[i]+OMS[14];
             ሎን_ትእ=ትእዛዝ.substring(0,3)+sadis[i]+OMS[18];   
            
             ሊተ_ም=ትንቢት+OMS[22];
             ለነ_ም=ትንቢት+OMS[23];
             ለከ_ም="";
             ለክሙ_ም=  "" ;         
             ለኪ_ም="";  
             ለክን_ም="";
             ሎቱ_ም=ትንቢት.substring(0,4)+sadis[i]+OMS[7];
             ሎሙ_ም=ትንቢት.substring(0,4)+sadis[i]+OMS[9];
             ላቲ_ም=ትንቢት.substring(0,4)+sadis[i]+OMS[14];
             ሎን_ም=ትንቢት.substring(0,4)+sadis[i]+OMS[18];   
               }}}
         }}break;
     
   }}}
     public void createStem3(String stem,String stemType,String person)
{
    String ste=stem;
    //how to handle verb form that have የ in center 
    //System.out.println("ሐላፊ አንቀጽ:"+stem);
 if(stem.contains("ዊ")&&!stem.endsWith("ው")){
          for(int i=0;i<salis.length;i++){
    if( ste.substring(0,1).equals(geez[i])){
   for(int j=0;j<salis.length;j++){
     if( ste.substring(1,2).equals(salis[j])){
          for(int m=0;m<salis.length;m++){
     if( ste.substring(2,3).equals(sadis[m])){
         ሓላፊ=sabie[i]+geez[m];
    }}}}}}
   switch(person)
   {
       case "አንትን/You(2ppf)/":{
       switch(stemType)
   {
        case "ገቢር/perfective/":{
            for(int j=0;j<sadis.length;j++){
      if( ste.substring(0,1).equals(geez[j])){
           for(int i=0;i<sadis.length;i++){
      if( ste.substring(1,2).equals(salis[i])){
          for(int m=0;m<geez.length;m++){
            if( ste.substring(2,3).equals(sadis[m])){
          ገቢር=sabie[j]+ste.substring(2,3)+SMS[5];
          ትንቢት="ት"+ste.substring(0,1)+sadis[i]+rabie[m];
           ትእዛዝ=kaeb[j]+rabie[m];
            ቦዝ=ste.substring(0,2)+geez[m]+SMS[5];
             አርእስት=ste.substring(0,2)+sabie[m]+"ት"+SMS[5];
               ሳቢዘር=kaeb[j]+geez[m]+"ት"+SMS[5];
      }}}}}}
          for(int m=0;m<sadis.length;m++){
            if( ገቢር.substring(3,4).equals(sadis[m])){
             ሊተ=ገቢር.substring(0,3)+rabie[m]+OMS[22];
            ለነ=ገቢር.substring(0,3)+rabie[m]+OMS[23];
            ለከ="-";
            ለክሙ="-";                
            ለኪ="-";  
            ለክን="-";
            ሎቱ=ገቢር.substring(0,3)+rabie[m]+OMS[5];
            ሎሙ=ገቢር.substring(0,3)+rabie[m]+OMS[12];
            ላቲ=ገቢር.substring(0,3)+rabie[m]+OMS[4];
            ሎን=ገቢር.substring(0,3)+rabie[m]+OMS[19]; 
                    } }
        for(int i=0;i<geez.length;i++){
            if( ste.substring(2,3).equals(sadis[i])){
            ሊተ_ት=ትንቢት+OMS[22];
            ለነ_ት=ትንቢት+OMS[23];
            ለከ_ት="-";
            ለክሙ_ት="-";                
            ለኪ_ት="-";  
            ለክን_ት="-";
            ሎቱ_ት=ትንቢት+OMS[5];
            ሎሙ_ት=ትንቢት+OMS[12];
            ላቲ_ት=ትንቢት+OMS[4];
            ሎን_ት=ትንቢት+OMS[19]; 
             
             ሊተ_ትእ=ትእዛዝ+OMS[22];
             ለነ_ትእ=ትእዛዝ+OMS[23];
             ለከ_ትእ="";
             ለክሙ_ትእ= "" ;         
             ለኪ_ትእ="";  
             ለክን_ትእ="";
             ሎቱ_ትእ=ትእዛዝ+OMS[5];
             ሎሙ_ትእ=ትእዛዝ+OMS[12];
             ላቲ_ትእ=ትእዛዝ+OMS[4];
             ሎን_ትእ=ትእዛዝ+OMS[19]; 
             ምክንያታዊ="ት"+ትእዛዝ;
               ሊተ_ም=ምክንያታዊ+OMS[22];
             ለነ_ም=ምክንያታዊ+OMS[23];
             ለከ_ም="";
             ለክሙ_ም= "" ;         
             ለኪ_ም="";  
             ለክን_ም="";
             ሎቱ_ም=ምክንያታዊ+OMS[5];
            ሎሙ_ም=ምክንያታዊ+OMS[12];
            ላቲ_ም=ምክንያታዊ+OMS[4];
            ሎን_ም=ምክንያታዊ+OMS[19]; 
                    } 
         }  
        }
        break;
        case "አግብሮ/causative/":{
             for(int j=0;j<sadis.length;j++){
      if( ste.substring(0,1).equals(geez[j])){
            for(int i=0;i<sadis.length;i++){
      if( ste.substring(2,3).equals(sadis[i])){
             for(int m=0;m<sadis.length;m++){
      if( ste.substring(1,2).equals(salis[m])){  
          ገቢር="አ"+sabie[j]+sadis[i]+SMS[5];
          ትንቢት="ታ"+ste.substring(0,1)+sadis[m]+rabie[i];
          ትእዛዝ="ታ"+kaeb[j]+rabie[i];
           ቦዝ="አ"+sadis[j]+ste.substring(1,2)+geez[i]+SMS[5];
            አርእስት1=ቦዝ.substring(0,1)+kaeb[j]+sabie[i]+"ት"+SMS[5];
          }}}}}}
          for(int m=0;m<kaeb.length;m++){
            if( ገቢር.substring(4,5).equals(sadis[m])){
            ሊተ=ገቢር.substring(0,3)+rabie[m]+OMS[22];
            ለነ=ገቢር.substring(0,3)+rabie[m]+OMS[23];
            ለከ="";
            ለክሙ="";                
            ለኪ="";  
            ለክን="";
            ሎቱ=ገቢር.substring(0,4)+rabie[m]+OMS[5];
            ሎሙ=ገቢር.substring(0,4)+rabie[m]+OMS[12];
            ላቲ=ገቢር.substring(0,4)+rabie[m]+OMS[4];
            ሎን=ገቢር.substring(0,4)+rabie[m]+OMS[19];        
       }}
          for(int i=0;i<sadis.length;i++){
               if( ste.substring(2,3).equals(sadis[i])){
             ሊተ_ት=ትንቢት+OMS[22];
             ለነ_ት=ትንቢት+OMS[23];
             ለከ_ት="";
             ለክሙ_ት="" ;         
             ለኪ_ት="";  
             ለክን_ት="";
             ሎቱ_ት=ትንቢት+OMS[5];
             ሎሙ_ት=ትንቢት+OMS[12];
             ላቲ_ት=ትንቢት+OMS[4];
             ሎን_ት=ትንቢት+OMS[19];
             
             ሊተ_ትእ=ትእዛዝ+OMS[22];
             ለነ_ትእ=ትእዛዝ+OMS[23];
             ለከ_ትእ="";
             ለክሙ_ትእ=  "";         
             ለኪ_ትእ="";  
             ለክን_ትእ="" ;
             ሎቱ_ትእ=ትእዛዝ+OMS[5];
             ሎሙ_ትእ=ትእዛዝ+OMS[12];
             ላቲ_ትእ=ትእዛዝ+OMS[4];
             ሎን_ትእ=ትእዛዝ+OMS[19];
             //     
             ምክንያታዊ=ትእዛዝ;
             ሊተ_ም=ትእዛዝ+OMS[22];
             ለነ_ም=ትእዛዝ+OMS[23];
             ለከ_ም="";
             ለክሙ_ም=  "";         
             ለኪ_ም="";  
             ለክን_ም="" ;
             ሎቱ_ም=ምክንያታዊ+OMS[5];
             ሎሙ_ም=ምክንያታዊ+OMS[12];
             ላቲ_ም=ምክንያታዊ+OMS[4];
             ሎን_ም=ምክንያታዊ+OMS[19];
                    }
       }
        }     
        break;
         case "አስተጋብሮ/causative-reciprocal/":{
                  for(int j=0;j<sadis.length;j++){
      if( ste.substring(0,1).equals(geez[j])){
           
             for(int m=0;m<sadis.length;m++){
      if( ste.substring(1,2).equals(salis[m])){
           for(int i=0;i<sadis.length;i++){
            if( ste.substring(2,3).equals(sadis[i])){
          ገቢር="አስተ"+rabie[j]+geez[m]+sadis[i]+SMS[5];
         ምክንያታዊ=ትእዛዝ= ትንቢት="ታስተ"+rabie[j]+sadis[m]+rabie[i];
          ቦዝ=ገቢር.substring(0, 4)+salis[m]+geez[i]+SMS[5];
          አርእስት=ገቢር.substring(0, 4)+ste.substring(1, 2)+sabie[i]+"ት"+SMS[5];
          }}}}}} 
              for(int m=0;m<sadis.length;m++){
      if( ገቢር.substring(7,8).equals(sadis[m])){
            ሊተ=ገቢር.substring(0,7)+rabie[m]+OMS[22];
            ለነ=ገቢር.substring(0,7)+rabie[m]+OMS[23];
            ለከ="";
            ለክሙ="";                
            ለኪ="";  
            ለክን="";
            ሎቱ=ገቢር.substring(0,7)+rabie[m]+OMS[5];
            ሎሙ=ገቢር.substring(0,7)+rabie[m]+OMS[12];
            ላቲ=ገቢር.substring(0,7)+rabie[m]+OMS[4];
            ሎን=ገቢር.substring(0,7)+rabie[m]+OMS[19]; 
                    } 
       }
          for(int i=0;i<sadis.length;i++){
               if( ste.substring(2,3).equals(sadis[i])){
             ሊተ_ት=ትንቢት+OMS[22];
             ለነ_ት=ትንቢት+OMS[23];
             ለከ_ት="";
             ለክሙ_ት= "" ;         
             ለኪ_ት="";  
             ለክን_ት="";
             ሎቱ_ት=ትንቢት+OMS[5];
            ሎሙ_ት=ትንቢት+OMS[12];
            ላቲ_ት=ትንቢት+OMS[4];
            ሎን_ት=ትንቢት+OMS[19];     
             ሊተ_ትእ=ትእዛዝ.substring(0,5)+rabie[i]+OMS[22];
             ለነ_ትእ=ትእዛዝ.substring(0,5)+rabie[i]+OMS[23];
             ለከ_ትእ="";
             ለክሙ_ትእ=  "" ;         
             ለኪ_ትእ="";  
             ለክን_ትእ="";
            ሎቱ_ትእ=ትእዛዝ.substring(0,5)+rabie[i]+OMS[5];
            ሎሙ_ትእ=ትእዛዝ.substring(0,5)+rabie[i]+OMS[12];
            ላቲ_ትእ=ትእዛዝ.substring(0,5)+rabie[i]+OMS[4];
            ሎን_ትእ=ትእዛዝ.substring(0,5)+rabie[i]+OMS[19];  
             //
             ሊተ_ም=ምክንያታዊ+OMS[22];
             ለነ_ም=ምክንያታዊ+OMS[23];
             ለከ_ም="";
             ለክሙ_ም=  "" ;         
             ለኪ_ም="";  
             ለክን_ም="";
             ሎቱ_ም=ምክንያታዊ.substring(0,5)+rabie[i]+OMS[5];
             ሎሙ_ም=ምክንያታዊ.substring(0,5)+rabie[i]+OMS[12];
             ላቲ_ም=ምክንያታዊ.substring(0,5)+rabie[i]+OMS[4];
             ሎን_ም=ምክንያታዊ.substring(0,5)+rabie[i]+OMS[19];  
               }}
        }
         break;
         case "ተገብሮ/reflexive/":{
             for(int j=0;j<salis.length;j++){
         if( ste.substring(0,1).equals(geez[j])){
          for(int m=0;m<salis.length;m++){
         if( ste.substring(1,2).equals(salis[m])){
         for(int i=0;i<geez.length;i++){
         if( ste.substring(2,3).equals(sadis[i])){
           ገቢር=prefix[15]+ste.substring(0,1)+geez[m]+sadis[i]+SMS[5];
           ትንቢት=prefix[7]+rabie[j]+geez[m]+rabie[i];
            ትእዛዝ=prefix[15]+rabie[j]+geez[m]+rabie[i];
             ምክንያታዊ=prefix[7]+rabie[j]+geez[m]+rabie[i];
               ቦዝ="ተ"+ste.substring(0,2)+geez[i]+SMS[5];
                አርእስት="ተ"+rabie[j]+salis[m]+sabie[i]+"ት"+SMS[5];
         }} 
         }}  }}
         }
         break;
         case "ተጋብሮ/reciprocal/":{
             for(int j=0;j<geez.length;j++){
      if( ste.substring(0,1).equals(geez[j])){
      for(int i=0;i<sadis.length;i++){
      if( ste.substring(1,2).equals(salis[i])){
           for(int m=0;m<geez.length;m++){
         if( ste.substring(2,3).equals(sadis[m])){
          ገቢር="ተ"+rabie[j]+geez[i]+ste.substring(2,3)+SMS[5];
          ምክንያታዊ=ትንቢት=prefix[7]+rabie[j]+geez[i]+rabie[m];
           ቦዝ="ተ"+rabie[j]+ste.substring(1, 2)+geez[m]+SMS[5];
           አርእስት="ተ"+rabie[j]+sadis[i]+sabie[m]+"ት"+SMS[5];
           
           }}}}}}
             for(int m=0;m<kaeb.length;m++){
         if( ገቢር.substring(5,6).equals(sadis[m])){
           ሊተ=ገቢር.substring(0,5)+rabie[m]+OMS[22];
            ለነ=ገቢር.substring(0,5)+rabie[m]+OMS[23];
            ለከ="";
            ለክሙ="";                
            ለኪ="";  
            ለክን="";
            ሎቱ=ገቢር.substring(0,5)+rabie[m]+OMS[5];
            ሎሙ=ገቢር.substring(0,5)+rabie[m]+OMS[12];
            ላቲ=ገቢር.substring(0,5)+rabie[m]+OMS[4];
            ሎን=ገቢር.substring(0,5)+rabie[m]+OMS[19];    
         }}
               for(int i=0;i<geez.length;i++){
         if( ste.substring(2,3).equals(sadis[i])){
             ሊተ_ት=ትንቢት+OMS[22];
             ለነ_ት=ትንቢት+OMS[23];
             ለከ_ት="";
             ለክሙ_ት=  "" ;         
             ለኪ_ት="";  
             ለክን_ት="";
             ሎቱ_ት=ትንቢት+OMS[5];
             ሎሙ_ት=ትንቢት+OMS[12];
             ላቲ_ት=ትንቢት+OMS[4];
             ሎን_ት=ትንቢት+OMS[19];    
             ትእዛዝ=ገቢር.substring(0,3)+rabie[i];
             ሊተ_ትእ=ትእዛዝ+OMS[22];
             ለነ_ትእ=ትእዛዝ+OMS[23];
             ለከ_ትእ="";
             ለክሙ_ትእ=  "" ;         
             ለኪ_ትእ="";  
             ለክን_ትእ="";
            ሎቱ_ትእ=ትእዛዝ+OMS[5];
             ሎሙ_ትእ=ትእዛዝ+OMS[12];
             ላቲ_ትእ=ትእዛዝ+OMS[4];
             ሎን_ትእ=ትእዛዝ+OMS[19];   
            
             ሊተ_ም=ትንቢት+OMS[22];
             ለነ_ም=ትንቢት+OMS[23];
             ለከ_ም="";
             ለክሙ_ም=  "" ;         
             ለኪ_ም="";  
             ለክን_ም="";
             ሎቱ_ም=ትንቢት+OMS[5];
             ሎሙ_ም=ትንቢት+OMS[12];
             ላቲ_ም=ትንቢት+OMS[4];
             ሎን_ም=ትንቢት+OMS[19];   
               }}}
         }}break;
         case "አነ/I/":{
       switch(stemType)
   {
        case "ገቢር/perfective/":{
      for(int j=0;j<geez.length;j++){
      if( ste.substring(0,1).equals(geez[j])){
      for(int i=0;i<sadis.length;i++){
      if( ste.substring(1,2).equals(salis[i])){
           for(int m=0;m<geez.length;m++){
         if( ste.substring(2,3).equals(sadis[m])){
         ገቢር=ሓላፊ.substring(0,1)+sadis[m]+SMS[0];
          ምክንያታዊ=ትንቢት=prefix[7]+rabie[j]+geez[i]+rabie[m];
          ትንቢት=prefix[1]+ste.substring(0,1)+sadis[i]+sadis[m];
           ምክንያታዊ= ትእዛዝ=prefix[11]+kaeb[j]+sadis[m];
            አርእስት=geez[j]+ste.substring(1,2)+sabie[m]+'ት'+SMS[10];
           ቦዝ=geez[j]+ste.substring(1, 2)+sadis[m]+SMS[10];;
           }}}}}}
          for(int m=0;m<kaeb.length;m++){
            if( ገቢር.substring(2,3).equals(kaeb[m])){
            ሊተ="-";
            ለነ="-";
            ለከ=ገቢር+OMS[0];
            ለክሙ=ገቢር+OMS[1];                
            ለኪ=ገቢር+OMS[2];  
            ለክን=ገቢር+OMS[3];
            ሎቱ=ገቢር.substring(0,2)+sadis[m]+OMS[7];
            ሎሙ=ገቢር.substring(0,2)+sadis[m]+OMS[9];
            ላቲ=ገቢር.substring(0,2)+sadis[m]+OMS[14];
            ሎን=ገቢር.substring(0,2)+sadis[m]+OMS[18]; 
                    } }   
          for(int m=0;m<kaeb.length;m++){
            if( ste.substring(2,3).equals(sadis[m])){
            ሊተ_ት="-";
            ለነ_ት="-";
            ለከ_ት=ትንቢት.substring(0,3)+geez[m]+OMS[0];
            ለክሙ_ት=ትንቢት.substring(0,3)+geez[m]+OMS[1];            
            ለኪ_ት=ትንቢት.substring(0,3)+geez[m]+OMS[2];
            ለክን_ት=ትንቢት.substring(0,3)+geez[m]+OMS[3];
             ሎቱ_ት=ትንቢት.substring(0,3)+sabie[m];
            ሎሙ_ት=ትንቢት.substring(0,3)+sabie[m]+OMS[11];
            ላቲ_ት=ትንቢት.substring(0,3)+rabie[m];
            ሎን_ት=ትንቢት.substring(0,3)+sabie[m]+OMS[20];
            //
            ሊተ_ትእ=ሊተ_ም="-";
            ለነ_ትእ=ለነ_ም="-";
           ለከ_ትእ=  ለከ_ም=ምክንያታዊ+OMS[0];
           ለክሙ_ትእ= ለክሙ_ም=ምክንያታዊ+OMS[1];            
           ለክን_ትእ=ለኪ_ትእ= ለኪ_ም=ምክንያታዊ+OMS[2];
            ለክን_ም=ምክንያታዊ+OMS[3];
           ሎቱ_ትእ=   ሎቱ_ም=ምክንያታዊ.substring(0,2)+sabie[m];
           ሎሙ_ትእ= ሎሙ_ም=ምክንያታዊ.substring(0,2)+sabie[m]+OMS[11];
            ላቲ_ትእ=ላቲ_ም=ምክንያታዊ.substring(0,2)+rabie[m];
           ሎን_ትእ= ሎን_ም=ምክንያታዊ.substring(0,2)+sabie[m]+OMS[20];
                    }  }  
          }  
        break;
         case "አግብሮ/causative/":{
             for(int j=0;j<sadis.length;j++){
      if( ste.substring(0,1).equals(geez[j])){
            for(int m=0;m<sadis.length;m++){
      if( ste.substring(1,2).equals(salis[m])){  
             for(int i=0;i<sadis.length;i++){
      if( ste.substring(2,3).equals(sadis[i])){ 
            ገቢር=prefix[1]+sabie[j]+ste.substring(2,3)+SMS[0];
            ትንቢት=prefix[1]+ste.substring(0,1)+sadis[m]+sadis[i];
            ምክንያታዊ=ትእዛዝ=prefix[1]+kaeb[j]+sadis[i];
             ቦዝ=ገቢር.substring(0,1)+sadis[j]+ste.substring(1,2)+sadis[i]+SMS[10];
            አርእስት1=prefix[1]+sadis[j]+salis[m]+sabie[i]+"ት"+SMS[10];
      }}
      }}}}
               for(int m=0;m<kaeb.length;m++){
            if( ገቢር.substring(3,4).equals(kaeb[m])){
            ሊተ="-";
            ለነ="-";
            ለከ=ገቢር+OMS[0];
            ለክሙ=ገቢር+OMS[1];                
            ለኪ=ገቢር+OMS[2];  
            ለክን=ገቢር+OMS[3];
            ሎቱ=ገቢር.substring(0,4)+sadis[m]+OMS[7];
            ሎሙ=ገቢር.substring(0,4)+sadis[m]+OMS[9];
            ላቲ=ገቢር.substring(0,4)+sadis[m]+OMS[14];
            ሎን=ገቢር.substring(0,4)+sadis[m]+OMS[18]; 
                    } }   
            for(int m=0;m<sadis.length;m++){
      if( ትንቢት.substring(3,4).equals(sadis[m])){
            ሊተ_ት="-";
            ለነ_ት="-";
            ለከ_ት=ትንቢት.substring(0,3)+geez[m]+OMS[0];
            ለክሙ_ት=ትንቢት.substring(0,3)+geez[m]+OMS[1];            
            ለኪ_ት=ትንቢት.substring(0,3)+geez[m]+OMS[2];
            ለክን_ት=ትንቢት.substring(0,3)+geez[m]+OMS[3];
             ሎቱ_ት=ትንቢት.substring(0,3)+sabie[m];
            ሎሙ_ት=ትንቢት.substring(0,3)+sabie[m]+OMS[11];
            ላቲ_ት=ትንቢት.substring(0,3)+rabie[m];
            ሎን_ት=ትንቢት.substring(0,3)+sabie[m]+OMS[20];
            //
            ሊተ_ትእ=ሊተ_ም="-";
            ለነ_ትእ=ለነ_ም="-";
            ለከ_ትእ=ለከ_ም=ትእዛዝ+OMS[0];
            ለክሙ_ትእ=ለክሙ_ም=ትእዛዝ+OMS[1];            
            ለኪ_ትእ= ለኪ_ም=ትእዛዝ+OMS[2];
            ለክን_ትእ=ለክን_ም=ትእዛዝ+OMS[3];
            ሎቱ_ትእ=ሎቱ_ም=ትእዛዝ.substring(0,2)+sabie[m];
            ሎሙ_ትእ= ሎሙ_ም=ትእዛዝ.substring(0,2)+sabie[m]+OMS[11];
            ላቲ_ትእ=ላቲ_ም=ትእዛዝ.substring(0,2)+rabie[m];
            ሎን_ትእ=ሎን_ም=ትእዛዝ.substring(0,2)+sabie[m]+OMS[20];
       }} }
        break;
         case "አስተጋብሮ/causative-reciprocal/":{
             for(int j=0;j<sadis.length;j++){
      if( ste.substring(0,1).equals(geez[j])){
           for(int m=0;m<salis.length;m++){
            if( ste.substring(1,2).equals(salis[m])){
                ገቢር=prefix[10]+rabie[j]+ሓላፊ.substring(1,2)+ste.substring(2,3)+SMS[0];
              ምክንያታዊ= ትእዛዝ=ትንቢት=prefix[10]+rabie[j]+sadis[m]+ste.substring(2,3);;
            }   }   
           
      }}
           ሊተ="-";
            ለነ="-";
            ለከ=ገቢር+OMS[0];
            ለክሙ=ገቢር+OMS[1];                
            ለኪ=ገቢር+OMS[2];  
            ለክን=ገቢር+OMS[3];
          for(int m=0;m<kaeb.length;m++){
            if( ገቢር.substring(6,7).equals(kaeb[m])){
            ሎቱ=ገቢር.substring(0,6)+sadis[m]+OMS[7];
            ሎሙ=ገቢር.substring(0,6)+sadis[m]+OMS[9];
            ላቲ=ገቢር.substring(0,6)+sadis[m]+OMS[14];
            ሎን=ገቢር.substring(0,6)+sadis[m]+OMS[18]; 
                    }  }
          //
          for(int m=0;m<sadis.length;m++){
            if( ገቢር.substring(5,6).equals(sadis[m])){
            ሊተ_ት="-";
            ለነ_ት="-";
            ለከ_ት=ትንቢት.substring(0,5)+geez[m]+OMS[0];
            ለክሙ_ት=ትንቢት.substring(0,5)+geez[m]+OMS[1];                
            ለኪ_ት=ትንቢት.substring(0,5)+geez[m]+OMS[2];  
            ለክን_ት=ትንቢት.substring(0,5)+geez[m]+OMS[3];
            ሎቱ_ት=ትንቢት.substring(0,5)+sabie[m];
            ሎሙ_ት=ትንቢት.substring(0,5)+sabie[m]+OMS[11];
            ላቲ_ት=ትንቢት.substring(0,5)+rabie[m];
            ሎን_ት=ትንቢት.substring(0,5)+sabie[m]+OMS[20]; 
            //
             ሊተ_ትእ="-";
            ለነ_ትእ="-";
            ለከ_ትእ=ትንቢት.substring(0,5)+geez[m]+OMS[0];
            ለክሙ_ትእ=ትንቢት.substring(0,5)+geez[m]+OMS[1];                
            ለኪ_ትእ=ትንቢት.substring(0,5)+geez[m]+OMS[2];  
            ለክን_ትእ=ትንቢት.substring(0,5)+geez[m]+OMS[3];
            ሎቱ_ትእ=ትንቢት.substring(0,5)+sabie[m];
            ሎሙ_ትእ=ትንቢት.substring(0,5)+sabie[m]+OMS[11];
            ላቲ_ትእ=ትንቢት.substring(0,5)+rabie[m];
            ሎን_ትእ=ትንቢት.substring(0,5)+sabie[m]+OMS[20]; 
            //
            ሊተ_ም="-";
            ለነ_ም="-";
            ለከ_ም=ትንቢት.substring(0,5)+geez[m]+OMS[0];
            ለክሙ_ም=ትንቢት.substring(0,5)+geez[m]+OMS[1];                
            ለኪ_ም=ትንቢት.substring(0,5)+geez[m]+OMS[2];  
            ለክን_ም=ትንቢት.substring(0,5)+geez[m]+OMS[3];
            ሎቱ_ም=ትንቢት.substring(0,5)+sabie[m];
            ሎሙ_ም=ትንቢት.substring(0,5)+sabie[m]+OMS[11];
            ላቲ_ም=ትንቢት.substring(0,5)+rabie[m];
            ሎን_ም=ትንቢት.substring(0,5)+sabie[m]+OMS[20]; 
                    }  }
                  for(int j=0;j<geez.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           ቦዝ=ገቢር.substring(0, 4)+ste.substring(1,2)+sadis[j]+SMS[10];
           ss=salis[j];
         }}
               for(int j=0;j<geez.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
           አርእስት=ገቢር.substring(0, 4)+sadis[j];
           ሳልስቅጽል=ገቢር.substring(0, 4)+rabie[j]+ss;
           ሳልስቅጽል1=ሳልስቅጽል.substring(0, 5)+ste.substring(2,3)+"ያኒሁ";
        ሳልስቅጽል2=ሳልስቅጽል.substring(0, 6)+"ቱ";
        ሳልስቅጽል3=ሳልስቅጽል.substring(0, 5)+ste.substring(2,3)+"ያቲሁ";
               }} 
               for(int j=0;j<salis.length;j++){
         if( ste.substring(2,3).equals(sadis[j])){
           አርእስት=አርእስት+sabie[j]+"ት"+SMS[10];
         }}
        }
         break;
         case "ተገብሮ/reflexive/":{
              for(int j=0;j<sadis.length;j++){
      if( ste.substring(0,1).equals(geez[j])){
            for(int m=0;m<sadis.length;m++){
      if( ste.substring(1,2).equals(salis[m])){  
             for(int i=0;i<sadis.length;i++){
      if( ste.substring(2,3).equals(sadis[i])){ 
          ገቢር=prefix[15]+ste.substring(0,1)+geez[m]+sadis[i]+SMS[0];
           ትእዛዝ=ምክንያታዊ=ትንቢት=prefix[13]+ste.substring(0,1)+geez[m]+sadis[i];
            ቦዝ="ተ"+rabie[j]+salis[m]+sadis[i]+SMS[10];
             አርእስት="ተ"+rabie[j]+salis[m]+sabie[i]+SMS[17];
      }}}}}}
         }
         break;
         case "ተጋብሮ/reciprocal/":{
             for(int j=0;j<sadis.length;j++){
      if( ste.substring(0,1).equals(geez[j])){
            for(int m=0;m<sadis.length;m++){
      if( ste.substring(1,2).equals(salis[m])){  
             for(int i=0;i<sadis.length;i++){
      if( ste.substring(2,3).equals(sadis[i])){ 
            ገቢር=prefix[15]+rabie[j]+geez[m]+sadis[i]+SMS[0];
            ትእዛዝ= ምክንያታዊ= ትንቢት=prefix[13]+rabie[j]+geez[m]+sadis[i]; 
            ቦዝ="ተ"+rabie[j]+salis[m]+sadis[i]+SMS[10];
             አርእስት="ተ"+rabie[j]+salis[m]+sabie[i]+SMS[17];
      }}}}}}
     for(int i=0;i<kaeb.length;i++){
      if( ገቢር.substring(4,5).equals(kaeb[i])){
            ሊተ="";
            ለነ="";
            ለከ=ገቢር+OMS[0];
            ለክሙ= ገቢር+OMS[1];               
            ለኪ=ገቢር+OMS[2]; 
            ለክን=ገቢር+OMS[3];
            ሎቱ=ገቢር.substring(0,4)+sadis[i]+OMS[7];
            ሎሙ=ገቢር.substring(0,4)+sadis[i]+OMS[9];
            ላቲ=ገቢር.substring(0,4)+sadis[i]+OMS[14];
            ሎን=ገቢር.substring(0,4)+sadis[i]+OMS[18];
      }}
     for(int i=0;i<kaeb.length;i++){
      if( ትንቢት.substring(4,5).equals(sadis[i])){
            //
            ሊተ_ት="";
            ለነ_ት="";
            ለከ_ት=ትንቢት.substring(0,4)+geez[i]+OMS[0];
            ለክሙ_ት= ትንቢት.substring(0,4)+geez[i]+OMS[1];               
            ለኪ_ት=ትንቢት.substring(0,4)+geez[i]+OMS[2]; 
            ለክን_ት=ትንቢት.substring(0,4)+geez[i]+OMS[3];
            ሎቱ_ት=ትንቢት.substring(0,4)+sabie[i];
            ሎሙ_ት=ትንቢት.substring(0,4)+sabie[i]+OMS[11];
            ላቲ_ት=ትንቢት.substring(0,4)+rabie[i];
            ሎን_ት=ትንቢት.substring(0,4)+sabie[i]+OMS[20];
            //
            ሊተ_ትእ="";
            ለነ_ትእ="";
            ለከ_ትእ=ትንቢት.substring(0,4)+geez[i]+OMS[0];
            ለክሙ_ትእ= ትንቢት.substring(0,4)+geez[i]+OMS[1];               
            ለኪ_ትእ=ትንቢት.substring(0,4)+geez[i]+OMS[2]; 
            ለክን_ትእ=ትንቢት.substring(0,4)+geez[i]+OMS[3];
            ሎቱ_ትእ=ትንቢት.substring(0,4)+sabie[i];
            ሎሙ_ትእ=ትንቢት.substring(0,4)+sabie[i]+OMS[11];
            ላቲ_ትእ=ትንቢት.substring(0,4)+rabie[i];
            ሎን_ትእ=ትንቢት.substring(0,4)+sabie[i]+OMS[20];
            //
            ሊተ_ም="";
            ለነ_ም="";
            ለከ_ም=ትንቢት.substring(0,4)+geez[i]+OMS[0];
            ለክሙ_ም= ትንቢት.substring(0,4)+geez[i]+OMS[1];               
            ለኪ_ም=ትንቢት.substring(0,4)+geez[i]+OMS[2]; 
            ለክን_ም=ትንቢት.substring(0,4)+geez[i]+OMS[3];
            ሎቱ_ም=ትንቢት.substring(0,4)+sabie[i];
            ሎሙ_ም=ትንቢት.substring(0,4)+sabie[i]+OMS[11];
            ላቲ_ም=ትንቢት.substring(0,4)+rabie[i];
            ሎን_ም=ትንቢት.substring(0,4)+sabie[i]+OMS[20];
                    }  }
          }} }   
     break;
             case "ንሕነ/We/":{
       switch(stemType)
   {
        case "ገቢር/perfective/":{
                     for(int j=0;j<sadis.length;j++){
      if( ste.substring(0,1).equals(geez[j])){
            for(int m=0;m<sadis.length;m++){
      if( ste.substring(1,2).equals(salis[m])){  
             for(int i=0;i<sadis.length;i++){
      if( ste.substring(2,3).equals(sadis[i])){ 
           ገቢር=ሓላፊ.substring(0,1)+sadis[i]+SMS[1];
            ትንቢት=prefix[18]+ste.substring(0,1)+sadis[m]+sadis[i];
             ምክንያታዊ=ትእዛዝ=prefix[12]+kaeb[j]+sadis[i];
            ቦዝ="ተ"+rabie[j]+salis[m]+sadis[i]+SMS[1];
             አርእስት="ተ"+rabie[j]+salis[m]+sabie[i]+SMS[1];
      }}}}}}
          for(int m=0;m<geez.length;m++){
            if( ገቢር.substring(2,3).equals(geez[m])){
                 ሊተ="-";
            ለነ="-";
            ለከ=ገቢር.substring(0,2)+rabie[m]+OMS[0];
            ለክሙ=ገቢር.substring(0,2)+rabie[m]+OMS[1];                
            ለኪ=ገቢር.substring(0,2)+rabie[m]+OMS[2];  
            ለክን=ገቢር.substring(0,2)+rabie[m]+OMS[3];
            ሎቱ=ገቢር.substring(0,2)+rabie[m]+OMS[5];
            ሎሙ=ገቢር.substring(0,2)+rabie[m]+OMS[12];
            ላቲ=ገቢር.substring(0,2)+rabie[m]+OMS[4];
            ሎን=ገቢር.substring(0,2)+rabie[m]+OMS[19]; 
                    } }   
          for(int m=0;m<kaeb.length;m++){
            if( ste.substring(2,3).equals(sadis[m])){
            ሊተ_ት="-";
            ለነ_ት="-";
            ለከ_ት=ትንቢት.substring(0,3)+geez[m]+OMS[0];
            ለክሙ_ት=ትንቢት.substring(0,3)+geez[m]+OMS[1];            
            ለኪ_ት=ትንቢት.substring(0,3)+geez[m]+OMS[2];
            ለክን_ት=ትንቢት.substring(0,3)+geez[m]+OMS[3];
             ሎቱ_ት=ትንቢት.substring(0,3)+sabie[m];
            ሎሙ_ት=ትንቢት.substring(0,3)+sabie[m]+OMS[11];
            ላቲ_ት=ትንቢት.substring(0,3)+rabie[m];
            ሎን_ት=ትንቢት.substring(0,3)+sabie[m]+OMS[20];
          
            ሊተ_ትእ=ሊተ_ም="-";
            ለነ_ትእ=ለነ_ም="-";
           ለከ_ትእ=  ለከ_ም=ምክንያታዊ+OMS[0];
           ለክሙ_ትእ= ለክሙ_ም=ምክንያታዊ+OMS[1];            
           ለክን_ትእ=ለኪ_ትእ= ለኪ_ም=ምክንያታዊ+OMS[2];
            ለክን_ም=ምክንያታዊ+OMS[3];
           ሎቱ_ትእ=   ሎቱ_ም=ምክንያታዊ.substring(0,2)+sabie[m];
           ሎሙ_ትእ= ሎሙ_ም=ምክንያታዊ.substring(0,2)+sabie[m]+OMS[11];
            ላቲ_ትእ=ላቲ_ም=ምክንያታዊ.substring(0,2)+rabie[m];
           ሎን_ትእ= ሎን_ም=ምክንያታዊ.substring(0,2)+sabie[m]+OMS[20];
                    }}
          }  
        break;
         case "አግብሮ/causative/":{
                               for(int j=0;j<sadis.length;j++){
      if( ste.substring(0,1).equals(geez[j])){
            for(int m=0;m<sadis.length;m++){
      if( ste.substring(1,2).equals(salis[m])){  
             for(int i=0;i<sadis.length;i++){
      if( ste.substring(2,3).equals(sadis[i])){
        ገቢር=prefix[1]+sabie[j]+ste.substring(2,3)+SMS[1];
            ትንቢት=prefix[16]+geez[j]+sadis[m]+sadis[i];;
            ትእዛዝ=prefix[16]+kaeb[j]+sadis[i];
             ምክንያታዊ=prefix[16]+kaeb[j]+sadis[i];  
              ቦዝ=prefix[1]+sadis[j]+ste.substring(1,2)+ሓላፊ.substring(1,2)+OMS[23];
               አርእስት=ቦዝ.substring(0,3)+sabie[i]+SMS[18];
      }}}}} }
             for(int m=0;m<geez.length;m++){
            if( ገቢር.substring(3,4).equals(geez[m])){
            ሊተ="-";
            ለነ="-";
            ለከ=ገቢር.substring(0,3)+rabie[m]+OMS[0];
            ለክሙ=ገቢር.substring(0,3)+rabie[m]+OMS[1];                
            ለኪ=ገቢር.substring(0,3)+rabie[m]+OMS[2];  
            ለክን=ገቢር.substring(0,3)+rabie[m]+OMS[3];
            ሎቱ=ገቢር.substring(0,3)+rabie[m]+OMS[5];
            ሎሙ=ገቢር.substring(0,3)+rabie[m]+OMS[12];
            ላቲ=ገቢር.substring(0,3)+rabie[m]+OMS[4];
            ሎን=ገቢር.substring(0,3)+rabie[m]+OMS[19]; 
                    } }   
               //ትንቢት
            for(int m=0;m<sadis.length;m++){
      if( ትንቢት.substring(3,4).equals(sadis[m])){
            ሊተ_ት="-";
            ለነ_ት="-";
            ለከ_ት=ትንቢት.substring(0,3)+geez[m]+OMS[0];
            ለክሙ_ት=ትንቢት.substring(0,3)+geez[m]+OMS[1];            
            ለኪ_ት=ትንቢት.substring(0,3)+geez[m]+OMS[2];
            ለክን_ት=ትንቢት.substring(0,3)+geez[m]+OMS[3];
             ሎቱ_ት=ትንቢት.substring(0,3)+sabie[m];
            ሎሙ_ት=ትንቢት.substring(0,3)+sabie[m]+OMS[11];
            ላቲ_ት=ትንቢት.substring(0,3)+rabie[m];
            ሎን_ት=ትንቢት.substring(0,3)+sabie[m]+OMS[20];
            //
              ሊተ_ም=ሊተ_ትእ="-";
            ለነ_ም=ለነ_ትእ="-";
            ለከ_ም=ለከ_ትእ=ትእዛዝ+OMS[0];
           ለክሙ_ም= ለክሙ_ትእ=ትእዛዝ+OMS[1];            
            ለኪ_ም= ለኪ_ትእ=ትእዛዝ+OMS[2];
             ለክን_ም=ለክን_ትእ=ትእዛዝ+OMS[3];
             ሎቱ_ም=ሎቱ_ትእ=ትእዛዝ.substring(0,2)+sabie[m];
           ሎሙ_ም= ሎሙ_ትእ=ትእዛዝ.substring(0,2)+sabie[m]+OMS[11];
            ላቲ_ም= ላቲ_ትእ=ትእዛዝ.substring(0,2)+rabie[m];
            ሎን_ም= ሎን_ትእ=ትእዛዝ.substring(0,2)+sabie[m]+OMS[20];
       }}
        }
        break;
         case "አስተጋብሮ/causative-reciprocal/":{
             for(int j=0;j<sadis.length;j++){
      if( ste.substring(0,1).equals(geez[j])){
           for(int m=0;m<salis.length;m++){
            if( ste.substring(1,2).equals(salis[m])){
                ገቢር=prefix[10]+rabie[j]+geez[m]+ste.substring(2,3)+SMS[1];
            ትንቢት=prefix[17]+rabie[j]+sadis[m]+ste.substring(2,3);;
             ምክንያታዊ= ትእዛዝ= ትንቢት;
            ቦዝ=ገቢር.substring(0, 4)+ste.substring(1,2)+geez[j]+OMS[23];
            አርእስት=ገቢር.substring(0, 4)+sadis[j]+sabie[j]+SMS[18];;
            }}     
      }}
          for(int m=0;m<geez.length;m++){
            if( ገቢር.substring(6,7).equals(geez[m])){
            ሊተ="-";
            ለነ="-";
            ለከ=ገቢር.substring(0,6)+rabie[m]+OMS[0];
            ለክሙ=ገቢር.substring(0,6)+rabie[m]+OMS[1];                
            ለኪ=ገቢር.substring(0,6)+rabie[m]+OMS[2];  
            ለክን=ገቢር.substring(0,6)+rabie[m]+OMS[3];
            ሎቱ=ገቢር.substring(0,6)+rabie[m]+OMS[5];
            ሎሙ=ገቢር.substring(0,6)+rabie[m]+OMS[12];
            ላቲ=ገቢር.substring(0,6)+rabie[m]+OMS[4];
            ሎን=ገቢር.substring(0,6)+rabie[m]+OMS[19]; 
                    } }   
          for(int m=0;m<sadis.length;m++){
            if( ገቢር.substring(5,6).equals(sadis[m])){
            ሊተ_ት="-";
            ለነ_ት="-";
            ለከ_ት=ትንቢት.substring(0,5)+geez[m]+OMS[0];
            ለክሙ_ት=ትንቢት.substring(0,5)+geez[m]+OMS[1];                
            ለኪ_ት=ትንቢት.substring(0,5)+geez[m]+OMS[2];  
            ለክን_ት=ትንቢት.substring(0,5)+geez[m]+OMS[3];
            ሎቱ_ት=ትንቢት.substring(0,5)+sabie[m];
            ሎሙ_ት=ትንቢት.substring(0,5)+sabie[m]+OMS[11];
            ላቲ_ት=ትንቢት.substring(0,5)+rabie[m];
            ሎን_ት=ትንቢት.substring(0,5)+sabie[m]+OMS[20]; 
            //
             ሊተ_ትእ="-";
            ለነ_ትእ="-";
            ለከ_ትእ=ትንቢት.substring(0,5)+geez[m]+OMS[0];
            ለክሙ_ትእ=ትንቢት.substring(0,5)+geez[m]+OMS[1];                
            ለኪ_ትእ=ትንቢት.substring(0,5)+geez[m]+OMS[2];  
            ለክን_ትእ=ትንቢት.substring(0,5)+geez[m]+OMS[3];
            ሎቱ_ትእ=ትንቢት.substring(0,5)+sabie[m];
            ሎሙ_ትእ=ትንቢት.substring(0,5)+sabie[m]+OMS[11];
            ላቲ_ትእ=ትንቢት.substring(0,5)+rabie[m];
            ሎን_ትእ=ትንቢት.substring(0,5)+sabie[m]+OMS[20]; 
            //
            ሊተ_ም="-";
            ለነ_ም="-";
            ለከ_ም=ትንቢት.substring(0,5)+geez[m]+OMS[0];
            ለክሙ_ም=ትንቢት.substring(0,5)+geez[m]+OMS[1];                
            ለኪ_ም=ትንቢት.substring(0,5)+geez[m]+OMS[2];  
            ለክን_ም=ትንቢት.substring(0,5)+geez[m]+OMS[3];
            ሎቱ_ም=ትንቢት.substring(0,5)+sabie[m];
            ሎሙ_ም=ትንቢት.substring(0,5)+sabie[m]+OMS[11];
            ላቲ_ም=ትንቢት.substring(0,5)+rabie[m];
            ሎን_ም=ትንቢት.substring(0,5)+sabie[m]+OMS[20]; 
                    }  }
        }
         break;
         case "ተገብሮ/reflexive/":{
             for(int j=0;j<salis.length;j++){
         if( ste.substring(1,2).equals(salis[j])){
         for(int i=0;i<geez.length;i++){
         if( ste.substring(2,3).equals(sadis[i])){
           ገቢር=prefix[15]+ste.substring(0,1)+geez[j]+sadis[i]+SMS[1];
            for(int m=0;m<kaeb.length;m++){
         if( ste.substring(0,1).equals(geez[m])){
           ትእዛዝ=ምክንያታዊ=ትንቢት=prefix[14]+rabie[m]+geez[j]+sadis[i];
         }} }} }}
         }
         break;
         case "ተጋብሮ/reciprocal/":{
             for(int j=0;j<geez.length;j++){
         if( ste.substring(0,1).equals(geez[j])){
             for(int m=0;m<kaeb.length;m++){
         if( ste.substring(1,2).equals(salis[m])){
            for(int i=0;i<sadis.length;i++){
      if( ste.substring(2,3).equals(sadis[i])){
          ገቢር=prefix[15]+rabie[j]+geez[m]+sadis[i]+SMS[1];
         ትእዛዝ= ምክንያታዊ= ትንቢት=prefix[14]+rabie[j]+geez[m]+sadis[i];
          ቦዝ="ተ"+rabie[j]+ste.substring(1, 2)+geez[i]+SMS[1];
           አርእስት="ተ"+rabie[j]+ste.substring(1, 2)+sabie[i]+"ት"+SMS[1];;
      }}}}}}
     for(int m=0;m<geez.length;m++){
      if( ገቢር.substring(4,5).equals(geez[m])){
             ሊተ="-";
            ለነ="-";
            ለከ=ገቢር.substring(0,4)+rabie[m]+OMS[0];
            ለክሙ=ገቢር.substring(0,4)+rabie[m]+OMS[1];                
            ለኪ=ገቢር.substring(0,4)+rabie[m]+OMS[2];  
            ለክን=ገቢር.substring(0,4)+rabie[m]+OMS[3];
            ሎቱ=ገቢር.substring(0,4)+rabie[m]+OMS[5];
            ሎሙ=ገቢር.substring(0,4)+rabie[m]+OMS[12];
            ላቲ=ገቢር.substring(0,4)+rabie[m]+OMS[4];
            ሎን=ገቢር.substring(0,4)+rabie[m]+OMS[19]; 
      }}
     for(int i=0;i<kaeb.length;i++){
      if( ትንቢት.substring(4,5).equals(sadis[i])){
            //
            ሊተ_ት="";
            ለነ_ት="";
            ለከ_ት=ትንቢት.substring(0,4)+geez[i]+OMS[0];
            ለክሙ_ት= ትንቢት.substring(0,4)+geez[i]+OMS[1];               
            ለኪ_ት=ትንቢት.substring(0,4)+geez[i]+OMS[2]; 
            ለክን_ት=ትንቢት.substring(0,4)+geez[i]+OMS[3];
            ሎቱ_ት=ትንቢት.substring(0,4)+sabie[i];
            ሎሙ_ት=ትንቢት.substring(0,4)+sabie[i]+OMS[11];
            ላቲ_ት=ትንቢት.substring(0,4)+rabie[i];
            ሎን_ት=ትንቢት.substring(0,4)+sabie[i]+OMS[20];
            //
            ሊተ_ትእ="";
            ለነ_ትእ="";
            ለከ_ትእ=ትንቢት.substring(0,4)+geez[i]+OMS[0];
            ለክሙ_ትእ= ትንቢት.substring(0,4)+geez[i]+OMS[1];               
            ለኪ_ትእ=ትንቢት.substring(0,4)+geez[i]+OMS[2]; 
            ለክን_ትእ=ትንቢት.substring(0,4)+geez[i]+OMS[3];
            ሎቱ_ትእ=ትንቢት.substring(0,4)+sabie[i];
            ሎሙ_ትእ=ትንቢት.substring(0,4)+sabie[i]+OMS[11];
            ላቲ_ትእ=ትንቢት.substring(0,4)+rabie[i];
            ሎን_ትእ=ትንቢት.substring(0,4)+sabie[i]+OMS[20];
            //
            ሊተ_ም="";
            ለነ_ም="";
            ለከ_ም=ትንቢት.substring(0,4)+geez[i]+OMS[0];
            ለክሙ_ም= ትንቢት.substring(0,4)+geez[i]+OMS[1];               
            ለኪ_ም=ትንቢት.substring(0,4)+geez[i]+OMS[2]; 
            ለክን_ም=ትንቢት.substring(0,4)+geez[i]+OMS[3];
            ሎቱ_ም=ትንቢት.substring(0,4)+sabie[i];
            ሎሙ_ም=ትንቢት.substring(0,4)+sabie[i]+OMS[11];
            ላቲ_ም=ትንቢት.substring(0,4)+rabie[i];
            ሎን_ም=ትንቢት.substring(0,4)+sabie[i]+OMS[20];
                    } }   }} }   
     break;      }}}
 public void ExeMethod(String stem,String stemType,String person)
{       createStem( stem, stemType, person);
       createStem1( stem, stemType, person);
         createStem2( stem, stemType, person);
           createStem3( stem, stemType, person);
}
}
