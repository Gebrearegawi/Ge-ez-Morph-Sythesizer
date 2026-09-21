package Code;

/**
 * Shared linguistic data and output fields for the Ge'ez synthesizer.
 *
 * Holds:
 *   - the 7 vowel-order tables of the Ethiopic syllabary
 *   - the person/number/gender suffixes (SMS)
 *   - the object suffixes (OMS)
 *   - the verb prefixes (prefix)
 *   - the public output fields filled in by createStem*/createStem13
 *
 * Both {@link generate} and {@link Irregular} extend this class so that
 * every existing reference (geez[i], salis[j], OMS[22], ገቢር, ሊተ, ...)
 * keeps working without any change to their method bodies.
 *
 * @author Aregawi
 */
public class GeezData {

    // ---- Vowel orders (7 orders of the Ethiopic syllabary) ----
    public String geez[]  = {"ሀ","ለ","ሐ","መ","ሠ","ረ","ሰ","ቀ","በ","ተ","ነ","ኀ","አ","ከ","ወ","ዐ","ዘ","የ","ደ","ገ","ጠ","ጰ","ጸ","ፀ","ፈ","ፐ","ኈ","ቈ","ጐ","ኰ"};
    public String kaeb[]  = {"ሁ","ሉ","ሑ","ሙ","ሡ","ሩ","ሱ","ቁ","ቡ","ቱ","ኑ","ኁ","ኡ","ኩ","ዉ","ዑ","ዙ","ዩ","ዱ","ጉ","ጡ","ጱ","ጹ","ፁ","ፉ","ፑ"};
    public String salis[] = {"ሂ","ሊ","ሒ","ሚ","ሢ","ሪ","ሲ","ቂ","ቢ","ቲ","ኒ","ኂ","ኢ","ኪ","ዊ","ዒ","ዚ","ዪ","ዲ","ጊ","ጢ","ጲ","ጺ","ፂ","ፊ","ፒ","ኊ","ቊ","ጒ","ኲ"};
    public String rabie[] = {"ሃ","ላ","ሓ","ማ","ሣ","ራ","ሳ","ቃ","ባ","ታ","ና","ኃ","ኣ","ካ","ዋ","ዓ","ዛ","ያ","ዳ","ጋ","ጣ","ጳ","ጻ","ፃ","ፋ","ፓ","ኋ","ቋ","ጓ","ኳ"};
    public String hams[]  = {"ሄ","ሌ","ሔ","ሜ","ሤ","ሬ","ሴ","ቄ","ቤ","ቴ","ኔ","ኄ","ኤ","ኬ","ዌ","ዔ","ዜ","ዬ","ዴ","ጌ","ጤ","ጴ","ጼ","ፄ","ፌ","ፔ","ኌ","ቌ","ጔ","ኴ"};
    public String sadis[] = {"ህ","ል","ሕ","ም","ሥ","ር","ስ","ቅ","ብ","ት","ን","ኅ","እ","ክ","ው","ዕ","ዝ","ይ","ድ","ግ","ጥ","ጵ","ጽ","ፅ","ፍ","ፕ","ኊ","ቚ","ጒ","ኲ"};
    public String sabie[] = {"ሆ","ሎ","ሖ","ሞ","ሦ","ሮ","ሶ","ቆ","ቦ","ቶ","ኖ","ኆ","ኦ","ኮ","ዎ","ዖ","ዞ","ዮ","ዶ","ጎ","ጦ","ጶ","ጾ","ፆ","ፎ","ፖ"};

    // ---- Affixes ----
    public String[] SMS = {"ኩ","ነ","ከ","ኪ","ክሙ","ክን","አ","ኡ","አት","ኣ","የ","ኦ","ሙ","ን","እ","ኡ","ኢ","ትየ","ትነ"};

    public String[] OMS = {
        "ከ","ክሙ","ኪ","ክን","ሃ","ሁ","ኦ","ዎ","ዮ","ዎሙ",
        "ክሙ","ሙ","ሆሙ","ዮሙ","ዋ","ሃ","ኣ","ያ","ዎን","ሆን",
        "ን","ዮን","ኒ","ነ","ኮ"
    }; // 25 entries

    public String[] prefix = {
        "ኢ","አ","ያ","ይ","ት","ታ","ይት","ትት","ታስተ","ያስተ",
        "አስተ","እ","ን","እት","ንት","ተ","ና","ናስተ","የ","አስ"
    };

    // ---- Scratch variables shared by both files ----
    public String ss  = null;
    public String ss1 = null;
    public String ab  = null;

    // ---- Output fields (main stem) ----
    public String አርእስት, አርእስት1, ሳቢዘር, ቦዝ,
                  ምክንያታዊ, ትእዛዝ, ቅርብ_ትእዛዝ, ትንቢት, ሓላፊ = "";
    public String ገቢር, አግብሮ, ተገብሮ, ተጋብሮ, አስተጋብሮ = "";

    // ---- Object suffixes: base form ----
    public String ሊተ, ለነ, ለከ, ለኪ, ለክሙ, ለክን, ሎቱ, ሎሙ, ላቲ, ሎን = "";

    // ---- Object suffixes: ትንቢት (imperfective) ----
    public String ሊተ_ት, ለነ_ት, ለከ_ት, ለኪ_ት, ለክሙ_ት, ለክን_ት,
                  ሎቱ_ት, ሎሙ_ት, ላቲ_ት, ሎን_ት = "";

    // ---- Object suffixes: ትእዛዝ (imperative) ----
    public String ሊተ_ትእ, ለነ_ትእ, ለከ_ትእ, ለኪ_ትእ, ለክሙ_ትእ,
                  ለክን_ትእ, ሎቱ_ትእ, ሎሙ_ትእ, ላቲ_ትእ, ሎን_ትእ = "";

    // ---- Object suffixes: ምክንያታዊ (subjunctive) ----
    public String ሊተ_ም, ለነ_ም, ለከ_ም, ለኪ_ም, ለክሙ_ም, ለክን_ም,
                  ሎቱ_ም, ሎሙ_ም, ላቲ_ም, ሎን_ም = "";

    // ---- Derived stem tables ----
    public String ሳድስቅጽል, ሳድስቅጽል1 = "",
                  ሳቢዘር1 = "",
                  ሳልስቅጽል, ሳልስቅጽል1, ሳልስቅጽል2,
                  ሳልስቅጽል3, ሳልስቅጽል4 = "";
}
